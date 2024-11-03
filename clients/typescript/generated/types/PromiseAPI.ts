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
import { ObservableAssistantsApi } from './ObservableAPI';

import { AssistantsApiRequestFactory, AssistantsApiResponseProcessor} from "../apis/AssistantsApi";
export class PromiseAssistantsApi {
    private api: ObservableAssistantsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AssistantsApiRequestFactory,
        responseProcessor?: AssistantsApiResponseProcessor
    ) {
        this.api = new ObservableAssistantsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     */
    public cancelRunWithHttpInfo(threadId: string, runId: string, _options?: Configuration): Promise<HttpInfo<RunObject>> {
        const result = this.api.cancelRunWithHttpInfo(threadId, runId, _options);
        return result.toPromise();
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     */
    public cancelRun(threadId: string, runId: string, _options?: Configuration): Promise<RunObject> {
        const result = this.api.cancelRun(threadId, runId, _options);
        return result.toPromise();
    }

    /**
     * Create an assistant with a model and instructions.
     * @param createAssistantRequest
     */
    public createAssistantWithHttpInfo(createAssistantRequest: CreateAssistantRequest, _options?: Configuration): Promise<HttpInfo<AssistantObject>> {
        const result = this.api.createAssistantWithHttpInfo(createAssistantRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an assistant with a model and instructions.
     * @param createAssistantRequest
     */
    public createAssistant(createAssistantRequest: CreateAssistantRequest, _options?: Configuration): Promise<AssistantObject> {
        const result = this.api.createAssistant(createAssistantRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param assistantId The ID of the assistant for which to create a File. 
     * @param createAssistantFileRequest
     */
    public createAssistantFileWithHttpInfo(assistantId: string, createAssistantFileRequest: CreateAssistantFileRequest, _options?: Configuration): Promise<HttpInfo<AssistantFileObject>> {
        const result = this.api.createAssistantFileWithHttpInfo(assistantId, createAssistantFileRequest, _options);
        return result.toPromise();
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param assistantId The ID of the assistant for which to create a File. 
     * @param createAssistantFileRequest
     */
    public createAssistantFile(assistantId: string, createAssistantFileRequest: CreateAssistantFileRequest, _options?: Configuration): Promise<AssistantFileObject> {
        const result = this.api.createAssistantFile(assistantId, createAssistantFileRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param createMessageRequest
     */
    public createMessageWithHttpInfo(threadId: string, createMessageRequest: CreateMessageRequest, _options?: Configuration): Promise<HttpInfo<MessageObject>> {
        const result = this.api.createMessageWithHttpInfo(threadId, createMessageRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param createMessageRequest
     */
    public createMessage(threadId: string, createMessageRequest: CreateMessageRequest, _options?: Configuration): Promise<MessageObject> {
        const result = this.api.createMessage(threadId, createMessageRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a run.
     * @param threadId The ID of the thread to run.
     * @param createRunRequest
     */
    public createRunWithHttpInfo(threadId: string, createRunRequest: CreateRunRequest, _options?: Configuration): Promise<HttpInfo<RunObject>> {
        const result = this.api.createRunWithHttpInfo(threadId, createRunRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a run.
     * @param threadId The ID of the thread to run.
     * @param createRunRequest
     */
    public createRun(threadId: string, createRunRequest: CreateRunRequest, _options?: Configuration): Promise<RunObject> {
        const result = this.api.createRun(threadId, createRunRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a thread.
     * @param [createThreadRequest]
     */
    public createThreadWithHttpInfo(createThreadRequest?: CreateThreadRequest, _options?: Configuration): Promise<HttpInfo<ThreadObject>> {
        const result = this.api.createThreadWithHttpInfo(createThreadRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a thread.
     * @param [createThreadRequest]
     */
    public createThread(createThreadRequest?: CreateThreadRequest, _options?: Configuration): Promise<ThreadObject> {
        const result = this.api.createThread(createThreadRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a thread and run it in one request.
     * @param createThreadAndRunRequest
     */
    public createThreadAndRunWithHttpInfo(createThreadAndRunRequest: CreateThreadAndRunRequest, _options?: Configuration): Promise<HttpInfo<RunObject>> {
        const result = this.api.createThreadAndRunWithHttpInfo(createThreadAndRunRequest, _options);
        return result.toPromise();
    }

    /**
     * Create a thread and run it in one request.
     * @param createThreadAndRunRequest
     */
    public createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest, _options?: Configuration): Promise<RunObject> {
        const result = this.api.createThreadAndRun(createThreadAndRunRequest, _options);
        return result.toPromise();
    }

    /**
     * Delete an assistant.
     * @param assistantId The ID of the assistant to delete.
     */
    public deleteAssistantWithHttpInfo(assistantId: string, _options?: Configuration): Promise<HttpInfo<DeleteAssistantResponse>> {
        const result = this.api.deleteAssistantWithHttpInfo(assistantId, _options);
        return result.toPromise();
    }

    /**
     * Delete an assistant.
     * @param assistantId The ID of the assistant to delete.
     */
    public deleteAssistant(assistantId: string, _options?: Configuration): Promise<DeleteAssistantResponse> {
        const result = this.api.deleteAssistant(assistantId, _options);
        return result.toPromise();
    }

    /**
     * Delete an assistant file.
     * @param assistantId The ID of the assistant that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public deleteAssistantFileWithHttpInfo(assistantId: string, fileId: string, _options?: Configuration): Promise<HttpInfo<DeleteAssistantFileResponse>> {
        const result = this.api.deleteAssistantFileWithHttpInfo(assistantId, fileId, _options);
        return result.toPromise();
    }

    /**
     * Delete an assistant file.
     * @param assistantId The ID of the assistant that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public deleteAssistantFile(assistantId: string, fileId: string, _options?: Configuration): Promise<DeleteAssistantFileResponse> {
        const result = this.api.deleteAssistantFile(assistantId, fileId, _options);
        return result.toPromise();
    }

    /**
     * Delete a thread.
     * @param threadId The ID of the thread to delete.
     */
    public deleteThreadWithHttpInfo(threadId: string, _options?: Configuration): Promise<HttpInfo<DeleteThreadResponse>> {
        const result = this.api.deleteThreadWithHttpInfo(threadId, _options);
        return result.toPromise();
    }

    /**
     * Delete a thread.
     * @param threadId The ID of the thread to delete.
     */
    public deleteThread(threadId: string, _options?: Configuration): Promise<DeleteThreadResponse> {
        const result = this.api.deleteThread(threadId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves an assistant.
     * @param assistantId The ID of the assistant to retrieve.
     */
    public getAssistantWithHttpInfo(assistantId: string, _options?: Configuration): Promise<HttpInfo<AssistantObject>> {
        const result = this.api.getAssistantWithHttpInfo(assistantId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves an assistant.
     * @param assistantId The ID of the assistant to retrieve.
     */
    public getAssistant(assistantId: string, _options?: Configuration): Promise<AssistantObject> {
        const result = this.api.getAssistant(assistantId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves an AssistantFile.
     * @param assistantId The ID of the assistant who the file belongs to.
     * @param fileId The ID of the file we\&#39;re getting.
     */
    public getAssistantFileWithHttpInfo(assistantId: string, fileId: string, _options?: Configuration): Promise<HttpInfo<AssistantFileObject>> {
        const result = this.api.getAssistantFileWithHttpInfo(assistantId, fileId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves an AssistantFile.
     * @param assistantId The ID of the assistant who the file belongs to.
     * @param fileId The ID of the file we\&#39;re getting.
     */
    public getAssistantFile(assistantId: string, fileId: string, _options?: Configuration): Promise<AssistantFileObject> {
        const result = this.api.getAssistantFile(assistantId, fileId, _options);
        return result.toPromise();
    }

    /**
     * Retrieve a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     */
    public getMessageWithHttpInfo(threadId: string, messageId: string, _options?: Configuration): Promise<HttpInfo<MessageObject>> {
        const result = this.api.getMessageWithHttpInfo(threadId, messageId, _options);
        return result.toPromise();
    }

    /**
     * Retrieve a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     */
    public getMessage(threadId: string, messageId: string, _options?: Configuration): Promise<MessageObject> {
        const result = this.api.getMessage(threadId, messageId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a message file.
     * @param threadId The ID of the thread to which the message and File belong.
     * @param messageId The ID of the message the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public getMessageFileWithHttpInfo(threadId: string, messageId: string, fileId: string, _options?: Configuration): Promise<HttpInfo<MessageFileObject>> {
        const result = this.api.getMessageFileWithHttpInfo(threadId, messageId, fileId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a message file.
     * @param threadId The ID of the thread to which the message and File belong.
     * @param messageId The ID of the message the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public getMessageFile(threadId: string, messageId: string, fileId: string, _options?: Configuration): Promise<MessageFileObject> {
        const result = this.api.getMessageFile(threadId, messageId, fileId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     */
    public getRunWithHttpInfo(threadId: string, runId: string, _options?: Configuration): Promise<HttpInfo<RunObject>> {
        const result = this.api.getRunWithHttpInfo(threadId, runId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     */
    public getRun(threadId: string, runId: string, _options?: Configuration): Promise<RunObject> {
        const result = this.api.getRun(threadId, runId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a run step.
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     */
    public getRunStepWithHttpInfo(threadId: string, runId: string, stepId: string, _options?: Configuration): Promise<HttpInfo<RunStepObject>> {
        const result = this.api.getRunStepWithHttpInfo(threadId, runId, stepId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a run step.
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     */
    public getRunStep(threadId: string, runId: string, stepId: string, _options?: Configuration): Promise<RunStepObject> {
        const result = this.api.getRunStep(threadId, runId, stepId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a thread.
     * @param threadId The ID of the thread to retrieve.
     */
    public getThreadWithHttpInfo(threadId: string, _options?: Configuration): Promise<HttpInfo<ThreadObject>> {
        const result = this.api.getThreadWithHttpInfo(threadId, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a thread.
     * @param threadId The ID of the thread to retrieve.
     */
    public getThread(threadId: string, _options?: Configuration): Promise<ThreadObject> {
        const result = this.api.getThread(threadId, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of assistant files.
     * @param assistantId The ID of the assistant the file belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantFilesWithHttpInfo(assistantId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<HttpInfo<ListAssistantFilesResponse>> {
        const result = this.api.listAssistantFilesWithHttpInfo(assistantId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of assistant files.
     * @param assistantId The ID of the assistant the file belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantFiles(assistantId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<ListAssistantFilesResponse> {
        const result = this.api.listAssistantFiles(assistantId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of assistants.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantsWithHttpInfo(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<HttpInfo<ListAssistantsResponse>> {
        const result = this.api.listAssistantsWithHttpInfo(limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of assistants.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistants(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<ListAssistantsResponse> {
        const result = this.api.listAssistants(limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of message files.
     * @param threadId The ID of the thread that the message and files belong to.
     * @param messageId The ID of the message that the files belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listMessageFilesWithHttpInfo(threadId: string, messageId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<HttpInfo<ListMessageFilesResponse>> {
        const result = this.api.listMessageFilesWithHttpInfo(threadId, messageId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of message files.
     * @param threadId The ID of the thread that the message and files belong to.
     * @param messageId The ID of the message that the files belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listMessageFiles(threadId: string, messageId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<ListMessageFilesResponse> {
        const result = this.api.listMessageFiles(threadId, messageId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of messages for a given thread.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [runId] Filter messages by the run ID that generated them. 
     */
    public listMessagesWithHttpInfo(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, runId?: string, _options?: Configuration): Promise<HttpInfo<ListMessagesResponse>> {
        const result = this.api.listMessagesWithHttpInfo(threadId, limit, order, after, before, runId, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of messages for a given thread.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) the messages belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     * @param [runId] Filter messages by the run ID that generated them. 
     */
    public listMessages(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, runId?: string, _options?: Configuration): Promise<ListMessagesResponse> {
        const result = this.api.listMessages(threadId, limit, order, after, before, runId, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param threadId The ID of the thread the run and run steps belong to.
     * @param runId The ID of the run the run steps belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRunStepsWithHttpInfo(threadId: string, runId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<HttpInfo<ListRunStepsResponse>> {
        const result = this.api.listRunStepsWithHttpInfo(threadId, runId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of run steps belonging to a run.
     * @param threadId The ID of the thread the run and run steps belong to.
     * @param runId The ID of the run the run steps belong to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRunSteps(threadId: string, runId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<ListRunStepsResponse> {
        const result = this.api.listRunSteps(threadId, runId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param threadId The ID of the thread the run belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRunsWithHttpInfo(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<HttpInfo<ListRunsResponse>> {
        const result = this.api.listRunsWithHttpInfo(threadId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param threadId The ID of the thread the run belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRuns(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Promise<ListRunsResponse> {
        const result = this.api.listRuns(threadId, limit, order, after, before, _options);
        return result.toPromise();
    }

    /**
     * Modifies an assistant.
     * @param assistantId The ID of the assistant to modify.
     * @param modifyAssistantRequest
     */
    public modifyAssistantWithHttpInfo(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest, _options?: Configuration): Promise<HttpInfo<AssistantObject>> {
        const result = this.api.modifyAssistantWithHttpInfo(assistantId, modifyAssistantRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies an assistant.
     * @param assistantId The ID of the assistant to modify.
     * @param modifyAssistantRequest
     */
    public modifyAssistant(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest, _options?: Configuration): Promise<AssistantObject> {
        const result = this.api.modifyAssistant(assistantId, modifyAssistantRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param modifyMessageRequest
     */
    public modifyMessageWithHttpInfo(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest, _options?: Configuration): Promise<HttpInfo<MessageObject>> {
        const result = this.api.modifyMessageWithHttpInfo(threadId, messageId, modifyMessageRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param modifyMessageRequest
     */
    public modifyMessage(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest, _options?: Configuration): Promise<MessageObject> {
        const result = this.api.modifyMessage(threadId, messageId, modifyMessageRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param modifyRunRequest
     */
    public modifyRunWithHttpInfo(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest, _options?: Configuration): Promise<HttpInfo<RunObject>> {
        const result = this.api.modifyRunWithHttpInfo(threadId, runId, modifyRunRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param modifyRunRequest
     */
    public modifyRun(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest, _options?: Configuration): Promise<RunObject> {
        const result = this.api.modifyRun(threadId, runId, modifyRunRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies a thread.
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * @param modifyThreadRequest
     */
    public modifyThreadWithHttpInfo(threadId: string, modifyThreadRequest: ModifyThreadRequest, _options?: Configuration): Promise<HttpInfo<ThreadObject>> {
        const result = this.api.modifyThreadWithHttpInfo(threadId, modifyThreadRequest, _options);
        return result.toPromise();
    }

    /**
     * Modifies a thread.
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * @param modifyThreadRequest
     */
    public modifyThread(threadId: string, modifyThreadRequest: ModifyThreadRequest, _options?: Configuration): Promise<ThreadObject> {
        const result = this.api.modifyThread(threadId, modifyThreadRequest, _options);
        return result.toPromise();
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRunRequest
     */
    public submitToolOuputsToRunWithHttpInfo(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, _options?: Configuration): Promise<HttpInfo<RunObject>> {
        const result = this.api.submitToolOuputsToRunWithHttpInfo(threadId, runId, submitToolOutputsRunRequest, _options);
        return result.toPromise();
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRunRequest
     */
    public submitToolOuputsToRun(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, _options?: Configuration): Promise<RunObject> {
        const result = this.api.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, _options);
        return result.toPromise();
    }


}



import { ObservableAudioApi } from './ObservableAPI';

import { AudioApiRequestFactory, AudioApiResponseProcessor} from "../apis/AudioApi";
export class PromiseAudioApi {
    private api: ObservableAudioApi

    public constructor(
        configuration: Configuration,
        requestFactory?: AudioApiRequestFactory,
        responseProcessor?: AudioApiResponseProcessor
    ) {
        this.api = new ObservableAudioApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Generates audio from the input text.
     * @param createSpeechRequest
     */
    public createSpeechWithHttpInfo(createSpeechRequest: CreateSpeechRequest, _options?: Configuration): Promise<HttpInfo<HttpFile>> {
        const result = this.api.createSpeechWithHttpInfo(createSpeechRequest, _options);
        return result.toPromise();
    }

    /**
     * Generates audio from the input text.
     * @param createSpeechRequest
     */
    public createSpeech(createSpeechRequest: CreateSpeechRequest, _options?: Configuration): Promise<HttpFile> {
        const result = this.api.createSpeech(createSpeechRequest, _options);
        return result.toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [language] The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * @param [responseFormat] The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param [timestampGranularities] The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     */
    public createTranscriptionWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, _options?: Configuration): Promise<HttpInfo<CreateTranscription200Response>> {
        const result = this.api.createTranscriptionWithHttpInfo(file, model, language, prompt, responseFormat, temperature, timestampGranularities, _options);
        return result.toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param file The audio file object (not file name) to transcribe, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [language] The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * @param [responseFormat] The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param [timestampGranularities] The timestamp granularities to populate for this transcription. &#x60;response_format&#x60; must be set &#x60;verbose_json&#x60; to use timestamp granularities. Either or both of these options are supported: &#x60;word&#x60;, or &#x60;segment&#x60;. Note: There is no additional latency for segment timestamps, but generating word timestamps incurs additional latency. 
     */
    public createTranscription(file: HttpFile, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, _options?: Configuration): Promise<CreateTranscription200Response> {
        const result = this.api.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities, _options);
        return result.toPromise();
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param [responseFormat] The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslationWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, _options?: Configuration): Promise<HttpInfo<CreateTranslation200Response>> {
        const result = this.api.createTranslationWithHttpInfo(file, model, prompt, responseFormat, temperature, _options);
        return result.toPromise();
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param [responseFormat] The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslation(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, _options?: Configuration): Promise<CreateTranslation200Response> {
        const result = this.api.createTranslation(file, model, prompt, responseFormat, temperature, _options);
        return result.toPromise();
    }


}



import { ObservableChatApi } from './ObservableAPI';

import { ChatApiRequestFactory, ChatApiResponseProcessor} from "../apis/ChatApi";
export class PromiseChatApi {
    private api: ObservableChatApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ChatApiRequestFactory,
        responseProcessor?: ChatApiResponseProcessor
    ) {
        this.api = new ObservableChatApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param createChatCompletionRequest
     */
    public createChatCompletionWithHttpInfo(createChatCompletionRequest: CreateChatCompletionRequest, _options?: Configuration): Promise<HttpInfo<CreateChatCompletionResponse>> {
        const result = this.api.createChatCompletionWithHttpInfo(createChatCompletionRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param createChatCompletionRequest
     */
    public createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, _options?: Configuration): Promise<CreateChatCompletionResponse> {
        const result = this.api.createChatCompletion(createChatCompletionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableCompletionsApi } from './ObservableAPI';

import { CompletionsApiRequestFactory, CompletionsApiResponseProcessor} from "../apis/CompletionsApi";
export class PromiseCompletionsApi {
    private api: ObservableCompletionsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: CompletionsApiRequestFactory,
        responseProcessor?: CompletionsApiResponseProcessor
    ) {
        this.api = new ObservableCompletionsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest
     */
    public createCompletionWithHttpInfo(createCompletionRequest: CreateCompletionRequest, _options?: Configuration): Promise<HttpInfo<CreateCompletionResponse>> {
        const result = this.api.createCompletionWithHttpInfo(createCompletionRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest
     */
    public createCompletion(createCompletionRequest: CreateCompletionRequest, _options?: Configuration): Promise<CreateCompletionResponse> {
        const result = this.api.createCompletion(createCompletionRequest, _options);
        return result.toPromise();
    }


}



import { ObservableEmbeddingsApi } from './ObservableAPI';

import { EmbeddingsApiRequestFactory, EmbeddingsApiResponseProcessor} from "../apis/EmbeddingsApi";
export class PromiseEmbeddingsApi {
    private api: ObservableEmbeddingsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: EmbeddingsApiRequestFactory,
        responseProcessor?: EmbeddingsApiResponseProcessor
    ) {
        this.api = new ObservableEmbeddingsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest
     */
    public createEmbeddingWithHttpInfo(createEmbeddingRequest: CreateEmbeddingRequest, _options?: Configuration): Promise<HttpInfo<CreateEmbeddingResponse>> {
        const result = this.api.createEmbeddingWithHttpInfo(createEmbeddingRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest
     */
    public createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, _options?: Configuration): Promise<CreateEmbeddingResponse> {
        const result = this.api.createEmbedding(createEmbeddingRequest, _options);
        return result.toPromise();
    }


}



import { ObservableFilesApi } from './ObservableAPI';

import { FilesApiRequestFactory, FilesApiResponseProcessor} from "../apis/FilesApi";
export class PromiseFilesApi {
    private api: ObservableFilesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: FilesApiRequestFactory,
        responseProcessor?: FilesApiResponseProcessor
    ) {
        this.api = new ObservableFilesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param file The File object (not file name) to be uploaded. 
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
     */
    public createFileWithHttpInfo(file: HttpFile, purpose: string, _options?: Configuration): Promise<HttpInfo<OpenAIFile>> {
        const result = this.api.createFileWithHttpInfo(file, purpose, _options);
        return result.toPromise();
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param file The File object (not file name) to be uploaded. 
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
     */
    public createFile(file: HttpFile, purpose: string, _options?: Configuration): Promise<OpenAIFile> {
        const result = this.api.createFile(file, purpose, _options);
        return result.toPromise();
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request.
     */
    public deleteFileWithHttpInfo(fileId: string, _options?: Configuration): Promise<HttpInfo<DeleteFileResponse>> {
        const result = this.api.deleteFileWithHttpInfo(fileId, _options);
        return result.toPromise();
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request.
     */
    public deleteFile(fileId: string, _options?: Configuration): Promise<DeleteFileResponse> {
        const result = this.api.deleteFile(fileId, _options);
        return result.toPromise();
    }

    /**
     * Returns the contents of the specified file.
     * @param fileId The ID of the file to use for this request.
     */
    public downloadFileWithHttpInfo(fileId: string, _options?: Configuration): Promise<HttpInfo<string>> {
        const result = this.api.downloadFileWithHttpInfo(fileId, _options);
        return result.toPromise();
    }

    /**
     * Returns the contents of the specified file.
     * @param fileId The ID of the file to use for this request.
     */
    public downloadFile(fileId: string, _options?: Configuration): Promise<string> {
        const result = this.api.downloadFile(fileId, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param [purpose] Only return files with the given purpose.
     */
    public listFilesWithHttpInfo(purpose?: string, _options?: Configuration): Promise<HttpInfo<ListFilesResponse>> {
        const result = this.api.listFilesWithHttpInfo(purpose, _options);
        return result.toPromise();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param [purpose] Only return files with the given purpose.
     */
    public listFiles(purpose?: string, _options?: Configuration): Promise<ListFilesResponse> {
        const result = this.api.listFiles(purpose, _options);
        return result.toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request.
     */
    public retrieveFileWithHttpInfo(fileId: string, _options?: Configuration): Promise<HttpInfo<OpenAIFile>> {
        const result = this.api.retrieveFileWithHttpInfo(fileId, _options);
        return result.toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request.
     */
    public retrieveFile(fileId: string, _options?: Configuration): Promise<OpenAIFile> {
        const result = this.api.retrieveFile(fileId, _options);
        return result.toPromise();
    }


}



import { ObservableFineTuningApi } from './ObservableAPI';

import { FineTuningApiRequestFactory, FineTuningApiResponseProcessor} from "../apis/FineTuningApi";
export class PromiseFineTuningApi {
    private api: ObservableFineTuningApi

    public constructor(
        configuration: Configuration,
        requestFactory?: FineTuningApiRequestFactory,
        responseProcessor?: FineTuningApiResponseProcessor
    ) {
        this.api = new ObservableFineTuningApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
     */
    public cancelFineTuningJobWithHttpInfo(fineTuningJobId: string, _options?: Configuration): Promise<HttpInfo<FineTuningJob>> {
        const result = this.api.cancelFineTuningJobWithHttpInfo(fineTuningJobId, _options);
        return result.toPromise();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
     */
    public cancelFineTuningJob(fineTuningJobId: string, _options?: Configuration): Promise<FineTuningJob> {
        const result = this.api.cancelFineTuningJob(fineTuningJobId, _options);
        return result.toPromise();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuningJobRequest
     */
    public createFineTuningJobWithHttpInfo(createFineTuningJobRequest: CreateFineTuningJobRequest, _options?: Configuration): Promise<HttpInfo<FineTuningJob>> {
        const result = this.api.createFineTuningJobWithHttpInfo(createFineTuningJobRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuningJobRequest
     */
    public createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest, _options?: Configuration): Promise<FineTuningJob> {
        const result = this.api.createFineTuningJob(createFineTuningJobRequest, _options);
        return result.toPromise();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
     * @param [after] Identifier for the last event from the previous pagination request.
     * @param [limit] Number of events to retrieve.
     */
    public listFineTuningEventsWithHttpInfo(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Promise<HttpInfo<ListFineTuningJobEventsResponse>> {
        const result = this.api.listFineTuningEventsWithHttpInfo(fineTuningJobId, after, limit, _options);
        return result.toPromise();
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
     * @param [after] Identifier for the last event from the previous pagination request.
     * @param [limit] Number of events to retrieve.
     */
    public listFineTuningEvents(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Promise<ListFineTuningJobEventsResponse> {
        const result = this.api.listFineTuningEvents(fineTuningJobId, after, limit, _options);
        return result.toPromise();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
     * @param [after] Identifier for the last checkpoint ID from the previous pagination request.
     * @param [limit] Number of checkpoints to retrieve.
     */
    public listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Promise<HttpInfo<ListFineTuningJobCheckpointsResponse>> {
        const result = this.api.listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId, after, limit, _options);
        return result.toPromise();
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
     * @param [after] Identifier for the last checkpoint ID from the previous pagination request.
     * @param [limit] Number of checkpoints to retrieve.
     */
    public listFineTuningJobCheckpoints(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Promise<ListFineTuningJobCheckpointsResponse> {
        const result = this.api.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, _options);
        return result.toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param [after] Identifier for the last job from the previous pagination request.
     * @param [limit] Number of fine-tuning jobs to retrieve.
     */
    public listPaginatedFineTuningJobsWithHttpInfo(after?: string, limit?: number, _options?: Configuration): Promise<HttpInfo<ListPaginatedFineTuningJobsResponse>> {
        const result = this.api.listPaginatedFineTuningJobsWithHttpInfo(after, limit, _options);
        return result.toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param [after] Identifier for the last job from the previous pagination request.
     * @param [limit] Number of fine-tuning jobs to retrieve.
     */
    public listPaginatedFineTuningJobs(after?: string, limit?: number, _options?: Configuration): Promise<ListPaginatedFineTuningJobsResponse> {
        const result = this.api.listPaginatedFineTuningJobs(after, limit, _options);
        return result.toPromise();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuningJobId The ID of the fine-tuning job. 
     */
    public retrieveFineTuningJobWithHttpInfo(fineTuningJobId: string, _options?: Configuration): Promise<HttpInfo<FineTuningJob>> {
        const result = this.api.retrieveFineTuningJobWithHttpInfo(fineTuningJobId, _options);
        return result.toPromise();
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuningJobId The ID of the fine-tuning job. 
     */
    public retrieveFineTuningJob(fineTuningJobId: string, _options?: Configuration): Promise<FineTuningJob> {
        const result = this.api.retrieveFineTuningJob(fineTuningJobId, _options);
        return result.toPromise();
    }


}



import { ObservableImagesApi } from './ObservableAPI';

import { ImagesApiRequestFactory, ImagesApiResponseProcessor} from "../apis/ImagesApi";
export class PromiseImagesApi {
    private api: ObservableImagesApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ImagesApiRequestFactory,
        responseProcessor?: ImagesApiResponseProcessor
    ) {
        this.api = new ObservableImagesApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest
     */
    public createImageWithHttpInfo(createImageRequest: CreateImageRequest, _options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        const result = this.api.createImageWithHttpInfo(createImageRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest
     */
    public createImage(createImageRequest: CreateImageRequest, _options?: Configuration): Promise<ImagesResponse> {
        const result = this.api.createImage(createImageRequest, _options);
        return result.toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
     * @param [mask] An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageEditWithHttpInfo(image: HttpFile, prompt: string, mask?: HttpFile, model?: CreateImageEditRequestModel, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        const result = this.api.createImageEditWithHttpInfo(image, prompt, mask, model, n, size, responseFormat, user, _options);
        return result.toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
     * @param [mask] An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageEdit(image: HttpFile, prompt: string, mask?: HttpFile, model?: CreateImageEditRequestModel, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Promise<ImagesResponse> {
        const result = this.api.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user, _options);
        return result.toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageVariationWithHttpInfo(image: HttpFile, model?: CreateImageEditRequestModel, n?: number, responseFormat?: string, size?: string, user?: string, _options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        const result = this.api.createImageVariationWithHttpInfo(image, model, n, responseFormat, size, user, _options);
        return result.toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param [model]
     * @param [n] The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * @param [responseFormat] The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param [size] The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param [user] A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageVariation(image: HttpFile, model?: CreateImageEditRequestModel, n?: number, responseFormat?: string, size?: string, user?: string, _options?: Configuration): Promise<ImagesResponse> {
        const result = this.api.createImageVariation(image, model, n, responseFormat, size, user, _options);
        return result.toPromise();
    }


}



import { ObservableModelsApi } from './ObservableAPI';

import { ModelsApiRequestFactory, ModelsApiResponseProcessor} from "../apis/ModelsApi";
export class PromiseModelsApi {
    private api: ObservableModelsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ModelsApiRequestFactory,
        responseProcessor?: ModelsApiResponseProcessor
    ) {
        this.api = new ObservableModelsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param model The model to delete
     */
    public deleteModelWithHttpInfo(model: string, _options?: Configuration): Promise<HttpInfo<DeleteModelResponse>> {
        const result = this.api.deleteModelWithHttpInfo(model, _options);
        return result.toPromise();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param model The model to delete
     */
    public deleteModel(model: string, _options?: Configuration): Promise<DeleteModelResponse> {
        const result = this.api.deleteModel(model, _options);
        return result.toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModelsWithHttpInfo(_options?: Configuration): Promise<HttpInfo<ListModelsResponse>> {
        const result = this.api.listModelsWithHttpInfo(_options);
        return result.toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModels(_options?: Configuration): Promise<ListModelsResponse> {
        const result = this.api.listModels(_options);
        return result.toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModelWithHttpInfo(model: string, _options?: Configuration): Promise<HttpInfo<Model>> {
        const result = this.api.retrieveModelWithHttpInfo(model, _options);
        return result.toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModel(model: string, _options?: Configuration): Promise<Model> {
        const result = this.api.retrieveModel(model, _options);
        return result.toPromise();
    }


}



import { ObservableModerationsApi } from './ObservableAPI';

import { ModerationsApiRequestFactory, ModerationsApiResponseProcessor} from "../apis/ModerationsApi";
export class PromiseModerationsApi {
    private api: ObservableModerationsApi

    public constructor(
        configuration: Configuration,
        requestFactory?: ModerationsApiRequestFactory,
        responseProcessor?: ModerationsApiResponseProcessor
    ) {
        this.api = new ObservableModerationsApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Classifies if text is potentially harmful.
     * @param createModerationRequest
     */
    public createModerationWithHttpInfo(createModerationRequest: CreateModerationRequest, _options?: Configuration): Promise<HttpInfo<CreateModerationResponse>> {
        const result = this.api.createModerationWithHttpInfo(createModerationRequest, _options);
        return result.toPromise();
    }

    /**
     * Classifies if text is potentially harmful.
     * @param createModerationRequest
     */
    public createModeration(createModerationRequest: CreateModerationRequest, _options?: Configuration): Promise<CreateModerationResponse> {
        const result = this.api.createModeration(createModerationRequest, _options);
        return result.toPromise();
    }


}



