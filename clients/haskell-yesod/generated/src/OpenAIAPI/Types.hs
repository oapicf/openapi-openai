{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OpenAIAPI.Types (
  AdminApiKey (..),
  AdminApiKeyOwner (..),
  AdminApiKeysCreateRequest (..),
  AdminApiKeysDelete200Response (..),
  ApiKeyList (..),
  ArrayOfContentPartsInner (..),
  AssistantObject (..),
  AssistantObjectToolResources (..),
  AssistantObjectToolResourcesCodeInterpreter (..),
  AssistantObjectToolResourcesFileSearch (..),
  AssistantObjectToolsInner (..),
  AssistantStreamEvent (..),
  AssistantToolsCode (..),
  AssistantToolsFileSearch (..),
  AssistantToolsFileSearchFileSearch (..),
  AssistantToolsFileSearchTypeOnly (..),
  AssistantToolsFunction (..),
  AssistantsApiResponseFormatOption (..),
  AssistantsApiToolChoiceOption (..),
  AssistantsNamedToolChoice (..),
  AssistantsNamedToolChoiceFunction (..),
  AudioResponseFormat (..),
  AuditLog (..),
  AuditLogActor (..),
  AuditLogActorApiKey (..),
  AuditLogActorServiceAccount (..),
  AuditLogActorSession (..),
  AuditLogActorUser (..),
  AuditLogApiKeyCreated (..),
  AuditLogApiKeyCreatedData (..),
  AuditLogApiKeyDeleted (..),
  AuditLogApiKeyUpdated (..),
  AuditLogApiKeyUpdatedChangesRequested (..),
  AuditLogEventType (..),
  AuditLogInviteAccepted (..),
  AuditLogInviteSent (..),
  AuditLogInviteSentData (..),
  AuditLogLoginFailed (..),
  AuditLogOrganizationUpdated (..),
  AuditLogOrganizationUpdatedChangesRequested (..),
  AuditLogOrganizationUpdatedChangesRequestedSettings (..),
  AuditLogProject (..),
  AuditLogProjectArchived (..),
  AuditLogProjectCreated (..),
  AuditLogProjectCreatedData (..),
  AuditLogProjectUpdated (..),
  AuditLogProjectUpdatedChangesRequested (..),
  AuditLogRateLimitDeleted (..),
  AuditLogRateLimitUpdated (..),
  AuditLogRateLimitUpdatedChangesRequested (..),
  AuditLogServiceAccountCreated (..),
  AuditLogServiceAccountCreatedData (..),
  AuditLogServiceAccountDeleted (..),
  AuditLogServiceAccountUpdated (..),
  AuditLogServiceAccountUpdatedChangesRequested (..),
  AuditLogUserAdded (..),
  AuditLogUserAddedData (..),
  AuditLogUserDeleted (..),
  AuditLogUserUpdated (..),
  AuditLogUserUpdatedChangesRequested (..),
  AutoChunkingStrategy (..),
  AutoChunkingStrategyRequestParam (..),
  Batch (..),
  BatchErrors (..),
  BatchErrorsDataInner (..),
  BatchRequestCounts (..),
  BatchRequestInput (..),
  BatchRequestOutput (..),
  BatchRequestOutputError (..),
  BatchRequestOutputResponse (..),
  ChatCompletionFunctionCallOption (..),
  ChatCompletionFunctions (..),
  ChatCompletionMessageToolCall (..),
  ChatCompletionMessageToolCallChunk (..),
  ChatCompletionMessageToolCallChunkFunction (..),
  ChatCompletionMessageToolCallFunction (..),
  ChatCompletionNamedToolChoice (..),
  ChatCompletionRequestAssistantMessage (..),
  ChatCompletionRequestAssistantMessageAudio (..),
  ChatCompletionRequestAssistantMessageContent (..),
  ChatCompletionRequestAssistantMessageContentPart (..),
  ChatCompletionRequestAssistantMessageFunctionCall (..),
  ChatCompletionRequestDeveloperMessage (..),
  ChatCompletionRequestDeveloperMessageContent (..),
  ChatCompletionRequestFunctionMessage (..),
  ChatCompletionRequestMessage (..),
  ChatCompletionRequestMessageContentPartAudio (..),
  ChatCompletionRequestMessageContentPartAudioInputAudio (..),
  ChatCompletionRequestMessageContentPartImage (..),
  ChatCompletionRequestMessageContentPartImageImageUrl (..),
  ChatCompletionRequestMessageContentPartRefusal (..),
  ChatCompletionRequestMessageContentPartText (..),
  ChatCompletionRequestSystemMessage (..),
  ChatCompletionRequestSystemMessageContent (..),
  ChatCompletionRequestToolMessage (..),
  ChatCompletionRequestToolMessageContent (..),
  ChatCompletionRequestUserMessage (..),
  ChatCompletionRequestUserMessageContent (..),
  ChatCompletionRequestUserMessageContentPart (..),
  ChatCompletionResponseMessage (..),
  ChatCompletionResponseMessageAudio (..),
  ChatCompletionResponseMessageFunctionCall (..),
  ChatCompletionRole (..),
  ChatCompletionStreamOptions (..),
  ChatCompletionStreamResponseDelta (..),
  ChatCompletionStreamResponseDeltaFunctionCall (..),
  ChatCompletionTokenLogprob (..),
  ChatCompletionTokenLogprobTopLogprobsInner (..),
  ChatCompletionTool (..),
  ChatCompletionToolChoiceOption (..),
  ChunkingStrategyRequestParam (..),
  CompleteUploadRequest (..),
  CompletionUsage (..),
  CompletionUsageCompletionTokensDetails (..),
  CompletionUsagePromptTokensDetails (..),
  CostsResult (..),
  CostsResultAmount (..),
  CreateAssistantRequest (..),
  CreateAssistantRequestModel (..),
  CreateAssistantRequestToolResources (..),
  CreateAssistantRequestToolResourcesCodeInterpreter (..),
  CreateAssistantRequestToolResourcesFileSearch (..),
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInner (..),
  CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy (..),
  CreateBatchRequest (..),
  CreateChatCompletionFunctionResponse (..),
  CreateChatCompletionFunctionResponseChoicesInner (..),
  CreateChatCompletionRequest (..),
  CreateChatCompletionRequestAudio (..),
  CreateChatCompletionRequestFunctionCall (..),
  CreateChatCompletionRequestModel (..),
  CreateChatCompletionRequestResponseFormat (..),
  CreateChatCompletionRequestStop (..),
  CreateChatCompletionResponse (..),
  CreateChatCompletionResponseChoicesInner (..),
  CreateChatCompletionResponseChoicesInnerLogprobs (..),
  CreateChatCompletionStreamResponse (..),
  CreateChatCompletionStreamResponseChoicesInner (..),
  CreateChatCompletionStreamResponseUsage (..),
  CreateCompletionRequest (..),
  CreateCompletionRequestModel (..),
  CreateCompletionRequestPrompt (..),
  CreateCompletionRequestStop (..),
  CreateCompletionResponse (..),
  CreateCompletionResponseChoicesInner (..),
  CreateCompletionResponseChoicesInnerLogprobs (..),
  CreateEmbeddingRequest (..),
  CreateEmbeddingRequestInput (..),
  CreateEmbeddingRequestModel (..),
  CreateEmbeddingResponse (..),
  CreateEmbeddingResponseUsage (..),
  CreateFineTuningJobRequest (..),
  CreateFineTuningJobRequestHyperparameters (..),
  CreateFineTuningJobRequestHyperparametersBatchSize (..),
  CreateFineTuningJobRequestHyperparametersLearningRateMultiplier (..),
  CreateFineTuningJobRequestHyperparametersNEpochs (..),
  CreateFineTuningJobRequestIntegrationsInner (..),
  CreateFineTuningJobRequestIntegrationsInnerWandb (..),
  CreateFineTuningJobRequestModel (..),
  CreateImageEditRequestModel (..),
  CreateImageRequest (..),
  CreateImageRequestModel (..),
  CreateMessageRequest (..),
  CreateMessageRequestAttachmentsInner (..),
  CreateMessageRequestAttachmentsInnerToolsInner (..),
  CreateMessageRequestContent (..),
  CreateModerationRequest (..),
  CreateModerationRequestInput (..),
  CreateModerationRequestInputOneOfInner (..),
  CreateModerationRequestInputOneOfInnerOneOf (..),
  CreateModerationRequestInputOneOfInnerOneOf1 (..),
  CreateModerationRequestInputOneOfInnerOneOfImageUrl (..),
  CreateModerationRequestModel (..),
  CreateModerationResponse (..),
  CreateModerationResponseResultsInner (..),
  CreateModerationResponseResultsInnerCategories (..),
  CreateModerationResponseResultsInnerCategoryAppliedInputTypes (..),
  CreateModerationResponseResultsInnerCategoryScores (..),
  CreateRunRequest (..),
  CreateRunRequestModel (..),
  CreateSpeechRequest (..),
  CreateSpeechRequestModel (..),
  CreateThreadAndRunRequest (..),
  CreateThreadAndRunRequestToolResources (..),
  CreateThreadAndRunRequestToolsInner (..),
  CreateThreadRequest (..),
  CreateThreadRequestToolResources (..),
  CreateThreadRequestToolResourcesFileSearch (..),
  CreateThreadRequestToolResourcesFileSearchVectorStoresInner (..),
  CreateTranscription200Response (..),
  CreateTranscriptionRequestModel (..),
  CreateTranscriptionResponseJson (..),
  CreateTranscriptionResponseVerboseJson (..),
  CreateTranslation200Response (..),
  CreateTranslationResponseJson (..),
  CreateTranslationResponseVerboseJson (..),
  CreateUploadRequest (..),
  CreateVectorStoreFileBatchRequest (..),
  CreateVectorStoreFileRequest (..),
  CreateVectorStoreRequest (..),
  CreateVectorStoreRequestChunkingStrategy (..),
  DefaultProjectErrorResponse (..),
  DeleteAssistantResponse (..),
  DeleteFileResponse (..),
  DeleteMessageResponse (..),
  DeleteModelResponse (..),
  DeleteThreadResponse (..),
  DeleteVectorStoreFileResponse (..),
  DeleteVectorStoreResponse (..),
  DoneEvent (..),
  Embedding (..),
  Error (..),
  ErrorEvent (..),
  ErrorResponse (..),
  FileSearchRankingOptions (..),
  FineTuneChatCompletionRequestAssistantMessage (..),
  FineTuneChatRequestInput (..),
  FineTuneChatRequestInputMessagesInner (..),
  FineTuneCompletionRequestInput (..),
  FineTuneDPOMethod (..),
  FineTuneDPOMethodHyperparameters (..),
  FineTuneDPOMethodHyperparametersBatchSize (..),
  FineTuneDPOMethodHyperparametersBeta (..),
  FineTuneDPOMethodHyperparametersLearningRateMultiplier (..),
  FineTuneDPOMethodHyperparametersNEpochs (..),
  FineTuneMethod (..),
  FineTunePreferenceRequestInput (..),
  FineTunePreferenceRequestInputInput (..),
  FineTunePreferenceRequestInputPreferredCompletionInner (..),
  FineTuneSupervisedMethod (..),
  FineTuneSupervisedMethodHyperparameters (..),
  FineTuningIntegration (..),
  FineTuningJob (..),
  FineTuningJobCheckpoint (..),
  FineTuningJobCheckpointMetrics (..),
  FineTuningJobError (..),
  FineTuningJobEvent (..),
  FineTuningJobHyperparameters (..),
  FineTuningJobIntegrationsInner (..),
  FunctionObject (..),
  Image (..),
  ImagesResponse (..),
  Invite (..),
  InviteDeleteResponse (..),
  InviteListResponse (..),
  InviteProjectsInner (..),
  InviteRequest (..),
  InviteRequestProjectsInner (..),
  ListAssistantsResponse (..),
  ListAuditLogsEffectiveAtParameter (..),
  ListAuditLogsResponse (..),
  ListBatchesResponse (..),
  ListFilesResponse (..),
  ListFineTuningJobCheckpointsResponse (..),
  ListFineTuningJobEventsResponse (..),
  ListMessagesResponse (..),
  ListModelsResponse (..),
  ListPaginatedFineTuningJobsResponse (..),
  ListRunStepsResponse (..),
  ListRunsResponse (..),
  ListThreadsResponse (..),
  ListVectorStoreFilesResponse (..),
  ListVectorStoresResponse (..),
  MessageContentImageFileObject (..),
  MessageContentImageFileObjectImageFile (..),
  MessageContentImageUrlObject (..),
  MessageContentImageUrlObjectImageUrl (..),
  MessageContentRefusalObject (..),
  MessageContentTextAnnotationsFileCitationObject (..),
  MessageContentTextAnnotationsFileCitationObjectFileCitation (..),
  MessageContentTextAnnotationsFilePathObject (..),
  MessageContentTextAnnotationsFilePathObjectFilePath (..),
  MessageContentTextObject (..),
  MessageContentTextObjectText (..),
  MessageContentTextObjectTextAnnotationsInner (..),
  MessageDeltaContentImageFileObject (..),
  MessageDeltaContentImageFileObjectImageFile (..),
  MessageDeltaContentImageUrlObject (..),
  MessageDeltaContentImageUrlObjectImageUrl (..),
  MessageDeltaContentRefusalObject (..),
  MessageDeltaContentTextAnnotationsFileCitationObject (..),
  MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation (..),
  MessageDeltaContentTextAnnotationsFilePathObject (..),
  MessageDeltaContentTextAnnotationsFilePathObjectFilePath (..),
  MessageDeltaContentTextObject (..),
  MessageDeltaContentTextObjectText (..),
  MessageDeltaContentTextObjectTextAnnotationsInner (..),
  MessageDeltaObject (..),
  MessageDeltaObjectDelta (..),
  MessageDeltaObjectDeltaContentInner (..),
  MessageObject (..),
  MessageObjectContentInner (..),
  MessageObjectIncompleteDetails (..),
  MessageRequestContentTextObject (..),
  MessageStreamEvent (..),
  MessageStreamEventOneOf (..),
  MessageStreamEventOneOf1 (..),
  MessageStreamEventOneOf2 (..),
  MessageStreamEventOneOf3 (..),
  MessageStreamEventOneOf4 (..),
  Model (..),
  ModifyAssistantRequest (..),
  ModifyAssistantRequestToolResources (..),
  ModifyAssistantRequestToolResourcesCodeInterpreter (..),
  ModifyAssistantRequestToolResourcesFileSearch (..),
  ModifyMessageRequest (..),
  ModifyRunRequest (..),
  ModifyThreadRequest (..),
  ModifyThreadRequestToolResources (..),
  ModifyThreadRequestToolResourcesFileSearch (..),
  OpenAIFile (..),
  OtherChunkingStrategyResponseParam (..),
  PredictionContent (..),
  PredictionContentContent (..),
  Project (..),
  ProjectApiKey (..),
  ProjectApiKeyDeleteResponse (..),
  ProjectApiKeyListResponse (..),
  ProjectApiKeyOwner (..),
  ProjectCreateRequest (..),
  ProjectListResponse (..),
  ProjectRateLimit (..),
  ProjectRateLimitListResponse (..),
  ProjectRateLimitUpdateRequest (..),
  ProjectServiceAccount (..),
  ProjectServiceAccountApiKey (..),
  ProjectServiceAccountCreateRequest (..),
  ProjectServiceAccountCreateResponse (..),
  ProjectServiceAccountDeleteResponse (..),
  ProjectServiceAccountListResponse (..),
  ProjectUpdateRequest (..),
  ProjectUser (..),
  ProjectUserCreateRequest (..),
  ProjectUserDeleteResponse (..),
  ProjectUserListResponse (..),
  ProjectUserUpdateRequest (..),
  RealtimeClientEventConversationItemCreate (..),
  RealtimeClientEventConversationItemDelete (..),
  RealtimeClientEventConversationItemTruncate (..),
  RealtimeClientEventInputAudioBufferAppend (..),
  RealtimeClientEventInputAudioBufferClear (..),
  RealtimeClientEventInputAudioBufferCommit (..),
  RealtimeClientEventResponseCancel (..),
  RealtimeClientEventResponseCreate (..),
  RealtimeClientEventSessionUpdate (..),
  RealtimeConversationItem (..),
  RealtimeConversationItemContentInner (..),
  RealtimeResponse (..),
  RealtimeResponseCreateParams (..),
  RealtimeResponseCreateParamsConversation (..),
  RealtimeResponseCreateParamsMaxResponseOutputTokens (..),
  RealtimeResponseCreateParamsToolsInner (..),
  RealtimeResponseStatusDetails (..),
  RealtimeResponseStatusDetailsError (..),
  RealtimeResponseUsage (..),
  RealtimeResponseUsageInputTokenDetails (..),
  RealtimeResponseUsageOutputTokenDetails (..),
  RealtimeServerEventConversationCreated (..),
  RealtimeServerEventConversationCreatedConversation (..),
  RealtimeServerEventConversationItemCreated (..),
  RealtimeServerEventConversationItemDeleted (..),
  RealtimeServerEventConversationItemInputAudioTranscriptionCompleted (..),
  RealtimeServerEventConversationItemInputAudioTranscriptionFailed (..),
  RealtimeServerEventConversationItemInputAudioTranscriptionFailedError (..),
  RealtimeServerEventConversationItemTruncated (..),
  RealtimeServerEventError (..),
  RealtimeServerEventErrorError (..),
  RealtimeServerEventInputAudioBufferCleared (..),
  RealtimeServerEventInputAudioBufferCommitted (..),
  RealtimeServerEventInputAudioBufferSpeechStarted (..),
  RealtimeServerEventInputAudioBufferSpeechStopped (..),
  RealtimeServerEventRateLimitsUpdated (..),
  RealtimeServerEventRateLimitsUpdatedRateLimitsInner (..),
  RealtimeServerEventResponseAudioDelta (..),
  RealtimeServerEventResponseAudioDone (..),
  RealtimeServerEventResponseAudioTranscriptDelta (..),
  RealtimeServerEventResponseAudioTranscriptDone (..),
  RealtimeServerEventResponseContentPartAdded (..),
  RealtimeServerEventResponseContentPartAddedPart (..),
  RealtimeServerEventResponseContentPartDone (..),
  RealtimeServerEventResponseContentPartDonePart (..),
  RealtimeServerEventResponseCreated (..),
  RealtimeServerEventResponseDone (..),
  RealtimeServerEventResponseFunctionCallArgumentsDelta (..),
  RealtimeServerEventResponseFunctionCallArgumentsDone (..),
  RealtimeServerEventResponseOutputItemAdded (..),
  RealtimeServerEventResponseOutputItemDone (..),
  RealtimeServerEventResponseTextDelta (..),
  RealtimeServerEventResponseTextDone (..),
  RealtimeServerEventSessionCreated (..),
  RealtimeServerEventSessionUpdated (..),
  RealtimeSession (..),
  RealtimeSessionCreateRequest (..),
  RealtimeSessionCreateRequestTurnDetection (..),
  RealtimeSessionCreateResponse (..),
  RealtimeSessionCreateResponseClientSecret (..),
  RealtimeSessionCreateResponseTurnDetection (..),
  RealtimeSessionInputAudioTranscription (..),
  RealtimeSessionModel (..),
  RealtimeSessionTurnDetection (..),
  ResponseFormatJsonObject (..),
  ResponseFormatJsonSchema (..),
  ResponseFormatJsonSchemaJsonSchema (..),
  ResponseFormatText (..),
  RunCompletionUsage (..),
  RunObject (..),
  RunObjectIncompleteDetails (..),
  RunObjectLastError (..),
  RunObjectRequiredAction (..),
  RunObjectRequiredActionSubmitToolOutputs (..),
  RunStepCompletionUsage (..),
  RunStepDeltaObject (..),
  RunStepDeltaObjectDelta (..),
  RunStepDeltaObjectDeltaStepDetails (..),
  RunStepDeltaStepDetailsMessageCreationObject (..),
  RunStepDeltaStepDetailsMessageCreationObjectMessageCreation (..),
  RunStepDeltaStepDetailsToolCallsCodeObject (..),
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter (..),
  RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (..),
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject (..),
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage (..),
  RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject (..),
  RunStepDeltaStepDetailsToolCallsFileSearchObject (..),
  RunStepDeltaStepDetailsToolCallsFunctionObject (..),
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction (..),
  RunStepDeltaStepDetailsToolCallsObject (..),
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (..),
  RunStepDetailsMessageCreationObject (..),
  RunStepDetailsMessageCreationObjectMessageCreation (..),
  RunStepDetailsToolCallsCodeObject (..),
  RunStepDetailsToolCallsCodeObjectCodeInterpreter (..),
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (..),
  RunStepDetailsToolCallsCodeOutputImageObject (..),
  RunStepDetailsToolCallsCodeOutputImageObjectImage (..),
  RunStepDetailsToolCallsCodeOutputLogsObject (..),
  RunStepDetailsToolCallsFileSearchObject (..),
  RunStepDetailsToolCallsFileSearchObjectFileSearch (..),
  RunStepDetailsToolCallsFileSearchRankingOptionsObject (..),
  RunStepDetailsToolCallsFileSearchResultObject (..),
  RunStepDetailsToolCallsFileSearchResultObjectContentInner (..),
  RunStepDetailsToolCallsFunctionObject (..),
  RunStepDetailsToolCallsFunctionObjectFunction (..),
  RunStepDetailsToolCallsObject (..),
  RunStepDetailsToolCallsObjectToolCallsInner (..),
  RunStepObject (..),
  RunStepObjectLastError (..),
  RunStepObjectStepDetails (..),
  RunStepStreamEvent (..),
  RunStepStreamEventOneOf (..),
  RunStepStreamEventOneOf1 (..),
  RunStepStreamEventOneOf2 (..),
  RunStepStreamEventOneOf3 (..),
  RunStepStreamEventOneOf4 (..),
  RunStepStreamEventOneOf5 (..),
  RunStepStreamEventOneOf6 (..),
  RunStreamEvent (..),
  RunStreamEventOneOf (..),
  RunStreamEventOneOf1 (..),
  RunStreamEventOneOf2 (..),
  RunStreamEventOneOf3 (..),
  RunStreamEventOneOf4 (..),
  RunStreamEventOneOf5 (..),
  RunStreamEventOneOf6 (..),
  RunStreamEventOneOf7 (..),
  RunStreamEventOneOf8 (..),
  RunStreamEventOneOf9 (..),
  RunToolCallObject (..),
  RunToolCallObjectFunction (..),
  StaticChunkingStrategy (..),
  StaticChunkingStrategyRequestParam (..),
  StaticChunkingStrategyResponseParam (..),
  StaticChunkingStrategyStatic (..),
  SubmitToolOutputsRunRequest (..),
  SubmitToolOutputsRunRequestToolOutputsInner (..),
  ThreadObject (..),
  ThreadStreamEvent (..),
  TranscriptionSegment (..),
  TranscriptionWord (..),
  TruncationObject (..),
  UpdateVectorStoreRequest (..),
  Upload (..),
  UploadPart (..),
  UsageAudioSpeechesResult (..),
  UsageAudioTranscriptionsResult (..),
  UsageCodeInterpreterSessionsResult (..),
  UsageCompletionsResult (..),
  UsageEmbeddingsResult (..),
  UsageImagesResult (..),
  UsageModerationsResult (..),
  UsageResponse (..),
  UsageTimeBucket (..),
  UsageTimeBucketResultInner (..),
  UsageVectorStoresResult (..),
  User (..),
  UserDeleteResponse (..),
  UserListResponse (..),
  UserRoleUpdateRequest (..),
  VectorStoreExpirationAfter (..),
  VectorStoreFileBatchObject (..),
  VectorStoreFileBatchObjectFileCounts (..),
  VectorStoreFileObject (..),
  VectorStoreFileObjectChunkingStrategy (..),
  VectorStoreFileObjectLastError (..),
  VectorStoreObject (..),
  VectorStoreObjectFileCounts (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
data AdminApiKey = AdminApiKey
  { adminApiKeyObject :: Maybe Text -- ^ 
  , adminApiKeyId :: Maybe Text -- ^ 
  , adminApiKeyName :: Maybe Text -- ^ 
  , adminApiKeyRedactedUnderscorevalue :: Maybe Text -- ^ 
  , adminApiKeyValue :: Maybe Text -- ^ 
  , adminApiKeyCreatedUnderscoreat :: Maybe Int64 -- ^ 
  , adminApiKeyOwner :: Maybe AdminApiKeyOwner -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdminApiKey where
  parseJSON = genericParseJSON optionsAdminApiKey
instance ToJSON AdminApiKey where
  toJSON = genericToJSON optionsAdminApiKey

optionsAdminApiKey :: Options
optionsAdminApiKey =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adminApiKeyObject", "object")
      , ("adminApiKeyId", "id")
      , ("adminApiKeyName", "name")
      , ("adminApiKeyRedactedUnderscorevalue", "redacted_value")
      , ("adminApiKeyValue", "value")
      , ("adminApiKeyCreatedUnderscoreat", "created_at")
      , ("adminApiKeyOwner", "owner")
      ]


-- | 
data AdminApiKeyOwner = AdminApiKeyOwner
  { adminApiKeyOwnerType :: Maybe Text -- ^ 
  , adminApiKeyOwnerId :: Maybe Text -- ^ 
  , adminApiKeyOwnerName :: Maybe Text -- ^ 
  , adminApiKeyOwnerCreatedUnderscoreat :: Maybe Int64 -- ^ 
  , adminApiKeyOwnerRole :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdminApiKeyOwner where
  parseJSON = genericParseJSON optionsAdminApiKeyOwner
instance ToJSON AdminApiKeyOwner where
  toJSON = genericToJSON optionsAdminApiKeyOwner

optionsAdminApiKeyOwner :: Options
optionsAdminApiKeyOwner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adminApiKeyOwnerType", "type")
      , ("adminApiKeyOwnerId", "id")
      , ("adminApiKeyOwnerName", "name")
      , ("adminApiKeyOwnerCreatedUnderscoreat", "created_at")
      , ("adminApiKeyOwnerRole", "role")
      ]


-- | 
data AdminApiKeysCreateRequest = AdminApiKeysCreateRequest
  { adminApiKeysCreateRequestName :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdminApiKeysCreateRequest where
  parseJSON = genericParseJSON optionsAdminApiKeysCreateRequest
instance ToJSON AdminApiKeysCreateRequest where
  toJSON = genericToJSON optionsAdminApiKeysCreateRequest

optionsAdminApiKeysCreateRequest :: Options
optionsAdminApiKeysCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adminApiKeysCreateRequestName", "name")
      ]


-- | 
data AdminApiKeysDelete200Response = AdminApiKeysDelete200Response
  { adminApiKeysDelete200ResponseId :: Maybe Text -- ^ 
  , adminApiKeysDelete200ResponseObject :: Maybe Text -- ^ 
  , adminApiKeysDelete200ResponseDeleted :: Maybe Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AdminApiKeysDelete200Response where
  parseJSON = genericParseJSON optionsAdminApiKeysDelete200Response
instance ToJSON AdminApiKeysDelete200Response where
  toJSON = genericToJSON optionsAdminApiKeysDelete200Response

optionsAdminApiKeysDelete200Response :: Options
optionsAdminApiKeysDelete200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("adminApiKeysDelete200ResponseId", "id")
      , ("adminApiKeysDelete200ResponseObject", "object")
      , ("adminApiKeysDelete200ResponseDeleted", "deleted")
      ]


-- | 
data ApiKeyList = ApiKeyList
  { apiKeyListObject :: Maybe Text -- ^ 
  , apiKeyListData :: Maybe [AdminApiKey] -- ^ 
  , apiKeyListHasUnderscoremore :: Maybe Bool -- ^ 
  , apiKeyListFirstUnderscoreid :: Maybe Text -- ^ 
  , apiKeyListLastUnderscoreid :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ApiKeyList where
  parseJSON = genericParseJSON optionsApiKeyList
instance ToJSON ApiKeyList where
  toJSON = genericToJSON optionsApiKeyList

optionsApiKeyList :: Options
optionsApiKeyList =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("apiKeyListObject", "object")
      , ("apiKeyListData", "data")
      , ("apiKeyListHasUnderscoremore", "has_more")
      , ("apiKeyListFirstUnderscoreid", "first_id")
      , ("apiKeyListLastUnderscoreid", "last_id")
      ]


-- | 
data ArrayOfContentPartsInner = ArrayOfContentPartsInner
  { arrayOfContentPartsInnerType :: Text -- ^ Always `image_file`.
  , arrayOfContentPartsInnerImageUnderscorefile :: MessageContentImageFileObjectImageFile -- ^ 
  , arrayOfContentPartsInnerImageUnderscoreurl :: MessageContentImageUrlObjectImageUrl -- ^ 
  , arrayOfContentPartsInnerText :: Text -- ^ Text content to be sent to the model
  } deriving (Show, Eq, Generic)

instance FromJSON ArrayOfContentPartsInner where
  parseJSON = genericParseJSON optionsArrayOfContentPartsInner
instance ToJSON ArrayOfContentPartsInner where
  toJSON = genericToJSON optionsArrayOfContentPartsInner

optionsArrayOfContentPartsInner :: Options
optionsArrayOfContentPartsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("arrayOfContentPartsInnerType", "type")
      , ("arrayOfContentPartsInnerImageUnderscorefile", "image_file")
      , ("arrayOfContentPartsInnerImageUnderscoreurl", "image_url")
      , ("arrayOfContentPartsInnerText", "text")
      ]


-- | Represents an &#x60;assistant&#x60; that can call the model and use tools.
data AssistantObject = AssistantObject
  { assistantObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , assistantObjectObject :: Text -- ^ The object type, which is always `assistant`.
  , assistantObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the assistant was created.
  , assistantObjectName :: Text -- ^ The name of the assistant. The maximum length is 256 characters. 
  , assistantObjectDescription :: Text -- ^ The description of the assistant. The maximum length is 512 characters. 
  , assistantObjectModel :: Text -- ^ ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
  , assistantObjectInstructions :: Text -- ^ The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  , assistantObjectTools :: [AssistantObjectToolsInner] -- ^ A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  , assistantObjectToolUnderscoreresources :: Maybe AssistantObjectToolResources -- ^ 
  , assistantObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , assistantObjectTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , assistantObjectTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  , assistantObjectResponseUnderscoreformat :: Maybe AssistantsApiResponseFormatOption -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantObject where
  parseJSON = genericParseJSON optionsAssistantObject
instance ToJSON AssistantObject where
  toJSON = genericToJSON optionsAssistantObject

optionsAssistantObject :: Options
optionsAssistantObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantObjectId", "id")
      , ("assistantObjectObject", "object")
      , ("assistantObjectCreatedUnderscoreat", "created_at")
      , ("assistantObjectName", "name")
      , ("assistantObjectDescription", "description")
      , ("assistantObjectModel", "model")
      , ("assistantObjectInstructions", "instructions")
      , ("assistantObjectTools", "tools")
      , ("assistantObjectToolUnderscoreresources", "tool_resources")
      , ("assistantObjectMetadata", "metadata")
      , ("assistantObjectTemperature", "temperature")
      , ("assistantObjectTopUnderscorep", "top_p")
      , ("assistantObjectResponseUnderscoreformat", "response_format")
      ]


-- | A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
data AssistantObjectToolResources = AssistantObjectToolResources
  { assistantObjectToolResourcesCodeUnderscoreinterpreter :: Maybe AssistantObjectToolResourcesCodeInterpreter -- ^ 
  , assistantObjectToolResourcesFileUnderscoresearch :: Maybe AssistantObjectToolResourcesFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantObjectToolResources where
  parseJSON = genericParseJSON optionsAssistantObjectToolResources
instance ToJSON AssistantObjectToolResources where
  toJSON = genericToJSON optionsAssistantObjectToolResources

optionsAssistantObjectToolResources :: Options
optionsAssistantObjectToolResources =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantObjectToolResourcesCodeUnderscoreinterpreter", "code_interpreter")
      , ("assistantObjectToolResourcesFileUnderscoresearch", "file_search")
      ]


-- | 
data AssistantObjectToolResourcesCodeInterpreter = AssistantObjectToolResourcesCodeInterpreter
  { assistantObjectToolResourcesCodeInterpreterFileUnderscoreids :: Maybe [Text] -- ^ A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter`` tool. There can be a maximum of 20 files associated with the tool. 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantObjectToolResourcesCodeInterpreter where
  parseJSON = genericParseJSON optionsAssistantObjectToolResourcesCodeInterpreter
instance ToJSON AssistantObjectToolResourcesCodeInterpreter where
  toJSON = genericToJSON optionsAssistantObjectToolResourcesCodeInterpreter

optionsAssistantObjectToolResourcesCodeInterpreter :: Options
optionsAssistantObjectToolResourcesCodeInterpreter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantObjectToolResourcesCodeInterpreterFileUnderscoreids", "file_ids")
      ]


-- | 
data AssistantObjectToolResourcesFileSearch = AssistantObjectToolResourcesFileSearch
  { assistantObjectToolResourcesFileSearchVectorUnderscorestoreUnderscoreids :: Maybe [Text] -- ^ The ID of the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantObjectToolResourcesFileSearch where
  parseJSON = genericParseJSON optionsAssistantObjectToolResourcesFileSearch
instance ToJSON AssistantObjectToolResourcesFileSearch where
  toJSON = genericToJSON optionsAssistantObjectToolResourcesFileSearch

optionsAssistantObjectToolResourcesFileSearch :: Options
optionsAssistantObjectToolResourcesFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantObjectToolResourcesFileSearchVectorUnderscorestoreUnderscoreids", "vector_store_ids")
      ]


-- | 
data AssistantObjectToolsInner = AssistantObjectToolsInner
  { assistantObjectToolsInnerType :: Text -- ^ The type of tool being defined: `code_interpreter`
  , assistantObjectToolsInnerFileUnderscoresearch :: Maybe AssistantToolsFileSearchFileSearch -- ^ 
  , assistantObjectToolsInnerFunction :: FunctionObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantObjectToolsInner where
  parseJSON = genericParseJSON optionsAssistantObjectToolsInner
instance ToJSON AssistantObjectToolsInner where
  toJSON = genericToJSON optionsAssistantObjectToolsInner

optionsAssistantObjectToolsInner :: Options
optionsAssistantObjectToolsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantObjectToolsInnerType", "type")
      , ("assistantObjectToolsInnerFileUnderscoresearch", "file_search")
      , ("assistantObjectToolsInnerFunction", "function")
      ]


-- | Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
data AssistantStreamEvent = AssistantStreamEvent
  { assistantStreamEventEnabled :: Maybe Bool -- ^ Whether to enable input audio transcription.
  , assistantStreamEventEvent :: Text -- ^ 
  , assistantStreamEventData :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantStreamEvent where
  parseJSON = genericParseJSON optionsAssistantStreamEvent
instance ToJSON AssistantStreamEvent where
  toJSON = genericToJSON optionsAssistantStreamEvent

optionsAssistantStreamEvent :: Options
optionsAssistantStreamEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantStreamEventEnabled", "enabled")
      , ("assistantStreamEventEvent", "event")
      , ("assistantStreamEventData", "data")
      ]


-- | 
data AssistantToolsCode = AssistantToolsCode
  { assistantToolsCodeType :: Text -- ^ The type of tool being defined: `code_interpreter`
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantToolsCode where
  parseJSON = genericParseJSON optionsAssistantToolsCode
instance ToJSON AssistantToolsCode where
  toJSON = genericToJSON optionsAssistantToolsCode

optionsAssistantToolsCode :: Options
optionsAssistantToolsCode =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantToolsCodeType", "type")
      ]


-- | 
data AssistantToolsFileSearch = AssistantToolsFileSearch
  { assistantToolsFileSearchType :: Text -- ^ The type of tool being defined: `file_search`
  , assistantToolsFileSearchFileUnderscoresearch :: Maybe AssistantToolsFileSearchFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantToolsFileSearch where
  parseJSON = genericParseJSON optionsAssistantToolsFileSearch
instance ToJSON AssistantToolsFileSearch where
  toJSON = genericToJSON optionsAssistantToolsFileSearch

optionsAssistantToolsFileSearch :: Options
optionsAssistantToolsFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantToolsFileSearchType", "type")
      , ("assistantToolsFileSearchFileUnderscoresearch", "file_search")
      ]


-- | Overrides for the file search tool.
data AssistantToolsFileSearchFileSearch = AssistantToolsFileSearchFileSearch
  { assistantToolsFileSearchFileSearchMaxUnderscorenumUnderscoreresults :: Maybe Int -- ^ The maximum number of results the file search tool should output. The default is 20 for `gpt-4*` models and 5 for `gpt-3.5-turbo`. This number should be between 1 and 50 inclusive.  Note that the file search tool may output fewer than `max_num_results` results. See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
  , assistantToolsFileSearchFileSearchRankingUnderscoreoptions :: Maybe FileSearchRankingOptions -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantToolsFileSearchFileSearch where
  parseJSON = genericParseJSON optionsAssistantToolsFileSearchFileSearch
instance ToJSON AssistantToolsFileSearchFileSearch where
  toJSON = genericToJSON optionsAssistantToolsFileSearchFileSearch

optionsAssistantToolsFileSearchFileSearch :: Options
optionsAssistantToolsFileSearchFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantToolsFileSearchFileSearchMaxUnderscorenumUnderscoreresults", "max_num_results")
      , ("assistantToolsFileSearchFileSearchRankingUnderscoreoptions", "ranking_options")
      ]


-- | 
data AssistantToolsFileSearchTypeOnly = AssistantToolsFileSearchTypeOnly
  { assistantToolsFileSearchTypeOnlyType :: Text -- ^ The type of tool being defined: `file_search`
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantToolsFileSearchTypeOnly where
  parseJSON = genericParseJSON optionsAssistantToolsFileSearchTypeOnly
instance ToJSON AssistantToolsFileSearchTypeOnly where
  toJSON = genericToJSON optionsAssistantToolsFileSearchTypeOnly

optionsAssistantToolsFileSearchTypeOnly :: Options
optionsAssistantToolsFileSearchTypeOnly =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantToolsFileSearchTypeOnlyType", "type")
      ]


-- | 
data AssistantToolsFunction = AssistantToolsFunction
  { assistantToolsFunctionType :: Text -- ^ The type of tool being defined: `function`
  , assistantToolsFunctionFunction :: FunctionObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantToolsFunction where
  parseJSON = genericParseJSON optionsAssistantToolsFunction
instance ToJSON AssistantToolsFunction where
  toJSON = genericToJSON optionsAssistantToolsFunction

optionsAssistantToolsFunction :: Options
optionsAssistantToolsFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantToolsFunctionType", "type")
      , ("assistantToolsFunctionFunction", "function")
      ]


-- | Specifies the format that the model must output. Compatible with [GPT-4o](/docs/models#gpt-4o), [GPT-4 Turbo](/docs/models#gpt-4-turbo-and-gpt-4), and all GPT-3.5 Turbo models since &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
data AssistantsApiResponseFormatOption = AssistantsApiResponseFormatOption
  { assistantsApiResponseFormatOptionType :: Text -- ^ The type of response format being defined: `text`
  , assistantsApiResponseFormatOptionJsonUnderscoreschema :: ResponseFormatJsonSchemaJsonSchema -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantsApiResponseFormatOption where
  parseJSON = genericParseJSON optionsAssistantsApiResponseFormatOption
instance ToJSON AssistantsApiResponseFormatOption where
  toJSON = genericToJSON optionsAssistantsApiResponseFormatOption

optionsAssistantsApiResponseFormatOption :: Options
optionsAssistantsApiResponseFormatOption =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantsApiResponseFormatOptionType", "type")
      , ("assistantsApiResponseFormatOptionJsonUnderscoreschema", "json_schema")
      ]


-- | Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools before responding to the user. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;file_search\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
data AssistantsApiToolChoiceOption = AssistantsApiToolChoiceOption
  { assistantsApiToolChoiceOptionType :: Text -- ^ The type of the tool. If type is `function`, the function name must be set
  , assistantsApiToolChoiceOptionFunction :: Maybe AssistantsNamedToolChoiceFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantsApiToolChoiceOption where
  parseJSON = genericParseJSON optionsAssistantsApiToolChoiceOption
instance ToJSON AssistantsApiToolChoiceOption where
  toJSON = genericToJSON optionsAssistantsApiToolChoiceOption

optionsAssistantsApiToolChoiceOption :: Options
optionsAssistantsApiToolChoiceOption =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantsApiToolChoiceOptionType", "type")
      , ("assistantsApiToolChoiceOptionFunction", "function")
      ]


-- | Specifies a tool the model should use. Use to force the model to call a specific tool.
data AssistantsNamedToolChoice = AssistantsNamedToolChoice
  { assistantsNamedToolChoiceType :: Text -- ^ The type of the tool. If type is `function`, the function name must be set
  , assistantsNamedToolChoiceFunction :: Maybe AssistantsNamedToolChoiceFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantsNamedToolChoice where
  parseJSON = genericParseJSON optionsAssistantsNamedToolChoice
instance ToJSON AssistantsNamedToolChoice where
  toJSON = genericToJSON optionsAssistantsNamedToolChoice

optionsAssistantsNamedToolChoice :: Options
optionsAssistantsNamedToolChoice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantsNamedToolChoiceType", "type")
      , ("assistantsNamedToolChoiceFunction", "function")
      ]


-- | 
data AssistantsNamedToolChoiceFunction = AssistantsNamedToolChoiceFunction
  { assistantsNamedToolChoiceFunctionName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantsNamedToolChoiceFunction where
  parseJSON = genericParseJSON optionsAssistantsNamedToolChoiceFunction
instance ToJSON AssistantsNamedToolChoiceFunction where
  toJSON = genericToJSON optionsAssistantsNamedToolChoiceFunction

optionsAssistantsNamedToolChoiceFunction :: Options
optionsAssistantsNamedToolChoiceFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantsNamedToolChoiceFunctionName", "name")
      ]


-- | The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
data AudioResponseFormat = AudioResponseFormat
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AudioResponseFormat where
  parseJSON = genericParseJSON optionsAudioResponseFormat
instance ToJSON AudioResponseFormat where
  toJSON = genericToJSON optionsAudioResponseFormat

optionsAudioResponseFormat :: Options
optionsAudioResponseFormat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | A log of a user action or configuration change within this organization.
data AuditLog = AuditLog
  { auditLogId :: Text -- ^ The ID of this log.
  , auditLogType :: AuditLogEventType -- ^ 
  , auditLogEffectiveUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of the event.
  , auditLogProject :: Maybe AuditLogProject -- ^ 
  , auditLogActor :: AuditLogActor -- ^ 
  , auditLogApiUnderscorekeyPeriodcreated :: Maybe AuditLogApiKeyCreated -- ^ 
  , auditLogApiUnderscorekeyPeriodupdated :: Maybe AuditLogApiKeyUpdated -- ^ 
  , auditLogApiUnderscorekeyPerioddeleted :: Maybe AuditLogApiKeyDeleted -- ^ 
  , auditLogInvitePeriodsent :: Maybe AuditLogInviteSent -- ^ 
  , auditLogInvitePeriodaccepted :: Maybe AuditLogInviteAccepted -- ^ 
  , auditLogInvitePerioddeleted :: Maybe AuditLogInviteAccepted -- ^ 
  , auditLogLoginPeriodfailed :: Maybe AuditLogLoginFailed -- ^ 
  , auditLogLogoutPeriodfailed :: Maybe AuditLogLoginFailed -- ^ 
  , auditLogOrganizationPeriodupdated :: Maybe AuditLogOrganizationUpdated -- ^ 
  , auditLogProjectPeriodcreated :: Maybe AuditLogProjectCreated -- ^ 
  , auditLogProjectPeriodupdated :: Maybe AuditLogProjectUpdated -- ^ 
  , auditLogProjectPeriodarchived :: Maybe AuditLogProjectArchived -- ^ 
  , auditLogRateUnderscorelimitPeriodupdated :: Maybe AuditLogRateLimitUpdated -- ^ 
  , auditLogRateUnderscorelimitPerioddeleted :: Maybe AuditLogRateLimitDeleted -- ^ 
  , auditLogServiceUnderscoreaccountPeriodcreated :: Maybe AuditLogServiceAccountCreated -- ^ 
  , auditLogServiceUnderscoreaccountPeriodupdated :: Maybe AuditLogServiceAccountUpdated -- ^ 
  , auditLogServiceUnderscoreaccountPerioddeleted :: Maybe AuditLogServiceAccountDeleted -- ^ 
  , auditLogUserPeriodadded :: Maybe AuditLogUserAdded -- ^ 
  , auditLogUserPeriodupdated :: Maybe AuditLogUserUpdated -- ^ 
  , auditLogUserPerioddeleted :: Maybe AuditLogUserDeleted -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLog where
  parseJSON = genericParseJSON optionsAuditLog
instance ToJSON AuditLog where
  toJSON = genericToJSON optionsAuditLog

optionsAuditLog :: Options
optionsAuditLog =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogId", "id")
      , ("auditLogType", "type")
      , ("auditLogEffectiveUnderscoreat", "effective_at")
      , ("auditLogProject", "project")
      , ("auditLogActor", "actor")
      , ("auditLogApiUnderscorekeyPeriodcreated", "api_key.created")
      , ("auditLogApiUnderscorekeyPeriodupdated", "api_key.updated")
      , ("auditLogApiUnderscorekeyPerioddeleted", "api_key.deleted")
      , ("auditLogInvitePeriodsent", "invite.sent")
      , ("auditLogInvitePeriodaccepted", "invite.accepted")
      , ("auditLogInvitePerioddeleted", "invite.deleted")
      , ("auditLogLoginPeriodfailed", "login.failed")
      , ("auditLogLogoutPeriodfailed", "logout.failed")
      , ("auditLogOrganizationPeriodupdated", "organization.updated")
      , ("auditLogProjectPeriodcreated", "project.created")
      , ("auditLogProjectPeriodupdated", "project.updated")
      , ("auditLogProjectPeriodarchived", "project.archived")
      , ("auditLogRateUnderscorelimitPeriodupdated", "rate_limit.updated")
      , ("auditLogRateUnderscorelimitPerioddeleted", "rate_limit.deleted")
      , ("auditLogServiceUnderscoreaccountPeriodcreated", "service_account.created")
      , ("auditLogServiceUnderscoreaccountPeriodupdated", "service_account.updated")
      , ("auditLogServiceUnderscoreaccountPerioddeleted", "service_account.deleted")
      , ("auditLogUserPeriodadded", "user.added")
      , ("auditLogUserPeriodupdated", "user.updated")
      , ("auditLogUserPerioddeleted", "user.deleted")
      ]


-- | The actor who performed the audit logged action.
data AuditLogActor = AuditLogActor
  { auditLogActorType :: Maybe Text -- ^ The type of actor. Is either `session` or `api_key`.
  , auditLogActorSession :: Maybe AuditLogActorSession -- ^ 
  , auditLogActorApiUnderscorekey :: Maybe AuditLogActorApiKey -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogActor where
  parseJSON = genericParseJSON optionsAuditLogActor
instance ToJSON AuditLogActor where
  toJSON = genericToJSON optionsAuditLogActor

optionsAuditLogActor :: Options
optionsAuditLogActor =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogActorType", "type")
      , ("auditLogActorSession", "session")
      , ("auditLogActorApiUnderscorekey", "api_key")
      ]


-- | The API Key used to perform the audit logged action.
data AuditLogActorApiKey = AuditLogActorApiKey
  { auditLogActorApiKeyId :: Maybe Text -- ^ The tracking id of the API key.
  , auditLogActorApiKeyType :: Maybe Text -- ^ The type of API key. Can be either `user` or `service_account`.
  , auditLogActorApiKeyUser :: Maybe AuditLogActorUser -- ^ 
  , auditLogActorApiKeyServiceUnderscoreaccount :: Maybe AuditLogActorServiceAccount -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogActorApiKey where
  parseJSON = genericParseJSON optionsAuditLogActorApiKey
instance ToJSON AuditLogActorApiKey where
  toJSON = genericToJSON optionsAuditLogActorApiKey

optionsAuditLogActorApiKey :: Options
optionsAuditLogActorApiKey =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogActorApiKeyId", "id")
      , ("auditLogActorApiKeyType", "type")
      , ("auditLogActorApiKeyUser", "user")
      , ("auditLogActorApiKeyServiceUnderscoreaccount", "service_account")
      ]


-- | The service account that performed the audit logged action.
data AuditLogActorServiceAccount = AuditLogActorServiceAccount
  { auditLogActorServiceAccountId :: Maybe Text -- ^ The service account id.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogActorServiceAccount where
  parseJSON = genericParseJSON optionsAuditLogActorServiceAccount
instance ToJSON AuditLogActorServiceAccount where
  toJSON = genericToJSON optionsAuditLogActorServiceAccount

optionsAuditLogActorServiceAccount :: Options
optionsAuditLogActorServiceAccount =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogActorServiceAccountId", "id")
      ]


-- | The session in which the audit logged action was performed.
data AuditLogActorSession = AuditLogActorSession
  { auditLogActorSessionUser :: Maybe AuditLogActorUser -- ^ 
  , auditLogActorSessionIpUnderscoreaddress :: Maybe Text -- ^ The IP address from which the action was performed.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogActorSession where
  parseJSON = genericParseJSON optionsAuditLogActorSession
instance ToJSON AuditLogActorSession where
  toJSON = genericToJSON optionsAuditLogActorSession

optionsAuditLogActorSession :: Options
optionsAuditLogActorSession =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogActorSessionUser", "user")
      , ("auditLogActorSessionIpUnderscoreaddress", "ip_address")
      ]


-- | The user who performed the audit logged action.
data AuditLogActorUser = AuditLogActorUser
  { auditLogActorUserId :: Maybe Text -- ^ The user id.
  , auditLogActorUserEmail :: Maybe Text -- ^ The user email.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogActorUser where
  parseJSON = genericParseJSON optionsAuditLogActorUser
instance ToJSON AuditLogActorUser where
  toJSON = genericToJSON optionsAuditLogActorUser

optionsAuditLogActorUser :: Options
optionsAuditLogActorUser =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogActorUserId", "id")
      , ("auditLogActorUserEmail", "email")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogApiKeyCreated = AuditLogApiKeyCreated
  { auditLogApiKeyCreatedId :: Maybe Text -- ^ The tracking ID of the API key.
  , auditLogApiKeyCreatedData :: Maybe AuditLogApiKeyCreatedData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogApiKeyCreated where
  parseJSON = genericParseJSON optionsAuditLogApiKeyCreated
instance ToJSON AuditLogApiKeyCreated where
  toJSON = genericToJSON optionsAuditLogApiKeyCreated

optionsAuditLogApiKeyCreated :: Options
optionsAuditLogApiKeyCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogApiKeyCreatedId", "id")
      , ("auditLogApiKeyCreatedData", "data")
      ]


-- | The payload used to create the API key.
data AuditLogApiKeyCreatedData = AuditLogApiKeyCreatedData
  { auditLogApiKeyCreatedDataScopes :: Maybe [Text] -- ^ A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogApiKeyCreatedData where
  parseJSON = genericParseJSON optionsAuditLogApiKeyCreatedData
instance ToJSON AuditLogApiKeyCreatedData where
  toJSON = genericToJSON optionsAuditLogApiKeyCreatedData

optionsAuditLogApiKeyCreatedData :: Options
optionsAuditLogApiKeyCreatedData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogApiKeyCreatedDataScopes", "scopes")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogApiKeyDeleted = AuditLogApiKeyDeleted
  { auditLogApiKeyDeletedId :: Maybe Text -- ^ The tracking ID of the API key.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogApiKeyDeleted where
  parseJSON = genericParseJSON optionsAuditLogApiKeyDeleted
instance ToJSON AuditLogApiKeyDeleted where
  toJSON = genericToJSON optionsAuditLogApiKeyDeleted

optionsAuditLogApiKeyDeleted :: Options
optionsAuditLogApiKeyDeleted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogApiKeyDeletedId", "id")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogApiKeyUpdated = AuditLogApiKeyUpdated
  { auditLogApiKeyUpdatedId :: Maybe Text -- ^ The tracking ID of the API key.
  , auditLogApiKeyUpdatedChangesUnderscorerequested :: Maybe AuditLogApiKeyUpdatedChangesRequested -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogApiKeyUpdated where
  parseJSON = genericParseJSON optionsAuditLogApiKeyUpdated
instance ToJSON AuditLogApiKeyUpdated where
  toJSON = genericToJSON optionsAuditLogApiKeyUpdated

optionsAuditLogApiKeyUpdated :: Options
optionsAuditLogApiKeyUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogApiKeyUpdatedId", "id")
      , ("auditLogApiKeyUpdatedChangesUnderscorerequested", "changes_requested")
      ]


-- | The payload used to update the API key.
data AuditLogApiKeyUpdatedChangesRequested = AuditLogApiKeyUpdatedChangesRequested
  { auditLogApiKeyUpdatedChangesRequestedScopes :: Maybe [Text] -- ^ A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogApiKeyUpdatedChangesRequested where
  parseJSON = genericParseJSON optionsAuditLogApiKeyUpdatedChangesRequested
instance ToJSON AuditLogApiKeyUpdatedChangesRequested where
  toJSON = genericToJSON optionsAuditLogApiKeyUpdatedChangesRequested

optionsAuditLogApiKeyUpdatedChangesRequested :: Options
optionsAuditLogApiKeyUpdatedChangesRequested =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogApiKeyUpdatedChangesRequestedScopes", "scopes")
      ]


-- | The event type.
data AuditLogEventType = AuditLogEventType
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogEventType where
  parseJSON = genericParseJSON optionsAuditLogEventType
instance ToJSON AuditLogEventType where
  toJSON = genericToJSON optionsAuditLogEventType

optionsAuditLogEventType :: Options
optionsAuditLogEventType =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogInviteAccepted = AuditLogInviteAccepted
  { auditLogInviteAcceptedId :: Maybe Text -- ^ The ID of the invite.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogInviteAccepted where
  parseJSON = genericParseJSON optionsAuditLogInviteAccepted
instance ToJSON AuditLogInviteAccepted where
  toJSON = genericToJSON optionsAuditLogInviteAccepted

optionsAuditLogInviteAccepted :: Options
optionsAuditLogInviteAccepted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogInviteAcceptedId", "id")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogInviteSent = AuditLogInviteSent
  { auditLogInviteSentId :: Maybe Text -- ^ The ID of the invite.
  , auditLogInviteSentData :: Maybe AuditLogInviteSentData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogInviteSent where
  parseJSON = genericParseJSON optionsAuditLogInviteSent
instance ToJSON AuditLogInviteSent where
  toJSON = genericToJSON optionsAuditLogInviteSent

optionsAuditLogInviteSent :: Options
optionsAuditLogInviteSent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogInviteSentId", "id")
      , ("auditLogInviteSentData", "data")
      ]


-- | The payload used to create the invite.
data AuditLogInviteSentData = AuditLogInviteSentData
  { auditLogInviteSentDataEmail :: Maybe Text -- ^ The email invited to the organization.
  , auditLogInviteSentDataRole :: Maybe Text -- ^ The role the email was invited to be. Is either `owner` or `member`.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogInviteSentData where
  parseJSON = genericParseJSON optionsAuditLogInviteSentData
instance ToJSON AuditLogInviteSentData where
  toJSON = genericToJSON optionsAuditLogInviteSentData

optionsAuditLogInviteSentData :: Options
optionsAuditLogInviteSentData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogInviteSentDataEmail", "email")
      , ("auditLogInviteSentDataRole", "role")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogLoginFailed = AuditLogLoginFailed
  { auditLogLoginFailedErrorUnderscorecode :: Maybe Text -- ^ The error code of the failure.
  , auditLogLoginFailedErrorUnderscoremessage :: Maybe Text -- ^ The error message of the failure.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogLoginFailed where
  parseJSON = genericParseJSON optionsAuditLogLoginFailed
instance ToJSON AuditLogLoginFailed where
  toJSON = genericToJSON optionsAuditLogLoginFailed

optionsAuditLogLoginFailed :: Options
optionsAuditLogLoginFailed =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogLoginFailedErrorUnderscorecode", "error_code")
      , ("auditLogLoginFailedErrorUnderscoremessage", "error_message")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogOrganizationUpdated = AuditLogOrganizationUpdated
  { auditLogOrganizationUpdatedId :: Maybe Text -- ^ The organization ID.
  , auditLogOrganizationUpdatedChangesUnderscorerequested :: Maybe AuditLogOrganizationUpdatedChangesRequested -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogOrganizationUpdated where
  parseJSON = genericParseJSON optionsAuditLogOrganizationUpdated
instance ToJSON AuditLogOrganizationUpdated where
  toJSON = genericToJSON optionsAuditLogOrganizationUpdated

optionsAuditLogOrganizationUpdated :: Options
optionsAuditLogOrganizationUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogOrganizationUpdatedId", "id")
      , ("auditLogOrganizationUpdatedChangesUnderscorerequested", "changes_requested")
      ]


-- | The payload used to update the organization settings.
data AuditLogOrganizationUpdatedChangesRequested = AuditLogOrganizationUpdatedChangesRequested
  { auditLogOrganizationUpdatedChangesRequestedTitle :: Maybe Text -- ^ The organization title.
  , auditLogOrganizationUpdatedChangesRequestedDescription :: Maybe Text -- ^ The organization description.
  , auditLogOrganizationUpdatedChangesRequestedName :: Maybe Text -- ^ The organization name.
  , auditLogOrganizationUpdatedChangesRequestedSettings :: Maybe AuditLogOrganizationUpdatedChangesRequestedSettings -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogOrganizationUpdatedChangesRequested where
  parseJSON = genericParseJSON optionsAuditLogOrganizationUpdatedChangesRequested
instance ToJSON AuditLogOrganizationUpdatedChangesRequested where
  toJSON = genericToJSON optionsAuditLogOrganizationUpdatedChangesRequested

optionsAuditLogOrganizationUpdatedChangesRequested :: Options
optionsAuditLogOrganizationUpdatedChangesRequested =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogOrganizationUpdatedChangesRequestedTitle", "title")
      , ("auditLogOrganizationUpdatedChangesRequestedDescription", "description")
      , ("auditLogOrganizationUpdatedChangesRequestedName", "name")
      , ("auditLogOrganizationUpdatedChangesRequestedSettings", "settings")
      ]


-- | 
data AuditLogOrganizationUpdatedChangesRequestedSettings = AuditLogOrganizationUpdatedChangesRequestedSettings
  { auditLogOrganizationUpdatedChangesRequestedSettingsThreadsUnderscoreuiUnderscorevisibility :: Maybe Text -- ^ Visibility of the threads page which shows messages created with the Assistants API and Playground. One of `ANY_ROLE`, `OWNERS`, or `NONE`.
  , auditLogOrganizationUpdatedChangesRequestedSettingsUsageUnderscoredashboardUnderscorevisibility :: Maybe Text -- ^ Visibility of the usage dashboard which shows activity and costs for your organization. One of `ANY_ROLE` or `OWNERS`.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogOrganizationUpdatedChangesRequestedSettings where
  parseJSON = genericParseJSON optionsAuditLogOrganizationUpdatedChangesRequestedSettings
instance ToJSON AuditLogOrganizationUpdatedChangesRequestedSettings where
  toJSON = genericToJSON optionsAuditLogOrganizationUpdatedChangesRequestedSettings

optionsAuditLogOrganizationUpdatedChangesRequestedSettings :: Options
optionsAuditLogOrganizationUpdatedChangesRequestedSettings =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogOrganizationUpdatedChangesRequestedSettingsThreadsUnderscoreuiUnderscorevisibility", "threads_ui_visibility")
      , ("auditLogOrganizationUpdatedChangesRequestedSettingsUsageUnderscoredashboardUnderscorevisibility", "usage_dashboard_visibility")
      ]


-- | The project that the action was scoped to. Absent for actions not scoped to projects.
data AuditLogProject = AuditLogProject
  { auditLogProjectId :: Maybe Text -- ^ The project ID.
  , auditLogProjectName :: Maybe Text -- ^ The project title.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogProject where
  parseJSON = genericParseJSON optionsAuditLogProject
instance ToJSON AuditLogProject where
  toJSON = genericToJSON optionsAuditLogProject

optionsAuditLogProject :: Options
optionsAuditLogProject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogProjectId", "id")
      , ("auditLogProjectName", "name")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogProjectArchived = AuditLogProjectArchived
  { auditLogProjectArchivedId :: Maybe Text -- ^ The project ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogProjectArchived where
  parseJSON = genericParseJSON optionsAuditLogProjectArchived
instance ToJSON AuditLogProjectArchived where
  toJSON = genericToJSON optionsAuditLogProjectArchived

optionsAuditLogProjectArchived :: Options
optionsAuditLogProjectArchived =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogProjectArchivedId", "id")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogProjectCreated = AuditLogProjectCreated
  { auditLogProjectCreatedId :: Maybe Text -- ^ The project ID.
  , auditLogProjectCreatedData :: Maybe AuditLogProjectCreatedData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogProjectCreated where
  parseJSON = genericParseJSON optionsAuditLogProjectCreated
instance ToJSON AuditLogProjectCreated where
  toJSON = genericToJSON optionsAuditLogProjectCreated

optionsAuditLogProjectCreated :: Options
optionsAuditLogProjectCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogProjectCreatedId", "id")
      , ("auditLogProjectCreatedData", "data")
      ]


-- | The payload used to create the project.
data AuditLogProjectCreatedData = AuditLogProjectCreatedData
  { auditLogProjectCreatedDataName :: Maybe Text -- ^ The project name.
  , auditLogProjectCreatedDataTitle :: Maybe Text -- ^ The title of the project as seen on the dashboard.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogProjectCreatedData where
  parseJSON = genericParseJSON optionsAuditLogProjectCreatedData
instance ToJSON AuditLogProjectCreatedData where
  toJSON = genericToJSON optionsAuditLogProjectCreatedData

optionsAuditLogProjectCreatedData :: Options
optionsAuditLogProjectCreatedData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogProjectCreatedDataName", "name")
      , ("auditLogProjectCreatedDataTitle", "title")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogProjectUpdated = AuditLogProjectUpdated
  { auditLogProjectUpdatedId :: Maybe Text -- ^ The project ID.
  , auditLogProjectUpdatedChangesUnderscorerequested :: Maybe AuditLogProjectUpdatedChangesRequested -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogProjectUpdated where
  parseJSON = genericParseJSON optionsAuditLogProjectUpdated
instance ToJSON AuditLogProjectUpdated where
  toJSON = genericToJSON optionsAuditLogProjectUpdated

optionsAuditLogProjectUpdated :: Options
optionsAuditLogProjectUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogProjectUpdatedId", "id")
      , ("auditLogProjectUpdatedChangesUnderscorerequested", "changes_requested")
      ]


-- | The payload used to update the project.
data AuditLogProjectUpdatedChangesRequested = AuditLogProjectUpdatedChangesRequested
  { auditLogProjectUpdatedChangesRequestedTitle :: Maybe Text -- ^ The title of the project as seen on the dashboard.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogProjectUpdatedChangesRequested where
  parseJSON = genericParseJSON optionsAuditLogProjectUpdatedChangesRequested
instance ToJSON AuditLogProjectUpdatedChangesRequested where
  toJSON = genericToJSON optionsAuditLogProjectUpdatedChangesRequested

optionsAuditLogProjectUpdatedChangesRequested :: Options
optionsAuditLogProjectUpdatedChangesRequested =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogProjectUpdatedChangesRequestedTitle", "title")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogRateLimitDeleted = AuditLogRateLimitDeleted
  { auditLogRateLimitDeletedId :: Maybe Text -- ^ The rate limit ID
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogRateLimitDeleted where
  parseJSON = genericParseJSON optionsAuditLogRateLimitDeleted
instance ToJSON AuditLogRateLimitDeleted where
  toJSON = genericToJSON optionsAuditLogRateLimitDeleted

optionsAuditLogRateLimitDeleted :: Options
optionsAuditLogRateLimitDeleted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogRateLimitDeletedId", "id")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogRateLimitUpdated = AuditLogRateLimitUpdated
  { auditLogRateLimitUpdatedId :: Maybe Text -- ^ The rate limit ID
  , auditLogRateLimitUpdatedChangesUnderscorerequested :: Maybe AuditLogRateLimitUpdatedChangesRequested -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogRateLimitUpdated where
  parseJSON = genericParseJSON optionsAuditLogRateLimitUpdated
instance ToJSON AuditLogRateLimitUpdated where
  toJSON = genericToJSON optionsAuditLogRateLimitUpdated

optionsAuditLogRateLimitUpdated :: Options
optionsAuditLogRateLimitUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogRateLimitUpdatedId", "id")
      , ("auditLogRateLimitUpdatedChangesUnderscorerequested", "changes_requested")
      ]


-- | The payload used to update the rate limits.
data AuditLogRateLimitUpdatedChangesRequested = AuditLogRateLimitUpdatedChangesRequested
  { auditLogRateLimitUpdatedChangesRequestedMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum requests per minute.
  , auditLogRateLimitUpdatedChangesRequestedMaxUnderscoretokensUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum tokens per minute.
  , auditLogRateLimitUpdatedChangesRequestedMaxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum images per minute. Only relevant for certain models.
  , auditLogRateLimitUpdatedChangesRequestedMaxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum audio megabytes per minute. Only relevant for certain models.
  , auditLogRateLimitUpdatedChangesRequestedMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreday :: Maybe Int -- ^ The maximum requests per day. Only relevant for certain models.
  , auditLogRateLimitUpdatedChangesRequestedBatchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens :: Maybe Int -- ^ The maximum batch input tokens per day. Only relevant for certain models.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogRateLimitUpdatedChangesRequested where
  parseJSON = genericParseJSON optionsAuditLogRateLimitUpdatedChangesRequested
instance ToJSON AuditLogRateLimitUpdatedChangesRequested where
  toJSON = genericToJSON optionsAuditLogRateLimitUpdatedChangesRequested

optionsAuditLogRateLimitUpdatedChangesRequested :: Options
optionsAuditLogRateLimitUpdatedChangesRequested =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogRateLimitUpdatedChangesRequestedMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute", "max_requests_per_1_minute")
      , ("auditLogRateLimitUpdatedChangesRequestedMaxUnderscoretokensUnderscoreperUnderscore1Underscoreminute", "max_tokens_per_1_minute")
      , ("auditLogRateLimitUpdatedChangesRequestedMaxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute", "max_images_per_1_minute")
      , ("auditLogRateLimitUpdatedChangesRequestedMaxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute", "max_audio_megabytes_per_1_minute")
      , ("auditLogRateLimitUpdatedChangesRequestedMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreday", "max_requests_per_1_day")
      , ("auditLogRateLimitUpdatedChangesRequestedBatchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens", "batch_1_day_max_input_tokens")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogServiceAccountCreated = AuditLogServiceAccountCreated
  { auditLogServiceAccountCreatedId :: Maybe Text -- ^ The service account ID.
  , auditLogServiceAccountCreatedData :: Maybe AuditLogServiceAccountCreatedData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogServiceAccountCreated where
  parseJSON = genericParseJSON optionsAuditLogServiceAccountCreated
instance ToJSON AuditLogServiceAccountCreated where
  toJSON = genericToJSON optionsAuditLogServiceAccountCreated

optionsAuditLogServiceAccountCreated :: Options
optionsAuditLogServiceAccountCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogServiceAccountCreatedId", "id")
      , ("auditLogServiceAccountCreatedData", "data")
      ]


-- | The payload used to create the service account.
data AuditLogServiceAccountCreatedData = AuditLogServiceAccountCreatedData
  { auditLogServiceAccountCreatedDataRole :: Maybe Text -- ^ The role of the service account. Is either `owner` or `member`.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogServiceAccountCreatedData where
  parseJSON = genericParseJSON optionsAuditLogServiceAccountCreatedData
instance ToJSON AuditLogServiceAccountCreatedData where
  toJSON = genericToJSON optionsAuditLogServiceAccountCreatedData

optionsAuditLogServiceAccountCreatedData :: Options
optionsAuditLogServiceAccountCreatedData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogServiceAccountCreatedDataRole", "role")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogServiceAccountDeleted = AuditLogServiceAccountDeleted
  { auditLogServiceAccountDeletedId :: Maybe Text -- ^ The service account ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogServiceAccountDeleted where
  parseJSON = genericParseJSON optionsAuditLogServiceAccountDeleted
instance ToJSON AuditLogServiceAccountDeleted where
  toJSON = genericToJSON optionsAuditLogServiceAccountDeleted

optionsAuditLogServiceAccountDeleted :: Options
optionsAuditLogServiceAccountDeleted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogServiceAccountDeletedId", "id")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogServiceAccountUpdated = AuditLogServiceAccountUpdated
  { auditLogServiceAccountUpdatedId :: Maybe Text -- ^ The service account ID.
  , auditLogServiceAccountUpdatedChangesUnderscorerequested :: Maybe AuditLogServiceAccountUpdatedChangesRequested -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogServiceAccountUpdated where
  parseJSON = genericParseJSON optionsAuditLogServiceAccountUpdated
instance ToJSON AuditLogServiceAccountUpdated where
  toJSON = genericToJSON optionsAuditLogServiceAccountUpdated

optionsAuditLogServiceAccountUpdated :: Options
optionsAuditLogServiceAccountUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogServiceAccountUpdatedId", "id")
      , ("auditLogServiceAccountUpdatedChangesUnderscorerequested", "changes_requested")
      ]


-- | The payload used to updated the service account.
data AuditLogServiceAccountUpdatedChangesRequested = AuditLogServiceAccountUpdatedChangesRequested
  { auditLogServiceAccountUpdatedChangesRequestedRole :: Maybe Text -- ^ The role of the service account. Is either `owner` or `member`.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogServiceAccountUpdatedChangesRequested where
  parseJSON = genericParseJSON optionsAuditLogServiceAccountUpdatedChangesRequested
instance ToJSON AuditLogServiceAccountUpdatedChangesRequested where
  toJSON = genericToJSON optionsAuditLogServiceAccountUpdatedChangesRequested

optionsAuditLogServiceAccountUpdatedChangesRequested :: Options
optionsAuditLogServiceAccountUpdatedChangesRequested =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogServiceAccountUpdatedChangesRequestedRole", "role")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogUserAdded = AuditLogUserAdded
  { auditLogUserAddedId :: Maybe Text -- ^ The user ID.
  , auditLogUserAddedData :: Maybe AuditLogUserAddedData -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogUserAdded where
  parseJSON = genericParseJSON optionsAuditLogUserAdded
instance ToJSON AuditLogUserAdded where
  toJSON = genericToJSON optionsAuditLogUserAdded

optionsAuditLogUserAdded :: Options
optionsAuditLogUserAdded =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogUserAddedId", "id")
      , ("auditLogUserAddedData", "data")
      ]


-- | The payload used to add the user to the project.
data AuditLogUserAddedData = AuditLogUserAddedData
  { auditLogUserAddedDataRole :: Maybe Text -- ^ The role of the user. Is either `owner` or `member`.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogUserAddedData where
  parseJSON = genericParseJSON optionsAuditLogUserAddedData
instance ToJSON AuditLogUserAddedData where
  toJSON = genericToJSON optionsAuditLogUserAddedData

optionsAuditLogUserAddedData :: Options
optionsAuditLogUserAddedData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogUserAddedDataRole", "role")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogUserDeleted = AuditLogUserDeleted
  { auditLogUserDeletedId :: Maybe Text -- ^ The user ID.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogUserDeleted where
  parseJSON = genericParseJSON optionsAuditLogUserDeleted
instance ToJSON AuditLogUserDeleted where
  toJSON = genericToJSON optionsAuditLogUserDeleted

optionsAuditLogUserDeleted :: Options
optionsAuditLogUserDeleted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogUserDeletedId", "id")
      ]


-- | The details for events with this &#x60;type&#x60;.
data AuditLogUserUpdated = AuditLogUserUpdated
  { auditLogUserUpdatedId :: Maybe Text -- ^ The project ID.
  , auditLogUserUpdatedChangesUnderscorerequested :: Maybe AuditLogUserUpdatedChangesRequested -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogUserUpdated where
  parseJSON = genericParseJSON optionsAuditLogUserUpdated
instance ToJSON AuditLogUserUpdated where
  toJSON = genericToJSON optionsAuditLogUserUpdated

optionsAuditLogUserUpdated :: Options
optionsAuditLogUserUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogUserUpdatedId", "id")
      , ("auditLogUserUpdatedChangesUnderscorerequested", "changes_requested")
      ]


-- | The payload used to update the user.
data AuditLogUserUpdatedChangesRequested = AuditLogUserUpdatedChangesRequested
  { auditLogUserUpdatedChangesRequestedRole :: Maybe Text -- ^ The role of the user. Is either `owner` or `member`.
  } deriving (Show, Eq, Generic)

instance FromJSON AuditLogUserUpdatedChangesRequested where
  parseJSON = genericParseJSON optionsAuditLogUserUpdatedChangesRequested
instance ToJSON AuditLogUserUpdatedChangesRequested where
  toJSON = genericToJSON optionsAuditLogUserUpdatedChangesRequested

optionsAuditLogUserUpdatedChangesRequested :: Options
optionsAuditLogUserUpdatedChangesRequested =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("auditLogUserUpdatedChangesRequestedRole", "role")
      ]


-- | The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
data AutoChunkingStrategy = AutoChunkingStrategy
  { autoChunkingStrategyType :: Text -- ^ Always `auto`.
  } deriving (Show, Eq, Generic)

instance FromJSON AutoChunkingStrategy where
  parseJSON = genericParseJSON optionsAutoChunkingStrategy
instance ToJSON AutoChunkingStrategy where
  toJSON = genericToJSON optionsAutoChunkingStrategy

optionsAutoChunkingStrategy :: Options
optionsAutoChunkingStrategy =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("autoChunkingStrategyType", "type")
      ]


-- | The default strategy. This strategy currently uses a &#x60;max_chunk_size_tokens&#x60; of &#x60;800&#x60; and &#x60;chunk_overlap_tokens&#x60; of &#x60;400&#x60;.
data AutoChunkingStrategyRequestParam = AutoChunkingStrategyRequestParam
  { autoChunkingStrategyRequestParamType :: Text -- ^ Always `auto`.
  } deriving (Show, Eq, Generic)

instance FromJSON AutoChunkingStrategyRequestParam where
  parseJSON = genericParseJSON optionsAutoChunkingStrategyRequestParam
instance ToJSON AutoChunkingStrategyRequestParam where
  toJSON = genericToJSON optionsAutoChunkingStrategyRequestParam

optionsAutoChunkingStrategyRequestParam :: Options
optionsAutoChunkingStrategyRequestParam =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("autoChunkingStrategyRequestParamType", "type")
      ]


-- | 
data Batch = Batch
  { batchId :: Text -- ^ 
  , batchObject :: Text -- ^ The object type, which is always `batch`.
  , batchEndpoint :: Text -- ^ The OpenAI API endpoint used by the batch.
  , batchErrors :: Maybe BatchErrors -- ^ 
  , batchInputUnderscorefileUnderscoreid :: Text -- ^ The ID of the input file for the batch.
  , batchCompletionUnderscorewindow :: Text -- ^ The time frame within which the batch should be processed.
  , batchStatus :: Text -- ^ The current status of the batch.
  , batchOutputUnderscorefileUnderscoreid :: Maybe Text -- ^ The ID of the file containing the outputs of successfully executed requests.
  , batchErrorUnderscorefileUnderscoreid :: Maybe Text -- ^ The ID of the file containing the outputs of requests with errors.
  , batchCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the batch was created.
  , batchInUnderscoreprogressUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch started processing.
  , batchExpiresUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch will expire.
  , batchFinalizingUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch started finalizing.
  , batchCompletedUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch was completed.
  , batchFailedUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch failed.
  , batchExpiredUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch expired.
  , batchCancellingUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch started cancelling.
  , batchCancelledUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the batch was cancelled.
  , batchRequestUnderscorecounts :: Maybe BatchRequestCounts -- ^ 
  , batchMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON Batch where
  parseJSON = genericParseJSON optionsBatch
instance ToJSON Batch where
  toJSON = genericToJSON optionsBatch

optionsBatch :: Options
optionsBatch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchId", "id")
      , ("batchObject", "object")
      , ("batchEndpoint", "endpoint")
      , ("batchErrors", "errors")
      , ("batchInputUnderscorefileUnderscoreid", "input_file_id")
      , ("batchCompletionUnderscorewindow", "completion_window")
      , ("batchStatus", "status")
      , ("batchOutputUnderscorefileUnderscoreid", "output_file_id")
      , ("batchErrorUnderscorefileUnderscoreid", "error_file_id")
      , ("batchCreatedUnderscoreat", "created_at")
      , ("batchInUnderscoreprogressUnderscoreat", "in_progress_at")
      , ("batchExpiresUnderscoreat", "expires_at")
      , ("batchFinalizingUnderscoreat", "finalizing_at")
      , ("batchCompletedUnderscoreat", "completed_at")
      , ("batchFailedUnderscoreat", "failed_at")
      , ("batchExpiredUnderscoreat", "expired_at")
      , ("batchCancellingUnderscoreat", "cancelling_at")
      , ("batchCancelledUnderscoreat", "cancelled_at")
      , ("batchRequestUnderscorecounts", "request_counts")
      , ("batchMetadata", "metadata")
      ]


-- | 
data BatchErrors = BatchErrors
  { batchErrorsObject :: Maybe Text -- ^ The object type, which is always `list`.
  , batchErrorsData :: Maybe [BatchErrorsDataInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BatchErrors where
  parseJSON = genericParseJSON optionsBatchErrors
instance ToJSON BatchErrors where
  toJSON = genericToJSON optionsBatchErrors

optionsBatchErrors :: Options
optionsBatchErrors =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchErrorsObject", "object")
      , ("batchErrorsData", "data")
      ]


-- | 
data BatchErrorsDataInner = BatchErrorsDataInner
  { batchErrorsDataInnerCode :: Maybe Text -- ^ An error code identifying the error type.
  , batchErrorsDataInnerMessage :: Maybe Text -- ^ A human-readable message providing more details about the error.
  , batchErrorsDataInnerParam :: Maybe Text -- ^ The name of the parameter that caused the error, if applicable.
  , batchErrorsDataInnerLine :: Maybe Int -- ^ The line number of the input file where the error occurred, if applicable.
  } deriving (Show, Eq, Generic)

instance FromJSON BatchErrorsDataInner where
  parseJSON = genericParseJSON optionsBatchErrorsDataInner
instance ToJSON BatchErrorsDataInner where
  toJSON = genericToJSON optionsBatchErrorsDataInner

optionsBatchErrorsDataInner :: Options
optionsBatchErrorsDataInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchErrorsDataInnerCode", "code")
      , ("batchErrorsDataInnerMessage", "message")
      , ("batchErrorsDataInnerParam", "param")
      , ("batchErrorsDataInnerLine", "line")
      ]


-- | The request counts for different statuses within the batch.
data BatchRequestCounts = BatchRequestCounts
  { batchRequestCountsTotal :: Int -- ^ Total number of requests in the batch.
  , batchRequestCountsCompleted :: Int -- ^ Number of requests that have been completed successfully.
  , batchRequestCountsFailed :: Int -- ^ Number of requests that have failed.
  } deriving (Show, Eq, Generic)

instance FromJSON BatchRequestCounts where
  parseJSON = genericParseJSON optionsBatchRequestCounts
instance ToJSON BatchRequestCounts where
  toJSON = genericToJSON optionsBatchRequestCounts

optionsBatchRequestCounts :: Options
optionsBatchRequestCounts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchRequestCountsTotal", "total")
      , ("batchRequestCountsCompleted", "completed")
      , ("batchRequestCountsFailed", "failed")
      ]


-- | The per-line object of the batch input file
data BatchRequestInput = BatchRequestInput
  { batchRequestInputCustomUnderscoreid :: Maybe Text -- ^ A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
  , batchRequestInputMethod :: Maybe Text -- ^ The HTTP method to be used for the request. Currently only `POST` is supported.
  , batchRequestInputUrl :: Maybe Text -- ^ The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
  } deriving (Show, Eq, Generic)

instance FromJSON BatchRequestInput where
  parseJSON = genericParseJSON optionsBatchRequestInput
instance ToJSON BatchRequestInput where
  toJSON = genericToJSON optionsBatchRequestInput

optionsBatchRequestInput :: Options
optionsBatchRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchRequestInputCustomUnderscoreid", "custom_id")
      , ("batchRequestInputMethod", "method")
      , ("batchRequestInputUrl", "url")
      ]


-- | The per-line object of the batch output and error files
data BatchRequestOutput = BatchRequestOutput
  { batchRequestOutputId :: Maybe Text -- ^ 
  , batchRequestOutputCustomUnderscoreid :: Maybe Text -- ^ A developer-provided per-request id that will be used to match outputs to inputs.
  , batchRequestOutputResponse :: Maybe BatchRequestOutputResponse -- ^ 
  , batchRequestOutputError :: Maybe BatchRequestOutputError -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON BatchRequestOutput where
  parseJSON = genericParseJSON optionsBatchRequestOutput
instance ToJSON BatchRequestOutput where
  toJSON = genericToJSON optionsBatchRequestOutput

optionsBatchRequestOutput :: Options
optionsBatchRequestOutput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchRequestOutputId", "id")
      , ("batchRequestOutputCustomUnderscoreid", "custom_id")
      , ("batchRequestOutputResponse", "response")
      , ("batchRequestOutputError", "error")
      ]


-- | For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
data BatchRequestOutputError = BatchRequestOutputError
  { batchRequestOutputErrorCode :: Maybe Text -- ^ A machine-readable error code.
  , batchRequestOutputErrorMessage :: Maybe Text -- ^ A human-readable error message.
  } deriving (Show, Eq, Generic)

instance FromJSON BatchRequestOutputError where
  parseJSON = genericParseJSON optionsBatchRequestOutputError
instance ToJSON BatchRequestOutputError where
  toJSON = genericToJSON optionsBatchRequestOutputError

optionsBatchRequestOutputError :: Options
optionsBatchRequestOutputError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchRequestOutputErrorCode", "code")
      , ("batchRequestOutputErrorMessage", "message")
      ]


-- | 
data BatchRequestOutputResponse = BatchRequestOutputResponse
  { batchRequestOutputResponseStatusUnderscorecode :: Maybe Int -- ^ The HTTP status code of the response
  , batchRequestOutputResponseRequestUnderscoreid :: Maybe Text -- ^ An unique identifier for the OpenAI API request. Please include this request ID when contacting support.
  , batchRequestOutputResponseBody :: Maybe Object -- ^ The JSON body of the response
  } deriving (Show, Eq, Generic)

instance FromJSON BatchRequestOutputResponse where
  parseJSON = genericParseJSON optionsBatchRequestOutputResponse
instance ToJSON BatchRequestOutputResponse where
  toJSON = genericToJSON optionsBatchRequestOutputResponse

optionsBatchRequestOutputResponse :: Options
optionsBatchRequestOutputResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("batchRequestOutputResponseStatusUnderscorecode", "status_code")
      , ("batchRequestOutputResponseRequestUnderscoreid", "request_id")
      , ("batchRequestOutputResponseBody", "body")
      ]


-- | Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function. 
data ChatCompletionFunctionCallOption = ChatCompletionFunctionCallOption
  { chatCompletionFunctionCallOptionName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionFunctionCallOption where
  parseJSON = genericParseJSON optionsChatCompletionFunctionCallOption
instance ToJSON ChatCompletionFunctionCallOption where
  toJSON = genericToJSON optionsChatCompletionFunctionCallOption

optionsChatCompletionFunctionCallOption :: Options
optionsChatCompletionFunctionCallOption =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionFunctionCallOptionName", "name")
      ]


-- | 
data ChatCompletionFunctions = ChatCompletionFunctions
  { chatCompletionFunctionsDescription :: Maybe Text -- ^ A description of what the function does, used by the model to choose when and how to call the function.
  , chatCompletionFunctionsName :: Text -- ^ The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  , chatCompletionFunctionsParameters :: Maybe (Map.Map String Value) -- ^ The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionFunctions where
  parseJSON = genericParseJSON optionsChatCompletionFunctions
instance ToJSON ChatCompletionFunctions where
  toJSON = genericToJSON optionsChatCompletionFunctions

optionsChatCompletionFunctions :: Options
optionsChatCompletionFunctions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionFunctionsDescription", "description")
      , ("chatCompletionFunctionsName", "name")
      , ("chatCompletionFunctionsParameters", "parameters")
      ]


-- | 
data ChatCompletionMessageToolCall = ChatCompletionMessageToolCall
  { chatCompletionMessageToolCallId :: Text -- ^ The ID of the tool call.
  , chatCompletionMessageToolCallType :: Text -- ^ The type of the tool. Currently, only `function` is supported.
  , chatCompletionMessageToolCallFunction :: ChatCompletionMessageToolCallFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionMessageToolCall where
  parseJSON = genericParseJSON optionsChatCompletionMessageToolCall
instance ToJSON ChatCompletionMessageToolCall where
  toJSON = genericToJSON optionsChatCompletionMessageToolCall

optionsChatCompletionMessageToolCall :: Options
optionsChatCompletionMessageToolCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionMessageToolCallId", "id")
      , ("chatCompletionMessageToolCallType", "type")
      , ("chatCompletionMessageToolCallFunction", "function")
      ]


-- | 
data ChatCompletionMessageToolCallChunk = ChatCompletionMessageToolCallChunk
  { chatCompletionMessageToolCallChunkIndex :: Int -- ^ 
  , chatCompletionMessageToolCallChunkId :: Maybe Text -- ^ The ID of the tool call.
  , chatCompletionMessageToolCallChunkType :: Maybe Text -- ^ The type of the tool. Currently, only `function` is supported.
  , chatCompletionMessageToolCallChunkFunction :: Maybe ChatCompletionMessageToolCallChunkFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionMessageToolCallChunk where
  parseJSON = genericParseJSON optionsChatCompletionMessageToolCallChunk
instance ToJSON ChatCompletionMessageToolCallChunk where
  toJSON = genericToJSON optionsChatCompletionMessageToolCallChunk

optionsChatCompletionMessageToolCallChunk :: Options
optionsChatCompletionMessageToolCallChunk =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionMessageToolCallChunkIndex", "index")
      , ("chatCompletionMessageToolCallChunkId", "id")
      , ("chatCompletionMessageToolCallChunkType", "type")
      , ("chatCompletionMessageToolCallChunkFunction", "function")
      ]


-- | 
data ChatCompletionMessageToolCallChunkFunction = ChatCompletionMessageToolCallChunkFunction
  { chatCompletionMessageToolCallChunkFunctionName :: Maybe Text -- ^ The name of the function to call.
  , chatCompletionMessageToolCallChunkFunctionArguments :: Maybe Text -- ^ The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionMessageToolCallChunkFunction where
  parseJSON = genericParseJSON optionsChatCompletionMessageToolCallChunkFunction
instance ToJSON ChatCompletionMessageToolCallChunkFunction where
  toJSON = genericToJSON optionsChatCompletionMessageToolCallChunkFunction

optionsChatCompletionMessageToolCallChunkFunction :: Options
optionsChatCompletionMessageToolCallChunkFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionMessageToolCallChunkFunctionName", "name")
      , ("chatCompletionMessageToolCallChunkFunctionArguments", "arguments")
      ]


-- | The function that the model called.
data ChatCompletionMessageToolCallFunction = ChatCompletionMessageToolCallFunction
  { chatCompletionMessageToolCallFunctionName :: Text -- ^ The name of the function to call.
  , chatCompletionMessageToolCallFunctionArguments :: Text -- ^ The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionMessageToolCallFunction where
  parseJSON = genericParseJSON optionsChatCompletionMessageToolCallFunction
instance ToJSON ChatCompletionMessageToolCallFunction where
  toJSON = genericToJSON optionsChatCompletionMessageToolCallFunction

optionsChatCompletionMessageToolCallFunction :: Options
optionsChatCompletionMessageToolCallFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionMessageToolCallFunctionName", "name")
      , ("chatCompletionMessageToolCallFunctionArguments", "arguments")
      ]


-- | Specifies a tool the model should use. Use to force the model to call a specific function.
data ChatCompletionNamedToolChoice = ChatCompletionNamedToolChoice
  { chatCompletionNamedToolChoiceType :: Text -- ^ The type of the tool. Currently, only `function` is supported.
  , chatCompletionNamedToolChoiceFunction :: AssistantsNamedToolChoiceFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionNamedToolChoice where
  parseJSON = genericParseJSON optionsChatCompletionNamedToolChoice
instance ToJSON ChatCompletionNamedToolChoice where
  toJSON = genericToJSON optionsChatCompletionNamedToolChoice

optionsChatCompletionNamedToolChoice :: Options
optionsChatCompletionNamedToolChoice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionNamedToolChoiceType", "type")
      , ("chatCompletionNamedToolChoiceFunction", "function")
      ]


-- | Messages sent by the model in response to user messages. 
data ChatCompletionRequestAssistantMessage = ChatCompletionRequestAssistantMessage
  { chatCompletionRequestAssistantMessageContent :: Maybe ChatCompletionRequestAssistantMessageContent -- ^ 
  , chatCompletionRequestAssistantMessageRefusal :: Maybe Text -- ^ The refusal message by the assistant.
  , chatCompletionRequestAssistantMessageRole :: Text -- ^ The role of the messages author, in this case `assistant`.
  , chatCompletionRequestAssistantMessageName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  , chatCompletionRequestAssistantMessageAudio :: Maybe ChatCompletionRequestAssistantMessageAudio -- ^ 
  , chatCompletionRequestAssistantMessageToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , chatCompletionRequestAssistantMessageFunctionUnderscorecall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestAssistantMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestAssistantMessage
instance ToJSON ChatCompletionRequestAssistantMessage where
  toJSON = genericToJSON optionsChatCompletionRequestAssistantMessage

optionsChatCompletionRequestAssistantMessage :: Options
optionsChatCompletionRequestAssistantMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestAssistantMessageContent", "content")
      , ("chatCompletionRequestAssistantMessageRefusal", "refusal")
      , ("chatCompletionRequestAssistantMessageRole", "role")
      , ("chatCompletionRequestAssistantMessageName", "name")
      , ("chatCompletionRequestAssistantMessageAudio", "audio")
      , ("chatCompletionRequestAssistantMessageToolUnderscorecalls", "tool_calls")
      , ("chatCompletionRequestAssistantMessageFunctionUnderscorecall", "function_call")
      ]


-- | Data about a previous audio response from the model.  [Learn more](/docs/guides/audio). 
data ChatCompletionRequestAssistantMessageAudio = ChatCompletionRequestAssistantMessageAudio
  { chatCompletionRequestAssistantMessageAudioId :: Text -- ^ Unique identifier for a previous audio response from the model. 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestAssistantMessageAudio where
  parseJSON = genericParseJSON optionsChatCompletionRequestAssistantMessageAudio
instance ToJSON ChatCompletionRequestAssistantMessageAudio where
  toJSON = genericToJSON optionsChatCompletionRequestAssistantMessageAudio

optionsChatCompletionRequestAssistantMessageAudio :: Options
optionsChatCompletionRequestAssistantMessageAudio =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestAssistantMessageAudioId", "id")
      ]


-- | The contents of the assistant message. Required unless &#x60;tool_calls&#x60; or &#x60;function_call&#x60; is specified. 
data ChatCompletionRequestAssistantMessageContent = ChatCompletionRequestAssistantMessageContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestAssistantMessageContent where
  parseJSON = genericParseJSON optionsChatCompletionRequestAssistantMessageContent
instance ToJSON ChatCompletionRequestAssistantMessageContent where
  toJSON = genericToJSON optionsChatCompletionRequestAssistantMessageContent

optionsChatCompletionRequestAssistantMessageContent :: Options
optionsChatCompletionRequestAssistantMessageContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ChatCompletionRequestAssistantMessageContentPart = ChatCompletionRequestAssistantMessageContentPart
  { chatCompletionRequestAssistantMessageContentPartType :: Text -- ^ The type of the content part.
  , chatCompletionRequestAssistantMessageContentPartText :: Text -- ^ The text content.
  , chatCompletionRequestAssistantMessageContentPartRefusal :: Text -- ^ The refusal message generated by the model.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestAssistantMessageContentPart where
  parseJSON = genericParseJSON optionsChatCompletionRequestAssistantMessageContentPart
instance ToJSON ChatCompletionRequestAssistantMessageContentPart where
  toJSON = genericToJSON optionsChatCompletionRequestAssistantMessageContentPart

optionsChatCompletionRequestAssistantMessageContentPart :: Options
optionsChatCompletionRequestAssistantMessageContentPart =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestAssistantMessageContentPartType", "type")
      , ("chatCompletionRequestAssistantMessageContentPartText", "text")
      , ("chatCompletionRequestAssistantMessageContentPartRefusal", "refusal")
      ]


-- | Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
data ChatCompletionRequestAssistantMessageFunctionCall = ChatCompletionRequestAssistantMessageFunctionCall
  { chatCompletionRequestAssistantMessageFunctionCallArguments :: Text -- ^ The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  , chatCompletionRequestAssistantMessageFunctionCallName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestAssistantMessageFunctionCall where
  parseJSON = genericParseJSON optionsChatCompletionRequestAssistantMessageFunctionCall
instance ToJSON ChatCompletionRequestAssistantMessageFunctionCall where
  toJSON = genericToJSON optionsChatCompletionRequestAssistantMessageFunctionCall

optionsChatCompletionRequestAssistantMessageFunctionCall :: Options
optionsChatCompletionRequestAssistantMessageFunctionCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestAssistantMessageFunctionCallArguments", "arguments")
      , ("chatCompletionRequestAssistantMessageFunctionCallName", "name")
      ]


-- | Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, &#x60;developer&#x60; messages replace the previous &#x60;system&#x60; messages. 
data ChatCompletionRequestDeveloperMessage = ChatCompletionRequestDeveloperMessage
  { chatCompletionRequestDeveloperMessageContent :: ChatCompletionRequestDeveloperMessageContent -- ^ 
  , chatCompletionRequestDeveloperMessageRole :: Text -- ^ The role of the messages author, in this case `developer`.
  , chatCompletionRequestDeveloperMessageName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestDeveloperMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestDeveloperMessage
instance ToJSON ChatCompletionRequestDeveloperMessage where
  toJSON = genericToJSON optionsChatCompletionRequestDeveloperMessage

optionsChatCompletionRequestDeveloperMessage :: Options
optionsChatCompletionRequestDeveloperMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestDeveloperMessageContent", "content")
      , ("chatCompletionRequestDeveloperMessageRole", "role")
      , ("chatCompletionRequestDeveloperMessageName", "name")
      ]


-- | The contents of the developer message.
data ChatCompletionRequestDeveloperMessageContent = ChatCompletionRequestDeveloperMessageContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestDeveloperMessageContent where
  parseJSON = genericParseJSON optionsChatCompletionRequestDeveloperMessageContent
instance ToJSON ChatCompletionRequestDeveloperMessageContent where
  toJSON = genericToJSON optionsChatCompletionRequestDeveloperMessageContent

optionsChatCompletionRequestDeveloperMessageContent :: Options
optionsChatCompletionRequestDeveloperMessageContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ChatCompletionRequestFunctionMessage = ChatCompletionRequestFunctionMessage
  { chatCompletionRequestFunctionMessageRole :: Text -- ^ The role of the messages author, in this case `function`.
  , chatCompletionRequestFunctionMessageContent :: Text -- ^ The contents of the function message.
  , chatCompletionRequestFunctionMessageName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestFunctionMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestFunctionMessage
instance ToJSON ChatCompletionRequestFunctionMessage where
  toJSON = genericToJSON optionsChatCompletionRequestFunctionMessage

optionsChatCompletionRequestFunctionMessage :: Options
optionsChatCompletionRequestFunctionMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestFunctionMessageRole", "role")
      , ("chatCompletionRequestFunctionMessageContent", "content")
      , ("chatCompletionRequestFunctionMessageName", "name")
      ]


-- | 
data ChatCompletionRequestMessage = ChatCompletionRequestMessage
  { chatCompletionRequestMessageContent :: Text -- ^ The contents of the function message.
  , chatCompletionRequestMessageRole :: Text -- ^ The role of the messages author, in this case `function`.
  , chatCompletionRequestMessageName :: Text -- ^ The name of the function to call.
  , chatCompletionRequestMessageRefusal :: Maybe Text -- ^ The refusal message by the assistant.
  , chatCompletionRequestMessageAudio :: Maybe ChatCompletionRequestAssistantMessageAudio -- ^ 
  , chatCompletionRequestMessageToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , chatCompletionRequestMessageFunctionUnderscorecall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall -- ^ 
  , chatCompletionRequestMessageToolUnderscorecallUnderscoreid :: Text -- ^ Tool call that this message is responding to.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessage
instance ToJSON ChatCompletionRequestMessage where
  toJSON = genericToJSON optionsChatCompletionRequestMessage

optionsChatCompletionRequestMessage :: Options
optionsChatCompletionRequestMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContent", "content")
      , ("chatCompletionRequestMessageRole", "role")
      , ("chatCompletionRequestMessageName", "name")
      , ("chatCompletionRequestMessageRefusal", "refusal")
      , ("chatCompletionRequestMessageAudio", "audio")
      , ("chatCompletionRequestMessageToolUnderscorecalls", "tool_calls")
      , ("chatCompletionRequestMessageFunctionUnderscorecall", "function_call")
      , ("chatCompletionRequestMessageToolUnderscorecallUnderscoreid", "tool_call_id")
      ]


-- | Learn about [audio inputs](/docs/guides/audio). 
data ChatCompletionRequestMessageContentPartAudio = ChatCompletionRequestMessageContentPartAudio
  { chatCompletionRequestMessageContentPartAudioType :: Text -- ^ The type of the content part. Always `input_audio`.
  , chatCompletionRequestMessageContentPartAudioInputUnderscoreaudio :: ChatCompletionRequestMessageContentPartAudioInputAudio -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPartAudio where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPartAudio
instance ToJSON ChatCompletionRequestMessageContentPartAudio where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPartAudio

optionsChatCompletionRequestMessageContentPartAudio :: Options
optionsChatCompletionRequestMessageContentPartAudio =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartAudioType", "type")
      , ("chatCompletionRequestMessageContentPartAudioInputUnderscoreaudio", "input_audio")
      ]


-- | 
data ChatCompletionRequestMessageContentPartAudioInputAudio = ChatCompletionRequestMessageContentPartAudioInputAudio
  { chatCompletionRequestMessageContentPartAudioInputAudioData :: Text -- ^ Base64 encoded audio data.
  , chatCompletionRequestMessageContentPartAudioInputAudioFormat :: Text -- ^ The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPartAudioInputAudio where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPartAudioInputAudio
instance ToJSON ChatCompletionRequestMessageContentPartAudioInputAudio where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPartAudioInputAudio

optionsChatCompletionRequestMessageContentPartAudioInputAudio :: Options
optionsChatCompletionRequestMessageContentPartAudioInputAudio =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartAudioInputAudioData", "data")
      , ("chatCompletionRequestMessageContentPartAudioInputAudioFormat", "format")
      ]


-- | Learn about [image inputs](/docs/guides/vision). 
data ChatCompletionRequestMessageContentPartImage = ChatCompletionRequestMessageContentPartImage
  { chatCompletionRequestMessageContentPartImageType :: Text -- ^ The type of the content part.
  , chatCompletionRequestMessageContentPartImageImageUnderscoreurl :: ChatCompletionRequestMessageContentPartImageImageUrl -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPartImage where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPartImage
instance ToJSON ChatCompletionRequestMessageContentPartImage where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPartImage

optionsChatCompletionRequestMessageContentPartImage :: Options
optionsChatCompletionRequestMessageContentPartImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartImageType", "type")
      , ("chatCompletionRequestMessageContentPartImageImageUnderscoreurl", "image_url")
      ]


-- | 
data ChatCompletionRequestMessageContentPartImageImageUrl = ChatCompletionRequestMessageContentPartImageImageUrl
  { chatCompletionRequestMessageContentPartImageImageUrlUrl :: Text -- ^ Either a URL of the image or the base64 encoded image data.
  , chatCompletionRequestMessageContentPartImageImageUrlDetail :: Maybe Text -- ^ Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPartImageImageUrl where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPartImageImageUrl
instance ToJSON ChatCompletionRequestMessageContentPartImageImageUrl where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPartImageImageUrl

optionsChatCompletionRequestMessageContentPartImageImageUrl :: Options
optionsChatCompletionRequestMessageContentPartImageImageUrl =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartImageImageUrlUrl", "url")
      , ("chatCompletionRequestMessageContentPartImageImageUrlDetail", "detail")
      ]


-- | 
data ChatCompletionRequestMessageContentPartRefusal = ChatCompletionRequestMessageContentPartRefusal
  { chatCompletionRequestMessageContentPartRefusalType :: Text -- ^ The type of the content part.
  , chatCompletionRequestMessageContentPartRefusalRefusal :: Text -- ^ The refusal message generated by the model.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPartRefusal where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPartRefusal
instance ToJSON ChatCompletionRequestMessageContentPartRefusal where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPartRefusal

optionsChatCompletionRequestMessageContentPartRefusal :: Options
optionsChatCompletionRequestMessageContentPartRefusal =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartRefusalType", "type")
      , ("chatCompletionRequestMessageContentPartRefusalRefusal", "refusal")
      ]


-- | Learn about [text inputs](/docs/guides/text-generation). 
data ChatCompletionRequestMessageContentPartText = ChatCompletionRequestMessageContentPartText
  { chatCompletionRequestMessageContentPartTextType :: Text -- ^ The type of the content part.
  , chatCompletionRequestMessageContentPartTextText :: Text -- ^ The text content.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPartText where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPartText
instance ToJSON ChatCompletionRequestMessageContentPartText where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPartText

optionsChatCompletionRequestMessageContentPartText :: Options
optionsChatCompletionRequestMessageContentPartText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartTextType", "type")
      , ("chatCompletionRequestMessageContentPartTextText", "text")
      ]


-- | Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use &#x60;developer&#x60; messages for this purpose instead. 
data ChatCompletionRequestSystemMessage = ChatCompletionRequestSystemMessage
  { chatCompletionRequestSystemMessageContent :: ChatCompletionRequestSystemMessageContent -- ^ 
  , chatCompletionRequestSystemMessageRole :: Text -- ^ The role of the messages author, in this case `system`.
  , chatCompletionRequestSystemMessageName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestSystemMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestSystemMessage
instance ToJSON ChatCompletionRequestSystemMessage where
  toJSON = genericToJSON optionsChatCompletionRequestSystemMessage

optionsChatCompletionRequestSystemMessage :: Options
optionsChatCompletionRequestSystemMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestSystemMessageContent", "content")
      , ("chatCompletionRequestSystemMessageRole", "role")
      , ("chatCompletionRequestSystemMessageName", "name")
      ]


-- | The contents of the system message.
data ChatCompletionRequestSystemMessageContent = ChatCompletionRequestSystemMessageContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestSystemMessageContent where
  parseJSON = genericParseJSON optionsChatCompletionRequestSystemMessageContent
instance ToJSON ChatCompletionRequestSystemMessageContent where
  toJSON = genericToJSON optionsChatCompletionRequestSystemMessageContent

optionsChatCompletionRequestSystemMessageContent :: Options
optionsChatCompletionRequestSystemMessageContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ChatCompletionRequestToolMessage = ChatCompletionRequestToolMessage
  { chatCompletionRequestToolMessageRole :: Text -- ^ The role of the messages author, in this case `tool`.
  , chatCompletionRequestToolMessageContent :: ChatCompletionRequestToolMessageContent -- ^ 
  , chatCompletionRequestToolMessageToolUnderscorecallUnderscoreid :: Text -- ^ Tool call that this message is responding to.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestToolMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestToolMessage
instance ToJSON ChatCompletionRequestToolMessage where
  toJSON = genericToJSON optionsChatCompletionRequestToolMessage

optionsChatCompletionRequestToolMessage :: Options
optionsChatCompletionRequestToolMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestToolMessageRole", "role")
      , ("chatCompletionRequestToolMessageContent", "content")
      , ("chatCompletionRequestToolMessageToolUnderscorecallUnderscoreid", "tool_call_id")
      ]


-- | The contents of the tool message.
data ChatCompletionRequestToolMessageContent = ChatCompletionRequestToolMessageContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestToolMessageContent where
  parseJSON = genericParseJSON optionsChatCompletionRequestToolMessageContent
instance ToJSON ChatCompletionRequestToolMessageContent where
  toJSON = genericToJSON optionsChatCompletionRequestToolMessageContent

optionsChatCompletionRequestToolMessageContent :: Options
optionsChatCompletionRequestToolMessageContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Messages sent by an end user, containing prompts or additional context information. 
data ChatCompletionRequestUserMessage = ChatCompletionRequestUserMessage
  { chatCompletionRequestUserMessageContent :: ChatCompletionRequestUserMessageContent -- ^ 
  , chatCompletionRequestUserMessageRole :: Text -- ^ The role of the messages author, in this case `user`.
  , chatCompletionRequestUserMessageName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestUserMessage where
  parseJSON = genericParseJSON optionsChatCompletionRequestUserMessage
instance ToJSON ChatCompletionRequestUserMessage where
  toJSON = genericToJSON optionsChatCompletionRequestUserMessage

optionsChatCompletionRequestUserMessage :: Options
optionsChatCompletionRequestUserMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestUserMessageContent", "content")
      , ("chatCompletionRequestUserMessageRole", "role")
      , ("chatCompletionRequestUserMessageName", "name")
      ]


-- | The contents of the user message. 
data ChatCompletionRequestUserMessageContent = ChatCompletionRequestUserMessageContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestUserMessageContent where
  parseJSON = genericParseJSON optionsChatCompletionRequestUserMessageContent
instance ToJSON ChatCompletionRequestUserMessageContent where
  toJSON = genericToJSON optionsChatCompletionRequestUserMessageContent

optionsChatCompletionRequestUserMessageContent :: Options
optionsChatCompletionRequestUserMessageContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data ChatCompletionRequestUserMessageContentPart = ChatCompletionRequestUserMessageContentPart
  { chatCompletionRequestUserMessageContentPartType :: Text -- ^ The type of the content part.
  , chatCompletionRequestUserMessageContentPartText :: Text -- ^ The text content.
  , chatCompletionRequestUserMessageContentPartImageUnderscoreurl :: ChatCompletionRequestMessageContentPartImageImageUrl -- ^ 
  , chatCompletionRequestUserMessageContentPartInputUnderscoreaudio :: ChatCompletionRequestMessageContentPartAudioInputAudio -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestUserMessageContentPart where
  parseJSON = genericParseJSON optionsChatCompletionRequestUserMessageContentPart
instance ToJSON ChatCompletionRequestUserMessageContentPart where
  toJSON = genericToJSON optionsChatCompletionRequestUserMessageContentPart

optionsChatCompletionRequestUserMessageContentPart :: Options
optionsChatCompletionRequestUserMessageContentPart =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestUserMessageContentPartType", "type")
      , ("chatCompletionRequestUserMessageContentPartText", "text")
      , ("chatCompletionRequestUserMessageContentPartImageUnderscoreurl", "image_url")
      , ("chatCompletionRequestUserMessageContentPartInputUnderscoreaudio", "input_audio")
      ]


-- | A chat completion message generated by the model.
data ChatCompletionResponseMessage = ChatCompletionResponseMessage
  { chatCompletionResponseMessageContent :: Text -- ^ The contents of the message.
  , chatCompletionResponseMessageRefusal :: Text -- ^ The refusal message generated by the model.
  , chatCompletionResponseMessageToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , chatCompletionResponseMessageRole :: Text -- ^ The role of the author of this message.
  , chatCompletionResponseMessageFunctionUnderscorecall :: Maybe ChatCompletionResponseMessageFunctionCall -- ^ 
  , chatCompletionResponseMessageAudio :: Maybe ChatCompletionResponseMessageAudio -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionResponseMessage where
  parseJSON = genericParseJSON optionsChatCompletionResponseMessage
instance ToJSON ChatCompletionResponseMessage where
  toJSON = genericToJSON optionsChatCompletionResponseMessage

optionsChatCompletionResponseMessage :: Options
optionsChatCompletionResponseMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionResponseMessageContent", "content")
      , ("chatCompletionResponseMessageRefusal", "refusal")
      , ("chatCompletionResponseMessageToolUnderscorecalls", "tool_calls")
      , ("chatCompletionResponseMessageRole", "role")
      , ("chatCompletionResponseMessageFunctionUnderscorecall", "function_call")
      , ("chatCompletionResponseMessageAudio", "audio")
      ]


-- | If the audio output modality is requested, this object contains data about the audio response from the model. [Learn more](/docs/guides/audio). 
data ChatCompletionResponseMessageAudio = ChatCompletionResponseMessageAudio
  { chatCompletionResponseMessageAudioId :: Text -- ^ Unique identifier for this audio response.
  , chatCompletionResponseMessageAudioExpiresUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when this audio response will no longer be accessible on the server for use in multi-turn conversations. 
  , chatCompletionResponseMessageAudioData :: Text -- ^ Base64 encoded audio bytes generated by the model, in the format specified in the request. 
  , chatCompletionResponseMessageAudioTranscript :: Text -- ^ Transcript of the audio generated by the model.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionResponseMessageAudio where
  parseJSON = genericParseJSON optionsChatCompletionResponseMessageAudio
instance ToJSON ChatCompletionResponseMessageAudio where
  toJSON = genericToJSON optionsChatCompletionResponseMessageAudio

optionsChatCompletionResponseMessageAudio :: Options
optionsChatCompletionResponseMessageAudio =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionResponseMessageAudioId", "id")
      , ("chatCompletionResponseMessageAudioExpiresUnderscoreat", "expires_at")
      , ("chatCompletionResponseMessageAudioData", "data")
      , ("chatCompletionResponseMessageAudioTranscript", "transcript")
      ]


-- | Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
data ChatCompletionResponseMessageFunctionCall = ChatCompletionResponseMessageFunctionCall
  { chatCompletionResponseMessageFunctionCallArguments :: Text -- ^ The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  , chatCompletionResponseMessageFunctionCallName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionResponseMessageFunctionCall where
  parseJSON = genericParseJSON optionsChatCompletionResponseMessageFunctionCall
instance ToJSON ChatCompletionResponseMessageFunctionCall where
  toJSON = genericToJSON optionsChatCompletionResponseMessageFunctionCall

optionsChatCompletionResponseMessageFunctionCall :: Options
optionsChatCompletionResponseMessageFunctionCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionResponseMessageFunctionCallArguments", "arguments")
      , ("chatCompletionResponseMessageFunctionCallName", "name")
      ]


-- | The role of the author of a message
data ChatCompletionRole = ChatCompletionRole
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRole where
  parseJSON = genericParseJSON optionsChatCompletionRole
instance ToJSON ChatCompletionRole where
  toJSON = genericToJSON optionsChatCompletionRole

optionsChatCompletionRole :: Options
optionsChatCompletionRole =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Options for streaming response. Only set this when you set &#x60;stream: true&#x60;. 
data ChatCompletionStreamOptions = ChatCompletionStreamOptions
  { chatCompletionStreamOptionsIncludeUnderscoreusage :: Maybe Bool -- ^ If set, an additional chunk will be streamed before the `data: [DONE]` message. The `usage` field on this chunk shows the token usage statistics for the entire request, and the `choices` field will always be an empty array. All other chunks will also include a `usage` field, but with a null value. 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionStreamOptions where
  parseJSON = genericParseJSON optionsChatCompletionStreamOptions
instance ToJSON ChatCompletionStreamOptions where
  toJSON = genericToJSON optionsChatCompletionStreamOptions

optionsChatCompletionStreamOptions :: Options
optionsChatCompletionStreamOptions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionStreamOptionsIncludeUnderscoreusage", "include_usage")
      ]


-- | A chat completion delta generated by streamed model responses.
data ChatCompletionStreamResponseDelta = ChatCompletionStreamResponseDelta
  { chatCompletionStreamResponseDeltaContent :: Maybe Text -- ^ The contents of the chunk message.
  , chatCompletionStreamResponseDeltaFunctionUnderscorecall :: Maybe ChatCompletionStreamResponseDeltaFunctionCall -- ^ 
  , chatCompletionStreamResponseDeltaToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCallChunk] -- ^ 
  , chatCompletionStreamResponseDeltaRole :: Maybe Text -- ^ The role of the author of this message.
  , chatCompletionStreamResponseDeltaRefusal :: Maybe Text -- ^ The refusal message generated by the model.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionStreamResponseDelta where
  parseJSON = genericParseJSON optionsChatCompletionStreamResponseDelta
instance ToJSON ChatCompletionStreamResponseDelta where
  toJSON = genericToJSON optionsChatCompletionStreamResponseDelta

optionsChatCompletionStreamResponseDelta :: Options
optionsChatCompletionStreamResponseDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionStreamResponseDeltaContent", "content")
      , ("chatCompletionStreamResponseDeltaFunctionUnderscorecall", "function_call")
      , ("chatCompletionStreamResponseDeltaToolUnderscorecalls", "tool_calls")
      , ("chatCompletionStreamResponseDeltaRole", "role")
      , ("chatCompletionStreamResponseDeltaRefusal", "refusal")
      ]


-- | Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
data ChatCompletionStreamResponseDeltaFunctionCall = ChatCompletionStreamResponseDeltaFunctionCall
  { chatCompletionStreamResponseDeltaFunctionCallArguments :: Maybe Text -- ^ The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
  , chatCompletionStreamResponseDeltaFunctionCallName :: Maybe Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionStreamResponseDeltaFunctionCall where
  parseJSON = genericParseJSON optionsChatCompletionStreamResponseDeltaFunctionCall
instance ToJSON ChatCompletionStreamResponseDeltaFunctionCall where
  toJSON = genericToJSON optionsChatCompletionStreamResponseDeltaFunctionCall

optionsChatCompletionStreamResponseDeltaFunctionCall :: Options
optionsChatCompletionStreamResponseDeltaFunctionCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionStreamResponseDeltaFunctionCallArguments", "arguments")
      , ("chatCompletionStreamResponseDeltaFunctionCallName", "name")
      ]


-- | 
data ChatCompletionTokenLogprob = ChatCompletionTokenLogprob
  { chatCompletionTokenLogprobToken :: Text -- ^ The token.
  , chatCompletionTokenLogprobLogprob :: Double -- ^ The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  , chatCompletionTokenLogprobBytes :: [Int] -- ^ A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  , chatCompletionTokenLogprobTopUnderscorelogprobs :: [ChatCompletionTokenLogprobTopLogprobsInner] -- ^ List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionTokenLogprob where
  parseJSON = genericParseJSON optionsChatCompletionTokenLogprob
instance ToJSON ChatCompletionTokenLogprob where
  toJSON = genericToJSON optionsChatCompletionTokenLogprob

optionsChatCompletionTokenLogprob :: Options
optionsChatCompletionTokenLogprob =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionTokenLogprobToken", "token")
      , ("chatCompletionTokenLogprobLogprob", "logprob")
      , ("chatCompletionTokenLogprobBytes", "bytes")
      , ("chatCompletionTokenLogprobTopUnderscorelogprobs", "top_logprobs")
      ]


-- | 
data ChatCompletionTokenLogprobTopLogprobsInner = ChatCompletionTokenLogprobTopLogprobsInner
  { chatCompletionTokenLogprobTopLogprobsInnerToken :: Text -- ^ The token.
  , chatCompletionTokenLogprobTopLogprobsInnerLogprob :: Double -- ^ The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
  , chatCompletionTokenLogprobTopLogprobsInnerBytes :: [Int] -- ^ A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionTokenLogprobTopLogprobsInner where
  parseJSON = genericParseJSON optionsChatCompletionTokenLogprobTopLogprobsInner
instance ToJSON ChatCompletionTokenLogprobTopLogprobsInner where
  toJSON = genericToJSON optionsChatCompletionTokenLogprobTopLogprobsInner

optionsChatCompletionTokenLogprobTopLogprobsInner :: Options
optionsChatCompletionTokenLogprobTopLogprobsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionTokenLogprobTopLogprobsInnerToken", "token")
      , ("chatCompletionTokenLogprobTopLogprobsInnerLogprob", "logprob")
      , ("chatCompletionTokenLogprobTopLogprobsInnerBytes", "bytes")
      ]


-- | 
data ChatCompletionTool = ChatCompletionTool
  { chatCompletionToolType :: Text -- ^ The type of the tool. Currently, only `function` is supported.
  , chatCompletionToolFunction :: FunctionObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionTool where
  parseJSON = genericParseJSON optionsChatCompletionTool
instance ToJSON ChatCompletionTool where
  toJSON = genericToJSON optionsChatCompletionTool

optionsChatCompletionTool :: Options
optionsChatCompletionTool =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionToolType", "type")
      , ("chatCompletionToolFunction", "function")
      ]


-- | Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tool and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools. Specifying a particular tool via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  &#x60;none&#x60; is the default when no tools are present. &#x60;auto&#x60; is the default if tools are present. 
data ChatCompletionToolChoiceOption = ChatCompletionToolChoiceOption
  { chatCompletionToolChoiceOptionType :: Text -- ^ The type of the tool. Currently, only `function` is supported.
  , chatCompletionToolChoiceOptionFunction :: AssistantsNamedToolChoiceFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionToolChoiceOption where
  parseJSON = genericParseJSON optionsChatCompletionToolChoiceOption
instance ToJSON ChatCompletionToolChoiceOption where
  toJSON = genericToJSON optionsChatCompletionToolChoiceOption

optionsChatCompletionToolChoiceOption :: Options
optionsChatCompletionToolChoiceOption =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionToolChoiceOptionType", "type")
      , ("chatCompletionToolChoiceOptionFunction", "function")
      ]


-- | The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
data ChunkingStrategyRequestParam = ChunkingStrategyRequestParam
  { chunkingStrategyRequestParamType :: Text -- ^ Always `auto`.
  , chunkingStrategyRequestParamStatic :: StaticChunkingStrategy -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChunkingStrategyRequestParam where
  parseJSON = genericParseJSON optionsChunkingStrategyRequestParam
instance ToJSON ChunkingStrategyRequestParam where
  toJSON = genericToJSON optionsChunkingStrategyRequestParam

optionsChunkingStrategyRequestParam :: Options
optionsChunkingStrategyRequestParam =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chunkingStrategyRequestParamType", "type")
      , ("chunkingStrategyRequestParamStatic", "static")
      ]


-- | 
data CompleteUploadRequest = CompleteUploadRequest
  { completeUploadRequestPartUnderscoreids :: [Text] -- ^ The ordered list of Part IDs. 
  , completeUploadRequestMd5 :: Maybe Text -- ^ The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
  } deriving (Show, Eq, Generic)

instance FromJSON CompleteUploadRequest where
  parseJSON = genericParseJSON optionsCompleteUploadRequest
instance ToJSON CompleteUploadRequest where
  toJSON = genericToJSON optionsCompleteUploadRequest

optionsCompleteUploadRequest :: Options
optionsCompleteUploadRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("completeUploadRequestPartUnderscoreids", "part_ids")
      , ("completeUploadRequestMd5", "md5")
      ]


-- | Usage statistics for the completion request.
data CompletionUsage = CompletionUsage
  { completionUsageCompletionUnderscoretokens :: Int -- ^ Number of tokens in the generated completion.
  , completionUsagePromptUnderscoretokens :: Int -- ^ Number of tokens in the prompt.
  , completionUsageTotalUnderscoretokens :: Int -- ^ Total number of tokens used in the request (prompt + completion).
  , completionUsageCompletionUnderscoretokensUnderscoredetails :: Maybe CompletionUsageCompletionTokensDetails -- ^ 
  , completionUsagePromptUnderscoretokensUnderscoredetails :: Maybe CompletionUsagePromptTokensDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CompletionUsage where
  parseJSON = genericParseJSON optionsCompletionUsage
instance ToJSON CompletionUsage where
  toJSON = genericToJSON optionsCompletionUsage

optionsCompletionUsage :: Options
optionsCompletionUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("completionUsageCompletionUnderscoretokens", "completion_tokens")
      , ("completionUsagePromptUnderscoretokens", "prompt_tokens")
      , ("completionUsageTotalUnderscoretokens", "total_tokens")
      , ("completionUsageCompletionUnderscoretokensUnderscoredetails", "completion_tokens_details")
      , ("completionUsagePromptUnderscoretokensUnderscoredetails", "prompt_tokens_details")
      ]


-- | Breakdown of tokens used in a completion.
data CompletionUsageCompletionTokensDetails = CompletionUsageCompletionTokensDetails
  { completionUsageCompletionTokensDetailsAcceptedUnderscorepredictionUnderscoretokens :: Maybe Int -- ^ When using Predicted Outputs, the number of tokens in the prediction that appeared in the completion. 
  , completionUsageCompletionTokensDetailsAudioUnderscoretokens :: Maybe Int -- ^ Audio input tokens generated by the model.
  , completionUsageCompletionTokensDetailsReasoningUnderscoretokens :: Maybe Int -- ^ Tokens generated by the model for reasoning.
  , completionUsageCompletionTokensDetailsRejectedUnderscorepredictionUnderscoretokens :: Maybe Int -- ^ When using Predicted Outputs, the number of tokens in the prediction that did not appear in the completion. However, like reasoning tokens, these tokens are still counted in the total completion tokens for purposes of billing, output, and context window limits. 
  } deriving (Show, Eq, Generic)

instance FromJSON CompletionUsageCompletionTokensDetails where
  parseJSON = genericParseJSON optionsCompletionUsageCompletionTokensDetails
instance ToJSON CompletionUsageCompletionTokensDetails where
  toJSON = genericToJSON optionsCompletionUsageCompletionTokensDetails

optionsCompletionUsageCompletionTokensDetails :: Options
optionsCompletionUsageCompletionTokensDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("completionUsageCompletionTokensDetailsAcceptedUnderscorepredictionUnderscoretokens", "accepted_prediction_tokens")
      , ("completionUsageCompletionTokensDetailsAudioUnderscoretokens", "audio_tokens")
      , ("completionUsageCompletionTokensDetailsReasoningUnderscoretokens", "reasoning_tokens")
      , ("completionUsageCompletionTokensDetailsRejectedUnderscorepredictionUnderscoretokens", "rejected_prediction_tokens")
      ]


-- | Breakdown of tokens used in the prompt.
data CompletionUsagePromptTokensDetails = CompletionUsagePromptTokensDetails
  { completionUsagePromptTokensDetailsAudioUnderscoretokens :: Maybe Int -- ^ Audio input tokens present in the prompt.
  , completionUsagePromptTokensDetailsCachedUnderscoretokens :: Maybe Int -- ^ Cached tokens present in the prompt.
  } deriving (Show, Eq, Generic)

instance FromJSON CompletionUsagePromptTokensDetails where
  parseJSON = genericParseJSON optionsCompletionUsagePromptTokensDetails
instance ToJSON CompletionUsagePromptTokensDetails where
  toJSON = genericToJSON optionsCompletionUsagePromptTokensDetails

optionsCompletionUsagePromptTokensDetails :: Options
optionsCompletionUsagePromptTokensDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("completionUsagePromptTokensDetailsAudioUnderscoretokens", "audio_tokens")
      , ("completionUsagePromptTokensDetailsCachedUnderscoretokens", "cached_tokens")
      ]


-- | The aggregated costs details of the specific time bucket.
data CostsResult = CostsResult
  { costsResultObject :: Text -- ^ 
  , costsResultAmount :: Maybe CostsResultAmount -- ^ 
  , costsResultLineUnderscoreitem :: Maybe Text -- ^ When `group_by=line_item`, this field provides the line item of the grouped costs result.
  , costsResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  } deriving (Show, Eq, Generic)

instance FromJSON CostsResult where
  parseJSON = genericParseJSON optionsCostsResult
instance ToJSON CostsResult where
  toJSON = genericToJSON optionsCostsResult

optionsCostsResult :: Options
optionsCostsResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("costsResultObject", "object")
      , ("costsResultAmount", "amount")
      , ("costsResultLineUnderscoreitem", "line_item")
      , ("costsResultProjectUnderscoreid", "project_id")
      ]


-- | The monetary value in its associated currency.
data CostsResultAmount = CostsResultAmount
  { costsResultAmountValue :: Maybe Double -- ^ The numeric value of the cost.
  , costsResultAmountCurrency :: Maybe Text -- ^ Lowercase ISO-4217 currency e.g. \"usd\"
  } deriving (Show, Eq, Generic)

instance FromJSON CostsResultAmount where
  parseJSON = genericParseJSON optionsCostsResultAmount
instance ToJSON CostsResultAmount where
  toJSON = genericToJSON optionsCostsResultAmount

optionsCostsResultAmount :: Options
optionsCostsResultAmount =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("costsResultAmountValue", "value")
      , ("costsResultAmountCurrency", "currency")
      ]


-- | 
data CreateAssistantRequest = CreateAssistantRequest
  { createAssistantRequestModel :: CreateAssistantRequestModel -- ^ 
  , createAssistantRequestName :: Maybe Text -- ^ The name of the assistant. The maximum length is 256 characters. 
  , createAssistantRequestDescription :: Maybe Text -- ^ The description of the assistant. The maximum length is 512 characters. 
  , createAssistantRequestInstructions :: Maybe Text -- ^ The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  , createAssistantRequestTools :: Maybe [AssistantObjectToolsInner] -- ^ A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  , createAssistantRequestToolUnderscoreresources :: Maybe CreateAssistantRequestToolResources -- ^ 
  , createAssistantRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , createAssistantRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , createAssistantRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  , createAssistantRequestResponseUnderscoreformat :: Maybe AssistantsApiResponseFormatOption -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequest where
  parseJSON = genericParseJSON optionsCreateAssistantRequest
instance ToJSON CreateAssistantRequest where
  toJSON = genericToJSON optionsCreateAssistantRequest

optionsCreateAssistantRequest :: Options
optionsCreateAssistantRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantRequestModel", "model")
      , ("createAssistantRequestName", "name")
      , ("createAssistantRequestDescription", "description")
      , ("createAssistantRequestInstructions", "instructions")
      , ("createAssistantRequestTools", "tools")
      , ("createAssistantRequestToolUnderscoreresources", "tool_resources")
      , ("createAssistantRequestMetadata", "metadata")
      , ("createAssistantRequestTemperature", "temperature")
      , ("createAssistantRequestTopUnderscorep", "top_p")
      , ("createAssistantRequestResponseUnderscoreformat", "response_format")
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
data CreateAssistantRequestModel = CreateAssistantRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequestModel where
  parseJSON = genericParseJSON optionsCreateAssistantRequestModel
instance ToJSON CreateAssistantRequestModel where
  toJSON = genericToJSON optionsCreateAssistantRequestModel

optionsCreateAssistantRequestModel :: Options
optionsCreateAssistantRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
data CreateAssistantRequestToolResources = CreateAssistantRequestToolResources
  { createAssistantRequestToolResourcesCodeUnderscoreinterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter -- ^ 
  , createAssistantRequestToolResourcesFileUnderscoresearch :: Maybe CreateAssistantRequestToolResourcesFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequestToolResources where
  parseJSON = genericParseJSON optionsCreateAssistantRequestToolResources
instance ToJSON CreateAssistantRequestToolResources where
  toJSON = genericToJSON optionsCreateAssistantRequestToolResources

optionsCreateAssistantRequestToolResources :: Options
optionsCreateAssistantRequestToolResources =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantRequestToolResourcesCodeUnderscoreinterpreter", "code_interpreter")
      , ("createAssistantRequestToolResourcesFileUnderscoresearch", "file_search")
      ]


-- | 
data CreateAssistantRequestToolResourcesCodeInterpreter = CreateAssistantRequestToolResourcesCodeInterpreter
  { createAssistantRequestToolResourcesCodeInterpreterFileUnderscoreids :: Maybe [Text] -- ^ A list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequestToolResourcesCodeInterpreter where
  parseJSON = genericParseJSON optionsCreateAssistantRequestToolResourcesCodeInterpreter
instance ToJSON CreateAssistantRequestToolResourcesCodeInterpreter where
  toJSON = genericToJSON optionsCreateAssistantRequestToolResourcesCodeInterpreter

optionsCreateAssistantRequestToolResourcesCodeInterpreter :: Options
optionsCreateAssistantRequestToolResourcesCodeInterpreter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantRequestToolResourcesCodeInterpreterFileUnderscoreids", "file_ids")
      ]


-- | 
data CreateAssistantRequestToolResourcesFileSearch = CreateAssistantRequestToolResourcesFileSearch
  { createAssistantRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids :: Maybe [Text] -- ^ The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  , createAssistantRequestToolResourcesFileSearchVectorUnderscorestores :: Maybe [CreateAssistantRequestToolResourcesFileSearchVectorStoresInner] -- ^ A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequestToolResourcesFileSearch where
  parseJSON = genericParseJSON optionsCreateAssistantRequestToolResourcesFileSearch
instance ToJSON CreateAssistantRequestToolResourcesFileSearch where
  toJSON = genericToJSON optionsCreateAssistantRequestToolResourcesFileSearch

optionsCreateAssistantRequestToolResourcesFileSearch :: Options
optionsCreateAssistantRequestToolResourcesFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids", "vector_store_ids")
      , ("createAssistantRequestToolResourcesFileSearchVectorUnderscorestores", "vector_stores")
      ]


-- | 
data CreateAssistantRequestToolResourcesFileSearchVectorStoresInner = CreateAssistantRequestToolResourcesFileSearchVectorStoresInner
  { createAssistantRequestToolResourcesFileSearchVectorStoresInnerFileUnderscoreids :: Maybe [Text] -- ^ A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  , createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingUnderscorestrategy :: Maybe CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy -- ^ 
  , createAssistantRequestToolResourcesFileSearchVectorStoresInnerMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequestToolResourcesFileSearchVectorStoresInner where
  parseJSON = genericParseJSON optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInner
instance ToJSON CreateAssistantRequestToolResourcesFileSearchVectorStoresInner where
  toJSON = genericToJSON optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInner

optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInner :: Options
optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantRequestToolResourcesFileSearchVectorStoresInnerFileUnderscoreids", "file_ids")
      , ("createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingUnderscorestrategy", "chunking_strategy")
      , ("createAssistantRequestToolResourcesFileSearchVectorStoresInnerMetadata", "metadata")
      ]


-- | The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy.
data CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy = CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
  { createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyType :: Text -- ^ Always `auto`.
  , createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyStatic :: StaticChunkingStrategyStatic -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy where
  parseJSON = genericParseJSON optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy
instance ToJSON CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy where
  toJSON = genericToJSON optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy

optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy :: Options
optionsCreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyType", "type")
      , ("createAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategyStatic", "static")
      ]


-- | 
data CreateBatchRequest = CreateBatchRequest
  { createBatchRequestInputUnderscorefileUnderscoreid :: Text -- ^ The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
  , createBatchRequestEndpoint :: Text -- ^ The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
  , createBatchRequestCompletionUnderscorewindow :: Text -- ^ The time frame within which the batch should be processed. Currently only `24h` is supported.
  , createBatchRequestMetadata :: Maybe (Map.Map String Text) -- ^ Optional custom metadata for the batch.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateBatchRequest where
  parseJSON = genericParseJSON optionsCreateBatchRequest
instance ToJSON CreateBatchRequest where
  toJSON = genericToJSON optionsCreateBatchRequest

optionsCreateBatchRequest :: Options
optionsCreateBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createBatchRequestInputUnderscorefileUnderscoreid", "input_file_id")
      , ("createBatchRequestEndpoint", "endpoint")
      , ("createBatchRequestCompletionUnderscorewindow", "completion_window")
      , ("createBatchRequestMetadata", "metadata")
      ]


-- | Represents a chat completion response returned by model, based on the provided input.
data CreateChatCompletionFunctionResponse = CreateChatCompletionFunctionResponse
  { createChatCompletionFunctionResponseId :: Text -- ^ A unique identifier for the chat completion.
  , createChatCompletionFunctionResponseChoices :: [CreateChatCompletionFunctionResponseChoicesInner] -- ^ A list of chat completion choices. Can be more than one if `n` is greater than 1.
  , createChatCompletionFunctionResponseCreated :: Int -- ^ The Unix timestamp (in seconds) of when the chat completion was created.
  , createChatCompletionFunctionResponseModel :: Text -- ^ The model used for the chat completion.
  , createChatCompletionFunctionResponseSystemUnderscorefingerprint :: Maybe Text -- ^ This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  , createChatCompletionFunctionResponseObject :: Text -- ^ The object type, which is always `chat.completion`.
  , createChatCompletionFunctionResponseUsage :: Maybe CompletionUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionFunctionResponse where
  parseJSON = genericParseJSON optionsCreateChatCompletionFunctionResponse
instance ToJSON CreateChatCompletionFunctionResponse where
  toJSON = genericToJSON optionsCreateChatCompletionFunctionResponse

optionsCreateChatCompletionFunctionResponse :: Options
optionsCreateChatCompletionFunctionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionFunctionResponseId", "id")
      , ("createChatCompletionFunctionResponseChoices", "choices")
      , ("createChatCompletionFunctionResponseCreated", "created")
      , ("createChatCompletionFunctionResponseModel", "model")
      , ("createChatCompletionFunctionResponseSystemUnderscorefingerprint", "system_fingerprint")
      , ("createChatCompletionFunctionResponseObject", "object")
      , ("createChatCompletionFunctionResponseUsage", "usage")
      ]


-- | 
data CreateChatCompletionFunctionResponseChoicesInner = CreateChatCompletionFunctionResponseChoicesInner
  { createChatCompletionFunctionResponseChoicesInnerFinishUnderscorereason :: Text -- ^ The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
  , createChatCompletionFunctionResponseChoicesInnerIndex :: Int -- ^ The index of the choice in the list of choices.
  , createChatCompletionFunctionResponseChoicesInnerMessage :: ChatCompletionResponseMessage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionFunctionResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateChatCompletionFunctionResponseChoicesInner
instance ToJSON CreateChatCompletionFunctionResponseChoicesInner where
  toJSON = genericToJSON optionsCreateChatCompletionFunctionResponseChoicesInner

optionsCreateChatCompletionFunctionResponseChoicesInner :: Options
optionsCreateChatCompletionFunctionResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionFunctionResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      , ("createChatCompletionFunctionResponseChoicesInnerIndex", "index")
      , ("createChatCompletionFunctionResponseChoicesInnerMessage", "message")
      ]


-- | 
data CreateChatCompletionRequest = CreateChatCompletionRequest
  { createChatCompletionRequestMessages :: [ChatCompletionRequestMessage] -- ^ A list of messages comprising the conversation so far. Depending on the [model](/docs/models) you use, different message types (modalities) are supported, like [text](/docs/guides/text-generation), [images](/docs/guides/vision), and [audio](/docs/guides/audio). 
  , createChatCompletionRequestModel :: CreateChatCompletionRequestModel -- ^ 
  , createChatCompletionRequestStore :: Maybe Bool -- ^ Whether or not to store the output of this chat completion request for  use in our [model distillation](/docs/guides/distillation) or [evals](/docs/guides/evals) products. 
  , createChatCompletionRequestReasoningUnderscoreeffort :: Maybe Text -- ^ **o1 models only**   Constrains effort on reasoning for  [reasoning models](https://platform.openai.com/docs/guides/reasoning). Currently supported values are `low`, `medium`, and `high`. Reducing reasoning effort can result in faster responses and fewer tokens used on reasoning in a response. 
  , createChatCompletionRequestMetadata :: Maybe (Map.Map String Text) -- ^ Developer-defined tags and values used for filtering completions in the [dashboard](https://platform.openai.com/chat-completions). 
  , createChatCompletionRequestFrequencyUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim. 
  , createChatCompletionRequestLogitUnderscorebias :: Maybe (Map.Map String Int) -- ^ Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  , createChatCompletionRequestLogprobs :: Maybe Bool -- ^ Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`. 
  , createChatCompletionRequestTopUnderscorelogprobs :: Maybe Int -- ^ An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used. 
  , createChatCompletionRequestMaxUnderscoretokens :: Maybe Int -- ^ The maximum number of [tokens](/tokenizer) that can be generated in the chat completion. This value can be used to control [costs](https://openai.com/api/pricing/) for text generated via API.  This value is now deprecated in favor of `max_completion_tokens`, and is not compatible with [o1 series models](/docs/guides/reasoning). 
  , createChatCompletionRequestMaxUnderscorecompletionUnderscoretokens :: Maybe Int -- ^ An upper bound for the number of tokens that can be generated for a completion, including visible output tokens and [reasoning tokens](/docs/guides/reasoning). 
  , createChatCompletionRequestN :: Maybe Int -- ^ How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
  , createChatCompletionRequestModalities :: Maybe [Text] -- ^ Output types that you would like the model to generate for this request. Most models are capable of generating text, which is the default:  `[\"text\"]`  The `gpt-4o-audio-preview` model can also be used to [generate audio](/docs/guides/audio). To request that this model generate both text and audio responses, you can use:  `[\"text\", \"audio\"]` 
  , createChatCompletionRequestPrediction :: Maybe PredictionContent -- ^ 
  , createChatCompletionRequestAudio :: Maybe CreateChatCompletionRequestAudio -- ^ 
  , createChatCompletionRequestPresenceUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics. 
  , createChatCompletionRequestResponseUnderscoreformat :: Maybe CreateChatCompletionRequestResponseFormat -- ^ 
  , createChatCompletionRequestSeed :: Maybe Int -- ^ This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
  , createChatCompletionRequestServiceUnderscoretier :: Maybe Text -- ^ Specifies the latency tier to use for processing the request. This parameter is relevant for customers subscribed to the scale tier service:    - If set to 'auto', and the Project is Scale tier enabled, the system will utilize scale tier credits until they are exhausted.   - If set to 'auto', and the Project is not Scale tier enabled, the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - If set to 'default', the request will be processed using the default service tier with a lower uptime SLA and no latency guarentee.   - When not set, the default behavior is 'auto'.    When this parameter is set, the response body will include the `service_tier` utilized. 
  , createChatCompletionRequestStop :: Maybe CreateChatCompletionRequestStop -- ^ 
  , createChatCompletionRequestStream :: Maybe Bool -- ^ If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
  , createChatCompletionRequestStreamUnderscoreoptions :: Maybe ChatCompletionStreamOptions -- ^ 
  , createChatCompletionRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. We generally recommend altering this or `top_p` but not both. 
  , createChatCompletionRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  , createChatCompletionRequestTools :: Maybe [ChatCompletionTool] -- ^ A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
  , createChatCompletionRequestToolUnderscorechoice :: Maybe ChatCompletionToolChoiceOption -- ^ 
  , createChatCompletionRequestParallelUnderscoretoolUnderscorecalls :: Maybe Bool -- ^ Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  , createChatCompletionRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  , createChatCompletionRequestFunctionUnderscorecall :: Maybe CreateChatCompletionRequestFunctionCall -- ^ 
  , createChatCompletionRequestFunctions :: Maybe [ChatCompletionFunctions] -- ^ Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequest where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequest
instance ToJSON CreateChatCompletionRequest where
  toJSON = genericToJSON optionsCreateChatCompletionRequest

optionsCreateChatCompletionRequest :: Options
optionsCreateChatCompletionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestMessages", "messages")
      , ("createChatCompletionRequestModel", "model")
      , ("createChatCompletionRequestStore", "store")
      , ("createChatCompletionRequestReasoningUnderscoreeffort", "reasoning_effort")
      , ("createChatCompletionRequestMetadata", "metadata")
      , ("createChatCompletionRequestFrequencyUnderscorepenalty", "frequency_penalty")
      , ("createChatCompletionRequestLogitUnderscorebias", "logit_bias")
      , ("createChatCompletionRequestLogprobs", "logprobs")
      , ("createChatCompletionRequestTopUnderscorelogprobs", "top_logprobs")
      , ("createChatCompletionRequestMaxUnderscoretokens", "max_tokens")
      , ("createChatCompletionRequestMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("createChatCompletionRequestN", "n")
      , ("createChatCompletionRequestModalities", "modalities")
      , ("createChatCompletionRequestPrediction", "prediction")
      , ("createChatCompletionRequestAudio", "audio")
      , ("createChatCompletionRequestPresenceUnderscorepenalty", "presence_penalty")
      , ("createChatCompletionRequestResponseUnderscoreformat", "response_format")
      , ("createChatCompletionRequestSeed", "seed")
      , ("createChatCompletionRequestServiceUnderscoretier", "service_tier")
      , ("createChatCompletionRequestStop", "stop")
      , ("createChatCompletionRequestStream", "stream")
      , ("createChatCompletionRequestStreamUnderscoreoptions", "stream_options")
      , ("createChatCompletionRequestTemperature", "temperature")
      , ("createChatCompletionRequestTopUnderscorep", "top_p")
      , ("createChatCompletionRequestTools", "tools")
      , ("createChatCompletionRequestToolUnderscorechoice", "tool_choice")
      , ("createChatCompletionRequestParallelUnderscoretoolUnderscorecalls", "parallel_tool_calls")
      , ("createChatCompletionRequestUser", "user")
      , ("createChatCompletionRequestFunctionUnderscorecall", "function_call")
      , ("createChatCompletionRequestFunctions", "functions")
      ]


-- | Parameters for audio output. Required when audio output is requested with &#x60;modalities: [\&quot;audio\&quot;]&#x60;. [Learn more](/docs/guides/audio). 
data CreateChatCompletionRequestAudio = CreateChatCompletionRequestAudio
  { createChatCompletionRequestAudioVoice :: Text -- ^ The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  , createChatCompletionRequestAudioFormat :: Text -- ^ Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestAudio where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestAudio
instance ToJSON CreateChatCompletionRequestAudio where
  toJSON = genericToJSON optionsCreateChatCompletionRequestAudio

optionsCreateChatCompletionRequestAudio :: Options
optionsCreateChatCompletionRequestAudio =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestAudioVoice", "voice")
      , ("createChatCompletionRequestAudioFormat", "format")
      ]


-- | Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model.  &#x60;none&#x60; means the model will not call a function and instead generates a message.  &#x60;auto&#x60; means the model can pick between generating a message or calling a function.  Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
data CreateChatCompletionRequestFunctionCall = CreateChatCompletionRequestFunctionCall
  { createChatCompletionRequestFunctionCallName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestFunctionCall where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestFunctionCall
instance ToJSON CreateChatCompletionRequestFunctionCall where
  toJSON = genericToJSON optionsCreateChatCompletionRequestFunctionCall

optionsCreateChatCompletionRequestFunctionCall :: Options
optionsCreateChatCompletionRequestFunctionCall =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestFunctionCallName", "name")
      ]


-- | ID of the model to use. See the [model endpoint compatibility](/docs/models#model-endpoint-compatibility) table for details on which models work with the Chat API.
data CreateChatCompletionRequestModel = CreateChatCompletionRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestModel where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestModel
instance ToJSON CreateChatCompletionRequestModel where
  toJSON = genericToJSON optionsCreateChatCompletionRequestModel

optionsCreateChatCompletionRequestModel :: Options
optionsCreateChatCompletionRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | An object specifying the format that the model must output.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_schema\&quot;, \&quot;json_schema\&quot;: {...} }&#x60; enables Structured Outputs which ensures the model will match your supplied JSON schema. Learn more in the [Structured Outputs guide](/docs/guides/structured-outputs).  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which ensures the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
data CreateChatCompletionRequestResponseFormat = CreateChatCompletionRequestResponseFormat
  { createChatCompletionRequestResponseFormatType :: Text -- ^ The type of response format being defined: `text`
  , createChatCompletionRequestResponseFormatJsonUnderscoreschema :: ResponseFormatJsonSchemaJsonSchema -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestResponseFormat where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestResponseFormat
instance ToJSON CreateChatCompletionRequestResponseFormat where
  toJSON = genericToJSON optionsCreateChatCompletionRequestResponseFormat

optionsCreateChatCompletionRequestResponseFormat :: Options
optionsCreateChatCompletionRequestResponseFormat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionRequestResponseFormatType", "type")
      , ("createChatCompletionRequestResponseFormatJsonUnderscoreschema", "json_schema")
      ]


-- | Up to 4 sequences where the API will stop generating further tokens. 
data CreateChatCompletionRequestStop = CreateChatCompletionRequestStop
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionRequestStop where
  parseJSON = genericParseJSON optionsCreateChatCompletionRequestStop
instance ToJSON CreateChatCompletionRequestStop where
  toJSON = genericToJSON optionsCreateChatCompletionRequestStop

optionsCreateChatCompletionRequestStop :: Options
optionsCreateChatCompletionRequestStop =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Represents a chat completion response returned by model, based on the provided input.
data CreateChatCompletionResponse = CreateChatCompletionResponse
  { createChatCompletionResponseId :: Text -- ^ A unique identifier for the chat completion.
  , createChatCompletionResponseChoices :: [CreateChatCompletionResponseChoicesInner] -- ^ A list of chat completion choices. Can be more than one if `n` is greater than 1.
  , createChatCompletionResponseCreated :: Int -- ^ The Unix timestamp (in seconds) of when the chat completion was created.
  , createChatCompletionResponseModel :: Text -- ^ The model used for the chat completion.
  , createChatCompletionResponseServiceUnderscoretier :: Maybe Text -- ^ The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  , createChatCompletionResponseSystemUnderscorefingerprint :: Maybe Text -- ^ This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  , createChatCompletionResponseObject :: Text -- ^ The object type, which is always `chat.completion`.
  , createChatCompletionResponseUsage :: Maybe CompletionUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionResponse where
  parseJSON = genericParseJSON optionsCreateChatCompletionResponse
instance ToJSON CreateChatCompletionResponse where
  toJSON = genericToJSON optionsCreateChatCompletionResponse

optionsCreateChatCompletionResponse :: Options
optionsCreateChatCompletionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionResponseId", "id")
      , ("createChatCompletionResponseChoices", "choices")
      , ("createChatCompletionResponseCreated", "created")
      , ("createChatCompletionResponseModel", "model")
      , ("createChatCompletionResponseServiceUnderscoretier", "service_tier")
      , ("createChatCompletionResponseSystemUnderscorefingerprint", "system_fingerprint")
      , ("createChatCompletionResponseObject", "object")
      , ("createChatCompletionResponseUsage", "usage")
      ]


-- | 
data CreateChatCompletionResponseChoicesInner = CreateChatCompletionResponseChoicesInner
  { createChatCompletionResponseChoicesInnerFinishUnderscorereason :: Text -- ^ The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  , createChatCompletionResponseChoicesInnerIndex :: Int -- ^ The index of the choice in the list of choices.
  , createChatCompletionResponseChoicesInnerMessage :: ChatCompletionResponseMessage -- ^ 
  , createChatCompletionResponseChoicesInnerLogprobs :: CreateChatCompletionResponseChoicesInnerLogprobs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateChatCompletionResponseChoicesInner
instance ToJSON CreateChatCompletionResponseChoicesInner where
  toJSON = genericToJSON optionsCreateChatCompletionResponseChoicesInner

optionsCreateChatCompletionResponseChoicesInner :: Options
optionsCreateChatCompletionResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      , ("createChatCompletionResponseChoicesInnerIndex", "index")
      , ("createChatCompletionResponseChoicesInnerMessage", "message")
      , ("createChatCompletionResponseChoicesInnerLogprobs", "logprobs")
      ]


-- | Log probability information for the choice.
data CreateChatCompletionResponseChoicesInnerLogprobs = CreateChatCompletionResponseChoicesInnerLogprobs
  { createChatCompletionResponseChoicesInnerLogprobsContent :: [ChatCompletionTokenLogprob] -- ^ A list of message content tokens with log probability information.
  , createChatCompletionResponseChoicesInnerLogprobsRefusal :: [ChatCompletionTokenLogprob] -- ^ A list of message refusal tokens with log probability information.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionResponseChoicesInnerLogprobs where
  parseJSON = genericParseJSON optionsCreateChatCompletionResponseChoicesInnerLogprobs
instance ToJSON CreateChatCompletionResponseChoicesInnerLogprobs where
  toJSON = genericToJSON optionsCreateChatCompletionResponseChoicesInnerLogprobs

optionsCreateChatCompletionResponseChoicesInnerLogprobs :: Options
optionsCreateChatCompletionResponseChoicesInnerLogprobs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionResponseChoicesInnerLogprobsContent", "content")
      , ("createChatCompletionResponseChoicesInnerLogprobsRefusal", "refusal")
      ]


-- | Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
data CreateChatCompletionStreamResponse = CreateChatCompletionStreamResponse
  { createChatCompletionStreamResponseId :: Text -- ^ A unique identifier for the chat completion. Each chunk has the same ID.
  , createChatCompletionStreamResponseChoices :: [CreateChatCompletionStreamResponseChoicesInner] -- ^ A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
  , createChatCompletionStreamResponseCreated :: Int -- ^ The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  , createChatCompletionStreamResponseModel :: Text -- ^ The model to generate the completion.
  , createChatCompletionStreamResponseServiceUnderscoretier :: Maybe Text -- ^ The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  , createChatCompletionStreamResponseSystemUnderscorefingerprint :: Maybe Text -- ^ This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  , createChatCompletionStreamResponseObject :: Text -- ^ The object type, which is always `chat.completion.chunk`.
  , createChatCompletionStreamResponseUsage :: Maybe CreateChatCompletionStreamResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionStreamResponse where
  parseJSON = genericParseJSON optionsCreateChatCompletionStreamResponse
instance ToJSON CreateChatCompletionStreamResponse where
  toJSON = genericToJSON optionsCreateChatCompletionStreamResponse

optionsCreateChatCompletionStreamResponse :: Options
optionsCreateChatCompletionStreamResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionStreamResponseId", "id")
      , ("createChatCompletionStreamResponseChoices", "choices")
      , ("createChatCompletionStreamResponseCreated", "created")
      , ("createChatCompletionStreamResponseModel", "model")
      , ("createChatCompletionStreamResponseServiceUnderscoretier", "service_tier")
      , ("createChatCompletionStreamResponseSystemUnderscorefingerprint", "system_fingerprint")
      , ("createChatCompletionStreamResponseObject", "object")
      , ("createChatCompletionStreamResponseUsage", "usage")
      ]


-- | 
data CreateChatCompletionStreamResponseChoicesInner = CreateChatCompletionStreamResponseChoicesInner
  { createChatCompletionStreamResponseChoicesInnerDelta :: ChatCompletionStreamResponseDelta -- ^ 
  , createChatCompletionStreamResponseChoicesInnerLogprobs :: Maybe CreateChatCompletionResponseChoicesInnerLogprobs -- ^ 
  , createChatCompletionStreamResponseChoicesInnerFinishUnderscorereason :: Text -- ^ The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
  , createChatCompletionStreamResponseChoicesInnerIndex :: Int -- ^ The index of the choice in the list of choices.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionStreamResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateChatCompletionStreamResponseChoicesInner
instance ToJSON CreateChatCompletionStreamResponseChoicesInner where
  toJSON = genericToJSON optionsCreateChatCompletionStreamResponseChoicesInner

optionsCreateChatCompletionStreamResponseChoicesInner :: Options
optionsCreateChatCompletionStreamResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionStreamResponseChoicesInnerDelta", "delta")
      , ("createChatCompletionStreamResponseChoicesInnerLogprobs", "logprobs")
      , ("createChatCompletionStreamResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      , ("createChatCompletionStreamResponseChoicesInnerIndex", "index")
      ]


-- | An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
data CreateChatCompletionStreamResponseUsage = CreateChatCompletionStreamResponseUsage
  { createChatCompletionStreamResponseUsageCompletionUnderscoretokens :: Int -- ^ Number of tokens in the generated completion.
  , createChatCompletionStreamResponseUsagePromptUnderscoretokens :: Int -- ^ Number of tokens in the prompt.
  , createChatCompletionStreamResponseUsageTotalUnderscoretokens :: Int -- ^ Total number of tokens used in the request (prompt + completion).
  } deriving (Show, Eq, Generic)

instance FromJSON CreateChatCompletionStreamResponseUsage where
  parseJSON = genericParseJSON optionsCreateChatCompletionStreamResponseUsage
instance ToJSON CreateChatCompletionStreamResponseUsage where
  toJSON = genericToJSON optionsCreateChatCompletionStreamResponseUsage

optionsCreateChatCompletionStreamResponseUsage :: Options
optionsCreateChatCompletionStreamResponseUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createChatCompletionStreamResponseUsageCompletionUnderscoretokens", "completion_tokens")
      , ("createChatCompletionStreamResponseUsagePromptUnderscoretokens", "prompt_tokens")
      , ("createChatCompletionStreamResponseUsageTotalUnderscoretokens", "total_tokens")
      ]


-- | 
data CreateCompletionRequest = CreateCompletionRequest
  { createCompletionRequestModel :: CreateCompletionRequestModel -- ^ 
  , createCompletionRequestPrompt :: CreateCompletionRequestPrompt -- ^ 
  , createCompletionRequestBestUnderscoreof :: Maybe Int -- ^ Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  , createCompletionRequestEcho :: Maybe Bool -- ^ Echo back the prompt in addition to the completion 
  , createCompletionRequestFrequencyUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation) 
  , createCompletionRequestLogitUnderscorebias :: Maybe (Map.Map String Int) -- ^ Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
  , createCompletionRequestLogprobs :: Maybe Int -- ^ Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
  , createCompletionRequestMaxUnderscoretokens :: Maybe Int -- ^ The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
  , createCompletionRequestN :: Maybe Int -- ^ How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  , createCompletionRequestPresenceUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation) 
  , createCompletionRequestSeed :: Maybe Int -- ^ If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
  , createCompletionRequestStop :: Maybe CreateCompletionRequestStop -- ^ 
  , createCompletionRequestStream :: Maybe Bool -- ^ Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
  , createCompletionRequestStreamUnderscoreoptions :: Maybe ChatCompletionStreamOptions -- ^ 
  , createCompletionRequestSuffix :: Maybe Text -- ^ The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. 
  , createCompletionRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  , createCompletionRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  , createCompletionRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequest where
  parseJSON = genericParseJSON optionsCreateCompletionRequest
instance ToJSON CreateCompletionRequest where
  toJSON = genericToJSON optionsCreateCompletionRequest

optionsCreateCompletionRequest :: Options
optionsCreateCompletionRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionRequestModel", "model")
      , ("createCompletionRequestPrompt", "prompt")
      , ("createCompletionRequestBestUnderscoreof", "best_of")
      , ("createCompletionRequestEcho", "echo")
      , ("createCompletionRequestFrequencyUnderscorepenalty", "frequency_penalty")
      , ("createCompletionRequestLogitUnderscorebias", "logit_bias")
      , ("createCompletionRequestLogprobs", "logprobs")
      , ("createCompletionRequestMaxUnderscoretokens", "max_tokens")
      , ("createCompletionRequestN", "n")
      , ("createCompletionRequestPresenceUnderscorepenalty", "presence_penalty")
      , ("createCompletionRequestSeed", "seed")
      , ("createCompletionRequestStop", "stop")
      , ("createCompletionRequestStream", "stream")
      , ("createCompletionRequestStreamUnderscoreoptions", "stream_options")
      , ("createCompletionRequestSuffix", "suffix")
      , ("createCompletionRequestTemperature", "temperature")
      , ("createCompletionRequestTopUnderscorep", "top_p")
      , ("createCompletionRequestUser", "user")
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
data CreateCompletionRequestModel = CreateCompletionRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequestModel where
  parseJSON = genericParseJSON optionsCreateCompletionRequestModel
instance ToJSON CreateCompletionRequestModel where
  toJSON = genericToJSON optionsCreateCompletionRequestModel

optionsCreateCompletionRequestModel :: Options
optionsCreateCompletionRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
data CreateCompletionRequestPrompt = CreateCompletionRequestPrompt
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequestPrompt where
  parseJSON = genericParseJSON optionsCreateCompletionRequestPrompt
instance ToJSON CreateCompletionRequestPrompt where
  toJSON = genericToJSON optionsCreateCompletionRequestPrompt

optionsCreateCompletionRequestPrompt :: Options
optionsCreateCompletionRequestPrompt =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Up to 4 sequences where the API will stop generating further tokens. The returned text will not contain the stop sequence. 
data CreateCompletionRequestStop = CreateCompletionRequestStop
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionRequestStop where
  parseJSON = genericParseJSON optionsCreateCompletionRequestStop
instance ToJSON CreateCompletionRequestStop where
  toJSON = genericToJSON optionsCreateCompletionRequestStop

optionsCreateCompletionRequestStop :: Options
optionsCreateCompletionRequestStop =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
data CreateCompletionResponse = CreateCompletionResponse
  { createCompletionResponseId :: Text -- ^ A unique identifier for the completion.
  , createCompletionResponseChoices :: [CreateCompletionResponseChoicesInner] -- ^ The list of completion choices the model generated for the input prompt.
  , createCompletionResponseCreated :: Int -- ^ The Unix timestamp (in seconds) of when the completion was created.
  , createCompletionResponseModel :: Text -- ^ The model used for completion.
  , createCompletionResponseSystemUnderscorefingerprint :: Maybe Text -- ^ This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  , createCompletionResponseObject :: Text -- ^ The object type, which is always \"text_completion\"
  , createCompletionResponseUsage :: Maybe CompletionUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponse where
  parseJSON = genericParseJSON optionsCreateCompletionResponse
instance ToJSON CreateCompletionResponse where
  toJSON = genericToJSON optionsCreateCompletionResponse

optionsCreateCompletionResponse :: Options
optionsCreateCompletionResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseId", "id")
      , ("createCompletionResponseChoices", "choices")
      , ("createCompletionResponseCreated", "created")
      , ("createCompletionResponseModel", "model")
      , ("createCompletionResponseSystemUnderscorefingerprint", "system_fingerprint")
      , ("createCompletionResponseObject", "object")
      , ("createCompletionResponseUsage", "usage")
      ]


-- | 
data CreateCompletionResponseChoicesInner = CreateCompletionResponseChoicesInner
  { createCompletionResponseChoicesInnerFinishUnderscorereason :: Text -- ^ The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
  , createCompletionResponseChoicesInnerIndex :: Int -- ^ 
  , createCompletionResponseChoicesInnerLogprobs :: CreateCompletionResponseChoicesInnerLogprobs -- ^ 
  , createCompletionResponseChoicesInnerText :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponseChoicesInner where
  parseJSON = genericParseJSON optionsCreateCompletionResponseChoicesInner
instance ToJSON CreateCompletionResponseChoicesInner where
  toJSON = genericToJSON optionsCreateCompletionResponseChoicesInner

optionsCreateCompletionResponseChoicesInner :: Options
optionsCreateCompletionResponseChoicesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseChoicesInnerFinishUnderscorereason", "finish_reason")
      , ("createCompletionResponseChoicesInnerIndex", "index")
      , ("createCompletionResponseChoicesInnerLogprobs", "logprobs")
      , ("createCompletionResponseChoicesInnerText", "text")
      ]


-- | 
data CreateCompletionResponseChoicesInnerLogprobs = CreateCompletionResponseChoicesInnerLogprobs
  { createCompletionResponseChoicesInnerLogprobsTextUnderscoreoffset :: Maybe [Int] -- ^ 
  , createCompletionResponseChoicesInnerLogprobsTokenUnderscorelogprobs :: Maybe [Double] -- ^ 
  , createCompletionResponseChoicesInnerLogprobsTokens :: Maybe [Text] -- ^ 
  , createCompletionResponseChoicesInnerLogprobsTopUnderscorelogprobs :: Maybe [(Map.Map String Double)] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateCompletionResponseChoicesInnerLogprobs where
  parseJSON = genericParseJSON optionsCreateCompletionResponseChoicesInnerLogprobs
instance ToJSON CreateCompletionResponseChoicesInnerLogprobs where
  toJSON = genericToJSON optionsCreateCompletionResponseChoicesInnerLogprobs

optionsCreateCompletionResponseChoicesInnerLogprobs :: Options
optionsCreateCompletionResponseChoicesInnerLogprobs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createCompletionResponseChoicesInnerLogprobsTextUnderscoreoffset", "text_offset")
      , ("createCompletionResponseChoicesInnerLogprobsTokenUnderscorelogprobs", "token_logprobs")
      , ("createCompletionResponseChoicesInnerLogprobsTokens", "tokens")
      , ("createCompletionResponseChoicesInnerLogprobsTopUnderscorelogprobs", "top_logprobs")
      ]


-- | 
data CreateEmbeddingRequest = CreateEmbeddingRequest
  { createEmbeddingRequestInput :: CreateEmbeddingRequestInput -- ^ 
  , createEmbeddingRequestModel :: CreateEmbeddingRequestModel -- ^ 
  , createEmbeddingRequestEncodingUnderscoreformat :: Maybe Text -- ^ The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
  , createEmbeddingRequestDimensions :: Maybe Int -- ^ The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
  , createEmbeddingRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingRequest where
  parseJSON = genericParseJSON optionsCreateEmbeddingRequest
instance ToJSON CreateEmbeddingRequest where
  toJSON = genericToJSON optionsCreateEmbeddingRequest

optionsCreateEmbeddingRequest :: Options
optionsCreateEmbeddingRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingRequestInput", "input")
      , ("createEmbeddingRequestModel", "model")
      , ("createEmbeddingRequestEncodingUnderscoreformat", "encoding_format")
      , ("createEmbeddingRequestDimensions", "dimensions")
      , ("createEmbeddingRequestUser", "user")
      ]


-- | Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for &#x60;text-embedding-ada-002&#x60;), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
data CreateEmbeddingRequestInput = CreateEmbeddingRequestInput
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingRequestInput where
  parseJSON = genericParseJSON optionsCreateEmbeddingRequestInput
instance ToJSON CreateEmbeddingRequestInput where
  toJSON = genericToJSON optionsCreateEmbeddingRequestInput

optionsCreateEmbeddingRequestInput :: Options
optionsCreateEmbeddingRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models) for descriptions of them. 
data CreateEmbeddingRequestModel = CreateEmbeddingRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingRequestModel where
  parseJSON = genericParseJSON optionsCreateEmbeddingRequestModel
instance ToJSON CreateEmbeddingRequestModel where
  toJSON = genericToJSON optionsCreateEmbeddingRequestModel

optionsCreateEmbeddingRequestModel :: Options
optionsCreateEmbeddingRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateEmbeddingResponse = CreateEmbeddingResponse
  { createEmbeddingResponseData :: [Embedding] -- ^ The list of embeddings generated by the model.
  , createEmbeddingResponseModel :: Text -- ^ The name of the model used to generate the embedding.
  , createEmbeddingResponseObject :: Text -- ^ The object type, which is always \"list\".
  , createEmbeddingResponseUsage :: CreateEmbeddingResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingResponse where
  parseJSON = genericParseJSON optionsCreateEmbeddingResponse
instance ToJSON CreateEmbeddingResponse where
  toJSON = genericToJSON optionsCreateEmbeddingResponse

optionsCreateEmbeddingResponse :: Options
optionsCreateEmbeddingResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingResponseData", "data")
      , ("createEmbeddingResponseModel", "model")
      , ("createEmbeddingResponseObject", "object")
      , ("createEmbeddingResponseUsage", "usage")
      ]


-- | The usage information for the request.
data CreateEmbeddingResponseUsage = CreateEmbeddingResponseUsage
  { createEmbeddingResponseUsagePromptUnderscoretokens :: Int -- ^ The number of tokens used by the prompt.
  , createEmbeddingResponseUsageTotalUnderscoretokens :: Int -- ^ The total number of tokens used by the request.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateEmbeddingResponseUsage where
  parseJSON = genericParseJSON optionsCreateEmbeddingResponseUsage
instance ToJSON CreateEmbeddingResponseUsage where
  toJSON = genericToJSON optionsCreateEmbeddingResponseUsage

optionsCreateEmbeddingResponseUsage :: Options
optionsCreateEmbeddingResponseUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createEmbeddingResponseUsagePromptUnderscoretokens", "prompt_tokens")
      , ("createEmbeddingResponseUsageTotalUnderscoretokens", "total_tokens")
      ]


-- | 
data CreateFineTuningJobRequest = CreateFineTuningJobRequest
  { createFineTuningJobRequestModel :: CreateFineTuningJobRequestModel -- ^ 
  , createFineTuningJobRequestTrainingUnderscorefile :: Text -- ^ The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  , createFineTuningJobRequestHyperparameters :: Maybe CreateFineTuningJobRequestHyperparameters -- ^ 
  , createFineTuningJobRequestSuffix :: Maybe Text -- ^ A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
  , createFineTuningJobRequestValidationUnderscorefile :: Maybe Text -- ^ The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  , createFineTuningJobRequestIntegrations :: Maybe [CreateFineTuningJobRequestIntegrationsInner] -- ^ A list of integrations to enable for your fine-tuning job.
  , createFineTuningJobRequestSeed :: Maybe Int -- ^ The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
  , createFineTuningJobRequestMethod :: Maybe FineTuneMethod -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequest where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequest
instance ToJSON CreateFineTuningJobRequest where
  toJSON = genericToJSON optionsCreateFineTuningJobRequest

optionsCreateFineTuningJobRequest :: Options
optionsCreateFineTuningJobRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createFineTuningJobRequestModel", "model")
      , ("createFineTuningJobRequestTrainingUnderscorefile", "training_file")
      , ("createFineTuningJobRequestHyperparameters", "hyperparameters")
      , ("createFineTuningJobRequestSuffix", "suffix")
      , ("createFineTuningJobRequestValidationUnderscorefile", "validation_file")
      , ("createFineTuningJobRequestIntegrations", "integrations")
      , ("createFineTuningJobRequestSeed", "seed")
      , ("createFineTuningJobRequestMethod", "method")
      ]


-- | The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter. 
data CreateFineTuningJobRequestHyperparameters = CreateFineTuningJobRequestHyperparameters
  { createFineTuningJobRequestHyperparametersBatchUnderscoresize :: Maybe CreateFineTuningJobRequestHyperparametersBatchSize -- ^ 
  , createFineTuningJobRequestHyperparametersLearningUnderscorerateUnderscoremultiplier :: Maybe CreateFineTuningJobRequestHyperparametersLearningRateMultiplier -- ^ 
  , createFineTuningJobRequestHyperparametersNUnderscoreepochs :: Maybe CreateFineTuningJobRequestHyperparametersNEpochs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestHyperparameters where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestHyperparameters
instance ToJSON CreateFineTuningJobRequestHyperparameters where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestHyperparameters

optionsCreateFineTuningJobRequestHyperparameters :: Options
optionsCreateFineTuningJobRequestHyperparameters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createFineTuningJobRequestHyperparametersBatchUnderscoresize", "batch_size")
      , ("createFineTuningJobRequestHyperparametersLearningUnderscorerateUnderscoremultiplier", "learning_rate_multiplier")
      , ("createFineTuningJobRequestHyperparametersNUnderscoreepochs", "n_epochs")
      ]


-- | Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
data CreateFineTuningJobRequestHyperparametersBatchSize = CreateFineTuningJobRequestHyperparametersBatchSize
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestHyperparametersBatchSize where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestHyperparametersBatchSize
instance ToJSON CreateFineTuningJobRequestHyperparametersBatchSize where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestHyperparametersBatchSize

optionsCreateFineTuningJobRequestHyperparametersBatchSize :: Options
optionsCreateFineTuningJobRequestHyperparametersBatchSize =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
data CreateFineTuningJobRequestHyperparametersLearningRateMultiplier = CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestHyperparametersLearningRateMultiplier where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier
instance ToJSON CreateFineTuningJobRequestHyperparametersLearningRateMultiplier where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier

optionsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier :: Options
optionsCreateFineTuningJobRequestHyperparametersLearningRateMultiplier =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
data CreateFineTuningJobRequestHyperparametersNEpochs = CreateFineTuningJobRequestHyperparametersNEpochs
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestHyperparametersNEpochs where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestHyperparametersNEpochs
instance ToJSON CreateFineTuningJobRequestHyperparametersNEpochs where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestHyperparametersNEpochs

optionsCreateFineTuningJobRequestHyperparametersNEpochs :: Options
optionsCreateFineTuningJobRequestHyperparametersNEpochs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateFineTuningJobRequestIntegrationsInner = CreateFineTuningJobRequestIntegrationsInner
  { createFineTuningJobRequestIntegrationsInnerType :: Text -- ^ 
  , createFineTuningJobRequestIntegrationsInnerWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestIntegrationsInner where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestIntegrationsInner
instance ToJSON CreateFineTuningJobRequestIntegrationsInner where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestIntegrationsInner

optionsCreateFineTuningJobRequestIntegrationsInner :: Options
optionsCreateFineTuningJobRequestIntegrationsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createFineTuningJobRequestIntegrationsInnerType", "type")
      , ("createFineTuningJobRequestIntegrationsInnerWandb", "wandb")
      ]


-- | The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
data CreateFineTuningJobRequestIntegrationsInnerWandb = CreateFineTuningJobRequestIntegrationsInnerWandb
  { createFineTuningJobRequestIntegrationsInnerWandbProject :: Text -- ^ The name of the project that the new run will be created under. 
  , createFineTuningJobRequestIntegrationsInnerWandbName :: Maybe Text -- ^ A display name to set for the run. If not set, we will use the Job ID as the name. 
  , createFineTuningJobRequestIntegrationsInnerWandbEntity :: Maybe Text -- ^ The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
  , createFineTuningJobRequestIntegrationsInnerWandbTags :: Maybe [Text] -- ^ A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestIntegrationsInnerWandb where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestIntegrationsInnerWandb
instance ToJSON CreateFineTuningJobRequestIntegrationsInnerWandb where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestIntegrationsInnerWandb

optionsCreateFineTuningJobRequestIntegrationsInnerWandb :: Options
optionsCreateFineTuningJobRequestIntegrationsInnerWandb =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createFineTuningJobRequestIntegrationsInnerWandbProject", "project")
      , ("createFineTuningJobRequestIntegrationsInnerWandbName", "name")
      , ("createFineTuningJobRequestIntegrationsInnerWandbEntity", "entity")
      , ("createFineTuningJobRequestIntegrationsInnerWandbTags", "tags")
      ]


-- | The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
data CreateFineTuningJobRequestModel = CreateFineTuningJobRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateFineTuningJobRequestModel where
  parseJSON = genericParseJSON optionsCreateFineTuningJobRequestModel
instance ToJSON CreateFineTuningJobRequestModel where
  toJSON = genericToJSON optionsCreateFineTuningJobRequestModel

optionsCreateFineTuningJobRequestModel :: Options
optionsCreateFineTuningJobRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
data CreateImageEditRequestModel = CreateImageEditRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateImageEditRequestModel where
  parseJSON = genericParseJSON optionsCreateImageEditRequestModel
instance ToJSON CreateImageEditRequestModel where
  toJSON = genericToJSON optionsCreateImageEditRequestModel

optionsCreateImageEditRequestModel :: Options
optionsCreateImageEditRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateImageRequest = CreateImageRequest
  { createImageRequestPrompt :: Text -- ^ A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
  , createImageRequestModel :: Maybe CreateImageRequestModel -- ^ 
  , createImageRequestN :: Maybe Int -- ^ The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
  , createImageRequestQuality :: Maybe Text -- ^ The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
  , createImageRequestResponseUnderscoreformat :: Maybe Text -- ^ The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
  , createImageRequestSize :: Maybe Text -- ^ The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
  , createImageRequestStyle :: Maybe Text -- ^ The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
  , createImageRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateImageRequest where
  parseJSON = genericParseJSON optionsCreateImageRequest
instance ToJSON CreateImageRequest where
  toJSON = genericToJSON optionsCreateImageRequest

optionsCreateImageRequest :: Options
optionsCreateImageRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createImageRequestPrompt", "prompt")
      , ("createImageRequestModel", "model")
      , ("createImageRequestN", "n")
      , ("createImageRequestQuality", "quality")
      , ("createImageRequestResponseUnderscoreformat", "response_format")
      , ("createImageRequestSize", "size")
      , ("createImageRequestStyle", "style")
      , ("createImageRequestUser", "user")
      ]


-- | The model to use for image generation.
data CreateImageRequestModel = CreateImageRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateImageRequestModel where
  parseJSON = genericParseJSON optionsCreateImageRequestModel
instance ToJSON CreateImageRequestModel where
  toJSON = genericToJSON optionsCreateImageRequestModel

optionsCreateImageRequestModel :: Options
optionsCreateImageRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateMessageRequest = CreateMessageRequest
  { createMessageRequestRole :: Text -- ^ The role of the entity that is creating the message. Allowed values include: - `user`: Indicates the message is sent by an actual user and should be used in most cases to represent user-generated messages. - `assistant`: Indicates the message is generated by the assistant. Use this value to insert messages from the assistant into the conversation. 
  , createMessageRequestContent :: CreateMessageRequestContent -- ^ 
  , createMessageRequestAttachments :: Maybe [CreateMessageRequestAttachmentsInner] -- ^ A list of files attached to the message, and the tools they should be added to.
  , createMessageRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMessageRequest where
  parseJSON = genericParseJSON optionsCreateMessageRequest
instance ToJSON CreateMessageRequest where
  toJSON = genericToJSON optionsCreateMessageRequest

optionsCreateMessageRequest :: Options
optionsCreateMessageRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createMessageRequestRole", "role")
      , ("createMessageRequestContent", "content")
      , ("createMessageRequestAttachments", "attachments")
      , ("createMessageRequestMetadata", "metadata")
      ]


-- | 
data CreateMessageRequestAttachmentsInner = CreateMessageRequestAttachmentsInner
  { createMessageRequestAttachmentsInnerFileUnderscoreid :: Maybe Text -- ^ The ID of the file to attach to the message.
  , createMessageRequestAttachmentsInnerTools :: Maybe [CreateMessageRequestAttachmentsInnerToolsInner] -- ^ The tools to add this file to.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMessageRequestAttachmentsInner where
  parseJSON = genericParseJSON optionsCreateMessageRequestAttachmentsInner
instance ToJSON CreateMessageRequestAttachmentsInner where
  toJSON = genericToJSON optionsCreateMessageRequestAttachmentsInner

optionsCreateMessageRequestAttachmentsInner :: Options
optionsCreateMessageRequestAttachmentsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createMessageRequestAttachmentsInnerFileUnderscoreid", "file_id")
      , ("createMessageRequestAttachmentsInnerTools", "tools")
      ]


-- | 
data CreateMessageRequestAttachmentsInnerToolsInner = CreateMessageRequestAttachmentsInnerToolsInner
  { createMessageRequestAttachmentsInnerToolsInnerType :: Text -- ^ The type of tool being defined: `code_interpreter`
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMessageRequestAttachmentsInnerToolsInner where
  parseJSON = genericParseJSON optionsCreateMessageRequestAttachmentsInnerToolsInner
instance ToJSON CreateMessageRequestAttachmentsInnerToolsInner where
  toJSON = genericToJSON optionsCreateMessageRequestAttachmentsInnerToolsInner

optionsCreateMessageRequestAttachmentsInnerToolsInner :: Options
optionsCreateMessageRequestAttachmentsInnerToolsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createMessageRequestAttachmentsInnerToolsInnerType", "type")
      ]


-- | 
data CreateMessageRequestContent = CreateMessageRequestContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateMessageRequestContent where
  parseJSON = genericParseJSON optionsCreateMessageRequestContent
instance ToJSON CreateMessageRequestContent where
  toJSON = genericToJSON optionsCreateMessageRequestContent

optionsCreateMessageRequestContent :: Options
optionsCreateMessageRequestContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateModerationRequest = CreateModerationRequest
  { createModerationRequestInput :: CreateModerationRequestInput -- ^ 
  , createModerationRequestModel :: Maybe CreateModerationRequestModel -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequest where
  parseJSON = genericParseJSON optionsCreateModerationRequest
instance ToJSON CreateModerationRequest where
  toJSON = genericToJSON optionsCreateModerationRequest

optionsCreateModerationRequest :: Options
optionsCreateModerationRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationRequestInput", "input")
      , ("createModerationRequestModel", "model")
      ]


-- | Input (or inputs) to classify. Can be a single string, an array of strings, or an array of multi-modal input objects similar to other models. 
data CreateModerationRequestInput = CreateModerationRequestInput
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestInput where
  parseJSON = genericParseJSON optionsCreateModerationRequestInput
instance ToJSON CreateModerationRequestInput where
  toJSON = genericToJSON optionsCreateModerationRequestInput

optionsCreateModerationRequestInput :: Options
optionsCreateModerationRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateModerationRequestInputOneOfInner = CreateModerationRequestInputOneOfInner
  { createModerationRequestInputOneOfInnerType :: Text -- ^ Always `image_url`.
  , createModerationRequestInputOneOfInnerImageUnderscoreurl :: CreateModerationRequestInputOneOfInnerOneOfImageUrl -- ^ 
  , createModerationRequestInputOneOfInnerText :: Text -- ^ A string of text to classify.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestInputOneOfInner where
  parseJSON = genericParseJSON optionsCreateModerationRequestInputOneOfInner
instance ToJSON CreateModerationRequestInputOneOfInner where
  toJSON = genericToJSON optionsCreateModerationRequestInputOneOfInner

optionsCreateModerationRequestInputOneOfInner :: Options
optionsCreateModerationRequestInputOneOfInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationRequestInputOneOfInnerType", "type")
      , ("createModerationRequestInputOneOfInnerImageUnderscoreurl", "image_url")
      , ("createModerationRequestInputOneOfInnerText", "text")
      ]


-- | An object describing an image to classify.
data CreateModerationRequestInputOneOfInnerOneOf = CreateModerationRequestInputOneOfInnerOneOf
  { createModerationRequestInputOneOfInnerOneOfType :: Text -- ^ Always `image_url`.
  , createModerationRequestInputOneOfInnerOneOfImageUnderscoreurl :: CreateModerationRequestInputOneOfInnerOneOfImageUrl -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestInputOneOfInnerOneOf where
  parseJSON = genericParseJSON optionsCreateModerationRequestInputOneOfInnerOneOf
instance ToJSON CreateModerationRequestInputOneOfInnerOneOf where
  toJSON = genericToJSON optionsCreateModerationRequestInputOneOfInnerOneOf

optionsCreateModerationRequestInputOneOfInnerOneOf :: Options
optionsCreateModerationRequestInputOneOfInnerOneOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationRequestInputOneOfInnerOneOfType", "type")
      , ("createModerationRequestInputOneOfInnerOneOfImageUnderscoreurl", "image_url")
      ]


-- | An object describing text to classify.
data CreateModerationRequestInputOneOfInnerOneOf1 = CreateModerationRequestInputOneOfInnerOneOf1
  { createModerationRequestInputOneOfInnerOneOf1Type :: Text -- ^ Always `text`.
  , createModerationRequestInputOneOfInnerOneOf1Text :: Text -- ^ A string of text to classify.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestInputOneOfInnerOneOf1 where
  parseJSON = genericParseJSON optionsCreateModerationRequestInputOneOfInnerOneOf1
instance ToJSON CreateModerationRequestInputOneOfInnerOneOf1 where
  toJSON = genericToJSON optionsCreateModerationRequestInputOneOfInnerOneOf1

optionsCreateModerationRequestInputOneOfInnerOneOf1 :: Options
optionsCreateModerationRequestInputOneOfInnerOneOf1 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationRequestInputOneOfInnerOneOf1Type", "type")
      , ("createModerationRequestInputOneOfInnerOneOf1Text", "text")
      ]


-- | Contains either an image URL or a data URL for a base64 encoded image.
data CreateModerationRequestInputOneOfInnerOneOfImageUrl = CreateModerationRequestInputOneOfInnerOneOfImageUrl
  { createModerationRequestInputOneOfInnerOneOfImageUrlUrl :: Text -- ^ Either a URL of the image or the base64 encoded image data.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestInputOneOfInnerOneOfImageUrl where
  parseJSON = genericParseJSON optionsCreateModerationRequestInputOneOfInnerOneOfImageUrl
instance ToJSON CreateModerationRequestInputOneOfInnerOneOfImageUrl where
  toJSON = genericToJSON optionsCreateModerationRequestInputOneOfInnerOneOfImageUrl

optionsCreateModerationRequestInputOneOfInnerOneOfImageUrl :: Options
optionsCreateModerationRequestInputOneOfInnerOneOfImageUrl =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationRequestInputOneOfInnerOneOfImageUrlUrl", "url")
      ]


-- | The content moderation model you would like to use. Learn more in [the moderation guide](/docs/guides/moderation), and learn about available models [here](/docs/models#moderation). 
data CreateModerationRequestModel = CreateModerationRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationRequestModel where
  parseJSON = genericParseJSON optionsCreateModerationRequestModel
instance ToJSON CreateModerationRequestModel where
  toJSON = genericToJSON optionsCreateModerationRequestModel

optionsCreateModerationRequestModel :: Options
optionsCreateModerationRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Represents if a given text input is potentially harmful.
data CreateModerationResponse = CreateModerationResponse
  { createModerationResponseId :: Text -- ^ The unique identifier for the moderation request.
  , createModerationResponseModel :: Text -- ^ The model used to generate the moderation results.
  , createModerationResponseResults :: [CreateModerationResponseResultsInner] -- ^ A list of moderation objects.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponse where
  parseJSON = genericParseJSON optionsCreateModerationResponse
instance ToJSON CreateModerationResponse where
  toJSON = genericToJSON optionsCreateModerationResponse

optionsCreateModerationResponse :: Options
optionsCreateModerationResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseId", "id")
      , ("createModerationResponseModel", "model")
      , ("createModerationResponseResults", "results")
      ]


-- | 
data CreateModerationResponseResultsInner = CreateModerationResponseResultsInner
  { createModerationResponseResultsInnerFlagged :: Bool -- ^ Whether any of the below categories are flagged.
  , createModerationResponseResultsInnerCategories :: CreateModerationResponseResultsInnerCategories -- ^ 
  , createModerationResponseResultsInnerCategoryUnderscorescores :: CreateModerationResponseResultsInnerCategoryScores -- ^ 
  , createModerationResponseResultsInnerCategoryUnderscoreappliedUnderscoreinputUnderscoretypes :: CreateModerationResponseResultsInnerCategoryAppliedInputTypes -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInner where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInner
instance ToJSON CreateModerationResponseResultsInner where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInner

optionsCreateModerationResponseResultsInner :: Options
optionsCreateModerationResponseResultsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerFlagged", "flagged")
      , ("createModerationResponseResultsInnerCategories", "categories")
      , ("createModerationResponseResultsInnerCategoryUnderscorescores", "category_scores")
      , ("createModerationResponseResultsInnerCategoryUnderscoreappliedUnderscoreinputUnderscoretypes", "category_applied_input_types")
      ]


-- | A list of the categories, and whether they are flagged or not.
data CreateModerationResponseResultsInnerCategories = CreateModerationResponseResultsInnerCategories
  { createModerationResponseResultsInnerCategoriesHate :: Bool -- ^ Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  , createModerationResponseResultsInnerCategoriesHateSlashthreatening :: Bool -- ^ Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  , createModerationResponseResultsInnerCategoriesHarassment :: Bool -- ^ Content that expresses, incites, or promotes harassing language towards any target.
  , createModerationResponseResultsInnerCategoriesHarassmentSlashthreatening :: Bool -- ^ Harassment content that also includes violence or serious harm towards any target.
  , createModerationResponseResultsInnerCategoriesIllicit :: Bool -- ^ Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, \"how to shoplift\" would fit this category.
  , createModerationResponseResultsInnerCategoriesIllicitSlashviolent :: Bool -- ^ Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
  , createModerationResponseResultsInnerCategoriesSelfDashharm :: Bool -- ^ Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
  , createModerationResponseResultsInnerCategoriesSelfDashharmSlashintent :: Bool -- ^ Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
  , createModerationResponseResultsInnerCategoriesSelfDashharmSlashinstructions :: Bool -- ^ Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
  , createModerationResponseResultsInnerCategoriesSexual :: Bool -- ^ Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
  , createModerationResponseResultsInnerCategoriesSexualSlashminors :: Bool -- ^ Sexual content that includes an individual who is under 18 years old.
  , createModerationResponseResultsInnerCategoriesViolence :: Bool -- ^ Content that depicts death, violence, or physical injury.
  , createModerationResponseResultsInnerCategoriesViolenceSlashgraphic :: Bool -- ^ Content that depicts death, violence, or physical injury in graphic detail.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInnerCategories where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInnerCategories
instance ToJSON CreateModerationResponseResultsInnerCategories where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInnerCategories

optionsCreateModerationResponseResultsInnerCategories :: Options
optionsCreateModerationResponseResultsInnerCategories =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerCategoriesHate", "hate")
      , ("createModerationResponseResultsInnerCategoriesHateSlashthreatening", "hate/threatening")
      , ("createModerationResponseResultsInnerCategoriesHarassment", "harassment")
      , ("createModerationResponseResultsInnerCategoriesHarassmentSlashthreatening", "harassment/threatening")
      , ("createModerationResponseResultsInnerCategoriesIllicit", "illicit")
      , ("createModerationResponseResultsInnerCategoriesIllicitSlashviolent", "illicit/violent")
      , ("createModerationResponseResultsInnerCategoriesSelfDashharm", "self-harm")
      , ("createModerationResponseResultsInnerCategoriesSelfDashharmSlashintent", "self-harm/intent")
      , ("createModerationResponseResultsInnerCategoriesSelfDashharmSlashinstructions", "self-harm/instructions")
      , ("createModerationResponseResultsInnerCategoriesSexual", "sexual")
      , ("createModerationResponseResultsInnerCategoriesSexualSlashminors", "sexual/minors")
      , ("createModerationResponseResultsInnerCategoriesViolence", "violence")
      , ("createModerationResponseResultsInnerCategoriesViolenceSlashgraphic", "violence/graphic")
      ]


-- | A list of the categories along with the input type(s) that the score applies to.
data CreateModerationResponseResultsInnerCategoryAppliedInputTypes = CreateModerationResponseResultsInnerCategoryAppliedInputTypes
  { createModerationResponseResultsInnerCategoryAppliedInputTypesHate :: [Text] -- ^ The applied input type(s) for the category 'hate'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashthreatening :: [Text] -- ^ The applied input type(s) for the category 'hate/threatening'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesHarassment :: [Text] -- ^ The applied input type(s) for the category 'harassment'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashthreatening :: [Text] -- ^ The applied input type(s) for the category 'harassment/threatening'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesIllicit :: [Text] -- ^ The applied input type(s) for the category 'illicit'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashviolent :: [Text] -- ^ The applied input type(s) for the category 'illicit/violent'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesSelfDashharm :: [Text] -- ^ The applied input type(s) for the category 'self-harm'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesSelfDashharmSlashintent :: [Text] -- ^ The applied input type(s) for the category 'self-harm/intent'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesSelfDashharmSlashinstructions :: [Text] -- ^ The applied input type(s) for the category 'self-harm/instructions'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesSexual :: [Text] -- ^ The applied input type(s) for the category 'sexual'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashminors :: [Text] -- ^ The applied input type(s) for the category 'sexual/minors'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesViolence :: [Text] -- ^ The applied input type(s) for the category 'violence'.
  , createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashgraphic :: [Text] -- ^ The applied input type(s) for the category 'violence/graphic'.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInnerCategoryAppliedInputTypes where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInnerCategoryAppliedInputTypes
instance ToJSON CreateModerationResponseResultsInnerCategoryAppliedInputTypes where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInnerCategoryAppliedInputTypes

optionsCreateModerationResponseResultsInnerCategoryAppliedInputTypes :: Options
optionsCreateModerationResponseResultsInnerCategoryAppliedInputTypes =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerCategoryAppliedInputTypesHate", "hate")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesHateSlashthreatening", "hate/threatening")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesHarassment", "harassment")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesHarassmentSlashthreatening", "harassment/threatening")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesIllicit", "illicit")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesIllicitSlashviolent", "illicit/violent")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesSelfDashharm", "self-harm")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesSelfDashharmSlashintent", "self-harm/intent")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesSelfDashharmSlashinstructions", "self-harm/instructions")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesSexual", "sexual")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesSexualSlashminors", "sexual/minors")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesViolence", "violence")
      , ("createModerationResponseResultsInnerCategoryAppliedInputTypesViolenceSlashgraphic", "violence/graphic")
      ]


-- | A list of the categories along with their scores as predicted by model.
data CreateModerationResponseResultsInnerCategoryScores = CreateModerationResponseResultsInnerCategoryScores
  { createModerationResponseResultsInnerCategoryScoresHate :: Double -- ^ The score for the category 'hate'.
  , createModerationResponseResultsInnerCategoryScoresHateSlashthreatening :: Double -- ^ The score for the category 'hate/threatening'.
  , createModerationResponseResultsInnerCategoryScoresHarassment :: Double -- ^ The score for the category 'harassment'.
  , createModerationResponseResultsInnerCategoryScoresHarassmentSlashthreatening :: Double -- ^ The score for the category 'harassment/threatening'.
  , createModerationResponseResultsInnerCategoryScoresIllicit :: Double -- ^ The score for the category 'illicit'.
  , createModerationResponseResultsInnerCategoryScoresIllicitSlashviolent :: Double -- ^ The score for the category 'illicit/violent'.
  , createModerationResponseResultsInnerCategoryScoresSelfDashharm :: Double -- ^ The score for the category 'self-harm'.
  , createModerationResponseResultsInnerCategoryScoresSelfDashharmSlashintent :: Double -- ^ The score for the category 'self-harm/intent'.
  , createModerationResponseResultsInnerCategoryScoresSelfDashharmSlashinstructions :: Double -- ^ The score for the category 'self-harm/instructions'.
  , createModerationResponseResultsInnerCategoryScoresSexual :: Double -- ^ The score for the category 'sexual'.
  , createModerationResponseResultsInnerCategoryScoresSexualSlashminors :: Double -- ^ The score for the category 'sexual/minors'.
  , createModerationResponseResultsInnerCategoryScoresViolence :: Double -- ^ The score for the category 'violence'.
  , createModerationResponseResultsInnerCategoryScoresViolenceSlashgraphic :: Double -- ^ The score for the category 'violence/graphic'.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateModerationResponseResultsInnerCategoryScores where
  parseJSON = genericParseJSON optionsCreateModerationResponseResultsInnerCategoryScores
instance ToJSON CreateModerationResponseResultsInnerCategoryScores where
  toJSON = genericToJSON optionsCreateModerationResponseResultsInnerCategoryScores

optionsCreateModerationResponseResultsInnerCategoryScores :: Options
optionsCreateModerationResponseResultsInnerCategoryScores =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createModerationResponseResultsInnerCategoryScoresHate", "hate")
      , ("createModerationResponseResultsInnerCategoryScoresHateSlashthreatening", "hate/threatening")
      , ("createModerationResponseResultsInnerCategoryScoresHarassment", "harassment")
      , ("createModerationResponseResultsInnerCategoryScoresHarassmentSlashthreatening", "harassment/threatening")
      , ("createModerationResponseResultsInnerCategoryScoresIllicit", "illicit")
      , ("createModerationResponseResultsInnerCategoryScoresIllicitSlashviolent", "illicit/violent")
      , ("createModerationResponseResultsInnerCategoryScoresSelfDashharm", "self-harm")
      , ("createModerationResponseResultsInnerCategoryScoresSelfDashharmSlashintent", "self-harm/intent")
      , ("createModerationResponseResultsInnerCategoryScoresSelfDashharmSlashinstructions", "self-harm/instructions")
      , ("createModerationResponseResultsInnerCategoryScoresSexual", "sexual")
      , ("createModerationResponseResultsInnerCategoryScoresSexualSlashminors", "sexual/minors")
      , ("createModerationResponseResultsInnerCategoryScoresViolence", "violence")
      , ("createModerationResponseResultsInnerCategoryScoresViolenceSlashgraphic", "violence/graphic")
      ]


-- | 
data CreateRunRequest = CreateRunRequest
  { createRunRequestAssistantUnderscoreid :: Text -- ^ The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  , createRunRequestModel :: Maybe CreateRunRequestModel -- ^ 
  , createRunRequestInstructions :: Maybe Text -- ^ Overrides the [instructions](/docs/api-reference/assistants/createAssistant) of the assistant. This is useful for modifying the behavior on a per-run basis.
  , createRunRequestAdditionalUnderscoreinstructions :: Maybe Text -- ^ Appends additional instructions at the end of the instructions for the run. This is useful for modifying the behavior on a per-run basis without overriding other instructions.
  , createRunRequestAdditionalUnderscoremessages :: Maybe [CreateMessageRequest] -- ^ Adds additional messages to the thread before creating the run.
  , createRunRequestTools :: Maybe [AssistantObjectToolsInner] -- ^ Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  , createRunRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , createRunRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , createRunRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  , createRunRequestStream :: Maybe Bool -- ^ If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  , createRunRequestMaxUnderscorepromptUnderscoretokens :: Maybe Int -- ^ The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  , createRunRequestMaxUnderscorecompletionUnderscoretokens :: Maybe Int -- ^ The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  , createRunRequestTruncationUnderscorestrategy :: Maybe TruncationObject -- ^ 
  , createRunRequestToolUnderscorechoice :: Maybe AssistantsApiToolChoiceOption -- ^ 
  , createRunRequestParallelUnderscoretoolUnderscorecalls :: Maybe Bool -- ^ Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  , createRunRequestResponseUnderscoreformat :: Maybe AssistantsApiResponseFormatOption -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateRunRequest where
  parseJSON = genericParseJSON optionsCreateRunRequest
instance ToJSON CreateRunRequest where
  toJSON = genericToJSON optionsCreateRunRequest

optionsCreateRunRequest :: Options
optionsCreateRunRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createRunRequestAssistantUnderscoreid", "assistant_id")
      , ("createRunRequestModel", "model")
      , ("createRunRequestInstructions", "instructions")
      , ("createRunRequestAdditionalUnderscoreinstructions", "additional_instructions")
      , ("createRunRequestAdditionalUnderscoremessages", "additional_messages")
      , ("createRunRequestTools", "tools")
      , ("createRunRequestMetadata", "metadata")
      , ("createRunRequestTemperature", "temperature")
      , ("createRunRequestTopUnderscorep", "top_p")
      , ("createRunRequestStream", "stream")
      , ("createRunRequestMaxUnderscorepromptUnderscoretokens", "max_prompt_tokens")
      , ("createRunRequestMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("createRunRequestTruncationUnderscorestrategy", "truncation_strategy")
      , ("createRunRequestToolUnderscorechoice", "tool_choice")
      , ("createRunRequestParallelUnderscoretoolUnderscorecalls", "parallel_tool_calls")
      , ("createRunRequestResponseUnderscoreformat", "response_format")
      ]


-- | The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
data CreateRunRequestModel = CreateRunRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateRunRequestModel where
  parseJSON = genericParseJSON optionsCreateRunRequestModel
instance ToJSON CreateRunRequestModel where
  toJSON = genericToJSON optionsCreateRunRequestModel

optionsCreateRunRequestModel :: Options
optionsCreateRunRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateSpeechRequest = CreateSpeechRequest
  { createSpeechRequestModel :: CreateSpeechRequestModel -- ^ 
  , createSpeechRequestInput :: Text -- ^ The text to generate audio for. The maximum length is 4096 characters.
  , createSpeechRequestVoice :: Text -- ^ The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
  , createSpeechRequestResponseUnderscoreformat :: Maybe Text -- ^ The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  , createSpeechRequestSpeed :: Maybe Double -- ^ The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateSpeechRequest where
  parseJSON = genericParseJSON optionsCreateSpeechRequest
instance ToJSON CreateSpeechRequest where
  toJSON = genericToJSON optionsCreateSpeechRequest

optionsCreateSpeechRequest :: Options
optionsCreateSpeechRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createSpeechRequestModel", "model")
      , ("createSpeechRequestInput", "input")
      , ("createSpeechRequestVoice", "voice")
      , ("createSpeechRequestResponseUnderscoreformat", "response_format")
      , ("createSpeechRequestSpeed", "speed")
      ]


-- | One of the available [TTS models](/docs/models#tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
data CreateSpeechRequestModel = CreateSpeechRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateSpeechRequestModel where
  parseJSON = genericParseJSON optionsCreateSpeechRequestModel
instance ToJSON CreateSpeechRequestModel where
  toJSON = genericToJSON optionsCreateSpeechRequestModel

optionsCreateSpeechRequestModel :: Options
optionsCreateSpeechRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data CreateThreadAndRunRequest = CreateThreadAndRunRequest
  { createThreadAndRunRequestAssistantUnderscoreid :: Text -- ^ The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
  , createThreadAndRunRequestThread :: Maybe CreateThreadRequest -- ^ 
  , createThreadAndRunRequestModel :: Maybe CreateRunRequestModel -- ^ 
  , createThreadAndRunRequestInstructions :: Maybe Text -- ^ Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
  , createThreadAndRunRequestTools :: Maybe [CreateThreadAndRunRequestToolsInner] -- ^ Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
  , createThreadAndRunRequestToolUnderscoreresources :: Maybe CreateThreadAndRunRequestToolResources -- ^ 
  , createThreadAndRunRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , createThreadAndRunRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , createThreadAndRunRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  , createThreadAndRunRequestStream :: Maybe Bool -- ^ If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  , createThreadAndRunRequestMaxUnderscorepromptUnderscoretokens :: Maybe Int -- ^ The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  , createThreadAndRunRequestMaxUnderscorecompletionUnderscoretokens :: Maybe Int -- ^ The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  , createThreadAndRunRequestTruncationUnderscorestrategy :: Maybe TruncationObject -- ^ 
  , createThreadAndRunRequestToolUnderscorechoice :: Maybe AssistantsApiToolChoiceOption -- ^ 
  , createThreadAndRunRequestParallelUnderscoretoolUnderscorecalls :: Maybe Bool -- ^ Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  , createThreadAndRunRequestResponseUnderscoreformat :: Maybe AssistantsApiResponseFormatOption -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadAndRunRequest where
  parseJSON = genericParseJSON optionsCreateThreadAndRunRequest
instance ToJSON CreateThreadAndRunRequest where
  toJSON = genericToJSON optionsCreateThreadAndRunRequest

optionsCreateThreadAndRunRequest :: Options
optionsCreateThreadAndRunRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadAndRunRequestAssistantUnderscoreid", "assistant_id")
      , ("createThreadAndRunRequestThread", "thread")
      , ("createThreadAndRunRequestModel", "model")
      , ("createThreadAndRunRequestInstructions", "instructions")
      , ("createThreadAndRunRequestTools", "tools")
      , ("createThreadAndRunRequestToolUnderscoreresources", "tool_resources")
      , ("createThreadAndRunRequestMetadata", "metadata")
      , ("createThreadAndRunRequestTemperature", "temperature")
      , ("createThreadAndRunRequestTopUnderscorep", "top_p")
      , ("createThreadAndRunRequestStream", "stream")
      , ("createThreadAndRunRequestMaxUnderscorepromptUnderscoretokens", "max_prompt_tokens")
      , ("createThreadAndRunRequestMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("createThreadAndRunRequestTruncationUnderscorestrategy", "truncation_strategy")
      , ("createThreadAndRunRequestToolUnderscorechoice", "tool_choice")
      , ("createThreadAndRunRequestParallelUnderscoretoolUnderscorecalls", "parallel_tool_calls")
      , ("createThreadAndRunRequestResponseUnderscoreformat", "response_format")
      ]


-- | A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
data CreateThreadAndRunRequestToolResources = CreateThreadAndRunRequestToolResources
  { createThreadAndRunRequestToolResourcesCodeUnderscoreinterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter -- ^ 
  , createThreadAndRunRequestToolResourcesFileUnderscoresearch :: Maybe AssistantObjectToolResourcesFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadAndRunRequestToolResources where
  parseJSON = genericParseJSON optionsCreateThreadAndRunRequestToolResources
instance ToJSON CreateThreadAndRunRequestToolResources where
  toJSON = genericToJSON optionsCreateThreadAndRunRequestToolResources

optionsCreateThreadAndRunRequestToolResources :: Options
optionsCreateThreadAndRunRequestToolResources =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadAndRunRequestToolResourcesCodeUnderscoreinterpreter", "code_interpreter")
      , ("createThreadAndRunRequestToolResourcesFileUnderscoresearch", "file_search")
      ]


-- | 
data CreateThreadAndRunRequestToolsInner = CreateThreadAndRunRequestToolsInner
  { createThreadAndRunRequestToolsInnerType :: Text -- ^ The type of tool being defined: `code_interpreter`
  , createThreadAndRunRequestToolsInnerFileUnderscoresearch :: Maybe AssistantToolsFileSearchFileSearch -- ^ 
  , createThreadAndRunRequestToolsInnerFunction :: FunctionObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadAndRunRequestToolsInner where
  parseJSON = genericParseJSON optionsCreateThreadAndRunRequestToolsInner
instance ToJSON CreateThreadAndRunRequestToolsInner where
  toJSON = genericToJSON optionsCreateThreadAndRunRequestToolsInner

optionsCreateThreadAndRunRequestToolsInner :: Options
optionsCreateThreadAndRunRequestToolsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadAndRunRequestToolsInnerType", "type")
      , ("createThreadAndRunRequestToolsInnerFileUnderscoresearch", "file_search")
      , ("createThreadAndRunRequestToolsInnerFunction", "function")
      ]


-- | 
data CreateThreadRequest = CreateThreadRequest
  { createThreadRequestMessages :: Maybe [CreateMessageRequest] -- ^ A list of [messages](/docs/api-reference/messages) to start the thread with.
  , createThreadRequestToolUnderscoreresources :: Maybe CreateThreadRequestToolResources -- ^ 
  , createThreadRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadRequest where
  parseJSON = genericParseJSON optionsCreateThreadRequest
instance ToJSON CreateThreadRequest where
  toJSON = genericToJSON optionsCreateThreadRequest

optionsCreateThreadRequest :: Options
optionsCreateThreadRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadRequestMessages", "messages")
      , ("createThreadRequestToolUnderscoreresources", "tool_resources")
      , ("createThreadRequestMetadata", "metadata")
      ]


-- | A set of resources that are made available to the assistant&#39;s tools in this thread. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
data CreateThreadRequestToolResources = CreateThreadRequestToolResources
  { createThreadRequestToolResourcesCodeUnderscoreinterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter -- ^ 
  , createThreadRequestToolResourcesFileUnderscoresearch :: Maybe CreateThreadRequestToolResourcesFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadRequestToolResources where
  parseJSON = genericParseJSON optionsCreateThreadRequestToolResources
instance ToJSON CreateThreadRequestToolResources where
  toJSON = genericToJSON optionsCreateThreadRequestToolResources

optionsCreateThreadRequestToolResources :: Options
optionsCreateThreadRequestToolResources =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadRequestToolResourcesCodeUnderscoreinterpreter", "code_interpreter")
      , ("createThreadRequestToolResourcesFileUnderscoresearch", "file_search")
      ]


-- | 
data CreateThreadRequestToolResourcesFileSearch = CreateThreadRequestToolResourcesFileSearch
  { createThreadRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids :: Maybe [Text] -- ^ The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  , createThreadRequestToolResourcesFileSearchVectorUnderscorestores :: Maybe [CreateThreadRequestToolResourcesFileSearchVectorStoresInner] -- ^ A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this thread. There can be a maximum of 1 vector store attached to the thread. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadRequestToolResourcesFileSearch where
  parseJSON = genericParseJSON optionsCreateThreadRequestToolResourcesFileSearch
instance ToJSON CreateThreadRequestToolResourcesFileSearch where
  toJSON = genericToJSON optionsCreateThreadRequestToolResourcesFileSearch

optionsCreateThreadRequestToolResourcesFileSearch :: Options
optionsCreateThreadRequestToolResourcesFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids", "vector_store_ids")
      , ("createThreadRequestToolResourcesFileSearchVectorUnderscorestores", "vector_stores")
      ]


-- | 
data CreateThreadRequestToolResourcesFileSearchVectorStoresInner = CreateThreadRequestToolResourcesFileSearchVectorStoresInner
  { createThreadRequestToolResourcesFileSearchVectorStoresInnerFileUnderscoreids :: Maybe [Text] -- ^ A list of [file](/docs/api-reference/files) IDs to add to the vector store. There can be a maximum of 10000 files in a vector store. 
  , createThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingUnderscorestrategy :: Maybe CreateAssistantRequestToolResourcesFileSearchVectorStoresInnerChunkingStrategy -- ^ 
  , createThreadRequestToolResourcesFileSearchVectorStoresInnerMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to a vector store. This can be useful for storing additional information about the vector store in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateThreadRequestToolResourcesFileSearchVectorStoresInner where
  parseJSON = genericParseJSON optionsCreateThreadRequestToolResourcesFileSearchVectorStoresInner
instance ToJSON CreateThreadRequestToolResourcesFileSearchVectorStoresInner where
  toJSON = genericToJSON optionsCreateThreadRequestToolResourcesFileSearchVectorStoresInner

optionsCreateThreadRequestToolResourcesFileSearchVectorStoresInner :: Options
optionsCreateThreadRequestToolResourcesFileSearchVectorStoresInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createThreadRequestToolResourcesFileSearchVectorStoresInnerFileUnderscoreids", "file_ids")
      , ("createThreadRequestToolResourcesFileSearchVectorStoresInnerChunkingUnderscorestrategy", "chunking_strategy")
      , ("createThreadRequestToolResourcesFileSearchVectorStoresInnerMetadata", "metadata")
      ]


-- | 
data CreateTranscription200Response = CreateTranscription200Response
  { createTranscription200ResponseText :: Text -- ^ The transcribed text.
  , createTranscription200ResponseLanguage :: Text -- ^ The language of the input audio.
  , createTranscription200ResponseDuration :: Text -- ^ The duration of the input audio.
  , createTranscription200ResponseWords :: Maybe [TranscriptionWord] -- ^ Extracted words and their corresponding timestamps.
  , createTranscription200ResponseSegments :: Maybe [TranscriptionSegment] -- ^ Segments of the transcribed text and their corresponding details.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranscription200Response where
  parseJSON = genericParseJSON optionsCreateTranscription200Response
instance ToJSON CreateTranscription200Response where
  toJSON = genericToJSON optionsCreateTranscription200Response

optionsCreateTranscription200Response :: Options
optionsCreateTranscription200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranscription200ResponseText", "text")
      , ("createTranscription200ResponseLanguage", "language")
      , ("createTranscription200ResponseDuration", "duration")
      , ("createTranscription200ResponseWords", "words")
      , ("createTranscription200ResponseSegments", "segments")
      ]


-- | ID of the model to use. Only &#x60;whisper-1&#x60; (which is powered by our open source Whisper V2 model) is currently available. 
data CreateTranscriptionRequestModel = CreateTranscriptionRequestModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranscriptionRequestModel where
  parseJSON = genericParseJSON optionsCreateTranscriptionRequestModel
instance ToJSON CreateTranscriptionRequestModel where
  toJSON = genericToJSON optionsCreateTranscriptionRequestModel

optionsCreateTranscriptionRequestModel :: Options
optionsCreateTranscriptionRequestModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Represents a transcription response returned by model, based on the provided input.
data CreateTranscriptionResponseJson = CreateTranscriptionResponseJson
  { createTranscriptionResponseJsonText :: Text -- ^ The transcribed text.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranscriptionResponseJson where
  parseJSON = genericParseJSON optionsCreateTranscriptionResponseJson
instance ToJSON CreateTranscriptionResponseJson where
  toJSON = genericToJSON optionsCreateTranscriptionResponseJson

optionsCreateTranscriptionResponseJson :: Options
optionsCreateTranscriptionResponseJson =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranscriptionResponseJsonText", "text")
      ]


-- | Represents a verbose json transcription response returned by model, based on the provided input.
data CreateTranscriptionResponseVerboseJson = CreateTranscriptionResponseVerboseJson
  { createTranscriptionResponseVerboseJsonLanguage :: Text -- ^ The language of the input audio.
  , createTranscriptionResponseVerboseJsonDuration :: Text -- ^ The duration of the input audio.
  , createTranscriptionResponseVerboseJsonText :: Text -- ^ The transcribed text.
  , createTranscriptionResponseVerboseJsonWords :: Maybe [TranscriptionWord] -- ^ Extracted words and their corresponding timestamps.
  , createTranscriptionResponseVerboseJsonSegments :: Maybe [TranscriptionSegment] -- ^ Segments of the transcribed text and their corresponding details.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranscriptionResponseVerboseJson where
  parseJSON = genericParseJSON optionsCreateTranscriptionResponseVerboseJson
instance ToJSON CreateTranscriptionResponseVerboseJson where
  toJSON = genericToJSON optionsCreateTranscriptionResponseVerboseJson

optionsCreateTranscriptionResponseVerboseJson :: Options
optionsCreateTranscriptionResponseVerboseJson =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranscriptionResponseVerboseJsonLanguage", "language")
      , ("createTranscriptionResponseVerboseJsonDuration", "duration")
      , ("createTranscriptionResponseVerboseJsonText", "text")
      , ("createTranscriptionResponseVerboseJsonWords", "words")
      , ("createTranscriptionResponseVerboseJsonSegments", "segments")
      ]


-- | 
data CreateTranslation200Response = CreateTranslation200Response
  { createTranslation200ResponseText :: Text -- ^ The translated text.
  , createTranslation200ResponseLanguage :: Text -- ^ The language of the output translation (always `english`).
  , createTranslation200ResponseDuration :: Text -- ^ The duration of the input audio.
  , createTranslation200ResponseSegments :: Maybe [TranscriptionSegment] -- ^ Segments of the translated text and their corresponding details.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranslation200Response where
  parseJSON = genericParseJSON optionsCreateTranslation200Response
instance ToJSON CreateTranslation200Response where
  toJSON = genericToJSON optionsCreateTranslation200Response

optionsCreateTranslation200Response :: Options
optionsCreateTranslation200Response =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranslation200ResponseText", "text")
      , ("createTranslation200ResponseLanguage", "language")
      , ("createTranslation200ResponseDuration", "duration")
      , ("createTranslation200ResponseSegments", "segments")
      ]


-- | 
data CreateTranslationResponseJson = CreateTranslationResponseJson
  { createTranslationResponseJsonText :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranslationResponseJson where
  parseJSON = genericParseJSON optionsCreateTranslationResponseJson
instance ToJSON CreateTranslationResponseJson where
  toJSON = genericToJSON optionsCreateTranslationResponseJson

optionsCreateTranslationResponseJson :: Options
optionsCreateTranslationResponseJson =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranslationResponseJsonText", "text")
      ]


-- | 
data CreateTranslationResponseVerboseJson = CreateTranslationResponseVerboseJson
  { createTranslationResponseVerboseJsonLanguage :: Text -- ^ The language of the output translation (always `english`).
  , createTranslationResponseVerboseJsonDuration :: Text -- ^ The duration of the input audio.
  , createTranslationResponseVerboseJsonText :: Text -- ^ The translated text.
  , createTranslationResponseVerboseJsonSegments :: Maybe [TranscriptionSegment] -- ^ Segments of the translated text and their corresponding details.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateTranslationResponseVerboseJson where
  parseJSON = genericParseJSON optionsCreateTranslationResponseVerboseJson
instance ToJSON CreateTranslationResponseVerboseJson where
  toJSON = genericToJSON optionsCreateTranslationResponseVerboseJson

optionsCreateTranslationResponseVerboseJson :: Options
optionsCreateTranslationResponseVerboseJson =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createTranslationResponseVerboseJsonLanguage", "language")
      , ("createTranslationResponseVerboseJsonDuration", "duration")
      , ("createTranslationResponseVerboseJsonText", "text")
      , ("createTranslationResponseVerboseJsonSegments", "segments")
      ]


-- | 
data CreateUploadRequest = CreateUploadRequest
  { createUploadRequestFilename :: Text -- ^ The name of the file to upload. 
  , createUploadRequestPurpose :: Text -- ^ The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  , createUploadRequestBytes :: Int -- ^ The number of bytes in the file you are uploading. 
  , createUploadRequestMimeUnderscoretype :: Text -- ^ The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateUploadRequest where
  parseJSON = genericParseJSON optionsCreateUploadRequest
instance ToJSON CreateUploadRequest where
  toJSON = genericToJSON optionsCreateUploadRequest

optionsCreateUploadRequest :: Options
optionsCreateUploadRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createUploadRequestFilename", "filename")
      , ("createUploadRequestPurpose", "purpose")
      , ("createUploadRequestBytes", "bytes")
      , ("createUploadRequestMimeUnderscoretype", "mime_type")
      ]


-- | 
data CreateVectorStoreFileBatchRequest = CreateVectorStoreFileBatchRequest
  { createVectorStoreFileBatchRequestFileUnderscoreids :: [Text] -- ^ A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  , createVectorStoreFileBatchRequestChunkingUnderscorestrategy :: Maybe ChunkingStrategyRequestParam -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateVectorStoreFileBatchRequest where
  parseJSON = genericParseJSON optionsCreateVectorStoreFileBatchRequest
instance ToJSON CreateVectorStoreFileBatchRequest where
  toJSON = genericToJSON optionsCreateVectorStoreFileBatchRequest

optionsCreateVectorStoreFileBatchRequest :: Options
optionsCreateVectorStoreFileBatchRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createVectorStoreFileBatchRequestFileUnderscoreids", "file_ids")
      , ("createVectorStoreFileBatchRequestChunkingUnderscorestrategy", "chunking_strategy")
      ]


-- | 
data CreateVectorStoreFileRequest = CreateVectorStoreFileRequest
  { createVectorStoreFileRequestFileUnderscoreid :: Text -- ^ A [File](/docs/api-reference/files) ID that the vector store should use. Useful for tools like `file_search` that can access files.
  , createVectorStoreFileRequestChunkingUnderscorestrategy :: Maybe ChunkingStrategyRequestParam -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateVectorStoreFileRequest where
  parseJSON = genericParseJSON optionsCreateVectorStoreFileRequest
instance ToJSON CreateVectorStoreFileRequest where
  toJSON = genericToJSON optionsCreateVectorStoreFileRequest

optionsCreateVectorStoreFileRequest :: Options
optionsCreateVectorStoreFileRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createVectorStoreFileRequestFileUnderscoreid", "file_id")
      , ("createVectorStoreFileRequestChunkingUnderscorestrategy", "chunking_strategy")
      ]


-- | 
data CreateVectorStoreRequest = CreateVectorStoreRequest
  { createVectorStoreRequestFileUnderscoreids :: Maybe [Text] -- ^ A list of [File](/docs/api-reference/files) IDs that the vector store should use. Useful for tools like `file_search` that can access files.
  , createVectorStoreRequestName :: Maybe Text -- ^ The name of the vector store.
  , createVectorStoreRequestExpiresUnderscoreafter :: Maybe VectorStoreExpirationAfter -- ^ 
  , createVectorStoreRequestChunkingUnderscorestrategy :: Maybe CreateVectorStoreRequestChunkingStrategy -- ^ 
  , createVectorStoreRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateVectorStoreRequest where
  parseJSON = genericParseJSON optionsCreateVectorStoreRequest
instance ToJSON CreateVectorStoreRequest where
  toJSON = genericToJSON optionsCreateVectorStoreRequest

optionsCreateVectorStoreRequest :: Options
optionsCreateVectorStoreRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createVectorStoreRequestFileUnderscoreids", "file_ids")
      , ("createVectorStoreRequestName", "name")
      , ("createVectorStoreRequestExpiresUnderscoreafter", "expires_after")
      , ("createVectorStoreRequestChunkingUnderscorestrategy", "chunking_strategy")
      , ("createVectorStoreRequestMetadata", "metadata")
      ]


-- | The chunking strategy used to chunk the file(s). If not set, will use the &#x60;auto&#x60; strategy. Only applicable if &#x60;file_ids&#x60; is non-empty.
data CreateVectorStoreRequestChunkingStrategy = CreateVectorStoreRequestChunkingStrategy
  { createVectorStoreRequestChunkingStrategyType :: Text -- ^ Always `auto`.
  , createVectorStoreRequestChunkingStrategyStatic :: StaticChunkingStrategy -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON CreateVectorStoreRequestChunkingStrategy where
  parseJSON = genericParseJSON optionsCreateVectorStoreRequestChunkingStrategy
instance ToJSON CreateVectorStoreRequestChunkingStrategy where
  toJSON = genericToJSON optionsCreateVectorStoreRequestChunkingStrategy

optionsCreateVectorStoreRequestChunkingStrategy :: Options
optionsCreateVectorStoreRequestChunkingStrategy =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createVectorStoreRequestChunkingStrategyType", "type")
      , ("createVectorStoreRequestChunkingStrategyStatic", "static")
      ]


-- | 
data DefaultProjectErrorResponse = DefaultProjectErrorResponse
  { defaultProjectErrorResponseCode :: Int -- ^ 
  , defaultProjectErrorResponseMessage :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DefaultProjectErrorResponse where
  parseJSON = genericParseJSON optionsDefaultProjectErrorResponse
instance ToJSON DefaultProjectErrorResponse where
  toJSON = genericToJSON optionsDefaultProjectErrorResponse

optionsDefaultProjectErrorResponse :: Options
optionsDefaultProjectErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("defaultProjectErrorResponseCode", "code")
      , ("defaultProjectErrorResponseMessage", "message")
      ]


-- | 
data DeleteAssistantResponse = DeleteAssistantResponse
  { deleteAssistantResponseId :: Text -- ^ 
  , deleteAssistantResponseDeleted :: Bool -- ^ 
  , deleteAssistantResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteAssistantResponse where
  parseJSON = genericParseJSON optionsDeleteAssistantResponse
instance ToJSON DeleteAssistantResponse where
  toJSON = genericToJSON optionsDeleteAssistantResponse

optionsDeleteAssistantResponse :: Options
optionsDeleteAssistantResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteAssistantResponseId", "id")
      , ("deleteAssistantResponseDeleted", "deleted")
      , ("deleteAssistantResponseObject", "object")
      ]


-- | 
data DeleteFileResponse = DeleteFileResponse
  { deleteFileResponseId :: Text -- ^ 
  , deleteFileResponseObject :: Text -- ^ 
  , deleteFileResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteFileResponse where
  parseJSON = genericParseJSON optionsDeleteFileResponse
instance ToJSON DeleteFileResponse where
  toJSON = genericToJSON optionsDeleteFileResponse

optionsDeleteFileResponse :: Options
optionsDeleteFileResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteFileResponseId", "id")
      , ("deleteFileResponseObject", "object")
      , ("deleteFileResponseDeleted", "deleted")
      ]


-- | 
data DeleteMessageResponse = DeleteMessageResponse
  { deleteMessageResponseId :: Text -- ^ 
  , deleteMessageResponseDeleted :: Bool -- ^ 
  , deleteMessageResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteMessageResponse where
  parseJSON = genericParseJSON optionsDeleteMessageResponse
instance ToJSON DeleteMessageResponse where
  toJSON = genericToJSON optionsDeleteMessageResponse

optionsDeleteMessageResponse :: Options
optionsDeleteMessageResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteMessageResponseId", "id")
      , ("deleteMessageResponseDeleted", "deleted")
      , ("deleteMessageResponseObject", "object")
      ]


-- | 
data DeleteModelResponse = DeleteModelResponse
  { deleteModelResponseId :: Text -- ^ 
  , deleteModelResponseDeleted :: Bool -- ^ 
  , deleteModelResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteModelResponse where
  parseJSON = genericParseJSON optionsDeleteModelResponse
instance ToJSON DeleteModelResponse where
  toJSON = genericToJSON optionsDeleteModelResponse

optionsDeleteModelResponse :: Options
optionsDeleteModelResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteModelResponseId", "id")
      , ("deleteModelResponseDeleted", "deleted")
      , ("deleteModelResponseObject", "object")
      ]


-- | 
data DeleteThreadResponse = DeleteThreadResponse
  { deleteThreadResponseId :: Text -- ^ 
  , deleteThreadResponseDeleted :: Bool -- ^ 
  , deleteThreadResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteThreadResponse where
  parseJSON = genericParseJSON optionsDeleteThreadResponse
instance ToJSON DeleteThreadResponse where
  toJSON = genericToJSON optionsDeleteThreadResponse

optionsDeleteThreadResponse :: Options
optionsDeleteThreadResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteThreadResponseId", "id")
      , ("deleteThreadResponseDeleted", "deleted")
      , ("deleteThreadResponseObject", "object")
      ]


-- | 
data DeleteVectorStoreFileResponse = DeleteVectorStoreFileResponse
  { deleteVectorStoreFileResponseId :: Text -- ^ 
  , deleteVectorStoreFileResponseDeleted :: Bool -- ^ 
  , deleteVectorStoreFileResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteVectorStoreFileResponse where
  parseJSON = genericParseJSON optionsDeleteVectorStoreFileResponse
instance ToJSON DeleteVectorStoreFileResponse where
  toJSON = genericToJSON optionsDeleteVectorStoreFileResponse

optionsDeleteVectorStoreFileResponse :: Options
optionsDeleteVectorStoreFileResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteVectorStoreFileResponseId", "id")
      , ("deleteVectorStoreFileResponseDeleted", "deleted")
      , ("deleteVectorStoreFileResponseObject", "object")
      ]


-- | 
data DeleteVectorStoreResponse = DeleteVectorStoreResponse
  { deleteVectorStoreResponseId :: Text -- ^ 
  , deleteVectorStoreResponseDeleted :: Bool -- ^ 
  , deleteVectorStoreResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteVectorStoreResponse where
  parseJSON = genericParseJSON optionsDeleteVectorStoreResponse
instance ToJSON DeleteVectorStoreResponse where
  toJSON = genericToJSON optionsDeleteVectorStoreResponse

optionsDeleteVectorStoreResponse :: Options
optionsDeleteVectorStoreResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteVectorStoreResponseId", "id")
      , ("deleteVectorStoreResponseDeleted", "deleted")
      , ("deleteVectorStoreResponseObject", "object")
      ]


-- | Occurs when a stream ends.
data DoneEvent = DoneEvent
  { doneEventEvent :: Text -- ^ 
  , doneEventData :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DoneEvent where
  parseJSON = genericParseJSON optionsDoneEvent
instance ToJSON DoneEvent where
  toJSON = genericToJSON optionsDoneEvent

optionsDoneEvent :: Options
optionsDoneEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("doneEventEvent", "event")
      , ("doneEventData", "data")
      ]


-- | Represents an embedding vector returned by embedding endpoint. 
data Embedding = Embedding
  { embeddingIndex :: Int -- ^ The index of the embedding in the list of embeddings.
  , embeddingEmbedding :: [Double] -- ^ The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
  , embeddingObject :: Text -- ^ The object type, which is always \"embedding\".
  } deriving (Show, Eq, Generic)

instance FromJSON Embedding where
  parseJSON = genericParseJSON optionsEmbedding
instance ToJSON Embedding where
  toJSON = genericToJSON optionsEmbedding

optionsEmbedding :: Options
optionsEmbedding =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("embeddingIndex", "index")
      , ("embeddingEmbedding", "embedding")
      , ("embeddingObject", "object")
      ]


-- | 
data Error = Error
  { errorCode :: Text -- ^ 
  , errorMessage :: Text -- ^ 
  , errorParam :: Text -- ^ 
  , errorType :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Error where
  parseJSON = genericParseJSON optionsError
instance ToJSON Error where
  toJSON = genericToJSON optionsError

optionsError :: Options
optionsError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("errorCode", "code")
      , ("errorMessage", "message")
      , ("errorParam", "param")
      , ("errorType", "type")
      ]


-- | Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
data ErrorEvent = ErrorEvent
  { errorEventEvent :: Text -- ^ 
  , errorEventData :: Error -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ErrorEvent where
  parseJSON = genericParseJSON optionsErrorEvent
instance ToJSON ErrorEvent where
  toJSON = genericToJSON optionsErrorEvent

optionsErrorEvent :: Options
optionsErrorEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("errorEventEvent", "event")
      , ("errorEventData", "data")
      ]


-- | 
data ErrorResponse = ErrorResponse
  { errorResponseError :: Error -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ErrorResponse where
  parseJSON = genericParseJSON optionsErrorResponse
instance ToJSON ErrorResponse where
  toJSON = genericToJSON optionsErrorResponse

optionsErrorResponse :: Options
optionsErrorResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("errorResponseError", "error")
      ]


-- | The ranking options for the file search. If not specified, the file search tool will use the &#x60;auto&#x60; ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
data FileSearchRankingOptions = FileSearchRankingOptions
  { fileSearchRankingOptionsRanker :: Maybe Text -- ^ The ranker to use for the file search. If not specified will use the `auto` ranker.
  , fileSearchRankingOptionsScoreUnderscorethreshold :: Double -- ^ The score threshold for the file search. All values must be a floating point number between 0 and 1.
  } deriving (Show, Eq, Generic)

instance FromJSON FileSearchRankingOptions where
  parseJSON = genericParseJSON optionsFileSearchRankingOptions
instance ToJSON FileSearchRankingOptions where
  toJSON = genericToJSON optionsFileSearchRankingOptions

optionsFileSearchRankingOptions :: Options
optionsFileSearchRankingOptions =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fileSearchRankingOptionsRanker", "ranker")
      , ("fileSearchRankingOptionsScoreUnderscorethreshold", "score_threshold")
      ]


-- | 
data FineTuneChatCompletionRequestAssistantMessage = FineTuneChatCompletionRequestAssistantMessage
  { fineTuneChatCompletionRequestAssistantMessageContent :: Maybe ChatCompletionRequestAssistantMessageContent -- ^ 
  , fineTuneChatCompletionRequestAssistantMessageRefusal :: Maybe Text -- ^ The refusal message by the assistant.
  , fineTuneChatCompletionRequestAssistantMessageRole :: Text -- ^ The role of the messages author, in this case `assistant`.
  , fineTuneChatCompletionRequestAssistantMessageName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  , fineTuneChatCompletionRequestAssistantMessageAudio :: Maybe ChatCompletionRequestAssistantMessageAudio -- ^ 
  , fineTuneChatCompletionRequestAssistantMessageToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , fineTuneChatCompletionRequestAssistantMessageFunctionUnderscorecall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall -- ^ 
  , fineTuneChatCompletionRequestAssistantMessageWeight :: Maybe Int -- ^ Controls whether the assistant message is trained against (0 or 1)
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneChatCompletionRequestAssistantMessage where
  parseJSON = genericParseJSON optionsFineTuneChatCompletionRequestAssistantMessage
instance ToJSON FineTuneChatCompletionRequestAssistantMessage where
  toJSON = genericToJSON optionsFineTuneChatCompletionRequestAssistantMessage

optionsFineTuneChatCompletionRequestAssistantMessage :: Options
optionsFineTuneChatCompletionRequestAssistantMessage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneChatCompletionRequestAssistantMessageContent", "content")
      , ("fineTuneChatCompletionRequestAssistantMessageRefusal", "refusal")
      , ("fineTuneChatCompletionRequestAssistantMessageRole", "role")
      , ("fineTuneChatCompletionRequestAssistantMessageName", "name")
      , ("fineTuneChatCompletionRequestAssistantMessageAudio", "audio")
      , ("fineTuneChatCompletionRequestAssistantMessageToolUnderscorecalls", "tool_calls")
      , ("fineTuneChatCompletionRequestAssistantMessageFunctionUnderscorecall", "function_call")
      , ("fineTuneChatCompletionRequestAssistantMessageWeight", "weight")
      ]


-- | The per-line training example of a fine-tuning input file for chat models using the supervised method.
data FineTuneChatRequestInput = FineTuneChatRequestInput
  { fineTuneChatRequestInputMessages :: Maybe [FineTuneChatRequestInputMessagesInner] -- ^ 
  , fineTuneChatRequestInputTools :: Maybe [ChatCompletionTool] -- ^ A list of tools the model may generate JSON inputs for.
  , fineTuneChatRequestInputParallelUnderscoretoolUnderscorecalls :: Maybe Bool -- ^ Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  , fineTuneChatRequestInputFunctions :: Maybe [ChatCompletionFunctions] -- ^ A list of functions the model may generate JSON inputs for.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneChatRequestInput where
  parseJSON = genericParseJSON optionsFineTuneChatRequestInput
instance ToJSON FineTuneChatRequestInput where
  toJSON = genericToJSON optionsFineTuneChatRequestInput

optionsFineTuneChatRequestInput :: Options
optionsFineTuneChatRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneChatRequestInputMessages", "messages")
      , ("fineTuneChatRequestInputTools", "tools")
      , ("fineTuneChatRequestInputParallelUnderscoretoolUnderscorecalls", "parallel_tool_calls")
      , ("fineTuneChatRequestInputFunctions", "functions")
      ]


-- | 
data FineTuneChatRequestInputMessagesInner = FineTuneChatRequestInputMessagesInner
  { fineTuneChatRequestInputMessagesInnerContent :: Text -- ^ The contents of the function message.
  , fineTuneChatRequestInputMessagesInnerRole :: Text -- ^ The role of the messages author, in this case `function`.
  , fineTuneChatRequestInputMessagesInnerName :: Text -- ^ The name of the function to call.
  , fineTuneChatRequestInputMessagesInnerWeight :: Maybe Int -- ^ Controls whether the assistant message is trained against (0 or 1)
  , fineTuneChatRequestInputMessagesInnerRefusal :: Maybe Text -- ^ The refusal message by the assistant.
  , fineTuneChatRequestInputMessagesInnerAudio :: Maybe ChatCompletionRequestAssistantMessageAudio -- ^ 
  , fineTuneChatRequestInputMessagesInnerToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , fineTuneChatRequestInputMessagesInnerFunctionUnderscorecall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall -- ^ 
  , fineTuneChatRequestInputMessagesInnerToolUnderscorecallUnderscoreid :: Text -- ^ Tool call that this message is responding to.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneChatRequestInputMessagesInner where
  parseJSON = genericParseJSON optionsFineTuneChatRequestInputMessagesInner
instance ToJSON FineTuneChatRequestInputMessagesInner where
  toJSON = genericToJSON optionsFineTuneChatRequestInputMessagesInner

optionsFineTuneChatRequestInputMessagesInner :: Options
optionsFineTuneChatRequestInputMessagesInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneChatRequestInputMessagesInnerContent", "content")
      , ("fineTuneChatRequestInputMessagesInnerRole", "role")
      , ("fineTuneChatRequestInputMessagesInnerName", "name")
      , ("fineTuneChatRequestInputMessagesInnerWeight", "weight")
      , ("fineTuneChatRequestInputMessagesInnerRefusal", "refusal")
      , ("fineTuneChatRequestInputMessagesInnerAudio", "audio")
      , ("fineTuneChatRequestInputMessagesInnerToolUnderscorecalls", "tool_calls")
      , ("fineTuneChatRequestInputMessagesInnerFunctionUnderscorecall", "function_call")
      , ("fineTuneChatRequestInputMessagesInnerToolUnderscorecallUnderscoreid", "tool_call_id")
      ]


-- | The per-line training example of a fine-tuning input file for completions models
data FineTuneCompletionRequestInput = FineTuneCompletionRequestInput
  { fineTuneCompletionRequestInputPrompt :: Maybe Text -- ^ The input prompt for this training example.
  , fineTuneCompletionRequestInputCompletion :: Maybe Text -- ^ The desired completion for this training example.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneCompletionRequestInput where
  parseJSON = genericParseJSON optionsFineTuneCompletionRequestInput
instance ToJSON FineTuneCompletionRequestInput where
  toJSON = genericToJSON optionsFineTuneCompletionRequestInput

optionsFineTuneCompletionRequestInput :: Options
optionsFineTuneCompletionRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneCompletionRequestInputPrompt", "prompt")
      , ("fineTuneCompletionRequestInputCompletion", "completion")
      ]


-- | Configuration for the DPO fine-tuning method.
data FineTuneDPOMethod = FineTuneDPOMethod
  { fineTuneDPOMethodHyperparameters :: Maybe FineTuneDPOMethodHyperparameters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneDPOMethod where
  parseJSON = genericParseJSON optionsFineTuneDPOMethod
instance ToJSON FineTuneDPOMethod where
  toJSON = genericToJSON optionsFineTuneDPOMethod

optionsFineTuneDPOMethod :: Options
optionsFineTuneDPOMethod =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneDPOMethodHyperparameters", "hyperparameters")
      ]


-- | The hyperparameters used for the fine-tuning job.
data FineTuneDPOMethodHyperparameters = FineTuneDPOMethodHyperparameters
  { fineTuneDPOMethodHyperparametersBeta :: Maybe FineTuneDPOMethodHyperparametersBeta -- ^ 
  , fineTuneDPOMethodHyperparametersBatchUnderscoresize :: Maybe FineTuneDPOMethodHyperparametersBatchSize -- ^ 
  , fineTuneDPOMethodHyperparametersLearningUnderscorerateUnderscoremultiplier :: Maybe FineTuneDPOMethodHyperparametersLearningRateMultiplier -- ^ 
  , fineTuneDPOMethodHyperparametersNUnderscoreepochs :: Maybe FineTuneDPOMethodHyperparametersNEpochs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneDPOMethodHyperparameters where
  parseJSON = genericParseJSON optionsFineTuneDPOMethodHyperparameters
instance ToJSON FineTuneDPOMethodHyperparameters where
  toJSON = genericToJSON optionsFineTuneDPOMethodHyperparameters

optionsFineTuneDPOMethodHyperparameters :: Options
optionsFineTuneDPOMethodHyperparameters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneDPOMethodHyperparametersBeta", "beta")
      , ("fineTuneDPOMethodHyperparametersBatchUnderscoresize", "batch_size")
      , ("fineTuneDPOMethodHyperparametersLearningUnderscorerateUnderscoremultiplier", "learning_rate_multiplier")
      , ("fineTuneDPOMethodHyperparametersNUnderscoreepochs", "n_epochs")
      ]


-- | Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
data FineTuneDPOMethodHyperparametersBatchSize = FineTuneDPOMethodHyperparametersBatchSize
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneDPOMethodHyperparametersBatchSize where
  parseJSON = genericParseJSON optionsFineTuneDPOMethodHyperparametersBatchSize
instance ToJSON FineTuneDPOMethodHyperparametersBatchSize where
  toJSON = genericToJSON optionsFineTuneDPOMethodHyperparametersBatchSize

optionsFineTuneDPOMethodHyperparametersBatchSize :: Options
optionsFineTuneDPOMethodHyperparametersBatchSize =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
data FineTuneDPOMethodHyperparametersBeta = FineTuneDPOMethodHyperparametersBeta
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneDPOMethodHyperparametersBeta where
  parseJSON = genericParseJSON optionsFineTuneDPOMethodHyperparametersBeta
instance ToJSON FineTuneDPOMethodHyperparametersBeta where
  toJSON = genericToJSON optionsFineTuneDPOMethodHyperparametersBeta

optionsFineTuneDPOMethodHyperparametersBeta :: Options
optionsFineTuneDPOMethodHyperparametersBeta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
data FineTuneDPOMethodHyperparametersLearningRateMultiplier = FineTuneDPOMethodHyperparametersLearningRateMultiplier
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneDPOMethodHyperparametersLearningRateMultiplier where
  parseJSON = genericParseJSON optionsFineTuneDPOMethodHyperparametersLearningRateMultiplier
instance ToJSON FineTuneDPOMethodHyperparametersLearningRateMultiplier where
  toJSON = genericToJSON optionsFineTuneDPOMethodHyperparametersLearningRateMultiplier

optionsFineTuneDPOMethodHyperparametersLearningRateMultiplier :: Options
optionsFineTuneDPOMethodHyperparametersLearningRateMultiplier =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
data FineTuneDPOMethodHyperparametersNEpochs = FineTuneDPOMethodHyperparametersNEpochs
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneDPOMethodHyperparametersNEpochs where
  parseJSON = genericParseJSON optionsFineTuneDPOMethodHyperparametersNEpochs
instance ToJSON FineTuneDPOMethodHyperparametersNEpochs where
  toJSON = genericToJSON optionsFineTuneDPOMethodHyperparametersNEpochs

optionsFineTuneDPOMethodHyperparametersNEpochs :: Options
optionsFineTuneDPOMethodHyperparametersNEpochs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | The method used for fine-tuning.
data FineTuneMethod = FineTuneMethod
  { fineTuneMethodType :: Maybe Text -- ^ The type of method. Is either `supervised` or `dpo`.
  , fineTuneMethodSupervised :: Maybe FineTuneSupervisedMethod -- ^ 
  , fineTuneMethodDpo :: Maybe FineTuneDPOMethod -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneMethod where
  parseJSON = genericParseJSON optionsFineTuneMethod
instance ToJSON FineTuneMethod where
  toJSON = genericToJSON optionsFineTuneMethod

optionsFineTuneMethod :: Options
optionsFineTuneMethod =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneMethodType", "type")
      , ("fineTuneMethodSupervised", "supervised")
      , ("fineTuneMethodDpo", "dpo")
      ]


-- | The per-line training example of a fine-tuning input file for chat models using the dpo method.
data FineTunePreferenceRequestInput = FineTunePreferenceRequestInput
  { fineTunePreferenceRequestInputInput :: Maybe FineTunePreferenceRequestInputInput -- ^ 
  , fineTunePreferenceRequestInputPreferredUnderscorecompletion :: Maybe [FineTunePreferenceRequestInputPreferredCompletionInner] -- ^ The preferred completion message for the output.
  , fineTunePreferenceRequestInputNonUnderscorepreferredUnderscorecompletion :: Maybe [FineTunePreferenceRequestInputPreferredCompletionInner] -- ^ The non-preferred completion message for the output.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTunePreferenceRequestInput where
  parseJSON = genericParseJSON optionsFineTunePreferenceRequestInput
instance ToJSON FineTunePreferenceRequestInput where
  toJSON = genericToJSON optionsFineTunePreferenceRequestInput

optionsFineTunePreferenceRequestInput :: Options
optionsFineTunePreferenceRequestInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTunePreferenceRequestInputInput", "input")
      , ("fineTunePreferenceRequestInputPreferredUnderscorecompletion", "preferred_completion")
      , ("fineTunePreferenceRequestInputNonUnderscorepreferredUnderscorecompletion", "non_preferred_completion")
      ]


-- | 
data FineTunePreferenceRequestInputInput = FineTunePreferenceRequestInputInput
  { fineTunePreferenceRequestInputInputMessages :: Maybe [FineTuneChatRequestInputMessagesInner] -- ^ 
  , fineTunePreferenceRequestInputInputTools :: Maybe [ChatCompletionTool] -- ^ A list of tools the model may generate JSON inputs for.
  , fineTunePreferenceRequestInputInputParallelUnderscoretoolUnderscorecalls :: Maybe Bool -- ^ Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTunePreferenceRequestInputInput where
  parseJSON = genericParseJSON optionsFineTunePreferenceRequestInputInput
instance ToJSON FineTunePreferenceRequestInputInput where
  toJSON = genericToJSON optionsFineTunePreferenceRequestInputInput

optionsFineTunePreferenceRequestInputInput :: Options
optionsFineTunePreferenceRequestInputInput =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTunePreferenceRequestInputInputMessages", "messages")
      , ("fineTunePreferenceRequestInputInputTools", "tools")
      , ("fineTunePreferenceRequestInputInputParallelUnderscoretoolUnderscorecalls", "parallel_tool_calls")
      ]


-- | 
data FineTunePreferenceRequestInputPreferredCompletionInner = FineTunePreferenceRequestInputPreferredCompletionInner
  { fineTunePreferenceRequestInputPreferredCompletionInnerContent :: Maybe ChatCompletionRequestAssistantMessageContent -- ^ 
  , fineTunePreferenceRequestInputPreferredCompletionInnerRefusal :: Maybe Text -- ^ The refusal message by the assistant.
  , fineTunePreferenceRequestInputPreferredCompletionInnerRole :: Text -- ^ The role of the messages author, in this case `assistant`.
  , fineTunePreferenceRequestInputPreferredCompletionInnerName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
  , fineTunePreferenceRequestInputPreferredCompletionInnerAudio :: Maybe ChatCompletionRequestAssistantMessageAudio -- ^ 
  , fineTunePreferenceRequestInputPreferredCompletionInnerToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , fineTunePreferenceRequestInputPreferredCompletionInnerFunctionUnderscorecall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTunePreferenceRequestInputPreferredCompletionInner where
  parseJSON = genericParseJSON optionsFineTunePreferenceRequestInputPreferredCompletionInner
instance ToJSON FineTunePreferenceRequestInputPreferredCompletionInner where
  toJSON = genericToJSON optionsFineTunePreferenceRequestInputPreferredCompletionInner

optionsFineTunePreferenceRequestInputPreferredCompletionInner :: Options
optionsFineTunePreferenceRequestInputPreferredCompletionInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTunePreferenceRequestInputPreferredCompletionInnerContent", "content")
      , ("fineTunePreferenceRequestInputPreferredCompletionInnerRefusal", "refusal")
      , ("fineTunePreferenceRequestInputPreferredCompletionInnerRole", "role")
      , ("fineTunePreferenceRequestInputPreferredCompletionInnerName", "name")
      , ("fineTunePreferenceRequestInputPreferredCompletionInnerAudio", "audio")
      , ("fineTunePreferenceRequestInputPreferredCompletionInnerToolUnderscorecalls", "tool_calls")
      , ("fineTunePreferenceRequestInputPreferredCompletionInnerFunctionUnderscorecall", "function_call")
      ]


-- | Configuration for the supervised fine-tuning method.
data FineTuneSupervisedMethod = FineTuneSupervisedMethod
  { fineTuneSupervisedMethodHyperparameters :: Maybe FineTuneSupervisedMethodHyperparameters -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneSupervisedMethod where
  parseJSON = genericParseJSON optionsFineTuneSupervisedMethod
instance ToJSON FineTuneSupervisedMethod where
  toJSON = genericToJSON optionsFineTuneSupervisedMethod

optionsFineTuneSupervisedMethod :: Options
optionsFineTuneSupervisedMethod =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneSupervisedMethodHyperparameters", "hyperparameters")
      ]


-- | The hyperparameters used for the fine-tuning job.
data FineTuneSupervisedMethodHyperparameters = FineTuneSupervisedMethodHyperparameters
  { fineTuneSupervisedMethodHyperparametersBatchUnderscoresize :: Maybe FineTuneDPOMethodHyperparametersBatchSize -- ^ 
  , fineTuneSupervisedMethodHyperparametersLearningUnderscorerateUnderscoremultiplier :: Maybe FineTuneDPOMethodHyperparametersLearningRateMultiplier -- ^ 
  , fineTuneSupervisedMethodHyperparametersNUnderscoreepochs :: Maybe FineTuneDPOMethodHyperparametersNEpochs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuneSupervisedMethodHyperparameters where
  parseJSON = genericParseJSON optionsFineTuneSupervisedMethodHyperparameters
instance ToJSON FineTuneSupervisedMethodHyperparameters where
  toJSON = genericToJSON optionsFineTuneSupervisedMethodHyperparameters

optionsFineTuneSupervisedMethodHyperparameters :: Options
optionsFineTuneSupervisedMethodHyperparameters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuneSupervisedMethodHyperparametersBatchUnderscoresize", "batch_size")
      , ("fineTuneSupervisedMethodHyperparametersLearningUnderscorerateUnderscoremultiplier", "learning_rate_multiplier")
      , ("fineTuneSupervisedMethodHyperparametersNUnderscoreepochs", "n_epochs")
      ]


-- | 
data FineTuningIntegration = FineTuningIntegration
  { fineTuningIntegrationType :: Text -- ^ The type of the integration being enabled for the fine-tuning job
  , fineTuningIntegrationWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningIntegration where
  parseJSON = genericParseJSON optionsFineTuningIntegration
instance ToJSON FineTuningIntegration where
  toJSON = genericToJSON optionsFineTuningIntegration

optionsFineTuningIntegration :: Options
optionsFineTuningIntegration =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningIntegrationType", "type")
      , ("fineTuningIntegrationWandb", "wandb")
      ]


-- | The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
data FineTuningJob = FineTuningJob
  { fineTuningJobId :: Text -- ^ The object identifier, which can be referenced in the API endpoints.
  , fineTuningJobCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the fine-tuning job was created.
  , fineTuningJobError :: FineTuningJobError -- ^ 
  , fineTuningJobFineUnderscoretunedUnderscoremodel :: Text -- ^ The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
  , fineTuningJobFinishedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
  , fineTuningJobHyperparameters :: FineTuningJobHyperparameters -- ^ 
  , fineTuningJobModel :: Text -- ^ The base model that is being fine-tuned.
  , fineTuningJobObject :: Text -- ^ The object type, which is always \"fine_tuning.job\".
  , fineTuningJobOrganizationUnderscoreid :: Text -- ^ The organization that owns the fine-tuning job.
  , fineTuningJobResultUnderscorefiles :: [Text] -- ^ The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
  , fineTuningJobStatus :: Text -- ^ The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
  , fineTuningJobTrainedUnderscoretokens :: Int -- ^ The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
  , fineTuningJobTrainingUnderscorefile :: Text -- ^ The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
  , fineTuningJobValidationUnderscorefile :: Text -- ^ The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
  , fineTuningJobIntegrations :: Maybe [FineTuningJobIntegrationsInner] -- ^ A list of integrations to enable for this fine-tuning job.
  , fineTuningJobSeed :: Int -- ^ The seed used for the fine-tuning job.
  , fineTuningJobEstimatedUnderscorefinish :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
  , fineTuningJobMethod :: Maybe FineTuneMethod -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJob where
  parseJSON = genericParseJSON optionsFineTuningJob
instance ToJSON FineTuningJob where
  toJSON = genericToJSON optionsFineTuningJob

optionsFineTuningJob :: Options
optionsFineTuningJob =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobId", "id")
      , ("fineTuningJobCreatedUnderscoreat", "created_at")
      , ("fineTuningJobError", "error")
      , ("fineTuningJobFineUnderscoretunedUnderscoremodel", "fine_tuned_model")
      , ("fineTuningJobFinishedUnderscoreat", "finished_at")
      , ("fineTuningJobHyperparameters", "hyperparameters")
      , ("fineTuningJobModel", "model")
      , ("fineTuningJobObject", "object")
      , ("fineTuningJobOrganizationUnderscoreid", "organization_id")
      , ("fineTuningJobResultUnderscorefiles", "result_files")
      , ("fineTuningJobStatus", "status")
      , ("fineTuningJobTrainedUnderscoretokens", "trained_tokens")
      , ("fineTuningJobTrainingUnderscorefile", "training_file")
      , ("fineTuningJobValidationUnderscorefile", "validation_file")
      , ("fineTuningJobIntegrations", "integrations")
      , ("fineTuningJobSeed", "seed")
      , ("fineTuningJobEstimatedUnderscorefinish", "estimated_finish")
      , ("fineTuningJobMethod", "method")
      ]


-- | The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
data FineTuningJobCheckpoint = FineTuningJobCheckpoint
  { fineTuningJobCheckpointId :: Text -- ^ The checkpoint identifier, which can be referenced in the API endpoints.
  , fineTuningJobCheckpointCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the checkpoint was created.
  , fineTuningJobCheckpointFineUnderscoretunedUnderscoremodelUnderscorecheckpoint :: Text -- ^ The name of the fine-tuned checkpoint model that is created.
  , fineTuningJobCheckpointStepUnderscorenumber :: Int -- ^ The step number that the checkpoint was created at.
  , fineTuningJobCheckpointMetrics :: FineTuningJobCheckpointMetrics -- ^ 
  , fineTuningJobCheckpointFineUnderscoretuningUnderscorejobUnderscoreid :: Text -- ^ The name of the fine-tuning job that this checkpoint was created from.
  , fineTuningJobCheckpointObject :: Text -- ^ The object type, which is always \"fine_tuning.job.checkpoint\".
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobCheckpoint where
  parseJSON = genericParseJSON optionsFineTuningJobCheckpoint
instance ToJSON FineTuningJobCheckpoint where
  toJSON = genericToJSON optionsFineTuningJobCheckpoint

optionsFineTuningJobCheckpoint :: Options
optionsFineTuningJobCheckpoint =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobCheckpointId", "id")
      , ("fineTuningJobCheckpointCreatedUnderscoreat", "created_at")
      , ("fineTuningJobCheckpointFineUnderscoretunedUnderscoremodelUnderscorecheckpoint", "fine_tuned_model_checkpoint")
      , ("fineTuningJobCheckpointStepUnderscorenumber", "step_number")
      , ("fineTuningJobCheckpointMetrics", "metrics")
      , ("fineTuningJobCheckpointFineUnderscoretuningUnderscorejobUnderscoreid", "fine_tuning_job_id")
      , ("fineTuningJobCheckpointObject", "object")
      ]


-- | Metrics at the step number during the fine-tuning job.
data FineTuningJobCheckpointMetrics = FineTuningJobCheckpointMetrics
  { fineTuningJobCheckpointMetricsStep :: Maybe Double -- ^ 
  , fineTuningJobCheckpointMetricsTrainUnderscoreloss :: Maybe Double -- ^ 
  , fineTuningJobCheckpointMetricsTrainUnderscoremeanUnderscoretokenUnderscoreaccuracy :: Maybe Double -- ^ 
  , fineTuningJobCheckpointMetricsValidUnderscoreloss :: Maybe Double -- ^ 
  , fineTuningJobCheckpointMetricsValidUnderscoremeanUnderscoretokenUnderscoreaccuracy :: Maybe Double -- ^ 
  , fineTuningJobCheckpointMetricsFullUnderscorevalidUnderscoreloss :: Maybe Double -- ^ 
  , fineTuningJobCheckpointMetricsFullUnderscorevalidUnderscoremeanUnderscoretokenUnderscoreaccuracy :: Maybe Double -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobCheckpointMetrics where
  parseJSON = genericParseJSON optionsFineTuningJobCheckpointMetrics
instance ToJSON FineTuningJobCheckpointMetrics where
  toJSON = genericToJSON optionsFineTuningJobCheckpointMetrics

optionsFineTuningJobCheckpointMetrics :: Options
optionsFineTuningJobCheckpointMetrics =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobCheckpointMetricsStep", "step")
      , ("fineTuningJobCheckpointMetricsTrainUnderscoreloss", "train_loss")
      , ("fineTuningJobCheckpointMetricsTrainUnderscoremeanUnderscoretokenUnderscoreaccuracy", "train_mean_token_accuracy")
      , ("fineTuningJobCheckpointMetricsValidUnderscoreloss", "valid_loss")
      , ("fineTuningJobCheckpointMetricsValidUnderscoremeanUnderscoretokenUnderscoreaccuracy", "valid_mean_token_accuracy")
      , ("fineTuningJobCheckpointMetricsFullUnderscorevalidUnderscoreloss", "full_valid_loss")
      , ("fineTuningJobCheckpointMetricsFullUnderscorevalidUnderscoremeanUnderscoretokenUnderscoreaccuracy", "full_valid_mean_token_accuracy")
      ]


-- | For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
data FineTuningJobError = FineTuningJobError
  { fineTuningJobErrorCode :: Text -- ^ A machine-readable error code.
  , fineTuningJobErrorMessage :: Text -- ^ A human-readable error message.
  , fineTuningJobErrorParam :: Text -- ^ The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobError where
  parseJSON = genericParseJSON optionsFineTuningJobError
instance ToJSON FineTuningJobError where
  toJSON = genericToJSON optionsFineTuningJobError

optionsFineTuningJobError :: Options
optionsFineTuningJobError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobErrorCode", "code")
      , ("fineTuningJobErrorMessage", "message")
      , ("fineTuningJobErrorParam", "param")
      ]


-- | Fine-tuning job event object
data FineTuningJobEvent = FineTuningJobEvent
  { fineTuningJobEventObject :: Text -- ^ The object type, which is always \"fine_tuning.job.event\".
  , fineTuningJobEventId :: Text -- ^ The object identifier.
  , fineTuningJobEventCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the fine-tuning job was created.
  , fineTuningJobEventLevel :: Text -- ^ The log level of the event.
  , fineTuningJobEventMessage :: Text -- ^ The message of the event.
  , fineTuningJobEventType :: Maybe Text -- ^ The type of event.
  , fineTuningJobEventData :: Maybe Object -- ^ The data associated with the event.
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobEvent where
  parseJSON = genericParseJSON optionsFineTuningJobEvent
instance ToJSON FineTuningJobEvent where
  toJSON = genericToJSON optionsFineTuningJobEvent

optionsFineTuningJobEvent :: Options
optionsFineTuningJobEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobEventObject", "object")
      , ("fineTuningJobEventId", "id")
      , ("fineTuningJobEventCreatedUnderscoreat", "created_at")
      , ("fineTuningJobEventLevel", "level")
      , ("fineTuningJobEventMessage", "message")
      , ("fineTuningJobEventType", "type")
      , ("fineTuningJobEventData", "data")
      ]


-- | The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
data FineTuningJobHyperparameters = FineTuningJobHyperparameters
  { fineTuningJobHyperparametersBatchUnderscoresize :: Maybe CreateFineTuningJobRequestHyperparametersBatchSize -- ^ 
  , fineTuningJobHyperparametersLearningUnderscorerateUnderscoremultiplier :: Maybe CreateFineTuningJobRequestHyperparametersLearningRateMultiplier -- ^ 
  , fineTuningJobHyperparametersNUnderscoreepochs :: Maybe CreateFineTuningJobRequestHyperparametersNEpochs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobHyperparameters where
  parseJSON = genericParseJSON optionsFineTuningJobHyperparameters
instance ToJSON FineTuningJobHyperparameters where
  toJSON = genericToJSON optionsFineTuningJobHyperparameters

optionsFineTuningJobHyperparameters :: Options
optionsFineTuningJobHyperparameters =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobHyperparametersBatchUnderscoresize", "batch_size")
      , ("fineTuningJobHyperparametersLearningUnderscorerateUnderscoremultiplier", "learning_rate_multiplier")
      , ("fineTuningJobHyperparametersNUnderscoreepochs", "n_epochs")
      ]


-- | 
data FineTuningJobIntegrationsInner = FineTuningJobIntegrationsInner
  { fineTuningJobIntegrationsInnerType :: Text -- ^ The type of the integration being enabled for the fine-tuning job
  , fineTuningJobIntegrationsInnerWandb :: CreateFineTuningJobRequestIntegrationsInnerWandb -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobIntegrationsInner where
  parseJSON = genericParseJSON optionsFineTuningJobIntegrationsInner
instance ToJSON FineTuningJobIntegrationsInner where
  toJSON = genericToJSON optionsFineTuningJobIntegrationsInner

optionsFineTuningJobIntegrationsInner :: Options
optionsFineTuningJobIntegrationsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("fineTuningJobIntegrationsInnerType", "type")
      , ("fineTuningJobIntegrationsInnerWandb", "wandb")
      ]


-- | 
data FunctionObject = FunctionObject
  { functionObjectDescription :: Maybe Text -- ^ A description of what the function does, used by the model to choose when and how to call the function.
  , functionObjectName :: Text -- ^ The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  , functionObjectParameters :: Maybe (Map.Map String Value) -- ^ The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
  , functionObjectStrict :: Maybe Bool -- ^ Whether to enable strict schema adherence when generating the function call. If set to true, the model will follow the exact schema defined in the `parameters` field. Only a subset of JSON Schema is supported when `strict` is `true`. Learn more about Structured Outputs in the [function calling guide](docs/guides/function-calling).
  } deriving (Show, Eq, Generic)

instance FromJSON FunctionObject where
  parseJSON = genericParseJSON optionsFunctionObject
instance ToJSON FunctionObject where
  toJSON = genericToJSON optionsFunctionObject

optionsFunctionObject :: Options
optionsFunctionObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("functionObjectDescription", "description")
      , ("functionObjectName", "name")
      , ("functionObjectParameters", "parameters")
      , ("functionObjectStrict", "strict")
      ]


-- | Represents the url or the content of an image generated by the OpenAI API.
data Image = Image
  { imageB64Underscorejson :: Maybe Text -- ^ The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
  , imageUrl :: Maybe Text -- ^ The URL of the generated image, if `response_format` is `url` (default).
  , imageRevisedUnderscoreprompt :: Maybe Text -- ^ The prompt that was used to generate the image, if there was any revision to the prompt.
  } deriving (Show, Eq, Generic)

instance FromJSON Image where
  parseJSON = genericParseJSON optionsImage
instance ToJSON Image where
  toJSON = genericToJSON optionsImage

optionsImage :: Options
optionsImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imageB64Underscorejson", "b64_json")
      , ("imageUrl", "url")
      , ("imageRevisedUnderscoreprompt", "revised_prompt")
      ]


-- | 
data ImagesResponse = ImagesResponse
  { imagesResponseCreated :: Int -- ^ 
  , imagesResponseData :: [Image] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ImagesResponse where
  parseJSON = genericParseJSON optionsImagesResponse
instance ToJSON ImagesResponse where
  toJSON = genericToJSON optionsImagesResponse

optionsImagesResponse :: Options
optionsImagesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("imagesResponseCreated", "created")
      , ("imagesResponseData", "data")
      ]


-- | Represents an individual &#x60;invite&#x60; to the organization.
data Invite = Invite
  { inviteObject :: Text -- ^ The object type, which is always `organization.invite`
  , inviteId :: Text -- ^ The identifier, which can be referenced in API endpoints
  , inviteEmail :: Text -- ^ The email address of the individual to whom the invite was sent
  , inviteRole :: Text -- ^ `owner` or `reader`
  , inviteStatus :: Text -- ^ `accepted`,`expired`, or `pending`
  , inviteInvitedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the invite was sent.
  , inviteExpiresUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the invite expires.
  , inviteAcceptedUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) of when the invite was accepted.
  , inviteProjects :: Maybe [InviteProjectsInner] -- ^ The projects that were granted membership upon acceptance of the invite.
  } deriving (Show, Eq, Generic)

instance FromJSON Invite where
  parseJSON = genericParseJSON optionsInvite
instance ToJSON Invite where
  toJSON = genericToJSON optionsInvite

optionsInvite :: Options
optionsInvite =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("inviteObject", "object")
      , ("inviteId", "id")
      , ("inviteEmail", "email")
      , ("inviteRole", "role")
      , ("inviteStatus", "status")
      , ("inviteInvitedUnderscoreat", "invited_at")
      , ("inviteExpiresUnderscoreat", "expires_at")
      , ("inviteAcceptedUnderscoreat", "accepted_at")
      , ("inviteProjects", "projects")
      ]


-- | 
data InviteDeleteResponse = InviteDeleteResponse
  { inviteDeleteResponseObject :: Text -- ^ The object type, which is always `organization.invite.deleted`
  , inviteDeleteResponseId :: Text -- ^ 
  , inviteDeleteResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON InviteDeleteResponse where
  parseJSON = genericParseJSON optionsInviteDeleteResponse
instance ToJSON InviteDeleteResponse where
  toJSON = genericToJSON optionsInviteDeleteResponse

optionsInviteDeleteResponse :: Options
optionsInviteDeleteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("inviteDeleteResponseObject", "object")
      , ("inviteDeleteResponseId", "id")
      , ("inviteDeleteResponseDeleted", "deleted")
      ]


-- | 
data InviteListResponse = InviteListResponse
  { inviteListResponseObject :: Text -- ^ The object type, which is always `list`
  , inviteListResponseData :: [Invite] -- ^ 
  , inviteListResponseFirstUnderscoreid :: Maybe Text -- ^ The first `invite_id` in the retrieved `list`
  , inviteListResponseLastUnderscoreid :: Maybe Text -- ^ The last `invite_id` in the retrieved `list`
  , inviteListResponseHasUnderscoremore :: Maybe Bool -- ^ The `has_more` property is used for pagination to indicate there are additional results.
  } deriving (Show, Eq, Generic)

instance FromJSON InviteListResponse where
  parseJSON = genericParseJSON optionsInviteListResponse
instance ToJSON InviteListResponse where
  toJSON = genericToJSON optionsInviteListResponse

optionsInviteListResponse :: Options
optionsInviteListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("inviteListResponseObject", "object")
      , ("inviteListResponseData", "data")
      , ("inviteListResponseFirstUnderscoreid", "first_id")
      , ("inviteListResponseLastUnderscoreid", "last_id")
      , ("inviteListResponseHasUnderscoremore", "has_more")
      ]


-- | 
data InviteProjectsInner = InviteProjectsInner
  { inviteProjectsInnerId :: Maybe Text -- ^ Project's public ID
  , inviteProjectsInnerRole :: Maybe Text -- ^ Project membership role
  } deriving (Show, Eq, Generic)

instance FromJSON InviteProjectsInner where
  parseJSON = genericParseJSON optionsInviteProjectsInner
instance ToJSON InviteProjectsInner where
  toJSON = genericToJSON optionsInviteProjectsInner

optionsInviteProjectsInner :: Options
optionsInviteProjectsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("inviteProjectsInnerId", "id")
      , ("inviteProjectsInnerRole", "role")
      ]


-- | 
data InviteRequest = InviteRequest
  { inviteRequestEmail :: Text -- ^ Send an email to this address
  , inviteRequestRole :: Text -- ^ `owner` or `reader`
  , inviteRequestProjects :: Maybe [InviteRequestProjectsInner] -- ^ An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
  } deriving (Show, Eq, Generic)

instance FromJSON InviteRequest where
  parseJSON = genericParseJSON optionsInviteRequest
instance ToJSON InviteRequest where
  toJSON = genericToJSON optionsInviteRequest

optionsInviteRequest :: Options
optionsInviteRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("inviteRequestEmail", "email")
      , ("inviteRequestRole", "role")
      , ("inviteRequestProjects", "projects")
      ]


-- | 
data InviteRequestProjectsInner = InviteRequestProjectsInner
  { inviteRequestProjectsInnerId :: Text -- ^ Project's public ID
  , inviteRequestProjectsInnerRole :: Text -- ^ Project membership role
  } deriving (Show, Eq, Generic)

instance FromJSON InviteRequestProjectsInner where
  parseJSON = genericParseJSON optionsInviteRequestProjectsInner
instance ToJSON InviteRequestProjectsInner where
  toJSON = genericToJSON optionsInviteRequestProjectsInner

optionsInviteRequestProjectsInner :: Options
optionsInviteRequestProjectsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("inviteRequestProjectsInnerId", "id")
      , ("inviteRequestProjectsInnerRole", "role")
      ]


-- | 
data ListAssistantsResponse = ListAssistantsResponse
  { listAssistantsResponseObject :: Text -- ^ 
  , listAssistantsResponseData :: [AssistantObject] -- ^ 
  , listAssistantsResponseFirstUnderscoreid :: Text -- ^ 
  , listAssistantsResponseLastUnderscoreid :: Text -- ^ 
  , listAssistantsResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListAssistantsResponse where
  parseJSON = genericParseJSON optionsListAssistantsResponse
instance ToJSON ListAssistantsResponse where
  toJSON = genericToJSON optionsListAssistantsResponse

optionsListAssistantsResponse :: Options
optionsListAssistantsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listAssistantsResponseObject", "object")
      , ("listAssistantsResponseData", "data")
      , ("listAssistantsResponseFirstUnderscoreid", "first_id")
      , ("listAssistantsResponseLastUnderscoreid", "last_id")
      , ("listAssistantsResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListAuditLogsEffectiveAtParameter = ListAuditLogsEffectiveAtParameter
  { listAuditLogsEffectiveAtParameterGt :: Maybe Int -- ^ Return only events whose `effective_at` (Unix seconds) is greater than this value.
  , listAuditLogsEffectiveAtParameterGte :: Maybe Int -- ^ Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
  , listAuditLogsEffectiveAtParameterLt :: Maybe Int -- ^ Return only events whose `effective_at` (Unix seconds) is less than this value.
  , listAuditLogsEffectiveAtParameterLte :: Maybe Int -- ^ Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
  } deriving (Show, Eq, Generic)

instance FromJSON ListAuditLogsEffectiveAtParameter where
  parseJSON = genericParseJSON optionsListAuditLogsEffectiveAtParameter
instance ToJSON ListAuditLogsEffectiveAtParameter where
  toJSON = genericToJSON optionsListAuditLogsEffectiveAtParameter

optionsListAuditLogsEffectiveAtParameter :: Options
optionsListAuditLogsEffectiveAtParameter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listAuditLogsEffectiveAtParameterGt", "gt")
      , ("listAuditLogsEffectiveAtParameterGte", "gte")
      , ("listAuditLogsEffectiveAtParameterLt", "lt")
      , ("listAuditLogsEffectiveAtParameterLte", "lte")
      ]


-- | 
data ListAuditLogsResponse = ListAuditLogsResponse
  { listAuditLogsResponseObject :: Text -- ^ 
  , listAuditLogsResponseData :: [AuditLog] -- ^ 
  , listAuditLogsResponseFirstUnderscoreid :: Text -- ^ 
  , listAuditLogsResponseLastUnderscoreid :: Text -- ^ 
  , listAuditLogsResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListAuditLogsResponse where
  parseJSON = genericParseJSON optionsListAuditLogsResponse
instance ToJSON ListAuditLogsResponse where
  toJSON = genericToJSON optionsListAuditLogsResponse

optionsListAuditLogsResponse :: Options
optionsListAuditLogsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listAuditLogsResponseObject", "object")
      , ("listAuditLogsResponseData", "data")
      , ("listAuditLogsResponseFirstUnderscoreid", "first_id")
      , ("listAuditLogsResponseLastUnderscoreid", "last_id")
      , ("listAuditLogsResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListBatchesResponse = ListBatchesResponse
  { listBatchesResponseData :: [Batch] -- ^ 
  , listBatchesResponseFirstUnderscoreid :: Maybe Text -- ^ 
  , listBatchesResponseLastUnderscoreid :: Maybe Text -- ^ 
  , listBatchesResponseHasUnderscoremore :: Bool -- ^ 
  , listBatchesResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListBatchesResponse where
  parseJSON = genericParseJSON optionsListBatchesResponse
instance ToJSON ListBatchesResponse where
  toJSON = genericToJSON optionsListBatchesResponse

optionsListBatchesResponse :: Options
optionsListBatchesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listBatchesResponseData", "data")
      , ("listBatchesResponseFirstUnderscoreid", "first_id")
      , ("listBatchesResponseLastUnderscoreid", "last_id")
      , ("listBatchesResponseHasUnderscoremore", "has_more")
      , ("listBatchesResponseObject", "object")
      ]


-- | 
data ListFilesResponse = ListFilesResponse
  { listFilesResponseObject :: Text -- ^ 
  , listFilesResponseData :: [OpenAIFile] -- ^ 
  , listFilesResponseFirstUnderscoreid :: Text -- ^ 
  , listFilesResponseLastUnderscoreid :: Text -- ^ 
  , listFilesResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListFilesResponse where
  parseJSON = genericParseJSON optionsListFilesResponse
instance ToJSON ListFilesResponse where
  toJSON = genericToJSON optionsListFilesResponse

optionsListFilesResponse :: Options
optionsListFilesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listFilesResponseObject", "object")
      , ("listFilesResponseData", "data")
      , ("listFilesResponseFirstUnderscoreid", "first_id")
      , ("listFilesResponseLastUnderscoreid", "last_id")
      , ("listFilesResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListFineTuningJobCheckpointsResponse = ListFineTuningJobCheckpointsResponse
  { listFineTuningJobCheckpointsResponseData :: [FineTuningJobCheckpoint] -- ^ 
  , listFineTuningJobCheckpointsResponseObject :: Text -- ^ 
  , listFineTuningJobCheckpointsResponseFirstUnderscoreid :: Maybe Text -- ^ 
  , listFineTuningJobCheckpointsResponseLastUnderscoreid :: Maybe Text -- ^ 
  , listFineTuningJobCheckpointsResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListFineTuningJobCheckpointsResponse where
  parseJSON = genericParseJSON optionsListFineTuningJobCheckpointsResponse
instance ToJSON ListFineTuningJobCheckpointsResponse where
  toJSON = genericToJSON optionsListFineTuningJobCheckpointsResponse

optionsListFineTuningJobCheckpointsResponse :: Options
optionsListFineTuningJobCheckpointsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listFineTuningJobCheckpointsResponseData", "data")
      , ("listFineTuningJobCheckpointsResponseObject", "object")
      , ("listFineTuningJobCheckpointsResponseFirstUnderscoreid", "first_id")
      , ("listFineTuningJobCheckpointsResponseLastUnderscoreid", "last_id")
      , ("listFineTuningJobCheckpointsResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListFineTuningJobEventsResponse = ListFineTuningJobEventsResponse
  { listFineTuningJobEventsResponseData :: [FineTuningJobEvent] -- ^ 
  , listFineTuningJobEventsResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListFineTuningJobEventsResponse where
  parseJSON = genericParseJSON optionsListFineTuningJobEventsResponse
instance ToJSON ListFineTuningJobEventsResponse where
  toJSON = genericToJSON optionsListFineTuningJobEventsResponse

optionsListFineTuningJobEventsResponse :: Options
optionsListFineTuningJobEventsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listFineTuningJobEventsResponseData", "data")
      , ("listFineTuningJobEventsResponseObject", "object")
      ]


-- | 
data ListMessagesResponse = ListMessagesResponse
  { listMessagesResponseObject :: Text -- ^ 
  , listMessagesResponseData :: [MessageObject] -- ^ 
  , listMessagesResponseFirstUnderscoreid :: Text -- ^ 
  , listMessagesResponseLastUnderscoreid :: Text -- ^ 
  , listMessagesResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListMessagesResponse where
  parseJSON = genericParseJSON optionsListMessagesResponse
instance ToJSON ListMessagesResponse where
  toJSON = genericToJSON optionsListMessagesResponse

optionsListMessagesResponse :: Options
optionsListMessagesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listMessagesResponseObject", "object")
      , ("listMessagesResponseData", "data")
      , ("listMessagesResponseFirstUnderscoreid", "first_id")
      , ("listMessagesResponseLastUnderscoreid", "last_id")
      , ("listMessagesResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListModelsResponse = ListModelsResponse
  { listModelsResponseObject :: Text -- ^ 
  , listModelsResponseData :: [Model] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListModelsResponse where
  parseJSON = genericParseJSON optionsListModelsResponse
instance ToJSON ListModelsResponse where
  toJSON = genericToJSON optionsListModelsResponse

optionsListModelsResponse :: Options
optionsListModelsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listModelsResponseObject", "object")
      , ("listModelsResponseData", "data")
      ]


-- | 
data ListPaginatedFineTuningJobsResponse = ListPaginatedFineTuningJobsResponse
  { listPaginatedFineTuningJobsResponseData :: [FineTuningJob] -- ^ 
  , listPaginatedFineTuningJobsResponseHasUnderscoremore :: Bool -- ^ 
  , listPaginatedFineTuningJobsResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListPaginatedFineTuningJobsResponse where
  parseJSON = genericParseJSON optionsListPaginatedFineTuningJobsResponse
instance ToJSON ListPaginatedFineTuningJobsResponse where
  toJSON = genericToJSON optionsListPaginatedFineTuningJobsResponse

optionsListPaginatedFineTuningJobsResponse :: Options
optionsListPaginatedFineTuningJobsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listPaginatedFineTuningJobsResponseData", "data")
      , ("listPaginatedFineTuningJobsResponseHasUnderscoremore", "has_more")
      , ("listPaginatedFineTuningJobsResponseObject", "object")
      ]


-- | 
data ListRunStepsResponse = ListRunStepsResponse
  { listRunStepsResponseObject :: Text -- ^ 
  , listRunStepsResponseData :: [RunStepObject] -- ^ 
  , listRunStepsResponseFirstUnderscoreid :: Text -- ^ 
  , listRunStepsResponseLastUnderscoreid :: Text -- ^ 
  , listRunStepsResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListRunStepsResponse where
  parseJSON = genericParseJSON optionsListRunStepsResponse
instance ToJSON ListRunStepsResponse where
  toJSON = genericToJSON optionsListRunStepsResponse

optionsListRunStepsResponse :: Options
optionsListRunStepsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listRunStepsResponseObject", "object")
      , ("listRunStepsResponseData", "data")
      , ("listRunStepsResponseFirstUnderscoreid", "first_id")
      , ("listRunStepsResponseLastUnderscoreid", "last_id")
      , ("listRunStepsResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListRunsResponse = ListRunsResponse
  { listRunsResponseObject :: Text -- ^ 
  , listRunsResponseData :: [RunObject] -- ^ 
  , listRunsResponseFirstUnderscoreid :: Text -- ^ 
  , listRunsResponseLastUnderscoreid :: Text -- ^ 
  , listRunsResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListRunsResponse where
  parseJSON = genericParseJSON optionsListRunsResponse
instance ToJSON ListRunsResponse where
  toJSON = genericToJSON optionsListRunsResponse

optionsListRunsResponse :: Options
optionsListRunsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listRunsResponseObject", "object")
      , ("listRunsResponseData", "data")
      , ("listRunsResponseFirstUnderscoreid", "first_id")
      , ("listRunsResponseLastUnderscoreid", "last_id")
      , ("listRunsResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListThreadsResponse = ListThreadsResponse
  { listThreadsResponseObject :: Text -- ^ 
  , listThreadsResponseData :: [ThreadObject] -- ^ 
  , listThreadsResponseFirstUnderscoreid :: Text -- ^ 
  , listThreadsResponseLastUnderscoreid :: Text -- ^ 
  , listThreadsResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListThreadsResponse where
  parseJSON = genericParseJSON optionsListThreadsResponse
instance ToJSON ListThreadsResponse where
  toJSON = genericToJSON optionsListThreadsResponse

optionsListThreadsResponse :: Options
optionsListThreadsResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listThreadsResponseObject", "object")
      , ("listThreadsResponseData", "data")
      , ("listThreadsResponseFirstUnderscoreid", "first_id")
      , ("listThreadsResponseLastUnderscoreid", "last_id")
      , ("listThreadsResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListVectorStoreFilesResponse = ListVectorStoreFilesResponse
  { listVectorStoreFilesResponseObject :: Text -- ^ 
  , listVectorStoreFilesResponseData :: [VectorStoreFileObject] -- ^ 
  , listVectorStoreFilesResponseFirstUnderscoreid :: Text -- ^ 
  , listVectorStoreFilesResponseLastUnderscoreid :: Text -- ^ 
  , listVectorStoreFilesResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListVectorStoreFilesResponse where
  parseJSON = genericParseJSON optionsListVectorStoreFilesResponse
instance ToJSON ListVectorStoreFilesResponse where
  toJSON = genericToJSON optionsListVectorStoreFilesResponse

optionsListVectorStoreFilesResponse :: Options
optionsListVectorStoreFilesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listVectorStoreFilesResponseObject", "object")
      , ("listVectorStoreFilesResponseData", "data")
      , ("listVectorStoreFilesResponseFirstUnderscoreid", "first_id")
      , ("listVectorStoreFilesResponseLastUnderscoreid", "last_id")
      , ("listVectorStoreFilesResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ListVectorStoresResponse = ListVectorStoresResponse
  { listVectorStoresResponseObject :: Text -- ^ 
  , listVectorStoresResponseData :: [VectorStoreObject] -- ^ 
  , listVectorStoresResponseFirstUnderscoreid :: Text -- ^ 
  , listVectorStoresResponseLastUnderscoreid :: Text -- ^ 
  , listVectorStoresResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListVectorStoresResponse where
  parseJSON = genericParseJSON optionsListVectorStoresResponse
instance ToJSON ListVectorStoresResponse where
  toJSON = genericToJSON optionsListVectorStoresResponse

optionsListVectorStoresResponse :: Options
optionsListVectorStoresResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listVectorStoresResponseObject", "object")
      , ("listVectorStoresResponseData", "data")
      , ("listVectorStoresResponseFirstUnderscoreid", "first_id")
      , ("listVectorStoresResponseLastUnderscoreid", "last_id")
      , ("listVectorStoresResponseHasUnderscoremore", "has_more")
      ]


-- | References an image [File](/docs/api-reference/files) in the content of a message.
data MessageContentImageFileObject = MessageContentImageFileObject
  { messageContentImageFileObjectType :: Text -- ^ Always `image_file`.
  , messageContentImageFileObjectImageUnderscorefile :: MessageContentImageFileObjectImageFile -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentImageFileObject where
  parseJSON = genericParseJSON optionsMessageContentImageFileObject
instance ToJSON MessageContentImageFileObject where
  toJSON = genericToJSON optionsMessageContentImageFileObject

optionsMessageContentImageFileObject :: Options
optionsMessageContentImageFileObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentImageFileObjectType", "type")
      , ("messageContentImageFileObjectImageUnderscorefile", "image_file")
      ]


-- | 
data MessageContentImageFileObjectImageFile = MessageContentImageFileObjectImageFile
  { messageContentImageFileObjectImageFileFileUnderscoreid :: Text -- ^ The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  , messageContentImageFileObjectImageFileDetail :: Maybe Text -- ^ Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentImageFileObjectImageFile where
  parseJSON = genericParseJSON optionsMessageContentImageFileObjectImageFile
instance ToJSON MessageContentImageFileObjectImageFile where
  toJSON = genericToJSON optionsMessageContentImageFileObjectImageFile

optionsMessageContentImageFileObjectImageFile :: Options
optionsMessageContentImageFileObjectImageFile =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentImageFileObjectImageFileFileUnderscoreid", "file_id")
      , ("messageContentImageFileObjectImageFileDetail", "detail")
      ]


-- | References an image URL in the content of a message.
data MessageContentImageUrlObject = MessageContentImageUrlObject
  { messageContentImageUrlObjectType :: Text -- ^ The type of the content part.
  , messageContentImageUrlObjectImageUnderscoreurl :: MessageContentImageUrlObjectImageUrl -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentImageUrlObject where
  parseJSON = genericParseJSON optionsMessageContentImageUrlObject
instance ToJSON MessageContentImageUrlObject where
  toJSON = genericToJSON optionsMessageContentImageUrlObject

optionsMessageContentImageUrlObject :: Options
optionsMessageContentImageUrlObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentImageUrlObjectType", "type")
      , ("messageContentImageUrlObjectImageUnderscoreurl", "image_url")
      ]


-- | 
data MessageContentImageUrlObjectImageUrl = MessageContentImageUrlObjectImageUrl
  { messageContentImageUrlObjectImageUrlUrl :: Text -- ^ The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  , messageContentImageUrlObjectImageUrlDetail :: Maybe Text -- ^ Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentImageUrlObjectImageUrl where
  parseJSON = genericParseJSON optionsMessageContentImageUrlObjectImageUrl
instance ToJSON MessageContentImageUrlObjectImageUrl where
  toJSON = genericToJSON optionsMessageContentImageUrlObjectImageUrl

optionsMessageContentImageUrlObjectImageUrl :: Options
optionsMessageContentImageUrlObjectImageUrl =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentImageUrlObjectImageUrlUrl", "url")
      , ("messageContentImageUrlObjectImageUrlDetail", "detail")
      ]


-- | The refusal content generated by the assistant.
data MessageContentRefusalObject = MessageContentRefusalObject
  { messageContentRefusalObjectType :: Text -- ^ Always `refusal`.
  , messageContentRefusalObjectRefusal :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentRefusalObject where
  parseJSON = genericParseJSON optionsMessageContentRefusalObject
instance ToJSON MessageContentRefusalObject where
  toJSON = genericToJSON optionsMessageContentRefusalObject

optionsMessageContentRefusalObject :: Options
optionsMessageContentRefusalObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentRefusalObjectType", "type")
      , ("messageContentRefusalObjectRefusal", "refusal")
      ]


-- | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
data MessageContentTextAnnotationsFileCitationObject = MessageContentTextAnnotationsFileCitationObject
  { messageContentTextAnnotationsFileCitationObjectType :: Text -- ^ Always `file_citation`.
  , messageContentTextAnnotationsFileCitationObjectText :: Text -- ^ The text in the message content that needs to be replaced.
  , messageContentTextAnnotationsFileCitationObjectFileUnderscorecitation :: MessageContentTextAnnotationsFileCitationObjectFileCitation -- ^ 
  , messageContentTextAnnotationsFileCitationObjectStartUnderscoreindex :: Int -- ^ 
  , messageContentTextAnnotationsFileCitationObjectEndUnderscoreindex :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextAnnotationsFileCitationObject where
  parseJSON = genericParseJSON optionsMessageContentTextAnnotationsFileCitationObject
instance ToJSON MessageContentTextAnnotationsFileCitationObject where
  toJSON = genericToJSON optionsMessageContentTextAnnotationsFileCitationObject

optionsMessageContentTextAnnotationsFileCitationObject :: Options
optionsMessageContentTextAnnotationsFileCitationObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextAnnotationsFileCitationObjectType", "type")
      , ("messageContentTextAnnotationsFileCitationObjectText", "text")
      , ("messageContentTextAnnotationsFileCitationObjectFileUnderscorecitation", "file_citation")
      , ("messageContentTextAnnotationsFileCitationObjectStartUnderscoreindex", "start_index")
      , ("messageContentTextAnnotationsFileCitationObjectEndUnderscoreindex", "end_index")
      ]


-- | 
data MessageContentTextAnnotationsFileCitationObjectFileCitation = MessageContentTextAnnotationsFileCitationObjectFileCitation
  { messageContentTextAnnotationsFileCitationObjectFileCitationFileUnderscoreid :: Text -- ^ The ID of the specific File the citation is from.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextAnnotationsFileCitationObjectFileCitation where
  parseJSON = genericParseJSON optionsMessageContentTextAnnotationsFileCitationObjectFileCitation
instance ToJSON MessageContentTextAnnotationsFileCitationObjectFileCitation where
  toJSON = genericToJSON optionsMessageContentTextAnnotationsFileCitationObjectFileCitation

optionsMessageContentTextAnnotationsFileCitationObjectFileCitation :: Options
optionsMessageContentTextAnnotationsFileCitationObjectFileCitation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextAnnotationsFileCitationObjectFileCitationFileUnderscoreid", "file_id")
      ]


-- | A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
data MessageContentTextAnnotationsFilePathObject = MessageContentTextAnnotationsFilePathObject
  { messageContentTextAnnotationsFilePathObjectType :: Text -- ^ Always `file_path`.
  , messageContentTextAnnotationsFilePathObjectText :: Text -- ^ The text in the message content that needs to be replaced.
  , messageContentTextAnnotationsFilePathObjectFileUnderscorepath :: MessageContentTextAnnotationsFilePathObjectFilePath -- ^ 
  , messageContentTextAnnotationsFilePathObjectStartUnderscoreindex :: Int -- ^ 
  , messageContentTextAnnotationsFilePathObjectEndUnderscoreindex :: Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextAnnotationsFilePathObject where
  parseJSON = genericParseJSON optionsMessageContentTextAnnotationsFilePathObject
instance ToJSON MessageContentTextAnnotationsFilePathObject where
  toJSON = genericToJSON optionsMessageContentTextAnnotationsFilePathObject

optionsMessageContentTextAnnotationsFilePathObject :: Options
optionsMessageContentTextAnnotationsFilePathObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextAnnotationsFilePathObjectType", "type")
      , ("messageContentTextAnnotationsFilePathObjectText", "text")
      , ("messageContentTextAnnotationsFilePathObjectFileUnderscorepath", "file_path")
      , ("messageContentTextAnnotationsFilePathObjectStartUnderscoreindex", "start_index")
      , ("messageContentTextAnnotationsFilePathObjectEndUnderscoreindex", "end_index")
      ]


-- | 
data MessageContentTextAnnotationsFilePathObjectFilePath = MessageContentTextAnnotationsFilePathObjectFilePath
  { messageContentTextAnnotationsFilePathObjectFilePathFileUnderscoreid :: Text -- ^ The ID of the file that was generated.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextAnnotationsFilePathObjectFilePath where
  parseJSON = genericParseJSON optionsMessageContentTextAnnotationsFilePathObjectFilePath
instance ToJSON MessageContentTextAnnotationsFilePathObjectFilePath where
  toJSON = genericToJSON optionsMessageContentTextAnnotationsFilePathObjectFilePath

optionsMessageContentTextAnnotationsFilePathObjectFilePath :: Options
optionsMessageContentTextAnnotationsFilePathObjectFilePath =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextAnnotationsFilePathObjectFilePathFileUnderscoreid", "file_id")
      ]


-- | The text content that is part of a message.
data MessageContentTextObject = MessageContentTextObject
  { messageContentTextObjectType :: Text -- ^ Always `text`.
  , messageContentTextObjectText :: MessageContentTextObjectText -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextObject where
  parseJSON = genericParseJSON optionsMessageContentTextObject
instance ToJSON MessageContentTextObject where
  toJSON = genericToJSON optionsMessageContentTextObject

optionsMessageContentTextObject :: Options
optionsMessageContentTextObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextObjectType", "type")
      , ("messageContentTextObjectText", "text")
      ]


-- | 
data MessageContentTextObjectText = MessageContentTextObjectText
  { messageContentTextObjectTextValue :: Text -- ^ The data that makes up the text.
  , messageContentTextObjectTextAnnotations :: [MessageContentTextObjectTextAnnotationsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextObjectText where
  parseJSON = genericParseJSON optionsMessageContentTextObjectText
instance ToJSON MessageContentTextObjectText where
  toJSON = genericToJSON optionsMessageContentTextObjectText

optionsMessageContentTextObjectText :: Options
optionsMessageContentTextObjectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextObjectTextValue", "value")
      , ("messageContentTextObjectTextAnnotations", "annotations")
      ]


-- | 
data MessageContentTextObjectTextAnnotationsInner = MessageContentTextObjectTextAnnotationsInner
  { messageContentTextObjectTextAnnotationsInnerType :: Text -- ^ Always `file_citation`.
  , messageContentTextObjectTextAnnotationsInnerText :: Text -- ^ The text in the message content that needs to be replaced.
  , messageContentTextObjectTextAnnotationsInnerFileUnderscorecitation :: MessageContentTextAnnotationsFileCitationObjectFileCitation -- ^ 
  , messageContentTextObjectTextAnnotationsInnerStartUnderscoreindex :: Int -- ^ 
  , messageContentTextObjectTextAnnotationsInnerEndUnderscoreindex :: Int -- ^ 
  , messageContentTextObjectTextAnnotationsInnerFileUnderscorepath :: MessageContentTextAnnotationsFilePathObjectFilePath -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageContentTextObjectTextAnnotationsInner where
  parseJSON = genericParseJSON optionsMessageContentTextObjectTextAnnotationsInner
instance ToJSON MessageContentTextObjectTextAnnotationsInner where
  toJSON = genericToJSON optionsMessageContentTextObjectTextAnnotationsInner

optionsMessageContentTextObjectTextAnnotationsInner :: Options
optionsMessageContentTextObjectTextAnnotationsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageContentTextObjectTextAnnotationsInnerType", "type")
      , ("messageContentTextObjectTextAnnotationsInnerText", "text")
      , ("messageContentTextObjectTextAnnotationsInnerFileUnderscorecitation", "file_citation")
      , ("messageContentTextObjectTextAnnotationsInnerStartUnderscoreindex", "start_index")
      , ("messageContentTextObjectTextAnnotationsInnerEndUnderscoreindex", "end_index")
      , ("messageContentTextObjectTextAnnotationsInnerFileUnderscorepath", "file_path")
      ]


-- | References an image [File](/docs/api-reference/files) in the content of a message.
data MessageDeltaContentImageFileObject = MessageDeltaContentImageFileObject
  { messageDeltaContentImageFileObjectIndex :: Int -- ^ The index of the content part in the message.
  , messageDeltaContentImageFileObjectType :: Text -- ^ Always `image_file`.
  , messageDeltaContentImageFileObjectImageUnderscorefile :: Maybe MessageDeltaContentImageFileObjectImageFile -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentImageFileObject where
  parseJSON = genericParseJSON optionsMessageDeltaContentImageFileObject
instance ToJSON MessageDeltaContentImageFileObject where
  toJSON = genericToJSON optionsMessageDeltaContentImageFileObject

optionsMessageDeltaContentImageFileObject :: Options
optionsMessageDeltaContentImageFileObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentImageFileObjectIndex", "index")
      , ("messageDeltaContentImageFileObjectType", "type")
      , ("messageDeltaContentImageFileObjectImageUnderscorefile", "image_file")
      ]


-- | 
data MessageDeltaContentImageFileObjectImageFile = MessageDeltaContentImageFileObjectImageFile
  { messageDeltaContentImageFileObjectImageFileFileUnderscoreid :: Maybe Text -- ^ The [File](/docs/api-reference/files) ID of the image in the message content. Set `purpose=\"vision\"` when uploading the File if you need to later display the file content.
  , messageDeltaContentImageFileObjectImageFileDetail :: Maybe Text -- ^ Specifies the detail level of the image if specified by the user. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentImageFileObjectImageFile where
  parseJSON = genericParseJSON optionsMessageDeltaContentImageFileObjectImageFile
instance ToJSON MessageDeltaContentImageFileObjectImageFile where
  toJSON = genericToJSON optionsMessageDeltaContentImageFileObjectImageFile

optionsMessageDeltaContentImageFileObjectImageFile :: Options
optionsMessageDeltaContentImageFileObjectImageFile =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentImageFileObjectImageFileFileUnderscoreid", "file_id")
      , ("messageDeltaContentImageFileObjectImageFileDetail", "detail")
      ]


-- | References an image URL in the content of a message.
data MessageDeltaContentImageUrlObject = MessageDeltaContentImageUrlObject
  { messageDeltaContentImageUrlObjectIndex :: Int -- ^ The index of the content part in the message.
  , messageDeltaContentImageUrlObjectType :: Text -- ^ Always `image_url`.
  , messageDeltaContentImageUrlObjectImageUnderscoreurl :: Maybe MessageDeltaContentImageUrlObjectImageUrl -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentImageUrlObject where
  parseJSON = genericParseJSON optionsMessageDeltaContentImageUrlObject
instance ToJSON MessageDeltaContentImageUrlObject where
  toJSON = genericToJSON optionsMessageDeltaContentImageUrlObject

optionsMessageDeltaContentImageUrlObject :: Options
optionsMessageDeltaContentImageUrlObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentImageUrlObjectIndex", "index")
      , ("messageDeltaContentImageUrlObjectType", "type")
      , ("messageDeltaContentImageUrlObjectImageUnderscoreurl", "image_url")
      ]


-- | 
data MessageDeltaContentImageUrlObjectImageUrl = MessageDeltaContentImageUrlObjectImageUrl
  { messageDeltaContentImageUrlObjectImageUrlUrl :: Maybe Text -- ^ The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
  , messageDeltaContentImageUrlObjectImageUrlDetail :: Maybe Text -- ^ Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentImageUrlObjectImageUrl where
  parseJSON = genericParseJSON optionsMessageDeltaContentImageUrlObjectImageUrl
instance ToJSON MessageDeltaContentImageUrlObjectImageUrl where
  toJSON = genericToJSON optionsMessageDeltaContentImageUrlObjectImageUrl

optionsMessageDeltaContentImageUrlObjectImageUrl :: Options
optionsMessageDeltaContentImageUrlObjectImageUrl =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentImageUrlObjectImageUrlUrl", "url")
      , ("messageDeltaContentImageUrlObjectImageUrlDetail", "detail")
      ]


-- | The refusal content that is part of a message.
data MessageDeltaContentRefusalObject = MessageDeltaContentRefusalObject
  { messageDeltaContentRefusalObjectIndex :: Int -- ^ The index of the refusal part in the message.
  , messageDeltaContentRefusalObjectType :: Text -- ^ Always `refusal`.
  , messageDeltaContentRefusalObjectRefusal :: Maybe Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentRefusalObject where
  parseJSON = genericParseJSON optionsMessageDeltaContentRefusalObject
instance ToJSON MessageDeltaContentRefusalObject where
  toJSON = genericToJSON optionsMessageDeltaContentRefusalObject

optionsMessageDeltaContentRefusalObject :: Options
optionsMessageDeltaContentRefusalObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentRefusalObjectIndex", "index")
      , ("messageDeltaContentRefusalObjectType", "type")
      , ("messageDeltaContentRefusalObjectRefusal", "refusal")
      ]


-- | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
data MessageDeltaContentTextAnnotationsFileCitationObject = MessageDeltaContentTextAnnotationsFileCitationObject
  { messageDeltaContentTextAnnotationsFileCitationObjectIndex :: Int -- ^ The index of the annotation in the text content part.
  , messageDeltaContentTextAnnotationsFileCitationObjectType :: Text -- ^ Always `file_citation`.
  , messageDeltaContentTextAnnotationsFileCitationObjectText :: Maybe Text -- ^ The text in the message content that needs to be replaced.
  , messageDeltaContentTextAnnotationsFileCitationObjectFileUnderscorecitation :: Maybe MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation -- ^ 
  , messageDeltaContentTextAnnotationsFileCitationObjectStartUnderscoreindex :: Maybe Int -- ^ 
  , messageDeltaContentTextAnnotationsFileCitationObjectEndUnderscoreindex :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextAnnotationsFileCitationObject where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextAnnotationsFileCitationObject
instance ToJSON MessageDeltaContentTextAnnotationsFileCitationObject where
  toJSON = genericToJSON optionsMessageDeltaContentTextAnnotationsFileCitationObject

optionsMessageDeltaContentTextAnnotationsFileCitationObject :: Options
optionsMessageDeltaContentTextAnnotationsFileCitationObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextAnnotationsFileCitationObjectIndex", "index")
      , ("messageDeltaContentTextAnnotationsFileCitationObjectType", "type")
      , ("messageDeltaContentTextAnnotationsFileCitationObjectText", "text")
      , ("messageDeltaContentTextAnnotationsFileCitationObjectFileUnderscorecitation", "file_citation")
      , ("messageDeltaContentTextAnnotationsFileCitationObjectStartUnderscoreindex", "start_index")
      , ("messageDeltaContentTextAnnotationsFileCitationObjectEndUnderscoreindex", "end_index")
      ]


-- | 
data MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation = MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
  { messageDeltaContentTextAnnotationsFileCitationObjectFileCitationFileUnderscoreid :: Maybe Text -- ^ The ID of the specific File the citation is from.
  , messageDeltaContentTextAnnotationsFileCitationObjectFileCitationQuote :: Maybe Text -- ^ The specific quote in the file.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
instance ToJSON MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation where
  toJSON = genericToJSON optionsMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation

optionsMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation :: Options
optionsMessageDeltaContentTextAnnotationsFileCitationObjectFileCitation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextAnnotationsFileCitationObjectFileCitationFileUnderscoreid", "file_id")
      , ("messageDeltaContentTextAnnotationsFileCitationObjectFileCitationQuote", "quote")
      ]


-- | A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
data MessageDeltaContentTextAnnotationsFilePathObject = MessageDeltaContentTextAnnotationsFilePathObject
  { messageDeltaContentTextAnnotationsFilePathObjectIndex :: Int -- ^ The index of the annotation in the text content part.
  , messageDeltaContentTextAnnotationsFilePathObjectType :: Text -- ^ Always `file_path`.
  , messageDeltaContentTextAnnotationsFilePathObjectText :: Maybe Text -- ^ The text in the message content that needs to be replaced.
  , messageDeltaContentTextAnnotationsFilePathObjectFileUnderscorepath :: Maybe MessageDeltaContentTextAnnotationsFilePathObjectFilePath -- ^ 
  , messageDeltaContentTextAnnotationsFilePathObjectStartUnderscoreindex :: Maybe Int -- ^ 
  , messageDeltaContentTextAnnotationsFilePathObjectEndUnderscoreindex :: Maybe Int -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextAnnotationsFilePathObject where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextAnnotationsFilePathObject
instance ToJSON MessageDeltaContentTextAnnotationsFilePathObject where
  toJSON = genericToJSON optionsMessageDeltaContentTextAnnotationsFilePathObject

optionsMessageDeltaContentTextAnnotationsFilePathObject :: Options
optionsMessageDeltaContentTextAnnotationsFilePathObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextAnnotationsFilePathObjectIndex", "index")
      , ("messageDeltaContentTextAnnotationsFilePathObjectType", "type")
      , ("messageDeltaContentTextAnnotationsFilePathObjectText", "text")
      , ("messageDeltaContentTextAnnotationsFilePathObjectFileUnderscorepath", "file_path")
      , ("messageDeltaContentTextAnnotationsFilePathObjectStartUnderscoreindex", "start_index")
      , ("messageDeltaContentTextAnnotationsFilePathObjectEndUnderscoreindex", "end_index")
      ]


-- | 
data MessageDeltaContentTextAnnotationsFilePathObjectFilePath = MessageDeltaContentTextAnnotationsFilePathObjectFilePath
  { messageDeltaContentTextAnnotationsFilePathObjectFilePathFileUnderscoreid :: Maybe Text -- ^ The ID of the file that was generated.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextAnnotationsFilePathObjectFilePath where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextAnnotationsFilePathObjectFilePath
instance ToJSON MessageDeltaContentTextAnnotationsFilePathObjectFilePath where
  toJSON = genericToJSON optionsMessageDeltaContentTextAnnotationsFilePathObjectFilePath

optionsMessageDeltaContentTextAnnotationsFilePathObjectFilePath :: Options
optionsMessageDeltaContentTextAnnotationsFilePathObjectFilePath =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextAnnotationsFilePathObjectFilePathFileUnderscoreid", "file_id")
      ]


-- | The text content that is part of a message.
data MessageDeltaContentTextObject = MessageDeltaContentTextObject
  { messageDeltaContentTextObjectIndex :: Int -- ^ The index of the content part in the message.
  , messageDeltaContentTextObjectType :: Text -- ^ Always `text`.
  , messageDeltaContentTextObjectText :: Maybe MessageDeltaContentTextObjectText -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextObject where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextObject
instance ToJSON MessageDeltaContentTextObject where
  toJSON = genericToJSON optionsMessageDeltaContentTextObject

optionsMessageDeltaContentTextObject :: Options
optionsMessageDeltaContentTextObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextObjectIndex", "index")
      , ("messageDeltaContentTextObjectType", "type")
      , ("messageDeltaContentTextObjectText", "text")
      ]


-- | 
data MessageDeltaContentTextObjectText = MessageDeltaContentTextObjectText
  { messageDeltaContentTextObjectTextValue :: Maybe Text -- ^ The data that makes up the text.
  , messageDeltaContentTextObjectTextAnnotations :: Maybe [MessageDeltaContentTextObjectTextAnnotationsInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextObjectText where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextObjectText
instance ToJSON MessageDeltaContentTextObjectText where
  toJSON = genericToJSON optionsMessageDeltaContentTextObjectText

optionsMessageDeltaContentTextObjectText :: Options
optionsMessageDeltaContentTextObjectText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextObjectTextValue", "value")
      , ("messageDeltaContentTextObjectTextAnnotations", "annotations")
      ]


-- | 
data MessageDeltaContentTextObjectTextAnnotationsInner = MessageDeltaContentTextObjectTextAnnotationsInner
  { messageDeltaContentTextObjectTextAnnotationsInnerIndex :: Int -- ^ The index of the annotation in the text content part.
  , messageDeltaContentTextObjectTextAnnotationsInnerType :: Text -- ^ Always `file_citation`.
  , messageDeltaContentTextObjectTextAnnotationsInnerText :: Maybe Text -- ^ The text in the message content that needs to be replaced.
  , messageDeltaContentTextObjectTextAnnotationsInnerFileUnderscorecitation :: Maybe MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation -- ^ 
  , messageDeltaContentTextObjectTextAnnotationsInnerStartUnderscoreindex :: Maybe Int -- ^ 
  , messageDeltaContentTextObjectTextAnnotationsInnerEndUnderscoreindex :: Maybe Int -- ^ 
  , messageDeltaContentTextObjectTextAnnotationsInnerFileUnderscorepath :: Maybe MessageDeltaContentTextAnnotationsFilePathObjectFilePath -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaContentTextObjectTextAnnotationsInner where
  parseJSON = genericParseJSON optionsMessageDeltaContentTextObjectTextAnnotationsInner
instance ToJSON MessageDeltaContentTextObjectTextAnnotationsInner where
  toJSON = genericToJSON optionsMessageDeltaContentTextObjectTextAnnotationsInner

optionsMessageDeltaContentTextObjectTextAnnotationsInner :: Options
optionsMessageDeltaContentTextObjectTextAnnotationsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaContentTextObjectTextAnnotationsInnerIndex", "index")
      , ("messageDeltaContentTextObjectTextAnnotationsInnerType", "type")
      , ("messageDeltaContentTextObjectTextAnnotationsInnerText", "text")
      , ("messageDeltaContentTextObjectTextAnnotationsInnerFileUnderscorecitation", "file_citation")
      , ("messageDeltaContentTextObjectTextAnnotationsInnerStartUnderscoreindex", "start_index")
      , ("messageDeltaContentTextObjectTextAnnotationsInnerEndUnderscoreindex", "end_index")
      , ("messageDeltaContentTextObjectTextAnnotationsInnerFileUnderscorepath", "file_path")
      ]


-- | Represents a message delta i.e. any changed fields on a message during streaming. 
data MessageDeltaObject = MessageDeltaObject
  { messageDeltaObjectId :: Text -- ^ The identifier of the message, which can be referenced in API endpoints.
  , messageDeltaObjectObject :: Text -- ^ The object type, which is always `thread.message.delta`.
  , messageDeltaObjectDelta :: MessageDeltaObjectDelta -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaObject where
  parseJSON = genericParseJSON optionsMessageDeltaObject
instance ToJSON MessageDeltaObject where
  toJSON = genericToJSON optionsMessageDeltaObject

optionsMessageDeltaObject :: Options
optionsMessageDeltaObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaObjectId", "id")
      , ("messageDeltaObjectObject", "object")
      , ("messageDeltaObjectDelta", "delta")
      ]


-- | The delta containing the fields that have changed on the Message.
data MessageDeltaObjectDelta = MessageDeltaObjectDelta
  { messageDeltaObjectDeltaRole :: Maybe Text -- ^ The entity that produced the message. One of `user` or `assistant`.
  , messageDeltaObjectDeltaContent :: Maybe [MessageDeltaObjectDeltaContentInner] -- ^ The content of the message in array of text and/or images.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaObjectDelta where
  parseJSON = genericParseJSON optionsMessageDeltaObjectDelta
instance ToJSON MessageDeltaObjectDelta where
  toJSON = genericToJSON optionsMessageDeltaObjectDelta

optionsMessageDeltaObjectDelta :: Options
optionsMessageDeltaObjectDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaObjectDeltaRole", "role")
      , ("messageDeltaObjectDeltaContent", "content")
      ]


-- | 
data MessageDeltaObjectDeltaContentInner = MessageDeltaObjectDeltaContentInner
  { messageDeltaObjectDeltaContentInnerIndex :: Int -- ^ The index of the content part in the message.
  , messageDeltaObjectDeltaContentInnerType :: Text -- ^ Always `image_file`.
  , messageDeltaObjectDeltaContentInnerImageUnderscorefile :: Maybe MessageDeltaContentImageFileObjectImageFile -- ^ 
  , messageDeltaObjectDeltaContentInnerText :: Maybe MessageDeltaContentTextObjectText -- ^ 
  , messageDeltaObjectDeltaContentInnerRefusal :: Maybe Text -- ^ 
  , messageDeltaObjectDeltaContentInnerImageUnderscoreurl :: Maybe MessageDeltaContentImageUrlObjectImageUrl -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageDeltaObjectDeltaContentInner where
  parseJSON = genericParseJSON optionsMessageDeltaObjectDeltaContentInner
instance ToJSON MessageDeltaObjectDeltaContentInner where
  toJSON = genericToJSON optionsMessageDeltaObjectDeltaContentInner

optionsMessageDeltaObjectDeltaContentInner :: Options
optionsMessageDeltaObjectDeltaContentInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageDeltaObjectDeltaContentInnerIndex", "index")
      , ("messageDeltaObjectDeltaContentInnerType", "type")
      , ("messageDeltaObjectDeltaContentInnerImageUnderscorefile", "image_file")
      , ("messageDeltaObjectDeltaContentInnerText", "text")
      , ("messageDeltaObjectDeltaContentInnerRefusal", "refusal")
      , ("messageDeltaObjectDeltaContentInnerImageUnderscoreurl", "image_url")
      ]


-- | Represents a message within a [thread](/docs/api-reference/threads).
data MessageObject = MessageObject
  { messageObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , messageObjectObject :: Text -- ^ The object type, which is always `thread.message`.
  , messageObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the message was created.
  , messageObjectThreadUnderscoreid :: Text -- ^ The [thread](/docs/api-reference/threads) ID that this message belongs to.
  , messageObjectStatus :: Text -- ^ The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
  , messageObjectIncompleteUnderscoredetails :: MessageObjectIncompleteDetails -- ^ 
  , messageObjectCompletedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the message was completed.
  , messageObjectIncompleteUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the message was marked as incomplete.
  , messageObjectRole :: Text -- ^ The entity that produced the message. One of `user` or `assistant`.
  , messageObjectContent :: [MessageObjectContentInner] -- ^ The content of the message in array of text and/or images.
  , messageObjectAssistantUnderscoreid :: Text -- ^ If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
  , messageObjectRunUnderscoreid :: Text -- ^ The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
  , messageObjectAttachments :: [CreateMessageRequestAttachmentsInner] -- ^ A list of files attached to the message, and the tools they were added to.
  , messageObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageObject where
  parseJSON = genericParseJSON optionsMessageObject
instance ToJSON MessageObject where
  toJSON = genericToJSON optionsMessageObject

optionsMessageObject :: Options
optionsMessageObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageObjectId", "id")
      , ("messageObjectObject", "object")
      , ("messageObjectCreatedUnderscoreat", "created_at")
      , ("messageObjectThreadUnderscoreid", "thread_id")
      , ("messageObjectStatus", "status")
      , ("messageObjectIncompleteUnderscoredetails", "incomplete_details")
      , ("messageObjectCompletedUnderscoreat", "completed_at")
      , ("messageObjectIncompleteUnderscoreat", "incomplete_at")
      , ("messageObjectRole", "role")
      , ("messageObjectContent", "content")
      , ("messageObjectAssistantUnderscoreid", "assistant_id")
      , ("messageObjectRunUnderscoreid", "run_id")
      , ("messageObjectAttachments", "attachments")
      , ("messageObjectMetadata", "metadata")
      ]


-- | 
data MessageObjectContentInner = MessageObjectContentInner
  { messageObjectContentInnerType :: Text -- ^ Always `image_file`.
  , messageObjectContentInnerImageUnderscorefile :: MessageContentImageFileObjectImageFile -- ^ 
  , messageObjectContentInnerImageUnderscoreurl :: MessageContentImageUrlObjectImageUrl -- ^ 
  , messageObjectContentInnerText :: MessageContentTextObjectText -- ^ 
  , messageObjectContentInnerRefusal :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageObjectContentInner where
  parseJSON = genericParseJSON optionsMessageObjectContentInner
instance ToJSON MessageObjectContentInner where
  toJSON = genericToJSON optionsMessageObjectContentInner

optionsMessageObjectContentInner :: Options
optionsMessageObjectContentInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageObjectContentInnerType", "type")
      , ("messageObjectContentInnerImageUnderscorefile", "image_file")
      , ("messageObjectContentInnerImageUnderscoreurl", "image_url")
      , ("messageObjectContentInnerText", "text")
      , ("messageObjectContentInnerRefusal", "refusal")
      ]


-- | On an incomplete message, details about why the message is incomplete.
data MessageObjectIncompleteDetails = MessageObjectIncompleteDetails
  { messageObjectIncompleteDetailsReason :: Text -- ^ The reason the message is incomplete.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageObjectIncompleteDetails where
  parseJSON = genericParseJSON optionsMessageObjectIncompleteDetails
instance ToJSON MessageObjectIncompleteDetails where
  toJSON = genericToJSON optionsMessageObjectIncompleteDetails

optionsMessageObjectIncompleteDetails :: Options
optionsMessageObjectIncompleteDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageObjectIncompleteDetailsReason", "reason")
      ]


-- | The text content that is part of a message.
data MessageRequestContentTextObject = MessageRequestContentTextObject
  { messageRequestContentTextObjectType :: Text -- ^ Always `text`.
  , messageRequestContentTextObjectText :: Text -- ^ Text content to be sent to the model
  } deriving (Show, Eq, Generic)

instance FromJSON MessageRequestContentTextObject where
  parseJSON = genericParseJSON optionsMessageRequestContentTextObject
instance ToJSON MessageRequestContentTextObject where
  toJSON = genericToJSON optionsMessageRequestContentTextObject

optionsMessageRequestContentTextObject :: Options
optionsMessageRequestContentTextObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageRequestContentTextObjectType", "type")
      , ("messageRequestContentTextObjectText", "text")
      ]


-- | 
data MessageStreamEvent = MessageStreamEvent
  { messageStreamEventEvent :: Text -- ^ 
  , messageStreamEventData :: MessageObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageStreamEvent where
  parseJSON = genericParseJSON optionsMessageStreamEvent
instance ToJSON MessageStreamEvent where
  toJSON = genericToJSON optionsMessageStreamEvent

optionsMessageStreamEvent :: Options
optionsMessageStreamEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageStreamEventEvent", "event")
      , ("messageStreamEventData", "data")
      ]


-- | Occurs when a [message](/docs/api-reference/messages/object) is created.
data MessageStreamEventOneOf = MessageStreamEventOneOf
  { messageStreamEventOneOfEvent :: Text -- ^ 
  , messageStreamEventOneOfData :: MessageObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageStreamEventOneOf where
  parseJSON = genericParseJSON optionsMessageStreamEventOneOf
instance ToJSON MessageStreamEventOneOf where
  toJSON = genericToJSON optionsMessageStreamEventOneOf

optionsMessageStreamEventOneOf :: Options
optionsMessageStreamEventOneOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageStreamEventOneOfEvent", "event")
      , ("messageStreamEventOneOfData", "data")
      ]


-- | Occurs when a [message](/docs/api-reference/messages/object) moves to an &#x60;in_progress&#x60; state.
data MessageStreamEventOneOf1 = MessageStreamEventOneOf1
  { messageStreamEventOneOf1Event :: Text -- ^ 
  , messageStreamEventOneOf1Data :: MessageObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageStreamEventOneOf1 where
  parseJSON = genericParseJSON optionsMessageStreamEventOneOf1
instance ToJSON MessageStreamEventOneOf1 where
  toJSON = genericToJSON optionsMessageStreamEventOneOf1

optionsMessageStreamEventOneOf1 :: Options
optionsMessageStreamEventOneOf1 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageStreamEventOneOf1Event", "event")
      , ("messageStreamEventOneOf1Data", "data")
      ]


-- | Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
data MessageStreamEventOneOf2 = MessageStreamEventOneOf2
  { messageStreamEventOneOf2Event :: Text -- ^ 
  , messageStreamEventOneOf2Data :: MessageDeltaObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageStreamEventOneOf2 where
  parseJSON = genericParseJSON optionsMessageStreamEventOneOf2
instance ToJSON MessageStreamEventOneOf2 where
  toJSON = genericToJSON optionsMessageStreamEventOneOf2

optionsMessageStreamEventOneOf2 :: Options
optionsMessageStreamEventOneOf2 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageStreamEventOneOf2Event", "event")
      , ("messageStreamEventOneOf2Data", "data")
      ]


-- | Occurs when a [message](/docs/api-reference/messages/object) is completed.
data MessageStreamEventOneOf3 = MessageStreamEventOneOf3
  { messageStreamEventOneOf3Event :: Text -- ^ 
  , messageStreamEventOneOf3Data :: MessageObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageStreamEventOneOf3 where
  parseJSON = genericParseJSON optionsMessageStreamEventOneOf3
instance ToJSON MessageStreamEventOneOf3 where
  toJSON = genericToJSON optionsMessageStreamEventOneOf3

optionsMessageStreamEventOneOf3 :: Options
optionsMessageStreamEventOneOf3 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageStreamEventOneOf3Event", "event")
      , ("messageStreamEventOneOf3Data", "data")
      ]


-- | Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
data MessageStreamEventOneOf4 = MessageStreamEventOneOf4
  { messageStreamEventOneOf4Event :: Text -- ^ 
  , messageStreamEventOneOf4Data :: MessageObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON MessageStreamEventOneOf4 where
  parseJSON = genericParseJSON optionsMessageStreamEventOneOf4
instance ToJSON MessageStreamEventOneOf4 where
  toJSON = genericToJSON optionsMessageStreamEventOneOf4

optionsMessageStreamEventOneOf4 :: Options
optionsMessageStreamEventOneOf4 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageStreamEventOneOf4Event", "event")
      , ("messageStreamEventOneOf4Data", "data")
      ]


-- | Describes an OpenAI model offering that can be used with the API.
data Model = Model
  { modelId :: Text -- ^ The model identifier, which can be referenced in the API endpoints.
  , modelCreated :: Int -- ^ The Unix timestamp (in seconds) when the model was created.
  , modelObject :: Text -- ^ The object type, which is always \"model\".
  , modelOwnedUnderscoreby :: Text -- ^ The organization that owns the model.
  } deriving (Show, Eq, Generic)

instance FromJSON Model where
  parseJSON = genericParseJSON optionsModel
instance ToJSON Model where
  toJSON = genericToJSON optionsModel

optionsModel :: Options
optionsModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modelId", "id")
      , ("modelCreated", "created")
      , ("modelObject", "object")
      , ("modelOwnedUnderscoreby", "owned_by")
      ]


-- | 
data ModifyAssistantRequest = ModifyAssistantRequest
  { modifyAssistantRequestModel :: Maybe Text -- ^ 
  , modifyAssistantRequestName :: Maybe Text -- ^ The name of the assistant. The maximum length is 256 characters. 
  , modifyAssistantRequestDescription :: Maybe Text -- ^ The description of the assistant. The maximum length is 512 characters. 
  , modifyAssistantRequestInstructions :: Maybe Text -- ^ The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  , modifyAssistantRequestTools :: Maybe [AssistantObjectToolsInner] -- ^ A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `file_search`, or `function`. 
  , modifyAssistantRequestToolUnderscoreresources :: Maybe ModifyAssistantRequestToolResources -- ^ 
  , modifyAssistantRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , modifyAssistantRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , modifyAssistantRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or temperature but not both. 
  , modifyAssistantRequestResponseUnderscoreformat :: Maybe AssistantsApiResponseFormatOption -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyAssistantRequest where
  parseJSON = genericParseJSON optionsModifyAssistantRequest
instance ToJSON ModifyAssistantRequest where
  toJSON = genericToJSON optionsModifyAssistantRequest

optionsModifyAssistantRequest :: Options
optionsModifyAssistantRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyAssistantRequestModel", "model")
      , ("modifyAssistantRequestName", "name")
      , ("modifyAssistantRequestDescription", "description")
      , ("modifyAssistantRequestInstructions", "instructions")
      , ("modifyAssistantRequestTools", "tools")
      , ("modifyAssistantRequestToolUnderscoreresources", "tool_resources")
      , ("modifyAssistantRequestMetadata", "metadata")
      , ("modifyAssistantRequestTemperature", "temperature")
      , ("modifyAssistantRequestTopUnderscorep", "top_p")
      , ("modifyAssistantRequestResponseUnderscoreformat", "response_format")
      ]


-- | A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
data ModifyAssistantRequestToolResources = ModifyAssistantRequestToolResources
  { modifyAssistantRequestToolResourcesCodeUnderscoreinterpreter :: Maybe ModifyAssistantRequestToolResourcesCodeInterpreter -- ^ 
  , modifyAssistantRequestToolResourcesFileUnderscoresearch :: Maybe ModifyAssistantRequestToolResourcesFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyAssistantRequestToolResources where
  parseJSON = genericParseJSON optionsModifyAssistantRequestToolResources
instance ToJSON ModifyAssistantRequestToolResources where
  toJSON = genericToJSON optionsModifyAssistantRequestToolResources

optionsModifyAssistantRequestToolResources :: Options
optionsModifyAssistantRequestToolResources =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyAssistantRequestToolResourcesCodeUnderscoreinterpreter", "code_interpreter")
      , ("modifyAssistantRequestToolResourcesFileUnderscoresearch", "file_search")
      ]


-- | 
data ModifyAssistantRequestToolResourcesCodeInterpreter = ModifyAssistantRequestToolResourcesCodeInterpreter
  { modifyAssistantRequestToolResourcesCodeInterpreterFileUnderscoreids :: Maybe [Text] -- ^ Overrides the list of [file](/docs/api-reference/files) IDs made available to the `code_interpreter` tool. There can be a maximum of 20 files associated with the tool. 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyAssistantRequestToolResourcesCodeInterpreter where
  parseJSON = genericParseJSON optionsModifyAssistantRequestToolResourcesCodeInterpreter
instance ToJSON ModifyAssistantRequestToolResourcesCodeInterpreter where
  toJSON = genericToJSON optionsModifyAssistantRequestToolResourcesCodeInterpreter

optionsModifyAssistantRequestToolResourcesCodeInterpreter :: Options
optionsModifyAssistantRequestToolResourcesCodeInterpreter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyAssistantRequestToolResourcesCodeInterpreterFileUnderscoreids", "file_ids")
      ]


-- | 
data ModifyAssistantRequestToolResourcesFileSearch = ModifyAssistantRequestToolResourcesFileSearch
  { modifyAssistantRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids :: Maybe [Text] -- ^ Overrides the [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyAssistantRequestToolResourcesFileSearch where
  parseJSON = genericParseJSON optionsModifyAssistantRequestToolResourcesFileSearch
instance ToJSON ModifyAssistantRequestToolResourcesFileSearch where
  toJSON = genericToJSON optionsModifyAssistantRequestToolResourcesFileSearch

optionsModifyAssistantRequestToolResourcesFileSearch :: Options
optionsModifyAssistantRequestToolResourcesFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyAssistantRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids", "vector_store_ids")
      ]


-- | 
data ModifyMessageRequest = ModifyMessageRequest
  { modifyMessageRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyMessageRequest where
  parseJSON = genericParseJSON optionsModifyMessageRequest
instance ToJSON ModifyMessageRequest where
  toJSON = genericToJSON optionsModifyMessageRequest

optionsModifyMessageRequest :: Options
optionsModifyMessageRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyMessageRequestMetadata", "metadata")
      ]


-- | 
data ModifyRunRequest = ModifyRunRequest
  { modifyRunRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyRunRequest where
  parseJSON = genericParseJSON optionsModifyRunRequest
instance ToJSON ModifyRunRequest where
  toJSON = genericToJSON optionsModifyRunRequest

optionsModifyRunRequest :: Options
optionsModifyRunRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyRunRequestMetadata", "metadata")
      ]


-- | 
data ModifyThreadRequest = ModifyThreadRequest
  { modifyThreadRequestToolUnderscoreresources :: Maybe ModifyThreadRequestToolResources -- ^ 
  , modifyThreadRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyThreadRequest where
  parseJSON = genericParseJSON optionsModifyThreadRequest
instance ToJSON ModifyThreadRequest where
  toJSON = genericToJSON optionsModifyThreadRequest

optionsModifyThreadRequest :: Options
optionsModifyThreadRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyThreadRequestToolUnderscoreresources", "tool_resources")
      , ("modifyThreadRequestMetadata", "metadata")
      ]


-- | A set of resources that are made available to the assistant&#39;s tools in this thread. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
data ModifyThreadRequestToolResources = ModifyThreadRequestToolResources
  { modifyThreadRequestToolResourcesCodeUnderscoreinterpreter :: Maybe CreateAssistantRequestToolResourcesCodeInterpreter -- ^ 
  , modifyThreadRequestToolResourcesFileUnderscoresearch :: Maybe ModifyThreadRequestToolResourcesFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyThreadRequestToolResources where
  parseJSON = genericParseJSON optionsModifyThreadRequestToolResources
instance ToJSON ModifyThreadRequestToolResources where
  toJSON = genericToJSON optionsModifyThreadRequestToolResources

optionsModifyThreadRequestToolResources :: Options
optionsModifyThreadRequestToolResources =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyThreadRequestToolResourcesCodeUnderscoreinterpreter", "code_interpreter")
      , ("modifyThreadRequestToolResourcesFileUnderscoresearch", "file_search")
      ]


-- | 
data ModifyThreadRequestToolResourcesFileSearch = ModifyThreadRequestToolResourcesFileSearch
  { modifyThreadRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids :: Maybe [Text] -- ^ The [vector store](/docs/api-reference/vector-stores/object) attached to this thread. There can be a maximum of 1 vector store attached to the thread. 
  } deriving (Show, Eq, Generic)

instance FromJSON ModifyThreadRequestToolResourcesFileSearch where
  parseJSON = genericParseJSON optionsModifyThreadRequestToolResourcesFileSearch
instance ToJSON ModifyThreadRequestToolResourcesFileSearch where
  toJSON = genericToJSON optionsModifyThreadRequestToolResourcesFileSearch

optionsModifyThreadRequestToolResourcesFileSearch :: Options
optionsModifyThreadRequestToolResourcesFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("modifyThreadRequestToolResourcesFileSearchVectorUnderscorestoreUnderscoreids", "vector_store_ids")
      ]


-- | The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
data OpenAIFile = OpenAIFile
  { openAIFileId :: Text -- ^ The file identifier, which can be referenced in the API endpoints.
  , openAIFileBytes :: Int -- ^ The size of the file, in bytes.
  , openAIFileCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the file was created.
  , openAIFileFilename :: Text -- ^ The name of the file.
  , openAIFileObject :: Text -- ^ The object type, which is always `file`.
  , openAIFilePurpose :: Text -- ^ The intended purpose of the file. Supported values are `assistants`, `assistants_output`, `batch`, `batch_output`, `fine-tune`, `fine-tune-results` and `vision`.
  , openAIFileStatus :: Text -- ^ Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
  , openAIFileStatusUnderscoredetails :: Maybe Text -- ^ Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
  } deriving (Show, Eq, Generic)

instance FromJSON OpenAIFile where
  parseJSON = genericParseJSON optionsOpenAIFile
instance ToJSON OpenAIFile where
  toJSON = genericToJSON optionsOpenAIFile

optionsOpenAIFile :: Options
optionsOpenAIFile =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("openAIFileId", "id")
      , ("openAIFileBytes", "bytes")
      , ("openAIFileCreatedUnderscoreat", "created_at")
      , ("openAIFileFilename", "filename")
      , ("openAIFileObject", "object")
      , ("openAIFilePurpose", "purpose")
      , ("openAIFileStatus", "status")
      , ("openAIFileStatusUnderscoredetails", "status_details")
      ]


-- | This is returned when the chunking strategy is unknown. Typically, this is because the file was indexed before the &#x60;chunking_strategy&#x60; concept was introduced in the API.
data OtherChunkingStrategyResponseParam = OtherChunkingStrategyResponseParam
  { otherChunkingStrategyResponseParamType :: Text -- ^ Always `other`.
  } deriving (Show, Eq, Generic)

instance FromJSON OtherChunkingStrategyResponseParam where
  parseJSON = genericParseJSON optionsOtherChunkingStrategyResponseParam
instance ToJSON OtherChunkingStrategyResponseParam where
  toJSON = genericToJSON optionsOtherChunkingStrategyResponseParam

optionsOtherChunkingStrategyResponseParam :: Options
optionsOtherChunkingStrategyResponseParam =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("otherChunkingStrategyResponseParamType", "type")
      ]


-- | Static predicted output content, such as the content of a text file that is being regenerated. 
data PredictionContent = PredictionContent
  { predictionContentType :: Text -- ^ The type of the predicted content you want to provide. This type is currently always `content`. 
  , predictionContentContent :: PredictionContentContent -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON PredictionContent where
  parseJSON = genericParseJSON optionsPredictionContent
instance ToJSON PredictionContent where
  toJSON = genericToJSON optionsPredictionContent

optionsPredictionContent :: Options
optionsPredictionContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("predictionContentType", "type")
      , ("predictionContentContent", "content")
      ]


-- | The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
data PredictionContentContent = PredictionContentContent
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON PredictionContentContent where
  parseJSON = genericParseJSON optionsPredictionContentContent
instance ToJSON PredictionContentContent where
  toJSON = genericToJSON optionsPredictionContentContent

optionsPredictionContentContent :: Options
optionsPredictionContentContent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Represents an individual project.
data Project = Project
  { projectId :: Text -- ^ The identifier, which can be referenced in API endpoints
  , projectObject :: Text -- ^ The object type, which is always `organization.project`
  , projectName :: Text -- ^ The name of the project. This appears in reporting.
  , projectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the project was created.
  , projectArchivedUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) of when the project was archived or `null`.
  , projectStatus :: Text -- ^ `active` or `archived`
  } deriving (Show, Eq, Generic)

instance FromJSON Project where
  parseJSON = genericParseJSON optionsProject
instance ToJSON Project where
  toJSON = genericToJSON optionsProject

optionsProject :: Options
optionsProject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectId", "id")
      , ("projectObject", "object")
      , ("projectName", "name")
      , ("projectCreatedUnderscoreat", "created_at")
      , ("projectArchivedUnderscoreat", "archived_at")
      , ("projectStatus", "status")
      ]


-- | Represents an individual API key in a project.
data ProjectApiKey = ProjectApiKey
  { projectApiKeyObject :: Text -- ^ The object type, which is always `organization.project.api_key`
  , projectApiKeyRedactedUnderscorevalue :: Text -- ^ The redacted value of the API key
  , projectApiKeyName :: Text -- ^ The name of the API key
  , projectApiKeyCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the API key was created
  , projectApiKeyId :: Text -- ^ The identifier, which can be referenced in API endpoints
  , projectApiKeyOwner :: ProjectApiKeyOwner -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectApiKey where
  parseJSON = genericParseJSON optionsProjectApiKey
instance ToJSON ProjectApiKey where
  toJSON = genericToJSON optionsProjectApiKey

optionsProjectApiKey :: Options
optionsProjectApiKey =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectApiKeyObject", "object")
      , ("projectApiKeyRedactedUnderscorevalue", "redacted_value")
      , ("projectApiKeyName", "name")
      , ("projectApiKeyCreatedUnderscoreat", "created_at")
      , ("projectApiKeyId", "id")
      , ("projectApiKeyOwner", "owner")
      ]


-- | 
data ProjectApiKeyDeleteResponse = ProjectApiKeyDeleteResponse
  { projectApiKeyDeleteResponseObject :: Text -- ^ 
  , projectApiKeyDeleteResponseId :: Text -- ^ 
  , projectApiKeyDeleteResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectApiKeyDeleteResponse where
  parseJSON = genericParseJSON optionsProjectApiKeyDeleteResponse
instance ToJSON ProjectApiKeyDeleteResponse where
  toJSON = genericToJSON optionsProjectApiKeyDeleteResponse

optionsProjectApiKeyDeleteResponse :: Options
optionsProjectApiKeyDeleteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectApiKeyDeleteResponseObject", "object")
      , ("projectApiKeyDeleteResponseId", "id")
      , ("projectApiKeyDeleteResponseDeleted", "deleted")
      ]


-- | 
data ProjectApiKeyListResponse = ProjectApiKeyListResponse
  { projectApiKeyListResponseObject :: Text -- ^ 
  , projectApiKeyListResponseData :: [ProjectApiKey] -- ^ 
  , projectApiKeyListResponseFirstUnderscoreid :: Text -- ^ 
  , projectApiKeyListResponseLastUnderscoreid :: Text -- ^ 
  , projectApiKeyListResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectApiKeyListResponse where
  parseJSON = genericParseJSON optionsProjectApiKeyListResponse
instance ToJSON ProjectApiKeyListResponse where
  toJSON = genericToJSON optionsProjectApiKeyListResponse

optionsProjectApiKeyListResponse :: Options
optionsProjectApiKeyListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectApiKeyListResponseObject", "object")
      , ("projectApiKeyListResponseData", "data")
      , ("projectApiKeyListResponseFirstUnderscoreid", "first_id")
      , ("projectApiKeyListResponseLastUnderscoreid", "last_id")
      , ("projectApiKeyListResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ProjectApiKeyOwner = ProjectApiKeyOwner
  { projectApiKeyOwnerType :: Maybe Text -- ^ `user` or `service_account`
  , projectApiKeyOwnerUser :: Maybe ProjectUser -- ^ 
  , projectApiKeyOwnerServiceUnderscoreaccount :: Maybe ProjectServiceAccount -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectApiKeyOwner where
  parseJSON = genericParseJSON optionsProjectApiKeyOwner
instance ToJSON ProjectApiKeyOwner where
  toJSON = genericToJSON optionsProjectApiKeyOwner

optionsProjectApiKeyOwner :: Options
optionsProjectApiKeyOwner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectApiKeyOwnerType", "type")
      , ("projectApiKeyOwnerUser", "user")
      , ("projectApiKeyOwnerServiceUnderscoreaccount", "service_account")
      ]


-- | 
data ProjectCreateRequest = ProjectCreateRequest
  { projectCreateRequestName :: Text -- ^ The friendly name of the project, this name appears in reports.
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectCreateRequest where
  parseJSON = genericParseJSON optionsProjectCreateRequest
instance ToJSON ProjectCreateRequest where
  toJSON = genericToJSON optionsProjectCreateRequest

optionsProjectCreateRequest :: Options
optionsProjectCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectCreateRequestName", "name")
      ]


-- | 
data ProjectListResponse = ProjectListResponse
  { projectListResponseObject :: Text -- ^ 
  , projectListResponseData :: [Project] -- ^ 
  , projectListResponseFirstUnderscoreid :: Text -- ^ 
  , projectListResponseLastUnderscoreid :: Text -- ^ 
  , projectListResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectListResponse where
  parseJSON = genericParseJSON optionsProjectListResponse
instance ToJSON ProjectListResponse where
  toJSON = genericToJSON optionsProjectListResponse

optionsProjectListResponse :: Options
optionsProjectListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectListResponseObject", "object")
      , ("projectListResponseData", "data")
      , ("projectListResponseFirstUnderscoreid", "first_id")
      , ("projectListResponseLastUnderscoreid", "last_id")
      , ("projectListResponseHasUnderscoremore", "has_more")
      ]


-- | Represents a project rate limit config.
data ProjectRateLimit = ProjectRateLimit
  { projectRateLimitObject :: Text -- ^ The object type, which is always `project.rate_limit`
  , projectRateLimitId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , projectRateLimitModel :: Text -- ^ The model this rate limit applies to.
  , projectRateLimitMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute :: Int -- ^ The maximum requests per minute.
  , projectRateLimitMaxUnderscoretokensUnderscoreperUnderscore1Underscoreminute :: Int -- ^ The maximum tokens per minute.
  , projectRateLimitMaxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum images per minute. Only present for relevant models.
  , projectRateLimitMaxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum audio megabytes per minute. Only present for relevant models.
  , projectRateLimitMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreday :: Maybe Int -- ^ The maximum requests per day. Only present for relevant models.
  , projectRateLimitBatchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens :: Maybe Int -- ^ The maximum batch input tokens per day. Only present for relevant models.
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectRateLimit where
  parseJSON = genericParseJSON optionsProjectRateLimit
instance ToJSON ProjectRateLimit where
  toJSON = genericToJSON optionsProjectRateLimit

optionsProjectRateLimit :: Options
optionsProjectRateLimit =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectRateLimitObject", "object")
      , ("projectRateLimitId", "id")
      , ("projectRateLimitModel", "model")
      , ("projectRateLimitMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute", "max_requests_per_1_minute")
      , ("projectRateLimitMaxUnderscoretokensUnderscoreperUnderscore1Underscoreminute", "max_tokens_per_1_minute")
      , ("projectRateLimitMaxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute", "max_images_per_1_minute")
      , ("projectRateLimitMaxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute", "max_audio_megabytes_per_1_minute")
      , ("projectRateLimitMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreday", "max_requests_per_1_day")
      , ("projectRateLimitBatchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens", "batch_1_day_max_input_tokens")
      ]


-- | 
data ProjectRateLimitListResponse = ProjectRateLimitListResponse
  { projectRateLimitListResponseObject :: Text -- ^ 
  , projectRateLimitListResponseData :: [ProjectRateLimit] -- ^ 
  , projectRateLimitListResponseFirstUnderscoreid :: Text -- ^ 
  , projectRateLimitListResponseLastUnderscoreid :: Text -- ^ 
  , projectRateLimitListResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectRateLimitListResponse where
  parseJSON = genericParseJSON optionsProjectRateLimitListResponse
instance ToJSON ProjectRateLimitListResponse where
  toJSON = genericToJSON optionsProjectRateLimitListResponse

optionsProjectRateLimitListResponse :: Options
optionsProjectRateLimitListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectRateLimitListResponseObject", "object")
      , ("projectRateLimitListResponseData", "data")
      , ("projectRateLimitListResponseFirstUnderscoreid", "first_id")
      , ("projectRateLimitListResponseLastUnderscoreid", "last_id")
      , ("projectRateLimitListResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ProjectRateLimitUpdateRequest = ProjectRateLimitUpdateRequest
  { projectRateLimitUpdateRequestMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum requests per minute.
  , projectRateLimitUpdateRequestMaxUnderscoretokensUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum tokens per minute.
  , projectRateLimitUpdateRequestMaxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum images per minute. Only relevant for certain models.
  , projectRateLimitUpdateRequestMaxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute :: Maybe Int -- ^ The maximum audio megabytes per minute. Only relevant for certain models.
  , projectRateLimitUpdateRequestMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreday :: Maybe Int -- ^ The maximum requests per day. Only relevant for certain models.
  , projectRateLimitUpdateRequestBatchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens :: Maybe Int -- ^ The maximum batch input tokens per day. Only relevant for certain models.
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectRateLimitUpdateRequest where
  parseJSON = genericParseJSON optionsProjectRateLimitUpdateRequest
instance ToJSON ProjectRateLimitUpdateRequest where
  toJSON = genericToJSON optionsProjectRateLimitUpdateRequest

optionsProjectRateLimitUpdateRequest :: Options
optionsProjectRateLimitUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectRateLimitUpdateRequestMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreminute", "max_requests_per_1_minute")
      , ("projectRateLimitUpdateRequestMaxUnderscoretokensUnderscoreperUnderscore1Underscoreminute", "max_tokens_per_1_minute")
      , ("projectRateLimitUpdateRequestMaxUnderscoreimagesUnderscoreperUnderscore1Underscoreminute", "max_images_per_1_minute")
      , ("projectRateLimitUpdateRequestMaxUnderscoreaudioUnderscoremegabytesUnderscoreperUnderscore1Underscoreminute", "max_audio_megabytes_per_1_minute")
      , ("projectRateLimitUpdateRequestMaxUnderscorerequestsUnderscoreperUnderscore1Underscoreday", "max_requests_per_1_day")
      , ("projectRateLimitUpdateRequestBatchUnderscore1UnderscoredayUnderscoremaxUnderscoreinputUnderscoretokens", "batch_1_day_max_input_tokens")
      ]


-- | Represents an individual service account in a project.
data ProjectServiceAccount = ProjectServiceAccount
  { projectServiceAccountObject :: Text -- ^ The object type, which is always `organization.project.service_account`
  , projectServiceAccountId :: Text -- ^ The identifier, which can be referenced in API endpoints
  , projectServiceAccountName :: Text -- ^ The name of the service account
  , projectServiceAccountRole :: Text -- ^ `owner` or `member`
  , projectServiceAccountCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the service account was created
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectServiceAccount where
  parseJSON = genericParseJSON optionsProjectServiceAccount
instance ToJSON ProjectServiceAccount where
  toJSON = genericToJSON optionsProjectServiceAccount

optionsProjectServiceAccount :: Options
optionsProjectServiceAccount =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectServiceAccountObject", "object")
      , ("projectServiceAccountId", "id")
      , ("projectServiceAccountName", "name")
      , ("projectServiceAccountRole", "role")
      , ("projectServiceAccountCreatedUnderscoreat", "created_at")
      ]


-- | 
data ProjectServiceAccountApiKey = ProjectServiceAccountApiKey
  { projectServiceAccountApiKeyObject :: Text -- ^ The object type, which is always `organization.project.service_account.api_key`
  , projectServiceAccountApiKeyValue :: Text -- ^ 
  , projectServiceAccountApiKeyName :: Text -- ^ 
  , projectServiceAccountApiKeyCreatedUnderscoreat :: Int -- ^ 
  , projectServiceAccountApiKeyId :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectServiceAccountApiKey where
  parseJSON = genericParseJSON optionsProjectServiceAccountApiKey
instance ToJSON ProjectServiceAccountApiKey where
  toJSON = genericToJSON optionsProjectServiceAccountApiKey

optionsProjectServiceAccountApiKey :: Options
optionsProjectServiceAccountApiKey =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectServiceAccountApiKeyObject", "object")
      , ("projectServiceAccountApiKeyValue", "value")
      , ("projectServiceAccountApiKeyName", "name")
      , ("projectServiceAccountApiKeyCreatedUnderscoreat", "created_at")
      , ("projectServiceAccountApiKeyId", "id")
      ]


-- | 
data ProjectServiceAccountCreateRequest = ProjectServiceAccountCreateRequest
  { projectServiceAccountCreateRequestName :: Text -- ^ The name of the service account being created.
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectServiceAccountCreateRequest where
  parseJSON = genericParseJSON optionsProjectServiceAccountCreateRequest
instance ToJSON ProjectServiceAccountCreateRequest where
  toJSON = genericToJSON optionsProjectServiceAccountCreateRequest

optionsProjectServiceAccountCreateRequest :: Options
optionsProjectServiceAccountCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectServiceAccountCreateRequestName", "name")
      ]


-- | 
data ProjectServiceAccountCreateResponse = ProjectServiceAccountCreateResponse
  { projectServiceAccountCreateResponseObject :: Text -- ^ 
  , projectServiceAccountCreateResponseId :: Text -- ^ 
  , projectServiceAccountCreateResponseName :: Text -- ^ 
  , projectServiceAccountCreateResponseRole :: Text -- ^ Service accounts can only have one role of type `member`
  , projectServiceAccountCreateResponseCreatedUnderscoreat :: Int -- ^ 
  , projectServiceAccountCreateResponseApiUnderscorekey :: ProjectServiceAccountApiKey -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectServiceAccountCreateResponse where
  parseJSON = genericParseJSON optionsProjectServiceAccountCreateResponse
instance ToJSON ProjectServiceAccountCreateResponse where
  toJSON = genericToJSON optionsProjectServiceAccountCreateResponse

optionsProjectServiceAccountCreateResponse :: Options
optionsProjectServiceAccountCreateResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectServiceAccountCreateResponseObject", "object")
      , ("projectServiceAccountCreateResponseId", "id")
      , ("projectServiceAccountCreateResponseName", "name")
      , ("projectServiceAccountCreateResponseRole", "role")
      , ("projectServiceAccountCreateResponseCreatedUnderscoreat", "created_at")
      , ("projectServiceAccountCreateResponseApiUnderscorekey", "api_key")
      ]


-- | 
data ProjectServiceAccountDeleteResponse = ProjectServiceAccountDeleteResponse
  { projectServiceAccountDeleteResponseObject :: Text -- ^ 
  , projectServiceAccountDeleteResponseId :: Text -- ^ 
  , projectServiceAccountDeleteResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectServiceAccountDeleteResponse where
  parseJSON = genericParseJSON optionsProjectServiceAccountDeleteResponse
instance ToJSON ProjectServiceAccountDeleteResponse where
  toJSON = genericToJSON optionsProjectServiceAccountDeleteResponse

optionsProjectServiceAccountDeleteResponse :: Options
optionsProjectServiceAccountDeleteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectServiceAccountDeleteResponseObject", "object")
      , ("projectServiceAccountDeleteResponseId", "id")
      , ("projectServiceAccountDeleteResponseDeleted", "deleted")
      ]


-- | 
data ProjectServiceAccountListResponse = ProjectServiceAccountListResponse
  { projectServiceAccountListResponseObject :: Text -- ^ 
  , projectServiceAccountListResponseData :: [ProjectServiceAccount] -- ^ 
  , projectServiceAccountListResponseFirstUnderscoreid :: Text -- ^ 
  , projectServiceAccountListResponseLastUnderscoreid :: Text -- ^ 
  , projectServiceAccountListResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectServiceAccountListResponse where
  parseJSON = genericParseJSON optionsProjectServiceAccountListResponse
instance ToJSON ProjectServiceAccountListResponse where
  toJSON = genericToJSON optionsProjectServiceAccountListResponse

optionsProjectServiceAccountListResponse :: Options
optionsProjectServiceAccountListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectServiceAccountListResponseObject", "object")
      , ("projectServiceAccountListResponseData", "data")
      , ("projectServiceAccountListResponseFirstUnderscoreid", "first_id")
      , ("projectServiceAccountListResponseLastUnderscoreid", "last_id")
      , ("projectServiceAccountListResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ProjectUpdateRequest = ProjectUpdateRequest
  { projectUpdateRequestName :: Text -- ^ The updated name of the project, this name appears in reports.
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectUpdateRequest where
  parseJSON = genericParseJSON optionsProjectUpdateRequest
instance ToJSON ProjectUpdateRequest where
  toJSON = genericToJSON optionsProjectUpdateRequest

optionsProjectUpdateRequest :: Options
optionsProjectUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectUpdateRequestName", "name")
      ]


-- | Represents an individual user in a project.
data ProjectUser = ProjectUser
  { projectUserObject :: Text -- ^ The object type, which is always `organization.project.user`
  , projectUserId :: Text -- ^ The identifier, which can be referenced in API endpoints
  , projectUserName :: Text -- ^ The name of the user
  , projectUserEmail :: Text -- ^ The email address of the user
  , projectUserRole :: Text -- ^ `owner` or `member`
  , projectUserAddedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the project was added.
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectUser where
  parseJSON = genericParseJSON optionsProjectUser
instance ToJSON ProjectUser where
  toJSON = genericToJSON optionsProjectUser

optionsProjectUser :: Options
optionsProjectUser =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectUserObject", "object")
      , ("projectUserId", "id")
      , ("projectUserName", "name")
      , ("projectUserEmail", "email")
      , ("projectUserRole", "role")
      , ("projectUserAddedUnderscoreat", "added_at")
      ]


-- | 
data ProjectUserCreateRequest = ProjectUserCreateRequest
  { projectUserCreateRequestUserUnderscoreid :: Text -- ^ The ID of the user.
  , projectUserCreateRequestRole :: Text -- ^ `owner` or `member`
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectUserCreateRequest where
  parseJSON = genericParseJSON optionsProjectUserCreateRequest
instance ToJSON ProjectUserCreateRequest where
  toJSON = genericToJSON optionsProjectUserCreateRequest

optionsProjectUserCreateRequest :: Options
optionsProjectUserCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectUserCreateRequestUserUnderscoreid", "user_id")
      , ("projectUserCreateRequestRole", "role")
      ]


-- | 
data ProjectUserDeleteResponse = ProjectUserDeleteResponse
  { projectUserDeleteResponseObject :: Text -- ^ 
  , projectUserDeleteResponseId :: Text -- ^ 
  , projectUserDeleteResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectUserDeleteResponse where
  parseJSON = genericParseJSON optionsProjectUserDeleteResponse
instance ToJSON ProjectUserDeleteResponse where
  toJSON = genericToJSON optionsProjectUserDeleteResponse

optionsProjectUserDeleteResponse :: Options
optionsProjectUserDeleteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectUserDeleteResponseObject", "object")
      , ("projectUserDeleteResponseId", "id")
      , ("projectUserDeleteResponseDeleted", "deleted")
      ]


-- | 
data ProjectUserListResponse = ProjectUserListResponse
  { projectUserListResponseObject :: Text -- ^ 
  , projectUserListResponseData :: [ProjectUser] -- ^ 
  , projectUserListResponseFirstUnderscoreid :: Text -- ^ 
  , projectUserListResponseLastUnderscoreid :: Text -- ^ 
  , projectUserListResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectUserListResponse where
  parseJSON = genericParseJSON optionsProjectUserListResponse
instance ToJSON ProjectUserListResponse where
  toJSON = genericToJSON optionsProjectUserListResponse

optionsProjectUserListResponse :: Options
optionsProjectUserListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectUserListResponseObject", "object")
      , ("projectUserListResponseData", "data")
      , ("projectUserListResponseFirstUnderscoreid", "first_id")
      , ("projectUserListResponseLastUnderscoreid", "last_id")
      , ("projectUserListResponseHasUnderscoremore", "has_more")
      ]


-- | 
data ProjectUserUpdateRequest = ProjectUserUpdateRequest
  { projectUserUpdateRequestRole :: Text -- ^ `owner` or `member`
  } deriving (Show, Eq, Generic)

instance FromJSON ProjectUserUpdateRequest where
  parseJSON = genericParseJSON optionsProjectUserUpdateRequest
instance ToJSON ProjectUserUpdateRequest where
  toJSON = genericToJSON optionsProjectUserUpdateRequest

optionsProjectUserUpdateRequest :: Options
optionsProjectUserUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("projectUserUpdateRequestRole", "role")
      ]


-- | Add a new Item to the Conversation&#39;s context, including messages, function  calls, and function call responses. This event can be used both to populate a  \&quot;history\&quot; of the conversation and to add new items mid-stream, but has the  current limitation that it cannot populate assistant audio messages.  If successful, the server will respond with a &#x60;conversation.item.created&#x60;  event, otherwise an &#x60;error&#x60; event will be sent. 
data RealtimeClientEventConversationItemCreate = RealtimeClientEventConversationItemCreate
  { realtimeClientEventConversationItemCreateEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventConversationItemCreateType :: Text -- ^ The event type, must be `conversation.item.create`.
  , realtimeClientEventConversationItemCreatePreviousUnderscoreitemUnderscoreid :: Maybe Text -- ^ The ID of the preceding item after which the new item will be inserted.  If not set, the new item will be appended to the end of the conversation.  If set, it allows an item to be inserted mid-conversation. If the ID  cannot be found, an error will be returned and the item will not be added. 
  , realtimeClientEventConversationItemCreateItem :: RealtimeConversationItem -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventConversationItemCreate where
  parseJSON = genericParseJSON optionsRealtimeClientEventConversationItemCreate
instance ToJSON RealtimeClientEventConversationItemCreate where
  toJSON = genericToJSON optionsRealtimeClientEventConversationItemCreate

optionsRealtimeClientEventConversationItemCreate :: Options
optionsRealtimeClientEventConversationItemCreate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventConversationItemCreateEventUnderscoreid", "event_id")
      , ("realtimeClientEventConversationItemCreateType", "type")
      , ("realtimeClientEventConversationItemCreatePreviousUnderscoreitemUnderscoreid", "previous_item_id")
      , ("realtimeClientEventConversationItemCreateItem", "item")
      ]


-- | Send this event when you want to remove any item from the conversation  history. The server will respond with a &#x60;conversation.item.deleted&#x60; event,  unless the item does not exist in the conversation history, in which case the  server will respond with an error. 
data RealtimeClientEventConversationItemDelete = RealtimeClientEventConversationItemDelete
  { realtimeClientEventConversationItemDeleteEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventConversationItemDeleteType :: Text -- ^ The event type, must be `conversation.item.delete`.
  , realtimeClientEventConversationItemDeleteItemUnderscoreid :: Text -- ^ The ID of the item to delete.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventConversationItemDelete where
  parseJSON = genericParseJSON optionsRealtimeClientEventConversationItemDelete
instance ToJSON RealtimeClientEventConversationItemDelete where
  toJSON = genericToJSON optionsRealtimeClientEventConversationItemDelete

optionsRealtimeClientEventConversationItemDelete :: Options
optionsRealtimeClientEventConversationItemDelete =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventConversationItemDeleteEventUnderscoreid", "event_id")
      , ("realtimeClientEventConversationItemDeleteType", "type")
      , ("realtimeClientEventConversationItemDeleteItemUnderscoreid", "item_id")
      ]


-- | Send this event to truncate a previous assistant message’s audio. The server  will produce audio faster than realtime, so this event is useful when the user  interrupts to truncate audio that has already been sent to the client but not  yet played. This will synchronize the server&#39;s understanding of the audio with  the client&#39;s playback.  Truncating audio will delete the server-side text transcript to ensure there  is not text in the context that hasn&#39;t been heard by the user.  If successful, the server will respond with a &#x60;conversation.item.truncated&#x60;  event.  
data RealtimeClientEventConversationItemTruncate = RealtimeClientEventConversationItemTruncate
  { realtimeClientEventConversationItemTruncateEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventConversationItemTruncateType :: Text -- ^ The event type, must be `conversation.item.truncate`.
  , realtimeClientEventConversationItemTruncateItemUnderscoreid :: Text -- ^ The ID of the assistant message item to truncate. Only assistant message  items can be truncated. 
  , realtimeClientEventConversationItemTruncateContentUnderscoreindex :: Int -- ^ The index of the content part to truncate. Set this to 0.
  , realtimeClientEventConversationItemTruncateAudioUnderscoreendUnderscorems :: Int -- ^ Inclusive duration up to which audio is truncated, in milliseconds. If  the audio_end_ms is greater than the actual audio duration, the server  will respond with an error. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventConversationItemTruncate where
  parseJSON = genericParseJSON optionsRealtimeClientEventConversationItemTruncate
instance ToJSON RealtimeClientEventConversationItemTruncate where
  toJSON = genericToJSON optionsRealtimeClientEventConversationItemTruncate

optionsRealtimeClientEventConversationItemTruncate :: Options
optionsRealtimeClientEventConversationItemTruncate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventConversationItemTruncateEventUnderscoreid", "event_id")
      , ("realtimeClientEventConversationItemTruncateType", "type")
      , ("realtimeClientEventConversationItemTruncateItemUnderscoreid", "item_id")
      , ("realtimeClientEventConversationItemTruncateContentUnderscoreindex", "content_index")
      , ("realtimeClientEventConversationItemTruncateAudioUnderscoreendUnderscorems", "audio_end_ms")
      ]


-- | Send this event to append audio bytes to the input audio buffer. The audio  buffer is temporary storage you can write to and later commit. In Server VAD  mode, the audio buffer is used to detect speech and the server will decide  when to commit. When Server VAD is disabled, you must commit the audio buffer manually.  The client may choose how much audio to place in each event up to a maximum  of 15 MiB, for example streaming smaller chunks from the client may allow the  VAD to be more responsive. Unlike made other client events, the server will  not send a confirmation response to this event. 
data RealtimeClientEventInputAudioBufferAppend = RealtimeClientEventInputAudioBufferAppend
  { realtimeClientEventInputAudioBufferAppendEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventInputAudioBufferAppendType :: Text -- ^ The event type, must be `input_audio_buffer.append`.
  , realtimeClientEventInputAudioBufferAppendAudio :: Text -- ^ Base64-encoded audio bytes. This must be in the format specified by the  `input_audio_format` field in the session configuration. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventInputAudioBufferAppend where
  parseJSON = genericParseJSON optionsRealtimeClientEventInputAudioBufferAppend
instance ToJSON RealtimeClientEventInputAudioBufferAppend where
  toJSON = genericToJSON optionsRealtimeClientEventInputAudioBufferAppend

optionsRealtimeClientEventInputAudioBufferAppend :: Options
optionsRealtimeClientEventInputAudioBufferAppend =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventInputAudioBufferAppendEventUnderscoreid", "event_id")
      , ("realtimeClientEventInputAudioBufferAppendType", "type")
      , ("realtimeClientEventInputAudioBufferAppendAudio", "audio")
      ]


-- | Send this event to clear the audio bytes in the buffer. The server will  respond with an &#x60;input_audio_buffer.cleared&#x60; event. 
data RealtimeClientEventInputAudioBufferClear = RealtimeClientEventInputAudioBufferClear
  { realtimeClientEventInputAudioBufferClearEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventInputAudioBufferClearType :: Text -- ^ The event type, must be `input_audio_buffer.clear`.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventInputAudioBufferClear where
  parseJSON = genericParseJSON optionsRealtimeClientEventInputAudioBufferClear
instance ToJSON RealtimeClientEventInputAudioBufferClear where
  toJSON = genericToJSON optionsRealtimeClientEventInputAudioBufferClear

optionsRealtimeClientEventInputAudioBufferClear :: Options
optionsRealtimeClientEventInputAudioBufferClear =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventInputAudioBufferClearEventUnderscoreid", "event_id")
      , ("realtimeClientEventInputAudioBufferClearType", "type")
      ]


-- | Send this event to commit the user input audio buffer, which will create a  new user message item in the conversation. This event will produce an error  if the input audio buffer is empty. When in Server VAD mode, the client does  not need to send this event, the server will commit the audio buffer  automatically.  Committing the input audio buffer will trigger input audio transcription  (if enabled in session configuration), but it will not create a response  from the model. The server will respond with an &#x60;input_audio_buffer.committed&#x60;  event. 
data RealtimeClientEventInputAudioBufferCommit = RealtimeClientEventInputAudioBufferCommit
  { realtimeClientEventInputAudioBufferCommitEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventInputAudioBufferCommitType :: Text -- ^ The event type, must be `input_audio_buffer.commit`.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventInputAudioBufferCommit where
  parseJSON = genericParseJSON optionsRealtimeClientEventInputAudioBufferCommit
instance ToJSON RealtimeClientEventInputAudioBufferCommit where
  toJSON = genericToJSON optionsRealtimeClientEventInputAudioBufferCommit

optionsRealtimeClientEventInputAudioBufferCommit :: Options
optionsRealtimeClientEventInputAudioBufferCommit =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventInputAudioBufferCommitEventUnderscoreid", "event_id")
      , ("realtimeClientEventInputAudioBufferCommitType", "type")
      ]


-- | Send this event to cancel an in-progress response. The server will respond  with a &#x60;response.cancelled&#x60; event or an error if there is no response to  cancel. 
data RealtimeClientEventResponseCancel = RealtimeClientEventResponseCancel
  { realtimeClientEventResponseCancelEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventResponseCancelType :: Text -- ^ The event type, must be `response.cancel`.
  , realtimeClientEventResponseCancelResponseUnderscoreid :: Maybe Text -- ^ A specific response ID to cancel - if not provided, will cancel an  in-progress response in the default conversation. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventResponseCancel where
  parseJSON = genericParseJSON optionsRealtimeClientEventResponseCancel
instance ToJSON RealtimeClientEventResponseCancel where
  toJSON = genericToJSON optionsRealtimeClientEventResponseCancel

optionsRealtimeClientEventResponseCancel :: Options
optionsRealtimeClientEventResponseCancel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventResponseCancelEventUnderscoreid", "event_id")
      , ("realtimeClientEventResponseCancelType", "type")
      , ("realtimeClientEventResponseCancelResponseUnderscoreid", "response_id")
      ]


-- | This event instructs the server to create a Response, which means triggering  model inference. When in Server VAD mode, the server will create Responses  automatically.  A Response will include at least one Item, and may have two, in which case  the second will be a function call. These Items will be appended to the  conversation history.  The server will respond with a &#x60;response.created&#x60; event, events for Items  and content created, and finally a &#x60;response.done&#x60; event to indicate the  Response is complete.  The &#x60;response.create&#x60; event includes inference configuration like  &#x60;instructions&#x60;, and &#x60;temperature&#x60;. These fields will override the Session&#39;s  configuration for this Response only. 
data RealtimeClientEventResponseCreate = RealtimeClientEventResponseCreate
  { realtimeClientEventResponseCreateEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventResponseCreateType :: Text -- ^ The event type, must be `response.create`.
  , realtimeClientEventResponseCreateResponse :: Maybe RealtimeResponseCreateParams -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventResponseCreate where
  parseJSON = genericParseJSON optionsRealtimeClientEventResponseCreate
instance ToJSON RealtimeClientEventResponseCreate where
  toJSON = genericToJSON optionsRealtimeClientEventResponseCreate

optionsRealtimeClientEventResponseCreate :: Options
optionsRealtimeClientEventResponseCreate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventResponseCreateEventUnderscoreid", "event_id")
      , ("realtimeClientEventResponseCreateType", "type")
      , ("realtimeClientEventResponseCreateResponse", "response")
      ]


-- | Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \&quot;voice\&quot;. The server will respond  with a &#x60;session.updated&#x60; event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \&quot;instructions\&quot; is to pass an empty string. 
data RealtimeClientEventSessionUpdate = RealtimeClientEventSessionUpdate
  { realtimeClientEventSessionUpdateEventUnderscoreid :: Maybe Text -- ^ Optional client-generated ID used to identify this event.
  , realtimeClientEventSessionUpdateType :: Text -- ^ The event type, must be `session.update`.
  , realtimeClientEventSessionUpdateSession :: RealtimeSessionCreateRequest -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeClientEventSessionUpdate where
  parseJSON = genericParseJSON optionsRealtimeClientEventSessionUpdate
instance ToJSON RealtimeClientEventSessionUpdate where
  toJSON = genericToJSON optionsRealtimeClientEventSessionUpdate

optionsRealtimeClientEventSessionUpdate :: Options
optionsRealtimeClientEventSessionUpdate =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeClientEventSessionUpdateEventUnderscoreid", "event_id")
      , ("realtimeClientEventSessionUpdateType", "type")
      , ("realtimeClientEventSessionUpdateSession", "session")
      ]


-- | The item to add to the conversation.
data RealtimeConversationItem = RealtimeConversationItem
  { realtimeConversationItemId :: Maybe Text -- ^ The unique ID of the item, this can be generated by the client to help  manage server-side context, but is not required because the server will  generate one if not provided. 
  , realtimeConversationItemType :: Maybe Text -- ^ The type of the item (`message`, `function_call`, `function_call_output`). 
  , realtimeConversationItemObject :: Maybe Text -- ^ Identifier for the API object being returned - always `realtime.item`. 
  , realtimeConversationItemStatus :: Maybe Text -- ^ The status of the item (`completed`, `incomplete`). These have no effect  on the conversation, but are accepted for consistency with the  `conversation.item.created` event. 
  , realtimeConversationItemRole :: Maybe Text -- ^ The role of the message sender (`user`, `assistant`, `system`), only  applicable for `message` items. 
  , realtimeConversationItemContent :: Maybe [RealtimeConversationItemContentInner] -- ^ The content of the message, applicable for `message` items.  - Message items of role `system` support only `input_text` content - Message items of role `user` support `input_text` and `input_audio`    content - Message items of role `assistant` support `text` content. 
  , realtimeConversationItemCallUnderscoreid :: Maybe Text -- ^ The ID of the function call (for `function_call` and  `function_call_output` items). If passed on a `function_call_output`  item, the server will check that a `function_call` item with the same  ID exists in the conversation history. 
  , realtimeConversationItemName :: Maybe Text -- ^ The name of the function being called (for `function_call` items). 
  , realtimeConversationItemArguments :: Maybe Text -- ^ The arguments of the function call (for `function_call` items). 
  , realtimeConversationItemOutput :: Maybe Text -- ^ The output of the function call (for `function_call_output` items). 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeConversationItem where
  parseJSON = genericParseJSON optionsRealtimeConversationItem
instance ToJSON RealtimeConversationItem where
  toJSON = genericToJSON optionsRealtimeConversationItem

optionsRealtimeConversationItem :: Options
optionsRealtimeConversationItem =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeConversationItemId", "id")
      , ("realtimeConversationItemType", "type")
      , ("realtimeConversationItemObject", "object")
      , ("realtimeConversationItemStatus", "status")
      , ("realtimeConversationItemRole", "role")
      , ("realtimeConversationItemContent", "content")
      , ("realtimeConversationItemCallUnderscoreid", "call_id")
      , ("realtimeConversationItemName", "name")
      , ("realtimeConversationItemArguments", "arguments")
      , ("realtimeConversationItemOutput", "output")
      ]


-- | 
data RealtimeConversationItemContentInner = RealtimeConversationItemContentInner
  { realtimeConversationItemContentInnerType :: Maybe Text -- ^ The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
  , realtimeConversationItemContentInnerText :: Maybe Text -- ^ The text content, used for `input_text` and `text` content types. 
  , realtimeConversationItemContentInnerId :: Maybe Text -- ^ ID of a previous conversation item to reference (for `item_reference` content types in `response.create` events). These can reference both client and server created items. 
  , realtimeConversationItemContentInnerAudio :: Maybe Text -- ^ Base64-encoded audio bytes, used for `input_audio` content type. 
  , realtimeConversationItemContentInnerTranscript :: Maybe Text -- ^ The transcript of the audio, used for `input_audio` content type. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeConversationItemContentInner where
  parseJSON = genericParseJSON optionsRealtimeConversationItemContentInner
instance ToJSON RealtimeConversationItemContentInner where
  toJSON = genericToJSON optionsRealtimeConversationItemContentInner

optionsRealtimeConversationItemContentInner :: Options
optionsRealtimeConversationItemContentInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeConversationItemContentInnerType", "type")
      , ("realtimeConversationItemContentInnerText", "text")
      , ("realtimeConversationItemContentInnerId", "id")
      , ("realtimeConversationItemContentInnerAudio", "audio")
      , ("realtimeConversationItemContentInnerTranscript", "transcript")
      ]


-- | The response resource.
data RealtimeResponse = RealtimeResponse
  { realtimeResponseId :: Maybe Text -- ^ The unique ID of the response.
  , realtimeResponseObject :: Maybe Text -- ^ The object type, must be `realtime.response`.
  , realtimeResponseStatus :: Maybe Text -- ^ The final status of the response (`completed`, `cancelled`, `failed`, or  `incomplete`). 
  , realtimeResponseStatusUnderscoredetails :: Maybe RealtimeResponseStatusDetails -- ^ 
  , realtimeResponseOutput :: Maybe [RealtimeConversationItem] -- ^ The list of output items generated by the response.
  , realtimeResponseMetadata :: Maybe Object -- ^ Developer-provided string key-value pairs associated with this response. 
  , realtimeResponseUsage :: Maybe RealtimeResponseUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponse where
  parseJSON = genericParseJSON optionsRealtimeResponse
instance ToJSON RealtimeResponse where
  toJSON = genericToJSON optionsRealtimeResponse

optionsRealtimeResponse :: Options
optionsRealtimeResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseId", "id")
      , ("realtimeResponseObject", "object")
      , ("realtimeResponseStatus", "status")
      , ("realtimeResponseStatusUnderscoredetails", "status_details")
      , ("realtimeResponseOutput", "output")
      , ("realtimeResponseMetadata", "metadata")
      , ("realtimeResponseUsage", "usage")
      ]


-- | Create a new Realtime response with these parameters
data RealtimeResponseCreateParams = RealtimeResponseCreateParams
  { realtimeResponseCreateParamsModalities :: Maybe [Text] -- ^ The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  , realtimeResponseCreateParamsInstructions :: Maybe Text -- ^ The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  , realtimeResponseCreateParamsVoice :: Maybe Text -- ^ The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  , realtimeResponseCreateParamsOutputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeResponseCreateParamsTools :: Maybe [RealtimeResponseCreateParamsToolsInner] -- ^ Tools (functions) available to the model.
  , realtimeResponseCreateParamsToolUnderscorechoice :: Maybe Text -- ^ How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
  , realtimeResponseCreateParamsTemperature :: Maybe Double -- ^ Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  , realtimeResponseCreateParamsMaxUnderscoreresponseUnderscoreoutputUnderscoretokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens -- ^ 
  , realtimeResponseCreateParamsConversation :: Maybe RealtimeResponseCreateParamsConversation -- ^ 
  , realtimeResponseCreateParamsMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , realtimeResponseCreateParamsInput :: Maybe [RealtimeConversationItem] -- ^ Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseCreateParams where
  parseJSON = genericParseJSON optionsRealtimeResponseCreateParams
instance ToJSON RealtimeResponseCreateParams where
  toJSON = genericToJSON optionsRealtimeResponseCreateParams

optionsRealtimeResponseCreateParams :: Options
optionsRealtimeResponseCreateParams =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseCreateParamsModalities", "modalities")
      , ("realtimeResponseCreateParamsInstructions", "instructions")
      , ("realtimeResponseCreateParamsVoice", "voice")
      , ("realtimeResponseCreateParamsOutputUnderscoreaudioUnderscoreformat", "output_audio_format")
      , ("realtimeResponseCreateParamsTools", "tools")
      , ("realtimeResponseCreateParamsToolUnderscorechoice", "tool_choice")
      , ("realtimeResponseCreateParamsTemperature", "temperature")
      , ("realtimeResponseCreateParamsMaxUnderscoreresponseUnderscoreoutputUnderscoretokens", "max_response_output_tokens")
      , ("realtimeResponseCreateParamsConversation", "conversation")
      , ("realtimeResponseCreateParamsMetadata", "metadata")
      , ("realtimeResponseCreateParamsInput", "input")
      ]


-- | Controls which conversation the response is added to. Currently supports &#x60;auto&#x60; and &#x60;none&#x60;, with &#x60;auto&#x60; as the default value. The &#x60;auto&#x60; value means that the contents of the response will be added to the default conversation. Set this to &#x60;none&#x60; to create an out-of-band response which  will not add items to default conversation. 
data RealtimeResponseCreateParamsConversation = RealtimeResponseCreateParamsConversation
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseCreateParamsConversation where
  parseJSON = genericParseJSON optionsRealtimeResponseCreateParamsConversation
instance ToJSON RealtimeResponseCreateParamsConversation where
  toJSON = genericToJSON optionsRealtimeResponseCreateParamsConversation

optionsRealtimeResponseCreateParamsConversation :: Options
optionsRealtimeResponseCreateParamsConversation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Maximum number of output tokens for a single assistant response, inclusive of tool calls. Provide an integer between 1 and 4096 to limit output tokens, or &#x60;inf&#x60; for the maximum available tokens for a given model. Defaults to &#x60;inf&#x60;. 
data RealtimeResponseCreateParamsMaxResponseOutputTokens = RealtimeResponseCreateParamsMaxResponseOutputTokens
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseCreateParamsMaxResponseOutputTokens where
  parseJSON = genericParseJSON optionsRealtimeResponseCreateParamsMaxResponseOutputTokens
instance ToJSON RealtimeResponseCreateParamsMaxResponseOutputTokens where
  toJSON = genericToJSON optionsRealtimeResponseCreateParamsMaxResponseOutputTokens

optionsRealtimeResponseCreateParamsMaxResponseOutputTokens :: Options
optionsRealtimeResponseCreateParamsMaxResponseOutputTokens =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
data RealtimeResponseCreateParamsToolsInner = RealtimeResponseCreateParamsToolsInner
  { realtimeResponseCreateParamsToolsInnerType :: Maybe Text -- ^ The type of the tool, i.e. `function`.
  , realtimeResponseCreateParamsToolsInnerName :: Maybe Text -- ^ The name of the function.
  , realtimeResponseCreateParamsToolsInnerDescription :: Maybe Text -- ^ The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
  , realtimeResponseCreateParamsToolsInnerParameters :: Maybe Object -- ^ Parameters of the function in JSON Schema.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseCreateParamsToolsInner where
  parseJSON = genericParseJSON optionsRealtimeResponseCreateParamsToolsInner
instance ToJSON RealtimeResponseCreateParamsToolsInner where
  toJSON = genericToJSON optionsRealtimeResponseCreateParamsToolsInner

optionsRealtimeResponseCreateParamsToolsInner :: Options
optionsRealtimeResponseCreateParamsToolsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseCreateParamsToolsInnerType", "type")
      , ("realtimeResponseCreateParamsToolsInnerName", "name")
      , ("realtimeResponseCreateParamsToolsInnerDescription", "description")
      , ("realtimeResponseCreateParamsToolsInnerParameters", "parameters")
      ]


-- | Additional details about the status.
data RealtimeResponseStatusDetails = RealtimeResponseStatusDetails
  { realtimeResponseStatusDetailsType :: Maybe Text -- ^ The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
  , realtimeResponseStatusDetailsReason :: Maybe Text -- ^ The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
  , realtimeResponseStatusDetailsError :: Maybe RealtimeResponseStatusDetailsError -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseStatusDetails where
  parseJSON = genericParseJSON optionsRealtimeResponseStatusDetails
instance ToJSON RealtimeResponseStatusDetails where
  toJSON = genericToJSON optionsRealtimeResponseStatusDetails

optionsRealtimeResponseStatusDetails :: Options
optionsRealtimeResponseStatusDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseStatusDetailsType", "type")
      , ("realtimeResponseStatusDetailsReason", "reason")
      , ("realtimeResponseStatusDetailsError", "error")
      ]


-- | A description of the error that caused the response to fail,  populated when the &#x60;status&#x60; is &#x60;failed&#x60;. 
data RealtimeResponseStatusDetailsError = RealtimeResponseStatusDetailsError
  { realtimeResponseStatusDetailsErrorType :: Maybe Text -- ^ The type of error.
  , realtimeResponseStatusDetailsErrorCode :: Maybe Text -- ^ Error code, if any.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseStatusDetailsError where
  parseJSON = genericParseJSON optionsRealtimeResponseStatusDetailsError
instance ToJSON RealtimeResponseStatusDetailsError where
  toJSON = genericToJSON optionsRealtimeResponseStatusDetailsError

optionsRealtimeResponseStatusDetailsError :: Options
optionsRealtimeResponseStatusDetailsError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseStatusDetailsErrorType", "type")
      , ("realtimeResponseStatusDetailsErrorCode", "code")
      ]


-- | Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
data RealtimeResponseUsage = RealtimeResponseUsage
  { realtimeResponseUsageTotalUnderscoretokens :: Maybe Int -- ^ The total number of tokens in the Response including input and output  text and audio tokens. 
  , realtimeResponseUsageInputUnderscoretokens :: Maybe Int -- ^ The number of input tokens used in the Response, including text and  audio tokens. 
  , realtimeResponseUsageOutputUnderscoretokens :: Maybe Int -- ^ The number of output tokens sent in the Response, including text and  audio tokens. 
  , realtimeResponseUsageInputUnderscoretokenUnderscoredetails :: Maybe RealtimeResponseUsageInputTokenDetails -- ^ 
  , realtimeResponseUsageOutputUnderscoretokenUnderscoredetails :: Maybe RealtimeResponseUsageOutputTokenDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseUsage where
  parseJSON = genericParseJSON optionsRealtimeResponseUsage
instance ToJSON RealtimeResponseUsage where
  toJSON = genericToJSON optionsRealtimeResponseUsage

optionsRealtimeResponseUsage :: Options
optionsRealtimeResponseUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseUsageTotalUnderscoretokens", "total_tokens")
      , ("realtimeResponseUsageInputUnderscoretokens", "input_tokens")
      , ("realtimeResponseUsageOutputUnderscoretokens", "output_tokens")
      , ("realtimeResponseUsageInputUnderscoretokenUnderscoredetails", "input_token_details")
      , ("realtimeResponseUsageOutputUnderscoretokenUnderscoredetails", "output_token_details")
      ]


-- | Details about the input tokens used in the Response.
data RealtimeResponseUsageInputTokenDetails = RealtimeResponseUsageInputTokenDetails
  { realtimeResponseUsageInputTokenDetailsCachedUnderscoretokens :: Maybe Int -- ^ The number of cached tokens used in the Response.
  , realtimeResponseUsageInputTokenDetailsTextUnderscoretokens :: Maybe Int -- ^ The number of text tokens used in the Response.
  , realtimeResponseUsageInputTokenDetailsAudioUnderscoretokens :: Maybe Int -- ^ The number of audio tokens used in the Response.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseUsageInputTokenDetails where
  parseJSON = genericParseJSON optionsRealtimeResponseUsageInputTokenDetails
instance ToJSON RealtimeResponseUsageInputTokenDetails where
  toJSON = genericToJSON optionsRealtimeResponseUsageInputTokenDetails

optionsRealtimeResponseUsageInputTokenDetails :: Options
optionsRealtimeResponseUsageInputTokenDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseUsageInputTokenDetailsCachedUnderscoretokens", "cached_tokens")
      , ("realtimeResponseUsageInputTokenDetailsTextUnderscoretokens", "text_tokens")
      , ("realtimeResponseUsageInputTokenDetailsAudioUnderscoretokens", "audio_tokens")
      ]


-- | Details about the output tokens used in the Response.
data RealtimeResponseUsageOutputTokenDetails = RealtimeResponseUsageOutputTokenDetails
  { realtimeResponseUsageOutputTokenDetailsTextUnderscoretokens :: Maybe Int -- ^ The number of text tokens used in the Response.
  , realtimeResponseUsageOutputTokenDetailsAudioUnderscoretokens :: Maybe Int -- ^ The number of audio tokens used in the Response.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeResponseUsageOutputTokenDetails where
  parseJSON = genericParseJSON optionsRealtimeResponseUsageOutputTokenDetails
instance ToJSON RealtimeResponseUsageOutputTokenDetails where
  toJSON = genericToJSON optionsRealtimeResponseUsageOutputTokenDetails

optionsRealtimeResponseUsageOutputTokenDetails :: Options
optionsRealtimeResponseUsageOutputTokenDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeResponseUsageOutputTokenDetailsTextUnderscoretokens", "text_tokens")
      , ("realtimeResponseUsageOutputTokenDetailsAudioUnderscoretokens", "audio_tokens")
      ]


-- | Returned when a conversation is created. Emitted right after session creation. 
data RealtimeServerEventConversationCreated = RealtimeServerEventConversationCreated
  { realtimeServerEventConversationCreatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventConversationCreatedType :: Text -- ^ The event type, must be `conversation.created`.
  , realtimeServerEventConversationCreatedConversation :: RealtimeServerEventConversationCreatedConversation -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationCreated where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationCreated
instance ToJSON RealtimeServerEventConversationCreated where
  toJSON = genericToJSON optionsRealtimeServerEventConversationCreated

optionsRealtimeServerEventConversationCreated :: Options
optionsRealtimeServerEventConversationCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationCreatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventConversationCreatedType", "type")
      , ("realtimeServerEventConversationCreatedConversation", "conversation")
      ]


-- | The conversation resource.
data RealtimeServerEventConversationCreatedConversation = RealtimeServerEventConversationCreatedConversation
  { realtimeServerEventConversationCreatedConversationId :: Maybe Text -- ^ The unique ID of the conversation.
  , realtimeServerEventConversationCreatedConversationObject :: Maybe Text -- ^ The object type, must be `realtime.conversation`.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationCreatedConversation where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationCreatedConversation
instance ToJSON RealtimeServerEventConversationCreatedConversation where
  toJSON = genericToJSON optionsRealtimeServerEventConversationCreatedConversation

optionsRealtimeServerEventConversationCreatedConversation :: Options
optionsRealtimeServerEventConversationCreatedConversation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationCreatedConversationId", "id")
      , ("realtimeServerEventConversationCreatedConversationObject", "object")
      ]


-- | Returned when a conversation item is created. There are several scenarios that  produce this event:   - The server is generating a Response, which if successful will produce      either one or two Items, which will be of type &#x60;message&#x60;      (role &#x60;assistant&#x60;) or type &#x60;function_call&#x60;.   - The input audio buffer has been committed, either by the client or the      server (in &#x60;server_vad&#x60; mode). The server will take the content of the      input audio buffer and add it to a new user message Item.   - The client has sent a &#x60;conversation.item.create&#x60; event to add a new Item      to the Conversation. 
data RealtimeServerEventConversationItemCreated = RealtimeServerEventConversationItemCreated
  { realtimeServerEventConversationItemCreatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventConversationItemCreatedType :: Text -- ^ The event type, must be `conversation.item.created`.
  , realtimeServerEventConversationItemCreatedPreviousUnderscoreitemUnderscoreid :: Text -- ^ The ID of the preceding item in the Conversation context, allows the  client to understand the order of the conversation. 
  , realtimeServerEventConversationItemCreatedItem :: RealtimeConversationItem -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationItemCreated where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationItemCreated
instance ToJSON RealtimeServerEventConversationItemCreated where
  toJSON = genericToJSON optionsRealtimeServerEventConversationItemCreated

optionsRealtimeServerEventConversationItemCreated :: Options
optionsRealtimeServerEventConversationItemCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationItemCreatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventConversationItemCreatedType", "type")
      , ("realtimeServerEventConversationItemCreatedPreviousUnderscoreitemUnderscoreid", "previous_item_id")
      , ("realtimeServerEventConversationItemCreatedItem", "item")
      ]


-- | Returned when an item in the conversation is deleted by the client with a  &#x60;conversation.item.delete&#x60; event. This event is used to synchronize the  server&#39;s understanding of the conversation history with the client&#39;s view. 
data RealtimeServerEventConversationItemDeleted = RealtimeServerEventConversationItemDeleted
  { realtimeServerEventConversationItemDeletedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventConversationItemDeletedType :: Text -- ^ The event type, must be `conversation.item.deleted`.
  , realtimeServerEventConversationItemDeletedItemUnderscoreid :: Text -- ^ The ID of the item that was deleted.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationItemDeleted where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationItemDeleted
instance ToJSON RealtimeServerEventConversationItemDeleted where
  toJSON = genericToJSON optionsRealtimeServerEventConversationItemDeleted

optionsRealtimeServerEventConversationItemDeleted :: Options
optionsRealtimeServerEventConversationItemDeleted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationItemDeletedEventUnderscoreid", "event_id")
      , ("realtimeServerEventConversationItemDeletedType", "type")
      , ("realtimeServerEventConversationItemDeletedItemUnderscoreid", "item_id")
      ]


-- | This event is the output of audio transcription for user audio written to the  user audio buffer. Transcription begins when the input audio buffer is  committed by the client or server (in &#x60;server_vad&#x60; mode). Transcription runs  asynchronously with Response creation, so this event may come before or after  the Response events.  Realtime API models accept audio natively, and thus input transcription is a  separate process run on a separate ASR (Automatic Speech Recognition) model,  currently always &#x60;whisper-1&#x60;. Thus the transcript may diverge somewhat from  the model&#39;s interpretation, and should be treated as a rough guide. 
data RealtimeServerEventConversationItemInputAudioTranscriptionCompleted = RealtimeServerEventConversationItemInputAudioTranscriptionCompleted
  { realtimeServerEventConversationItemInputAudioTranscriptionCompletedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventConversationItemInputAudioTranscriptionCompletedType :: Text -- ^ The event type, must be `conversation.item.input_audio_transcription.completed`. 
  , realtimeServerEventConversationItemInputAudioTranscriptionCompletedItemUnderscoreid :: Text -- ^ The ID of the user message item containing the audio.
  , realtimeServerEventConversationItemInputAudioTranscriptionCompletedContentUnderscoreindex :: Int -- ^ The index of the content part containing the audio.
  , realtimeServerEventConversationItemInputAudioTranscriptionCompletedTranscript :: Text -- ^ The transcribed text.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationItemInputAudioTranscriptionCompleted where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationItemInputAudioTranscriptionCompleted
instance ToJSON RealtimeServerEventConversationItemInputAudioTranscriptionCompleted where
  toJSON = genericToJSON optionsRealtimeServerEventConversationItemInputAudioTranscriptionCompleted

optionsRealtimeServerEventConversationItemInputAudioTranscriptionCompleted :: Options
optionsRealtimeServerEventConversationItemInputAudioTranscriptionCompleted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationItemInputAudioTranscriptionCompletedEventUnderscoreid", "event_id")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionCompletedType", "type")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionCompletedItemUnderscoreid", "item_id")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionCompletedContentUnderscoreindex", "content_index")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionCompletedTranscript", "transcript")
      ]


-- | Returned when input audio transcription is configured, and a transcription  request for a user message failed. These events are separate from other  &#x60;error&#x60; events so that the client can identify the related Item. 
data RealtimeServerEventConversationItemInputAudioTranscriptionFailed = RealtimeServerEventConversationItemInputAudioTranscriptionFailed
  { realtimeServerEventConversationItemInputAudioTranscriptionFailedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedType :: Text -- ^ The event type, must be `conversation.item.input_audio_transcription.failed`. 
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedItemUnderscoreid :: Text -- ^ The ID of the user message item.
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedContentUnderscoreindex :: Int -- ^ The index of the content part containing the audio.
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedError :: RealtimeServerEventConversationItemInputAudioTranscriptionFailedError -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationItemInputAudioTranscriptionFailed where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailed
instance ToJSON RealtimeServerEventConversationItemInputAudioTranscriptionFailed where
  toJSON = genericToJSON optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailed

optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailed :: Options
optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailed =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationItemInputAudioTranscriptionFailedEventUnderscoreid", "event_id")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedType", "type")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedItemUnderscoreid", "item_id")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedContentUnderscoreindex", "content_index")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedError", "error")
      ]


-- | Details of the transcription error.
data RealtimeServerEventConversationItemInputAudioTranscriptionFailedError = RealtimeServerEventConversationItemInputAudioTranscriptionFailedError
  { realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorType :: Maybe Text -- ^ The type of error.
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorCode :: Maybe Text -- ^ Error code, if any.
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorMessage :: Maybe Text -- ^ A human-readable error message.
  , realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorParam :: Maybe Text -- ^ Parameter related to the error, if any.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationItemInputAudioTranscriptionFailedError where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailedError
instance ToJSON RealtimeServerEventConversationItemInputAudioTranscriptionFailedError where
  toJSON = genericToJSON optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailedError

optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailedError :: Options
optionsRealtimeServerEventConversationItemInputAudioTranscriptionFailedError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorType", "type")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorCode", "code")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorMessage", "message")
      , ("realtimeServerEventConversationItemInputAudioTranscriptionFailedErrorParam", "param")
      ]


-- | Returned when an earlier assistant audio message item is truncated by the  client with a &#x60;conversation.item.truncate&#x60; event. This event is used to  synchronize the server&#39;s understanding of the audio with the client&#39;s playback.  This action will truncate the audio and remove the server-side text transcript  to ensure there is no text in the context that hasn&#39;t been heard by the user. 
data RealtimeServerEventConversationItemTruncated = RealtimeServerEventConversationItemTruncated
  { realtimeServerEventConversationItemTruncatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventConversationItemTruncatedType :: Text -- ^ The event type, must be `conversation.item.truncated`.
  , realtimeServerEventConversationItemTruncatedItemUnderscoreid :: Text -- ^ The ID of the assistant message item that was truncated.
  , realtimeServerEventConversationItemTruncatedContentUnderscoreindex :: Int -- ^ The index of the content part that was truncated.
  , realtimeServerEventConversationItemTruncatedAudioUnderscoreendUnderscorems :: Int -- ^ The duration up to which the audio was truncated, in milliseconds. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventConversationItemTruncated where
  parseJSON = genericParseJSON optionsRealtimeServerEventConversationItemTruncated
instance ToJSON RealtimeServerEventConversationItemTruncated where
  toJSON = genericToJSON optionsRealtimeServerEventConversationItemTruncated

optionsRealtimeServerEventConversationItemTruncated :: Options
optionsRealtimeServerEventConversationItemTruncated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventConversationItemTruncatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventConversationItemTruncatedType", "type")
      , ("realtimeServerEventConversationItemTruncatedItemUnderscoreid", "item_id")
      , ("realtimeServerEventConversationItemTruncatedContentUnderscoreindex", "content_index")
      , ("realtimeServerEventConversationItemTruncatedAudioUnderscoreendUnderscorems", "audio_end_ms")
      ]


-- | Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
data RealtimeServerEventError = RealtimeServerEventError
  { realtimeServerEventErrorEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventErrorType :: Text -- ^ The event type, must be `error`.
  , realtimeServerEventErrorError :: RealtimeServerEventErrorError -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventError where
  parseJSON = genericParseJSON optionsRealtimeServerEventError
instance ToJSON RealtimeServerEventError where
  toJSON = genericToJSON optionsRealtimeServerEventError

optionsRealtimeServerEventError :: Options
optionsRealtimeServerEventError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventErrorEventUnderscoreid", "event_id")
      , ("realtimeServerEventErrorType", "type")
      , ("realtimeServerEventErrorError", "error")
      ]


-- | Details of the error.
data RealtimeServerEventErrorError = RealtimeServerEventErrorError
  { realtimeServerEventErrorErrorType :: Text -- ^ The type of error (e.g., \"invalid_request_error\", \"server_error\"). 
  , realtimeServerEventErrorErrorCode :: Maybe Text -- ^ Error code, if any.
  , realtimeServerEventErrorErrorMessage :: Text -- ^ A human-readable error message.
  , realtimeServerEventErrorErrorParam :: Maybe Text -- ^ Parameter related to the error, if any.
  , realtimeServerEventErrorErrorEventUnderscoreid :: Maybe Text -- ^ The event_id of the client event that caused the error, if applicable. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventErrorError where
  parseJSON = genericParseJSON optionsRealtimeServerEventErrorError
instance ToJSON RealtimeServerEventErrorError where
  toJSON = genericToJSON optionsRealtimeServerEventErrorError

optionsRealtimeServerEventErrorError :: Options
optionsRealtimeServerEventErrorError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventErrorErrorType", "type")
      , ("realtimeServerEventErrorErrorCode", "code")
      , ("realtimeServerEventErrorErrorMessage", "message")
      , ("realtimeServerEventErrorErrorParam", "param")
      , ("realtimeServerEventErrorErrorEventUnderscoreid", "event_id")
      ]


-- | Returned when the input audio buffer is cleared by the client with a  &#x60;input_audio_buffer.clear&#x60; event. 
data RealtimeServerEventInputAudioBufferCleared = RealtimeServerEventInputAudioBufferCleared
  { realtimeServerEventInputAudioBufferClearedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventInputAudioBufferClearedType :: Text -- ^ The event type, must be `input_audio_buffer.cleared`.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventInputAudioBufferCleared where
  parseJSON = genericParseJSON optionsRealtimeServerEventInputAudioBufferCleared
instance ToJSON RealtimeServerEventInputAudioBufferCleared where
  toJSON = genericToJSON optionsRealtimeServerEventInputAudioBufferCleared

optionsRealtimeServerEventInputAudioBufferCleared :: Options
optionsRealtimeServerEventInputAudioBufferCleared =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventInputAudioBufferClearedEventUnderscoreid", "event_id")
      , ("realtimeServerEventInputAudioBufferClearedType", "type")
      ]


-- | Returned when an input audio buffer is committed, either by the client or  automatically in server VAD mode. The &#x60;item_id&#x60; property is the ID of the user message item that will be created, thus a &#x60;conversation.item.created&#x60; event  will also be sent to the client. 
data RealtimeServerEventInputAudioBufferCommitted = RealtimeServerEventInputAudioBufferCommitted
  { realtimeServerEventInputAudioBufferCommittedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventInputAudioBufferCommittedType :: Text -- ^ The event type, must be `input_audio_buffer.committed`.
  , realtimeServerEventInputAudioBufferCommittedPreviousUnderscoreitemUnderscoreid :: Text -- ^ The ID of the preceding item after which the new item will be inserted. 
  , realtimeServerEventInputAudioBufferCommittedItemUnderscoreid :: Text -- ^ The ID of the user message item that will be created.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventInputAudioBufferCommitted where
  parseJSON = genericParseJSON optionsRealtimeServerEventInputAudioBufferCommitted
instance ToJSON RealtimeServerEventInputAudioBufferCommitted where
  toJSON = genericToJSON optionsRealtimeServerEventInputAudioBufferCommitted

optionsRealtimeServerEventInputAudioBufferCommitted :: Options
optionsRealtimeServerEventInputAudioBufferCommitted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventInputAudioBufferCommittedEventUnderscoreid", "event_id")
      , ("realtimeServerEventInputAudioBufferCommittedType", "type")
      , ("realtimeServerEventInputAudioBufferCommittedPreviousUnderscoreitemUnderscoreid", "previous_item_id")
      , ("realtimeServerEventInputAudioBufferCommittedItemUnderscoreid", "item_id")
      ]


-- | Sent by the server when in &#x60;server_vad&#x60; mode to indicate that speech has been  detected in the audio buffer. This can happen any time audio is added to the  buffer (unless speech is already detected). The client may want to use this  event to interrupt audio playback or provide visual feedback to the user.   The client should expect to receive a &#x60;input_audio_buffer.speech_stopped&#x60; event  when speech stops. The &#x60;item_id&#x60; property is the ID of the user message item  that will be created when speech stops and will also be included in the  &#x60;input_audio_buffer.speech_stopped&#x60; event (unless the client manually commits  the audio buffer during VAD activation). 
data RealtimeServerEventInputAudioBufferSpeechStarted = RealtimeServerEventInputAudioBufferSpeechStarted
  { realtimeServerEventInputAudioBufferSpeechStartedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventInputAudioBufferSpeechStartedType :: Text -- ^ The event type, must be `input_audio_buffer.speech_started`.
  , realtimeServerEventInputAudioBufferSpeechStartedAudioUnderscorestartUnderscorems :: Int -- ^ Milliseconds from the start of all audio written to the buffer during the  session when speech was first detected. This will correspond to the  beginning of audio sent to the model, and thus includes the  `prefix_padding_ms` configured in the Session. 
  , realtimeServerEventInputAudioBufferSpeechStartedItemUnderscoreid :: Text -- ^ The ID of the user message item that will be created when speech stops. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventInputAudioBufferSpeechStarted where
  parseJSON = genericParseJSON optionsRealtimeServerEventInputAudioBufferSpeechStarted
instance ToJSON RealtimeServerEventInputAudioBufferSpeechStarted where
  toJSON = genericToJSON optionsRealtimeServerEventInputAudioBufferSpeechStarted

optionsRealtimeServerEventInputAudioBufferSpeechStarted :: Options
optionsRealtimeServerEventInputAudioBufferSpeechStarted =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventInputAudioBufferSpeechStartedEventUnderscoreid", "event_id")
      , ("realtimeServerEventInputAudioBufferSpeechStartedType", "type")
      , ("realtimeServerEventInputAudioBufferSpeechStartedAudioUnderscorestartUnderscorems", "audio_start_ms")
      , ("realtimeServerEventInputAudioBufferSpeechStartedItemUnderscoreid", "item_id")
      ]


-- | Returned in &#x60;server_vad&#x60; mode when the server detects the end of speech in  the audio buffer. The server will also send an &#x60;conversation.item.created&#x60;  event with the user message item that is created from the audio buffer. 
data RealtimeServerEventInputAudioBufferSpeechStopped = RealtimeServerEventInputAudioBufferSpeechStopped
  { realtimeServerEventInputAudioBufferSpeechStoppedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventInputAudioBufferSpeechStoppedType :: Text -- ^ The event type, must be `input_audio_buffer.speech_stopped`.
  , realtimeServerEventInputAudioBufferSpeechStoppedAudioUnderscoreendUnderscorems :: Int -- ^ Milliseconds since the session started when speech stopped. This will  correspond to the end of audio sent to the model, and thus includes the  `min_silence_duration_ms` configured in the Session. 
  , realtimeServerEventInputAudioBufferSpeechStoppedItemUnderscoreid :: Text -- ^ The ID of the user message item that will be created.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventInputAudioBufferSpeechStopped where
  parseJSON = genericParseJSON optionsRealtimeServerEventInputAudioBufferSpeechStopped
instance ToJSON RealtimeServerEventInputAudioBufferSpeechStopped where
  toJSON = genericToJSON optionsRealtimeServerEventInputAudioBufferSpeechStopped

optionsRealtimeServerEventInputAudioBufferSpeechStopped :: Options
optionsRealtimeServerEventInputAudioBufferSpeechStopped =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventInputAudioBufferSpeechStoppedEventUnderscoreid", "event_id")
      , ("realtimeServerEventInputAudioBufferSpeechStoppedType", "type")
      , ("realtimeServerEventInputAudioBufferSpeechStoppedAudioUnderscoreendUnderscorems", "audio_end_ms")
      , ("realtimeServerEventInputAudioBufferSpeechStoppedItemUnderscoreid", "item_id")
      ]


-- | Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
data RealtimeServerEventRateLimitsUpdated = RealtimeServerEventRateLimitsUpdated
  { realtimeServerEventRateLimitsUpdatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventRateLimitsUpdatedType :: Text -- ^ The event type, must be `rate_limits.updated`.
  , realtimeServerEventRateLimitsUpdatedRateUnderscorelimits :: [RealtimeServerEventRateLimitsUpdatedRateLimitsInner] -- ^ List of rate limit information.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventRateLimitsUpdated where
  parseJSON = genericParseJSON optionsRealtimeServerEventRateLimitsUpdated
instance ToJSON RealtimeServerEventRateLimitsUpdated where
  toJSON = genericToJSON optionsRealtimeServerEventRateLimitsUpdated

optionsRealtimeServerEventRateLimitsUpdated :: Options
optionsRealtimeServerEventRateLimitsUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventRateLimitsUpdatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventRateLimitsUpdatedType", "type")
      , ("realtimeServerEventRateLimitsUpdatedRateUnderscorelimits", "rate_limits")
      ]


-- | 
data RealtimeServerEventRateLimitsUpdatedRateLimitsInner = RealtimeServerEventRateLimitsUpdatedRateLimitsInner
  { realtimeServerEventRateLimitsUpdatedRateLimitsInnerName :: Maybe Text -- ^ The name of the rate limit (`requests`, `tokens`). 
  , realtimeServerEventRateLimitsUpdatedRateLimitsInnerLimit :: Maybe Int -- ^ The maximum allowed value for the rate limit.
  , realtimeServerEventRateLimitsUpdatedRateLimitsInnerRemaining :: Maybe Int -- ^ The remaining value before the limit is reached.
  , realtimeServerEventRateLimitsUpdatedRateLimitsInnerResetUnderscoreseconds :: Maybe Double -- ^ Seconds until the rate limit resets.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventRateLimitsUpdatedRateLimitsInner where
  parseJSON = genericParseJSON optionsRealtimeServerEventRateLimitsUpdatedRateLimitsInner
instance ToJSON RealtimeServerEventRateLimitsUpdatedRateLimitsInner where
  toJSON = genericToJSON optionsRealtimeServerEventRateLimitsUpdatedRateLimitsInner

optionsRealtimeServerEventRateLimitsUpdatedRateLimitsInner :: Options
optionsRealtimeServerEventRateLimitsUpdatedRateLimitsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventRateLimitsUpdatedRateLimitsInnerName", "name")
      , ("realtimeServerEventRateLimitsUpdatedRateLimitsInnerLimit", "limit")
      , ("realtimeServerEventRateLimitsUpdatedRateLimitsInnerRemaining", "remaining")
      , ("realtimeServerEventRateLimitsUpdatedRateLimitsInnerResetUnderscoreseconds", "reset_seconds")
      ]


-- | Returned when the model-generated audio is updated.
data RealtimeServerEventResponseAudioDelta = RealtimeServerEventResponseAudioDelta
  { realtimeServerEventResponseAudioDeltaEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseAudioDeltaType :: Text -- ^ The event type, must be `response.audio.delta`.
  , realtimeServerEventResponseAudioDeltaResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseAudioDeltaItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseAudioDeltaOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseAudioDeltaContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseAudioDeltaDelta :: Text -- ^ Base64-encoded audio data delta.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseAudioDelta where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseAudioDelta
instance ToJSON RealtimeServerEventResponseAudioDelta where
  toJSON = genericToJSON optionsRealtimeServerEventResponseAudioDelta

optionsRealtimeServerEventResponseAudioDelta :: Options
optionsRealtimeServerEventResponseAudioDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseAudioDeltaEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseAudioDeltaType", "type")
      , ("realtimeServerEventResponseAudioDeltaResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseAudioDeltaItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseAudioDeltaOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseAudioDeltaContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseAudioDeltaDelta", "delta")
      ]


-- | Returned when the model-generated audio is done. Also emitted when a Response is interrupted, incomplete, or cancelled. 
data RealtimeServerEventResponseAudioDone = RealtimeServerEventResponseAudioDone
  { realtimeServerEventResponseAudioDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseAudioDoneType :: Text -- ^ The event type, must be `response.audio.done`.
  , realtimeServerEventResponseAudioDoneResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseAudioDoneItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseAudioDoneOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseAudioDoneContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseAudioDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseAudioDone
instance ToJSON RealtimeServerEventResponseAudioDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseAudioDone

optionsRealtimeServerEventResponseAudioDone :: Options
optionsRealtimeServerEventResponseAudioDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseAudioDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseAudioDoneType", "type")
      , ("realtimeServerEventResponseAudioDoneResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseAudioDoneItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseAudioDoneOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseAudioDoneContentUnderscoreindex", "content_index")
      ]


-- | Returned when the model-generated transcription of audio output is updated. 
data RealtimeServerEventResponseAudioTranscriptDelta = RealtimeServerEventResponseAudioTranscriptDelta
  { realtimeServerEventResponseAudioTranscriptDeltaEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseAudioTranscriptDeltaType :: Text -- ^ The event type, must be `response.audio_transcript.delta`.
  , realtimeServerEventResponseAudioTranscriptDeltaResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseAudioTranscriptDeltaItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseAudioTranscriptDeltaOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseAudioTranscriptDeltaContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseAudioTranscriptDeltaDelta :: Text -- ^ The transcript delta.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseAudioTranscriptDelta where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseAudioTranscriptDelta
instance ToJSON RealtimeServerEventResponseAudioTranscriptDelta where
  toJSON = genericToJSON optionsRealtimeServerEventResponseAudioTranscriptDelta

optionsRealtimeServerEventResponseAudioTranscriptDelta :: Options
optionsRealtimeServerEventResponseAudioTranscriptDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseAudioTranscriptDeltaEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseAudioTranscriptDeltaType", "type")
      , ("realtimeServerEventResponseAudioTranscriptDeltaResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseAudioTranscriptDeltaItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseAudioTranscriptDeltaOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseAudioTranscriptDeltaContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseAudioTranscriptDeltaDelta", "delta")
      ]


-- | Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
data RealtimeServerEventResponseAudioTranscriptDone = RealtimeServerEventResponseAudioTranscriptDone
  { realtimeServerEventResponseAudioTranscriptDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseAudioTranscriptDoneType :: Text -- ^ The event type, must be `response.audio_transcript.done`.
  , realtimeServerEventResponseAudioTranscriptDoneResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseAudioTranscriptDoneItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseAudioTranscriptDoneOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseAudioTranscriptDoneContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseAudioTranscriptDoneTranscript :: Text -- ^ The final transcript of the audio.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseAudioTranscriptDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseAudioTranscriptDone
instance ToJSON RealtimeServerEventResponseAudioTranscriptDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseAudioTranscriptDone

optionsRealtimeServerEventResponseAudioTranscriptDone :: Options
optionsRealtimeServerEventResponseAudioTranscriptDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseAudioTranscriptDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseAudioTranscriptDoneType", "type")
      , ("realtimeServerEventResponseAudioTranscriptDoneResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseAudioTranscriptDoneItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseAudioTranscriptDoneOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseAudioTranscriptDoneContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseAudioTranscriptDoneTranscript", "transcript")
      ]


-- | Returned when a new content part is added to an assistant message item during response generation. 
data RealtimeServerEventResponseContentPartAdded = RealtimeServerEventResponseContentPartAdded
  { realtimeServerEventResponseContentPartAddedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseContentPartAddedType :: Text -- ^ The event type, must be `response.content_part.added`.
  , realtimeServerEventResponseContentPartAddedResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseContentPartAddedItemUnderscoreid :: Text -- ^ The ID of the item to which the content part was added.
  , realtimeServerEventResponseContentPartAddedOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseContentPartAddedContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseContentPartAddedPart :: RealtimeServerEventResponseContentPartAddedPart -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseContentPartAdded where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseContentPartAdded
instance ToJSON RealtimeServerEventResponseContentPartAdded where
  toJSON = genericToJSON optionsRealtimeServerEventResponseContentPartAdded

optionsRealtimeServerEventResponseContentPartAdded :: Options
optionsRealtimeServerEventResponseContentPartAdded =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseContentPartAddedEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseContentPartAddedType", "type")
      , ("realtimeServerEventResponseContentPartAddedResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseContentPartAddedItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseContentPartAddedOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseContentPartAddedContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseContentPartAddedPart", "part")
      ]


-- | The content part that was added.
data RealtimeServerEventResponseContentPartAddedPart = RealtimeServerEventResponseContentPartAddedPart
  { realtimeServerEventResponseContentPartAddedPartType :: Maybe Text -- ^ The content type (\"text\", \"audio\").
  , realtimeServerEventResponseContentPartAddedPartText :: Maybe Text -- ^ The text content (if type is \"text\").
  , realtimeServerEventResponseContentPartAddedPartAudio :: Maybe Text -- ^ Base64-encoded audio data (if type is \"audio\").
  , realtimeServerEventResponseContentPartAddedPartTranscript :: Maybe Text -- ^ The transcript of the audio (if type is \"audio\").
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseContentPartAddedPart where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseContentPartAddedPart
instance ToJSON RealtimeServerEventResponseContentPartAddedPart where
  toJSON = genericToJSON optionsRealtimeServerEventResponseContentPartAddedPart

optionsRealtimeServerEventResponseContentPartAddedPart :: Options
optionsRealtimeServerEventResponseContentPartAddedPart =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseContentPartAddedPartType", "type")
      , ("realtimeServerEventResponseContentPartAddedPartText", "text")
      , ("realtimeServerEventResponseContentPartAddedPartAudio", "audio")
      , ("realtimeServerEventResponseContentPartAddedPartTranscript", "transcript")
      ]


-- | Returned when a content part is done streaming in an assistant message item. Also emitted when a Response is interrupted, incomplete, or cancelled. 
data RealtimeServerEventResponseContentPartDone = RealtimeServerEventResponseContentPartDone
  { realtimeServerEventResponseContentPartDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseContentPartDoneType :: Text -- ^ The event type, must be `response.content_part.done`.
  , realtimeServerEventResponseContentPartDoneResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseContentPartDoneItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseContentPartDoneOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseContentPartDoneContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseContentPartDonePart :: RealtimeServerEventResponseContentPartDonePart -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseContentPartDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseContentPartDone
instance ToJSON RealtimeServerEventResponseContentPartDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseContentPartDone

optionsRealtimeServerEventResponseContentPartDone :: Options
optionsRealtimeServerEventResponseContentPartDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseContentPartDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseContentPartDoneType", "type")
      , ("realtimeServerEventResponseContentPartDoneResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseContentPartDoneItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseContentPartDoneOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseContentPartDoneContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseContentPartDonePart", "part")
      ]


-- | The content part that is done.
data RealtimeServerEventResponseContentPartDonePart = RealtimeServerEventResponseContentPartDonePart
  { realtimeServerEventResponseContentPartDonePartType :: Maybe Text -- ^ The content type (\"text\", \"audio\").
  , realtimeServerEventResponseContentPartDonePartText :: Maybe Text -- ^ The text content (if type is \"text\").
  , realtimeServerEventResponseContentPartDonePartAudio :: Maybe Text -- ^ Base64-encoded audio data (if type is \"audio\").
  , realtimeServerEventResponseContentPartDonePartTranscript :: Maybe Text -- ^ The transcript of the audio (if type is \"audio\").
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseContentPartDonePart where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseContentPartDonePart
instance ToJSON RealtimeServerEventResponseContentPartDonePart where
  toJSON = genericToJSON optionsRealtimeServerEventResponseContentPartDonePart

optionsRealtimeServerEventResponseContentPartDonePart :: Options
optionsRealtimeServerEventResponseContentPartDonePart =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseContentPartDonePartType", "type")
      , ("realtimeServerEventResponseContentPartDonePartText", "text")
      , ("realtimeServerEventResponseContentPartDonePartAudio", "audio")
      , ("realtimeServerEventResponseContentPartDonePartTranscript", "transcript")
      ]


-- | Returned when a new Response is created. The first event of response creation, where the response is in an initial state of &#x60;in_progress&#x60;. 
data RealtimeServerEventResponseCreated = RealtimeServerEventResponseCreated
  { realtimeServerEventResponseCreatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseCreatedType :: Text -- ^ The event type, must be `response.created`.
  , realtimeServerEventResponseCreatedResponse :: RealtimeResponse -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseCreated where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseCreated
instance ToJSON RealtimeServerEventResponseCreated where
  toJSON = genericToJSON optionsRealtimeServerEventResponseCreated

optionsRealtimeServerEventResponseCreated :: Options
optionsRealtimeServerEventResponseCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseCreatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseCreatedType", "type")
      , ("realtimeServerEventResponseCreatedResponse", "response")
      ]


-- | Returned when a Response is done streaming. Always emitted, no matter the  final state. The Response object included in the &#x60;response.done&#x60; event will  include all output Items in the Response but will omit the raw audio data. 
data RealtimeServerEventResponseDone = RealtimeServerEventResponseDone
  { realtimeServerEventResponseDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseDoneType :: Text -- ^ The event type, must be `response.done`.
  , realtimeServerEventResponseDoneResponse :: RealtimeResponse -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseDone
instance ToJSON RealtimeServerEventResponseDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseDone

optionsRealtimeServerEventResponseDone :: Options
optionsRealtimeServerEventResponseDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseDoneType", "type")
      , ("realtimeServerEventResponseDoneResponse", "response")
      ]


-- | Returned when the model-generated function call arguments are updated. 
data RealtimeServerEventResponseFunctionCallArgumentsDelta = RealtimeServerEventResponseFunctionCallArgumentsDelta
  { realtimeServerEventResponseFunctionCallArgumentsDeltaEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseFunctionCallArgumentsDeltaType :: Text -- ^ The event type, must be `response.function_call_arguments.delta`. 
  , realtimeServerEventResponseFunctionCallArgumentsDeltaResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseFunctionCallArgumentsDeltaItemUnderscoreid :: Text -- ^ The ID of the function call item.
  , realtimeServerEventResponseFunctionCallArgumentsDeltaOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseFunctionCallArgumentsDeltaCallUnderscoreid :: Text -- ^ The ID of the function call.
  , realtimeServerEventResponseFunctionCallArgumentsDeltaDelta :: Text -- ^ The arguments delta as a JSON string.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseFunctionCallArgumentsDelta where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseFunctionCallArgumentsDelta
instance ToJSON RealtimeServerEventResponseFunctionCallArgumentsDelta where
  toJSON = genericToJSON optionsRealtimeServerEventResponseFunctionCallArgumentsDelta

optionsRealtimeServerEventResponseFunctionCallArgumentsDelta :: Options
optionsRealtimeServerEventResponseFunctionCallArgumentsDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseFunctionCallArgumentsDeltaEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDeltaType", "type")
      , ("realtimeServerEventResponseFunctionCallArgumentsDeltaResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDeltaItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDeltaOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseFunctionCallArgumentsDeltaCallUnderscoreid", "call_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDeltaDelta", "delta")
      ]


-- | Returned when the model-generated function call arguments are done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
data RealtimeServerEventResponseFunctionCallArgumentsDone = RealtimeServerEventResponseFunctionCallArgumentsDone
  { realtimeServerEventResponseFunctionCallArgumentsDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseFunctionCallArgumentsDoneType :: Text -- ^ The event type, must be `response.function_call_arguments.done`. 
  , realtimeServerEventResponseFunctionCallArgumentsDoneResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseFunctionCallArgumentsDoneItemUnderscoreid :: Text -- ^ The ID of the function call item.
  , realtimeServerEventResponseFunctionCallArgumentsDoneOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseFunctionCallArgumentsDoneCallUnderscoreid :: Text -- ^ The ID of the function call.
  , realtimeServerEventResponseFunctionCallArgumentsDoneArguments :: Text -- ^ The final arguments as a JSON string.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseFunctionCallArgumentsDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseFunctionCallArgumentsDone
instance ToJSON RealtimeServerEventResponseFunctionCallArgumentsDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseFunctionCallArgumentsDone

optionsRealtimeServerEventResponseFunctionCallArgumentsDone :: Options
optionsRealtimeServerEventResponseFunctionCallArgumentsDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseFunctionCallArgumentsDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDoneType", "type")
      , ("realtimeServerEventResponseFunctionCallArgumentsDoneResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDoneItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDoneOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseFunctionCallArgumentsDoneCallUnderscoreid", "call_id")
      , ("realtimeServerEventResponseFunctionCallArgumentsDoneArguments", "arguments")
      ]


-- | Returned when a new Item is created during Response generation.
data RealtimeServerEventResponseOutputItemAdded = RealtimeServerEventResponseOutputItemAdded
  { realtimeServerEventResponseOutputItemAddedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseOutputItemAddedType :: Text -- ^ The event type, must be `response.output_item.added`.
  , realtimeServerEventResponseOutputItemAddedResponseUnderscoreid :: Text -- ^ The ID of the Response to which the item belongs.
  , realtimeServerEventResponseOutputItemAddedOutputUnderscoreindex :: Int -- ^ The index of the output item in the Response.
  , realtimeServerEventResponseOutputItemAddedItem :: RealtimeConversationItem -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseOutputItemAdded where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseOutputItemAdded
instance ToJSON RealtimeServerEventResponseOutputItemAdded where
  toJSON = genericToJSON optionsRealtimeServerEventResponseOutputItemAdded

optionsRealtimeServerEventResponseOutputItemAdded :: Options
optionsRealtimeServerEventResponseOutputItemAdded =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseOutputItemAddedEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseOutputItemAddedType", "type")
      , ("realtimeServerEventResponseOutputItemAddedResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseOutputItemAddedOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseOutputItemAddedItem", "item")
      ]


-- | Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
data RealtimeServerEventResponseOutputItemDone = RealtimeServerEventResponseOutputItemDone
  { realtimeServerEventResponseOutputItemDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseOutputItemDoneType :: Text -- ^ The event type, must be `response.output_item.done`.
  , realtimeServerEventResponseOutputItemDoneResponseUnderscoreid :: Text -- ^ The ID of the Response to which the item belongs.
  , realtimeServerEventResponseOutputItemDoneOutputUnderscoreindex :: Int -- ^ The index of the output item in the Response.
  , realtimeServerEventResponseOutputItemDoneItem :: RealtimeConversationItem -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseOutputItemDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseOutputItemDone
instance ToJSON RealtimeServerEventResponseOutputItemDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseOutputItemDone

optionsRealtimeServerEventResponseOutputItemDone :: Options
optionsRealtimeServerEventResponseOutputItemDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseOutputItemDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseOutputItemDoneType", "type")
      , ("realtimeServerEventResponseOutputItemDoneResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseOutputItemDoneOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseOutputItemDoneItem", "item")
      ]


-- | Returned when the text value of a \&quot;text\&quot; content part is updated.
data RealtimeServerEventResponseTextDelta = RealtimeServerEventResponseTextDelta
  { realtimeServerEventResponseTextDeltaEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseTextDeltaType :: Text -- ^ The event type, must be `response.text.delta`.
  , realtimeServerEventResponseTextDeltaResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseTextDeltaItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseTextDeltaOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseTextDeltaContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseTextDeltaDelta :: Text -- ^ The text delta.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseTextDelta where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseTextDelta
instance ToJSON RealtimeServerEventResponseTextDelta where
  toJSON = genericToJSON optionsRealtimeServerEventResponseTextDelta

optionsRealtimeServerEventResponseTextDelta :: Options
optionsRealtimeServerEventResponseTextDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseTextDeltaEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseTextDeltaType", "type")
      , ("realtimeServerEventResponseTextDeltaResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseTextDeltaItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseTextDeltaOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseTextDeltaContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseTextDeltaDelta", "delta")
      ]


-- | Returned when the text value of a \&quot;text\&quot; content part is done streaming. Also emitted when a Response is interrupted, incomplete, or cancelled. 
data RealtimeServerEventResponseTextDone = RealtimeServerEventResponseTextDone
  { realtimeServerEventResponseTextDoneEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventResponseTextDoneType :: Text -- ^ The event type, must be `response.text.done`.
  , realtimeServerEventResponseTextDoneResponseUnderscoreid :: Text -- ^ The ID of the response.
  , realtimeServerEventResponseTextDoneItemUnderscoreid :: Text -- ^ The ID of the item.
  , realtimeServerEventResponseTextDoneOutputUnderscoreindex :: Int -- ^ The index of the output item in the response.
  , realtimeServerEventResponseTextDoneContentUnderscoreindex :: Int -- ^ The index of the content part in the item's content array.
  , realtimeServerEventResponseTextDoneText :: Text -- ^ The final text content.
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventResponseTextDone where
  parseJSON = genericParseJSON optionsRealtimeServerEventResponseTextDone
instance ToJSON RealtimeServerEventResponseTextDone where
  toJSON = genericToJSON optionsRealtimeServerEventResponseTextDone

optionsRealtimeServerEventResponseTextDone :: Options
optionsRealtimeServerEventResponseTextDone =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventResponseTextDoneEventUnderscoreid", "event_id")
      , ("realtimeServerEventResponseTextDoneType", "type")
      , ("realtimeServerEventResponseTextDoneResponseUnderscoreid", "response_id")
      , ("realtimeServerEventResponseTextDoneItemUnderscoreid", "item_id")
      , ("realtimeServerEventResponseTextDoneOutputUnderscoreindex", "output_index")
      , ("realtimeServerEventResponseTextDoneContentUnderscoreindex", "content_index")
      , ("realtimeServerEventResponseTextDoneText", "text")
      ]


-- | Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
data RealtimeServerEventSessionCreated = RealtimeServerEventSessionCreated
  { realtimeServerEventSessionCreatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventSessionCreatedType :: Text -- ^ The event type, must be `session.created`.
  , realtimeServerEventSessionCreatedSession :: RealtimeSession -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventSessionCreated where
  parseJSON = genericParseJSON optionsRealtimeServerEventSessionCreated
instance ToJSON RealtimeServerEventSessionCreated where
  toJSON = genericToJSON optionsRealtimeServerEventSessionCreated

optionsRealtimeServerEventSessionCreated :: Options
optionsRealtimeServerEventSessionCreated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventSessionCreatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventSessionCreatedType", "type")
      , ("realtimeServerEventSessionCreatedSession", "session")
      ]


-- | Returned when a session is updated with a &#x60;session.update&#x60; event, unless  there is an error. 
data RealtimeServerEventSessionUpdated = RealtimeServerEventSessionUpdated
  { realtimeServerEventSessionUpdatedEventUnderscoreid :: Text -- ^ The unique ID of the server event.
  , realtimeServerEventSessionUpdatedType :: Text -- ^ The event type, must be `session.updated`.
  , realtimeServerEventSessionUpdatedSession :: RealtimeSession -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeServerEventSessionUpdated where
  parseJSON = genericParseJSON optionsRealtimeServerEventSessionUpdated
instance ToJSON RealtimeServerEventSessionUpdated where
  toJSON = genericToJSON optionsRealtimeServerEventSessionUpdated

optionsRealtimeServerEventSessionUpdated :: Options
optionsRealtimeServerEventSessionUpdated =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeServerEventSessionUpdatedEventUnderscoreid", "event_id")
      , ("realtimeServerEventSessionUpdatedType", "type")
      , ("realtimeServerEventSessionUpdatedSession", "session")
      ]


-- | Realtime session object configuration.
data RealtimeSession = RealtimeSession
  { realtimeSessionId :: Maybe Text -- ^ Unique identifier for the session object. 
  , realtimeSessionModalities :: Maybe [Text] -- ^ The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  , realtimeSessionModel :: Maybe RealtimeSessionModel -- ^ 
  , realtimeSessionInstructions :: Maybe Text -- ^ The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  , realtimeSessionVoice :: Maybe Text -- ^ The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  , realtimeSessionInputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeSessionOutputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeSessionInputUnderscoreaudioUnderscoretranscription :: Maybe RealtimeSessionInputAudioTranscription -- ^ 
  , realtimeSessionTurnUnderscoredetection :: Maybe RealtimeSessionTurnDetection -- ^ 
  , realtimeSessionTools :: Maybe [RealtimeResponseCreateParamsToolsInner] -- ^ Tools (functions) available to the model.
  , realtimeSessionToolUnderscorechoice :: Maybe Text -- ^ How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  , realtimeSessionTemperature :: Maybe Double -- ^ Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  , realtimeSessionMaxUnderscoreresponseUnderscoreoutputUnderscoretokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSession where
  parseJSON = genericParseJSON optionsRealtimeSession
instance ToJSON RealtimeSession where
  toJSON = genericToJSON optionsRealtimeSession

optionsRealtimeSession :: Options
optionsRealtimeSession =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionId", "id")
      , ("realtimeSessionModalities", "modalities")
      , ("realtimeSessionModel", "model")
      , ("realtimeSessionInstructions", "instructions")
      , ("realtimeSessionVoice", "voice")
      , ("realtimeSessionInputUnderscoreaudioUnderscoreformat", "input_audio_format")
      , ("realtimeSessionOutputUnderscoreaudioUnderscoreformat", "output_audio_format")
      , ("realtimeSessionInputUnderscoreaudioUnderscoretranscription", "input_audio_transcription")
      , ("realtimeSessionTurnUnderscoredetection", "turn_detection")
      , ("realtimeSessionTools", "tools")
      , ("realtimeSessionToolUnderscorechoice", "tool_choice")
      , ("realtimeSessionTemperature", "temperature")
      , ("realtimeSessionMaxUnderscoreresponseUnderscoreoutputUnderscoretokens", "max_response_output_tokens")
      ]


-- | Realtime session object configuration.
data RealtimeSessionCreateRequest = RealtimeSessionCreateRequest
  { realtimeSessionCreateRequestModalities :: Maybe [Text] -- ^ The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  , realtimeSessionCreateRequestModel :: Text -- ^ The Realtime model used for this session. 
  , realtimeSessionCreateRequestInstructions :: Maybe Text -- ^ The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  , realtimeSessionCreateRequestVoice :: Maybe Text -- ^ The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  , realtimeSessionCreateRequestInputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeSessionCreateRequestOutputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeSessionCreateRequestInputUnderscoreaudioUnderscoretranscription :: Maybe RealtimeSessionInputAudioTranscription -- ^ 
  , realtimeSessionCreateRequestTurnUnderscoredetection :: Maybe RealtimeSessionCreateRequestTurnDetection -- ^ 
  , realtimeSessionCreateRequestTools :: Maybe [RealtimeResponseCreateParamsToolsInner] -- ^ Tools (functions) available to the model.
  , realtimeSessionCreateRequestToolUnderscorechoice :: Maybe Text -- ^ How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  , realtimeSessionCreateRequestTemperature :: Maybe Double -- ^ Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  , realtimeSessionCreateRequestMaxUnderscoreresponseUnderscoreoutputUnderscoretokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionCreateRequest where
  parseJSON = genericParseJSON optionsRealtimeSessionCreateRequest
instance ToJSON RealtimeSessionCreateRequest where
  toJSON = genericToJSON optionsRealtimeSessionCreateRequest

optionsRealtimeSessionCreateRequest :: Options
optionsRealtimeSessionCreateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionCreateRequestModalities", "modalities")
      , ("realtimeSessionCreateRequestModel", "model")
      , ("realtimeSessionCreateRequestInstructions", "instructions")
      , ("realtimeSessionCreateRequestVoice", "voice")
      , ("realtimeSessionCreateRequestInputUnderscoreaudioUnderscoreformat", "input_audio_format")
      , ("realtimeSessionCreateRequestOutputUnderscoreaudioUnderscoreformat", "output_audio_format")
      , ("realtimeSessionCreateRequestInputUnderscoreaudioUnderscoretranscription", "input_audio_transcription")
      , ("realtimeSessionCreateRequestTurnUnderscoredetection", "turn_detection")
      , ("realtimeSessionCreateRequestTools", "tools")
      , ("realtimeSessionCreateRequestToolUnderscorechoice", "tool_choice")
      , ("realtimeSessionCreateRequestTemperature", "temperature")
      , ("realtimeSessionCreateRequestMaxUnderscoreresponseUnderscoreoutputUnderscoretokens", "max_response_output_tokens")
      ]


-- | Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
data RealtimeSessionCreateRequestTurnDetection = RealtimeSessionCreateRequestTurnDetection
  { realtimeSessionCreateRequestTurnDetectionType :: Maybe Text -- ^ Type of turn detection, only `server_vad` is currently supported. 
  , realtimeSessionCreateRequestTurnDetectionThreshold :: Maybe Double -- ^ Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  , realtimeSessionCreateRequestTurnDetectionPrefixUnderscorepaddingUnderscorems :: Maybe Int -- ^ Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  , realtimeSessionCreateRequestTurnDetectionSilenceUnderscoredurationUnderscorems :: Maybe Int -- ^ Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  , realtimeSessionCreateRequestTurnDetectionCreateUnderscoreresponse :: Maybe Bool -- ^ Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionCreateRequestTurnDetection where
  parseJSON = genericParseJSON optionsRealtimeSessionCreateRequestTurnDetection
instance ToJSON RealtimeSessionCreateRequestTurnDetection where
  toJSON = genericToJSON optionsRealtimeSessionCreateRequestTurnDetection

optionsRealtimeSessionCreateRequestTurnDetection :: Options
optionsRealtimeSessionCreateRequestTurnDetection =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionCreateRequestTurnDetectionType", "type")
      , ("realtimeSessionCreateRequestTurnDetectionThreshold", "threshold")
      , ("realtimeSessionCreateRequestTurnDetectionPrefixUnderscorepaddingUnderscorems", "prefix_padding_ms")
      , ("realtimeSessionCreateRequestTurnDetectionSilenceUnderscoredurationUnderscorems", "silence_duration_ms")
      , ("realtimeSessionCreateRequestTurnDetectionCreateUnderscoreresponse", "create_response")
      ]


-- | A new Realtime session configuration, with an ephermeral key. Default TTL for keys is one minute. 
data RealtimeSessionCreateResponse = RealtimeSessionCreateResponse
  { realtimeSessionCreateResponseClientUnderscoresecret :: Maybe RealtimeSessionCreateResponseClientSecret -- ^ 
  , realtimeSessionCreateResponseModalities :: Maybe [Text] -- ^ The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  , realtimeSessionCreateResponseInstructions :: Maybe Text -- ^ The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  , realtimeSessionCreateResponseVoice :: Maybe Text -- ^ The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  , realtimeSessionCreateResponseInputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeSessionCreateResponseOutputUnderscoreaudioUnderscoreformat :: Maybe Text -- ^ The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  , realtimeSessionCreateResponseInputUnderscoreaudioUnderscoretranscription :: Maybe RealtimeSessionInputAudioTranscription -- ^ 
  , realtimeSessionCreateResponseTurnUnderscoredetection :: Maybe RealtimeSessionCreateResponseTurnDetection -- ^ 
  , realtimeSessionCreateResponseTools :: Maybe [RealtimeResponseCreateParamsToolsInner] -- ^ Tools (functions) available to the model.
  , realtimeSessionCreateResponseToolUnderscorechoice :: Maybe Text -- ^ How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  , realtimeSessionCreateResponseTemperature :: Maybe Double -- ^ Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  , realtimeSessionCreateResponseMaxUnderscoreresponseUnderscoreoutputUnderscoretokens :: Maybe RealtimeResponseCreateParamsMaxResponseOutputTokens -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionCreateResponse where
  parseJSON = genericParseJSON optionsRealtimeSessionCreateResponse
instance ToJSON RealtimeSessionCreateResponse where
  toJSON = genericToJSON optionsRealtimeSessionCreateResponse

optionsRealtimeSessionCreateResponse :: Options
optionsRealtimeSessionCreateResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionCreateResponseClientUnderscoresecret", "client_secret")
      , ("realtimeSessionCreateResponseModalities", "modalities")
      , ("realtimeSessionCreateResponseInstructions", "instructions")
      , ("realtimeSessionCreateResponseVoice", "voice")
      , ("realtimeSessionCreateResponseInputUnderscoreaudioUnderscoreformat", "input_audio_format")
      , ("realtimeSessionCreateResponseOutputUnderscoreaudioUnderscoreformat", "output_audio_format")
      , ("realtimeSessionCreateResponseInputUnderscoreaudioUnderscoretranscription", "input_audio_transcription")
      , ("realtimeSessionCreateResponseTurnUnderscoredetection", "turn_detection")
      , ("realtimeSessionCreateResponseTools", "tools")
      , ("realtimeSessionCreateResponseToolUnderscorechoice", "tool_choice")
      , ("realtimeSessionCreateResponseTemperature", "temperature")
      , ("realtimeSessionCreateResponseMaxUnderscoreresponseUnderscoreoutputUnderscoretokens", "max_response_output_tokens")
      ]


-- | Ephemeral key returned by the API.
data RealtimeSessionCreateResponseClientSecret = RealtimeSessionCreateResponseClientSecret
  { realtimeSessionCreateResponseClientSecretValue :: Maybe Text -- ^ Ephemeral key usable in client environments to authenticate connections to the Realtime API. Use this in client-side environments rather than a standard API token, which should only be used server-side. 
  , realtimeSessionCreateResponseClientSecretExpiresUnderscoreat :: Maybe Int -- ^ Timestamp for when the token expires. Currently, all tokens expire after one minute. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionCreateResponseClientSecret where
  parseJSON = genericParseJSON optionsRealtimeSessionCreateResponseClientSecret
instance ToJSON RealtimeSessionCreateResponseClientSecret where
  toJSON = genericToJSON optionsRealtimeSessionCreateResponseClientSecret

optionsRealtimeSessionCreateResponseClientSecret :: Options
optionsRealtimeSessionCreateResponseClientSecret =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionCreateResponseClientSecretValue", "value")
      , ("realtimeSessionCreateResponseClientSecretExpiresUnderscoreat", "expires_at")
      ]


-- | Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
data RealtimeSessionCreateResponseTurnDetection = RealtimeSessionCreateResponseTurnDetection
  { realtimeSessionCreateResponseTurnDetectionType :: Maybe Text -- ^ Type of turn detection, only `server_vad` is currently supported. 
  , realtimeSessionCreateResponseTurnDetectionThreshold :: Maybe Double -- ^ Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  , realtimeSessionCreateResponseTurnDetectionPrefixUnderscorepaddingUnderscorems :: Maybe Int -- ^ Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  , realtimeSessionCreateResponseTurnDetectionSilenceUnderscoredurationUnderscorems :: Maybe Int -- ^ Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionCreateResponseTurnDetection where
  parseJSON = genericParseJSON optionsRealtimeSessionCreateResponseTurnDetection
instance ToJSON RealtimeSessionCreateResponseTurnDetection where
  toJSON = genericToJSON optionsRealtimeSessionCreateResponseTurnDetection

optionsRealtimeSessionCreateResponseTurnDetection :: Options
optionsRealtimeSessionCreateResponseTurnDetection =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionCreateResponseTurnDetectionType", "type")
      , ("realtimeSessionCreateResponseTurnDetectionThreshold", "threshold")
      , ("realtimeSessionCreateResponseTurnDetectionPrefixUnderscorepaddingUnderscorems", "prefix_padding_ms")
      , ("realtimeSessionCreateResponseTurnDetectionSilenceUnderscoredurationUnderscorems", "silence_duration_ms")
      ]


-- | Configuration for input audio transcription, defaults to off and can be  set to &#x60;null&#x60; to turn off once on. Input audio transcription is not native  to the model, since the model consumes audio directly. Transcription runs  asynchronously through Whisper and should be treated as rough guidance  rather than the representation understood by the model. 
data RealtimeSessionInputAudioTranscription = RealtimeSessionInputAudioTranscription
  { realtimeSessionInputAudioTranscriptionModel :: Maybe Text -- ^ The model to use for transcription, `whisper-1` is the only currently  supported model. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionInputAudioTranscription where
  parseJSON = genericParseJSON optionsRealtimeSessionInputAudioTranscription
instance ToJSON RealtimeSessionInputAudioTranscription where
  toJSON = genericToJSON optionsRealtimeSessionInputAudioTranscription

optionsRealtimeSessionInputAudioTranscription :: Options
optionsRealtimeSessionInputAudioTranscription =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionInputAudioTranscriptionModel", "model")
      ]


-- | The Realtime model used for this session. 
data RealtimeSessionModel = RealtimeSessionModel
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionModel where
  parseJSON = genericParseJSON optionsRealtimeSessionModel
instance ToJSON RealtimeSessionModel where
  toJSON = genericToJSON optionsRealtimeSessionModel

optionsRealtimeSessionModel :: Options
optionsRealtimeSessionModel =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | Configuration for turn detection. Can be set to &#x60;null&#x60; to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
data RealtimeSessionTurnDetection = RealtimeSessionTurnDetection
  { realtimeSessionTurnDetectionType :: Maybe Text -- ^ Type of turn detection, only `server_vad` is currently supported. 
  , realtimeSessionTurnDetectionThreshold :: Maybe Double -- ^ Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
  , realtimeSessionTurnDetectionPrefixUnderscorepaddingUnderscorems :: Maybe Int -- ^ Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
  , realtimeSessionTurnDetectionSilenceUnderscoredurationUnderscorems :: Maybe Int -- ^ Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
  } deriving (Show, Eq, Generic)

instance FromJSON RealtimeSessionTurnDetection where
  parseJSON = genericParseJSON optionsRealtimeSessionTurnDetection
instance ToJSON RealtimeSessionTurnDetection where
  toJSON = genericToJSON optionsRealtimeSessionTurnDetection

optionsRealtimeSessionTurnDetection :: Options
optionsRealtimeSessionTurnDetection =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("realtimeSessionTurnDetectionType", "type")
      , ("realtimeSessionTurnDetectionThreshold", "threshold")
      , ("realtimeSessionTurnDetectionPrefixUnderscorepaddingUnderscorems", "prefix_padding_ms")
      , ("realtimeSessionTurnDetectionSilenceUnderscoredurationUnderscorems", "silence_duration_ms")
      ]


-- | 
data ResponseFormatJsonObject = ResponseFormatJsonObject
  { responseFormatJsonObjectType :: Text -- ^ The type of response format being defined: `json_object`
  } deriving (Show, Eq, Generic)

instance FromJSON ResponseFormatJsonObject where
  parseJSON = genericParseJSON optionsResponseFormatJsonObject
instance ToJSON ResponseFormatJsonObject where
  toJSON = genericToJSON optionsResponseFormatJsonObject

optionsResponseFormatJsonObject :: Options
optionsResponseFormatJsonObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("responseFormatJsonObjectType", "type")
      ]


-- | 
data ResponseFormatJsonSchema = ResponseFormatJsonSchema
  { responseFormatJsonSchemaType :: Text -- ^ The type of response format being defined: `json_schema`
  , responseFormatJsonSchemaJsonUnderscoreschema :: ResponseFormatJsonSchemaJsonSchema -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ResponseFormatJsonSchema where
  parseJSON = genericParseJSON optionsResponseFormatJsonSchema
instance ToJSON ResponseFormatJsonSchema where
  toJSON = genericToJSON optionsResponseFormatJsonSchema

optionsResponseFormatJsonSchema :: Options
optionsResponseFormatJsonSchema =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("responseFormatJsonSchemaType", "type")
      , ("responseFormatJsonSchemaJsonUnderscoreschema", "json_schema")
      ]


-- | 
data ResponseFormatJsonSchemaJsonSchema = ResponseFormatJsonSchemaJsonSchema
  { responseFormatJsonSchemaJsonSchemaDescription :: Maybe Text -- ^ A description of what the response format is for, used by the model to determine how to respond in the format.
  , responseFormatJsonSchemaJsonSchemaName :: Text -- ^ The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
  , responseFormatJsonSchemaJsonSchemaSchema :: Maybe (Map.Map String Value) -- ^ The schema for the response format, described as a JSON Schema object.
  , responseFormatJsonSchemaJsonSchemaStrict :: Maybe Bool -- ^ Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
  } deriving (Show, Eq, Generic)

instance FromJSON ResponseFormatJsonSchemaJsonSchema where
  parseJSON = genericParseJSON optionsResponseFormatJsonSchemaJsonSchema
instance ToJSON ResponseFormatJsonSchemaJsonSchema where
  toJSON = genericToJSON optionsResponseFormatJsonSchemaJsonSchema

optionsResponseFormatJsonSchemaJsonSchema :: Options
optionsResponseFormatJsonSchemaJsonSchema =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("responseFormatJsonSchemaJsonSchemaDescription", "description")
      , ("responseFormatJsonSchemaJsonSchemaName", "name")
      , ("responseFormatJsonSchemaJsonSchemaSchema", "schema")
      , ("responseFormatJsonSchemaJsonSchemaStrict", "strict")
      ]


-- | 
data ResponseFormatText = ResponseFormatText
  { responseFormatTextType :: Text -- ^ The type of response format being defined: `text`
  } deriving (Show, Eq, Generic)

instance FromJSON ResponseFormatText where
  parseJSON = genericParseJSON optionsResponseFormatText
instance ToJSON ResponseFormatText where
  toJSON = genericToJSON optionsResponseFormatText

optionsResponseFormatText :: Options
optionsResponseFormatText =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("responseFormatTextType", "type")
      ]


-- | Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
data RunCompletionUsage = RunCompletionUsage
  { runCompletionUsageCompletionUnderscoretokens :: Int -- ^ Number of completion tokens used over the course of the run.
  , runCompletionUsagePromptUnderscoretokens :: Int -- ^ Number of prompt tokens used over the course of the run.
  , runCompletionUsageTotalUnderscoretokens :: Int -- ^ Total number of tokens used (prompt + completion).
  } deriving (Show, Eq, Generic)

instance FromJSON RunCompletionUsage where
  parseJSON = genericParseJSON optionsRunCompletionUsage
instance ToJSON RunCompletionUsage where
  toJSON = genericToJSON optionsRunCompletionUsage

optionsRunCompletionUsage :: Options
optionsRunCompletionUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runCompletionUsageCompletionUnderscoretokens", "completion_tokens")
      , ("runCompletionUsagePromptUnderscoretokens", "prompt_tokens")
      , ("runCompletionUsageTotalUnderscoretokens", "total_tokens")
      ]


-- | Represents an execution run on a [thread](/docs/api-reference/threads).
data RunObject = RunObject
  { runObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , runObjectObject :: Text -- ^ The object type, which is always `thread.run`.
  , runObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run was created.
  , runObjectThreadUnderscoreid :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
  , runObjectAssistantUnderscoreid :: Text -- ^ The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
  , runObjectStatus :: Text -- ^ The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
  , runObjectRequiredUnderscoreaction :: RunObjectRequiredAction -- ^ 
  , runObjectLastUnderscoreerror :: RunObjectLastError -- ^ 
  , runObjectExpiresUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run will expire.
  , runObjectStartedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run was started.
  , runObjectCancelledUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run was cancelled.
  , runObjectFailedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run failed.
  , runObjectCompletedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run was completed.
  , runObjectIncompleteUnderscoredetails :: RunObjectIncompleteDetails -- ^ 
  , runObjectModel :: Text -- ^ The model that the [assistant](/docs/api-reference/assistants) used for this run.
  , runObjectInstructions :: Text -- ^ The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
  , runObjectTools :: [AssistantObjectToolsInner] -- ^ The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
  , runObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , runObjectUsage :: RunCompletionUsage -- ^ 
  , runObjectTemperature :: Maybe Double -- ^ The sampling temperature used for this run. If not set, defaults to 1.
  , runObjectTopUnderscorep :: Maybe Double -- ^ The nucleus sampling value used for this run. If not set, defaults to 1.
  , runObjectMaxUnderscorepromptUnderscoretokens :: Int -- ^ The maximum number of prompt tokens specified to have been used over the course of the run. 
  , runObjectMaxUnderscorecompletionUnderscoretokens :: Int -- ^ The maximum number of completion tokens specified to have been used over the course of the run. 
  , runObjectTruncationUnderscorestrategy :: TruncationObject -- ^ 
  , runObjectToolUnderscorechoice :: AssistantsApiToolChoiceOption -- ^ 
  , runObjectParallelUnderscoretoolUnderscorecalls :: Bool -- ^ Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
  , runObjectResponseUnderscoreformat :: AssistantsApiResponseFormatOption -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunObject where
  parseJSON = genericParseJSON optionsRunObject
instance ToJSON RunObject where
  toJSON = genericToJSON optionsRunObject

optionsRunObject :: Options
optionsRunObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runObjectId", "id")
      , ("runObjectObject", "object")
      , ("runObjectCreatedUnderscoreat", "created_at")
      , ("runObjectThreadUnderscoreid", "thread_id")
      , ("runObjectAssistantUnderscoreid", "assistant_id")
      , ("runObjectStatus", "status")
      , ("runObjectRequiredUnderscoreaction", "required_action")
      , ("runObjectLastUnderscoreerror", "last_error")
      , ("runObjectExpiresUnderscoreat", "expires_at")
      , ("runObjectStartedUnderscoreat", "started_at")
      , ("runObjectCancelledUnderscoreat", "cancelled_at")
      , ("runObjectFailedUnderscoreat", "failed_at")
      , ("runObjectCompletedUnderscoreat", "completed_at")
      , ("runObjectIncompleteUnderscoredetails", "incomplete_details")
      , ("runObjectModel", "model")
      , ("runObjectInstructions", "instructions")
      , ("runObjectTools", "tools")
      , ("runObjectMetadata", "metadata")
      , ("runObjectUsage", "usage")
      , ("runObjectTemperature", "temperature")
      , ("runObjectTopUnderscorep", "top_p")
      , ("runObjectMaxUnderscorepromptUnderscoretokens", "max_prompt_tokens")
      , ("runObjectMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("runObjectTruncationUnderscorestrategy", "truncation_strategy")
      , ("runObjectToolUnderscorechoice", "tool_choice")
      , ("runObjectParallelUnderscoretoolUnderscorecalls", "parallel_tool_calls")
      , ("runObjectResponseUnderscoreformat", "response_format")
      ]


-- | Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
data RunObjectIncompleteDetails = RunObjectIncompleteDetails
  { runObjectIncompleteDetailsReason :: Maybe Text -- ^ The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
  } deriving (Show, Eq, Generic)

instance FromJSON RunObjectIncompleteDetails where
  parseJSON = genericParseJSON optionsRunObjectIncompleteDetails
instance ToJSON RunObjectIncompleteDetails where
  toJSON = genericToJSON optionsRunObjectIncompleteDetails

optionsRunObjectIncompleteDetails :: Options
optionsRunObjectIncompleteDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runObjectIncompleteDetailsReason", "reason")
      ]


-- | The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
data RunObjectLastError = RunObjectLastError
  { runObjectLastErrorCode :: Text -- ^ One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
  , runObjectLastErrorMessage :: Text -- ^ A human-readable description of the error.
  } deriving (Show, Eq, Generic)

instance FromJSON RunObjectLastError where
  parseJSON = genericParseJSON optionsRunObjectLastError
instance ToJSON RunObjectLastError where
  toJSON = genericToJSON optionsRunObjectLastError

optionsRunObjectLastError :: Options
optionsRunObjectLastError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runObjectLastErrorCode", "code")
      , ("runObjectLastErrorMessage", "message")
      ]


-- | Details on the action required to continue the run. Will be &#x60;null&#x60; if no action is required.
data RunObjectRequiredAction = RunObjectRequiredAction
  { runObjectRequiredActionType :: Text -- ^ For now, this is always `submit_tool_outputs`.
  , runObjectRequiredActionSubmitUnderscoretoolUnderscoreoutputs :: RunObjectRequiredActionSubmitToolOutputs -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunObjectRequiredAction where
  parseJSON = genericParseJSON optionsRunObjectRequiredAction
instance ToJSON RunObjectRequiredAction where
  toJSON = genericToJSON optionsRunObjectRequiredAction

optionsRunObjectRequiredAction :: Options
optionsRunObjectRequiredAction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runObjectRequiredActionType", "type")
      , ("runObjectRequiredActionSubmitUnderscoretoolUnderscoreoutputs", "submit_tool_outputs")
      ]


-- | Details on the tool outputs needed for this run to continue.
data RunObjectRequiredActionSubmitToolOutputs = RunObjectRequiredActionSubmitToolOutputs
  { runObjectRequiredActionSubmitToolOutputsToolUnderscorecalls :: [RunToolCallObject] -- ^ A list of the relevant tool calls.
  } deriving (Show, Eq, Generic)

instance FromJSON RunObjectRequiredActionSubmitToolOutputs where
  parseJSON = genericParseJSON optionsRunObjectRequiredActionSubmitToolOutputs
instance ToJSON RunObjectRequiredActionSubmitToolOutputs where
  toJSON = genericToJSON optionsRunObjectRequiredActionSubmitToolOutputs

optionsRunObjectRequiredActionSubmitToolOutputs :: Options
optionsRunObjectRequiredActionSubmitToolOutputs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runObjectRequiredActionSubmitToolOutputsToolUnderscorecalls", "tool_calls")
      ]


-- | Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
data RunStepCompletionUsage = RunStepCompletionUsage
  { runStepCompletionUsageCompletionUnderscoretokens :: Int -- ^ Number of completion tokens used over the course of the run step.
  , runStepCompletionUsagePromptUnderscoretokens :: Int -- ^ Number of prompt tokens used over the course of the run step.
  , runStepCompletionUsageTotalUnderscoretokens :: Int -- ^ Total number of tokens used (prompt + completion).
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepCompletionUsage where
  parseJSON = genericParseJSON optionsRunStepCompletionUsage
instance ToJSON RunStepCompletionUsage where
  toJSON = genericToJSON optionsRunStepCompletionUsage

optionsRunStepCompletionUsage :: Options
optionsRunStepCompletionUsage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepCompletionUsageCompletionUnderscoretokens", "completion_tokens")
      , ("runStepCompletionUsagePromptUnderscoretokens", "prompt_tokens")
      , ("runStepCompletionUsageTotalUnderscoretokens", "total_tokens")
      ]


-- | Represents a run step delta i.e. any changed fields on a run step during streaming. 
data RunStepDeltaObject = RunStepDeltaObject
  { runStepDeltaObjectId :: Text -- ^ The identifier of the run step, which can be referenced in API endpoints.
  , runStepDeltaObjectObject :: Text -- ^ The object type, which is always `thread.run.step.delta`.
  , runStepDeltaObjectDelta :: RunStepDeltaObjectDelta -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaObject where
  parseJSON = genericParseJSON optionsRunStepDeltaObject
instance ToJSON RunStepDeltaObject where
  toJSON = genericToJSON optionsRunStepDeltaObject

optionsRunStepDeltaObject :: Options
optionsRunStepDeltaObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaObjectId", "id")
      , ("runStepDeltaObjectObject", "object")
      , ("runStepDeltaObjectDelta", "delta")
      ]


-- | The delta containing the fields that have changed on the run step.
data RunStepDeltaObjectDelta = RunStepDeltaObjectDelta
  { runStepDeltaObjectDeltaStepUnderscoredetails :: Maybe RunStepDeltaObjectDeltaStepDetails -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaObjectDelta where
  parseJSON = genericParseJSON optionsRunStepDeltaObjectDelta
instance ToJSON RunStepDeltaObjectDelta where
  toJSON = genericToJSON optionsRunStepDeltaObjectDelta

optionsRunStepDeltaObjectDelta :: Options
optionsRunStepDeltaObjectDelta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaObjectDeltaStepUnderscoredetails", "step_details")
      ]


-- | The details of the run step.
data RunStepDeltaObjectDeltaStepDetails = RunStepDeltaObjectDeltaStepDetails
  { runStepDeltaObjectDeltaStepDetailsType :: Text -- ^ Always `message_creation`.
  , runStepDeltaObjectDeltaStepDetailsMessageUnderscorecreation :: Maybe RunStepDeltaStepDetailsMessageCreationObjectMessageCreation -- ^ 
  , runStepDeltaObjectDeltaStepDetailsToolUnderscorecalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaObjectDeltaStepDetails where
  parseJSON = genericParseJSON optionsRunStepDeltaObjectDeltaStepDetails
instance ToJSON RunStepDeltaObjectDeltaStepDetails where
  toJSON = genericToJSON optionsRunStepDeltaObjectDeltaStepDetails

optionsRunStepDeltaObjectDeltaStepDetails :: Options
optionsRunStepDeltaObjectDeltaStepDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaObjectDeltaStepDetailsType", "type")
      , ("runStepDeltaObjectDeltaStepDetailsMessageUnderscorecreation", "message_creation")
      , ("runStepDeltaObjectDeltaStepDetailsToolUnderscorecalls", "tool_calls")
      ]


-- | Details of the message creation by the run step.
data RunStepDeltaStepDetailsMessageCreationObject = RunStepDeltaStepDetailsMessageCreationObject
  { runStepDeltaStepDetailsMessageCreationObjectType :: Text -- ^ Always `message_creation`.
  , runStepDeltaStepDetailsMessageCreationObjectMessageUnderscorecreation :: Maybe RunStepDeltaStepDetailsMessageCreationObjectMessageCreation -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsMessageCreationObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsMessageCreationObject
instance ToJSON RunStepDeltaStepDetailsMessageCreationObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsMessageCreationObject

optionsRunStepDeltaStepDetailsMessageCreationObject :: Options
optionsRunStepDeltaStepDetailsMessageCreationObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsMessageCreationObjectType", "type")
      , ("runStepDeltaStepDetailsMessageCreationObjectMessageUnderscorecreation", "message_creation")
      ]


-- | 
data RunStepDeltaStepDetailsMessageCreationObjectMessageCreation = RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
  { runStepDeltaStepDetailsMessageCreationObjectMessageCreationMessageUnderscoreid :: Maybe Text -- ^ The ID of the message that was created by this run step.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsMessageCreationObjectMessageCreation where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsMessageCreationObjectMessageCreation
instance ToJSON RunStepDeltaStepDetailsMessageCreationObjectMessageCreation where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsMessageCreationObjectMessageCreation

optionsRunStepDeltaStepDetailsMessageCreationObjectMessageCreation :: Options
optionsRunStepDeltaStepDetailsMessageCreationObjectMessageCreation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsMessageCreationObjectMessageCreationMessageUnderscoreid", "message_id")
      ]


-- | Details of the Code Interpreter tool call the run step was involved in.
data RunStepDeltaStepDetailsToolCallsCodeObject = RunStepDeltaStepDetailsToolCallsCodeObject
  { runStepDeltaStepDetailsToolCallsCodeObjectIndex :: Int -- ^ The index of the tool call in the tool calls array.
  , runStepDeltaStepDetailsToolCallsCodeObjectId :: Maybe Text -- ^ The ID of the tool call.
  , runStepDeltaStepDetailsToolCallsCodeObjectType :: Text -- ^ The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  , runStepDeltaStepDetailsToolCallsCodeObjectCodeUnderscoreinterpreter :: Maybe RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsCodeObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsCodeObject
instance ToJSON RunStepDeltaStepDetailsToolCallsCodeObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsCodeObject

optionsRunStepDeltaStepDetailsToolCallsCodeObject :: Options
optionsRunStepDeltaStepDetailsToolCallsCodeObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsCodeObjectIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectId", "id")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectCodeUnderscoreinterpreter", "code_interpreter")
      ]


-- | The Code Interpreter tool call definition.
data RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
  { runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterInput :: Maybe Text -- ^ The input to the Code Interpreter tool call.
  , runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputs :: Maybe [RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] -- ^ The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
instance ToJSON RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter

optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter :: Options
optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterInput", "input")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputs", "outputs")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
  { runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerIndex :: Int -- ^ The index of the output in the outputs array.
  , runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType :: Text -- ^ Always `logs`.
  , runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs :: Maybe Text -- ^ The text output from the Code Interpreter tool call.
  , runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage :: Maybe RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
instance ToJSON RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner :: Options
optionsRunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType", "type")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs", "logs")
      , ("runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage", "image")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsCodeOutputImageObject = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
  { runStepDeltaStepDetailsToolCallsCodeOutputImageObjectIndex :: Int -- ^ The index of the output in the outputs array.
  , runStepDeltaStepDetailsToolCallsCodeOutputImageObjectType :: Text -- ^ Always `image`.
  , runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage :: Maybe RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsCodeOutputImageObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObject
instance ToJSON RunStepDeltaStepDetailsToolCallsCodeOutputImageObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObject

optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObject :: Options
optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsCodeOutputImageObjectIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsCodeOutputImageObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage", "image")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage = RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
  { runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageFileUnderscoreid :: Maybe Text -- ^ The [file](/docs/api-reference/files) ID of the image.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage
instance ToJSON RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage

optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage :: Options
optionsRunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImageFileUnderscoreid", "file_id")
      ]


-- | Text output from the Code Interpreter tool call as part of a run step.
data RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject = RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
  { runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectIndex :: Int -- ^ The index of the output in the outputs array.
  , runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectType :: Text -- ^ Always `logs`.
  , runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectLogs :: Maybe Text -- ^ The text output from the Code Interpreter tool call.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
instance ToJSON RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject

optionsRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject :: Options
optionsRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsCodeOutputLogsObjectLogs", "logs")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsFileSearchObject = RunStepDeltaStepDetailsToolCallsFileSearchObject
  { runStepDeltaStepDetailsToolCallsFileSearchObjectIndex :: Int -- ^ The index of the tool call in the tool calls array.
  , runStepDeltaStepDetailsToolCallsFileSearchObjectId :: Maybe Text -- ^ The ID of the tool call object.
  , runStepDeltaStepDetailsToolCallsFileSearchObjectType :: Text -- ^ The type of tool call. This is always going to be `file_search` for this type of tool call.
  , runStepDeltaStepDetailsToolCallsFileSearchObjectFileUnderscoresearch :: Object -- ^ For now, this is always going to be an empty object.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsFileSearchObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsFileSearchObject
instance ToJSON RunStepDeltaStepDetailsToolCallsFileSearchObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsFileSearchObject

optionsRunStepDeltaStepDetailsToolCallsFileSearchObject :: Options
optionsRunStepDeltaStepDetailsToolCallsFileSearchObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsFileSearchObjectIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsFileSearchObjectId", "id")
      , ("runStepDeltaStepDetailsToolCallsFileSearchObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsFileSearchObjectFileUnderscoresearch", "file_search")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsFunctionObject = RunStepDeltaStepDetailsToolCallsFunctionObject
  { runStepDeltaStepDetailsToolCallsFunctionObjectIndex :: Int -- ^ The index of the tool call in the tool calls array.
  , runStepDeltaStepDetailsToolCallsFunctionObjectId :: Maybe Text -- ^ The ID of the tool call object.
  , runStepDeltaStepDetailsToolCallsFunctionObjectType :: Text -- ^ The type of tool call. This is always going to be `function` for this type of tool call.
  , runStepDeltaStepDetailsToolCallsFunctionObjectFunction :: Maybe RunStepDeltaStepDetailsToolCallsFunctionObjectFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsFunctionObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsFunctionObject
instance ToJSON RunStepDeltaStepDetailsToolCallsFunctionObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsFunctionObject

optionsRunStepDeltaStepDetailsToolCallsFunctionObject :: Options
optionsRunStepDeltaStepDetailsToolCallsFunctionObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsFunctionObjectIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsFunctionObjectId", "id")
      , ("runStepDeltaStepDetailsToolCallsFunctionObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsFunctionObjectFunction", "function")
      ]


-- | The definition of the function that was called.
data RunStepDeltaStepDetailsToolCallsFunctionObjectFunction = RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
  { runStepDeltaStepDetailsToolCallsFunctionObjectFunctionName :: Maybe Text -- ^ The name of the function.
  , runStepDeltaStepDetailsToolCallsFunctionObjectFunctionArguments :: Maybe Text -- ^ The arguments passed to the function.
  , runStepDeltaStepDetailsToolCallsFunctionObjectFunctionOutput :: Maybe Text -- ^ The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsFunctionObjectFunction where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsFunctionObjectFunction
instance ToJSON RunStepDeltaStepDetailsToolCallsFunctionObjectFunction where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsFunctionObjectFunction

optionsRunStepDeltaStepDetailsToolCallsFunctionObjectFunction :: Options
optionsRunStepDeltaStepDetailsToolCallsFunctionObjectFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsFunctionObjectFunctionName", "name")
      , ("runStepDeltaStepDetailsToolCallsFunctionObjectFunctionArguments", "arguments")
      , ("runStepDeltaStepDetailsToolCallsFunctionObjectFunctionOutput", "output")
      ]


-- | Details of the tool call.
data RunStepDeltaStepDetailsToolCallsObject = RunStepDeltaStepDetailsToolCallsObject
  { runStepDeltaStepDetailsToolCallsObjectType :: Text -- ^ Always `tool_calls`.
  , runStepDeltaStepDetailsToolCallsObjectToolUnderscorecalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsObject
instance ToJSON RunStepDeltaStepDetailsToolCallsObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsObject

optionsRunStepDeltaStepDetailsToolCallsObject :: Options
optionsRunStepDeltaStepDetailsToolCallsObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsObjectToolUnderscorecalls", "tool_calls")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsObjectToolCallsInner = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
  { runStepDeltaStepDetailsToolCallsObjectToolCallsInnerIndex :: Int -- ^ The index of the tool call in the tool calls array.
  , runStepDeltaStepDetailsToolCallsObjectToolCallsInnerId :: Maybe Text -- ^ The ID of the tool call object.
  , runStepDeltaStepDetailsToolCallsObjectToolCallsInnerType :: Text -- ^ The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  , runStepDeltaStepDetailsToolCallsObjectToolCallsInnerCodeUnderscoreinterpreter :: Maybe RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter -- ^ 
  , runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFileUnderscoresearch :: Object -- ^ For now, this is always going to be an empty object.
  , runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFunction :: Maybe RunStepDeltaStepDetailsToolCallsFunctionObjectFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsObjectToolCallsInner where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner
instance ToJSON RunStepDeltaStepDetailsToolCallsObjectToolCallsInner where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner

optionsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner :: Options
optionsRunStepDeltaStepDetailsToolCallsObjectToolCallsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerId", "id")
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerType", "type")
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerCodeUnderscoreinterpreter", "code_interpreter")
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFileUnderscoresearch", "file_search")
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFunction", "function")
      ]


-- | Details of the message creation by the run step.
data RunStepDetailsMessageCreationObject = RunStepDetailsMessageCreationObject
  { runStepDetailsMessageCreationObjectType :: Text -- ^ Always `message_creation`.
  , runStepDetailsMessageCreationObjectMessageUnderscorecreation :: RunStepDetailsMessageCreationObjectMessageCreation -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsMessageCreationObject where
  parseJSON = genericParseJSON optionsRunStepDetailsMessageCreationObject
instance ToJSON RunStepDetailsMessageCreationObject where
  toJSON = genericToJSON optionsRunStepDetailsMessageCreationObject

optionsRunStepDetailsMessageCreationObject :: Options
optionsRunStepDetailsMessageCreationObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsMessageCreationObjectType", "type")
      , ("runStepDetailsMessageCreationObjectMessageUnderscorecreation", "message_creation")
      ]


-- | 
data RunStepDetailsMessageCreationObjectMessageCreation = RunStepDetailsMessageCreationObjectMessageCreation
  { runStepDetailsMessageCreationObjectMessageCreationMessageUnderscoreid :: Text -- ^ The ID of the message that was created by this run step.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsMessageCreationObjectMessageCreation where
  parseJSON = genericParseJSON optionsRunStepDetailsMessageCreationObjectMessageCreation
instance ToJSON RunStepDetailsMessageCreationObjectMessageCreation where
  toJSON = genericToJSON optionsRunStepDetailsMessageCreationObjectMessageCreation

optionsRunStepDetailsMessageCreationObjectMessageCreation :: Options
optionsRunStepDetailsMessageCreationObjectMessageCreation =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsMessageCreationObjectMessageCreationMessageUnderscoreid", "message_id")
      ]


-- | Details of the Code Interpreter tool call the run step was involved in.
data RunStepDetailsToolCallsCodeObject = RunStepDetailsToolCallsCodeObject
  { runStepDetailsToolCallsCodeObjectId :: Text -- ^ The ID of the tool call.
  , runStepDetailsToolCallsCodeObjectType :: Text -- ^ The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  , runStepDetailsToolCallsCodeObjectCodeUnderscoreinterpreter :: RunStepDetailsToolCallsCodeObjectCodeInterpreter -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsCodeObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsCodeObject
instance ToJSON RunStepDetailsToolCallsCodeObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsCodeObject

optionsRunStepDetailsToolCallsCodeObject :: Options
optionsRunStepDetailsToolCallsCodeObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsCodeObjectId", "id")
      , ("runStepDetailsToolCallsCodeObjectType", "type")
      , ("runStepDetailsToolCallsCodeObjectCodeUnderscoreinterpreter", "code_interpreter")
      ]


-- | The Code Interpreter tool call definition.
data RunStepDetailsToolCallsCodeObjectCodeInterpreter = RunStepDetailsToolCallsCodeObjectCodeInterpreter
  { runStepDetailsToolCallsCodeObjectCodeInterpreterInput :: Text -- ^ The input to the Code Interpreter tool call.
  , runStepDetailsToolCallsCodeObjectCodeInterpreterOutputs :: [RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner] -- ^ The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsCodeObjectCodeInterpreter where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsCodeObjectCodeInterpreter
instance ToJSON RunStepDetailsToolCallsCodeObjectCodeInterpreter where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsCodeObjectCodeInterpreter

optionsRunStepDetailsToolCallsCodeObjectCodeInterpreter :: Options
optionsRunStepDetailsToolCallsCodeObjectCodeInterpreter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsCodeObjectCodeInterpreterInput", "input")
      , ("runStepDetailsToolCallsCodeObjectCodeInterpreterOutputs", "outputs")
      ]


-- | 
data RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
  { runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType :: Text -- ^ Always `logs`.
  , runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs :: Text -- ^ The text output from the Code Interpreter tool call.
  , runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage :: RunStepDetailsToolCallsCodeOutputImageObjectImage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
instance ToJSON RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner

optionsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner :: Options
optionsRunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerType", "type")
      , ("runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerLogs", "logs")
      , ("runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerImage", "image")
      ]


-- | 
data RunStepDetailsToolCallsCodeOutputImageObject = RunStepDetailsToolCallsCodeOutputImageObject
  { runStepDetailsToolCallsCodeOutputImageObjectType :: Text -- ^ Always `image`.
  , runStepDetailsToolCallsCodeOutputImageObjectImage :: RunStepDetailsToolCallsCodeOutputImageObjectImage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsCodeOutputImageObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsCodeOutputImageObject
instance ToJSON RunStepDetailsToolCallsCodeOutputImageObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsCodeOutputImageObject

optionsRunStepDetailsToolCallsCodeOutputImageObject :: Options
optionsRunStepDetailsToolCallsCodeOutputImageObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsCodeOutputImageObjectType", "type")
      , ("runStepDetailsToolCallsCodeOutputImageObjectImage", "image")
      ]


-- | 
data RunStepDetailsToolCallsCodeOutputImageObjectImage = RunStepDetailsToolCallsCodeOutputImageObjectImage
  { runStepDetailsToolCallsCodeOutputImageObjectImageFileUnderscoreid :: Text -- ^ The [file](/docs/api-reference/files) ID of the image.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsCodeOutputImageObjectImage where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsCodeOutputImageObjectImage
instance ToJSON RunStepDetailsToolCallsCodeOutputImageObjectImage where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsCodeOutputImageObjectImage

optionsRunStepDetailsToolCallsCodeOutputImageObjectImage :: Options
optionsRunStepDetailsToolCallsCodeOutputImageObjectImage =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsCodeOutputImageObjectImageFileUnderscoreid", "file_id")
      ]


-- | Text output from the Code Interpreter tool call as part of a run step.
data RunStepDetailsToolCallsCodeOutputLogsObject = RunStepDetailsToolCallsCodeOutputLogsObject
  { runStepDetailsToolCallsCodeOutputLogsObjectType :: Text -- ^ Always `logs`.
  , runStepDetailsToolCallsCodeOutputLogsObjectLogs :: Text -- ^ The text output from the Code Interpreter tool call.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsCodeOutputLogsObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsCodeOutputLogsObject
instance ToJSON RunStepDetailsToolCallsCodeOutputLogsObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsCodeOutputLogsObject

optionsRunStepDetailsToolCallsCodeOutputLogsObject :: Options
optionsRunStepDetailsToolCallsCodeOutputLogsObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsCodeOutputLogsObjectType", "type")
      , ("runStepDetailsToolCallsCodeOutputLogsObjectLogs", "logs")
      ]


-- | 
data RunStepDetailsToolCallsFileSearchObject = RunStepDetailsToolCallsFileSearchObject
  { runStepDetailsToolCallsFileSearchObjectId :: Text -- ^ The ID of the tool call object.
  , runStepDetailsToolCallsFileSearchObjectType :: Text -- ^ The type of tool call. This is always going to be `file_search` for this type of tool call.
  , runStepDetailsToolCallsFileSearchObjectFileUnderscoresearch :: RunStepDetailsToolCallsFileSearchObjectFileSearch -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFileSearchObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFileSearchObject
instance ToJSON RunStepDetailsToolCallsFileSearchObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFileSearchObject

optionsRunStepDetailsToolCallsFileSearchObject :: Options
optionsRunStepDetailsToolCallsFileSearchObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFileSearchObjectId", "id")
      , ("runStepDetailsToolCallsFileSearchObjectType", "type")
      , ("runStepDetailsToolCallsFileSearchObjectFileUnderscoresearch", "file_search")
      ]


-- | For now, this is always going to be an empty object.
data RunStepDetailsToolCallsFileSearchObjectFileSearch = RunStepDetailsToolCallsFileSearchObjectFileSearch
  { runStepDetailsToolCallsFileSearchObjectFileSearchRankingUnderscoreoptions :: Maybe RunStepDetailsToolCallsFileSearchRankingOptionsObject -- ^ 
  , runStepDetailsToolCallsFileSearchObjectFileSearchResults :: Maybe [RunStepDetailsToolCallsFileSearchResultObject] -- ^ The results of the file search.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFileSearchObjectFileSearch where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFileSearchObjectFileSearch
instance ToJSON RunStepDetailsToolCallsFileSearchObjectFileSearch where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFileSearchObjectFileSearch

optionsRunStepDetailsToolCallsFileSearchObjectFileSearch :: Options
optionsRunStepDetailsToolCallsFileSearchObjectFileSearch =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFileSearchObjectFileSearchRankingUnderscoreoptions", "ranking_options")
      , ("runStepDetailsToolCallsFileSearchObjectFileSearchResults", "results")
      ]


-- | The ranking options for the file search.
data RunStepDetailsToolCallsFileSearchRankingOptionsObject = RunStepDetailsToolCallsFileSearchRankingOptionsObject
  { runStepDetailsToolCallsFileSearchRankingOptionsObjectRanker :: Text -- ^ The ranker used for the file search.
  , runStepDetailsToolCallsFileSearchRankingOptionsObjectScoreUnderscorethreshold :: Double -- ^ The score threshold for the file search. All values must be a floating point number between 0 and 1.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFileSearchRankingOptionsObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFileSearchRankingOptionsObject
instance ToJSON RunStepDetailsToolCallsFileSearchRankingOptionsObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFileSearchRankingOptionsObject

optionsRunStepDetailsToolCallsFileSearchRankingOptionsObject :: Options
optionsRunStepDetailsToolCallsFileSearchRankingOptionsObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFileSearchRankingOptionsObjectRanker", "ranker")
      , ("runStepDetailsToolCallsFileSearchRankingOptionsObjectScoreUnderscorethreshold", "score_threshold")
      ]


-- | A result instance of the file search.
data RunStepDetailsToolCallsFileSearchResultObject = RunStepDetailsToolCallsFileSearchResultObject
  { runStepDetailsToolCallsFileSearchResultObjectFileUnderscoreid :: Text -- ^ The ID of the file that result was found in.
  , runStepDetailsToolCallsFileSearchResultObjectFileUnderscorename :: Text -- ^ The name of the file that result was found in.
  , runStepDetailsToolCallsFileSearchResultObjectScore :: Double -- ^ The score of the result. All values must be a floating point number between 0 and 1.
  , runStepDetailsToolCallsFileSearchResultObjectContent :: Maybe [RunStepDetailsToolCallsFileSearchResultObjectContentInner] -- ^ The content of the result that was found. The content is only included if requested via the include query parameter.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFileSearchResultObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFileSearchResultObject
instance ToJSON RunStepDetailsToolCallsFileSearchResultObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFileSearchResultObject

optionsRunStepDetailsToolCallsFileSearchResultObject :: Options
optionsRunStepDetailsToolCallsFileSearchResultObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFileSearchResultObjectFileUnderscoreid", "file_id")
      , ("runStepDetailsToolCallsFileSearchResultObjectFileUnderscorename", "file_name")
      , ("runStepDetailsToolCallsFileSearchResultObjectScore", "score")
      , ("runStepDetailsToolCallsFileSearchResultObjectContent", "content")
      ]


-- | 
data RunStepDetailsToolCallsFileSearchResultObjectContentInner = RunStepDetailsToolCallsFileSearchResultObjectContentInner
  { runStepDetailsToolCallsFileSearchResultObjectContentInnerType :: Maybe Text -- ^ The type of the content.
  , runStepDetailsToolCallsFileSearchResultObjectContentInnerText :: Maybe Text -- ^ The text content of the file.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFileSearchResultObjectContentInner where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFileSearchResultObjectContentInner
instance ToJSON RunStepDetailsToolCallsFileSearchResultObjectContentInner where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFileSearchResultObjectContentInner

optionsRunStepDetailsToolCallsFileSearchResultObjectContentInner :: Options
optionsRunStepDetailsToolCallsFileSearchResultObjectContentInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFileSearchResultObjectContentInnerType", "type")
      , ("runStepDetailsToolCallsFileSearchResultObjectContentInnerText", "text")
      ]


-- | 
data RunStepDetailsToolCallsFunctionObject = RunStepDetailsToolCallsFunctionObject
  { runStepDetailsToolCallsFunctionObjectId :: Text -- ^ The ID of the tool call object.
  , runStepDetailsToolCallsFunctionObjectType :: Text -- ^ The type of tool call. This is always going to be `function` for this type of tool call.
  , runStepDetailsToolCallsFunctionObjectFunction :: RunStepDetailsToolCallsFunctionObjectFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFunctionObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFunctionObject
instance ToJSON RunStepDetailsToolCallsFunctionObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFunctionObject

optionsRunStepDetailsToolCallsFunctionObject :: Options
optionsRunStepDetailsToolCallsFunctionObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFunctionObjectId", "id")
      , ("runStepDetailsToolCallsFunctionObjectType", "type")
      , ("runStepDetailsToolCallsFunctionObjectFunction", "function")
      ]


-- | The definition of the function that was called.
data RunStepDetailsToolCallsFunctionObjectFunction = RunStepDetailsToolCallsFunctionObjectFunction
  { runStepDetailsToolCallsFunctionObjectFunctionName :: Text -- ^ The name of the function.
  , runStepDetailsToolCallsFunctionObjectFunctionArguments :: Text -- ^ The arguments passed to the function.
  , runStepDetailsToolCallsFunctionObjectFunctionOutput :: Text -- ^ The output of the function. This will be `null` if the outputs have not been [submitted](/docs/api-reference/runs/submitToolOutputs) yet.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsFunctionObjectFunction where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsFunctionObjectFunction
instance ToJSON RunStepDetailsToolCallsFunctionObjectFunction where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsFunctionObjectFunction

optionsRunStepDetailsToolCallsFunctionObjectFunction :: Options
optionsRunStepDetailsToolCallsFunctionObjectFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsFunctionObjectFunctionName", "name")
      , ("runStepDetailsToolCallsFunctionObjectFunctionArguments", "arguments")
      , ("runStepDetailsToolCallsFunctionObjectFunctionOutput", "output")
      ]


-- | Details of the tool call.
data RunStepDetailsToolCallsObject = RunStepDetailsToolCallsObject
  { runStepDetailsToolCallsObjectType :: Text -- ^ Always `tool_calls`.
  , runStepDetailsToolCallsObjectToolUnderscorecalls :: [RunStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsObject
instance ToJSON RunStepDetailsToolCallsObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsObject

optionsRunStepDetailsToolCallsObject :: Options
optionsRunStepDetailsToolCallsObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsObjectType", "type")
      , ("runStepDetailsToolCallsObjectToolUnderscorecalls", "tool_calls")
      ]


-- | 
data RunStepDetailsToolCallsObjectToolCallsInner = RunStepDetailsToolCallsObjectToolCallsInner
  { runStepDetailsToolCallsObjectToolCallsInnerId :: Text -- ^ The ID of the tool call object.
  , runStepDetailsToolCallsObjectToolCallsInnerType :: Text -- ^ The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
  , runStepDetailsToolCallsObjectToolCallsInnerCodeUnderscoreinterpreter :: RunStepDetailsToolCallsCodeObjectCodeInterpreter -- ^ 
  , runStepDetailsToolCallsObjectToolCallsInnerFileUnderscoresearch :: RunStepDetailsToolCallsFileSearchObjectFileSearch -- ^ 
  , runStepDetailsToolCallsObjectToolCallsInnerFunction :: RunStepDetailsToolCallsFunctionObjectFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsObjectToolCallsInner where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsObjectToolCallsInner
instance ToJSON RunStepDetailsToolCallsObjectToolCallsInner where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsObjectToolCallsInner

optionsRunStepDetailsToolCallsObjectToolCallsInner :: Options
optionsRunStepDetailsToolCallsObjectToolCallsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsObjectToolCallsInnerId", "id")
      , ("runStepDetailsToolCallsObjectToolCallsInnerType", "type")
      , ("runStepDetailsToolCallsObjectToolCallsInnerCodeUnderscoreinterpreter", "code_interpreter")
      , ("runStepDetailsToolCallsObjectToolCallsInnerFileUnderscoresearch", "file_search")
      , ("runStepDetailsToolCallsObjectToolCallsInnerFunction", "function")
      ]


-- | Represents a step in execution of a run. 
data RunStepObject = RunStepObject
  { runStepObjectId :: Text -- ^ The identifier of the run step, which can be referenced in API endpoints.
  , runStepObjectObject :: Text -- ^ The object type, which is always `thread.run.step`.
  , runStepObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run step was created.
  , runStepObjectAssistantUnderscoreid :: Text -- ^ The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
  , runStepObjectThreadUnderscoreid :: Text -- ^ The ID of the [thread](/docs/api-reference/threads) that was run.
  , runStepObjectRunUnderscoreid :: Text -- ^ The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
  , runStepObjectType :: Text -- ^ The type of run step, which can be either `message_creation` or `tool_calls`.
  , runStepObjectStatus :: Text -- ^ The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  , runStepObjectStepUnderscoredetails :: RunStepObjectStepDetails -- ^ 
  , runStepObjectLastUnderscoreerror :: RunStepObjectLastError -- ^ 
  , runStepObjectExpiredUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
  , runStepObjectCancelledUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run step was cancelled.
  , runStepObjectFailedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run step failed.
  , runStepObjectCompletedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the run step completed.
  , runStepObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  , runStepObjectUsage :: RunStepCompletionUsage -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepObject where
  parseJSON = genericParseJSON optionsRunStepObject
instance ToJSON RunStepObject where
  toJSON = genericToJSON optionsRunStepObject

optionsRunStepObject :: Options
optionsRunStepObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepObjectId", "id")
      , ("runStepObjectObject", "object")
      , ("runStepObjectCreatedUnderscoreat", "created_at")
      , ("runStepObjectAssistantUnderscoreid", "assistant_id")
      , ("runStepObjectThreadUnderscoreid", "thread_id")
      , ("runStepObjectRunUnderscoreid", "run_id")
      , ("runStepObjectType", "type")
      , ("runStepObjectStatus", "status")
      , ("runStepObjectStepUnderscoredetails", "step_details")
      , ("runStepObjectLastUnderscoreerror", "last_error")
      , ("runStepObjectExpiredUnderscoreat", "expired_at")
      , ("runStepObjectCancelledUnderscoreat", "cancelled_at")
      , ("runStepObjectFailedUnderscoreat", "failed_at")
      , ("runStepObjectCompletedUnderscoreat", "completed_at")
      , ("runStepObjectMetadata", "metadata")
      , ("runStepObjectUsage", "usage")
      ]


-- | The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
data RunStepObjectLastError = RunStepObjectLastError
  { runStepObjectLastErrorCode :: Text -- ^ One of `server_error` or `rate_limit_exceeded`.
  , runStepObjectLastErrorMessage :: Text -- ^ A human-readable description of the error.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepObjectLastError where
  parseJSON = genericParseJSON optionsRunStepObjectLastError
instance ToJSON RunStepObjectLastError where
  toJSON = genericToJSON optionsRunStepObjectLastError

optionsRunStepObjectLastError :: Options
optionsRunStepObjectLastError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepObjectLastErrorCode", "code")
      , ("runStepObjectLastErrorMessage", "message")
      ]


-- | The details of the run step.
data RunStepObjectStepDetails = RunStepObjectStepDetails
  { runStepObjectStepDetailsType :: Text -- ^ Always `message_creation`.
  , runStepObjectStepDetailsMessageUnderscorecreation :: RunStepDetailsMessageCreationObjectMessageCreation -- ^ 
  , runStepObjectStepDetailsToolUnderscorecalls :: [RunStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepObjectStepDetails where
  parseJSON = genericParseJSON optionsRunStepObjectStepDetails
instance ToJSON RunStepObjectStepDetails where
  toJSON = genericToJSON optionsRunStepObjectStepDetails

optionsRunStepObjectStepDetails :: Options
optionsRunStepObjectStepDetails =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepObjectStepDetailsType", "type")
      , ("runStepObjectStepDetailsMessageUnderscorecreation", "message_creation")
      , ("runStepObjectStepDetailsToolUnderscorecalls", "tool_calls")
      ]


-- | 
data RunStepStreamEvent = RunStepStreamEvent
  { runStepStreamEventEvent :: Text -- ^ 
  , runStepStreamEventData :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEvent where
  parseJSON = genericParseJSON optionsRunStepStreamEvent
instance ToJSON RunStepStreamEvent where
  toJSON = genericToJSON optionsRunStepStreamEvent

optionsRunStepStreamEvent :: Options
optionsRunStepStreamEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventEvent", "event")
      , ("runStepStreamEventData", "data")
      ]


-- | Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
data RunStepStreamEventOneOf = RunStepStreamEventOneOf
  { runStepStreamEventOneOfEvent :: Text -- ^ 
  , runStepStreamEventOneOfData :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf
instance ToJSON RunStepStreamEventOneOf where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf

optionsRunStepStreamEventOneOf :: Options
optionsRunStepStreamEventOneOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOfEvent", "event")
      , ("runStepStreamEventOneOfData", "data")
      ]


-- | Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an &#x60;in_progress&#x60; state.
data RunStepStreamEventOneOf1 = RunStepStreamEventOneOf1
  { runStepStreamEventOneOf1Event :: Text -- ^ 
  , runStepStreamEventOneOf1Data :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf1 where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf1
instance ToJSON RunStepStreamEventOneOf1 where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf1

optionsRunStepStreamEventOneOf1 :: Options
optionsRunStepStreamEventOneOf1 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOf1Event", "event")
      , ("runStepStreamEventOneOf1Data", "data")
      ]


-- | Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
data RunStepStreamEventOneOf2 = RunStepStreamEventOneOf2
  { runStepStreamEventOneOf2Event :: Text -- ^ 
  , runStepStreamEventOneOf2Data :: RunStepDeltaObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf2 where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf2
instance ToJSON RunStepStreamEventOneOf2 where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf2

optionsRunStepStreamEventOneOf2 :: Options
optionsRunStepStreamEventOneOf2 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOf2Event", "event")
      , ("runStepStreamEventOneOf2Data", "data")
      ]


-- | Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
data RunStepStreamEventOneOf3 = RunStepStreamEventOneOf3
  { runStepStreamEventOneOf3Event :: Text -- ^ 
  , runStepStreamEventOneOf3Data :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf3 where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf3
instance ToJSON RunStepStreamEventOneOf3 where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf3

optionsRunStepStreamEventOneOf3 :: Options
optionsRunStepStreamEventOneOf3 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOf3Event", "event")
      , ("runStepStreamEventOneOf3Data", "data")
      ]


-- | Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
data RunStepStreamEventOneOf4 = RunStepStreamEventOneOf4
  { runStepStreamEventOneOf4Event :: Text -- ^ 
  , runStepStreamEventOneOf4Data :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf4 where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf4
instance ToJSON RunStepStreamEventOneOf4 where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf4

optionsRunStepStreamEventOneOf4 :: Options
optionsRunStepStreamEventOneOf4 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOf4Event", "event")
      , ("runStepStreamEventOneOf4Data", "data")
      ]


-- | Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.
data RunStepStreamEventOneOf5 = RunStepStreamEventOneOf5
  { runStepStreamEventOneOf5Event :: Text -- ^ 
  , runStepStreamEventOneOf5Data :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf5 where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf5
instance ToJSON RunStepStreamEventOneOf5 where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf5

optionsRunStepStreamEventOneOf5 :: Options
optionsRunStepStreamEventOneOf5 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOf5Event", "event")
      , ("runStepStreamEventOneOf5Data", "data")
      ]


-- | Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
data RunStepStreamEventOneOf6 = RunStepStreamEventOneOf6
  { runStepStreamEventOneOf6Event :: Text -- ^ 
  , runStepStreamEventOneOf6Data :: RunStepObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepStreamEventOneOf6 where
  parseJSON = genericParseJSON optionsRunStepStreamEventOneOf6
instance ToJSON RunStepStreamEventOneOf6 where
  toJSON = genericToJSON optionsRunStepStreamEventOneOf6

optionsRunStepStreamEventOneOf6 :: Options
optionsRunStepStreamEventOneOf6 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepStreamEventOneOf6Event", "event")
      , ("runStepStreamEventOneOf6Data", "data")
      ]


-- | 
data RunStreamEvent = RunStreamEvent
  { runStreamEventEvent :: Text -- ^ 
  , runStreamEventData :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEvent where
  parseJSON = genericParseJSON optionsRunStreamEvent
instance ToJSON RunStreamEvent where
  toJSON = genericToJSON optionsRunStreamEvent

optionsRunStreamEvent :: Options
optionsRunStreamEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventEvent", "event")
      , ("runStreamEventData", "data")
      ]


-- | Occurs when a new [run](/docs/api-reference/runs/object) is created.
data RunStreamEventOneOf = RunStreamEventOneOf
  { runStreamEventOneOfEvent :: Text -- ^ 
  , runStreamEventOneOfData :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf
instance ToJSON RunStreamEventOneOf where
  toJSON = genericToJSON optionsRunStreamEventOneOf

optionsRunStreamEventOneOf :: Options
optionsRunStreamEventOneOf =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOfEvent", "event")
      , ("runStreamEventOneOfData", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
data RunStreamEventOneOf1 = RunStreamEventOneOf1
  { runStreamEventOneOf1Event :: Text -- ^ 
  , runStreamEventOneOf1Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf1 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf1
instance ToJSON RunStreamEventOneOf1 where
  toJSON = genericToJSON optionsRunStreamEventOneOf1

optionsRunStreamEventOneOf1 :: Options
optionsRunStreamEventOneOf1 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf1Event", "event")
      , ("runStreamEventOneOf1Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
data RunStreamEventOneOf2 = RunStreamEventOneOf2
  { runStreamEventOneOf2Event :: Text -- ^ 
  , runStreamEventOneOf2Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf2 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf2
instance ToJSON RunStreamEventOneOf2 where
  toJSON = genericToJSON optionsRunStreamEventOneOf2

optionsRunStreamEventOneOf2 :: Options
optionsRunStreamEventOneOf2 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf2Event", "event")
      , ("runStreamEventOneOf2Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;requires_action&#x60; status.
data RunStreamEventOneOf3 = RunStreamEventOneOf3
  { runStreamEventOneOf3Event :: Text -- ^ 
  , runStreamEventOneOf3Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf3 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf3
instance ToJSON RunStreamEventOneOf3 where
  toJSON = genericToJSON optionsRunStreamEventOneOf3

optionsRunStreamEventOneOf3 :: Options
optionsRunStreamEventOneOf3 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf3Event", "event")
      , ("runStreamEventOneOf3Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) is completed.
data RunStreamEventOneOf4 = RunStreamEventOneOf4
  { runStreamEventOneOf4Event :: Text -- ^ 
  , runStreamEventOneOf4Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf4 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf4
instance ToJSON RunStreamEventOneOf4 where
  toJSON = genericToJSON optionsRunStreamEventOneOf4

optionsRunStreamEventOneOf4 :: Options
optionsRunStreamEventOneOf4 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf4Event", "event")
      , ("runStreamEventOneOf4Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) ends with status &#x60;incomplete&#x60;.
data RunStreamEventOneOf5 = RunStreamEventOneOf5
  { runStreamEventOneOf5Event :: Text -- ^ 
  , runStreamEventOneOf5Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf5 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf5
instance ToJSON RunStreamEventOneOf5 where
  toJSON = genericToJSON optionsRunStreamEventOneOf5

optionsRunStreamEventOneOf5 :: Options
optionsRunStreamEventOneOf5 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf5Event", "event")
      , ("runStreamEventOneOf5Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) fails.
data RunStreamEventOneOf6 = RunStreamEventOneOf6
  { runStreamEventOneOf6Event :: Text -- ^ 
  , runStreamEventOneOf6Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf6 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf6
instance ToJSON RunStreamEventOneOf6 where
  toJSON = genericToJSON optionsRunStreamEventOneOf6

optionsRunStreamEventOneOf6 :: Options
optionsRunStreamEventOneOf6 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf6Event", "event")
      , ("runStreamEventOneOf6Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
data RunStreamEventOneOf7 = RunStreamEventOneOf7
  { runStreamEventOneOf7Event :: Text -- ^ 
  , runStreamEventOneOf7Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf7 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf7
instance ToJSON RunStreamEventOneOf7 where
  toJSON = genericToJSON optionsRunStreamEventOneOf7

optionsRunStreamEventOneOf7 :: Options
optionsRunStreamEventOneOf7 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf7Event", "event")
      , ("runStreamEventOneOf7Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
data RunStreamEventOneOf8 = RunStreamEventOneOf8
  { runStreamEventOneOf8Event :: Text -- ^ 
  , runStreamEventOneOf8Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf8 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf8
instance ToJSON RunStreamEventOneOf8 where
  toJSON = genericToJSON optionsRunStreamEventOneOf8

optionsRunStreamEventOneOf8 :: Options
optionsRunStreamEventOneOf8 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf8Event", "event")
      , ("runStreamEventOneOf8Data", "data")
      ]


-- | Occurs when a [run](/docs/api-reference/runs/object) expires.
data RunStreamEventOneOf9 = RunStreamEventOneOf9
  { runStreamEventOneOf9Event :: Text -- ^ 
  , runStreamEventOneOf9Data :: RunObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunStreamEventOneOf9 where
  parseJSON = genericParseJSON optionsRunStreamEventOneOf9
instance ToJSON RunStreamEventOneOf9 where
  toJSON = genericToJSON optionsRunStreamEventOneOf9

optionsRunStreamEventOneOf9 :: Options
optionsRunStreamEventOneOf9 =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStreamEventOneOf9Event", "event")
      , ("runStreamEventOneOf9Data", "data")
      ]


-- | Tool call objects
data RunToolCallObject = RunToolCallObject
  { runToolCallObjectId :: Text -- ^ The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
  , runToolCallObjectType :: Text -- ^ The type of tool call the output is required for. For now, this is always `function`.
  , runToolCallObjectFunction :: RunToolCallObjectFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON RunToolCallObject where
  parseJSON = genericParseJSON optionsRunToolCallObject
instance ToJSON RunToolCallObject where
  toJSON = genericToJSON optionsRunToolCallObject

optionsRunToolCallObject :: Options
optionsRunToolCallObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runToolCallObjectId", "id")
      , ("runToolCallObjectType", "type")
      , ("runToolCallObjectFunction", "function")
      ]


-- | The function definition.
data RunToolCallObjectFunction = RunToolCallObjectFunction
  { runToolCallObjectFunctionName :: Text -- ^ The name of the function.
  , runToolCallObjectFunctionArguments :: Text -- ^ The arguments that the model expects you to pass to the function.
  } deriving (Show, Eq, Generic)

instance FromJSON RunToolCallObjectFunction where
  parseJSON = genericParseJSON optionsRunToolCallObjectFunction
instance ToJSON RunToolCallObjectFunction where
  toJSON = genericToJSON optionsRunToolCallObjectFunction

optionsRunToolCallObjectFunction :: Options
optionsRunToolCallObjectFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runToolCallObjectFunctionName", "name")
      , ("runToolCallObjectFunctionArguments", "arguments")
      ]


-- | 
data StaticChunkingStrategy = StaticChunkingStrategy
  { staticChunkingStrategyType :: Text -- ^ Always `static`.
  , staticChunkingStrategyStatic :: StaticChunkingStrategyStatic -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON StaticChunkingStrategy where
  parseJSON = genericParseJSON optionsStaticChunkingStrategy
instance ToJSON StaticChunkingStrategy where
  toJSON = genericToJSON optionsStaticChunkingStrategy

optionsStaticChunkingStrategy :: Options
optionsStaticChunkingStrategy =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("staticChunkingStrategyType", "type")
      , ("staticChunkingStrategyStatic", "static")
      ]


-- | 
data StaticChunkingStrategyRequestParam = StaticChunkingStrategyRequestParam
  { staticChunkingStrategyRequestParamType :: Text -- ^ Always `static`.
  , staticChunkingStrategyRequestParamStatic :: StaticChunkingStrategy -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON StaticChunkingStrategyRequestParam where
  parseJSON = genericParseJSON optionsStaticChunkingStrategyRequestParam
instance ToJSON StaticChunkingStrategyRequestParam where
  toJSON = genericToJSON optionsStaticChunkingStrategyRequestParam

optionsStaticChunkingStrategyRequestParam :: Options
optionsStaticChunkingStrategyRequestParam =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("staticChunkingStrategyRequestParamType", "type")
      , ("staticChunkingStrategyRequestParamStatic", "static")
      ]


-- | 
data StaticChunkingStrategyResponseParam = StaticChunkingStrategyResponseParam
  { staticChunkingStrategyResponseParamType :: Text -- ^ Always `static`.
  , staticChunkingStrategyResponseParamStatic :: StaticChunkingStrategy -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON StaticChunkingStrategyResponseParam where
  parseJSON = genericParseJSON optionsStaticChunkingStrategyResponseParam
instance ToJSON StaticChunkingStrategyResponseParam where
  toJSON = genericToJSON optionsStaticChunkingStrategyResponseParam

optionsStaticChunkingStrategyResponseParam :: Options
optionsStaticChunkingStrategyResponseParam =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("staticChunkingStrategyResponseParamType", "type")
      , ("staticChunkingStrategyResponseParamStatic", "static")
      ]


-- | 
data StaticChunkingStrategyStatic = StaticChunkingStrategyStatic
  { staticChunkingStrategyStaticMaxUnderscorechunkUnderscoresizeUnderscoretokens :: Int -- ^ The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`.
  , staticChunkingStrategyStaticChunkUnderscoreoverlapUnderscoretokens :: Int -- ^ The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`. 
  } deriving (Show, Eq, Generic)

instance FromJSON StaticChunkingStrategyStatic where
  parseJSON = genericParseJSON optionsStaticChunkingStrategyStatic
instance ToJSON StaticChunkingStrategyStatic where
  toJSON = genericToJSON optionsStaticChunkingStrategyStatic

optionsStaticChunkingStrategyStatic :: Options
optionsStaticChunkingStrategyStatic =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("staticChunkingStrategyStaticMaxUnderscorechunkUnderscoresizeUnderscoretokens", "max_chunk_size_tokens")
      , ("staticChunkingStrategyStaticChunkUnderscoreoverlapUnderscoretokens", "chunk_overlap_tokens")
      ]


-- | 
data SubmitToolOutputsRunRequest = SubmitToolOutputsRunRequest
  { submitToolOutputsRunRequestToolUnderscoreoutputs :: [SubmitToolOutputsRunRequestToolOutputsInner] -- ^ A list of tools for which the outputs are being submitted.
  , submitToolOutputsRunRequestStream :: Maybe Bool -- ^ If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  } deriving (Show, Eq, Generic)

instance FromJSON SubmitToolOutputsRunRequest where
  parseJSON = genericParseJSON optionsSubmitToolOutputsRunRequest
instance ToJSON SubmitToolOutputsRunRequest where
  toJSON = genericToJSON optionsSubmitToolOutputsRunRequest

optionsSubmitToolOutputsRunRequest :: Options
optionsSubmitToolOutputsRunRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("submitToolOutputsRunRequestToolUnderscoreoutputs", "tool_outputs")
      , ("submitToolOutputsRunRequestStream", "stream")
      ]


-- | 
data SubmitToolOutputsRunRequestToolOutputsInner = SubmitToolOutputsRunRequestToolOutputsInner
  { submitToolOutputsRunRequestToolOutputsInnerToolUnderscorecallUnderscoreid :: Maybe Text -- ^ The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
  , submitToolOutputsRunRequestToolOutputsInnerOutput :: Maybe Text -- ^ The output of the tool call to be submitted to continue the run.
  } deriving (Show, Eq, Generic)

instance FromJSON SubmitToolOutputsRunRequestToolOutputsInner where
  parseJSON = genericParseJSON optionsSubmitToolOutputsRunRequestToolOutputsInner
instance ToJSON SubmitToolOutputsRunRequestToolOutputsInner where
  toJSON = genericToJSON optionsSubmitToolOutputsRunRequestToolOutputsInner

optionsSubmitToolOutputsRunRequestToolOutputsInner :: Options
optionsSubmitToolOutputsRunRequestToolOutputsInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("submitToolOutputsRunRequestToolOutputsInnerToolUnderscorecallUnderscoreid", "tool_call_id")
      , ("submitToolOutputsRunRequestToolOutputsInnerOutput", "output")
      ]


-- | Represents a thread that contains [messages](/docs/api-reference/messages).
data ThreadObject = ThreadObject
  { threadObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , threadObjectObject :: Text -- ^ The object type, which is always `thread`.
  , threadObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the thread was created.
  , threadObjectToolUnderscoreresources :: ModifyThreadRequestToolResources -- ^ 
  , threadObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON ThreadObject where
  parseJSON = genericParseJSON optionsThreadObject
instance ToJSON ThreadObject where
  toJSON = genericToJSON optionsThreadObject

optionsThreadObject :: Options
optionsThreadObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("threadObjectId", "id")
      , ("threadObjectObject", "object")
      , ("threadObjectCreatedUnderscoreat", "created_at")
      , ("threadObjectToolUnderscoreresources", "tool_resources")
      , ("threadObjectMetadata", "metadata")
      ]


-- | Occurs when a new [thread](/docs/api-reference/threads/object) is created.
data ThreadStreamEvent = ThreadStreamEvent
  { threadStreamEventEnabled :: Maybe Bool -- ^ Whether to enable input audio transcription.
  , threadStreamEventEvent :: Text -- ^ 
  , threadStreamEventData :: ThreadObject -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ThreadStreamEvent where
  parseJSON = genericParseJSON optionsThreadStreamEvent
instance ToJSON ThreadStreamEvent where
  toJSON = genericToJSON optionsThreadStreamEvent

optionsThreadStreamEvent :: Options
optionsThreadStreamEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("threadStreamEventEnabled", "enabled")
      , ("threadStreamEventEvent", "event")
      , ("threadStreamEventData", "data")
      ]


-- | 
data TranscriptionSegment = TranscriptionSegment
  { transcriptionSegmentId :: Int -- ^ Unique identifier of the segment.
  , transcriptionSegmentSeek :: Int -- ^ Seek offset of the segment.
  , transcriptionSegmentStart :: Float -- ^ Start time of the segment in seconds.
  , transcriptionSegmentEnd :: Float -- ^ End time of the segment in seconds.
  , transcriptionSegmentText :: Text -- ^ Text content of the segment.
  , transcriptionSegmentTokens :: [Int] -- ^ Array of token IDs for the text content.
  , transcriptionSegmentTemperature :: Float -- ^ Temperature parameter used for generating the segment.
  , transcriptionSegmentAvgUnderscorelogprob :: Float -- ^ Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
  , transcriptionSegmentCompressionUnderscoreratio :: Float -- ^ Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
  , transcriptionSegmentNoUnderscorespeechUnderscoreprob :: Float -- ^ Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
  } deriving (Show, Eq, Generic)

instance FromJSON TranscriptionSegment where
  parseJSON = genericParseJSON optionsTranscriptionSegment
instance ToJSON TranscriptionSegment where
  toJSON = genericToJSON optionsTranscriptionSegment

optionsTranscriptionSegment :: Options
optionsTranscriptionSegment =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("transcriptionSegmentId", "id")
      , ("transcriptionSegmentSeek", "seek")
      , ("transcriptionSegmentStart", "start")
      , ("transcriptionSegmentEnd", "end")
      , ("transcriptionSegmentText", "text")
      , ("transcriptionSegmentTokens", "tokens")
      , ("transcriptionSegmentTemperature", "temperature")
      , ("transcriptionSegmentAvgUnderscorelogprob", "avg_logprob")
      , ("transcriptionSegmentCompressionUnderscoreratio", "compression_ratio")
      , ("transcriptionSegmentNoUnderscorespeechUnderscoreprob", "no_speech_prob")
      ]


-- | 
data TranscriptionWord = TranscriptionWord
  { transcriptionWordWord :: Text -- ^ The text content of the word.
  , transcriptionWordStart :: Float -- ^ Start time of the word in seconds.
  , transcriptionWordEnd :: Float -- ^ End time of the word in seconds.
  } deriving (Show, Eq, Generic)

instance FromJSON TranscriptionWord where
  parseJSON = genericParseJSON optionsTranscriptionWord
instance ToJSON TranscriptionWord where
  toJSON = genericToJSON optionsTranscriptionWord

optionsTranscriptionWord :: Options
optionsTranscriptionWord =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("transcriptionWordWord", "word")
      , ("transcriptionWordStart", "start")
      , ("transcriptionWordEnd", "end")
      ]


-- | Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
data TruncationObject = TruncationObject
  { truncationObjectType :: Text -- ^ The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
  , truncationObjectLastUnderscoremessages :: Maybe Int -- ^ The number of most recent messages from the thread when constructing the context for the run.
  } deriving (Show, Eq, Generic)

instance FromJSON TruncationObject where
  parseJSON = genericParseJSON optionsTruncationObject
instance ToJSON TruncationObject where
  toJSON = genericToJSON optionsTruncationObject

optionsTruncationObject :: Options
optionsTruncationObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("truncationObjectType", "type")
      , ("truncationObjectLastUnderscoremessages", "last_messages")
      ]


-- | 
data UpdateVectorStoreRequest = UpdateVectorStoreRequest
  { updateVectorStoreRequestName :: Maybe Text -- ^ The name of the vector store.
  , updateVectorStoreRequestExpiresUnderscoreafter :: Maybe VectorStoreExpirationAfter -- ^ 
  , updateVectorStoreRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON UpdateVectorStoreRequest where
  parseJSON = genericParseJSON optionsUpdateVectorStoreRequest
instance ToJSON UpdateVectorStoreRequest where
  toJSON = genericToJSON optionsUpdateVectorStoreRequest

optionsUpdateVectorStoreRequest :: Options
optionsUpdateVectorStoreRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("updateVectorStoreRequestName", "name")
      , ("updateVectorStoreRequestExpiresUnderscoreafter", "expires_after")
      , ("updateVectorStoreRequestMetadata", "metadata")
      ]


-- | The Upload object can accept byte chunks in the form of Parts. 
data Upload = Upload
  { uploadId :: Text -- ^ The Upload unique identifier, which can be referenced in API endpoints.
  , uploadCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the Upload was created.
  , uploadFilename :: Text -- ^ The name of the file to be uploaded.
  , uploadBytes :: Int -- ^ The intended number of bytes to be uploaded.
  , uploadPurpose :: Text -- ^ The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
  , uploadStatus :: Text -- ^ The status of the Upload.
  , uploadExpiresUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the Upload was created.
  , uploadObject :: Maybe Text -- ^ The object type, which is always \"upload\".
  , uploadFile :: Maybe OpenAIFile -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Upload where
  parseJSON = genericParseJSON optionsUpload
instance ToJSON Upload where
  toJSON = genericToJSON optionsUpload

optionsUpload :: Options
optionsUpload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("uploadId", "id")
      , ("uploadCreatedUnderscoreat", "created_at")
      , ("uploadFilename", "filename")
      , ("uploadBytes", "bytes")
      , ("uploadPurpose", "purpose")
      , ("uploadStatus", "status")
      , ("uploadExpiresUnderscoreat", "expires_at")
      , ("uploadObject", "object")
      , ("uploadFile", "file")
      ]


-- | The upload Part represents a chunk of bytes we can add to an Upload object. 
data UploadPart = UploadPart
  { uploadPartId :: Text -- ^ The upload Part unique identifier, which can be referenced in API endpoints.
  , uploadPartCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the Part was created.
  , uploadPartUploadUnderscoreid :: Text -- ^ The ID of the Upload object that this Part was added to.
  , uploadPartObject :: Text -- ^ The object type, which is always `upload.part`.
  } deriving (Show, Eq, Generic)

instance FromJSON UploadPart where
  parseJSON = genericParseJSON optionsUploadPart
instance ToJSON UploadPart where
  toJSON = genericToJSON optionsUploadPart

optionsUploadPart :: Options
optionsUploadPart =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("uploadPartId", "id")
      , ("uploadPartCreatedUnderscoreat", "created_at")
      , ("uploadPartUploadUnderscoreid", "upload_id")
      , ("uploadPartObject", "object")
      ]


-- | The aggregated audio speeches usage details of the specific time bucket.
data UsageAudioSpeechesResult = UsageAudioSpeechesResult
  { usageAudioSpeechesResultObject :: Text -- ^ 
  , usageAudioSpeechesResultCharacters :: Int -- ^ The number of characters processed.
  , usageAudioSpeechesResultNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageAudioSpeechesResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  , usageAudioSpeechesResultUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageAudioSpeechesResultApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageAudioSpeechesResultModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageAudioSpeechesResult where
  parseJSON = genericParseJSON optionsUsageAudioSpeechesResult
instance ToJSON UsageAudioSpeechesResult where
  toJSON = genericToJSON optionsUsageAudioSpeechesResult

optionsUsageAudioSpeechesResult :: Options
optionsUsageAudioSpeechesResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageAudioSpeechesResultObject", "object")
      , ("usageAudioSpeechesResultCharacters", "characters")
      , ("usageAudioSpeechesResultNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageAudioSpeechesResultProjectUnderscoreid", "project_id")
      , ("usageAudioSpeechesResultUserUnderscoreid", "user_id")
      , ("usageAudioSpeechesResultApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageAudioSpeechesResultModel", "model")
      ]


-- | The aggregated audio transcriptions usage details of the specific time bucket.
data UsageAudioTranscriptionsResult = UsageAudioTranscriptionsResult
  { usageAudioTranscriptionsResultObject :: Text -- ^ 
  , usageAudioTranscriptionsResultSeconds :: Int -- ^ The number of seconds processed.
  , usageAudioTranscriptionsResultNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageAudioTranscriptionsResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  , usageAudioTranscriptionsResultUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageAudioTranscriptionsResultApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageAudioTranscriptionsResultModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageAudioTranscriptionsResult where
  parseJSON = genericParseJSON optionsUsageAudioTranscriptionsResult
instance ToJSON UsageAudioTranscriptionsResult where
  toJSON = genericToJSON optionsUsageAudioTranscriptionsResult

optionsUsageAudioTranscriptionsResult :: Options
optionsUsageAudioTranscriptionsResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageAudioTranscriptionsResultObject", "object")
      , ("usageAudioTranscriptionsResultSeconds", "seconds")
      , ("usageAudioTranscriptionsResultNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageAudioTranscriptionsResultProjectUnderscoreid", "project_id")
      , ("usageAudioTranscriptionsResultUserUnderscoreid", "user_id")
      , ("usageAudioTranscriptionsResultApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageAudioTranscriptionsResultModel", "model")
      ]


-- | The aggregated code interpreter sessions usage details of the specific time bucket.
data UsageCodeInterpreterSessionsResult = UsageCodeInterpreterSessionsResult
  { usageCodeInterpreterSessionsResultObject :: Text -- ^ 
  , usageCodeInterpreterSessionsResultSessions :: Int -- ^ The number of code interpreter sessions.
  , usageCodeInterpreterSessionsResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageCodeInterpreterSessionsResult where
  parseJSON = genericParseJSON optionsUsageCodeInterpreterSessionsResult
instance ToJSON UsageCodeInterpreterSessionsResult where
  toJSON = genericToJSON optionsUsageCodeInterpreterSessionsResult

optionsUsageCodeInterpreterSessionsResult :: Options
optionsUsageCodeInterpreterSessionsResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageCodeInterpreterSessionsResultObject", "object")
      , ("usageCodeInterpreterSessionsResultSessions", "sessions")
      , ("usageCodeInterpreterSessionsResultProjectUnderscoreid", "project_id")
      ]


-- | The aggregated completions usage details of the specific time bucket.
data UsageCompletionsResult = UsageCompletionsResult
  { usageCompletionsResultObject :: Text -- ^ 
  , usageCompletionsResultInputUnderscoretokens :: Int -- ^ The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
  , usageCompletionsResultInputUnderscorecachedUnderscoretokens :: Maybe Int -- ^ The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  , usageCompletionsResultOutputUnderscoretokens :: Int -- ^ The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  , usageCompletionsResultInputUnderscoreaudioUnderscoretokens :: Maybe Int -- ^ The aggregated number of audio input tokens used, including cached tokens.
  , usageCompletionsResultOutputUnderscoreaudioUnderscoretokens :: Maybe Int -- ^ The aggregated number of audio output tokens used.
  , usageCompletionsResultNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageCompletionsResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  , usageCompletionsResultUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageCompletionsResultApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageCompletionsResultModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  , usageCompletionsResultBatch :: Maybe Bool -- ^ When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageCompletionsResult where
  parseJSON = genericParseJSON optionsUsageCompletionsResult
instance ToJSON UsageCompletionsResult where
  toJSON = genericToJSON optionsUsageCompletionsResult

optionsUsageCompletionsResult :: Options
optionsUsageCompletionsResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageCompletionsResultObject", "object")
      , ("usageCompletionsResultInputUnderscoretokens", "input_tokens")
      , ("usageCompletionsResultInputUnderscorecachedUnderscoretokens", "input_cached_tokens")
      , ("usageCompletionsResultOutputUnderscoretokens", "output_tokens")
      , ("usageCompletionsResultInputUnderscoreaudioUnderscoretokens", "input_audio_tokens")
      , ("usageCompletionsResultOutputUnderscoreaudioUnderscoretokens", "output_audio_tokens")
      , ("usageCompletionsResultNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageCompletionsResultProjectUnderscoreid", "project_id")
      , ("usageCompletionsResultUserUnderscoreid", "user_id")
      , ("usageCompletionsResultApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageCompletionsResultModel", "model")
      , ("usageCompletionsResultBatch", "batch")
      ]


-- | The aggregated embeddings usage details of the specific time bucket.
data UsageEmbeddingsResult = UsageEmbeddingsResult
  { usageEmbeddingsResultObject :: Text -- ^ 
  , usageEmbeddingsResultInputUnderscoretokens :: Int -- ^ The aggregated number of input tokens used.
  , usageEmbeddingsResultNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageEmbeddingsResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  , usageEmbeddingsResultUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageEmbeddingsResultApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageEmbeddingsResultModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageEmbeddingsResult where
  parseJSON = genericParseJSON optionsUsageEmbeddingsResult
instance ToJSON UsageEmbeddingsResult where
  toJSON = genericToJSON optionsUsageEmbeddingsResult

optionsUsageEmbeddingsResult :: Options
optionsUsageEmbeddingsResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageEmbeddingsResultObject", "object")
      , ("usageEmbeddingsResultInputUnderscoretokens", "input_tokens")
      , ("usageEmbeddingsResultNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageEmbeddingsResultProjectUnderscoreid", "project_id")
      , ("usageEmbeddingsResultUserUnderscoreid", "user_id")
      , ("usageEmbeddingsResultApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageEmbeddingsResultModel", "model")
      ]


-- | The aggregated images usage details of the specific time bucket.
data UsageImagesResult = UsageImagesResult
  { usageImagesResultObject :: Text -- ^ 
  , usageImagesResultImages :: Int -- ^ The number of images processed.
  , usageImagesResultNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageImagesResultSource :: Maybe Text -- ^ When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  , usageImagesResultSize :: Maybe Text -- ^ When `group_by=size`, this field provides the image size of the grouped usage result.
  , usageImagesResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  , usageImagesResultUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageImagesResultApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageImagesResultModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageImagesResult where
  parseJSON = genericParseJSON optionsUsageImagesResult
instance ToJSON UsageImagesResult where
  toJSON = genericToJSON optionsUsageImagesResult

optionsUsageImagesResult :: Options
optionsUsageImagesResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageImagesResultObject", "object")
      , ("usageImagesResultImages", "images")
      , ("usageImagesResultNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageImagesResultSource", "source")
      , ("usageImagesResultSize", "size")
      , ("usageImagesResultProjectUnderscoreid", "project_id")
      , ("usageImagesResultUserUnderscoreid", "user_id")
      , ("usageImagesResultApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageImagesResultModel", "model")
      ]


-- | The aggregated moderations usage details of the specific time bucket.
data UsageModerationsResult = UsageModerationsResult
  { usageModerationsResultObject :: Text -- ^ 
  , usageModerationsResultInputUnderscoretokens :: Int -- ^ The aggregated number of input tokens used.
  , usageModerationsResultNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageModerationsResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  , usageModerationsResultUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageModerationsResultApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageModerationsResultModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageModerationsResult where
  parseJSON = genericParseJSON optionsUsageModerationsResult
instance ToJSON UsageModerationsResult where
  toJSON = genericToJSON optionsUsageModerationsResult

optionsUsageModerationsResult :: Options
optionsUsageModerationsResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageModerationsResultObject", "object")
      , ("usageModerationsResultInputUnderscoretokens", "input_tokens")
      , ("usageModerationsResultNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageModerationsResultProjectUnderscoreid", "project_id")
      , ("usageModerationsResultUserUnderscoreid", "user_id")
      , ("usageModerationsResultApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageModerationsResultModel", "model")
      ]


-- | 
data UsageResponse = UsageResponse
  { usageResponseObject :: Text -- ^ 
  , usageResponseData :: [UsageTimeBucket] -- ^ 
  , usageResponseHasUnderscoremore :: Bool -- ^ 
  , usageResponseNextUnderscorepage :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UsageResponse where
  parseJSON = genericParseJSON optionsUsageResponse
instance ToJSON UsageResponse where
  toJSON = genericToJSON optionsUsageResponse

optionsUsageResponse :: Options
optionsUsageResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageResponseObject", "object")
      , ("usageResponseData", "data")
      , ("usageResponseHasUnderscoremore", "has_more")
      , ("usageResponseNextUnderscorepage", "next_page")
      ]


-- | 
data UsageTimeBucket = UsageTimeBucket
  { usageTimeBucketObject :: Text -- ^ 
  , usageTimeBucketStartUnderscoretime :: Int -- ^ 
  , usageTimeBucketEndUnderscoretime :: Int -- ^ 
  , usageTimeBucketResult :: [UsageTimeBucketResultInner] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UsageTimeBucket where
  parseJSON = genericParseJSON optionsUsageTimeBucket
instance ToJSON UsageTimeBucket where
  toJSON = genericToJSON optionsUsageTimeBucket

optionsUsageTimeBucket :: Options
optionsUsageTimeBucket =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageTimeBucketObject", "object")
      , ("usageTimeBucketStartUnderscoretime", "start_time")
      , ("usageTimeBucketEndUnderscoretime", "end_time")
      , ("usageTimeBucketResult", "result")
      ]


-- | 
data UsageTimeBucketResultInner = UsageTimeBucketResultInner
  { usageTimeBucketResultInnerObject :: Text -- ^ 
  , usageTimeBucketResultInnerInputUnderscoretokens :: Int -- ^ The aggregated number of input tokens used.
  , usageTimeBucketResultInnerInputUnderscorecachedUnderscoretokens :: Maybe Int -- ^ The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
  , usageTimeBucketResultInnerOutputUnderscoretokens :: Int -- ^ The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
  , usageTimeBucketResultInnerInputUnderscoreaudioUnderscoretokens :: Maybe Int -- ^ The aggregated number of audio input tokens used, including cached tokens.
  , usageTimeBucketResultInnerOutputUnderscoreaudioUnderscoretokens :: Maybe Int -- ^ The aggregated number of audio output tokens used.
  , usageTimeBucketResultInnerNumUnderscoremodelUnderscorerequests :: Int -- ^ The count of requests made to the model.
  , usageTimeBucketResultInnerProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped costs result.
  , usageTimeBucketResultInnerUserUnderscoreid :: Maybe Text -- ^ When `group_by=user_id`, this field provides the user ID of the grouped usage result.
  , usageTimeBucketResultInnerApiUnderscorekeyUnderscoreid :: Maybe Text -- ^ When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
  , usageTimeBucketResultInnerModel :: Maybe Text -- ^ When `group_by=model`, this field provides the model name of the grouped usage result.
  , usageTimeBucketResultInnerBatch :: Maybe Bool -- ^ When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
  , usageTimeBucketResultInnerImages :: Int -- ^ The number of images processed.
  , usageTimeBucketResultInnerSource :: Maybe Text -- ^ When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
  , usageTimeBucketResultInnerSize :: Maybe Text -- ^ When `group_by=size`, this field provides the image size of the grouped usage result.
  , usageTimeBucketResultInnerCharacters :: Int -- ^ The number of characters processed.
  , usageTimeBucketResultInnerSeconds :: Int -- ^ The number of seconds processed.
  , usageTimeBucketResultInnerUsageUnderscorebytes :: Int -- ^ The vector stores usage in bytes.
  , usageTimeBucketResultInnerSessions :: Int -- ^ The number of code interpreter sessions.
  , usageTimeBucketResultInnerAmount :: Maybe CostsResultAmount -- ^ 
  , usageTimeBucketResultInnerLineUnderscoreitem :: Maybe Text -- ^ When `group_by=line_item`, this field provides the line item of the grouped costs result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageTimeBucketResultInner where
  parseJSON = genericParseJSON optionsUsageTimeBucketResultInner
instance ToJSON UsageTimeBucketResultInner where
  toJSON = genericToJSON optionsUsageTimeBucketResultInner

optionsUsageTimeBucketResultInner :: Options
optionsUsageTimeBucketResultInner =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageTimeBucketResultInnerObject", "object")
      , ("usageTimeBucketResultInnerInputUnderscoretokens", "input_tokens")
      , ("usageTimeBucketResultInnerInputUnderscorecachedUnderscoretokens", "input_cached_tokens")
      , ("usageTimeBucketResultInnerOutputUnderscoretokens", "output_tokens")
      , ("usageTimeBucketResultInnerInputUnderscoreaudioUnderscoretokens", "input_audio_tokens")
      , ("usageTimeBucketResultInnerOutputUnderscoreaudioUnderscoretokens", "output_audio_tokens")
      , ("usageTimeBucketResultInnerNumUnderscoremodelUnderscorerequests", "num_model_requests")
      , ("usageTimeBucketResultInnerProjectUnderscoreid", "project_id")
      , ("usageTimeBucketResultInnerUserUnderscoreid", "user_id")
      , ("usageTimeBucketResultInnerApiUnderscorekeyUnderscoreid", "api_key_id")
      , ("usageTimeBucketResultInnerModel", "model")
      , ("usageTimeBucketResultInnerBatch", "batch")
      , ("usageTimeBucketResultInnerImages", "images")
      , ("usageTimeBucketResultInnerSource", "source")
      , ("usageTimeBucketResultInnerSize", "size")
      , ("usageTimeBucketResultInnerCharacters", "characters")
      , ("usageTimeBucketResultInnerSeconds", "seconds")
      , ("usageTimeBucketResultInnerUsageUnderscorebytes", "usage_bytes")
      , ("usageTimeBucketResultInnerSessions", "sessions")
      , ("usageTimeBucketResultInnerAmount", "amount")
      , ("usageTimeBucketResultInnerLineUnderscoreitem", "line_item")
      ]


-- | The aggregated vector stores usage details of the specific time bucket.
data UsageVectorStoresResult = UsageVectorStoresResult
  { usageVectorStoresResultObject :: Text -- ^ 
  , usageVectorStoresResultUsageUnderscorebytes :: Int -- ^ The vector stores usage in bytes.
  , usageVectorStoresResultProjectUnderscoreid :: Maybe Text -- ^ When `group_by=project_id`, this field provides the project ID of the grouped usage result.
  } deriving (Show, Eq, Generic)

instance FromJSON UsageVectorStoresResult where
  parseJSON = genericParseJSON optionsUsageVectorStoresResult
instance ToJSON UsageVectorStoresResult where
  toJSON = genericToJSON optionsUsageVectorStoresResult

optionsUsageVectorStoresResult :: Options
optionsUsageVectorStoresResult =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("usageVectorStoresResultObject", "object")
      , ("usageVectorStoresResultUsageUnderscorebytes", "usage_bytes")
      , ("usageVectorStoresResultProjectUnderscoreid", "project_id")
      ]


-- | Represents an individual &#x60;user&#x60; within an organization.
data User = User
  { userObject :: Text -- ^ The object type, which is always `organization.user`
  , userId :: Text -- ^ The identifier, which can be referenced in API endpoints
  , userName :: Text -- ^ The name of the user
  , userEmail :: Text -- ^ The email address of the user
  , userRole :: Text -- ^ `owner` or `reader`
  , userAddedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) of when the user was added.
  } deriving (Show, Eq, Generic)

instance FromJSON User where
  parseJSON = genericParseJSON optionsUser
instance ToJSON User where
  toJSON = genericToJSON optionsUser

optionsUser :: Options
optionsUser =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userObject", "object")
      , ("userId", "id")
      , ("userName", "name")
      , ("userEmail", "email")
      , ("userRole", "role")
      , ("userAddedUnderscoreat", "added_at")
      ]


-- | 
data UserDeleteResponse = UserDeleteResponse
  { userDeleteResponseObject :: Text -- ^ 
  , userDeleteResponseId :: Text -- ^ 
  , userDeleteResponseDeleted :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UserDeleteResponse where
  parseJSON = genericParseJSON optionsUserDeleteResponse
instance ToJSON UserDeleteResponse where
  toJSON = genericToJSON optionsUserDeleteResponse

optionsUserDeleteResponse :: Options
optionsUserDeleteResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userDeleteResponseObject", "object")
      , ("userDeleteResponseId", "id")
      , ("userDeleteResponseDeleted", "deleted")
      ]


-- | 
data UserListResponse = UserListResponse
  { userListResponseObject :: Text -- ^ 
  , userListResponseData :: [User] -- ^ 
  , userListResponseFirstUnderscoreid :: Text -- ^ 
  , userListResponseLastUnderscoreid :: Text -- ^ 
  , userListResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON UserListResponse where
  parseJSON = genericParseJSON optionsUserListResponse
instance ToJSON UserListResponse where
  toJSON = genericToJSON optionsUserListResponse

optionsUserListResponse :: Options
optionsUserListResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userListResponseObject", "object")
      , ("userListResponseData", "data")
      , ("userListResponseFirstUnderscoreid", "first_id")
      , ("userListResponseLastUnderscoreid", "last_id")
      , ("userListResponseHasUnderscoremore", "has_more")
      ]


-- | 
data UserRoleUpdateRequest = UserRoleUpdateRequest
  { userRoleUpdateRequestRole :: Text -- ^ `owner` or `reader`
  } deriving (Show, Eq, Generic)

instance FromJSON UserRoleUpdateRequest where
  parseJSON = genericParseJSON optionsUserRoleUpdateRequest
instance ToJSON UserRoleUpdateRequest where
  toJSON = genericToJSON optionsUserRoleUpdateRequest

optionsUserRoleUpdateRequest :: Options
optionsUserRoleUpdateRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("userRoleUpdateRequestRole", "role")
      ]


-- | The expiration policy for a vector store.
data VectorStoreExpirationAfter = VectorStoreExpirationAfter
  { vectorStoreExpirationAfterAnchor :: Text -- ^ Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
  , vectorStoreExpirationAfterDays :: Int -- ^ The number of days after the anchor time that the vector store will expire.
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreExpirationAfter where
  parseJSON = genericParseJSON optionsVectorStoreExpirationAfter
instance ToJSON VectorStoreExpirationAfter where
  toJSON = genericToJSON optionsVectorStoreExpirationAfter

optionsVectorStoreExpirationAfter :: Options
optionsVectorStoreExpirationAfter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreExpirationAfterAnchor", "anchor")
      , ("vectorStoreExpirationAfterDays", "days")
      ]


-- | A batch of files attached to a vector store.
data VectorStoreFileBatchObject = VectorStoreFileBatchObject
  { vectorStoreFileBatchObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , vectorStoreFileBatchObjectObject :: Text -- ^ The object type, which is always `vector_store.file_batch`.
  , vectorStoreFileBatchObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the vector store files batch was created.
  , vectorStoreFileBatchObjectVectorUnderscorestoreUnderscoreid :: Text -- ^ The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  , vectorStoreFileBatchObjectStatus :: Text -- ^ The status of the vector store files batch, which can be either `in_progress`, `completed`, `cancelled` or `failed`.
  , vectorStoreFileBatchObjectFileUnderscorecounts :: VectorStoreFileBatchObjectFileCounts -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreFileBatchObject where
  parseJSON = genericParseJSON optionsVectorStoreFileBatchObject
instance ToJSON VectorStoreFileBatchObject where
  toJSON = genericToJSON optionsVectorStoreFileBatchObject

optionsVectorStoreFileBatchObject :: Options
optionsVectorStoreFileBatchObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreFileBatchObjectId", "id")
      , ("vectorStoreFileBatchObjectObject", "object")
      , ("vectorStoreFileBatchObjectCreatedUnderscoreat", "created_at")
      , ("vectorStoreFileBatchObjectVectorUnderscorestoreUnderscoreid", "vector_store_id")
      , ("vectorStoreFileBatchObjectStatus", "status")
      , ("vectorStoreFileBatchObjectFileUnderscorecounts", "file_counts")
      ]


-- | 
data VectorStoreFileBatchObjectFileCounts = VectorStoreFileBatchObjectFileCounts
  { vectorStoreFileBatchObjectFileCountsInUnderscoreprogress :: Int -- ^ The number of files that are currently being processed.
  , vectorStoreFileBatchObjectFileCountsCompleted :: Int -- ^ The number of files that have been processed.
  , vectorStoreFileBatchObjectFileCountsFailed :: Int -- ^ The number of files that have failed to process.
  , vectorStoreFileBatchObjectFileCountsCancelled :: Int -- ^ The number of files that where cancelled.
  , vectorStoreFileBatchObjectFileCountsTotal :: Int -- ^ The total number of files.
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreFileBatchObjectFileCounts where
  parseJSON = genericParseJSON optionsVectorStoreFileBatchObjectFileCounts
instance ToJSON VectorStoreFileBatchObjectFileCounts where
  toJSON = genericToJSON optionsVectorStoreFileBatchObjectFileCounts

optionsVectorStoreFileBatchObjectFileCounts :: Options
optionsVectorStoreFileBatchObjectFileCounts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreFileBatchObjectFileCountsInUnderscoreprogress", "in_progress")
      , ("vectorStoreFileBatchObjectFileCountsCompleted", "completed")
      , ("vectorStoreFileBatchObjectFileCountsFailed", "failed")
      , ("vectorStoreFileBatchObjectFileCountsCancelled", "cancelled")
      , ("vectorStoreFileBatchObjectFileCountsTotal", "total")
      ]


-- | A list of files attached to a vector store.
data VectorStoreFileObject = VectorStoreFileObject
  { vectorStoreFileObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , vectorStoreFileObjectObject :: Text -- ^ The object type, which is always `vector_store.file`.
  , vectorStoreFileObjectUsageUnderscorebytes :: Int -- ^ The total vector store usage in bytes. Note that this may be different from the original file size.
  , vectorStoreFileObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the vector store file was created.
  , vectorStoreFileObjectVectorUnderscorestoreUnderscoreid :: Text -- ^ The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to.
  , vectorStoreFileObjectStatus :: Text -- ^ The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use.
  , vectorStoreFileObjectLastUnderscoreerror :: VectorStoreFileObjectLastError -- ^ 
  , vectorStoreFileObjectChunkingUnderscorestrategy :: Maybe VectorStoreFileObjectChunkingStrategy -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreFileObject where
  parseJSON = genericParseJSON optionsVectorStoreFileObject
instance ToJSON VectorStoreFileObject where
  toJSON = genericToJSON optionsVectorStoreFileObject

optionsVectorStoreFileObject :: Options
optionsVectorStoreFileObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreFileObjectId", "id")
      , ("vectorStoreFileObjectObject", "object")
      , ("vectorStoreFileObjectUsageUnderscorebytes", "usage_bytes")
      , ("vectorStoreFileObjectCreatedUnderscoreat", "created_at")
      , ("vectorStoreFileObjectVectorUnderscorestoreUnderscoreid", "vector_store_id")
      , ("vectorStoreFileObjectStatus", "status")
      , ("vectorStoreFileObjectLastUnderscoreerror", "last_error")
      , ("vectorStoreFileObjectChunkingUnderscorestrategy", "chunking_strategy")
      ]


-- | The strategy used to chunk the file.
data VectorStoreFileObjectChunkingStrategy = VectorStoreFileObjectChunkingStrategy
  { vectorStoreFileObjectChunkingStrategyType :: Text -- ^ Always `static`.
  , vectorStoreFileObjectChunkingStrategyStatic :: StaticChunkingStrategy -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreFileObjectChunkingStrategy where
  parseJSON = genericParseJSON optionsVectorStoreFileObjectChunkingStrategy
instance ToJSON VectorStoreFileObjectChunkingStrategy where
  toJSON = genericToJSON optionsVectorStoreFileObjectChunkingStrategy

optionsVectorStoreFileObjectChunkingStrategy :: Options
optionsVectorStoreFileObjectChunkingStrategy =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreFileObjectChunkingStrategyType", "type")
      , ("vectorStoreFileObjectChunkingStrategyStatic", "static")
      ]


-- | The last error associated with this vector store file. Will be &#x60;null&#x60; if there are no errors.
data VectorStoreFileObjectLastError = VectorStoreFileObjectLastError
  { vectorStoreFileObjectLastErrorCode :: Text -- ^ One of `server_error` or `rate_limit_exceeded`.
  , vectorStoreFileObjectLastErrorMessage :: Text -- ^ A human-readable description of the error.
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreFileObjectLastError where
  parseJSON = genericParseJSON optionsVectorStoreFileObjectLastError
instance ToJSON VectorStoreFileObjectLastError where
  toJSON = genericToJSON optionsVectorStoreFileObjectLastError

optionsVectorStoreFileObjectLastError :: Options
optionsVectorStoreFileObjectLastError =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreFileObjectLastErrorCode", "code")
      , ("vectorStoreFileObjectLastErrorMessage", "message")
      ]


-- | A vector store is a collection of processed files can be used by the &#x60;file_search&#x60; tool.
data VectorStoreObject = VectorStoreObject
  { vectorStoreObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , vectorStoreObjectObject :: Text -- ^ The object type, which is always `vector_store`.
  , vectorStoreObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the vector store was created.
  , vectorStoreObjectName :: Text -- ^ The name of the vector store.
  , vectorStoreObjectUsageUnderscorebytes :: Int -- ^ The total number of bytes used by the files in the vector store.
  , vectorStoreObjectFileUnderscorecounts :: VectorStoreObjectFileCounts -- ^ 
  , vectorStoreObjectStatus :: Text -- ^ The status of the vector store, which can be either `expired`, `in_progress`, or `completed`. A status of `completed` indicates that the vector store is ready for use.
  , vectorStoreObjectExpiresUnderscoreafter :: Maybe VectorStoreExpirationAfter -- ^ 
  , vectorStoreObjectExpiresUnderscoreat :: Maybe Int -- ^ The Unix timestamp (in seconds) for when the vector store will expire.
  , vectorStoreObjectLastUnderscoreactiveUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the vector store was last active.
  , vectorStoreObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreObject where
  parseJSON = genericParseJSON optionsVectorStoreObject
instance ToJSON VectorStoreObject where
  toJSON = genericToJSON optionsVectorStoreObject

optionsVectorStoreObject :: Options
optionsVectorStoreObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreObjectId", "id")
      , ("vectorStoreObjectObject", "object")
      , ("vectorStoreObjectCreatedUnderscoreat", "created_at")
      , ("vectorStoreObjectName", "name")
      , ("vectorStoreObjectUsageUnderscorebytes", "usage_bytes")
      , ("vectorStoreObjectFileUnderscorecounts", "file_counts")
      , ("vectorStoreObjectStatus", "status")
      , ("vectorStoreObjectExpiresUnderscoreafter", "expires_after")
      , ("vectorStoreObjectExpiresUnderscoreat", "expires_at")
      , ("vectorStoreObjectLastUnderscoreactiveUnderscoreat", "last_active_at")
      , ("vectorStoreObjectMetadata", "metadata")
      ]


-- | 
data VectorStoreObjectFileCounts = VectorStoreObjectFileCounts
  { vectorStoreObjectFileCountsInUnderscoreprogress :: Int -- ^ The number of files that are currently being processed.
  , vectorStoreObjectFileCountsCompleted :: Int -- ^ The number of files that have been successfully processed.
  , vectorStoreObjectFileCountsFailed :: Int -- ^ The number of files that have failed to process.
  , vectorStoreObjectFileCountsCancelled :: Int -- ^ The number of files that were cancelled.
  , vectorStoreObjectFileCountsTotal :: Int -- ^ The total number of files.
  } deriving (Show, Eq, Generic)

instance FromJSON VectorStoreObjectFileCounts where
  parseJSON = genericParseJSON optionsVectorStoreObjectFileCounts
instance ToJSON VectorStoreObjectFileCounts where
  toJSON = genericToJSON optionsVectorStoreObjectFileCounts

optionsVectorStoreObjectFileCounts :: Options
optionsVectorStoreObjectFileCounts =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("vectorStoreObjectFileCountsInUnderscoreprogress", "in_progress")
      , ("vectorStoreObjectFileCountsCompleted", "completed")
      , ("vectorStoreObjectFileCountsFailed", "failed")
      , ("vectorStoreObjectFileCountsCancelled", "cancelled")
      , ("vectorStoreObjectFileCountsTotal", "total")
      ]

