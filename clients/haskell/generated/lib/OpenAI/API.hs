{-# LANGUAGE DataKinds                  #-}
{-# LANGUAGE DeriveDataTypeable         #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE DeriveTraversable          #-}
{-# LANGUAGE FlexibleContexts           #-}
{-# LANGUAGE FlexibleInstances          #-}
{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE OverloadedStrings          #-}
{-# LANGUAGE RecordWildCards            #-}
{-# LANGUAGE TypeFamilies               #-}
{-# LANGUAGE TypeOperators              #-}
{-# LANGUAGE ViewPatterns               #-}
{-# OPTIONS_GHC
-fno-warn-unused-binds -fno-warn-unused-imports -freduction-depth=328 #-}

module OpenAI.API
  ( -- * Client and Server
    Config(..)
  , OpenAIBackend(..)
  , createOpenAIClient
  , runOpenAIServer
  , runOpenAIMiddlewareServer
  , runOpenAIClient
  , runOpenAIClientWithManager
  , callOpenAI
  , OpenAIClient
  , OpenAIClientError(..)
  -- ** Servant
  , OpenAIAPI
  -- ** Plain WAI Application
  , serverWaiApplicationOpenAI
  -- ** Authentication
  , OpenAIAuth(..)
  , clientAuth
  , Protected
  ) where

import           OpenAI.Types

import           Control.Monad.Catch                (Exception, MonadThrow, throwM)
import           Control.Monad.Except               (ExceptT, runExceptT)
import           Control.Monad.IO.Class
import           Control.Monad.Trans.Reader         (ReaderT (..))
import           Data.Aeson                         (Value)
import qualified Data.Aeson                         as Aeson
import           Data.ByteString                    (ByteString)
import qualified Data.ByteString.Lazy               as BSL
import           Data.Coerce                        (coerce)
import           Data.Data                          (Data)
import           Data.Function                      ((&))
import qualified Data.Map                           as Map
import           Data.Monoid                        ((<>))
import           Data.Proxy                         (Proxy (..))
import           Data.Set                           (Set)
import           Data.Text                          (Text)
import qualified Data.Text                          as T
import qualified Data.Text.Encoding                 as T
import           Data.Time
import           Data.UUID                          (UUID)
import           GHC.Exts                           (IsString (..))
import           GHC.Generics                       (Generic)
import           Network.HTTP.Client                (Manager, newManager)
import           Network.HTTP.Client.TLS            (tlsManagerSettings)
import           Network.HTTP.Types.Method          (methodOptions)
import           Network.Wai                        (Middleware, Request, requestHeaders)
import qualified Network.Wai.Handler.Warp           as Warp
import           Network.Wai.Middleware.HttpAuth    (extractBearerAuth)
import           Servant                            (ServerError, serveWithContextT, throwError)
import           Servant.API                        hiding (addHeader)
import           Servant.API.Verbs                  (StdMethod (..), Verb)
import           Servant.API.Experimental.Auth      (AuthProtect)
import           Servant.Client                     (ClientEnv, Scheme (Http), ClientError, client,
                                                     mkClientEnv, parseBaseUrl)
import           Servant.Client.Core                (baseUrlPort, baseUrlHost, AuthClientData, AuthenticatedRequest, addHeader, mkAuthenticatedRequest)
import           Servant.Client.Internal.HttpClient (ClientM (..))
import           Servant.Server                     (Handler (..), Application, Context ((:.), EmptyContext))
import           Servant.Server.Experimental.Auth   (AuthHandler, AuthServerData, mkAuthHandler)
import           Servant.Server.StaticFiles         (serveDirectoryFileServer)
import           Web.FormUrlEncoded
import           Web.HttpApiData



data FormCreateTranscription = FormCreateTranscription
  { createTranscriptionFile :: FilePath
  , createTranslationModel :: CreateTranscriptionRequestModel
  , createTranscriptionLanguage :: Text
  , createTranscriptionPrompt :: Text
  , createTranscriptionResponseFormat :: AudioResponseFormat
  , createTranscriptionTemperature :: Double
  , createTranscriptionTimestampGranularities[] :: [Text]
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormCreateTranscription
instance ToForm FormCreateTranscription

data FormCreateTranslation = FormCreateTranslation
  { createTranslationFile :: FilePath
  , createTranslationModel :: CreateTranscriptionRequestModel
  , createTranslationPrompt :: Text
  , createTranslationResponseFormat :: AudioResponseFormat
  , createTranslationTemperature :: Double
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormCreateTranslation
instance ToForm FormCreateTranslation

data FormCreateFile = FormCreateFile
  { createFileFile :: FilePath
  , createFilePurpose :: Text
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormCreateFile
instance ToForm FormCreateFile

data FormCreateImageEdit = FormCreateImageEdit
  { createImageEditImage :: FilePath
  , createImageEditPrompt :: Text
  , createImageEditMask :: FilePath
  , createImageVariationModel :: CreateImageEditRequestModel
  , createImageEditN :: Int
  , createImageEditSize :: Text
  , createImageEditResponseFormat :: Text
  , createImageEditUser :: Text
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormCreateImageEdit
instance ToForm FormCreateImageEdit

data FormCreateImageVariation = FormCreateImageVariation
  { createImageVariationImage :: FilePath
  , createImageVariationModel :: CreateImageEditRequestModel
  , createImageVariationN :: Int
  , createImageVariationResponseFormat :: Text
  , createImageVariationSize :: Text
  , createImageVariationUser :: Text
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormCreateImageVariation
instance ToForm FormCreateImageVariation

data FormAddUploadPart = FormAddUploadPart
  { addUploadPartData :: FilePath
  } deriving (Show, Eq, Generic, Data)

instance FromForm FormAddUploadPart
instance ToForm FormAddUploadPart


-- | List of elements parsed from a query.
newtype QueryList (p :: CollectionFormat) a = QueryList
  { fromQueryList :: [a]
  } deriving (Functor, Applicative, Monad, Foldable, Traversable)

-- | Formats in which a list can be encoded into a HTTP path.
data CollectionFormat
  = CommaSeparated -- ^ CSV format for multiple parameters.
  | SpaceSeparated -- ^ Also called "SSV"
  | TabSeparated -- ^ Also called "TSV"
  | PipeSeparated -- ^ `value1|value2|value2`
  | MultiParamArray -- ^ Using multiple GET parameters, e.g. `foo=bar&foo=baz`. Only for GET params.

instance FromHttpApiData a => FromHttpApiData (QueryList 'CommaSeparated a) where
  parseQueryParam = parseSeparatedQueryList ','

instance FromHttpApiData a => FromHttpApiData (QueryList 'TabSeparated a) where
  parseQueryParam = parseSeparatedQueryList '\t'

instance FromHttpApiData a => FromHttpApiData (QueryList 'SpaceSeparated a) where
  parseQueryParam = parseSeparatedQueryList ' '

instance FromHttpApiData a => FromHttpApiData (QueryList 'PipeSeparated a) where
  parseQueryParam = parseSeparatedQueryList '|'

instance FromHttpApiData a => FromHttpApiData (QueryList 'MultiParamArray a) where
  parseQueryParam = error "unimplemented FromHttpApiData for MultiParamArray collection format"

parseSeparatedQueryList :: FromHttpApiData a => Char -> Text -> Either Text (QueryList p a)
parseSeparatedQueryList char = fmap QueryList . mapM parseQueryParam . T.split (== char)

instance ToHttpApiData a => ToHttpApiData (QueryList 'CommaSeparated a) where
  toQueryParam = formatSeparatedQueryList ','

instance ToHttpApiData a => ToHttpApiData (QueryList 'TabSeparated a) where
  toQueryParam = formatSeparatedQueryList '\t'

instance ToHttpApiData a => ToHttpApiData (QueryList 'SpaceSeparated a) where
  toQueryParam = formatSeparatedQueryList ' '

instance ToHttpApiData a => ToHttpApiData (QueryList 'PipeSeparated a) where
  toQueryParam = formatSeparatedQueryList '|'

instance ToHttpApiData a => ToHttpApiData (QueryList 'MultiParamArray a) where
  toQueryParam = error "unimplemented ToHttpApiData for MultiParamArray collection format"

formatSeparatedQueryList :: ToHttpApiData a => Char ->  QueryList p a -> Text
formatSeparatedQueryList char = T.intercalate (T.singleton char) . map toQueryParam . fromQueryList

newtype JSONQueryParam a = JSONQueryParam
  { fromJsonQueryParam :: a
  } deriving (Functor, Foldable, Traversable)

instance Aeson.ToJSON a => ToHttpApiData (JSONQueryParam a) where
  toQueryParam = T.decodeUtf8 . BSL.toStrict . Aeson.encode . fromJsonQueryParam

instance Aeson.FromJSON a => FromHttpApiData (JSONQueryParam a) where
  parseQueryParam = either (Left . T.pack) (Right . JSONQueryParam) . Aeson.eitherDecodeStrict . T.encodeUtf8


-- | Servant type-level API, generated from the OpenAPI spec for OpenAI.
type OpenAIAPI
    =    Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> Capture "run_id" Text :> "cancel" :> Verb 'POST 200 '[JSON] RunObject -- 'cancelRun' route
    :<|> Protected :> "assistants" :> ReqBody '[JSON] CreateAssistantRequest :> Verb 'POST 200 '[JSON] AssistantObject -- 'createAssistant' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "messages" :> ReqBody '[JSON] CreateMessageRequest :> Verb 'POST 200 '[JSON] MessageObject -- 'createMessage' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> QueryParam "include[]" (QueryList 'MultiParamArray (Text)) :> ReqBody '[JSON] CreateRunRequest :> Verb 'POST 200 '[JSON] RunObject -- 'createRun' route
    :<|> Protected :> "threads" :> ReqBody '[JSON] CreateThreadRequest :> Verb 'POST 200 '[JSON] ThreadObject -- 'createThread' route
    :<|> Protected :> "threads" :> "runs" :> ReqBody '[JSON] CreateThreadAndRunRequest :> Verb 'POST 200 '[JSON] RunObject -- 'createThreadAndRun' route
    :<|> Protected :> "assistants" :> Capture "assistant_id" Text :> Verb 'DELETE 200 '[JSON] DeleteAssistantResponse -- 'deleteAssistant' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "messages" :> Capture "message_id" Text :> Verb 'DELETE 200 '[JSON] DeleteMessageResponse -- 'deleteMessage' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> Verb 'DELETE 200 '[JSON] DeleteThreadResponse -- 'deleteThread' route
    :<|> Protected :> "assistants" :> Capture "assistant_id" Text :> Verb 'GET 200 '[JSON] AssistantObject -- 'getAssistant' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "messages" :> Capture "message_id" Text :> Verb 'GET 200 '[JSON] MessageObject -- 'getMessage' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> Capture "run_id" Text :> Verb 'GET 200 '[JSON] RunObject -- 'getRun' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> Capture "run_id" Text :> "steps" :> Capture "step_id" Text :> QueryParam "include[]" (QueryList 'MultiParamArray (Text)) :> Verb 'GET 200 '[JSON] RunStepObject -- 'getRunStep' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> Verb 'GET 200 '[JSON] ThreadObject -- 'getThread' route
    :<|> Protected :> "assistants" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> Verb 'GET 200 '[JSON] ListAssistantsResponse -- 'listAssistants' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "messages" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> QueryParam "run_id" Text :> Verb 'GET 200 '[JSON] ListMessagesResponse -- 'listMessages' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> Capture "run_id" Text :> "steps" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> QueryParam "include[]" (QueryList 'MultiParamArray (Text)) :> Verb 'GET 200 '[JSON] ListRunStepsResponse -- 'listRunSteps' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> Verb 'GET 200 '[JSON] ListRunsResponse -- 'listRuns' route
    :<|> Protected :> "assistants" :> Capture "assistant_id" Text :> ReqBody '[JSON] ModifyAssistantRequest :> Verb 'POST 200 '[JSON] AssistantObject -- 'modifyAssistant' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "messages" :> Capture "message_id" Text :> ReqBody '[JSON] ModifyMessageRequest :> Verb 'POST 200 '[JSON] MessageObject -- 'modifyMessage' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> Capture "run_id" Text :> ReqBody '[JSON] ModifyRunRequest :> Verb 'POST 200 '[JSON] RunObject -- 'modifyRun' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> ReqBody '[JSON] ModifyThreadRequest :> Verb 'POST 200 '[JSON] ThreadObject -- 'modifyThread' route
    :<|> Protected :> "threads" :> Capture "thread_id" Text :> "runs" :> Capture "run_id" Text :> "submit_tool_outputs" :> ReqBody '[JSON] SubmitToolOutputsRunRequest :> Verb 'POST 200 '[JSON] RunObject -- 'submitToolOuputsToRun' route
    :<|> Protected :> "audio" :> "speech" :> ReqBody '[JSON] CreateSpeechRequest :> Verb 'POST 200 '[JSON] (Headers '[Header "Transfer-Encoding" Text] FilePath) -- 'createSpeech' route
    :<|> Protected :> "audio" :> "transcriptions" :> ReqBody '[FormUrlEncoded] FormCreateTranscription :> Verb 'POST 200 '[JSON] CreateTranscription200Response -- 'createTranscription' route
    :<|> Protected :> "audio" :> "translations" :> ReqBody '[FormUrlEncoded] FormCreateTranslation :> Verb 'POST 200 '[JSON] CreateTranslation200Response -- 'createTranslation' route
    :<|> Protected :> "organization" :> "audit_logs" :> QueryParam "effective_at" ListAuditLogsEffectiveAtParameter :> QueryParam "project_ids[]" (QueryList 'MultiParamArray (Text)) :> QueryParam "event_types[]" (QueryList 'MultiParamArray (AuditLogEventType)) :> QueryParam "actor_ids[]" (QueryList 'MultiParamArray (Text)) :> QueryParam "actor_emails[]" (QueryList 'MultiParamArray (Text)) :> QueryParam "resource_ids[]" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "after" Text :> QueryParam "before" Text :> Verb 'GET 200 '[JSON] ListAuditLogsResponse -- 'listAuditLogs' route
    :<|> Protected :> "batches" :> Capture "batch_id" Text :> "cancel" :> Verb 'POST 200 '[JSON] Batch -- 'cancelBatch' route
    :<|> Protected :> "batches" :> ReqBody '[JSON] CreateBatchRequest :> Verb 'POST 200 '[JSON] Batch -- 'createBatch' route
    :<|> Protected :> "batches" :> QueryParam "after" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ListBatchesResponse -- 'listBatches' route
    :<|> Protected :> "batches" :> Capture "batch_id" Text :> Verb 'GET 200 '[JSON] Batch -- 'retrieveBatch' route
    :<|> Protected :> "chat" :> "completions" :> ReqBody '[JSON] CreateChatCompletionRequest :> Verb 'POST 200 '[JSON] CreateChatCompletionResponse -- 'createChatCompletion' route
    :<|> Protected :> "completions" :> ReqBody '[JSON] CreateCompletionRequest :> Verb 'POST 200 '[JSON] CreateCompletionResponse -- 'createCompletion' route
    :<|> Protected :> "organization" :> "admin_api_keys" :> ReqBody '[JSON] AdminApiKeysCreateRequest :> Verb 'POST 200 '[JSON] AdminApiKey -- 'adminApiKeysCreate' route
    :<|> Protected :> "organization" :> "admin_api_keys" :> Capture "key_id" Text :> Verb 'DELETE 200 '[JSON] AdminApiKeysDelete200Response -- 'adminApiKeysDelete' route
    :<|> Protected :> "organization" :> "admin_api_keys" :> Capture "key_id" Text :> Verb 'GET 200 '[JSON] AdminApiKey -- 'adminApiKeysGet' route
    :<|> Protected :> "organization" :> "admin_api_keys" :> QueryParam "after" Text :> QueryParam "order" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ApiKeyList -- 'adminApiKeysList' route
    :<|> Protected :> "embeddings" :> ReqBody '[JSON] CreateEmbeddingRequest :> Verb 'POST 200 '[JSON] CreateEmbeddingResponse -- 'createEmbedding' route
    :<|> Protected :> "files" :> ReqBody '[FormUrlEncoded] FormCreateFile :> Verb 'POST 200 '[JSON] OpenAIFile -- 'createFile' route
    :<|> Protected :> "files" :> Capture "file_id" Text :> Verb 'DELETE 200 '[JSON] DeleteFileResponse -- 'deleteFile' route
    :<|> Protected :> "files" :> Capture "file_id" Text :> "content" :> Verb 'GET 200 '[JSON] Text -- 'downloadFile' route
    :<|> Protected :> "files" :> QueryParam "purpose" Text :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> Verb 'GET 200 '[JSON] ListFilesResponse -- 'listFiles' route
    :<|> Protected :> "files" :> Capture "file_id" Text :> Verb 'GET 200 '[JSON] OpenAIFile -- 'retrieveFile' route
    :<|> Protected :> "fine_tuning" :> "jobs" :> Capture "fine_tuning_job_id" Text :> "cancel" :> Verb 'POST 200 '[JSON] FineTuningJob -- 'cancelFineTuningJob' route
    :<|> Protected :> "fine_tuning" :> "jobs" :> ReqBody '[JSON] CreateFineTuningJobRequest :> Verb 'POST 200 '[JSON] FineTuningJob -- 'createFineTuningJob' route
    :<|> Protected :> "fine_tuning" :> "jobs" :> Capture "fine_tuning_job_id" Text :> "events" :> QueryParam "after" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ListFineTuningJobEventsResponse -- 'listFineTuningEvents' route
    :<|> Protected :> "fine_tuning" :> "jobs" :> Capture "fine_tuning_job_id" Text :> "checkpoints" :> QueryParam "after" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ListFineTuningJobCheckpointsResponse -- 'listFineTuningJobCheckpoints' route
    :<|> Protected :> "fine_tuning" :> "jobs" :> QueryParam "after" Text :> QueryParam "limit" Int :> Verb 'GET 200 '[JSON] ListPaginatedFineTuningJobsResponse -- 'listPaginatedFineTuningJobs' route
    :<|> Protected :> "fine_tuning" :> "jobs" :> Capture "fine_tuning_job_id" Text :> Verb 'GET 200 '[JSON] FineTuningJob -- 'retrieveFineTuningJob' route
    :<|> Protected :> "images" :> "generations" :> ReqBody '[JSON] CreateImageRequest :> Verb 'POST 200 '[JSON] ImagesResponse -- 'createImage' route
    :<|> Protected :> "images" :> "edits" :> ReqBody '[FormUrlEncoded] FormCreateImageEdit :> Verb 'POST 200 '[JSON] ImagesResponse -- 'createImageEdit' route
    :<|> Protected :> "images" :> "variations" :> ReqBody '[FormUrlEncoded] FormCreateImageVariation :> Verb 'POST 200 '[JSON] ImagesResponse -- 'createImageVariation' route
    :<|> Protected :> "organization" :> "invites" :> Capture "invite_id" Text :> Verb 'DELETE 200 '[JSON] InviteDeleteResponse -- 'deleteInvite' route
    :<|> Protected :> "organization" :> "invites" :> ReqBody '[JSON] InviteRequest :> Verb 'POST 200 '[JSON] Invite -- 'inviteUser' route
    :<|> Protected :> "organization" :> "invites" :> QueryParam "limit" Int :> QueryParam "after" Text :> Verb 'GET 200 '[JSON] InviteListResponse -- 'listInvites' route
    :<|> Protected :> "organization" :> "invites" :> Capture "invite_id" Text :> Verb 'GET 200 '[JSON] Invite -- 'retrieveInvite' route
    :<|> Protected :> "models" :> Capture "model" Text :> Verb 'DELETE 200 '[JSON] DeleteModelResponse -- 'deleteModel' route
    :<|> Protected :> "models" :> Verb 'GET 200 '[JSON] ListModelsResponse -- 'listModels' route
    :<|> Protected :> "models" :> Capture "model" Text :> Verb 'GET 200 '[JSON] Model -- 'retrieveModel' route
    :<|> Protected :> "moderations" :> ReqBody '[JSON] CreateModerationRequest :> Verb 'POST 200 '[JSON] CreateModerationResponse -- 'createModeration' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "archive" :> Verb 'POST 200 '[JSON] Project -- 'archiveProject' route
    :<|> Protected :> "organization" :> "projects" :> ReqBody '[JSON] ProjectCreateRequest :> Verb 'POST 200 '[JSON] Project -- 'createProject' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "service_accounts" :> ReqBody '[JSON] ProjectServiceAccountCreateRequest :> Verb 'POST 200 '[JSON] ProjectServiceAccountCreateResponse -- 'createProjectServiceAccount' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "users" :> ReqBody '[JSON] ProjectUserCreateRequest :> Verb 'POST 200 '[JSON] ProjectUser -- 'createProjectUser' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "api_keys" :> Capture "key_id" Text :> Verb 'DELETE 200 '[JSON] ProjectApiKeyDeleteResponse -- 'deleteProjectApiKey' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "service_accounts" :> Capture "service_account_id" Text :> Verb 'DELETE 200 '[JSON] ProjectServiceAccountDeleteResponse -- 'deleteProjectServiceAccount' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "users" :> Capture "user_id" Text :> Verb 'DELETE 200 '[JSON] ProjectUserDeleteResponse -- 'deleteProjectUser' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "api_keys" :> QueryParam "limit" Int :> QueryParam "after" Text :> Verb 'GET 200 '[JSON] ProjectApiKeyListResponse -- 'listProjectApiKeys' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "rate_limits" :> QueryParam "limit" Int :> QueryParam "after" Text :> QueryParam "before" Text :> Verb 'GET 200 '[JSON] ProjectRateLimitListResponse -- 'listProjectRateLimits' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "service_accounts" :> QueryParam "limit" Int :> QueryParam "after" Text :> Verb 'GET 200 '[JSON] ProjectServiceAccountListResponse -- 'listProjectServiceAccounts' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "users" :> QueryParam "limit" Int :> QueryParam "after" Text :> Verb 'GET 200 '[JSON] ProjectUserListResponse -- 'listProjectUsers' route
    :<|> Protected :> "organization" :> "projects" :> QueryParam "limit" Int :> QueryParam "after" Text :> QueryParam "include_archived" Bool :> Verb 'GET 200 '[JSON] ProjectListResponse -- 'listProjects' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> ReqBody '[JSON] ProjectUpdateRequest :> Verb 'POST 200 '[JSON] Project -- 'modifyProject' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "users" :> Capture "user_id" Text :> ReqBody '[JSON] ProjectUserUpdateRequest :> Verb 'POST 200 '[JSON] ProjectUser -- 'modifyProjectUser' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> Verb 'GET 200 '[JSON] Project -- 'retrieveProject' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "api_keys" :> Capture "key_id" Text :> Verb 'GET 200 '[JSON] ProjectApiKey -- 'retrieveProjectApiKey' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "service_accounts" :> Capture "service_account_id" Text :> Verb 'GET 200 '[JSON] ProjectServiceAccount -- 'retrieveProjectServiceAccount' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "users" :> Capture "user_id" Text :> Verb 'GET 200 '[JSON] ProjectUser -- 'retrieveProjectUser' route
    :<|> Protected :> "organization" :> "projects" :> Capture "project_id" Text :> "rate_limits" :> Capture "rate_limit_id" Text :> ReqBody '[JSON] ProjectRateLimitUpdateRequest :> Verb 'POST 200 '[JSON] ProjectRateLimit -- 'updateProjectRateLimits' route
    :<|> Protected :> "realtime" :> "sessions" :> ReqBody '[JSON] RealtimeSessionCreateRequest :> Verb 'POST 200 '[JSON] RealtimeSessionCreateResponse -- 'createRealtimeSession' route
    :<|> Protected :> "uploads" :> Capture "upload_id" Text :> "parts" :> ReqBody '[FormUrlEncoded] FormAddUploadPart :> Verb 'POST 200 '[JSON] UploadPart -- 'addUploadPart' route
    :<|> Protected :> "uploads" :> Capture "upload_id" Text :> "cancel" :> Verb 'POST 200 '[JSON] Upload -- 'cancelUpload' route
    :<|> Protected :> "uploads" :> Capture "upload_id" Text :> "complete" :> ReqBody '[JSON] CompleteUploadRequest :> Verb 'POST 200 '[JSON] Upload -- 'completeUpload' route
    :<|> Protected :> "uploads" :> ReqBody '[JSON] CreateUploadRequest :> Verb 'POST 200 '[JSON] Upload -- 'createUpload' route
    :<|> Protected :> "organization" :> "usage" :> "audio_speeches" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "user_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "api_key_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "models" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageAudioSpeeches' route
    :<|> Protected :> "organization" :> "usage" :> "audio_transcriptions" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "user_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "api_key_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "models" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageAudioTranscriptions' route
    :<|> Protected :> "organization" :> "usage" :> "code_interpreter_sessions" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageCodeInterpreterSessions' route
    :<|> Protected :> "organization" :> "usage" :> "completions" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "user_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "api_key_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "models" (QueryList 'MultiParamArray (Text)) :> QueryParam "batch" Bool :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageCompletions' route
    :<|> Protected :> "organization" :> "costs" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageCosts' route
    :<|> Protected :> "organization" :> "usage" :> "embeddings" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "user_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "api_key_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "models" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageEmbeddings' route
    :<|> Protected :> "organization" :> "usage" :> "images" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "sources" (QueryList 'MultiParamArray (Text)) :> QueryParam "sizes" (QueryList 'MultiParamArray (Text)) :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "user_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "api_key_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "models" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageImages' route
    :<|> Protected :> "organization" :> "usage" :> "moderations" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "user_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "api_key_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "models" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageModerations' route
    :<|> Protected :> "organization" :> "usage" :> "vector_stores" :> QueryParam "start_time" Int :> QueryParam "end_time" Int :> QueryParam "bucket_width" Text :> QueryParam "project_ids" (QueryList 'MultiParamArray (Text)) :> QueryParam "group_by" (QueryList 'MultiParamArray (Text)) :> QueryParam "limit" Int :> QueryParam "page" Text :> Verb 'GET 200 '[JSON] UsageResponse -- 'usageVectorStores' route
    :<|> Protected :> "organization" :> "users" :> Capture "user_id" Text :> Verb 'DELETE 200 '[JSON] UserDeleteResponse -- 'deleteUser' route
    :<|> Protected :> "organization" :> "users" :> QueryParam "limit" Int :> QueryParam "after" Text :> Verb 'GET 200 '[JSON] UserListResponse -- 'listUsers' route
    :<|> Protected :> "organization" :> "users" :> Capture "user_id" Text :> ReqBody '[JSON] UserRoleUpdateRequest :> Verb 'POST 200 '[JSON] User -- 'modifyUser' route
    :<|> Protected :> "organization" :> "users" :> Capture "user_id" Text :> Verb 'GET 200 '[JSON] User -- 'retrieveUser' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "file_batches" :> Capture "batch_id" Text :> "cancel" :> Verb 'POST 200 '[JSON] VectorStoreFileBatchObject -- 'cancelVectorStoreFileBatch' route
    :<|> Protected :> "vector_stores" :> ReqBody '[JSON] CreateVectorStoreRequest :> Verb 'POST 200 '[JSON] VectorStoreObject -- 'createVectorStore' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "files" :> ReqBody '[JSON] CreateVectorStoreFileRequest :> Verb 'POST 200 '[JSON] VectorStoreFileObject -- 'createVectorStoreFile' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "file_batches" :> ReqBody '[JSON] CreateVectorStoreFileBatchRequest :> Verb 'POST 200 '[JSON] VectorStoreFileBatchObject -- 'createVectorStoreFileBatch' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> Verb 'DELETE 200 '[JSON] DeleteVectorStoreResponse -- 'deleteVectorStore' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "files" :> Capture "file_id" Text :> Verb 'DELETE 200 '[JSON] DeleteVectorStoreFileResponse -- 'deleteVectorStoreFile' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> Verb 'GET 200 '[JSON] VectorStoreObject -- 'getVectorStore' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "files" :> Capture "file_id" Text :> Verb 'GET 200 '[JSON] VectorStoreFileObject -- 'getVectorStoreFile' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "file_batches" :> Capture "batch_id" Text :> Verb 'GET 200 '[JSON] VectorStoreFileBatchObject -- 'getVectorStoreFileBatch' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "file_batches" :> Capture "batch_id" Text :> "files" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> QueryParam "filter" Text :> Verb 'GET 200 '[JSON] ListVectorStoreFilesResponse -- 'listFilesInVectorStoreBatch' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> "files" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> QueryParam "filter" Text :> Verb 'GET 200 '[JSON] ListVectorStoreFilesResponse -- 'listVectorStoreFiles' route
    :<|> Protected :> "vector_stores" :> QueryParam "limit" Int :> QueryParam "order" Text :> QueryParam "after" Text :> QueryParam "before" Text :> Verb 'GET 200 '[JSON] ListVectorStoresResponse -- 'listVectorStores' route
    :<|> Protected :> "vector_stores" :> Capture "vector_store_id" Text :> ReqBody '[JSON] UpdateVectorStoreRequest :> Verb 'POST 200 '[JSON] VectorStoreObject -- 'modifyVectorStore' route
    :<|> Raw


-- | Server or client configuration, specifying the host and port to query or serve on.
data Config = Config
  { configUrl :: String  -- ^ scheme://hostname:port/path, e.g. "http://localhost:8080/"
  } deriving (Eq, Ord, Show, Read)


-- | Custom exception type for our errors.
newtype OpenAIClientError = OpenAIClientError ClientError
  deriving (Show, Exception)
-- | Configuration, specifying the full url of the service.


-- | Backend for OpenAI.
-- The backend can be used both for the client and the server. The client generated from the OpenAI OpenAPI spec
-- is a backend that executes actions by sending HTTP requests (see @createOpenAIClient@). Alternatively, provided
-- a backend, the API can be served using @runOpenAIMiddlewareServer@.
data OpenAIBackend a m = OpenAIBackend
  { cancelRun :: a -> Text -> Text -> m RunObject{- ^  -}
  , createAssistant :: a -> CreateAssistantRequest -> m AssistantObject{- ^  -}
  , createMessage :: a -> Text -> CreateMessageRequest -> m MessageObject{- ^  -}
  , createRun :: a -> Text -> Maybe [Text] -> CreateRunRequest -> m RunObject{- ^  -}
  , createThread :: a -> CreateThreadRequest -> m ThreadObject{- ^  -}
  , createThreadAndRun :: a -> CreateThreadAndRunRequest -> m RunObject{- ^  -}
  , deleteAssistant :: a -> Text -> m DeleteAssistantResponse{- ^  -}
  , deleteMessage :: a -> Text -> Text -> m DeleteMessageResponse{- ^  -}
  , deleteThread :: a -> Text -> m DeleteThreadResponse{- ^  -}
  , getAssistant :: a -> Text -> m AssistantObject{- ^  -}
  , getMessage :: a -> Text -> Text -> m MessageObject{- ^  -}
  , getRun :: a -> Text -> Text -> m RunObject{- ^  -}
  , getRunStep :: a -> Text -> Text -> Text -> Maybe [Text] -> m RunStepObject{- ^  -}
  , getThread :: a -> Text -> m ThreadObject{- ^  -}
  , listAssistants :: a -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> m ListAssistantsResponse{- ^  -}
  , listMessages :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ListMessagesResponse{- ^  -}
  , listRunSteps :: a -> Text -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe [Text] -> m ListRunStepsResponse{- ^  -}
  , listRuns :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> m ListRunsResponse{- ^  -}
  , modifyAssistant :: a -> Text -> ModifyAssistantRequest -> m AssistantObject{- ^  -}
  , modifyMessage :: a -> Text -> Text -> ModifyMessageRequest -> m MessageObject{- ^  -}
  , modifyRun :: a -> Text -> Text -> ModifyRunRequest -> m RunObject{- ^  -}
  , modifyThread :: a -> Text -> ModifyThreadRequest -> m ThreadObject{- ^  -}
  , submitToolOuputsToRun :: a -> Text -> Text -> SubmitToolOutputsRunRequest -> m RunObject{- ^  -}
  , createSpeech :: a -> CreateSpeechRequest -> m (Headers '[Header "Transfer-Encoding" Text] FilePath){- ^  -}
  , createTranscription :: a -> FormCreateTranscription -> m CreateTranscription200Response{- ^  -}
  , createTranslation :: a -> FormCreateTranslation -> m CreateTranslation200Response{- ^  -}
  , listAuditLogs :: a -> Maybe ListAuditLogsEffectiveAtParameter -> Maybe [Text] -> Maybe [AuditLogEventType] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> Maybe Text -> m ListAuditLogsResponse{- ^  -}
  , cancelBatch :: a -> Text -> m Batch{- ^  -}
  , createBatch :: a -> CreateBatchRequest -> m Batch{- ^  -}
  , listBatches :: a -> Maybe Text -> Maybe Int -> m ListBatchesResponse{- ^  -}
  , retrieveBatch :: a -> Text -> m Batch{- ^  -}
  , createChatCompletion :: a -> CreateChatCompletionRequest -> m CreateChatCompletionResponse{- ^  -}
  , createCompletion :: a -> CreateCompletionRequest -> m CreateCompletionResponse{- ^  -}
  , adminApiKeysCreate :: a -> AdminApiKeysCreateRequest -> m AdminApiKey{- ^ Create a new admin-level API key for the organization. -}
  , adminApiKeysDelete :: a -> Text -> m AdminApiKeysDelete200Response{- ^ Delete the specified admin API key. -}
  , adminApiKeysGet :: a -> Text -> m AdminApiKey{- ^ Get details for a specific organization API key by its ID. -}
  , adminApiKeysList :: a -> Maybe Text -> Maybe Text -> Maybe Int -> m ApiKeyList{- ^ Retrieve a paginated list of organization admin API keys. -}
  , createEmbedding :: a -> CreateEmbeddingRequest -> m CreateEmbeddingResponse{- ^  -}
  , createFile :: a -> FormCreateFile -> m OpenAIFile{- ^  -}
  , deleteFile :: a -> Text -> m DeleteFileResponse{- ^  -}
  , downloadFile :: a -> Text -> m Text{- ^  -}
  , listFiles :: a -> Maybe Text -> Maybe Int -> Maybe Text -> Maybe Text -> m ListFilesResponse{- ^  -}
  , retrieveFile :: a -> Text -> m OpenAIFile{- ^  -}
  , cancelFineTuningJob :: a -> Text -> m FineTuningJob{- ^  -}
  , createFineTuningJob :: a -> CreateFineTuningJobRequest -> m FineTuningJob{- ^  -}
  , listFineTuningEvents :: a -> Text -> Maybe Text -> Maybe Int -> m ListFineTuningJobEventsResponse{- ^  -}
  , listFineTuningJobCheckpoints :: a -> Text -> Maybe Text -> Maybe Int -> m ListFineTuningJobCheckpointsResponse{- ^  -}
  , listPaginatedFineTuningJobs :: a -> Maybe Text -> Maybe Int -> m ListPaginatedFineTuningJobsResponse{- ^  -}
  , retrieveFineTuningJob :: a -> Text -> m FineTuningJob{- ^  -}
  , createImage :: a -> CreateImageRequest -> m ImagesResponse{- ^  -}
  , createImageEdit :: a -> FormCreateImageEdit -> m ImagesResponse{- ^  -}
  , createImageVariation :: a -> FormCreateImageVariation -> m ImagesResponse{- ^  -}
  , deleteInvite :: a -> Text -> m InviteDeleteResponse{- ^  -}
  , inviteUser :: a -> InviteRequest -> m Invite{- ^  -}
  , listInvites :: a -> Maybe Int -> Maybe Text -> m InviteListResponse{- ^  -}
  , retrieveInvite :: a -> Text -> m Invite{- ^  -}
  , deleteModel :: a -> Text -> m DeleteModelResponse{- ^  -}
  , listModels :: a -> m ListModelsResponse{- ^  -}
  , retrieveModel :: a -> Text -> m Model{- ^  -}
  , createModeration :: a -> CreateModerationRequest -> m CreateModerationResponse{- ^  -}
  , archiveProject :: a -> Text -> m Project{- ^  -}
  , createProject :: a -> ProjectCreateRequest -> m Project{- ^  -}
  , createProjectServiceAccount :: a -> Text -> ProjectServiceAccountCreateRequest -> m ProjectServiceAccountCreateResponse{- ^  -}
  , createProjectUser :: a -> Text -> ProjectUserCreateRequest -> m ProjectUser{- ^  -}
  , deleteProjectApiKey :: a -> Text -> Text -> m ProjectApiKeyDeleteResponse{- ^  -}
  , deleteProjectServiceAccount :: a -> Text -> Text -> m ProjectServiceAccountDeleteResponse{- ^  -}
  , deleteProjectUser :: a -> Text -> Text -> m ProjectUserDeleteResponse{- ^  -}
  , listProjectApiKeys :: a -> Text -> Maybe Int -> Maybe Text -> m ProjectApiKeyListResponse{- ^  -}
  , listProjectRateLimits :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> m ProjectRateLimitListResponse{- ^  -}
  , listProjectServiceAccounts :: a -> Text -> Maybe Int -> Maybe Text -> m ProjectServiceAccountListResponse{- ^  -}
  , listProjectUsers :: a -> Text -> Maybe Int -> Maybe Text -> m ProjectUserListResponse{- ^  -}
  , listProjects :: a -> Maybe Int -> Maybe Text -> Maybe Bool -> m ProjectListResponse{- ^  -}
  , modifyProject :: a -> Text -> ProjectUpdateRequest -> m Project{- ^  -}
  , modifyProjectUser :: a -> Text -> Text -> ProjectUserUpdateRequest -> m ProjectUser{- ^  -}
  , retrieveProject :: a -> Text -> m Project{- ^  -}
  , retrieveProjectApiKey :: a -> Text -> Text -> m ProjectApiKey{- ^  -}
  , retrieveProjectServiceAccount :: a -> Text -> Text -> m ProjectServiceAccount{- ^  -}
  , retrieveProjectUser :: a -> Text -> Text -> m ProjectUser{- ^  -}
  , updateProjectRateLimits :: a -> Text -> Text -> ProjectRateLimitUpdateRequest -> m ProjectRateLimit{- ^  -}
  , createRealtimeSession :: a -> RealtimeSessionCreateRequest -> m RealtimeSessionCreateResponse{- ^  -}
  , addUploadPart :: a -> Text -> FormAddUploadPart -> m UploadPart{- ^  -}
  , cancelUpload :: a -> Text -> m Upload{- ^  -}
  , completeUpload :: a -> Text -> CompleteUploadRequest -> m Upload{- ^  -}
  , createUpload :: a -> CreateUploadRequest -> m Upload{- ^  -}
  , usageAudioSpeeches :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageAudioTranscriptions :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageCodeInterpreterSessions :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageCompletions :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Bool -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageCosts :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageEmbeddings :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageImages :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageModerations :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , usageVectorStores :: a -> Maybe Int -> Maybe Int -> Maybe Text -> Maybe [Text] -> Maybe [Text] -> Maybe Int -> Maybe Text -> m UsageResponse{- ^  -}
  , deleteUser :: a -> Text -> m UserDeleteResponse{- ^  -}
  , listUsers :: a -> Maybe Int -> Maybe Text -> m UserListResponse{- ^  -}
  , modifyUser :: a -> Text -> UserRoleUpdateRequest -> m User{- ^  -}
  , retrieveUser :: a -> Text -> m User{- ^  -}
  , cancelVectorStoreFileBatch :: a -> Text -> Text -> m VectorStoreFileBatchObject{- ^  -}
  , createVectorStore :: a -> CreateVectorStoreRequest -> m VectorStoreObject{- ^  -}
  , createVectorStoreFile :: a -> Text -> CreateVectorStoreFileRequest -> m VectorStoreFileObject{- ^  -}
  , createVectorStoreFileBatch :: a -> Text -> CreateVectorStoreFileBatchRequest -> m VectorStoreFileBatchObject{- ^  -}
  , deleteVectorStore :: a -> Text -> m DeleteVectorStoreResponse{- ^  -}
  , deleteVectorStoreFile :: a -> Text -> Text -> m DeleteVectorStoreFileResponse{- ^  -}
  , getVectorStore :: a -> Text -> m VectorStoreObject{- ^  -}
  , getVectorStoreFile :: a -> Text -> Text -> m VectorStoreFileObject{- ^  -}
  , getVectorStoreFileBatch :: a -> Text -> Text -> m VectorStoreFileBatchObject{- ^  -}
  , listFilesInVectorStoreBatch :: a -> Text -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ListVectorStoreFilesResponse{- ^  -}
  , listVectorStoreFiles :: a -> Text -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> Maybe Text -> m ListVectorStoreFilesResponse{- ^  -}
  , listVectorStores :: a -> Maybe Int -> Maybe Text -> Maybe Text -> Maybe Text -> m ListVectorStoresResponse{- ^  -}
  , modifyVectorStore :: a -> Text -> UpdateVectorStoreRequest -> m VectorStoreObject{- ^  -}
  }

-- | Authentication settings for OpenAI.
-- lookupUser is used to retrieve a user given a header value. The data type can be specified by providing an
-- type instance for AuthServerData. authError is a function that given a request returns a custom error that
-- is returned when the header is not found.
data OpenAIAuth = OpenAIAuth
  { lookupUser :: ByteString -> Handler AuthServer
  , authError :: Request -> ServerError
  }

newtype OpenAIClient a = OpenAIClient
  { runClient :: ClientEnv -> ExceptT ClientError IO a
  } deriving Functor

instance Applicative OpenAIClient where
  pure x = OpenAIClient (\_ -> pure x)
  (OpenAIClient f) <*> (OpenAIClient x) =
    OpenAIClient (\env -> f env <*> x env)

instance Monad OpenAIClient where
  (OpenAIClient a) >>= f =
    OpenAIClient (\env -> do
      value <- a env
      runClient (f value) env)

instance MonadIO OpenAIClient where
  liftIO io = OpenAIClient (\_ -> liftIO io)

createOpenAIClient :: OpenAIBackend AuthClient OpenAIClient
createOpenAIClient = OpenAIBackend{..}
  where
    ((coerce -> cancelRun) :<|>
     (coerce -> createAssistant) :<|>
     (coerce -> createMessage) :<|>
     (coerce -> createRun) :<|>
     (coerce -> createThread) :<|>
     (coerce -> createThreadAndRun) :<|>
     (coerce -> deleteAssistant) :<|>
     (coerce -> deleteMessage) :<|>
     (coerce -> deleteThread) :<|>
     (coerce -> getAssistant) :<|>
     (coerce -> getMessage) :<|>
     (coerce -> getRun) :<|>
     (coerce -> getRunStep) :<|>
     (coerce -> getThread) :<|>
     (coerce -> listAssistants) :<|>
     (coerce -> listMessages) :<|>
     (coerce -> listRunSteps) :<|>
     (coerce -> listRuns) :<|>
     (coerce -> modifyAssistant) :<|>
     (coerce -> modifyMessage) :<|>
     (coerce -> modifyRun) :<|>
     (coerce -> modifyThread) :<|>
     (coerce -> submitToolOuputsToRun) :<|>
     (coerce -> createSpeech) :<|>
     (coerce -> createTranscription) :<|>
     (coerce -> createTranslation) :<|>
     (coerce -> listAuditLogs) :<|>
     (coerce -> cancelBatch) :<|>
     (coerce -> createBatch) :<|>
     (coerce -> listBatches) :<|>
     (coerce -> retrieveBatch) :<|>
     (coerce -> createChatCompletion) :<|>
     (coerce -> createCompletion) :<|>
     (coerce -> adminApiKeysCreate) :<|>
     (coerce -> adminApiKeysDelete) :<|>
     (coerce -> adminApiKeysGet) :<|>
     (coerce -> adminApiKeysList) :<|>
     (coerce -> createEmbedding) :<|>
     (coerce -> createFile) :<|>
     (coerce -> deleteFile) :<|>
     (coerce -> downloadFile) :<|>
     (coerce -> listFiles) :<|>
     (coerce -> retrieveFile) :<|>
     (coerce -> cancelFineTuningJob) :<|>
     (coerce -> createFineTuningJob) :<|>
     (coerce -> listFineTuningEvents) :<|>
     (coerce -> listFineTuningJobCheckpoints) :<|>
     (coerce -> listPaginatedFineTuningJobs) :<|>
     (coerce -> retrieveFineTuningJob) :<|>
     (coerce -> createImage) :<|>
     (coerce -> createImageEdit) :<|>
     (coerce -> createImageVariation) :<|>
     (coerce -> deleteInvite) :<|>
     (coerce -> inviteUser) :<|>
     (coerce -> listInvites) :<|>
     (coerce -> retrieveInvite) :<|>
     (coerce -> deleteModel) :<|>
     (coerce -> listModels) :<|>
     (coerce -> retrieveModel) :<|>
     (coerce -> createModeration) :<|>
     (coerce -> archiveProject) :<|>
     (coerce -> createProject) :<|>
     (coerce -> createProjectServiceAccount) :<|>
     (coerce -> createProjectUser) :<|>
     (coerce -> deleteProjectApiKey) :<|>
     (coerce -> deleteProjectServiceAccount) :<|>
     (coerce -> deleteProjectUser) :<|>
     (coerce -> listProjectApiKeys) :<|>
     (coerce -> listProjectRateLimits) :<|>
     (coerce -> listProjectServiceAccounts) :<|>
     (coerce -> listProjectUsers) :<|>
     (coerce -> listProjects) :<|>
     (coerce -> modifyProject) :<|>
     (coerce -> modifyProjectUser) :<|>
     (coerce -> retrieveProject) :<|>
     (coerce -> retrieveProjectApiKey) :<|>
     (coerce -> retrieveProjectServiceAccount) :<|>
     (coerce -> retrieveProjectUser) :<|>
     (coerce -> updateProjectRateLimits) :<|>
     (coerce -> createRealtimeSession) :<|>
     (coerce -> addUploadPart) :<|>
     (coerce -> cancelUpload) :<|>
     (coerce -> completeUpload) :<|>
     (coerce -> createUpload) :<|>
     (coerce -> usageAudioSpeeches) :<|>
     (coerce -> usageAudioTranscriptions) :<|>
     (coerce -> usageCodeInterpreterSessions) :<|>
     (coerce -> usageCompletions) :<|>
     (coerce -> usageCosts) :<|>
     (coerce -> usageEmbeddings) :<|>
     (coerce -> usageImages) :<|>
     (coerce -> usageModerations) :<|>
     (coerce -> usageVectorStores) :<|>
     (coerce -> deleteUser) :<|>
     (coerce -> listUsers) :<|>
     (coerce -> modifyUser) :<|>
     (coerce -> retrieveUser) :<|>
     (coerce -> cancelVectorStoreFileBatch) :<|>
     (coerce -> createVectorStore) :<|>
     (coerce -> createVectorStoreFile) :<|>
     (coerce -> createVectorStoreFileBatch) :<|>
     (coerce -> deleteVectorStore) :<|>
     (coerce -> deleteVectorStoreFile) :<|>
     (coerce -> getVectorStore) :<|>
     (coerce -> getVectorStoreFile) :<|>
     (coerce -> getVectorStoreFileBatch) :<|>
     (coerce -> listFilesInVectorStoreBatch) :<|>
     (coerce -> listVectorStoreFiles) :<|>
     (coerce -> listVectorStores) :<|>
     (coerce -> modifyVectorStore) :<|>
     _) = client (Proxy :: Proxy OpenAIAPI)

-- | Run requests in the OpenAIClient monad.
runOpenAIClient :: Config -> OpenAIClient a -> ExceptT ClientError IO a
runOpenAIClient clientConfig cl = do
  manager <- liftIO $ newManager tlsManagerSettings
  runOpenAIClientWithManager manager clientConfig cl

-- | Run requests in the OpenAIClient monad using a custom manager.
runOpenAIClientWithManager :: Manager -> Config -> OpenAIClient a -> ExceptT ClientError IO a
runOpenAIClientWithManager manager Config{..} cl = do
  url <- parseBaseUrl configUrl
  runClient cl $ mkClientEnv manager url

-- | Like @runClient@, but returns the response or throws
--   a OpenAIClientError
callOpenAI
  :: (MonadIO m, MonadThrow m)
  => ClientEnv -> OpenAIClient a -> m a
callOpenAI env f = do
  res <- liftIO $ runExceptT $ runClient f env
  case res of
    Left err       -> throwM (OpenAIClientError err)
    Right response -> pure response


requestMiddlewareId :: Application -> Application
requestMiddlewareId a = a

-- | Run the OpenAI server at the provided host and port.
runOpenAIServer
  :: (MonadIO m, MonadThrow m)
  => Config -> OpenAIAuth -> OpenAIBackend AuthServer (ExceptT ServerError IO) -> m ()
runOpenAIServer config auth backend = runOpenAIMiddlewareServer config requestMiddlewareId auth backend

-- | Run the OpenAI server at the provided host and port.
runOpenAIMiddlewareServer
  :: (MonadIO m, MonadThrow m)
  => Config -> Middleware -> OpenAIAuth -> OpenAIBackend AuthServer (ExceptT ServerError IO) -> m ()
runOpenAIMiddlewareServer Config{..} middleware auth backend = do
  url <- parseBaseUrl configUrl
  let warpSettings = Warp.defaultSettings
        & Warp.setPort (baseUrlPort url)
        & Warp.setHost (fromString $ baseUrlHost url)
  liftIO $ Warp.runSettings warpSettings $ middleware $ serverWaiApplicationOpenAI auth backend

-- | Plain "Network.Wai" Application for the OpenAI server.
--
-- Can be used to implement e.g. tests that call the API without a full webserver.
serverWaiApplicationOpenAI :: OpenAIAuth -> OpenAIBackend AuthServer (ExceptT ServerError IO) -> Application
serverWaiApplicationOpenAI auth backend = serveWithContextT (Proxy :: Proxy OpenAIAPI) context id (serverFromBackend backend)
  where
    context = serverContext auth
    serverFromBackend OpenAIBackend{..} =
      (coerce cancelRun :<|>
       coerce createAssistant :<|>
       coerce createMessage :<|>
       coerce createRun :<|>
       coerce createThread :<|>
       coerce createThreadAndRun :<|>
       coerce deleteAssistant :<|>
       coerce deleteMessage :<|>
       coerce deleteThread :<|>
       coerce getAssistant :<|>
       coerce getMessage :<|>
       coerce getRun :<|>
       coerce getRunStep :<|>
       coerce getThread :<|>
       coerce listAssistants :<|>
       coerce listMessages :<|>
       coerce listRunSteps :<|>
       coerce listRuns :<|>
       coerce modifyAssistant :<|>
       coerce modifyMessage :<|>
       coerce modifyRun :<|>
       coerce modifyThread :<|>
       coerce submitToolOuputsToRun :<|>
       coerce createSpeech :<|>
       coerce createTranscription :<|>
       coerce createTranslation :<|>
       coerce listAuditLogs :<|>
       coerce cancelBatch :<|>
       coerce createBatch :<|>
       coerce listBatches :<|>
       coerce retrieveBatch :<|>
       coerce createChatCompletion :<|>
       coerce createCompletion :<|>
       coerce adminApiKeysCreate :<|>
       coerce adminApiKeysDelete :<|>
       coerce adminApiKeysGet :<|>
       coerce adminApiKeysList :<|>
       coerce createEmbedding :<|>
       coerce createFile :<|>
       coerce deleteFile :<|>
       coerce downloadFile :<|>
       coerce listFiles :<|>
       coerce retrieveFile :<|>
       coerce cancelFineTuningJob :<|>
       coerce createFineTuningJob :<|>
       coerce listFineTuningEvents :<|>
       coerce listFineTuningJobCheckpoints :<|>
       coerce listPaginatedFineTuningJobs :<|>
       coerce retrieveFineTuningJob :<|>
       coerce createImage :<|>
       coerce createImageEdit :<|>
       coerce createImageVariation :<|>
       coerce deleteInvite :<|>
       coerce inviteUser :<|>
       coerce listInvites :<|>
       coerce retrieveInvite :<|>
       coerce deleteModel :<|>
       coerce listModels :<|>
       coerce retrieveModel :<|>
       coerce createModeration :<|>
       coerce archiveProject :<|>
       coerce createProject :<|>
       coerce createProjectServiceAccount :<|>
       coerce createProjectUser :<|>
       coerce deleteProjectApiKey :<|>
       coerce deleteProjectServiceAccount :<|>
       coerce deleteProjectUser :<|>
       coerce listProjectApiKeys :<|>
       coerce listProjectRateLimits :<|>
       coerce listProjectServiceAccounts :<|>
       coerce listProjectUsers :<|>
       coerce listProjects :<|>
       coerce modifyProject :<|>
       coerce modifyProjectUser :<|>
       coerce retrieveProject :<|>
       coerce retrieveProjectApiKey :<|>
       coerce retrieveProjectServiceAccount :<|>
       coerce retrieveProjectUser :<|>
       coerce updateProjectRateLimits :<|>
       coerce createRealtimeSession :<|>
       coerce addUploadPart :<|>
       coerce cancelUpload :<|>
       coerce completeUpload :<|>
       coerce createUpload :<|>
       coerce usageAudioSpeeches :<|>
       coerce usageAudioTranscriptions :<|>
       coerce usageCodeInterpreterSessions :<|>
       coerce usageCompletions :<|>
       coerce usageCosts :<|>
       coerce usageEmbeddings :<|>
       coerce usageImages :<|>
       coerce usageModerations :<|>
       coerce usageVectorStores :<|>
       coerce deleteUser :<|>
       coerce listUsers :<|>
       coerce modifyUser :<|>
       coerce retrieveUser :<|>
       coerce cancelVectorStoreFileBatch :<|>
       coerce createVectorStore :<|>
       coerce createVectorStoreFile :<|>
       coerce createVectorStoreFileBatch :<|>
       coerce deleteVectorStore :<|>
       coerce deleteVectorStoreFile :<|>
       coerce getVectorStore :<|>
       coerce getVectorStoreFile :<|>
       coerce getVectorStoreFileBatch :<|>
       coerce listFilesInVectorStoreBatch :<|>
       coerce listVectorStoreFiles :<|>
       coerce listVectorStores :<|>
       coerce modifyVectorStore :<|>
       serveDirectoryFileServer "static")

-- Authentication is implemented with servants generalized authentication:
-- https://docs.servant.dev/en/stable/tutorial/Authentication.html#generalized-authentication

authHandler :: OpenAIAuth -> AuthHandler Request AuthServer
authHandler OpenAIAuth{..} = mkAuthHandler handler
  where
    handler req = case lookup "Authorization" (requestHeaders req) of
      Just header -> case extractBearerAuth header of
        Just key -> lookupUser key
        Nothing -> throwError (authError req)
      Nothing -> throwError (authError req)

type Protected = AuthProtect "bearer"
type AuthServer = AuthServerData Protected
type AuthClient = AuthenticatedRequest Protected
type instance AuthClientData Protected = Text

clientAuth :: Text -> AuthClient
clientAuth key = mkAuthenticatedRequest ("Bearer " <> key) (addHeader "Authorization")

serverContext :: OpenAIAuth -> Context (AuthHandler Request AuthServer ': '[])
serverContext auth = authHandler auth :. EmptyContext
