import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { AssistantFileObject } from '../models/AssistantFileObject';
import { AssistantObject } from '../models/AssistantObject';
import { AssistantObjectToolsInner } from '../models/AssistantObjectToolsInner';
import { AssistantStreamEvent } from '../models/AssistantStreamEvent';
import { AssistantToolsCode } from '../models/AssistantToolsCode';
import { AssistantToolsFunction } from '../models/AssistantToolsFunction';
import { AssistantToolsRetrieval } from '../models/AssistantToolsRetrieval';
import { AssistantsApiNamedToolChoice } from '../models/AssistantsApiNamedToolChoice';
import { AssistantsApiResponseFormat } from '../models/AssistantsApiResponseFormat';
import { AssistantsApiResponseFormatOption } from '../models/AssistantsApiResponseFormatOption';
import { AssistantsApiToolChoiceOption } from '../models/AssistantsApiToolChoiceOption';
import { ChatCompletionFunctionCallOption } from '../models/ChatCompletionFunctionCallOption';
import { ChatCompletionFunctions } from '../models/ChatCompletionFunctions';
import { ChatCompletionMessageToolCall } from '../models/ChatCompletionMessageToolCall';
import { ChatCompletionMessageToolCallChunk } from '../models/ChatCompletionMessageToolCallChunk';
import { ChatCompletionMessageToolCallChunkFunction } from '../models/ChatCompletionMessageToolCallChunkFunction';
import { ChatCompletionMessageToolCallFunction } from '../models/ChatCompletionMessageToolCallFunction';
import { ChatCompletionNamedToolChoice } from '../models/ChatCompletionNamedToolChoice';
import { ChatCompletionNamedToolChoiceFunction } from '../models/ChatCompletionNamedToolChoiceFunction';
import { ChatCompletionRequestAssistantMessage } from '../models/ChatCompletionRequestAssistantMessage';
import { ChatCompletionRequestAssistantMessageFunctionCall } from '../models/ChatCompletionRequestAssistantMessageFunctionCall';
import { ChatCompletionRequestFunctionMessage } from '../models/ChatCompletionRequestFunctionMessage';
import { ChatCompletionRequestMessage } from '../models/ChatCompletionRequestMessage';
import { ChatCompletionRequestMessageContentPart } from '../models/ChatCompletionRequestMessageContentPart';
import { ChatCompletionRequestMessageContentPartImage } from '../models/ChatCompletionRequestMessageContentPartImage';
import { ChatCompletionRequestMessageContentPartImageImageUrl } from '../models/ChatCompletionRequestMessageContentPartImageImageUrl';
import { ChatCompletionRequestMessageContentPartText } from '../models/ChatCompletionRequestMessageContentPartText';
import { ChatCompletionRequestSystemMessage } from '../models/ChatCompletionRequestSystemMessage';
import { ChatCompletionRequestToolMessage } from '../models/ChatCompletionRequestToolMessage';
import { ChatCompletionRequestUserMessage } from '../models/ChatCompletionRequestUserMessage';
import { ChatCompletionRequestUserMessageContent } from '../models/ChatCompletionRequestUserMessageContent';
import { ChatCompletionResponseMessage } from '../models/ChatCompletionResponseMessage';
import { ChatCompletionRole } from '../models/ChatCompletionRole';
import { ChatCompletionStreamResponseDelta } from '../models/ChatCompletionStreamResponseDelta';
import { ChatCompletionStreamResponseDeltaFunctionCall } from '../models/ChatCompletionStreamResponseDeltaFunctionCall';
import { ChatCompletionTokenLogprob } from '../models/ChatCompletionTokenLogprob';
import { ChatCompletionTokenLogprobTopLogprobsInner } from '../models/ChatCompletionTokenLogprobTopLogprobsInner';
import { ChatCompletionTool } from '../models/ChatCompletionTool';
import { ChatCompletionToolChoiceOption } from '../models/ChatCompletionToolChoiceOption';
import { CompletionUsage } from '../models/CompletionUsage';
import { CreateAssistantFileRequest } from '../models/CreateAssistantFileRequest';
import { CreateAssistantRequest } from '../models/CreateAssistantRequest';
import { CreateAssistantRequestModel } from '../models/CreateAssistantRequestModel';
import { CreateChatCompletionFunctionResponse } from '../models/CreateChatCompletionFunctionResponse';
import { CreateChatCompletionFunctionResponseChoicesInner } from '../models/CreateChatCompletionFunctionResponseChoicesInner';
import { CreateChatCompletionRequest } from '../models/CreateChatCompletionRequest';
import { CreateChatCompletionRequestFunctionCall } from '../models/CreateChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestModel } from '../models/CreateChatCompletionRequestModel';
import { CreateChatCompletionRequestResponseFormat } from '../models/CreateChatCompletionRequestResponseFormat';
import { CreateChatCompletionRequestStop } from '../models/CreateChatCompletionRequestStop';
import { CreateChatCompletionResponse } from '../models/CreateChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner } from '../models/CreateChatCompletionResponseChoicesInner';
import { CreateChatCompletionResponseChoicesInnerLogprobs } from '../models/CreateChatCompletionResponseChoicesInnerLogprobs';
import { CreateChatCompletionStreamResponse } from '../models/CreateChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner } from '../models/CreateChatCompletionStreamResponseChoicesInner';
import { CreateCompletionRequest } from '../models/CreateCompletionRequest';
import { CreateCompletionRequestModel } from '../models/CreateCompletionRequestModel';
import { CreateCompletionRequestPrompt } from '../models/CreateCompletionRequestPrompt';
import { CreateCompletionRequestStop } from '../models/CreateCompletionRequestStop';
import { CreateCompletionResponse } from '../models/CreateCompletionResponse';
import { CreateCompletionResponseChoicesInner } from '../models/CreateCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from '../models/CreateCompletionResponseChoicesInnerLogprobs';
import { CreateEmbeddingRequest } from '../models/CreateEmbeddingRequest';
import { CreateEmbeddingRequestInput } from '../models/CreateEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from '../models/CreateEmbeddingRequestModel';
import { CreateEmbeddingResponse } from '../models/CreateEmbeddingResponse';
import { CreateEmbeddingResponseUsage } from '../models/CreateEmbeddingResponseUsage';
import { CreateFineTuningJobRequest } from '../models/CreateFineTuningJobRequest';
import { CreateFineTuningJobRequestHyperparameters } from '../models/CreateFineTuningJobRequestHyperparameters';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from '../models/CreateFineTuningJobRequestHyperparametersBatchSize';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from '../models/CreateFineTuningJobRequestHyperparametersLearningRateMultiplier';
import { CreateFineTuningJobRequestHyperparametersNEpochs } from '../models/CreateFineTuningJobRequestHyperparametersNEpochs';
import { CreateFineTuningJobRequestIntegrationsInner } from '../models/CreateFineTuningJobRequestIntegrationsInner';
import { CreateFineTuningJobRequestIntegrationsInnerType } from '../models/CreateFineTuningJobRequestIntegrationsInnerType';
import { CreateFineTuningJobRequestIntegrationsInnerWandb } from '../models/CreateFineTuningJobRequestIntegrationsInnerWandb';
import { CreateFineTuningJobRequestModel } from '../models/CreateFineTuningJobRequestModel';
import { CreateImageEditRequestModel } from '../models/CreateImageEditRequestModel';
import { CreateImageRequest } from '../models/CreateImageRequest';
import { CreateImageRequestModel } from '../models/CreateImageRequestModel';
import { CreateMessageRequest } from '../models/CreateMessageRequest';
import { CreateModerationRequest } from '../models/CreateModerationRequest';
import { CreateModerationRequestInput } from '../models/CreateModerationRequestInput';
import { CreateModerationRequestModel } from '../models/CreateModerationRequestModel';
import { CreateModerationResponse } from '../models/CreateModerationResponse';
import { CreateModerationResponseResultsInner } from '../models/CreateModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from '../models/CreateModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryScores } from '../models/CreateModerationResponseResultsInnerCategoryScores';
import { CreateRunRequest } from '../models/CreateRunRequest';
import { CreateRunRequestModel } from '../models/CreateRunRequestModel';
import { CreateSpeechRequest } from '../models/CreateSpeechRequest';
import { CreateSpeechRequestModel } from '../models/CreateSpeechRequestModel';
import { CreateThreadAndRunRequest } from '../models/CreateThreadAndRunRequest';
import { CreateThreadAndRunRequestToolsInner } from '../models/CreateThreadAndRunRequestToolsInner';
import { CreateThreadRequest } from '../models/CreateThreadRequest';
import { CreateTranscription200Response } from '../models/CreateTranscription200Response';
import { CreateTranscriptionRequestModel } from '../models/CreateTranscriptionRequestModel';
import { CreateTranscriptionResponseJson } from '../models/CreateTranscriptionResponseJson';
import { CreateTranscriptionResponseVerboseJson } from '../models/CreateTranscriptionResponseVerboseJson';
import { CreateTranslation200Response } from '../models/CreateTranslation200Response';
import { CreateTranslationResponseJson } from '../models/CreateTranslationResponseJson';
import { CreateTranslationResponseVerboseJson } from '../models/CreateTranslationResponseVerboseJson';
import { DeleteAssistantFileResponse } from '../models/DeleteAssistantFileResponse';
import { DeleteAssistantResponse } from '../models/DeleteAssistantResponse';
import { DeleteFileResponse } from '../models/DeleteFileResponse';
import { DeleteMessageResponse } from '../models/DeleteMessageResponse';
import { DeleteModelResponse } from '../models/DeleteModelResponse';
import { DeleteThreadResponse } from '../models/DeleteThreadResponse';
import { DoneEvent } from '../models/DoneEvent';
import { Embedding } from '../models/Embedding';
import { ErrorEvent } from '../models/ErrorEvent';
import { ErrorResponse } from '../models/ErrorResponse';
import { FineTuningIntegration } from '../models/FineTuningIntegration';
import { FineTuningJob } from '../models/FineTuningJob';
import { FineTuningJobCheckpoint } from '../models/FineTuningJobCheckpoint';
import { FineTuningJobCheckpointMetrics } from '../models/FineTuningJobCheckpointMetrics';
import { FineTuningJobError } from '../models/FineTuningJobError';
import { FineTuningJobEvent } from '../models/FineTuningJobEvent';
import { FineTuningJobHyperparameters } from '../models/FineTuningJobHyperparameters';
import { FineTuningJobHyperparametersNEpochs } from '../models/FineTuningJobHyperparametersNEpochs';
import { FineTuningJobIntegrationsInner } from '../models/FineTuningJobIntegrationsInner';
import { FunctionObject } from '../models/FunctionObject';
import { Image } from '../models/Image';
import { ImagesResponse } from '../models/ImagesResponse';
import { ListAssistantFilesResponse } from '../models/ListAssistantFilesResponse';
import { ListAssistantsResponse } from '../models/ListAssistantsResponse';
import { ListFilesResponse } from '../models/ListFilesResponse';
import { ListFineTuningJobCheckpointsResponse } from '../models/ListFineTuningJobCheckpointsResponse';
import { ListFineTuningJobEventsResponse } from '../models/ListFineTuningJobEventsResponse';
import { ListMessageFilesResponse } from '../models/ListMessageFilesResponse';
import { ListMessagesResponse } from '../models/ListMessagesResponse';
import { ListModelsResponse } from '../models/ListModelsResponse';
import { ListPaginatedFineTuningJobsResponse } from '../models/ListPaginatedFineTuningJobsResponse';
import { ListRunStepsResponse } from '../models/ListRunStepsResponse';
import { ListRunsResponse } from '../models/ListRunsResponse';
import { ListThreadsResponse } from '../models/ListThreadsResponse';
import { MessageContentImageFileObject } from '../models/MessageContentImageFileObject';
import { MessageContentImageFileObjectImageFile } from '../models/MessageContentImageFileObjectImageFile';
import { MessageContentTextAnnotationsFileCitationObject } from '../models/MessageContentTextAnnotationsFileCitationObject';
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from '../models/MessageContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageContentTextAnnotationsFilePathObject } from '../models/MessageContentTextAnnotationsFilePathObject';
import { MessageContentTextAnnotationsFilePathObjectFilePath } from '../models/MessageContentTextAnnotationsFilePathObjectFilePath';
import { MessageContentTextObject } from '../models/MessageContentTextObject';
import { MessageContentTextObjectText } from '../models/MessageContentTextObjectText';
import { MessageContentTextObjectTextAnnotationsInner } from '../models/MessageContentTextObjectTextAnnotationsInner';
import { MessageDeltaContentImageFileObject } from '../models/MessageDeltaContentImageFileObject';
import { MessageDeltaContentImageFileObjectImageFile } from '../models/MessageDeltaContentImageFileObjectImageFile';
import { MessageDeltaContentTextAnnotationsFileCitationObject } from '../models/MessageDeltaContentTextAnnotationsFileCitationObject';
import { MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation } from '../models/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageDeltaContentTextAnnotationsFilePathObject } from '../models/MessageDeltaContentTextAnnotationsFilePathObject';
import { MessageDeltaContentTextAnnotationsFilePathObjectFilePath } from '../models/MessageDeltaContentTextAnnotationsFilePathObjectFilePath';
import { MessageDeltaContentTextObject } from '../models/MessageDeltaContentTextObject';
import { MessageDeltaContentTextObjectText } from '../models/MessageDeltaContentTextObjectText';
import { MessageDeltaContentTextObjectTextAnnotationsInner } from '../models/MessageDeltaContentTextObjectTextAnnotationsInner';
import { MessageDeltaObject } from '../models/MessageDeltaObject';
import { MessageDeltaObjectDelta } from '../models/MessageDeltaObjectDelta';
import { MessageDeltaObjectDeltaContentInner } from '../models/MessageDeltaObjectDeltaContentInner';
import { MessageFileObject } from '../models/MessageFileObject';
import { MessageObject } from '../models/MessageObject';
import { MessageObjectContentInner } from '../models/MessageObjectContentInner';
import { MessageObjectIncompleteDetails } from '../models/MessageObjectIncompleteDetails';
import { MessageStreamEvent } from '../models/MessageStreamEvent';
import { MessageStreamEventOneOf } from '../models/MessageStreamEventOneOf';
import { MessageStreamEventOneOf1 } from '../models/MessageStreamEventOneOf1';
import { MessageStreamEventOneOf2 } from '../models/MessageStreamEventOneOf2';
import { MessageStreamEventOneOf3 } from '../models/MessageStreamEventOneOf3';
import { MessageStreamEventOneOf4 } from '../models/MessageStreamEventOneOf4';
import { Model } from '../models/Model';
import { ModelError } from '../models/ModelError';
import { ModifyAssistantRequest } from '../models/ModifyAssistantRequest';
import { ModifyMessageRequest } from '../models/ModifyMessageRequest';
import { ModifyRunRequest } from '../models/ModifyRunRequest';
import { ModifyThreadRequest } from '../models/ModifyThreadRequest';
import { OpenAIFile } from '../models/OpenAIFile';
import { RunCompletionUsage } from '../models/RunCompletionUsage';
import { RunObject } from '../models/RunObject';
import { RunObjectIncompleteDetails } from '../models/RunObjectIncompleteDetails';
import { RunObjectLastError } from '../models/RunObjectLastError';
import { RunObjectRequiredAction } from '../models/RunObjectRequiredAction';
import { RunObjectRequiredActionSubmitToolOutputs } from '../models/RunObjectRequiredActionSubmitToolOutputs';
import { RunStepCompletionUsage } from '../models/RunStepCompletionUsage';
import { RunStepDeltaObject } from '../models/RunStepDeltaObject';
import { RunStepDeltaObjectDelta } from '../models/RunStepDeltaObjectDelta';
import { RunStepDeltaObjectDeltaStepDetails } from '../models/RunStepDeltaObjectDeltaStepDetails';
import { RunStepDeltaStepDetailsMessageCreationObject } from '../models/RunStepDeltaStepDetailsMessageCreationObject';
import { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDeltaStepDetailsToolCallsCodeObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeObject';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from '../models/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from '../models/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage } from '../models/RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObject } from '../models/RunStepDeltaStepDetailsToolCallsFunctionObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from '../models/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDeltaStepDetailsToolCallsObject } from '../models/RunStepDeltaStepDetailsToolCallsObject';
import { RunStepDeltaStepDetailsToolCallsObjectToolCallsInner } from '../models/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner';
import { RunStepDeltaStepDetailsToolCallsRetrievalObject } from '../models/RunStepDeltaStepDetailsToolCallsRetrievalObject';
import { RunStepDetailsMessageCreationObject } from '../models/RunStepDetailsMessageCreationObject';
import { RunStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDetailsToolCallsCodeObject } from '../models/RunStepDetailsToolCallsCodeObject';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from '../models/RunStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from '../models/RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner';
import { RunStepDetailsToolCallsCodeOutputImageObject } from '../models/RunStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from '../models/RunStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDetailsToolCallsCodeOutputLogsObject } from '../models/RunStepDetailsToolCallsCodeOutputLogsObject';
import { RunStepDetailsToolCallsFunctionObject } from '../models/RunStepDetailsToolCallsFunctionObject';
import { RunStepDetailsToolCallsFunctionObjectFunction } from '../models/RunStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDetailsToolCallsObject } from '../models/RunStepDetailsToolCallsObject';
import { RunStepDetailsToolCallsObjectToolCallsInner } from '../models/RunStepDetailsToolCallsObjectToolCallsInner';
import { RunStepDetailsToolCallsRetrievalObject } from '../models/RunStepDetailsToolCallsRetrievalObject';
import { RunStepObject } from '../models/RunStepObject';
import { RunStepObjectLastError } from '../models/RunStepObjectLastError';
import { RunStepObjectStepDetails } from '../models/RunStepObjectStepDetails';
import { RunStepStreamEvent } from '../models/RunStepStreamEvent';
import { RunStepStreamEventOneOf } from '../models/RunStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from '../models/RunStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from '../models/RunStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from '../models/RunStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from '../models/RunStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from '../models/RunStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from '../models/RunStepStreamEventOneOf6';
import { RunStreamEvent } from '../models/RunStreamEvent';
import { RunStreamEventOneOf } from '../models/RunStreamEventOneOf';
import { RunStreamEventOneOf1 } from '../models/RunStreamEventOneOf1';
import { RunStreamEventOneOf2 } from '../models/RunStreamEventOneOf2';
import { RunStreamEventOneOf3 } from '../models/RunStreamEventOneOf3';
import { RunStreamEventOneOf4 } from '../models/RunStreamEventOneOf4';
import { RunStreamEventOneOf5 } from '../models/RunStreamEventOneOf5';
import { RunStreamEventOneOf6 } from '../models/RunStreamEventOneOf6';
import { RunStreamEventOneOf7 } from '../models/RunStreamEventOneOf7';
import { RunStreamEventOneOf8 } from '../models/RunStreamEventOneOf8';
import { RunToolCallObject } from '../models/RunToolCallObject';
import { RunToolCallObjectFunction } from '../models/RunToolCallObjectFunction';
import { SubmitToolOutputsRunRequest } from '../models/SubmitToolOutputsRunRequest';
import { SubmitToolOutputsRunRequestToolOutputsInner } from '../models/SubmitToolOutputsRunRequestToolOutputsInner';
import { ThreadObject } from '../models/ThreadObject';
import { ThreadStreamEvent } from '../models/ThreadStreamEvent';
import { ThreadStreamEventOneOf } from '../models/ThreadStreamEventOneOf';
import { TranscriptionSegment } from '../models/TranscriptionSegment';
import { TranscriptionWord } from '../models/TranscriptionWord';
import { TruncationObject } from '../models/TruncationObject';

import { ObservableAssistantsApi } from "./ObservableAPI";
import { AssistantsApiRequestFactory, AssistantsApiResponseProcessor} from "../apis/AssistantsApi";

export interface AssistantsApiCancelRunRequest {
    /**
     * The ID of the thread to which this run belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicancelRun
     */
    threadId: string
    /**
     * The ID of the run to cancel.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicancelRun
     */
    runId: string
}

export interface AssistantsApiCreateAssistantRequest {
    /**
     * 
     * @type CreateAssistantRequest
     * @memberof AssistantsApicreateAssistant
     */
    createAssistantRequest: CreateAssistantRequest
}

export interface AssistantsApiCreateAssistantFileRequest {
    /**
     * The ID of the assistant for which to create a File. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicreateAssistantFile
     */
    assistantId: string
    /**
     * 
     * @type CreateAssistantFileRequest
     * @memberof AssistantsApicreateAssistantFile
     */
    createAssistantFileRequest: CreateAssistantFileRequest
}

export interface AssistantsApiCreateMessageRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicreateMessage
     */
    threadId: string
    /**
     * 
     * @type CreateMessageRequest
     * @memberof AssistantsApicreateMessage
     */
    createMessageRequest: CreateMessageRequest
}

export interface AssistantsApiCreateRunRequest {
    /**
     * The ID of the thread to run.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApicreateRun
     */
    threadId: string
    /**
     * 
     * @type CreateRunRequest
     * @memberof AssistantsApicreateRun
     */
    createRunRequest: CreateRunRequest
}

export interface AssistantsApiCreateThreadRequest {
    /**
     * 
     * @type CreateThreadRequest
     * @memberof AssistantsApicreateThread
     */
    createThreadRequest?: CreateThreadRequest
}

export interface AssistantsApiCreateThreadAndRunRequest {
    /**
     * 
     * @type CreateThreadAndRunRequest
     * @memberof AssistantsApicreateThreadAndRun
     */
    createThreadAndRunRequest: CreateThreadAndRunRequest
}

export interface AssistantsApiDeleteAssistantRequest {
    /**
     * The ID of the assistant to delete.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteAssistant
     */
    assistantId: string
}

export interface AssistantsApiDeleteAssistantFileRequest {
    /**
     * The ID of the assistant that the file belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteAssistantFile
     */
    assistantId: string
    /**
     * The ID of the file to delete.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteAssistantFile
     */
    fileId: string
}

export interface AssistantsApiDeleteThreadRequest {
    /**
     * The ID of the thread to delete.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApideleteThread
     */
    threadId: string
}

export interface AssistantsApiGetAssistantRequest {
    /**
     * The ID of the assistant to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetAssistant
     */
    assistantId: string
}

export interface AssistantsApiGetAssistantFileRequest {
    /**
     * The ID of the assistant who the file belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetAssistantFile
     */
    assistantId: string
    /**
     * The ID of the file we\&#39;re getting.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetAssistantFile
     */
    fileId: string
}

export interface AssistantsApiGetMessageRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessage
     */
    threadId: string
    /**
     * The ID of the message to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessage
     */
    messageId: string
}

export interface AssistantsApiGetMessageFileRequest {
    /**
     * The ID of the thread to which the message and File belong.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessageFile
     */
    threadId: string
    /**
     * The ID of the message the file belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessageFile
     */
    messageId: string
    /**
     * The ID of the file being retrieved.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetMessageFile
     */
    fileId: string
}

export interface AssistantsApiGetRunRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRun
     */
    threadId: string
    /**
     * The ID of the run to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRun
     */
    runId: string
}

export interface AssistantsApiGetRunStepRequest {
    /**
     * The ID of the thread to which the run and run step belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRunStep
     */
    threadId: string
    /**
     * The ID of the run to which the run step belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRunStep
     */
    runId: string
    /**
     * The ID of the run step to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetRunStep
     */
    stepId: string
}

export interface AssistantsApiGetThreadRequest {
    /**
     * The ID of the thread to retrieve.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApigetThread
     */
    threadId: string
}

export interface AssistantsApiListAssistantFilesRequest {
    /**
     * The ID of the assistant the file belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistantFiles
     */
    assistantId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistAssistantFiles
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistAssistantFiles
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistantFiles
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistantFiles
     */
    before?: string
}

export interface AssistantsApiListAssistantsRequest {
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistAssistants
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistAssistants
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistants
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistAssistants
     */
    before?: string
}

export interface AssistantsApiListMessageFilesRequest {
    /**
     * The ID of the thread that the message and files belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessageFiles
     */
    threadId: string
    /**
     * The ID of the message that the files belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessageFiles
     */
    messageId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistMessageFiles
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistMessageFiles
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessageFiles
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessageFiles
     */
    before?: string
}

export interface AssistantsApiListMessagesRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    threadId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistMessages
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistMessages
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    before?: string
    /**
     * Filter messages by the run ID that generated them. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistMessages
     */
    runId?: string
}

export interface AssistantsApiListRunStepsRequest {
    /**
     * The ID of the thread the run and run steps belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    threadId: string
    /**
     * The ID of the run the run steps belong to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    runId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistRunSteps
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistRunSteps
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRunSteps
     */
    before?: string
}

export interface AssistantsApiListRunsRequest {
    /**
     * The ID of the thread the run belongs to.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRuns
     */
    threadId: string
    /**
     * A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * Defaults to: 20
     * @type number
     * @memberof AssistantsApilistRuns
     */
    limit?: number
    /**
     * Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * Defaults to: &#39;desc&#39;
     * @type &#39;asc&#39; | &#39;desc&#39;
     * @memberof AssistantsApilistRuns
     */
    order?: 'asc' | 'desc'
    /**
     * A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRuns
     */
    after?: string
    /**
     * A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApilistRuns
     */
    before?: string
}

export interface AssistantsApiModifyAssistantRequest {
    /**
     * The ID of the assistant to modify.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyAssistant
     */
    assistantId: string
    /**
     * 
     * @type ModifyAssistantRequest
     * @memberof AssistantsApimodifyAssistant
     */
    modifyAssistantRequest: ModifyAssistantRequest
}

export interface AssistantsApiModifyMessageRequest {
    /**
     * The ID of the thread to which this message belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyMessage
     */
    threadId: string
    /**
     * The ID of the message to modify.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyMessage
     */
    messageId: string
    /**
     * 
     * @type ModifyMessageRequest
     * @memberof AssistantsApimodifyMessage
     */
    modifyMessageRequest: ModifyMessageRequest
}

export interface AssistantsApiModifyRunRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was run.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyRun
     */
    threadId: string
    /**
     * The ID of the run to modify.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyRun
     */
    runId: string
    /**
     * 
     * @type ModifyRunRequest
     * @memberof AssistantsApimodifyRun
     */
    modifyRunRequest: ModifyRunRequest
}

export interface AssistantsApiModifyThreadRequest {
    /**
     * The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApimodifyThread
     */
    threadId: string
    /**
     * 
     * @type ModifyThreadRequest
     * @memberof AssistantsApimodifyThread
     */
    modifyThreadRequest: ModifyThreadRequest
}

export interface AssistantsApiSubmitToolOuputsToRunRequest {
    /**
     * The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApisubmitToolOuputsToRun
     */
    threadId: string
    /**
     * The ID of the run that requires the tool output submission.
     * Defaults to: undefined
     * @type string
     * @memberof AssistantsApisubmitToolOuputsToRun
     */
    runId: string
    /**
     * 
     * @type SubmitToolOutputsRunRequest
     * @memberof AssistantsApisubmitToolOuputsToRun
     */
    submitToolOutputsRunRequest: SubmitToolOutputsRunRequest
}

export class ObjectAssistantsApi {
    private api: ObservableAssistantsApi

    public constructor(configuration: Configuration, requestFactory?: AssistantsApiRequestFactory, responseProcessor?: AssistantsApiResponseProcessor) {
        this.api = new ObservableAssistantsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param param the request object
     */
    public cancelRunWithHttpInfo(param: AssistantsApiCancelRunRequest, options?: Configuration): Promise<HttpInfo<RunObject>> {
        return this.api.cancelRunWithHttpInfo(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param param the request object
     */
    public cancelRun(param: AssistantsApiCancelRunRequest, options?: Configuration): Promise<RunObject> {
        return this.api.cancelRun(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Create an assistant with a model and instructions.
     * @param param the request object
     */
    public createAssistantWithHttpInfo(param: AssistantsApiCreateAssistantRequest, options?: Configuration): Promise<HttpInfo<AssistantObject>> {
        return this.api.createAssistantWithHttpInfo(param.createAssistantRequest,  options).toPromise();
    }

    /**
     * Create an assistant with a model and instructions.
     * @param param the request object
     */
    public createAssistant(param: AssistantsApiCreateAssistantRequest, options?: Configuration): Promise<AssistantObject> {
        return this.api.createAssistant(param.createAssistantRequest,  options).toPromise();
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param param the request object
     */
    public createAssistantFileWithHttpInfo(param: AssistantsApiCreateAssistantFileRequest, options?: Configuration): Promise<HttpInfo<AssistantFileObject>> {
        return this.api.createAssistantFileWithHttpInfo(param.assistantId, param.createAssistantFileRequest,  options).toPromise();
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param param the request object
     */
    public createAssistantFile(param: AssistantsApiCreateAssistantFileRequest, options?: Configuration): Promise<AssistantFileObject> {
        return this.api.createAssistantFile(param.assistantId, param.createAssistantFileRequest,  options).toPromise();
    }

    /**
     * Create a message.
     * @param param the request object
     */
    public createMessageWithHttpInfo(param: AssistantsApiCreateMessageRequest, options?: Configuration): Promise<HttpInfo<MessageObject>> {
        return this.api.createMessageWithHttpInfo(param.threadId, param.createMessageRequest,  options).toPromise();
    }

    /**
     * Create a message.
     * @param param the request object
     */
    public createMessage(param: AssistantsApiCreateMessageRequest, options?: Configuration): Promise<MessageObject> {
        return this.api.createMessage(param.threadId, param.createMessageRequest,  options).toPromise();
    }

    /**
     * Create a run.
     * @param param the request object
     */
    public createRunWithHttpInfo(param: AssistantsApiCreateRunRequest, options?: Configuration): Promise<HttpInfo<RunObject>> {
        return this.api.createRunWithHttpInfo(param.threadId, param.createRunRequest,  options).toPromise();
    }

    /**
     * Create a run.
     * @param param the request object
     */
    public createRun(param: AssistantsApiCreateRunRequest, options?: Configuration): Promise<RunObject> {
        return this.api.createRun(param.threadId, param.createRunRequest,  options).toPromise();
    }

    /**
     * Create a thread.
     * @param param the request object
     */
    public createThreadWithHttpInfo(param: AssistantsApiCreateThreadRequest = {}, options?: Configuration): Promise<HttpInfo<ThreadObject>> {
        return this.api.createThreadWithHttpInfo(param.createThreadRequest,  options).toPromise();
    }

    /**
     * Create a thread.
     * @param param the request object
     */
    public createThread(param: AssistantsApiCreateThreadRequest = {}, options?: Configuration): Promise<ThreadObject> {
        return this.api.createThread(param.createThreadRequest,  options).toPromise();
    }

    /**
     * Create a thread and run it in one request.
     * @param param the request object
     */
    public createThreadAndRunWithHttpInfo(param: AssistantsApiCreateThreadAndRunRequest, options?: Configuration): Promise<HttpInfo<RunObject>> {
        return this.api.createThreadAndRunWithHttpInfo(param.createThreadAndRunRequest,  options).toPromise();
    }

    /**
     * Create a thread and run it in one request.
     * @param param the request object
     */
    public createThreadAndRun(param: AssistantsApiCreateThreadAndRunRequest, options?: Configuration): Promise<RunObject> {
        return this.api.createThreadAndRun(param.createThreadAndRunRequest,  options).toPromise();
    }

    /**
     * Delete an assistant.
     * @param param the request object
     */
    public deleteAssistantWithHttpInfo(param: AssistantsApiDeleteAssistantRequest, options?: Configuration): Promise<HttpInfo<DeleteAssistantResponse>> {
        return this.api.deleteAssistantWithHttpInfo(param.assistantId,  options).toPromise();
    }

    /**
     * Delete an assistant.
     * @param param the request object
     */
    public deleteAssistant(param: AssistantsApiDeleteAssistantRequest, options?: Configuration): Promise<DeleteAssistantResponse> {
        return this.api.deleteAssistant(param.assistantId,  options).toPromise();
    }

    /**
     * Delete an assistant file.
     * @param param the request object
     */
    public deleteAssistantFileWithHttpInfo(param: AssistantsApiDeleteAssistantFileRequest, options?: Configuration): Promise<HttpInfo<DeleteAssistantFileResponse>> {
        return this.api.deleteAssistantFileWithHttpInfo(param.assistantId, param.fileId,  options).toPromise();
    }

    /**
     * Delete an assistant file.
     * @param param the request object
     */
    public deleteAssistantFile(param: AssistantsApiDeleteAssistantFileRequest, options?: Configuration): Promise<DeleteAssistantFileResponse> {
        return this.api.deleteAssistantFile(param.assistantId, param.fileId,  options).toPromise();
    }

    /**
     * Delete a thread.
     * @param param the request object
     */
    public deleteThreadWithHttpInfo(param: AssistantsApiDeleteThreadRequest, options?: Configuration): Promise<HttpInfo<DeleteThreadResponse>> {
        return this.api.deleteThreadWithHttpInfo(param.threadId,  options).toPromise();
    }

    /**
     * Delete a thread.
     * @param param the request object
     */
    public deleteThread(param: AssistantsApiDeleteThreadRequest, options?: Configuration): Promise<DeleteThreadResponse> {
        return this.api.deleteThread(param.threadId,  options).toPromise();
    }

    /**
     * Retrieves an assistant.
     * @param param the request object
     */
    public getAssistantWithHttpInfo(param: AssistantsApiGetAssistantRequest, options?: Configuration): Promise<HttpInfo<AssistantObject>> {
        return this.api.getAssistantWithHttpInfo(param.assistantId,  options).toPromise();
    }

    /**
     * Retrieves an assistant.
     * @param param the request object
     */
    public getAssistant(param: AssistantsApiGetAssistantRequest, options?: Configuration): Promise<AssistantObject> {
        return this.api.getAssistant(param.assistantId,  options).toPromise();
    }

    /**
     * Retrieves an AssistantFile.
     * @param param the request object
     */
    public getAssistantFileWithHttpInfo(param: AssistantsApiGetAssistantFileRequest, options?: Configuration): Promise<HttpInfo<AssistantFileObject>> {
        return this.api.getAssistantFileWithHttpInfo(param.assistantId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieves an AssistantFile.
     * @param param the request object
     */
    public getAssistantFile(param: AssistantsApiGetAssistantFileRequest, options?: Configuration): Promise<AssistantFileObject> {
        return this.api.getAssistantFile(param.assistantId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieve a message.
     * @param param the request object
     */
    public getMessageWithHttpInfo(param: AssistantsApiGetMessageRequest, options?: Configuration): Promise<HttpInfo<MessageObject>> {
        return this.api.getMessageWithHttpInfo(param.threadId, param.messageId,  options).toPromise();
    }

    /**
     * Retrieve a message.
     * @param param the request object
     */
    public getMessage(param: AssistantsApiGetMessageRequest, options?: Configuration): Promise<MessageObject> {
        return this.api.getMessage(param.threadId, param.messageId,  options).toPromise();
    }

    /**
     * Retrieves a message file.
     * @param param the request object
     */
    public getMessageFileWithHttpInfo(param: AssistantsApiGetMessageFileRequest, options?: Configuration): Promise<HttpInfo<MessageFileObject>> {
        return this.api.getMessageFileWithHttpInfo(param.threadId, param.messageId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieves a message file.
     * @param param the request object
     */
    public getMessageFile(param: AssistantsApiGetMessageFileRequest, options?: Configuration): Promise<MessageFileObject> {
        return this.api.getMessageFile(param.threadId, param.messageId, param.fileId,  options).toPromise();
    }

    /**
     * Retrieves a run.
     * @param param the request object
     */
    public getRunWithHttpInfo(param: AssistantsApiGetRunRequest, options?: Configuration): Promise<HttpInfo<RunObject>> {
        return this.api.getRunWithHttpInfo(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Retrieves a run.
     * @param param the request object
     */
    public getRun(param: AssistantsApiGetRunRequest, options?: Configuration): Promise<RunObject> {
        return this.api.getRun(param.threadId, param.runId,  options).toPromise();
    }

    /**
     * Retrieves a run step.
     * @param param the request object
     */
    public getRunStepWithHttpInfo(param: AssistantsApiGetRunStepRequest, options?: Configuration): Promise<HttpInfo<RunStepObject>> {
        return this.api.getRunStepWithHttpInfo(param.threadId, param.runId, param.stepId,  options).toPromise();
    }

    /**
     * Retrieves a run step.
     * @param param the request object
     */
    public getRunStep(param: AssistantsApiGetRunStepRequest, options?: Configuration): Promise<RunStepObject> {
        return this.api.getRunStep(param.threadId, param.runId, param.stepId,  options).toPromise();
    }

    /**
     * Retrieves a thread.
     * @param param the request object
     */
    public getThreadWithHttpInfo(param: AssistantsApiGetThreadRequest, options?: Configuration): Promise<HttpInfo<ThreadObject>> {
        return this.api.getThreadWithHttpInfo(param.threadId,  options).toPromise();
    }

    /**
     * Retrieves a thread.
     * @param param the request object
     */
    public getThread(param: AssistantsApiGetThreadRequest, options?: Configuration): Promise<ThreadObject> {
        return this.api.getThread(param.threadId,  options).toPromise();
    }

    /**
     * Returns a list of assistant files.
     * @param param the request object
     */
    public listAssistantFilesWithHttpInfo(param: AssistantsApiListAssistantFilesRequest, options?: Configuration): Promise<HttpInfo<ListAssistantFilesResponse>> {
        return this.api.listAssistantFilesWithHttpInfo(param.assistantId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of assistant files.
     * @param param the request object
     */
    public listAssistantFiles(param: AssistantsApiListAssistantFilesRequest, options?: Configuration): Promise<ListAssistantFilesResponse> {
        return this.api.listAssistantFiles(param.assistantId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of assistants.
     * @param param the request object
     */
    public listAssistantsWithHttpInfo(param: AssistantsApiListAssistantsRequest = {}, options?: Configuration): Promise<HttpInfo<ListAssistantsResponse>> {
        return this.api.listAssistantsWithHttpInfo(param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of assistants.
     * @param param the request object
     */
    public listAssistants(param: AssistantsApiListAssistantsRequest = {}, options?: Configuration): Promise<ListAssistantsResponse> {
        return this.api.listAssistants(param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of message files.
     * @param param the request object
     */
    public listMessageFilesWithHttpInfo(param: AssistantsApiListMessageFilesRequest, options?: Configuration): Promise<HttpInfo<ListMessageFilesResponse>> {
        return this.api.listMessageFilesWithHttpInfo(param.threadId, param.messageId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of message files.
     * @param param the request object
     */
    public listMessageFiles(param: AssistantsApiListMessageFilesRequest, options?: Configuration): Promise<ListMessageFilesResponse> {
        return this.api.listMessageFiles(param.threadId, param.messageId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of messages for a given thread.
     * @param param the request object
     */
    public listMessagesWithHttpInfo(param: AssistantsApiListMessagesRequest, options?: Configuration): Promise<HttpInfo<ListMessagesResponse>> {
        return this.api.listMessagesWithHttpInfo(param.threadId, param.limit, param.order, param.after, param.before, param.runId,  options).toPromise();
    }

    /**
     * Returns a list of messages for a given thread.
     * @param param the request object
     */
    public listMessages(param: AssistantsApiListMessagesRequest, options?: Configuration): Promise<ListMessagesResponse> {
        return this.api.listMessages(param.threadId, param.limit, param.order, param.after, param.before, param.runId,  options).toPromise();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param param the request object
     */
    public listRunStepsWithHttpInfo(param: AssistantsApiListRunStepsRequest, options?: Configuration): Promise<HttpInfo<ListRunStepsResponse>> {
        return this.api.listRunStepsWithHttpInfo(param.threadId, param.runId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param param the request object
     */
    public listRunSteps(param: AssistantsApiListRunStepsRequest, options?: Configuration): Promise<ListRunStepsResponse> {
        return this.api.listRunSteps(param.threadId, param.runId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param param the request object
     */
    public listRunsWithHttpInfo(param: AssistantsApiListRunsRequest, options?: Configuration): Promise<HttpInfo<ListRunsResponse>> {
        return this.api.listRunsWithHttpInfo(param.threadId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param param the request object
     */
    public listRuns(param: AssistantsApiListRunsRequest, options?: Configuration): Promise<ListRunsResponse> {
        return this.api.listRuns(param.threadId, param.limit, param.order, param.after, param.before,  options).toPromise();
    }

    /**
     * Modifies an assistant.
     * @param param the request object
     */
    public modifyAssistantWithHttpInfo(param: AssistantsApiModifyAssistantRequest, options?: Configuration): Promise<HttpInfo<AssistantObject>> {
        return this.api.modifyAssistantWithHttpInfo(param.assistantId, param.modifyAssistantRequest,  options).toPromise();
    }

    /**
     * Modifies an assistant.
     * @param param the request object
     */
    public modifyAssistant(param: AssistantsApiModifyAssistantRequest, options?: Configuration): Promise<AssistantObject> {
        return this.api.modifyAssistant(param.assistantId, param.modifyAssistantRequest,  options).toPromise();
    }

    /**
     * Modifies a message.
     * @param param the request object
     */
    public modifyMessageWithHttpInfo(param: AssistantsApiModifyMessageRequest, options?: Configuration): Promise<HttpInfo<MessageObject>> {
        return this.api.modifyMessageWithHttpInfo(param.threadId, param.messageId, param.modifyMessageRequest,  options).toPromise();
    }

    /**
     * Modifies a message.
     * @param param the request object
     */
    public modifyMessage(param: AssistantsApiModifyMessageRequest, options?: Configuration): Promise<MessageObject> {
        return this.api.modifyMessage(param.threadId, param.messageId, param.modifyMessageRequest,  options).toPromise();
    }

    /**
     * Modifies a run.
     * @param param the request object
     */
    public modifyRunWithHttpInfo(param: AssistantsApiModifyRunRequest, options?: Configuration): Promise<HttpInfo<RunObject>> {
        return this.api.modifyRunWithHttpInfo(param.threadId, param.runId, param.modifyRunRequest,  options).toPromise();
    }

    /**
     * Modifies a run.
     * @param param the request object
     */
    public modifyRun(param: AssistantsApiModifyRunRequest, options?: Configuration): Promise<RunObject> {
        return this.api.modifyRun(param.threadId, param.runId, param.modifyRunRequest,  options).toPromise();
    }

    /**
     * Modifies a thread.
     * @param param the request object
     */
    public modifyThreadWithHttpInfo(param: AssistantsApiModifyThreadRequest, options?: Configuration): Promise<HttpInfo<ThreadObject>> {
        return this.api.modifyThreadWithHttpInfo(param.threadId, param.modifyThreadRequest,  options).toPromise();
    }

    /**
     * Modifies a thread.
     * @param param the request object
     */
    public modifyThread(param: AssistantsApiModifyThreadRequest, options?: Configuration): Promise<ThreadObject> {
        return this.api.modifyThread(param.threadId, param.modifyThreadRequest,  options).toPromise();
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param param the request object
     */
    public submitToolOuputsToRunWithHttpInfo(param: AssistantsApiSubmitToolOuputsToRunRequest, options?: Configuration): Promise<HttpInfo<RunObject>> {
        return this.api.submitToolOuputsToRunWithHttpInfo(param.threadId, param.runId, param.submitToolOutputsRunRequest,  options).toPromise();
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param param the request object
     */
    public submitToolOuputsToRun(param: AssistantsApiSubmitToolOuputsToRunRequest, options?: Configuration): Promise<RunObject> {
        return this.api.submitToolOuputsToRun(param.threadId, param.runId, param.submitToolOutputsRunRequest,  options).toPromise();
    }

}

import { ObservableAudioApi } from "./ObservableAPI";
import { AudioApiRequestFactory, AudioApiResponseProcessor} from "../apis/AudioApi";

export interface AudioApiCreateSpeechRequest {
    /**
     * 
     * @type CreateSpeechRequest
     * @memberof AudioApicreateSpeech
     */
    createSpeechRequest: CreateSpeechRequest
}

export interface AudioApiCreateTranscriptionRequest {
    /**
     * The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof AudioApicreateTranscription
     */
    file: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateTranscriptionRequestModel
     * @memberof AudioApicreateTranscription
     */
    model: CreateTranscriptionRequestModel
    /**
     * The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * Defaults to: undefined
     * @type string
     * @memberof AudioApicreateTranscription
     */
    language?: string
    /**
     * An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * Defaults to: undefined
     * @type string
     * @memberof AudioApicreateTranscription
     */
    prompt?: string
    /**
     * The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * Defaults to: &#39;json&#39;
     * @type string
     * @memberof AudioApicreateTranscription
     */
    responseFormat?: string
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * Defaults to: 0
     * @type number
     * @memberof AudioApicreateTranscription
     */
    temperature?: number
    /**
     * The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     * Defaults to: undefined
     * @type Array&lt;string&gt;
     * @memberof AudioApicreateTranscription
     */
    timestampGranularities?: Array<string>
}

export interface AudioApiCreateTranslationRequest {
    /**
     * The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof AudioApicreateTranslation
     */
    file: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateTranscriptionRequestModel
     * @memberof AudioApicreateTranslation
     */
    model: CreateTranscriptionRequestModel
    /**
     * An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * Defaults to: undefined
     * @type string
     * @memberof AudioApicreateTranslation
     */
    prompt?: string
    /**
     * The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * Defaults to: &#39;json&#39;
     * @type string
     * @memberof AudioApicreateTranslation
     */
    responseFormat?: string
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * Defaults to: 0
     * @type number
     * @memberof AudioApicreateTranslation
     */
    temperature?: number
}

export class ObjectAudioApi {
    private api: ObservableAudioApi

    public constructor(configuration: Configuration, requestFactory?: AudioApiRequestFactory, responseProcessor?: AudioApiResponseProcessor) {
        this.api = new ObservableAudioApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generates audio from the input text.
     * @param param the request object
     */
    public createSpeechWithHttpInfo(param: AudioApiCreateSpeechRequest, options?: Configuration): Promise<HttpInfo<HttpFile>> {
        return this.api.createSpeechWithHttpInfo(param.createSpeechRequest,  options).toPromise();
    }

    /**
     * Generates audio from the input text.
     * @param param the request object
     */
    public createSpeech(param: AudioApiCreateSpeechRequest, options?: Configuration): Promise<HttpFile> {
        return this.api.createSpeech(param.createSpeechRequest,  options).toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param param the request object
     */
    public createTranscriptionWithHttpInfo(param: AudioApiCreateTranscriptionRequest, options?: Configuration): Promise<HttpInfo<CreateTranscription200Response>> {
        return this.api.createTranscriptionWithHttpInfo(param.file, param.model, param.language, param.prompt, param.responseFormat, param.temperature, param.timestampGranularities,  options).toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param param the request object
     */
    public createTranscription(param: AudioApiCreateTranscriptionRequest, options?: Configuration): Promise<CreateTranscription200Response> {
        return this.api.createTranscription(param.file, param.model, param.language, param.prompt, param.responseFormat, param.temperature, param.timestampGranularities,  options).toPromise();
    }

    /**
     * Translates audio into English.
     * @param param the request object
     */
    public createTranslationWithHttpInfo(param: AudioApiCreateTranslationRequest, options?: Configuration): Promise<HttpInfo<CreateTranslation200Response>> {
        return this.api.createTranslationWithHttpInfo(param.file, param.model, param.prompt, param.responseFormat, param.temperature,  options).toPromise();
    }

    /**
     * Translates audio into English.
     * @param param the request object
     */
    public createTranslation(param: AudioApiCreateTranslationRequest, options?: Configuration): Promise<CreateTranslation200Response> {
        return this.api.createTranslation(param.file, param.model, param.prompt, param.responseFormat, param.temperature,  options).toPromise();
    }

}

import { ObservableChatApi } from "./ObservableAPI";
import { ChatApiRequestFactory, ChatApiResponseProcessor} from "../apis/ChatApi";

export interface ChatApiCreateChatCompletionRequest {
    /**
     * 
     * @type CreateChatCompletionRequest
     * @memberof ChatApicreateChatCompletion
     */
    createChatCompletionRequest: CreateChatCompletionRequest
}

export class ObjectChatApi {
    private api: ObservableChatApi

    public constructor(configuration: Configuration, requestFactory?: ChatApiRequestFactory, responseProcessor?: ChatApiResponseProcessor) {
        this.api = new ObservableChatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param param the request object
     */
    public createChatCompletionWithHttpInfo(param: ChatApiCreateChatCompletionRequest, options?: Configuration): Promise<HttpInfo<CreateChatCompletionResponse>> {
        return this.api.createChatCompletionWithHttpInfo(param.createChatCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param param the request object
     */
    public createChatCompletion(param: ChatApiCreateChatCompletionRequest, options?: Configuration): Promise<CreateChatCompletionResponse> {
        return this.api.createChatCompletion(param.createChatCompletionRequest,  options).toPromise();
    }

}

import { ObservableCompletionsApi } from "./ObservableAPI";
import { CompletionsApiRequestFactory, CompletionsApiResponseProcessor} from "../apis/CompletionsApi";

export interface CompletionsApiCreateCompletionRequest {
    /**
     * 
     * @type CreateCompletionRequest
     * @memberof CompletionsApicreateCompletion
     */
    createCompletionRequest: CreateCompletionRequest
}

export class ObjectCompletionsApi {
    private api: ObservableCompletionsApi

    public constructor(configuration: Configuration, requestFactory?: CompletionsApiRequestFactory, responseProcessor?: CompletionsApiResponseProcessor) {
        this.api = new ObservableCompletionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param param the request object
     */
    public createCompletionWithHttpInfo(param: CompletionsApiCreateCompletionRequest, options?: Configuration): Promise<HttpInfo<CreateCompletionResponse>> {
        return this.api.createCompletionWithHttpInfo(param.createCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param param the request object
     */
    public createCompletion(param: CompletionsApiCreateCompletionRequest, options?: Configuration): Promise<CreateCompletionResponse> {
        return this.api.createCompletion(param.createCompletionRequest,  options).toPromise();
    }

}

import { ObservableEmbeddingsApi } from "./ObservableAPI";
import { EmbeddingsApiRequestFactory, EmbeddingsApiResponseProcessor} from "../apis/EmbeddingsApi";

export interface EmbeddingsApiCreateEmbeddingRequest {
    /**
     * 
     * @type CreateEmbeddingRequest
     * @memberof EmbeddingsApicreateEmbedding
     */
    createEmbeddingRequest: CreateEmbeddingRequest
}

export class ObjectEmbeddingsApi {
    private api: ObservableEmbeddingsApi

    public constructor(configuration: Configuration, requestFactory?: EmbeddingsApiRequestFactory, responseProcessor?: EmbeddingsApiResponseProcessor) {
        this.api = new ObservableEmbeddingsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param param the request object
     */
    public createEmbeddingWithHttpInfo(param: EmbeddingsApiCreateEmbeddingRequest, options?: Configuration): Promise<HttpInfo<CreateEmbeddingResponse>> {
        return this.api.createEmbeddingWithHttpInfo(param.createEmbeddingRequest,  options).toPromise();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param param the request object
     */
    public createEmbedding(param: EmbeddingsApiCreateEmbeddingRequest, options?: Configuration): Promise<CreateEmbeddingResponse> {
        return this.api.createEmbedding(param.createEmbeddingRequest,  options).toPromise();
    }

}

import { ObservableFilesApi } from "./ObservableAPI";
import { FilesApiRequestFactory, FilesApiResponseProcessor} from "../apis/FilesApi";

export interface FilesApiCreateFileRequest {
    /**
     * The File object (not file name) to be uploaded. 
     * Defaults to: undefined
     * @type HttpFile
     * @memberof FilesApicreateFile
     */
    file: HttpFile
    /**
     * The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
     * Defaults to: undefined
     * @type string
     * @memberof FilesApicreateFile
     */
    purpose: string
}

export interface FilesApiDeleteFileRequest {
    /**
     * The ID of the file to use for this request.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApideleteFile
     */
    fileId: string
}

export interface FilesApiDownloadFileRequest {
    /**
     * The ID of the file to use for this request.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApidownloadFile
     */
    fileId: string
}

export interface FilesApiListFilesRequest {
    /**
     * Only return files with the given purpose.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApilistFiles
     */
    purpose?: string
}

export interface FilesApiRetrieveFileRequest {
    /**
     * The ID of the file to use for this request.
     * Defaults to: undefined
     * @type string
     * @memberof FilesApiretrieveFile
     */
    fileId: string
}

export class ObjectFilesApi {
    private api: ObservableFilesApi

    public constructor(configuration: Configuration, requestFactory?: FilesApiRequestFactory, responseProcessor?: FilesApiResponseProcessor) {
        this.api = new ObservableFilesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param param the request object
     */
    public createFileWithHttpInfo(param: FilesApiCreateFileRequest, options?: Configuration): Promise<HttpInfo<OpenAIFile>> {
        return this.api.createFileWithHttpInfo(param.file, param.purpose,  options).toPromise();
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param param the request object
     */
    public createFile(param: FilesApiCreateFileRequest, options?: Configuration): Promise<OpenAIFile> {
        return this.api.createFile(param.file, param.purpose,  options).toPromise();
    }

    /**
     * Delete a file.
     * @param param the request object
     */
    public deleteFileWithHttpInfo(param: FilesApiDeleteFileRequest, options?: Configuration): Promise<HttpInfo<DeleteFileResponse>> {
        return this.api.deleteFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Delete a file.
     * @param param the request object
     */
    public deleteFile(param: FilesApiDeleteFileRequest, options?: Configuration): Promise<DeleteFileResponse> {
        return this.api.deleteFile(param.fileId,  options).toPromise();
    }

    /**
     * Returns the contents of the specified file.
     * @param param the request object
     */
    public downloadFileWithHttpInfo(param: FilesApiDownloadFileRequest, options?: Configuration): Promise<HttpInfo<string>> {
        return this.api.downloadFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Returns the contents of the specified file.
     * @param param the request object
     */
    public downloadFile(param: FilesApiDownloadFileRequest, options?: Configuration): Promise<string> {
        return this.api.downloadFile(param.fileId,  options).toPromise();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param param the request object
     */
    public listFilesWithHttpInfo(param: FilesApiListFilesRequest = {}, options?: Configuration): Promise<HttpInfo<ListFilesResponse>> {
        return this.api.listFilesWithHttpInfo(param.purpose,  options).toPromise();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param param the request object
     */
    public listFiles(param: FilesApiListFilesRequest = {}, options?: Configuration): Promise<ListFilesResponse> {
        return this.api.listFiles(param.purpose,  options).toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param param the request object
     */
    public retrieveFileWithHttpInfo(param: FilesApiRetrieveFileRequest, options?: Configuration): Promise<HttpInfo<OpenAIFile>> {
        return this.api.retrieveFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param param the request object
     */
    public retrieveFile(param: FilesApiRetrieveFileRequest, options?: Configuration): Promise<OpenAIFile> {
        return this.api.retrieveFile(param.fileId,  options).toPromise();
    }

}

import { ObservableFineTuningApi } from "./ObservableAPI";
import { FineTuningApiRequestFactory, FineTuningApiResponseProcessor} from "../apis/FineTuningApi";

export interface FineTuningApiCancelFineTuningJobRequest {
    /**
     * The ID of the fine-tuning job to cancel. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApicancelFineTuningJob
     */
    fineTuningJobId: string
}

export interface FineTuningApiCreateFineTuningJobRequest {
    /**
     * 
     * @type CreateFineTuningJobRequest
     * @memberof FineTuningApicreateFineTuningJob
     */
    createFineTuningJobRequest: CreateFineTuningJobRequest
}

export interface FineTuningApiListFineTuningEventsRequest {
    /**
     * The ID of the fine-tuning job to get events for. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningEvents
     */
    fineTuningJobId: string
    /**
     * Identifier for the last event from the previous pagination request.
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningEvents
     */
    after?: string
    /**
     * Number of events to retrieve.
     * Defaults to: 20
     * @type number
     * @memberof FineTuningApilistFineTuningEvents
     */
    limit?: number
}

export interface FineTuningApiListFineTuningJobCheckpointsRequest {
    /**
     * The ID of the fine-tuning job to get checkpoints for. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningJobCheckpoints
     */
    fineTuningJobId: string
    /**
     * Identifier for the last checkpoint ID from the previous pagination request.
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistFineTuningJobCheckpoints
     */
    after?: string
    /**
     * Number of checkpoints to retrieve.
     * Defaults to: 10
     * @type number
     * @memberof FineTuningApilistFineTuningJobCheckpoints
     */
    limit?: number
}

export interface FineTuningApiListPaginatedFineTuningJobsRequest {
    /**
     * Identifier for the last job from the previous pagination request.
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApilistPaginatedFineTuningJobs
     */
    after?: string
    /**
     * Number of fine-tuning jobs to retrieve.
     * Defaults to: 20
     * @type number
     * @memberof FineTuningApilistPaginatedFineTuningJobs
     */
    limit?: number
}

export interface FineTuningApiRetrieveFineTuningJobRequest {
    /**
     * The ID of the fine-tuning job. 
     * Defaults to: undefined
     * @type string
     * @memberof FineTuningApiretrieveFineTuningJob
     */
    fineTuningJobId: string
}

export class ObjectFineTuningApi {
    private api: ObservableFineTuningApi

    public constructor(configuration: Configuration, requestFactory?: FineTuningApiRequestFactory, responseProcessor?: FineTuningApiResponseProcessor) {
        this.api = new ObservableFineTuningApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param param the request object
     */
    public cancelFineTuningJobWithHttpInfo(param: FineTuningApiCancelFineTuningJobRequest, options?: Configuration): Promise<HttpInfo<FineTuningJob>> {
        return this.api.cancelFineTuningJobWithHttpInfo(param.fineTuningJobId,  options).toPromise();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param param the request object
     */
    public cancelFineTuningJob(param: FineTuningApiCancelFineTuningJobRequest, options?: Configuration): Promise<FineTuningJob> {
        return this.api.cancelFineTuningJob(param.fineTuningJobId,  options).toPromise();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public createFineTuningJobWithHttpInfo(param: FineTuningApiCreateFineTuningJobRequest, options?: Configuration): Promise<HttpInfo<FineTuningJob>> {
        return this.api.createFineTuningJobWithHttpInfo(param.createFineTuningJobRequest,  options).toPromise();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public createFineTuningJob(param: FineTuningApiCreateFineTuningJobRequest, options?: Configuration): Promise<FineTuningJob> {
        return this.api.createFineTuningJob(param.createFineTuningJobRequest,  options).toPromise();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningEventsWithHttpInfo(param: FineTuningApiListFineTuningEventsRequest, options?: Configuration): Promise<HttpInfo<ListFineTuningJobEventsResponse>> {
        return this.api.listFineTuningEventsWithHttpInfo(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningEvents(param: FineTuningApiListFineTuningEventsRequest, options?: Configuration): Promise<ListFineTuningJobEventsResponse> {
        return this.api.listFineTuningEvents(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningJobCheckpointsWithHttpInfo(param: FineTuningApiListFineTuningJobCheckpointsRequest, options?: Configuration): Promise<HttpInfo<ListFineTuningJobCheckpointsResponse>> {
        return this.api.listFineTuningJobCheckpointsWithHttpInfo(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param param the request object
     */
    public listFineTuningJobCheckpoints(param: FineTuningApiListFineTuningJobCheckpointsRequest, options?: Configuration): Promise<ListFineTuningJobCheckpointsResponse> {
        return this.api.listFineTuningJobCheckpoints(param.fineTuningJobId, param.after, param.limit,  options).toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param param the request object
     */
    public listPaginatedFineTuningJobsWithHttpInfo(param: FineTuningApiListPaginatedFineTuningJobsRequest = {}, options?: Configuration): Promise<HttpInfo<ListPaginatedFineTuningJobsResponse>> {
        return this.api.listPaginatedFineTuningJobsWithHttpInfo(param.after, param.limit,  options).toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param param the request object
     */
    public listPaginatedFineTuningJobs(param: FineTuningApiListPaginatedFineTuningJobsRequest = {}, options?: Configuration): Promise<ListPaginatedFineTuningJobsResponse> {
        return this.api.listPaginatedFineTuningJobs(param.after, param.limit,  options).toPromise();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public retrieveFineTuningJobWithHttpInfo(param: FineTuningApiRetrieveFineTuningJobRequest, options?: Configuration): Promise<HttpInfo<FineTuningJob>> {
        return this.api.retrieveFineTuningJobWithHttpInfo(param.fineTuningJobId,  options).toPromise();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public retrieveFineTuningJob(param: FineTuningApiRetrieveFineTuningJobRequest, options?: Configuration): Promise<FineTuningJob> {
        return this.api.retrieveFineTuningJob(param.fineTuningJobId,  options).toPromise();
    }

}

import { ObservableImagesApi } from "./ObservableAPI";
import { ImagesApiRequestFactory, ImagesApiResponseProcessor} from "../apis/ImagesApi";

export interface ImagesApiCreateImageRequest {
    /**
     * 
     * @type CreateImageRequest
     * @memberof ImagesApicreateImage
     */
    createImageRequest: CreateImageRequest
}

export interface ImagesApiCreateImageEditRequest {
    /**
     * The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof ImagesApicreateImageEdit
     */
    image: HttpFile
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters.
     * Defaults to: undefined
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    prompt: string
    /**
     * An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof ImagesApicreateImageEdit
     */
    mask?: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateImageEditRequestModel
     * @memberof ImagesApicreateImageEdit
     */
    model?: CreateImageEditRequestModel
    /**
     * The number of images to generate. Must be between 1 and 10.
     * Minimum: 1
     * Maximum: 10
     * Defaults to: 1
     * @type number
     * @memberof ImagesApicreateImageEdit
     */
    n?: number
    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * Defaults to: &#39;1024x1024&#39;
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    size?: string
    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * Defaults to: &#39;url&#39;
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    responseFormat?: string
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * Defaults to: undefined
     * @type string
     * @memberof ImagesApicreateImageEdit
     */
    user?: string
}

export interface ImagesApiCreateImageVariationRequest {
    /**
     * The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * Defaults to: undefined
     * @type HttpFile
     * @memberof ImagesApicreateImageVariation
     */
    image: HttpFile
    /**
     * 
     * Defaults to: undefined
     * @type CreateImageEditRequestModel
     * @memberof ImagesApicreateImageVariation
     */
    model?: CreateImageEditRequestModel
    /**
     * The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * Minimum: 1
     * Maximum: 10
     * Defaults to: 1
     * @type number
     * @memberof ImagesApicreateImageVariation
     */
    n?: number
    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * Defaults to: &#39;url&#39;
     * @type string
     * @memberof ImagesApicreateImageVariation
     */
    responseFormat?: string
    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * Defaults to: &#39;1024x1024&#39;
     * @type string
     * @memberof ImagesApicreateImageVariation
     */
    size?: string
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * Defaults to: undefined
     * @type string
     * @memberof ImagesApicreateImageVariation
     */
    user?: string
}

export class ObjectImagesApi {
    private api: ObservableImagesApi

    public constructor(configuration: Configuration, requestFactory?: ImagesApiRequestFactory, responseProcessor?: ImagesApiResponseProcessor) {
        this.api = new ObservableImagesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates an image given a prompt.
     * @param param the request object
     */
    public createImageWithHttpInfo(param: ImagesApiCreateImageRequest, options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageWithHttpInfo(param.createImageRequest,  options).toPromise();
    }

    /**
     * Creates an image given a prompt.
     * @param param the request object
     */
    public createImage(param: ImagesApiCreateImageRequest, options?: Configuration): Promise<ImagesResponse> {
        return this.api.createImage(param.createImageRequest,  options).toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param param the request object
     */
    public createImageEditWithHttpInfo(param: ImagesApiCreateImageEditRequest, options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageEditWithHttpInfo(param.image, param.prompt, param.mask, param.model, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param param the request object
     */
    public createImageEdit(param: ImagesApiCreateImageEditRequest, options?: Configuration): Promise<ImagesResponse> {
        return this.api.createImageEdit(param.image, param.prompt, param.mask, param.model, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param param the request object
     */
    public createImageVariationWithHttpInfo(param: ImagesApiCreateImageVariationRequest, options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageVariationWithHttpInfo(param.image, param.model, param.n, param.responseFormat, param.size, param.user,  options).toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param param the request object
     */
    public createImageVariation(param: ImagesApiCreateImageVariationRequest, options?: Configuration): Promise<ImagesResponse> {
        return this.api.createImageVariation(param.image, param.model, param.n, param.responseFormat, param.size, param.user,  options).toPromise();
    }

}

import { ObservableModelsApi } from "./ObservableAPI";
import { ModelsApiRequestFactory, ModelsApiResponseProcessor} from "../apis/ModelsApi";

export interface ModelsApiDeleteModelRequest {
    /**
     * The model to delete
     * Defaults to: undefined
     * @type string
     * @memberof ModelsApideleteModel
     */
    model: string
}

export interface ModelsApiListModelsRequest {
}

export interface ModelsApiRetrieveModelRequest {
    /**
     * The ID of the model to use for this request
     * Defaults to: undefined
     * @type string
     * @memberof ModelsApiretrieveModel
     */
    model: string
}

export class ObjectModelsApi {
    private api: ObservableModelsApi

    public constructor(configuration: Configuration, requestFactory?: ModelsApiRequestFactory, responseProcessor?: ModelsApiResponseProcessor) {
        this.api = new ObservableModelsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param param the request object
     */
    public deleteModelWithHttpInfo(param: ModelsApiDeleteModelRequest, options?: Configuration): Promise<HttpInfo<DeleteModelResponse>> {
        return this.api.deleteModelWithHttpInfo(param.model,  options).toPromise();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param param the request object
     */
    public deleteModel(param: ModelsApiDeleteModelRequest, options?: Configuration): Promise<DeleteModelResponse> {
        return this.api.deleteModel(param.model,  options).toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param param the request object
     */
    public listModelsWithHttpInfo(param: ModelsApiListModelsRequest = {}, options?: Configuration): Promise<HttpInfo<ListModelsResponse>> {
        return this.api.listModelsWithHttpInfo( options).toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param param the request object
     */
    public listModels(param: ModelsApiListModelsRequest = {}, options?: Configuration): Promise<ListModelsResponse> {
        return this.api.listModels( options).toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param param the request object
     */
    public retrieveModelWithHttpInfo(param: ModelsApiRetrieveModelRequest, options?: Configuration): Promise<HttpInfo<Model>> {
        return this.api.retrieveModelWithHttpInfo(param.model,  options).toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param param the request object
     */
    public retrieveModel(param: ModelsApiRetrieveModelRequest, options?: Configuration): Promise<Model> {
        return this.api.retrieveModel(param.model,  options).toPromise();
    }

}

import { ObservableModerationsApi } from "./ObservableAPI";
import { ModerationsApiRequestFactory, ModerationsApiResponseProcessor} from "../apis/ModerationsApi";

export interface ModerationsApiCreateModerationRequest {
    /**
     * 
     * @type CreateModerationRequest
     * @memberof ModerationsApicreateModeration
     */
    createModerationRequest: CreateModerationRequest
}

export class ObjectModerationsApi {
    private api: ObservableModerationsApi

    public constructor(configuration: Configuration, requestFactory?: ModerationsApiRequestFactory, responseProcessor?: ModerationsApiResponseProcessor) {
        this.api = new ObservableModerationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Classifies if text is potentially harmful.
     * @param param the request object
     */
    public createModerationWithHttpInfo(param: ModerationsApiCreateModerationRequest, options?: Configuration): Promise<HttpInfo<CreateModerationResponse>> {
        return this.api.createModerationWithHttpInfo(param.createModerationRequest,  options).toPromise();
    }

    /**
     * Classifies if text is potentially harmful.
     * @param param the request object
     */
    public createModeration(param: ModerationsApiCreateModerationRequest, options?: Configuration): Promise<CreateModerationResponse> {
        return this.api.createModeration(param.createModerationRequest,  options).toPromise();
    }

}
