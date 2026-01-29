{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module OpenAIAPI.Types (
  AssistantFileObject (..),
  AssistantObject (..),
  AssistantObjectToolsInner (..),
  AssistantStreamEvent (..),
  AssistantToolsCode (..),
  AssistantToolsFunction (..),
  AssistantToolsRetrieval (..),
  AssistantsApiNamedToolChoice (..),
  AssistantsApiResponseFormat (..),
  AssistantsApiResponseFormatOption (..),
  AssistantsApiToolChoiceOption (..),
  ChatCompletionFunctionCallOption (..),
  ChatCompletionFunctions (..),
  ChatCompletionMessageToolCall (..),
  ChatCompletionMessageToolCallChunk (..),
  ChatCompletionMessageToolCallChunkFunction (..),
  ChatCompletionMessageToolCallFunction (..),
  ChatCompletionNamedToolChoice (..),
  ChatCompletionNamedToolChoiceFunction (..),
  ChatCompletionRequestAssistantMessage (..),
  ChatCompletionRequestAssistantMessageFunctionCall (..),
  ChatCompletionRequestFunctionMessage (..),
  ChatCompletionRequestMessage (..),
  ChatCompletionRequestMessageContentPart (..),
  ChatCompletionRequestMessageContentPartImage (..),
  ChatCompletionRequestMessageContentPartImageImageUrl (..),
  ChatCompletionRequestMessageContentPartText (..),
  ChatCompletionRequestSystemMessage (..),
  ChatCompletionRequestToolMessage (..),
  ChatCompletionRequestUserMessage (..),
  ChatCompletionRequestUserMessageContent (..),
  ChatCompletionResponseMessage (..),
  ChatCompletionRole (..),
  ChatCompletionStreamResponseDelta (..),
  ChatCompletionStreamResponseDeltaFunctionCall (..),
  ChatCompletionTokenLogprob (..),
  ChatCompletionTokenLogprobTopLogprobsInner (..),
  ChatCompletionTool (..),
  ChatCompletionToolChoiceOption (..),
  CompletionUsage (..),
  CreateAssistantFileRequest (..),
  CreateAssistantRequest (..),
  CreateAssistantRequestModel (..),
  CreateChatCompletionFunctionResponse (..),
  CreateChatCompletionFunctionResponseChoicesInner (..),
  CreateChatCompletionRequest (..),
  CreateChatCompletionRequestFunctionCall (..),
  CreateChatCompletionRequestModel (..),
  CreateChatCompletionRequestResponseFormat (..),
  CreateChatCompletionRequestStop (..),
  CreateChatCompletionResponse (..),
  CreateChatCompletionResponseChoicesInner (..),
  CreateChatCompletionResponseChoicesInnerLogprobs (..),
  CreateChatCompletionStreamResponse (..),
  CreateChatCompletionStreamResponseChoicesInner (..),
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
  CreateModerationRequest (..),
  CreateModerationRequestInput (..),
  CreateModerationRequestModel (..),
  CreateModerationResponse (..),
  CreateModerationResponseResultsInner (..),
  CreateModerationResponseResultsInnerCategories (..),
  CreateModerationResponseResultsInnerCategoryScores (..),
  CreateRunRequest (..),
  CreateRunRequestModel (..),
  CreateSpeechRequest (..),
  CreateSpeechRequestModel (..),
  CreateThreadAndRunRequest (..),
  CreateThreadAndRunRequestToolsInner (..),
  CreateThreadRequest (..),
  CreateTranscription200Response (..),
  CreateTranscriptionRequestModel (..),
  CreateTranscriptionResponseJson (..),
  CreateTranscriptionResponseVerboseJson (..),
  CreateTranslation200Response (..),
  CreateTranslationResponseJson (..),
  CreateTranslationResponseVerboseJson (..),
  DeleteAssistantFileResponse (..),
  DeleteAssistantResponse (..),
  DeleteFileResponse (..),
  DeleteMessageResponse (..),
  DeleteModelResponse (..),
  DeleteThreadResponse (..),
  DoneEvent (..),
  Embedding (..),
  Error (..),
  ErrorEvent (..),
  ErrorResponse (..),
  FineTuningIntegration (..),
  FineTuningJob (..),
  FineTuningJobCheckpoint (..),
  FineTuningJobCheckpointMetrics (..),
  FineTuningJobError (..),
  FineTuningJobEvent (..),
  FineTuningJobHyperparameters (..),
  FineTuningJobHyperparametersNEpochs (..),
  FineTuningJobIntegrationsInner (..),
  FunctionObject (..),
  Image (..),
  ImagesResponse (..),
  ListAssistantFilesResponse (..),
  ListAssistantsResponse (..),
  ListFilesResponse (..),
  ListFineTuningJobCheckpointsResponse (..),
  ListFineTuningJobEventsResponse (..),
  ListMessageFilesResponse (..),
  ListMessagesResponse (..),
  ListModelsResponse (..),
  ListPaginatedFineTuningJobsResponse (..),
  ListRunStepsResponse (..),
  ListRunsResponse (..),
  ListThreadsResponse (..),
  MessageContentImageFileObject (..),
  MessageContentImageFileObjectImageFile (..),
  MessageContentTextAnnotationsFileCitationObject (..),
  MessageContentTextAnnotationsFileCitationObjectFileCitation (..),
  MessageContentTextAnnotationsFilePathObject (..),
  MessageContentTextAnnotationsFilePathObjectFilePath (..),
  MessageContentTextObject (..),
  MessageContentTextObjectText (..),
  MessageContentTextObjectTextAnnotationsInner (..),
  MessageDeltaContentImageFileObject (..),
  MessageDeltaContentImageFileObjectImageFile (..),
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
  MessageFileObject (..),
  MessageObject (..),
  MessageObjectContentInner (..),
  MessageObjectIncompleteDetails (..),
  MessageStreamEvent (..),
  MessageStreamEventOneOf (..),
  MessageStreamEventOneOf1 (..),
  MessageStreamEventOneOf2 (..),
  MessageStreamEventOneOf3 (..),
  MessageStreamEventOneOf4 (..),
  Model (..),
  ModifyAssistantRequest (..),
  ModifyMessageRequest (..),
  ModifyRunRequest (..),
  ModifyThreadRequest (..),
  OpenAIFile (..),
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
  RunStepDeltaStepDetailsToolCallsFunctionObject (..),
  RunStepDeltaStepDetailsToolCallsFunctionObjectFunction (..),
  RunStepDeltaStepDetailsToolCallsObject (..),
  RunStepDeltaStepDetailsToolCallsObjectToolCallsInner (..),
  RunStepDeltaStepDetailsToolCallsRetrievalObject (..),
  RunStepDetailsMessageCreationObject (..),
  RunStepDetailsMessageCreationObjectMessageCreation (..),
  RunStepDetailsToolCallsCodeObject (..),
  RunStepDetailsToolCallsCodeObjectCodeInterpreter (..),
  RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner (..),
  RunStepDetailsToolCallsCodeOutputImageObject (..),
  RunStepDetailsToolCallsCodeOutputImageObjectImage (..),
  RunStepDetailsToolCallsCodeOutputLogsObject (..),
  RunStepDetailsToolCallsFunctionObject (..),
  RunStepDetailsToolCallsFunctionObjectFunction (..),
  RunStepDetailsToolCallsObject (..),
  RunStepDetailsToolCallsObjectToolCallsInner (..),
  RunStepDetailsToolCallsRetrievalObject (..),
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
  RunToolCallObject (..),
  RunToolCallObjectFunction (..),
  SubmitToolOutputsRunRequest (..),
  SubmitToolOutputsRunRequestToolOutputsInner (..),
  ThreadObject (..),
  ThreadStreamEvent (..),
  TranscriptionSegment (..),
  TranscriptionWord (..),
  TruncationObject (..),
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


-- | A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
data AssistantFileObject = AssistantFileObject
  { assistantFileObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , assistantFileObjectObject :: Text -- ^ The object type, which is always `assistant.file`.
  , assistantFileObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the assistant file was created.
  , assistantFileObjectAssistantUnderscoreid :: Text -- ^ The assistant ID that the file is attached to.
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantFileObject where
  parseJSON = genericParseJSON optionsAssistantFileObject
instance ToJSON AssistantFileObject where
  toJSON = genericToJSON optionsAssistantFileObject

optionsAssistantFileObject :: Options
optionsAssistantFileObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantFileObjectId", "id")
      , ("assistantFileObjectObject", "object")
      , ("assistantFileObjectCreatedUnderscoreat", "created_at")
      , ("assistantFileObjectAssistantUnderscoreid", "assistant_id")
      ]


-- | Represents an &#x60;assistant&#x60; that can call the model and use tools.
data AssistantObject = AssistantObject
  { assistantObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , assistantObjectObject :: Text -- ^ The object type, which is always `assistant`.
  , assistantObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the assistant was created.
  , assistantObjectName :: Text -- ^ The name of the assistant. The maximum length is 256 characters. 
  , assistantObjectDescription :: Text -- ^ The description of the assistant. The maximum length is 512 characters. 
  , assistantObjectModel :: Text -- ^ ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
  , assistantObjectInstructions :: Text -- ^ The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  , assistantObjectTools :: [AssistantObjectToolsInner] -- ^ A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
  , assistantObjectFileUnderscoreids :: [Text] -- ^ A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
  , assistantObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("assistantObjectFileUnderscoreids", "file_ids")
      , ("assistantObjectMetadata", "metadata")
      ]


-- | 
data AssistantObjectToolsInner = AssistantObjectToolsInner
  { assistantObjectToolsInnerType :: Text -- ^ The type of tool being defined: `code_interpreter`
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
      , ("assistantObjectToolsInnerFunction", "function")
      ]


-- | Represents an event emitted when streaming a Run.  Each event in a server-sent events stream has an &#x60;event&#x60; and &#x60;data&#x60; property:  &#x60;&#x60;&#x60; event: thread.created data: {\&quot;id\&quot;: \&quot;thread_123\&quot;, \&quot;object\&quot;: \&quot;thread\&quot;, ...} &#x60;&#x60;&#x60;  We emit events whenever a new object is created, transitions to a new state, or is being streamed in parts (deltas). For example, we emit &#x60;thread.run.created&#x60; when a new run is created, &#x60;thread.run.completed&#x60; when a run completes, and so on. When an Assistant chooses to create a message during a run, we emit a &#x60;thread.message.created event&#x60;, a &#x60;thread.message.in_progress&#x60; event, many &#x60;thread.message.delta&#x60; events, and finally a &#x60;thread.message.completed&#x60; event.  We may add additional events over time, so we recommend handling unknown events gracefully in your code. See the [Assistants API quickstart](/docs/assistants/overview) to learn how to integrate the Assistants API with streaming. 
data AssistantStreamEvent = AssistantStreamEvent
  { assistantStreamEventEvent :: Text -- ^ 
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
      [ ("assistantStreamEventEvent", "event")
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


-- | 
data AssistantToolsRetrieval = AssistantToolsRetrieval
  { assistantToolsRetrievalType :: Text -- ^ The type of tool being defined: `retrieval`
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantToolsRetrieval where
  parseJSON = genericParseJSON optionsAssistantToolsRetrieval
instance ToJSON AssistantToolsRetrieval where
  toJSON = genericToJSON optionsAssistantToolsRetrieval

optionsAssistantToolsRetrieval :: Options
optionsAssistantToolsRetrieval =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantToolsRetrievalType", "type")
      ]


-- | Specifies a tool the model should use. Use to force the model to call a specific tool.
data AssistantsApiNamedToolChoice = AssistantsApiNamedToolChoice
  { assistantsApiNamedToolChoiceType :: Text -- ^ The type of the tool. If type is `function`, the function name must be set
  , assistantsApiNamedToolChoiceFunction :: Maybe ChatCompletionNamedToolChoiceFunction -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantsApiNamedToolChoice where
  parseJSON = genericParseJSON optionsAssistantsApiNamedToolChoice
instance ToJSON AssistantsApiNamedToolChoice where
  toJSON = genericToJSON optionsAssistantsApiNamedToolChoice

optionsAssistantsApiNamedToolChoice :: Options
optionsAssistantsApiNamedToolChoice =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantsApiNamedToolChoiceType", "type")
      , ("assistantsApiNamedToolChoiceFunction", "function")
      ]


-- | An object describing the expected output of the model. If &#x60;json_object&#x60; only &#x60;function&#x60; type &#x60;tools&#x60; are allowed to be passed to the Run. If &#x60;text&#x60; the model can return text or any value needed. 
data AssistantsApiResponseFormat = AssistantsApiResponseFormat
  { assistantsApiResponseFormatType :: Maybe Text -- ^ Must be one of `text` or `json_object`.
  } deriving (Show, Eq, Generic)

instance FromJSON AssistantsApiResponseFormat where
  parseJSON = genericParseJSON optionsAssistantsApiResponseFormat
instance ToJSON AssistantsApiResponseFormat where
  toJSON = genericToJSON optionsAssistantsApiResponseFormat

optionsAssistantsApiResponseFormat :: Options
optionsAssistantsApiResponseFormat =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("assistantsApiResponseFormatType", "type")
      ]


-- | Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
data AssistantsApiResponseFormatOption = AssistantsApiResponseFormatOption
  { assistantsApiResponseFormatOptionType :: Maybe Text -- ^ Must be one of `text` or `json_object`.
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
      ]


-- | Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling a tool. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;TOOL_TYPE\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
data AssistantsApiToolChoiceOption = AssistantsApiToolChoiceOption
  { assistantsApiToolChoiceOptionType :: Text -- ^ The type of the tool. If type is `function`, the function name must be set
  , assistantsApiToolChoiceOptionFunction :: Maybe ChatCompletionNamedToolChoiceFunction -- ^ 
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
  , chatCompletionFunctionsParameters :: Maybe (Map.Map String Value) -- ^ The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
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
  , chatCompletionNamedToolChoiceFunction :: ChatCompletionNamedToolChoiceFunction -- ^ 
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


-- | 
data ChatCompletionNamedToolChoiceFunction = ChatCompletionNamedToolChoiceFunction
  { chatCompletionNamedToolChoiceFunctionName :: Text -- ^ The name of the function to call.
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionNamedToolChoiceFunction where
  parseJSON = genericParseJSON optionsChatCompletionNamedToolChoiceFunction
instance ToJSON ChatCompletionNamedToolChoiceFunction where
  toJSON = genericToJSON optionsChatCompletionNamedToolChoiceFunction

optionsChatCompletionNamedToolChoiceFunction :: Options
optionsChatCompletionNamedToolChoiceFunction =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionNamedToolChoiceFunctionName", "name")
      ]


-- | 
data ChatCompletionRequestAssistantMessage = ChatCompletionRequestAssistantMessage
  { chatCompletionRequestAssistantMessageContent :: Maybe Text -- ^ The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
  , chatCompletionRequestAssistantMessageRole :: Text -- ^ The role of the messages author, in this case `assistant`.
  , chatCompletionRequestAssistantMessageName :: Maybe Text -- ^ An optional name for the participant. Provides the model information to differentiate between participants of the same role.
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
      , ("chatCompletionRequestAssistantMessageRole", "role")
      , ("chatCompletionRequestAssistantMessageName", "name")
      , ("chatCompletionRequestAssistantMessageToolUnderscorecalls", "tool_calls")
      , ("chatCompletionRequestAssistantMessageFunctionUnderscorecall", "function_call")
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
      , ("chatCompletionRequestMessageToolUnderscorecalls", "tool_calls")
      , ("chatCompletionRequestMessageFunctionUnderscorecall", "function_call")
      , ("chatCompletionRequestMessageToolUnderscorecallUnderscoreid", "tool_call_id")
      ]


-- | 
data ChatCompletionRequestMessageContentPart = ChatCompletionRequestMessageContentPart
  { chatCompletionRequestMessageContentPartType :: Text -- ^ The type of the content part.
  , chatCompletionRequestMessageContentPartText :: Text -- ^ The text content.
  , chatCompletionRequestMessageContentPartImageUnderscoreurl :: ChatCompletionRequestMessageContentPartImageImageUrl -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ChatCompletionRequestMessageContentPart where
  parseJSON = genericParseJSON optionsChatCompletionRequestMessageContentPart
instance ToJSON ChatCompletionRequestMessageContentPart where
  toJSON = genericToJSON optionsChatCompletionRequestMessageContentPart

optionsChatCompletionRequestMessageContentPart :: Options
optionsChatCompletionRequestMessageContentPart =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("chatCompletionRequestMessageContentPartType", "type")
      , ("chatCompletionRequestMessageContentPartText", "text")
      , ("chatCompletionRequestMessageContentPartImageUnderscoreurl", "image_url")
      ]


-- | 
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
  , chatCompletionRequestMessageContentPartImageImageUrlDetail :: Maybe Text -- ^ Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
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


-- | 
data ChatCompletionRequestSystemMessage = ChatCompletionRequestSystemMessage
  { chatCompletionRequestSystemMessageContent :: Text -- ^ The contents of the system message.
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


-- | 
data ChatCompletionRequestToolMessage = ChatCompletionRequestToolMessage
  { chatCompletionRequestToolMessageRole :: Text -- ^ The role of the messages author, in this case `tool`.
  , chatCompletionRequestToolMessageContent :: Text -- ^ The contents of the tool message.
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


-- | 
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


-- | A chat completion message generated by the model.
data ChatCompletionResponseMessage = ChatCompletionResponseMessage
  { chatCompletionResponseMessageContent :: Text -- ^ The contents of the message.
  , chatCompletionResponseMessageToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCall] -- ^ The tool calls generated by the model, such as function calls.
  , chatCompletionResponseMessageRole :: Text -- ^ The role of the author of this message.
  , chatCompletionResponseMessageFunctionUnderscorecall :: Maybe ChatCompletionRequestAssistantMessageFunctionCall -- ^ 
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
      , ("chatCompletionResponseMessageToolUnderscorecalls", "tool_calls")
      , ("chatCompletionResponseMessageRole", "role")
      , ("chatCompletionResponseMessageFunctionUnderscorecall", "function_call")
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


-- | A chat completion delta generated by streamed model responses.
data ChatCompletionStreamResponseDelta = ChatCompletionStreamResponseDelta
  { chatCompletionStreamResponseDeltaContent :: Maybe Text -- ^ The contents of the chunk message.
  , chatCompletionStreamResponseDeltaFunctionUnderscorecall :: Maybe ChatCompletionStreamResponseDeltaFunctionCall -- ^ 
  , chatCompletionStreamResponseDeltaToolUnderscorecalls :: Maybe [ChatCompletionMessageToolCallChunk] -- ^ 
  , chatCompletionStreamResponseDeltaRole :: Maybe Text -- ^ The role of the author of this message.
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


-- | Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
data ChatCompletionToolChoiceOption = ChatCompletionToolChoiceOption
  { chatCompletionToolChoiceOptionType :: Text -- ^ The type of the tool. Currently, only `function` is supported.
  , chatCompletionToolChoiceOptionFunction :: ChatCompletionNamedToolChoiceFunction -- ^ 
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


-- | Usage statistics for the completion request.
data CompletionUsage = CompletionUsage
  { completionUsageCompletionUnderscoretokens :: Int -- ^ Number of tokens in the generated completion.
  , completionUsagePromptUnderscoretokens :: Int -- ^ Number of tokens in the prompt.
  , completionUsageTotalUnderscoretokens :: Int -- ^ Total number of tokens used in the request (prompt + completion).
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
      ]


-- | 
data CreateAssistantFileRequest = CreateAssistantFileRequest
  { createAssistantFileRequestFileUnderscoreid :: Text -- ^ A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
  } deriving (Show, Eq, Generic)

instance FromJSON CreateAssistantFileRequest where
  parseJSON = genericParseJSON optionsCreateAssistantFileRequest
instance ToJSON CreateAssistantFileRequest where
  toJSON = genericToJSON optionsCreateAssistantFileRequest

optionsCreateAssistantFileRequest :: Options
optionsCreateAssistantFileRequest =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("createAssistantFileRequestFileUnderscoreid", "file_id")
      ]


-- | 
data CreateAssistantRequest = CreateAssistantRequest
  { createAssistantRequestModel :: CreateAssistantRequestModel -- ^ 
  , createAssistantRequestName :: Maybe Text -- ^ The name of the assistant. The maximum length is 256 characters. 
  , createAssistantRequestDescription :: Maybe Text -- ^ The description of the assistant. The maximum length is 512 characters. 
  , createAssistantRequestInstructions :: Maybe Text -- ^ The system instructions that the assistant uses. The maximum length is 256,000 characters. 
  , createAssistantRequestTools :: Maybe [AssistantObjectToolsInner] -- ^ A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
  , createAssistantRequestFileUnderscoreids :: Maybe [Text] -- ^ A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
  , createAssistantRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("createAssistantRequestFileUnderscoreids", "file_ids")
      , ("createAssistantRequestMetadata", "metadata")
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
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
  { createChatCompletionRequestMessages :: [ChatCompletionRequestMessage] -- ^ A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
  , createChatCompletionRequestModel :: CreateChatCompletionRequestModel -- ^ 
  , createChatCompletionRequestFrequencyUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
  , createChatCompletionRequestLogitUnderscorebias :: Maybe (Map.Map String Int) -- ^ Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
  , createChatCompletionRequestLogprobs :: Maybe Bool -- ^ Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
  , createChatCompletionRequestTopUnderscorelogprobs :: Maybe Int -- ^ An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
  , createChatCompletionRequestMaxUnderscoretokens :: Maybe Int -- ^ The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
  , createChatCompletionRequestN :: Maybe Int -- ^ How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
  , createChatCompletionRequestPresenceUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
  , createChatCompletionRequestResponseUnderscoreformat :: Maybe CreateChatCompletionRequestResponseFormat -- ^ 
  , createChatCompletionRequestSeed :: Maybe Int -- ^ This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
  , createChatCompletionRequestStop :: Maybe CreateChatCompletionRequestStop -- ^ 
  , createChatCompletionRequestStream :: Maybe Bool -- ^ If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
  , createChatCompletionRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  , createChatCompletionRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  , createChatCompletionRequestTools :: Maybe [ChatCompletionTool] -- ^ A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
  , createChatCompletionRequestToolUnderscorechoice :: Maybe ChatCompletionToolChoiceOption -- ^ 
  , createChatCompletionRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
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
      , ("createChatCompletionRequestFrequencyUnderscorepenalty", "frequency_penalty")
      , ("createChatCompletionRequestLogitUnderscorebias", "logit_bias")
      , ("createChatCompletionRequestLogprobs", "logprobs")
      , ("createChatCompletionRequestTopUnderscorelogprobs", "top_logprobs")
      , ("createChatCompletionRequestMaxUnderscoretokens", "max_tokens")
      , ("createChatCompletionRequestN", "n")
      , ("createChatCompletionRequestPresenceUnderscorepenalty", "presence_penalty")
      , ("createChatCompletionRequestResponseUnderscoreformat", "response_format")
      , ("createChatCompletionRequestSeed", "seed")
      , ("createChatCompletionRequestStop", "stop")
      , ("createChatCompletionRequestStream", "stream")
      , ("createChatCompletionRequestTemperature", "temperature")
      , ("createChatCompletionRequestTopUnderscorep", "top_p")
      , ("createChatCompletionRequestTools", "tools")
      , ("createChatCompletionRequestToolUnderscorechoice", "tool_choice")
      , ("createChatCompletionRequestUser", "user")
      , ("createChatCompletionRequestFunctionUnderscorecall", "function_call")
      , ("createChatCompletionRequestFunctions", "functions")
      ]


-- | Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
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


-- | ID of the model to use. See the [model endpoint compatibility](/docs/models/model-endpoint-compatibility) table for details on which models work with the Chat API.
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


-- | An object specifying the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than &#x60;gpt-3.5-turbo-1106&#x60;.  Setting to &#x60;{ \&quot;type\&quot;: \&quot;json_object\&quot; }&#x60; enables JSON mode, which guarantees the message the model generates is valid JSON.  **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly \&quot;stuck\&quot; request. Also note that the message content may be partially cut off if &#x60;finish_reason&#x3D;\&quot;length\&quot;&#x60;, which indicates the generation exceeded &#x60;max_tokens&#x60; or the conversation exceeded the max context length. 
data CreateChatCompletionRequestResponseFormat = CreateChatCompletionRequestResponseFormat
  { createChatCompletionRequestResponseFormatType :: Maybe Text -- ^ Must be one of `text` or `json_object`.
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
      ]


-- | Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
data CreateChatCompletionStreamResponse = CreateChatCompletionStreamResponse
  { createChatCompletionStreamResponseId :: Text -- ^ A unique identifier for the chat completion. Each chunk has the same ID.
  , createChatCompletionStreamResponseChoices :: [CreateChatCompletionStreamResponseChoicesInner] -- ^ A list of chat completion choices. Can be more than one if `n` is greater than 1.
  , createChatCompletionStreamResponseCreated :: Int -- ^ The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  , createChatCompletionStreamResponseModel :: Text -- ^ The model to generate the completion.
  , createChatCompletionStreamResponseSystemUnderscorefingerprint :: Maybe Text -- ^ This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  , createChatCompletionStreamResponseObject :: Text -- ^ The object type, which is always `chat.completion.chunk`.
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
      , ("createChatCompletionStreamResponseSystemUnderscorefingerprint", "system_fingerprint")
      , ("createChatCompletionStreamResponseObject", "object")
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


-- | 
data CreateCompletionRequest = CreateCompletionRequest
  { createCompletionRequestModel :: CreateCompletionRequestModel -- ^ 
  , createCompletionRequestPrompt :: CreateCompletionRequestPrompt -- ^ 
  , createCompletionRequestBestUnderscoreof :: Maybe Int -- ^ Generates `best_of` completions server-side and returns the \"best\" (the one with the highest log probability per token). Results cannot be streamed.  When used with `n`, `best_of` controls the number of candidate completions and `n` specifies how many to return – `best_of` must be greater than `n`.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  , createCompletionRequestEcho :: Maybe Bool -- ^ Echo back the prompt in addition to the completion 
  , createCompletionRequestFrequencyUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
  , createCompletionRequestLogitUnderscorebias :: Maybe (Map.Map String Int) -- ^ Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view=bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass `{\"50256\": -100}` to prevent the <|endoftext|> token from being generated. 
  , createCompletionRequestLogprobs :: Maybe Int -- ^ Include the log probabilities on the `logprobs` most likely output tokens, as well the chosen tokens. For example, if `logprobs` is 5, the API will return a list of the 5 most likely tokens. The API will always return the `logprob` of the sampled token, so there may be up to `logprobs+1` elements in the response.  The maximum value for `logprobs` is 5. 
  , createCompletionRequestMaxUnderscoretokens :: Maybe Int -- ^ The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus `max_tokens` cannot exceed the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
  , createCompletionRequestN :: Maybe Int -- ^ How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for `max_tokens` and `stop`. 
  , createCompletionRequestPresenceUnderscorepenalty :: Maybe Double -- ^ Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
  , createCompletionRequestSeed :: Maybe Int -- ^ If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
  , createCompletionRequestStop :: Maybe CreateCompletionRequestStop -- ^ 
  , createCompletionRequestStream :: Maybe Bool -- ^ Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
  , createCompletionRequestSuffix :: Maybe Text -- ^ The suffix that comes after a completion of inserted text.  This parameter is only supported for `gpt-3.5-turbo-instruct`. 
  , createCompletionRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
  , createCompletionRequestTopUnderscorep :: Maybe Double -- ^ An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
  , createCompletionRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
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
      , ("createCompletionRequestSuffix", "suffix")
      , ("createCompletionRequestTemperature", "temperature")
      , ("createCompletionRequestTopUnderscorep", "top_p")
      , ("createCompletionRequestUser", "user")
      ]


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
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
  , createEmbeddingRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
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


-- | ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
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
  , createFineTuningJobRequestTrainingUnderscorefile :: Text -- ^ The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  , createFineTuningJobRequestHyperparameters :: Maybe CreateFineTuningJobRequestHyperparameters -- ^ 
  , createFineTuningJobRequestSuffix :: Maybe Text -- ^ A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. 
  , createFineTuningJobRequestValidationUnderscorefile :: Maybe Text -- ^ The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
  , createFineTuningJobRequestIntegrations :: Maybe [CreateFineTuningJobRequestIntegrationsInner] -- ^ A list of integrations to enable for your fine-tuning job.
  , createFineTuningJobRequestSeed :: Maybe Int -- ^ The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
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
      ]


-- | The hyperparameters used for the fine-tuning job.
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


-- | The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
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
  , createImageRequestUser :: Maybe Text -- ^ A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
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
  , createMessageRequestContent :: Text -- ^ The content of the message.
  , createMessageRequestFileUnderscoreids :: Maybe [Text] -- ^ A list of [File](/docs/api-reference/files) IDs that the message should use. There can be a maximum of 10 files attached to a message. Useful for tools like `retrieval` and `code_interpreter` that can access and use files.
  , createMessageRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("createMessageRequestFileUnderscoreids", "file_ids")
      , ("createMessageRequestMetadata", "metadata")
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


-- | The input text to classify
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


-- | Two content moderations models are available: &#x60;text-moderation-stable&#x60; and &#x60;text-moderation-latest&#x60;.  The default is &#x60;text-moderation-latest&#x60; which will be automatically upgraded over time. This ensures you are always using our most accurate model. If you use &#x60;text-moderation-stable&#x60;, we will provide advanced notice before updating the model. Accuracy of &#x60;text-moderation-stable&#x60; may be slightly lower than for &#x60;text-moderation-latest&#x60;. 
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
      ]


-- | A list of the categories, and whether they are flagged or not.
data CreateModerationResponseResultsInnerCategories = CreateModerationResponseResultsInnerCategories
  { createModerationResponseResultsInnerCategoriesHate :: Bool -- ^ Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
  , createModerationResponseResultsInnerCategoriesHateSlashthreatening :: Bool -- ^ Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
  , createModerationResponseResultsInnerCategoriesHarassment :: Bool -- ^ Content that expresses, incites, or promotes harassing language towards any target.
  , createModerationResponseResultsInnerCategoriesHarassmentSlashthreatening :: Bool -- ^ Harassment content that also includes violence or serious harm towards any target.
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
      , ("createModerationResponseResultsInnerCategoriesSelfDashharm", "self-harm")
      , ("createModerationResponseResultsInnerCategoriesSelfDashharmSlashintent", "self-harm/intent")
      , ("createModerationResponseResultsInnerCategoriesSelfDashharmSlashinstructions", "self-harm/instructions")
      , ("createModerationResponseResultsInnerCategoriesSexual", "sexual")
      , ("createModerationResponseResultsInnerCategoriesSexualSlashminors", "sexual/minors")
      , ("createModerationResponseResultsInnerCategoriesViolence", "violence")
      , ("createModerationResponseResultsInnerCategoriesViolenceSlashgraphic", "violence/graphic")
      ]


-- | A list of the categories along with their scores as predicted by model.
data CreateModerationResponseResultsInnerCategoryScores = CreateModerationResponseResultsInnerCategoryScores
  { createModerationResponseResultsInnerCategoryScoresHate :: Double -- ^ The score for the category 'hate'.
  , createModerationResponseResultsInnerCategoryScoresHateSlashthreatening :: Double -- ^ The score for the category 'hate/threatening'.
  , createModerationResponseResultsInnerCategoryScoresHarassment :: Double -- ^ The score for the category 'harassment'.
  , createModerationResponseResultsInnerCategoryScoresHarassmentSlashthreatening :: Double -- ^ The score for the category 'harassment/threatening'.
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
  , createRunRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  , createRunRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , createRunRequestStream :: Maybe Bool -- ^ If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  , createRunRequestMaxUnderscorepromptUnderscoretokens :: Maybe Int -- ^ The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
  , createRunRequestMaxUnderscorecompletionUnderscoretokens :: Maybe Int -- ^ The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
  , createRunRequestTruncationUnderscorestrategy :: Maybe TruncationObject -- ^ 
  , createRunRequestToolUnderscorechoice :: Maybe AssistantsApiToolChoiceOption -- ^ 
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
      , ("createRunRequestStream", "stream")
      , ("createRunRequestMaxUnderscorepromptUnderscoretokens", "max_prompt_tokens")
      , ("createRunRequestMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("createRunRequestTruncationUnderscorestrategy", "truncation_strategy")
      , ("createRunRequestToolUnderscorechoice", "tool_choice")
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
  , createSpeechRequestVoice :: Text -- ^ The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
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


-- | One of the available [TTS models](/docs/models/tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
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
  , createThreadAndRunRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  , createThreadAndRunRequestTemperature :: Maybe Double -- ^ What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
  , createThreadAndRunRequestStream :: Maybe Bool -- ^ If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
  , createThreadAndRunRequestMaxUnderscorepromptUnderscoretokens :: Maybe Int -- ^ The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
  , createThreadAndRunRequestMaxUnderscorecompletionUnderscoretokens :: Maybe Int -- ^ The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
  , createThreadAndRunRequestTruncationUnderscorestrategy :: Maybe TruncationObject -- ^ 
  , createThreadAndRunRequestToolUnderscorechoice :: Maybe AssistantsApiToolChoiceOption -- ^ 
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
      , ("createThreadAndRunRequestMetadata", "metadata")
      , ("createThreadAndRunRequestTemperature", "temperature")
      , ("createThreadAndRunRequestStream", "stream")
      , ("createThreadAndRunRequestMaxUnderscorepromptUnderscoretokens", "max_prompt_tokens")
      , ("createThreadAndRunRequestMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("createThreadAndRunRequestTruncationUnderscorestrategy", "truncation_strategy")
      , ("createThreadAndRunRequestToolUnderscorechoice", "tool_choice")
      , ("createThreadAndRunRequestResponseUnderscoreformat", "response_format")
      ]


-- | 
data CreateThreadAndRunRequestToolsInner = CreateThreadAndRunRequestToolsInner
  { createThreadAndRunRequestToolsInnerType :: Text -- ^ The type of tool being defined: `code_interpreter`
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
      , ("createThreadAndRunRequestToolsInnerFunction", "function")
      ]


-- | 
data CreateThreadRequest = CreateThreadRequest
  { createThreadRequestMessages :: Maybe [CreateMessageRequest] -- ^ A list of [messages](/docs/api-reference/messages) to start the thread with.
  , createThreadRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("createThreadRequestMetadata", "metadata")
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


-- | Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
data DeleteAssistantFileResponse = DeleteAssistantFileResponse
  { deleteAssistantFileResponseId :: Text -- ^ 
  , deleteAssistantFileResponseDeleted :: Bool -- ^ 
  , deleteAssistantFileResponseObject :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON DeleteAssistantFileResponse where
  parseJSON = genericParseJSON optionsDeleteAssistantFileResponse
instance ToJSON DeleteAssistantFileResponse where
  toJSON = genericToJSON optionsDeleteAssistantFileResponse

optionsDeleteAssistantFileResponse :: Options
optionsDeleteAssistantFileResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("deleteAssistantFileResponseId", "id")
      , ("deleteAssistantFileResponseDeleted", "deleted")
      , ("deleteAssistantFileResponseObject", "object")
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


-- | Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
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
  { fineTuningJobEventId :: Text -- ^ 
  , fineTuningJobEventCreatedUnderscoreat :: Int -- ^ 
  , fineTuningJobEventLevel :: Text -- ^ 
  , fineTuningJobEventMessage :: Text -- ^ 
  , fineTuningJobEventObject :: Text -- ^ 
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
      [ ("fineTuningJobEventId", "id")
      , ("fineTuningJobEventCreatedUnderscoreat", "created_at")
      , ("fineTuningJobEventLevel", "level")
      , ("fineTuningJobEventMessage", "message")
      , ("fineTuningJobEventObject", "object")
      ]


-- | The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
data FineTuningJobHyperparameters = FineTuningJobHyperparameters
  { fineTuningJobHyperparametersNUnderscoreepochs :: FineTuningJobHyperparametersNEpochs -- ^ 
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
      [ ("fineTuningJobHyperparametersNUnderscoreepochs", "n_epochs")
      ]


-- | The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. \&quot;auto\&quot; decides the optimal number of epochs based on the size of the dataset. If setting the number manually, we support any number between 1 and 50 epochs.
data FineTuningJobHyperparametersNEpochs = FineTuningJobHyperparametersNEpochs
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON FineTuningJobHyperparametersNEpochs where
  parseJSON = genericParseJSON optionsFineTuningJobHyperparametersNEpochs
instance ToJSON FineTuningJobHyperparametersNEpochs where
  toJSON = genericToJSON optionsFineTuningJobHyperparametersNEpochs

optionsFineTuningJobHyperparametersNEpochs :: Options
optionsFineTuningJobHyperparametersNEpochs =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
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
  , functionObjectParameters :: Maybe (Map.Map String Value) -- ^ The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
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


-- | 
data ListAssistantFilesResponse = ListAssistantFilesResponse
  { listAssistantFilesResponseObject :: Text -- ^ 
  , listAssistantFilesResponseData :: [AssistantFileObject] -- ^ 
  , listAssistantFilesResponseFirstUnderscoreid :: Text -- ^ 
  , listAssistantFilesResponseLastUnderscoreid :: Text -- ^ 
  , listAssistantFilesResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListAssistantFilesResponse where
  parseJSON = genericParseJSON optionsListAssistantFilesResponse
instance ToJSON ListAssistantFilesResponse where
  toJSON = genericToJSON optionsListAssistantFilesResponse

optionsListAssistantFilesResponse :: Options
optionsListAssistantFilesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listAssistantFilesResponseObject", "object")
      , ("listAssistantFilesResponseData", "data")
      , ("listAssistantFilesResponseFirstUnderscoreid", "first_id")
      , ("listAssistantFilesResponseLastUnderscoreid", "last_id")
      , ("listAssistantFilesResponseHasUnderscoremore", "has_more")
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
data ListFilesResponse = ListFilesResponse
  { listFilesResponseData :: [OpenAIFile] -- ^ 
  , listFilesResponseObject :: Text -- ^ 
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
      [ ("listFilesResponseData", "data")
      , ("listFilesResponseObject", "object")
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
data ListMessageFilesResponse = ListMessageFilesResponse
  { listMessageFilesResponseObject :: Text -- ^ 
  , listMessageFilesResponseData :: [MessageFileObject] -- ^ 
  , listMessageFilesResponseFirstUnderscoreid :: Text -- ^ 
  , listMessageFilesResponseLastUnderscoreid :: Text -- ^ 
  , listMessageFilesResponseHasUnderscoremore :: Bool -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ListMessageFilesResponse where
  parseJSON = genericParseJSON optionsListMessageFilesResponse
instance ToJSON ListMessageFilesResponse where
  toJSON = genericToJSON optionsListMessageFilesResponse

optionsListMessageFilesResponse :: Options
optionsListMessageFilesResponse =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("listMessageFilesResponseObject", "object")
      , ("listMessageFilesResponseData", "data")
      , ("listMessageFilesResponseFirstUnderscoreid", "first_id")
      , ("listMessageFilesResponseLastUnderscoreid", "last_id")
      , ("listMessageFilesResponseHasUnderscoremore", "has_more")
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
  { messageContentImageFileObjectImageFileFileUnderscoreid :: Text -- ^ The [File](/docs/api-reference/files) ID of the image in the message content.
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
      ]


-- | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
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
  , messageContentTextAnnotationsFileCitationObjectFileCitationQuote :: Text -- ^ The specific quote in the file.
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
      , ("messageContentTextAnnotationsFileCitationObjectFileCitationQuote", "quote")
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
  { messageDeltaContentImageFileObjectImageFileFileUnderscoreid :: Maybe Text -- ^ The [File](/docs/api-reference/files) ID of the image in the message content.
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
      ]


-- | A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;retrieval\&quot; tool to search files.
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
  , messageDeltaObjectDeltaFileUnderscoreids :: Maybe [Text] -- ^ A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
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
      , ("messageDeltaObjectDeltaFileUnderscoreids", "file_ids")
      ]


-- | 
data MessageDeltaObjectDeltaContentInner = MessageDeltaObjectDeltaContentInner
  { messageDeltaObjectDeltaContentInnerIndex :: Int -- ^ The index of the content part in the message.
  , messageDeltaObjectDeltaContentInnerType :: Text -- ^ Always `image_file`.
  , messageDeltaObjectDeltaContentInnerImageUnderscorefile :: Maybe MessageDeltaContentImageFileObjectImageFile -- ^ 
  , messageDeltaObjectDeltaContentInnerText :: Maybe MessageDeltaContentTextObjectText -- ^ 
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
      ]


-- | A list of files attached to a &#x60;message&#x60;.
data MessageFileObject = MessageFileObject
  { messageFileObjectId :: Text -- ^ The identifier, which can be referenced in API endpoints.
  , messageFileObjectObject :: Text -- ^ The object type, which is always `thread.message.file`.
  , messageFileObjectCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the message file was created.
  , messageFileObjectMessageUnderscoreid :: Text -- ^ The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
  } deriving (Show, Eq, Generic)

instance FromJSON MessageFileObject where
  parseJSON = genericParseJSON optionsMessageFileObject
instance ToJSON MessageFileObject where
  toJSON = genericToJSON optionsMessageFileObject

optionsMessageFileObject :: Options
optionsMessageFileObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("messageFileObjectId", "id")
      , ("messageFileObjectObject", "object")
      , ("messageFileObjectCreatedUnderscoreat", "created_at")
      , ("messageFileObjectMessageUnderscoreid", "message_id")
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
  , messageObjectFileUnderscoreids :: [Text] -- ^ A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
  , messageObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("messageObjectFileUnderscoreids", "file_ids")
      , ("messageObjectMetadata", "metadata")
      ]


-- | 
data MessageObjectContentInner = MessageObjectContentInner
  { messageObjectContentInnerType :: Text -- ^ Always `image_file`.
  , messageObjectContentInnerImageUnderscorefile :: MessageContentImageFileObjectImageFile -- ^ 
  , messageObjectContentInnerText :: MessageContentTextObjectText -- ^ 
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
      , ("messageObjectContentInnerText", "text")
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
  , modifyAssistantRequestTools :: Maybe [AssistantObjectToolsInner] -- ^ A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
  , modifyAssistantRequestFileUnderscoreids :: Maybe [Text] -- ^ A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
  , modifyAssistantRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("modifyAssistantRequestFileUnderscoreids", "file_ids")
      , ("modifyAssistantRequestMetadata", "metadata")
      ]


-- | 
data ModifyMessageRequest = ModifyMessageRequest
  { modifyMessageRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
  { modifyRunRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
  { modifyThreadRequestMetadata :: Maybe Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      [ ("modifyThreadRequestMetadata", "metadata")
      ]


-- | The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
data OpenAIFile = OpenAIFile
  { openAIFileId :: Text -- ^ The file identifier, which can be referenced in the API endpoints.
  , openAIFileBytes :: Int -- ^ The size of the file, in bytes.
  , openAIFileCreatedUnderscoreat :: Int -- ^ The Unix timestamp (in seconds) for when the file was created.
  , openAIFileFilename :: Text -- ^ The name of the file.
  , openAIFileObject :: Text -- ^ The object type, which is always `file`.
  , openAIFilePurpose :: Text -- ^ The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
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
  , runObjectStatus :: Text -- ^ The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
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
  , runObjectFileUnderscoreids :: [Text] -- ^ The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
  , runObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  , runObjectUsage :: RunCompletionUsage -- ^ 
  , runObjectTemperature :: Maybe Double -- ^ The sampling temperature used for this run. If not set, defaults to 1.
  , runObjectMaxUnderscorepromptUnderscoretokens :: Int -- ^ The maximum number of prompt tokens specified to have been used over the course of the run. 
  , runObjectMaxUnderscorecompletionUnderscoretokens :: Int -- ^ The maximum number of completion tokens specified to have been used over the course of the run. 
  , runObjectTruncationUnderscorestrategy :: TruncationObject -- ^ 
  , runObjectToolUnderscorechoice :: AssistantsApiToolChoiceOption -- ^ 
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
      , ("runObjectFileUnderscoreids", "file_ids")
      , ("runObjectMetadata", "metadata")
      , ("runObjectUsage", "usage")
      , ("runObjectTemperature", "temperature")
      , ("runObjectMaxUnderscorepromptUnderscoretokens", "max_prompt_tokens")
      , ("runObjectMaxUnderscorecompletionUnderscoretokens", "max_completion_tokens")
      , ("runObjectTruncationUnderscorestrategy", "truncation_strategy")
      , ("runObjectToolUnderscorechoice", "tool_choice")
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
  , runStepDeltaObjectDeltaStepDetailsToolUnderscorecalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
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
  , runStepDeltaStepDetailsToolCallsObjectToolUnderscorecalls :: Maybe [RunStepDeltaStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
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
  , runStepDeltaStepDetailsToolCallsObjectToolCallsInnerRetrieval :: Maybe Object -- ^ For now, this is always going to be an empty object.
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
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerRetrieval", "retrieval")
      , ("runStepDeltaStepDetailsToolCallsObjectToolCallsInnerFunction", "function")
      ]


-- | 
data RunStepDeltaStepDetailsToolCallsRetrievalObject = RunStepDeltaStepDetailsToolCallsRetrievalObject
  { runStepDeltaStepDetailsToolCallsRetrievalObjectIndex :: Int -- ^ The index of the tool call in the tool calls array.
  , runStepDeltaStepDetailsToolCallsRetrievalObjectId :: Maybe Text -- ^ The ID of the tool call object.
  , runStepDeltaStepDetailsToolCallsRetrievalObjectType :: Text -- ^ The type of tool call. This is always going to be `retrieval` for this type of tool call.
  , runStepDeltaStepDetailsToolCallsRetrievalObjectRetrieval :: Maybe Object -- ^ For now, this is always going to be an empty object.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDeltaStepDetailsToolCallsRetrievalObject where
  parseJSON = genericParseJSON optionsRunStepDeltaStepDetailsToolCallsRetrievalObject
instance ToJSON RunStepDeltaStepDetailsToolCallsRetrievalObject where
  toJSON = genericToJSON optionsRunStepDeltaStepDetailsToolCallsRetrievalObject

optionsRunStepDeltaStepDetailsToolCallsRetrievalObject :: Options
optionsRunStepDeltaStepDetailsToolCallsRetrievalObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDeltaStepDetailsToolCallsRetrievalObjectIndex", "index")
      , ("runStepDeltaStepDetailsToolCallsRetrievalObjectId", "id")
      , ("runStepDeltaStepDetailsToolCallsRetrievalObjectType", "type")
      , ("runStepDeltaStepDetailsToolCallsRetrievalObjectRetrieval", "retrieval")
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
  , runStepDetailsToolCallsObjectToolUnderscorecalls :: [RunStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
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
  , runStepDetailsToolCallsObjectToolCallsInnerRetrieval :: Object -- ^ For now, this is always going to be an empty object.
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
      , ("runStepDetailsToolCallsObjectToolCallsInnerRetrieval", "retrieval")
      , ("runStepDetailsToolCallsObjectToolCallsInnerFunction", "function")
      ]


-- | 
data RunStepDetailsToolCallsRetrievalObject = RunStepDetailsToolCallsRetrievalObject
  { runStepDetailsToolCallsRetrievalObjectId :: Text -- ^ The ID of the tool call object.
  , runStepDetailsToolCallsRetrievalObjectType :: Text -- ^ The type of tool call. This is always going to be `retrieval` for this type of tool call.
  , runStepDetailsToolCallsRetrievalObjectRetrieval :: Object -- ^ For now, this is always going to be an empty object.
  } deriving (Show, Eq, Generic)

instance FromJSON RunStepDetailsToolCallsRetrievalObject where
  parseJSON = genericParseJSON optionsRunStepDetailsToolCallsRetrievalObject
instance ToJSON RunStepDetailsToolCallsRetrievalObject where
  toJSON = genericToJSON optionsRunStepDetailsToolCallsRetrievalObject

optionsRunStepDetailsToolCallsRetrievalObject :: Options
optionsRunStepDetailsToolCallsRetrievalObject =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("runStepDetailsToolCallsRetrievalObjectId", "id")
      , ("runStepDetailsToolCallsRetrievalObjectType", "type")
      , ("runStepDetailsToolCallsRetrievalObjectRetrieval", "retrieval")
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
  , runStepObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
  , runStepObjectStepDetailsToolUnderscorecalls :: [RunStepDetailsToolCallsObjectToolCallsInner] -- ^ An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
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


-- | Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
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


-- | Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an &#x60;in_progress&#x60; state.
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


-- | Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
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


-- | Occurs when a [run step](/docs/api-reference/runs/step-object) is completed.
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


-- | Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
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


-- | Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
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


-- | Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
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


-- | Occurs when a [run](/docs/api-reference/runs/object) fails.
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


-- | Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;cancelling&#x60; status.
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


-- | Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
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


-- | Occurs when a [run](/docs/api-reference/runs/object) expires.
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
  , threadObjectMetadata :: Object -- ^ Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
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
      , ("threadObjectMetadata", "metadata")
      ]


-- | Occurs when a new [thread](/docs/api-reference/threads/object) is created.
data ThreadStreamEvent = ThreadStreamEvent
  { threadStreamEventEvent :: Text -- ^ 
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
      [ ("threadStreamEventEvent", "event")
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


-- | 
data TruncationObject = TruncationObject
  { truncationObjectType :: Maybe Text -- ^ The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
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

