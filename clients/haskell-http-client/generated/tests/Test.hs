{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import OpenAI.Model
import OpenAI.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy AssistantFileObject)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantObject)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantObjectToolsInner)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantStreamEvent)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantToolsCode)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantToolsFunction)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantToolsRetrieval)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantsApiNamedToolChoice)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantsApiResponseFormat)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantsApiResponseFormatOption)
      propMimeEq MimeJSON (Proxy :: Proxy AssistantsApiToolChoiceOption)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionFunctionCallOption)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionFunctions)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionMessageToolCall)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionMessageToolCallChunk)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionMessageToolCallChunkFunction)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionMessageToolCallFunction)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionNamedToolChoice)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionNamedToolChoiceFunction)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestAssistantMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestAssistantMessageFunctionCall)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestFunctionMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestMessageContentPart)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestMessageContentPartImage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestMessageContentPartImageImageUrl)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestMessageContentPartText)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestSystemMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestToolMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestUserMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRequestUserMessageContent)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionResponseMessage)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionRole)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionStreamResponseDelta)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionStreamResponseDeltaFunctionCall)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionTokenLogprob)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionTokenLogprobTopLogprobsInner)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionTool)
      propMimeEq MimeJSON (Proxy :: Proxy ChatCompletionToolChoiceOption)
      propMimeEq MimeJSON (Proxy :: Proxy CompletionUsage)
      propMimeEq MimeJSON (Proxy :: Proxy CreateAssistantFileRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateAssistantRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateAssistantRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionFunctionResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionFunctionResponseChoicesInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionRequestFunctionCall)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionRequestResponseFormat)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionRequestStop)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionResponseChoicesInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionResponseChoicesInnerLogprobs)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionStreamResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateChatCompletionStreamResponseChoicesInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionRequestPrompt)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionRequestStop)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionResponseChoicesInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateCompletionResponseChoicesInnerLogprobs)
      propMimeEq MimeJSON (Proxy :: Proxy CreateEmbeddingRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateEmbeddingRequestInput)
      propMimeEq MimeJSON (Proxy :: Proxy CreateEmbeddingRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateEmbeddingResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateEmbeddingResponseUsage)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestHyperparameters)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestHyperparametersBatchSize)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestHyperparametersLearningRateMultiplier)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestHyperparametersNEpochs)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestIntegrationsInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestIntegrationsInnerType)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestIntegrationsInnerWandb)
      propMimeEq MimeJSON (Proxy :: Proxy CreateFineTuningJobRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateImageEditRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateImageRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateImageRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateMessageRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationRequestInput)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationResponse)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationResponseResultsInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationResponseResultsInnerCategories)
      propMimeEq MimeJSON (Proxy :: Proxy CreateModerationResponseResultsInnerCategoryScores)
      propMimeEq MimeJSON (Proxy :: Proxy CreateRunRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateRunRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateSpeechRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateSpeechRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateThreadAndRunRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateThreadAndRunRequestToolsInner)
      propMimeEq MimeJSON (Proxy :: Proxy CreateThreadRequest)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranscription200Response)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranscriptionRequestModel)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranscriptionResponseJson)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranscriptionResponseVerboseJson)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranslation200Response)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranslationResponseJson)
      propMimeEq MimeJSON (Proxy :: Proxy CreateTranslationResponseVerboseJson)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteAssistantFileResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteAssistantResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteFileResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteMessageResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteModelResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DeleteThreadResponse)
      propMimeEq MimeJSON (Proxy :: Proxy DoneEvent)
      propMimeEq MimeJSON (Proxy :: Proxy Embedding)
      propMimeEq MimeJSON (Proxy :: Proxy Error)
      propMimeEq MimeJSON (Proxy :: Proxy ErrorEvent)
      propMimeEq MimeJSON (Proxy :: Proxy ErrorResponse)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningIntegration)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJob)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobCheckpoint)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobCheckpointMetrics)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobError)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobEvent)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobHyperparameters)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobHyperparametersNEpochs)
      propMimeEq MimeJSON (Proxy :: Proxy FineTuningJobIntegrationsInner)
      propMimeEq MimeJSON (Proxy :: Proxy FunctionObject)
      propMimeEq MimeJSON (Proxy :: Proxy Image)
      propMimeEq MimeJSON (Proxy :: Proxy ImagesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListAssistantFilesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListAssistantsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListFilesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListFineTuningJobCheckpointsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListFineTuningJobEventsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListMessageFilesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListMessagesResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListModelsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListPaginatedFineTuningJobsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListRunStepsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListRunsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy ListThreadsResponse)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentImageFileObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentImageFileObjectImageFile)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextAnnotationsFileCitationObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextAnnotationsFileCitationObjectFileCitation)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextAnnotationsFilePathObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextAnnotationsFilePathObjectFilePath)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextObjectText)
      propMimeEq MimeJSON (Proxy :: Proxy MessageContentTextObjectTextAnnotationsInner)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentImageFileObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentImageFileObjectImageFile)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextAnnotationsFileCitationObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextAnnotationsFilePathObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextAnnotationsFilePathObjectFilePath)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextObjectText)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaContentTextObjectTextAnnotationsInner)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaObjectDelta)
      propMimeEq MimeJSON (Proxy :: Proxy MessageDeltaObjectDeltaContentInner)
      propMimeEq MimeJSON (Proxy :: Proxy MessageFileObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageObject)
      propMimeEq MimeJSON (Proxy :: Proxy MessageObjectContentInner)
      propMimeEq MimeJSON (Proxy :: Proxy MessageObjectIncompleteDetails)
      propMimeEq MimeJSON (Proxy :: Proxy MessageStreamEvent)
      propMimeEq MimeJSON (Proxy :: Proxy MessageStreamEventOneOf)
      propMimeEq MimeJSON (Proxy :: Proxy MessageStreamEventOneOf1)
      propMimeEq MimeJSON (Proxy :: Proxy MessageStreamEventOneOf2)
      propMimeEq MimeJSON (Proxy :: Proxy MessageStreamEventOneOf3)
      propMimeEq MimeJSON (Proxy :: Proxy MessageStreamEventOneOf4)
      propMimeEq MimeJSON (Proxy :: Proxy Model)
      propMimeEq MimeJSON (Proxy :: Proxy ModifyAssistantRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ModifyMessageRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ModifyRunRequest)
      propMimeEq MimeJSON (Proxy :: Proxy ModifyThreadRequest)
      propMimeEq MimeJSON (Proxy :: Proxy OpenAIFile)
      propMimeEq MimeJSON (Proxy :: Proxy RunCompletionUsage)
      propMimeEq MimeJSON (Proxy :: Proxy RunObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunObjectIncompleteDetails)
      propMimeEq MimeJSON (Proxy :: Proxy RunObjectLastError)
      propMimeEq MimeJSON (Proxy :: Proxy RunObjectRequiredAction)
      propMimeEq MimeJSON (Proxy :: Proxy RunObjectRequiredActionSubmitToolOutputs)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepCompletionUsage)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaObjectDelta)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaObjectDeltaStepDetails)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsMessageCreationObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsMessageCreationObjectMessageCreation)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsCodeObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsCodeOutputImageObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsFunctionObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsFunctionObjectFunction)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsObjectToolCallsInner)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDeltaStepDetailsToolCallsRetrievalObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsMessageCreationObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsMessageCreationObjectMessageCreation)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsCodeObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsCodeObjectCodeInterpreter)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsCodeOutputImageObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsCodeOutputImageObjectImage)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsCodeOutputLogsObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsFunctionObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsFunctionObjectFunction)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsObjectToolCallsInner)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepDetailsToolCallsRetrievalObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepObjectLastError)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepObjectStepDetails)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEvent)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf1)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf2)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf3)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf4)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf5)
      propMimeEq MimeJSON (Proxy :: Proxy RunStepStreamEventOneOf6)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEvent)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf1)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf2)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf3)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf4)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf5)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf6)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf7)
      propMimeEq MimeJSON (Proxy :: Proxy RunStreamEventOneOf8)
      propMimeEq MimeJSON (Proxy :: Proxy RunToolCallObject)
      propMimeEq MimeJSON (Proxy :: Proxy RunToolCallObjectFunction)
      propMimeEq MimeJSON (Proxy :: Proxy SubmitToolOutputsRunRequest)
      propMimeEq MimeJSON (Proxy :: Proxy SubmitToolOutputsRunRequestToolOutputsInner)
      propMimeEq MimeJSON (Proxy :: Proxy ThreadObject)
      propMimeEq MimeJSON (Proxy :: Proxy ThreadStreamEvent)
      propMimeEq MimeJSON (Proxy :: Proxy ThreadStreamEventOneOf)
      propMimeEq MimeJSON (Proxy :: Proxy TranscriptionSegment)
      propMimeEq MimeJSON (Proxy :: Proxy TranscriptionWord)
      propMimeEq MimeJSON (Proxy :: Proxy TruncationObject)
      
