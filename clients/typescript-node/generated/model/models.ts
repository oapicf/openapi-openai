import localVarRequest from 'request';

export * from './assistantFileObject';
export * from './assistantObject';
export * from './assistantObjectToolsInner';
export * from './assistantStreamEvent';
export * from './assistantToolsCode';
export * from './assistantToolsFunction';
export * from './assistantToolsRetrieval';
export * from './assistantsApiNamedToolChoice';
export * from './assistantsApiResponseFormat';
export * from './assistantsApiResponseFormatOption';
export * from './assistantsApiToolChoiceOption';
export * from './chatCompletionFunctionCallOption';
export * from './chatCompletionFunctions';
export * from './chatCompletionMessageToolCall';
export * from './chatCompletionMessageToolCallChunk';
export * from './chatCompletionMessageToolCallChunkFunction';
export * from './chatCompletionMessageToolCallFunction';
export * from './chatCompletionNamedToolChoice';
export * from './chatCompletionNamedToolChoiceFunction';
export * from './chatCompletionRequestAssistantMessage';
export * from './chatCompletionRequestAssistantMessageFunctionCall';
export * from './chatCompletionRequestFunctionMessage';
export * from './chatCompletionRequestMessage';
export * from './chatCompletionRequestMessageContentPart';
export * from './chatCompletionRequestMessageContentPartImage';
export * from './chatCompletionRequestMessageContentPartImageImageUrl';
export * from './chatCompletionRequestMessageContentPartText';
export * from './chatCompletionRequestSystemMessage';
export * from './chatCompletionRequestToolMessage';
export * from './chatCompletionRequestUserMessage';
export * from './chatCompletionRequestUserMessageContent';
export * from './chatCompletionResponseMessage';
export * from './chatCompletionRole';
export * from './chatCompletionStreamResponseDelta';
export * from './chatCompletionStreamResponseDeltaFunctionCall';
export * from './chatCompletionTokenLogprob';
export * from './chatCompletionTokenLogprobTopLogprobsInner';
export * from './chatCompletionTool';
export * from './chatCompletionToolChoiceOption';
export * from './completionUsage';
export * from './createAssistantFileRequest';
export * from './createAssistantRequest';
export * from './createAssistantRequestModel';
export * from './createChatCompletionFunctionResponse';
export * from './createChatCompletionFunctionResponseChoicesInner';
export * from './createChatCompletionRequest';
export * from './createChatCompletionRequestFunctionCall';
export * from './createChatCompletionRequestModel';
export * from './createChatCompletionRequestResponseFormat';
export * from './createChatCompletionRequestStop';
export * from './createChatCompletionResponse';
export * from './createChatCompletionResponseChoicesInner';
export * from './createChatCompletionResponseChoicesInnerLogprobs';
export * from './createChatCompletionStreamResponse';
export * from './createChatCompletionStreamResponseChoicesInner';
export * from './createCompletionRequest';
export * from './createCompletionRequestModel';
export * from './createCompletionRequestPrompt';
export * from './createCompletionRequestStop';
export * from './createCompletionResponse';
export * from './createCompletionResponseChoicesInner';
export * from './createCompletionResponseChoicesInnerLogprobs';
export * from './createEmbeddingRequest';
export * from './createEmbeddingRequestInput';
export * from './createEmbeddingRequestModel';
export * from './createEmbeddingResponse';
export * from './createEmbeddingResponseUsage';
export * from './createFineTuningJobRequest';
export * from './createFineTuningJobRequestHyperparameters';
export * from './createFineTuningJobRequestHyperparametersBatchSize';
export * from './createFineTuningJobRequestHyperparametersLearningRateMultiplier';
export * from './createFineTuningJobRequestHyperparametersNEpochs';
export * from './createFineTuningJobRequestIntegrationsInner';
export * from './createFineTuningJobRequestIntegrationsInnerType';
export * from './createFineTuningJobRequestIntegrationsInnerWandb';
export * from './createFineTuningJobRequestModel';
export * from './createImageEditRequestModel';
export * from './createImageRequest';
export * from './createImageRequestModel';
export * from './createMessageRequest';
export * from './createModerationRequest';
export * from './createModerationRequestInput';
export * from './createModerationRequestModel';
export * from './createModerationResponse';
export * from './createModerationResponseResultsInner';
export * from './createModerationResponseResultsInnerCategories';
export * from './createModerationResponseResultsInnerCategoryScores';
export * from './createRunRequest';
export * from './createRunRequestModel';
export * from './createSpeechRequest';
export * from './createSpeechRequestModel';
export * from './createThreadAndRunRequest';
export * from './createThreadAndRunRequestToolsInner';
export * from './createThreadRequest';
export * from './createTranscription200Response';
export * from './createTranscriptionRequestModel';
export * from './createTranscriptionResponseJson';
export * from './createTranscriptionResponseVerboseJson';
export * from './createTranslation200Response';
export * from './createTranslationResponseJson';
export * from './createTranslationResponseVerboseJson';
export * from './deleteAssistantFileResponse';
export * from './deleteAssistantResponse';
export * from './deleteFileResponse';
export * from './deleteMessageResponse';
export * from './deleteModelResponse';
export * from './deleteThreadResponse';
export * from './doneEvent';
export * from './embedding';
export * from './errorEvent';
export * from './errorResponse';
export * from './fineTuningIntegration';
export * from './fineTuningJob';
export * from './fineTuningJobCheckpoint';
export * from './fineTuningJobCheckpointMetrics';
export * from './fineTuningJobError';
export * from './fineTuningJobEvent';
export * from './fineTuningJobHyperparameters';
export * from './fineTuningJobHyperparametersNEpochs';
export * from './fineTuningJobIntegrationsInner';
export * from './functionObject';
export * from './image';
export * from './imagesResponse';
export * from './listAssistantFilesResponse';
export * from './listAssistantsResponse';
export * from './listFilesResponse';
export * from './listFineTuningJobCheckpointsResponse';
export * from './listFineTuningJobEventsResponse';
export * from './listMessageFilesResponse';
export * from './listMessagesResponse';
export * from './listModelsResponse';
export * from './listPaginatedFineTuningJobsResponse';
export * from './listRunStepsResponse';
export * from './listRunsResponse';
export * from './listThreadsResponse';
export * from './messageContentImageFileObject';
export * from './messageContentImageFileObjectImageFile';
export * from './messageContentTextAnnotationsFileCitationObject';
export * from './messageContentTextAnnotationsFileCitationObjectFileCitation';
export * from './messageContentTextAnnotationsFilePathObject';
export * from './messageContentTextAnnotationsFilePathObjectFilePath';
export * from './messageContentTextObject';
export * from './messageContentTextObjectText';
export * from './messageContentTextObjectTextAnnotationsInner';
export * from './messageDeltaContentImageFileObject';
export * from './messageDeltaContentImageFileObjectImageFile';
export * from './messageDeltaContentTextAnnotationsFileCitationObject';
export * from './messageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
export * from './messageDeltaContentTextAnnotationsFilePathObject';
export * from './messageDeltaContentTextAnnotationsFilePathObjectFilePath';
export * from './messageDeltaContentTextObject';
export * from './messageDeltaContentTextObjectText';
export * from './messageDeltaContentTextObjectTextAnnotationsInner';
export * from './messageDeltaObject';
export * from './messageDeltaObjectDelta';
export * from './messageDeltaObjectDeltaContentInner';
export * from './messageFileObject';
export * from './messageObject';
export * from './messageObjectContentInner';
export * from './messageObjectIncompleteDetails';
export * from './messageStreamEvent';
export * from './messageStreamEventOneOf';
export * from './messageStreamEventOneOf1';
export * from './messageStreamEventOneOf2';
export * from './messageStreamEventOneOf3';
export * from './messageStreamEventOneOf4';
export * from './model';
export * from './modelError';
export * from './modifyAssistantRequest';
export * from './modifyMessageRequest';
export * from './modifyRunRequest';
export * from './modifyThreadRequest';
export * from './openAIFile';
export * from './runCompletionUsage';
export * from './runObject';
export * from './runObjectIncompleteDetails';
export * from './runObjectLastError';
export * from './runObjectRequiredAction';
export * from './runObjectRequiredActionSubmitToolOutputs';
export * from './runStepCompletionUsage';
export * from './runStepDeltaObject';
export * from './runStepDeltaObjectDelta';
export * from './runStepDeltaObjectDeltaStepDetails';
export * from './runStepDeltaStepDetailsMessageCreationObject';
export * from './runStepDeltaStepDetailsMessageCreationObjectMessageCreation';
export * from './runStepDeltaStepDetailsToolCallsCodeObject';
export * from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
export * from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
export * from './runStepDeltaStepDetailsToolCallsCodeOutputImageObject';
export * from './runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
export * from './runStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
export * from './runStepDeltaStepDetailsToolCallsFunctionObject';
export * from './runStepDeltaStepDetailsToolCallsFunctionObjectFunction';
export * from './runStepDeltaStepDetailsToolCallsObject';
export * from './runStepDeltaStepDetailsToolCallsObjectToolCallsInner';
export * from './runStepDeltaStepDetailsToolCallsRetrievalObject';
export * from './runStepDetailsMessageCreationObject';
export * from './runStepDetailsMessageCreationObjectMessageCreation';
export * from './runStepDetailsToolCallsCodeObject';
export * from './runStepDetailsToolCallsCodeObjectCodeInterpreter';
export * from './runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
export * from './runStepDetailsToolCallsCodeOutputImageObject';
export * from './runStepDetailsToolCallsCodeOutputImageObjectImage';
export * from './runStepDetailsToolCallsCodeOutputLogsObject';
export * from './runStepDetailsToolCallsFunctionObject';
export * from './runStepDetailsToolCallsFunctionObjectFunction';
export * from './runStepDetailsToolCallsObject';
export * from './runStepDetailsToolCallsObjectToolCallsInner';
export * from './runStepDetailsToolCallsRetrievalObject';
export * from './runStepObject';
export * from './runStepObjectLastError';
export * from './runStepObjectStepDetails';
export * from './runStepStreamEvent';
export * from './runStepStreamEventOneOf';
export * from './runStepStreamEventOneOf1';
export * from './runStepStreamEventOneOf2';
export * from './runStepStreamEventOneOf3';
export * from './runStepStreamEventOneOf4';
export * from './runStepStreamEventOneOf5';
export * from './runStepStreamEventOneOf6';
export * from './runStreamEvent';
export * from './runStreamEventOneOf';
export * from './runStreamEventOneOf1';
export * from './runStreamEventOneOf2';
export * from './runStreamEventOneOf3';
export * from './runStreamEventOneOf4';
export * from './runStreamEventOneOf5';
export * from './runStreamEventOneOf6';
export * from './runStreamEventOneOf7';
export * from './runStreamEventOneOf8';
export * from './runToolCallObject';
export * from './runToolCallObjectFunction';
export * from './submitToolOutputsRunRequest';
export * from './submitToolOutputsRunRequestToolOutputsInner';
export * from './threadObject';
export * from './threadStreamEvent';
export * from './threadStreamEventOneOf';
export * from './transcriptionSegment';
export * from './transcriptionWord';
export * from './truncationObject';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { AssistantFileObject } from './assistantFileObject';
import { AssistantObject } from './assistantObject';
import { AssistantObjectToolsInner } from './assistantObjectToolsInner';
import { AssistantStreamEvent } from './assistantStreamEvent';
import { AssistantToolsCode } from './assistantToolsCode';
import { AssistantToolsFunction } from './assistantToolsFunction';
import { AssistantToolsRetrieval } from './assistantToolsRetrieval';
import { AssistantsApiNamedToolChoice } from './assistantsApiNamedToolChoice';
import { AssistantsApiResponseFormat } from './assistantsApiResponseFormat';
import { AssistantsApiResponseFormatOption } from './assistantsApiResponseFormatOption';
import { AssistantsApiToolChoiceOption } from './assistantsApiToolChoiceOption';
import { ChatCompletionFunctionCallOption } from './chatCompletionFunctionCallOption';
import { ChatCompletionFunctions } from './chatCompletionFunctions';
import { ChatCompletionMessageToolCall } from './chatCompletionMessageToolCall';
import { ChatCompletionMessageToolCallChunk } from './chatCompletionMessageToolCallChunk';
import { ChatCompletionMessageToolCallChunkFunction } from './chatCompletionMessageToolCallChunkFunction';
import { ChatCompletionMessageToolCallFunction } from './chatCompletionMessageToolCallFunction';
import { ChatCompletionNamedToolChoice } from './chatCompletionNamedToolChoice';
import { ChatCompletionNamedToolChoiceFunction } from './chatCompletionNamedToolChoiceFunction';
import { ChatCompletionRequestAssistantMessage } from './chatCompletionRequestAssistantMessage';
import { ChatCompletionRequestAssistantMessageFunctionCall } from './chatCompletionRequestAssistantMessageFunctionCall';
import { ChatCompletionRequestFunctionMessage } from './chatCompletionRequestFunctionMessage';
import { ChatCompletionRequestMessage } from './chatCompletionRequestMessage';
import { ChatCompletionRequestMessageContentPart } from './chatCompletionRequestMessageContentPart';
import { ChatCompletionRequestMessageContentPartImage } from './chatCompletionRequestMessageContentPartImage';
import { ChatCompletionRequestMessageContentPartImageImageUrl } from './chatCompletionRequestMessageContentPartImageImageUrl';
import { ChatCompletionRequestMessageContentPartText } from './chatCompletionRequestMessageContentPartText';
import { ChatCompletionRequestSystemMessage } from './chatCompletionRequestSystemMessage';
import { ChatCompletionRequestToolMessage } from './chatCompletionRequestToolMessage';
import { ChatCompletionRequestUserMessage } from './chatCompletionRequestUserMessage';
import { ChatCompletionRequestUserMessageContent } from './chatCompletionRequestUserMessageContent';
import { ChatCompletionResponseMessage } from './chatCompletionResponseMessage';
import { ChatCompletionRole } from './chatCompletionRole';
import { ChatCompletionStreamResponseDelta } from './chatCompletionStreamResponseDelta';
import { ChatCompletionStreamResponseDeltaFunctionCall } from './chatCompletionStreamResponseDeltaFunctionCall';
import { ChatCompletionTokenLogprob } from './chatCompletionTokenLogprob';
import { ChatCompletionTokenLogprobTopLogprobsInner } from './chatCompletionTokenLogprobTopLogprobsInner';
import { ChatCompletionTool } from './chatCompletionTool';
import { ChatCompletionToolChoiceOption } from './chatCompletionToolChoiceOption';
import { CompletionUsage } from './completionUsage';
import { CreateAssistantFileRequest } from './createAssistantFileRequest';
import { CreateAssistantRequest } from './createAssistantRequest';
import { CreateAssistantRequestModel } from './createAssistantRequestModel';
import { CreateChatCompletionFunctionResponse } from './createChatCompletionFunctionResponse';
import { CreateChatCompletionFunctionResponseChoicesInner } from './createChatCompletionFunctionResponseChoicesInner';
import { CreateChatCompletionRequest } from './createChatCompletionRequest';
import { CreateChatCompletionRequestFunctionCall } from './createChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestModel } from './createChatCompletionRequestModel';
import { CreateChatCompletionRequestResponseFormat } from './createChatCompletionRequestResponseFormat';
import { CreateChatCompletionRequestStop } from './createChatCompletionRequestStop';
import { CreateChatCompletionResponse } from './createChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner } from './createChatCompletionResponseChoicesInner';
import { CreateChatCompletionResponseChoicesInnerLogprobs } from './createChatCompletionResponseChoicesInnerLogprobs';
import { CreateChatCompletionStreamResponse } from './createChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner } from './createChatCompletionStreamResponseChoicesInner';
import { CreateCompletionRequest } from './createCompletionRequest';
import { CreateCompletionRequestModel } from './createCompletionRequestModel';
import { CreateCompletionRequestPrompt } from './createCompletionRequestPrompt';
import { CreateCompletionRequestStop } from './createCompletionRequestStop';
import { CreateCompletionResponse } from './createCompletionResponse';
import { CreateCompletionResponseChoicesInner } from './createCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from './createCompletionResponseChoicesInnerLogprobs';
import { CreateEmbeddingRequest } from './createEmbeddingRequest';
import { CreateEmbeddingRequestInput } from './createEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from './createEmbeddingRequestModel';
import { CreateEmbeddingResponse } from './createEmbeddingResponse';
import { CreateEmbeddingResponseUsage } from './createEmbeddingResponseUsage';
import { CreateFineTuningJobRequest } from './createFineTuningJobRequest';
import { CreateFineTuningJobRequestHyperparameters } from './createFineTuningJobRequestHyperparameters';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from './createFineTuningJobRequestHyperparametersBatchSize';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from './createFineTuningJobRequestHyperparametersLearningRateMultiplier';
import { CreateFineTuningJobRequestHyperparametersNEpochs } from './createFineTuningJobRequestHyperparametersNEpochs';
import { CreateFineTuningJobRequestIntegrationsInner } from './createFineTuningJobRequestIntegrationsInner';
import { CreateFineTuningJobRequestIntegrationsInnerType } from './createFineTuningJobRequestIntegrationsInnerType';
import { CreateFineTuningJobRequestIntegrationsInnerWandb } from './createFineTuningJobRequestIntegrationsInnerWandb';
import { CreateFineTuningJobRequestModel } from './createFineTuningJobRequestModel';
import { CreateImageEditRequestModel } from './createImageEditRequestModel';
import { CreateImageRequest } from './createImageRequest';
import { CreateImageRequestModel } from './createImageRequestModel';
import { CreateMessageRequest } from './createMessageRequest';
import { CreateModerationRequest } from './createModerationRequest';
import { CreateModerationRequestInput } from './createModerationRequestInput';
import { CreateModerationRequestModel } from './createModerationRequestModel';
import { CreateModerationResponse } from './createModerationResponse';
import { CreateModerationResponseResultsInner } from './createModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from './createModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryScores } from './createModerationResponseResultsInnerCategoryScores';
import { CreateRunRequest } from './createRunRequest';
import { CreateRunRequestModel } from './createRunRequestModel';
import { CreateSpeechRequest } from './createSpeechRequest';
import { CreateSpeechRequestModel } from './createSpeechRequestModel';
import { CreateThreadAndRunRequest } from './createThreadAndRunRequest';
import { CreateThreadAndRunRequestToolsInner } from './createThreadAndRunRequestToolsInner';
import { CreateThreadRequest } from './createThreadRequest';
import { CreateTranscription200Response } from './createTranscription200Response';
import { CreateTranscriptionRequestModel } from './createTranscriptionRequestModel';
import { CreateTranscriptionResponseJson } from './createTranscriptionResponseJson';
import { CreateTranscriptionResponseVerboseJson } from './createTranscriptionResponseVerboseJson';
import { CreateTranslation200Response } from './createTranslation200Response';
import { CreateTranslationResponseJson } from './createTranslationResponseJson';
import { CreateTranslationResponseVerboseJson } from './createTranslationResponseVerboseJson';
import { DeleteAssistantFileResponse } from './deleteAssistantFileResponse';
import { DeleteAssistantResponse } from './deleteAssistantResponse';
import { DeleteFileResponse } from './deleteFileResponse';
import { DeleteMessageResponse } from './deleteMessageResponse';
import { DeleteModelResponse } from './deleteModelResponse';
import { DeleteThreadResponse } from './deleteThreadResponse';
import { DoneEvent } from './doneEvent';
import { Embedding } from './embedding';
import { ErrorEvent } from './errorEvent';
import { ErrorResponse } from './errorResponse';
import { FineTuningIntegration } from './fineTuningIntegration';
import { FineTuningJob } from './fineTuningJob';
import { FineTuningJobCheckpoint } from './fineTuningJobCheckpoint';
import { FineTuningJobCheckpointMetrics } from './fineTuningJobCheckpointMetrics';
import { FineTuningJobError } from './fineTuningJobError';
import { FineTuningJobEvent } from './fineTuningJobEvent';
import { FineTuningJobHyperparameters } from './fineTuningJobHyperparameters';
import { FineTuningJobHyperparametersNEpochs } from './fineTuningJobHyperparametersNEpochs';
import { FineTuningJobIntegrationsInner } from './fineTuningJobIntegrationsInner';
import { FunctionObject } from './functionObject';
import { Image } from './image';
import { ImagesResponse } from './imagesResponse';
import { ListAssistantFilesResponse } from './listAssistantFilesResponse';
import { ListAssistantsResponse } from './listAssistantsResponse';
import { ListFilesResponse } from './listFilesResponse';
import { ListFineTuningJobCheckpointsResponse } from './listFineTuningJobCheckpointsResponse';
import { ListFineTuningJobEventsResponse } from './listFineTuningJobEventsResponse';
import { ListMessageFilesResponse } from './listMessageFilesResponse';
import { ListMessagesResponse } from './listMessagesResponse';
import { ListModelsResponse } from './listModelsResponse';
import { ListPaginatedFineTuningJobsResponse } from './listPaginatedFineTuningJobsResponse';
import { ListRunStepsResponse } from './listRunStepsResponse';
import { ListRunsResponse } from './listRunsResponse';
import { ListThreadsResponse } from './listThreadsResponse';
import { MessageContentImageFileObject } from './messageContentImageFileObject';
import { MessageContentImageFileObjectImageFile } from './messageContentImageFileObjectImageFile';
import { MessageContentTextAnnotationsFileCitationObject } from './messageContentTextAnnotationsFileCitationObject';
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from './messageContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageContentTextAnnotationsFilePathObject } from './messageContentTextAnnotationsFilePathObject';
import { MessageContentTextAnnotationsFilePathObjectFilePath } from './messageContentTextAnnotationsFilePathObjectFilePath';
import { MessageContentTextObject } from './messageContentTextObject';
import { MessageContentTextObjectText } from './messageContentTextObjectText';
import { MessageContentTextObjectTextAnnotationsInner } from './messageContentTextObjectTextAnnotationsInner';
import { MessageDeltaContentImageFileObject } from './messageDeltaContentImageFileObject';
import { MessageDeltaContentImageFileObjectImageFile } from './messageDeltaContentImageFileObjectImageFile';
import { MessageDeltaContentTextAnnotationsFileCitationObject } from './messageDeltaContentTextAnnotationsFileCitationObject';
import { MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation } from './messageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageDeltaContentTextAnnotationsFilePathObject } from './messageDeltaContentTextAnnotationsFilePathObject';
import { MessageDeltaContentTextAnnotationsFilePathObjectFilePath } from './messageDeltaContentTextAnnotationsFilePathObjectFilePath';
import { MessageDeltaContentTextObject } from './messageDeltaContentTextObject';
import { MessageDeltaContentTextObjectText } from './messageDeltaContentTextObjectText';
import { MessageDeltaContentTextObjectTextAnnotationsInner } from './messageDeltaContentTextObjectTextAnnotationsInner';
import { MessageDeltaObject } from './messageDeltaObject';
import { MessageDeltaObjectDelta } from './messageDeltaObjectDelta';
import { MessageDeltaObjectDeltaContentInner } from './messageDeltaObjectDeltaContentInner';
import { MessageFileObject } from './messageFileObject';
import { MessageObject } from './messageObject';
import { MessageObjectContentInner } from './messageObjectContentInner';
import { MessageObjectIncompleteDetails } from './messageObjectIncompleteDetails';
import { MessageStreamEvent } from './messageStreamEvent';
import { MessageStreamEventOneOf } from './messageStreamEventOneOf';
import { MessageStreamEventOneOf1 } from './messageStreamEventOneOf1';
import { MessageStreamEventOneOf2 } from './messageStreamEventOneOf2';
import { MessageStreamEventOneOf3 } from './messageStreamEventOneOf3';
import { MessageStreamEventOneOf4 } from './messageStreamEventOneOf4';
import { Model } from './model';
import { ModelError } from './modelError';
import { ModifyAssistantRequest } from './modifyAssistantRequest';
import { ModifyMessageRequest } from './modifyMessageRequest';
import { ModifyRunRequest } from './modifyRunRequest';
import { ModifyThreadRequest } from './modifyThreadRequest';
import { OpenAIFile } from './openAIFile';
import { RunCompletionUsage } from './runCompletionUsage';
import { RunObject } from './runObject';
import { RunObjectIncompleteDetails } from './runObjectIncompleteDetails';
import { RunObjectLastError } from './runObjectLastError';
import { RunObjectRequiredAction } from './runObjectRequiredAction';
import { RunObjectRequiredActionSubmitToolOutputs } from './runObjectRequiredActionSubmitToolOutputs';
import { RunStepCompletionUsage } from './runStepCompletionUsage';
import { RunStepDeltaObject } from './runStepDeltaObject';
import { RunStepDeltaObjectDelta } from './runStepDeltaObjectDelta';
import { RunStepDeltaObjectDeltaStepDetails } from './runStepDeltaObjectDeltaStepDetails';
import { RunStepDeltaStepDetailsMessageCreationObject } from './runStepDeltaStepDetailsMessageCreationObject';
import { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from './runStepDeltaStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDeltaStepDetailsToolCallsCodeObject } from './runStepDeltaStepDetailsToolCallsCodeObject';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from './runStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObject } from './runStepDeltaStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject } from './runStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObject } from './runStepDeltaStepDetailsToolCallsFunctionObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from './runStepDeltaStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDeltaStepDetailsToolCallsObject } from './runStepDeltaStepDetailsToolCallsObject';
import { RunStepDeltaStepDetailsToolCallsObjectToolCallsInner } from './runStepDeltaStepDetailsToolCallsObjectToolCallsInner';
import { RunStepDeltaStepDetailsToolCallsRetrievalObject } from './runStepDeltaStepDetailsToolCallsRetrievalObject';
import { RunStepDetailsMessageCreationObject } from './runStepDetailsMessageCreationObject';
import { RunStepDetailsMessageCreationObjectMessageCreation } from './runStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDetailsToolCallsCodeObject } from './runStepDetailsToolCallsCodeObject';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from './runStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDetailsToolCallsCodeOutputImageObject } from './runStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDetailsToolCallsCodeOutputLogsObject } from './runStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDetailsToolCallsFunctionObject } from './runStepDetailsToolCallsFunctionObject';
import { RunStepDetailsToolCallsFunctionObjectFunction } from './runStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDetailsToolCallsObject } from './runStepDetailsToolCallsObject';
import { RunStepDetailsToolCallsObjectToolCallsInner } from './runStepDetailsToolCallsObjectToolCallsInner';
import { RunStepDetailsToolCallsRetrievalObject } from './runStepDetailsToolCallsRetrievalObject';
import { RunStepObject } from './runStepObject';
import { RunStepObjectLastError } from './runStepObjectLastError';
import { RunStepObjectStepDetails } from './runStepObjectStepDetails';
import { RunStepStreamEvent } from './runStepStreamEvent';
import { RunStepStreamEventOneOf } from './runStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from './runStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from './runStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from './runStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from './runStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from './runStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from './runStepStreamEventOneOf6';
import { RunStreamEvent } from './runStreamEvent';
import { RunStreamEventOneOf } from './runStreamEventOneOf';
import { RunStreamEventOneOf1 } from './runStreamEventOneOf1';
import { RunStreamEventOneOf2 } from './runStreamEventOneOf2';
import { RunStreamEventOneOf3 } from './runStreamEventOneOf3';
import { RunStreamEventOneOf4 } from './runStreamEventOneOf4';
import { RunStreamEventOneOf5 } from './runStreamEventOneOf5';
import { RunStreamEventOneOf6 } from './runStreamEventOneOf6';
import { RunStreamEventOneOf7 } from './runStreamEventOneOf7';
import { RunStreamEventOneOf8 } from './runStreamEventOneOf8';
import { RunToolCallObject } from './runToolCallObject';
import { RunToolCallObjectFunction } from './runToolCallObjectFunction';
import { SubmitToolOutputsRunRequest } from './submitToolOutputsRunRequest';
import { SubmitToolOutputsRunRequestToolOutputsInner } from './submitToolOutputsRunRequestToolOutputsInner';
import { ThreadObject } from './threadObject';
import { ThreadStreamEvent } from './threadStreamEvent';
import { ThreadStreamEventOneOf } from './threadStreamEventOneOf';
import { TranscriptionSegment } from './transcriptionSegment';
import { TranscriptionWord } from './transcriptionWord';
import { TruncationObject } from './truncationObject';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "AssistantFileObject.ObjectEnum": AssistantFileObject.ObjectEnum,
        "AssistantObject.ObjectEnum": AssistantObject.ObjectEnum,
        "AssistantObjectToolsInner.TypeEnum": AssistantObjectToolsInner.TypeEnum,
        "AssistantStreamEvent.EventEnum": AssistantStreamEvent.EventEnum,
        "AssistantStreamEvent.DataEnum": AssistantStreamEvent.DataEnum,
        "AssistantToolsCode.TypeEnum": AssistantToolsCode.TypeEnum,
        "AssistantToolsFunction.TypeEnum": AssistantToolsFunction.TypeEnum,
        "AssistantToolsRetrieval.TypeEnum": AssistantToolsRetrieval.TypeEnum,
        "AssistantsApiNamedToolChoice.TypeEnum": AssistantsApiNamedToolChoice.TypeEnum,
        "AssistantsApiResponseFormat.TypeEnum": AssistantsApiResponseFormat.TypeEnum,
        "AssistantsApiResponseFormatOption.TypeEnum": AssistantsApiResponseFormatOption.TypeEnum,
        "AssistantsApiToolChoiceOption.TypeEnum": AssistantsApiToolChoiceOption.TypeEnum,
        "ChatCompletionMessageToolCall.TypeEnum": ChatCompletionMessageToolCall.TypeEnum,
        "ChatCompletionMessageToolCallChunk.TypeEnum": ChatCompletionMessageToolCallChunk.TypeEnum,
        "ChatCompletionNamedToolChoice.TypeEnum": ChatCompletionNamedToolChoice.TypeEnum,
        "ChatCompletionRequestAssistantMessage.RoleEnum": ChatCompletionRequestAssistantMessage.RoleEnum,
        "ChatCompletionRequestFunctionMessage.RoleEnum": ChatCompletionRequestFunctionMessage.RoleEnum,
        "ChatCompletionRequestMessage.RoleEnum": ChatCompletionRequestMessage.RoleEnum,
        "ChatCompletionRequestMessageContentPart.TypeEnum": ChatCompletionRequestMessageContentPart.TypeEnum,
        "ChatCompletionRequestMessageContentPartImage.TypeEnum": ChatCompletionRequestMessageContentPartImage.TypeEnum,
        "ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum": ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum,
        "ChatCompletionRequestMessageContentPartText.TypeEnum": ChatCompletionRequestMessageContentPartText.TypeEnum,
        "ChatCompletionRequestSystemMessage.RoleEnum": ChatCompletionRequestSystemMessage.RoleEnum,
        "ChatCompletionRequestToolMessage.RoleEnum": ChatCompletionRequestToolMessage.RoleEnum,
        "ChatCompletionRequestUserMessage.RoleEnum": ChatCompletionRequestUserMessage.RoleEnum,
        "ChatCompletionResponseMessage.RoleEnum": ChatCompletionResponseMessage.RoleEnum,
        "ChatCompletionRole": ChatCompletionRole,
        "ChatCompletionStreamResponseDelta.RoleEnum": ChatCompletionStreamResponseDelta.RoleEnum,
        "ChatCompletionTool.TypeEnum": ChatCompletionTool.TypeEnum,
        "ChatCompletionToolChoiceOption.TypeEnum": ChatCompletionToolChoiceOption.TypeEnum,
        "CreateChatCompletionFunctionResponse.ObjectEnum": CreateChatCompletionFunctionResponse.ObjectEnum,
        "CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum": CreateChatCompletionFunctionResponseChoicesInner.FinishReasonEnum,
        "CreateChatCompletionRequestResponseFormat.TypeEnum": CreateChatCompletionRequestResponseFormat.TypeEnum,
        "CreateChatCompletionResponse.ObjectEnum": CreateChatCompletionResponse.ObjectEnum,
        "CreateChatCompletionResponseChoicesInner.FinishReasonEnum": CreateChatCompletionResponseChoicesInner.FinishReasonEnum,
        "CreateChatCompletionStreamResponse.ObjectEnum": CreateChatCompletionStreamResponse.ObjectEnum,
        "CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum": CreateChatCompletionStreamResponseChoicesInner.FinishReasonEnum,
        "CreateCompletionResponse.ObjectEnum": CreateCompletionResponse.ObjectEnum,
        "CreateCompletionResponseChoicesInner.FinishReasonEnum": CreateCompletionResponseChoicesInner.FinishReasonEnum,
        "CreateEmbeddingRequest.EncodingFormatEnum": CreateEmbeddingRequest.EncodingFormatEnum,
        "CreateEmbeddingResponse.ObjectEnum": CreateEmbeddingResponse.ObjectEnum,
        "CreateImageRequest.QualityEnum": CreateImageRequest.QualityEnum,
        "CreateImageRequest.ResponseFormatEnum": CreateImageRequest.ResponseFormatEnum,
        "CreateImageRequest.SizeEnum": CreateImageRequest.SizeEnum,
        "CreateImageRequest.StyleEnum": CreateImageRequest.StyleEnum,
        "CreateMessageRequest.RoleEnum": CreateMessageRequest.RoleEnum,
        "CreateSpeechRequest.VoiceEnum": CreateSpeechRequest.VoiceEnum,
        "CreateSpeechRequest.ResponseFormatEnum": CreateSpeechRequest.ResponseFormatEnum,
        "CreateThreadAndRunRequestToolsInner.TypeEnum": CreateThreadAndRunRequestToolsInner.TypeEnum,
        "DeleteAssistantFileResponse.ObjectEnum": DeleteAssistantFileResponse.ObjectEnum,
        "DeleteAssistantResponse.ObjectEnum": DeleteAssistantResponse.ObjectEnum,
        "DeleteFileResponse.ObjectEnum": DeleteFileResponse.ObjectEnum,
        "DeleteMessageResponse.ObjectEnum": DeleteMessageResponse.ObjectEnum,
        "DeleteThreadResponse.ObjectEnum": DeleteThreadResponse.ObjectEnum,
        "DoneEvent.EventEnum": DoneEvent.EventEnum,
        "DoneEvent.DataEnum": DoneEvent.DataEnum,
        "Embedding.ObjectEnum": Embedding.ObjectEnum,
        "ErrorEvent.EventEnum": ErrorEvent.EventEnum,
        "FineTuningIntegration.TypeEnum": FineTuningIntegration.TypeEnum,
        "FineTuningJob.ObjectEnum": FineTuningJob.ObjectEnum,
        "FineTuningJob.StatusEnum": FineTuningJob.StatusEnum,
        "FineTuningJobCheckpoint.ObjectEnum": FineTuningJobCheckpoint.ObjectEnum,
        "FineTuningJobEvent.LevelEnum": FineTuningJobEvent.LevelEnum,
        "FineTuningJobEvent.ObjectEnum": FineTuningJobEvent.ObjectEnum,
        "FineTuningJobIntegrationsInner.TypeEnum": FineTuningJobIntegrationsInner.TypeEnum,
        "ListFilesResponse.ObjectEnum": ListFilesResponse.ObjectEnum,
        "ListFineTuningJobCheckpointsResponse.ObjectEnum": ListFineTuningJobCheckpointsResponse.ObjectEnum,
        "ListFineTuningJobEventsResponse.ObjectEnum": ListFineTuningJobEventsResponse.ObjectEnum,
        "ListModelsResponse.ObjectEnum": ListModelsResponse.ObjectEnum,
        "ListPaginatedFineTuningJobsResponse.ObjectEnum": ListPaginatedFineTuningJobsResponse.ObjectEnum,
        "MessageContentImageFileObject.TypeEnum": MessageContentImageFileObject.TypeEnum,
        "MessageContentTextAnnotationsFileCitationObject.TypeEnum": MessageContentTextAnnotationsFileCitationObject.TypeEnum,
        "MessageContentTextAnnotationsFilePathObject.TypeEnum": MessageContentTextAnnotationsFilePathObject.TypeEnum,
        "MessageContentTextObject.TypeEnum": MessageContentTextObject.TypeEnum,
        "MessageContentTextObjectTextAnnotationsInner.TypeEnum": MessageContentTextObjectTextAnnotationsInner.TypeEnum,
        "MessageDeltaContentImageFileObject.TypeEnum": MessageDeltaContentImageFileObject.TypeEnum,
        "MessageDeltaContentTextAnnotationsFileCitationObject.TypeEnum": MessageDeltaContentTextAnnotationsFileCitationObject.TypeEnum,
        "MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum": MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum,
        "MessageDeltaContentTextObject.TypeEnum": MessageDeltaContentTextObject.TypeEnum,
        "MessageDeltaContentTextObjectTextAnnotationsInner.TypeEnum": MessageDeltaContentTextObjectTextAnnotationsInner.TypeEnum,
        "MessageDeltaObject.ObjectEnum": MessageDeltaObject.ObjectEnum,
        "MessageDeltaObjectDelta.RoleEnum": MessageDeltaObjectDelta.RoleEnum,
        "MessageDeltaObjectDeltaContentInner.TypeEnum": MessageDeltaObjectDeltaContentInner.TypeEnum,
        "MessageFileObject.ObjectEnum": MessageFileObject.ObjectEnum,
        "MessageObject.ObjectEnum": MessageObject.ObjectEnum,
        "MessageObject.StatusEnum": MessageObject.StatusEnum,
        "MessageObject.RoleEnum": MessageObject.RoleEnum,
        "MessageObjectContentInner.TypeEnum": MessageObjectContentInner.TypeEnum,
        "MessageObjectIncompleteDetails.ReasonEnum": MessageObjectIncompleteDetails.ReasonEnum,
        "MessageStreamEvent.EventEnum": MessageStreamEvent.EventEnum,
        "MessageStreamEventOneOf.EventEnum": MessageStreamEventOneOf.EventEnum,
        "MessageStreamEventOneOf1.EventEnum": MessageStreamEventOneOf1.EventEnum,
        "MessageStreamEventOneOf2.EventEnum": MessageStreamEventOneOf2.EventEnum,
        "MessageStreamEventOneOf3.EventEnum": MessageStreamEventOneOf3.EventEnum,
        "MessageStreamEventOneOf4.EventEnum": MessageStreamEventOneOf4.EventEnum,
        "Model.ObjectEnum": Model.ObjectEnum,
        "OpenAIFile.ObjectEnum": OpenAIFile.ObjectEnum,
        "OpenAIFile.PurposeEnum": OpenAIFile.PurposeEnum,
        "OpenAIFile.StatusEnum": OpenAIFile.StatusEnum,
        "RunObject.ObjectEnum": RunObject.ObjectEnum,
        "RunObject.StatusEnum": RunObject.StatusEnum,
        "RunObjectIncompleteDetails.ReasonEnum": RunObjectIncompleteDetails.ReasonEnum,
        "RunObjectLastError.CodeEnum": RunObjectLastError.CodeEnum,
        "RunObjectRequiredAction.TypeEnum": RunObjectRequiredAction.TypeEnum,
        "RunStepDeltaObject.ObjectEnum": RunStepDeltaObject.ObjectEnum,
        "RunStepDeltaObjectDeltaStepDetails.TypeEnum": RunStepDeltaObjectDeltaStepDetails.TypeEnum,
        "RunStepDeltaStepDetailsMessageCreationObject.TypeEnum": RunStepDeltaStepDetailsMessageCreationObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeObject.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum": RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsFunctionObject.TypeEnum": RunStepDeltaStepDetailsToolCallsFunctionObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsObject.TypeEnum": RunStepDeltaStepDetailsToolCallsObject.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.TypeEnum": RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.TypeEnum,
        "RunStepDeltaStepDetailsToolCallsRetrievalObject.TypeEnum": RunStepDeltaStepDetailsToolCallsRetrievalObject.TypeEnum,
        "RunStepDetailsMessageCreationObject.TypeEnum": RunStepDetailsMessageCreationObject.TypeEnum,
        "RunStepDetailsToolCallsCodeObject.TypeEnum": RunStepDetailsToolCallsCodeObject.TypeEnum,
        "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum": RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum,
        "RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum": RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum,
        "RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum": RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum,
        "RunStepDetailsToolCallsFunctionObject.TypeEnum": RunStepDetailsToolCallsFunctionObject.TypeEnum,
        "RunStepDetailsToolCallsObject.TypeEnum": RunStepDetailsToolCallsObject.TypeEnum,
        "RunStepDetailsToolCallsObjectToolCallsInner.TypeEnum": RunStepDetailsToolCallsObjectToolCallsInner.TypeEnum,
        "RunStepDetailsToolCallsRetrievalObject.TypeEnum": RunStepDetailsToolCallsRetrievalObject.TypeEnum,
        "RunStepObject.ObjectEnum": RunStepObject.ObjectEnum,
        "RunStepObject.TypeEnum": RunStepObject.TypeEnum,
        "RunStepObject.StatusEnum": RunStepObject.StatusEnum,
        "RunStepObjectLastError.CodeEnum": RunStepObjectLastError.CodeEnum,
        "RunStepObjectStepDetails.TypeEnum": RunStepObjectStepDetails.TypeEnum,
        "RunStepStreamEvent.EventEnum": RunStepStreamEvent.EventEnum,
        "RunStepStreamEventOneOf.EventEnum": RunStepStreamEventOneOf.EventEnum,
        "RunStepStreamEventOneOf1.EventEnum": RunStepStreamEventOneOf1.EventEnum,
        "RunStepStreamEventOneOf2.EventEnum": RunStepStreamEventOneOf2.EventEnum,
        "RunStepStreamEventOneOf3.EventEnum": RunStepStreamEventOneOf3.EventEnum,
        "RunStepStreamEventOneOf4.EventEnum": RunStepStreamEventOneOf4.EventEnum,
        "RunStepStreamEventOneOf5.EventEnum": RunStepStreamEventOneOf5.EventEnum,
        "RunStepStreamEventOneOf6.EventEnum": RunStepStreamEventOneOf6.EventEnum,
        "RunStreamEvent.EventEnum": RunStreamEvent.EventEnum,
        "RunStreamEventOneOf.EventEnum": RunStreamEventOneOf.EventEnum,
        "RunStreamEventOneOf1.EventEnum": RunStreamEventOneOf1.EventEnum,
        "RunStreamEventOneOf2.EventEnum": RunStreamEventOneOf2.EventEnum,
        "RunStreamEventOneOf3.EventEnum": RunStreamEventOneOf3.EventEnum,
        "RunStreamEventOneOf4.EventEnum": RunStreamEventOneOf4.EventEnum,
        "RunStreamEventOneOf5.EventEnum": RunStreamEventOneOf5.EventEnum,
        "RunStreamEventOneOf6.EventEnum": RunStreamEventOneOf6.EventEnum,
        "RunStreamEventOneOf7.EventEnum": RunStreamEventOneOf7.EventEnum,
        "RunStreamEventOneOf8.EventEnum": RunStreamEventOneOf8.EventEnum,
        "RunToolCallObject.TypeEnum": RunToolCallObject.TypeEnum,
        "ThreadObject.ObjectEnum": ThreadObject.ObjectEnum,
        "ThreadStreamEvent.EventEnum": ThreadStreamEvent.EventEnum,
        "ThreadStreamEventOneOf.EventEnum": ThreadStreamEventOneOf.EventEnum,
        "TruncationObject.TypeEnum": TruncationObject.TypeEnum,
}

let typeMap: {[index: string]: any} = {
    "AssistantFileObject": AssistantFileObject,
    "AssistantObject": AssistantObject,
    "AssistantObjectToolsInner": AssistantObjectToolsInner,
    "AssistantStreamEvent": AssistantStreamEvent,
    "AssistantToolsCode": AssistantToolsCode,
    "AssistantToolsFunction": AssistantToolsFunction,
    "AssistantToolsRetrieval": AssistantToolsRetrieval,
    "AssistantsApiNamedToolChoice": AssistantsApiNamedToolChoice,
    "AssistantsApiResponseFormat": AssistantsApiResponseFormat,
    "AssistantsApiResponseFormatOption": AssistantsApiResponseFormatOption,
    "AssistantsApiToolChoiceOption": AssistantsApiToolChoiceOption,
    "ChatCompletionFunctionCallOption": ChatCompletionFunctionCallOption,
    "ChatCompletionFunctions": ChatCompletionFunctions,
    "ChatCompletionMessageToolCall": ChatCompletionMessageToolCall,
    "ChatCompletionMessageToolCallChunk": ChatCompletionMessageToolCallChunk,
    "ChatCompletionMessageToolCallChunkFunction": ChatCompletionMessageToolCallChunkFunction,
    "ChatCompletionMessageToolCallFunction": ChatCompletionMessageToolCallFunction,
    "ChatCompletionNamedToolChoice": ChatCompletionNamedToolChoice,
    "ChatCompletionNamedToolChoiceFunction": ChatCompletionNamedToolChoiceFunction,
    "ChatCompletionRequestAssistantMessage": ChatCompletionRequestAssistantMessage,
    "ChatCompletionRequestAssistantMessageFunctionCall": ChatCompletionRequestAssistantMessageFunctionCall,
    "ChatCompletionRequestFunctionMessage": ChatCompletionRequestFunctionMessage,
    "ChatCompletionRequestMessage": ChatCompletionRequestMessage,
    "ChatCompletionRequestMessageContentPart": ChatCompletionRequestMessageContentPart,
    "ChatCompletionRequestMessageContentPartImage": ChatCompletionRequestMessageContentPartImage,
    "ChatCompletionRequestMessageContentPartImageImageUrl": ChatCompletionRequestMessageContentPartImageImageUrl,
    "ChatCompletionRequestMessageContentPartText": ChatCompletionRequestMessageContentPartText,
    "ChatCompletionRequestSystemMessage": ChatCompletionRequestSystemMessage,
    "ChatCompletionRequestToolMessage": ChatCompletionRequestToolMessage,
    "ChatCompletionRequestUserMessage": ChatCompletionRequestUserMessage,
    "ChatCompletionRequestUserMessageContent": ChatCompletionRequestUserMessageContent,
    "ChatCompletionResponseMessage": ChatCompletionResponseMessage,
    "ChatCompletionStreamResponseDelta": ChatCompletionStreamResponseDelta,
    "ChatCompletionStreamResponseDeltaFunctionCall": ChatCompletionStreamResponseDeltaFunctionCall,
    "ChatCompletionTokenLogprob": ChatCompletionTokenLogprob,
    "ChatCompletionTokenLogprobTopLogprobsInner": ChatCompletionTokenLogprobTopLogprobsInner,
    "ChatCompletionTool": ChatCompletionTool,
    "ChatCompletionToolChoiceOption": ChatCompletionToolChoiceOption,
    "CompletionUsage": CompletionUsage,
    "CreateAssistantFileRequest": CreateAssistantFileRequest,
    "CreateAssistantRequest": CreateAssistantRequest,
    "CreateAssistantRequestModel": CreateAssistantRequestModel,
    "CreateChatCompletionFunctionResponse": CreateChatCompletionFunctionResponse,
    "CreateChatCompletionFunctionResponseChoicesInner": CreateChatCompletionFunctionResponseChoicesInner,
    "CreateChatCompletionRequest": CreateChatCompletionRequest,
    "CreateChatCompletionRequestFunctionCall": CreateChatCompletionRequestFunctionCall,
    "CreateChatCompletionRequestModel": CreateChatCompletionRequestModel,
    "CreateChatCompletionRequestResponseFormat": CreateChatCompletionRequestResponseFormat,
    "CreateChatCompletionRequestStop": CreateChatCompletionRequestStop,
    "CreateChatCompletionResponse": CreateChatCompletionResponse,
    "CreateChatCompletionResponseChoicesInner": CreateChatCompletionResponseChoicesInner,
    "CreateChatCompletionResponseChoicesInnerLogprobs": CreateChatCompletionResponseChoicesInnerLogprobs,
    "CreateChatCompletionStreamResponse": CreateChatCompletionStreamResponse,
    "CreateChatCompletionStreamResponseChoicesInner": CreateChatCompletionStreamResponseChoicesInner,
    "CreateCompletionRequest": CreateCompletionRequest,
    "CreateCompletionRequestModel": CreateCompletionRequestModel,
    "CreateCompletionRequestPrompt": CreateCompletionRequestPrompt,
    "CreateCompletionRequestStop": CreateCompletionRequestStop,
    "CreateCompletionResponse": CreateCompletionResponse,
    "CreateCompletionResponseChoicesInner": CreateCompletionResponseChoicesInner,
    "CreateCompletionResponseChoicesInnerLogprobs": CreateCompletionResponseChoicesInnerLogprobs,
    "CreateEmbeddingRequest": CreateEmbeddingRequest,
    "CreateEmbeddingRequestInput": CreateEmbeddingRequestInput,
    "CreateEmbeddingRequestModel": CreateEmbeddingRequestModel,
    "CreateEmbeddingResponse": CreateEmbeddingResponse,
    "CreateEmbeddingResponseUsage": CreateEmbeddingResponseUsage,
    "CreateFineTuningJobRequest": CreateFineTuningJobRequest,
    "CreateFineTuningJobRequestHyperparameters": CreateFineTuningJobRequestHyperparameters,
    "CreateFineTuningJobRequestHyperparametersBatchSize": CreateFineTuningJobRequestHyperparametersBatchSize,
    "CreateFineTuningJobRequestHyperparametersLearningRateMultiplier": CreateFineTuningJobRequestHyperparametersLearningRateMultiplier,
    "CreateFineTuningJobRequestHyperparametersNEpochs": CreateFineTuningJobRequestHyperparametersNEpochs,
    "CreateFineTuningJobRequestIntegrationsInner": CreateFineTuningJobRequestIntegrationsInner,
    "CreateFineTuningJobRequestIntegrationsInnerType": CreateFineTuningJobRequestIntegrationsInnerType,
    "CreateFineTuningJobRequestIntegrationsInnerWandb": CreateFineTuningJobRequestIntegrationsInnerWandb,
    "CreateFineTuningJobRequestModel": CreateFineTuningJobRequestModel,
    "CreateImageEditRequestModel": CreateImageEditRequestModel,
    "CreateImageRequest": CreateImageRequest,
    "CreateImageRequestModel": CreateImageRequestModel,
    "CreateMessageRequest": CreateMessageRequest,
    "CreateModerationRequest": CreateModerationRequest,
    "CreateModerationRequestInput": CreateModerationRequestInput,
    "CreateModerationRequestModel": CreateModerationRequestModel,
    "CreateModerationResponse": CreateModerationResponse,
    "CreateModerationResponseResultsInner": CreateModerationResponseResultsInner,
    "CreateModerationResponseResultsInnerCategories": CreateModerationResponseResultsInnerCategories,
    "CreateModerationResponseResultsInnerCategoryScores": CreateModerationResponseResultsInnerCategoryScores,
    "CreateRunRequest": CreateRunRequest,
    "CreateRunRequestModel": CreateRunRequestModel,
    "CreateSpeechRequest": CreateSpeechRequest,
    "CreateSpeechRequestModel": CreateSpeechRequestModel,
    "CreateThreadAndRunRequest": CreateThreadAndRunRequest,
    "CreateThreadAndRunRequestToolsInner": CreateThreadAndRunRequestToolsInner,
    "CreateThreadRequest": CreateThreadRequest,
    "CreateTranscription200Response": CreateTranscription200Response,
    "CreateTranscriptionRequestModel": CreateTranscriptionRequestModel,
    "CreateTranscriptionResponseJson": CreateTranscriptionResponseJson,
    "CreateTranscriptionResponseVerboseJson": CreateTranscriptionResponseVerboseJson,
    "CreateTranslation200Response": CreateTranslation200Response,
    "CreateTranslationResponseJson": CreateTranslationResponseJson,
    "CreateTranslationResponseVerboseJson": CreateTranslationResponseVerboseJson,
    "DeleteAssistantFileResponse": DeleteAssistantFileResponse,
    "DeleteAssistantResponse": DeleteAssistantResponse,
    "DeleteFileResponse": DeleteFileResponse,
    "DeleteMessageResponse": DeleteMessageResponse,
    "DeleteModelResponse": DeleteModelResponse,
    "DeleteThreadResponse": DeleteThreadResponse,
    "DoneEvent": DoneEvent,
    "Embedding": Embedding,
    "ErrorEvent": ErrorEvent,
    "ErrorResponse": ErrorResponse,
    "FineTuningIntegration": FineTuningIntegration,
    "FineTuningJob": FineTuningJob,
    "FineTuningJobCheckpoint": FineTuningJobCheckpoint,
    "FineTuningJobCheckpointMetrics": FineTuningJobCheckpointMetrics,
    "FineTuningJobError": FineTuningJobError,
    "FineTuningJobEvent": FineTuningJobEvent,
    "FineTuningJobHyperparameters": FineTuningJobHyperparameters,
    "FineTuningJobHyperparametersNEpochs": FineTuningJobHyperparametersNEpochs,
    "FineTuningJobIntegrationsInner": FineTuningJobIntegrationsInner,
    "FunctionObject": FunctionObject,
    "Image": Image,
    "ImagesResponse": ImagesResponse,
    "ListAssistantFilesResponse": ListAssistantFilesResponse,
    "ListAssistantsResponse": ListAssistantsResponse,
    "ListFilesResponse": ListFilesResponse,
    "ListFineTuningJobCheckpointsResponse": ListFineTuningJobCheckpointsResponse,
    "ListFineTuningJobEventsResponse": ListFineTuningJobEventsResponse,
    "ListMessageFilesResponse": ListMessageFilesResponse,
    "ListMessagesResponse": ListMessagesResponse,
    "ListModelsResponse": ListModelsResponse,
    "ListPaginatedFineTuningJobsResponse": ListPaginatedFineTuningJobsResponse,
    "ListRunStepsResponse": ListRunStepsResponse,
    "ListRunsResponse": ListRunsResponse,
    "ListThreadsResponse": ListThreadsResponse,
    "MessageContentImageFileObject": MessageContentImageFileObject,
    "MessageContentImageFileObjectImageFile": MessageContentImageFileObjectImageFile,
    "MessageContentTextAnnotationsFileCitationObject": MessageContentTextAnnotationsFileCitationObject,
    "MessageContentTextAnnotationsFileCitationObjectFileCitation": MessageContentTextAnnotationsFileCitationObjectFileCitation,
    "MessageContentTextAnnotationsFilePathObject": MessageContentTextAnnotationsFilePathObject,
    "MessageContentTextAnnotationsFilePathObjectFilePath": MessageContentTextAnnotationsFilePathObjectFilePath,
    "MessageContentTextObject": MessageContentTextObject,
    "MessageContentTextObjectText": MessageContentTextObjectText,
    "MessageContentTextObjectTextAnnotationsInner": MessageContentTextObjectTextAnnotationsInner,
    "MessageDeltaContentImageFileObject": MessageDeltaContentImageFileObject,
    "MessageDeltaContentImageFileObjectImageFile": MessageDeltaContentImageFileObjectImageFile,
    "MessageDeltaContentTextAnnotationsFileCitationObject": MessageDeltaContentTextAnnotationsFileCitationObject,
    "MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation": MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation,
    "MessageDeltaContentTextAnnotationsFilePathObject": MessageDeltaContentTextAnnotationsFilePathObject,
    "MessageDeltaContentTextAnnotationsFilePathObjectFilePath": MessageDeltaContentTextAnnotationsFilePathObjectFilePath,
    "MessageDeltaContentTextObject": MessageDeltaContentTextObject,
    "MessageDeltaContentTextObjectText": MessageDeltaContentTextObjectText,
    "MessageDeltaContentTextObjectTextAnnotationsInner": MessageDeltaContentTextObjectTextAnnotationsInner,
    "MessageDeltaObject": MessageDeltaObject,
    "MessageDeltaObjectDelta": MessageDeltaObjectDelta,
    "MessageDeltaObjectDeltaContentInner": MessageDeltaObjectDeltaContentInner,
    "MessageFileObject": MessageFileObject,
    "MessageObject": MessageObject,
    "MessageObjectContentInner": MessageObjectContentInner,
    "MessageObjectIncompleteDetails": MessageObjectIncompleteDetails,
    "MessageStreamEvent": MessageStreamEvent,
    "MessageStreamEventOneOf": MessageStreamEventOneOf,
    "MessageStreamEventOneOf1": MessageStreamEventOneOf1,
    "MessageStreamEventOneOf2": MessageStreamEventOneOf2,
    "MessageStreamEventOneOf3": MessageStreamEventOneOf3,
    "MessageStreamEventOneOf4": MessageStreamEventOneOf4,
    "Model": Model,
    "ModelError": ModelError,
    "ModifyAssistantRequest": ModifyAssistantRequest,
    "ModifyMessageRequest": ModifyMessageRequest,
    "ModifyRunRequest": ModifyRunRequest,
    "ModifyThreadRequest": ModifyThreadRequest,
    "OpenAIFile": OpenAIFile,
    "RunCompletionUsage": RunCompletionUsage,
    "RunObject": RunObject,
    "RunObjectIncompleteDetails": RunObjectIncompleteDetails,
    "RunObjectLastError": RunObjectLastError,
    "RunObjectRequiredAction": RunObjectRequiredAction,
    "RunObjectRequiredActionSubmitToolOutputs": RunObjectRequiredActionSubmitToolOutputs,
    "RunStepCompletionUsage": RunStepCompletionUsage,
    "RunStepDeltaObject": RunStepDeltaObject,
    "RunStepDeltaObjectDelta": RunStepDeltaObjectDelta,
    "RunStepDeltaObjectDeltaStepDetails": RunStepDeltaObjectDeltaStepDetails,
    "RunStepDeltaStepDetailsMessageCreationObject": RunStepDeltaStepDetailsMessageCreationObject,
    "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation": RunStepDeltaStepDetailsMessageCreationObjectMessageCreation,
    "RunStepDeltaStepDetailsToolCallsCodeObject": RunStepDeltaStepDetailsToolCallsCodeObject,
    "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter": RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter,
    "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner": RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner,
    "RunStepDeltaStepDetailsToolCallsCodeOutputImageObject": RunStepDeltaStepDetailsToolCallsCodeOutputImageObject,
    "RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage": RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage,
    "RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject": RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject,
    "RunStepDeltaStepDetailsToolCallsFunctionObject": RunStepDeltaStepDetailsToolCallsFunctionObject,
    "RunStepDeltaStepDetailsToolCallsFunctionObjectFunction": RunStepDeltaStepDetailsToolCallsFunctionObjectFunction,
    "RunStepDeltaStepDetailsToolCallsObject": RunStepDeltaStepDetailsToolCallsObject,
    "RunStepDeltaStepDetailsToolCallsObjectToolCallsInner": RunStepDeltaStepDetailsToolCallsObjectToolCallsInner,
    "RunStepDeltaStepDetailsToolCallsRetrievalObject": RunStepDeltaStepDetailsToolCallsRetrievalObject,
    "RunStepDetailsMessageCreationObject": RunStepDetailsMessageCreationObject,
    "RunStepDetailsMessageCreationObjectMessageCreation": RunStepDetailsMessageCreationObjectMessageCreation,
    "RunStepDetailsToolCallsCodeObject": RunStepDetailsToolCallsCodeObject,
    "RunStepDetailsToolCallsCodeObjectCodeInterpreter": RunStepDetailsToolCallsCodeObjectCodeInterpreter,
    "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner": RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner,
    "RunStepDetailsToolCallsCodeOutputImageObject": RunStepDetailsToolCallsCodeOutputImageObject,
    "RunStepDetailsToolCallsCodeOutputImageObjectImage": RunStepDetailsToolCallsCodeOutputImageObjectImage,
    "RunStepDetailsToolCallsCodeOutputLogsObject": RunStepDetailsToolCallsCodeOutputLogsObject,
    "RunStepDetailsToolCallsFunctionObject": RunStepDetailsToolCallsFunctionObject,
    "RunStepDetailsToolCallsFunctionObjectFunction": RunStepDetailsToolCallsFunctionObjectFunction,
    "RunStepDetailsToolCallsObject": RunStepDetailsToolCallsObject,
    "RunStepDetailsToolCallsObjectToolCallsInner": RunStepDetailsToolCallsObjectToolCallsInner,
    "RunStepDetailsToolCallsRetrievalObject": RunStepDetailsToolCallsRetrievalObject,
    "RunStepObject": RunStepObject,
    "RunStepObjectLastError": RunStepObjectLastError,
    "RunStepObjectStepDetails": RunStepObjectStepDetails,
    "RunStepStreamEvent": RunStepStreamEvent,
    "RunStepStreamEventOneOf": RunStepStreamEventOneOf,
    "RunStepStreamEventOneOf1": RunStepStreamEventOneOf1,
    "RunStepStreamEventOneOf2": RunStepStreamEventOneOf2,
    "RunStepStreamEventOneOf3": RunStepStreamEventOneOf3,
    "RunStepStreamEventOneOf4": RunStepStreamEventOneOf4,
    "RunStepStreamEventOneOf5": RunStepStreamEventOneOf5,
    "RunStepStreamEventOneOf6": RunStepStreamEventOneOf6,
    "RunStreamEvent": RunStreamEvent,
    "RunStreamEventOneOf": RunStreamEventOneOf,
    "RunStreamEventOneOf1": RunStreamEventOneOf1,
    "RunStreamEventOneOf2": RunStreamEventOneOf2,
    "RunStreamEventOneOf3": RunStreamEventOneOf3,
    "RunStreamEventOneOf4": RunStreamEventOneOf4,
    "RunStreamEventOneOf5": RunStreamEventOneOf5,
    "RunStreamEventOneOf6": RunStreamEventOneOf6,
    "RunStreamEventOneOf7": RunStreamEventOneOf7,
    "RunStreamEventOneOf8": RunStreamEventOneOf8,
    "RunToolCallObject": RunToolCallObject,
    "RunToolCallObjectFunction": RunToolCallObjectFunction,
    "SubmitToolOutputsRunRequest": SubmitToolOutputsRunRequest,
    "SubmitToolOutputsRunRequestToolOutputsInner": SubmitToolOutputsRunRequestToolOutputsInner,
    "ThreadObject": ThreadObject,
    "ThreadStreamEvent": ThreadStreamEvent,
    "ThreadStreamEventOneOf": ThreadStreamEventOneOf,
    "TranscriptionSegment": TranscriptionSegment,
    "TranscriptionWord": TranscriptionWord,
    "TruncationObject": TruncationObject,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
