import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
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

import { AssistantsApiRequestFactory, AssistantsApiResponseProcessor} from "../apis/AssistantsApi";
export class ObservableAssistantsApi {
    private requestFactory: AssistantsApiRequestFactory;
    private responseProcessor: AssistantsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AssistantsApiRequestFactory,
        responseProcessor?: AssistantsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AssistantsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AssistantsApiResponseProcessor();
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     */
    public cancelRunWithHttpInfo(threadId: string, runId: string, _options?: Configuration): Observable<HttpInfo<RunObject>> {
        const requestContextPromise = this.requestFactory.cancelRun(threadId, runId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Cancels a run that is `in_progress`.
     * @param threadId The ID of the thread to which this run belongs.
     * @param runId The ID of the run to cancel.
     */
    public cancelRun(threadId: string, runId: string, _options?: Configuration): Observable<RunObject> {
        return this.cancelRunWithHttpInfo(threadId, runId, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Create an assistant with a model and instructions.
     * @param createAssistantRequest
     */
    public createAssistantWithHttpInfo(createAssistantRequest: CreateAssistantRequest, _options?: Configuration): Observable<HttpInfo<AssistantObject>> {
        const requestContextPromise = this.requestFactory.createAssistant(createAssistantRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create an assistant with a model and instructions.
     * @param createAssistantRequest
     */
    public createAssistant(createAssistantRequest: CreateAssistantRequest, _options?: Configuration): Observable<AssistantObject> {
        return this.createAssistantWithHttpInfo(createAssistantRequest, _options).pipe(map((apiResponse: HttpInfo<AssistantObject>) => apiResponse.data));
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param assistantId The ID of the assistant for which to create a File. 
     * @param createAssistantFileRequest
     */
    public createAssistantFileWithHttpInfo(assistantId: string, createAssistantFileRequest: CreateAssistantFileRequest, _options?: Configuration): Observable<HttpInfo<AssistantFileObject>> {
        const requestContextPromise = this.requestFactory.createAssistantFile(assistantId, createAssistantFileRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createAssistantFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
     * @param assistantId The ID of the assistant for which to create a File. 
     * @param createAssistantFileRequest
     */
    public createAssistantFile(assistantId: string, createAssistantFileRequest: CreateAssistantFileRequest, _options?: Configuration): Observable<AssistantFileObject> {
        return this.createAssistantFileWithHttpInfo(assistantId, createAssistantFileRequest, _options).pipe(map((apiResponse: HttpInfo<AssistantFileObject>) => apiResponse.data));
    }

    /**
     * Create a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param createMessageRequest
     */
    public createMessageWithHttpInfo(threadId: string, createMessageRequest: CreateMessageRequest, _options?: Configuration): Observable<HttpInfo<MessageObject>> {
        const requestContextPromise = this.requestFactory.createMessage(threadId, createMessageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to create a message for.
     * @param createMessageRequest
     */
    public createMessage(threadId: string, createMessageRequest: CreateMessageRequest, _options?: Configuration): Observable<MessageObject> {
        return this.createMessageWithHttpInfo(threadId, createMessageRequest, _options).pipe(map((apiResponse: HttpInfo<MessageObject>) => apiResponse.data));
    }

    /**
     * Create a run.
     * @param threadId The ID of the thread to run.
     * @param createRunRequest
     */
    public createRunWithHttpInfo(threadId: string, createRunRequest: CreateRunRequest, _options?: Configuration): Observable<HttpInfo<RunObject>> {
        const requestContextPromise = this.requestFactory.createRun(threadId, createRunRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a run.
     * @param threadId The ID of the thread to run.
     * @param createRunRequest
     */
    public createRun(threadId: string, createRunRequest: CreateRunRequest, _options?: Configuration): Observable<RunObject> {
        return this.createRunWithHttpInfo(threadId, createRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Create a thread.
     * @param [createThreadRequest]
     */
    public createThreadWithHttpInfo(createThreadRequest?: CreateThreadRequest, _options?: Configuration): Observable<HttpInfo<ThreadObject>> {
        const requestContextPromise = this.requestFactory.createThread(createThreadRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a thread.
     * @param [createThreadRequest]
     */
    public createThread(createThreadRequest?: CreateThreadRequest, _options?: Configuration): Observable<ThreadObject> {
        return this.createThreadWithHttpInfo(createThreadRequest, _options).pipe(map((apiResponse: HttpInfo<ThreadObject>) => apiResponse.data));
    }

    /**
     * Create a thread and run it in one request.
     * @param createThreadAndRunRequest
     */
    public createThreadAndRunWithHttpInfo(createThreadAndRunRequest: CreateThreadAndRunRequest, _options?: Configuration): Observable<HttpInfo<RunObject>> {
        const requestContextPromise = this.requestFactory.createThreadAndRun(createThreadAndRunRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createThreadAndRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Create a thread and run it in one request.
     * @param createThreadAndRunRequest
     */
    public createThreadAndRun(createThreadAndRunRequest: CreateThreadAndRunRequest, _options?: Configuration): Observable<RunObject> {
        return this.createThreadAndRunWithHttpInfo(createThreadAndRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Delete an assistant.
     * @param assistantId The ID of the assistant to delete.
     */
    public deleteAssistantWithHttpInfo(assistantId: string, _options?: Configuration): Observable<HttpInfo<DeleteAssistantResponse>> {
        const requestContextPromise = this.requestFactory.deleteAssistant(assistantId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete an assistant.
     * @param assistantId The ID of the assistant to delete.
     */
    public deleteAssistant(assistantId: string, _options?: Configuration): Observable<DeleteAssistantResponse> {
        return this.deleteAssistantWithHttpInfo(assistantId, _options).pipe(map((apiResponse: HttpInfo<DeleteAssistantResponse>) => apiResponse.data));
    }

    /**
     * Delete an assistant file.
     * @param assistantId The ID of the assistant that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public deleteAssistantFileWithHttpInfo(assistantId: string, fileId: string, _options?: Configuration): Observable<HttpInfo<DeleteAssistantFileResponse>> {
        const requestContextPromise = this.requestFactory.deleteAssistantFile(assistantId, fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteAssistantFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete an assistant file.
     * @param assistantId The ID of the assistant that the file belongs to.
     * @param fileId The ID of the file to delete.
     */
    public deleteAssistantFile(assistantId: string, fileId: string, _options?: Configuration): Observable<DeleteAssistantFileResponse> {
        return this.deleteAssistantFileWithHttpInfo(assistantId, fileId, _options).pipe(map((apiResponse: HttpInfo<DeleteAssistantFileResponse>) => apiResponse.data));
    }

    /**
     * Delete a thread.
     * @param threadId The ID of the thread to delete.
     */
    public deleteThreadWithHttpInfo(threadId: string, _options?: Configuration): Observable<HttpInfo<DeleteThreadResponse>> {
        const requestContextPromise = this.requestFactory.deleteThread(threadId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a thread.
     * @param threadId The ID of the thread to delete.
     */
    public deleteThread(threadId: string, _options?: Configuration): Observable<DeleteThreadResponse> {
        return this.deleteThreadWithHttpInfo(threadId, _options).pipe(map((apiResponse: HttpInfo<DeleteThreadResponse>) => apiResponse.data));
    }

    /**
     * Retrieves an assistant.
     * @param assistantId The ID of the assistant to retrieve.
     */
    public getAssistantWithHttpInfo(assistantId: string, _options?: Configuration): Observable<HttpInfo<AssistantObject>> {
        const requestContextPromise = this.requestFactory.getAssistant(assistantId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves an assistant.
     * @param assistantId The ID of the assistant to retrieve.
     */
    public getAssistant(assistantId: string, _options?: Configuration): Observable<AssistantObject> {
        return this.getAssistantWithHttpInfo(assistantId, _options).pipe(map((apiResponse: HttpInfo<AssistantObject>) => apiResponse.data));
    }

    /**
     * Retrieves an AssistantFile.
     * @param assistantId The ID of the assistant who the file belongs to.
     * @param fileId The ID of the file we\&#39;re getting.
     */
    public getAssistantFileWithHttpInfo(assistantId: string, fileId: string, _options?: Configuration): Observable<HttpInfo<AssistantFileObject>> {
        const requestContextPromise = this.requestFactory.getAssistantFile(assistantId, fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getAssistantFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves an AssistantFile.
     * @param assistantId The ID of the assistant who the file belongs to.
     * @param fileId The ID of the file we\&#39;re getting.
     */
    public getAssistantFile(assistantId: string, fileId: string, _options?: Configuration): Observable<AssistantFileObject> {
        return this.getAssistantFileWithHttpInfo(assistantId, fileId, _options).pipe(map((apiResponse: HttpInfo<AssistantFileObject>) => apiResponse.data));
    }

    /**
     * Retrieve a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     */
    public getMessageWithHttpInfo(threadId: string, messageId: string, _options?: Configuration): Observable<HttpInfo<MessageObject>> {
        const requestContextPromise = this.requestFactory.getMessage(threadId, messageId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieve a message.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
     * @param messageId The ID of the message to retrieve.
     */
    public getMessage(threadId: string, messageId: string, _options?: Configuration): Observable<MessageObject> {
        return this.getMessageWithHttpInfo(threadId, messageId, _options).pipe(map((apiResponse: HttpInfo<MessageObject>) => apiResponse.data));
    }

    /**
     * Retrieves a message file.
     * @param threadId The ID of the thread to which the message and File belong.
     * @param messageId The ID of the message the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public getMessageFileWithHttpInfo(threadId: string, messageId: string, fileId: string, _options?: Configuration): Observable<HttpInfo<MessageFileObject>> {
        const requestContextPromise = this.requestFactory.getMessageFile(threadId, messageId, fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getMessageFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a message file.
     * @param threadId The ID of the thread to which the message and File belong.
     * @param messageId The ID of the message the file belongs to.
     * @param fileId The ID of the file being retrieved.
     */
    public getMessageFile(threadId: string, messageId: string, fileId: string, _options?: Configuration): Observable<MessageFileObject> {
        return this.getMessageFileWithHttpInfo(threadId, messageId, fileId, _options).pipe(map((apiResponse: HttpInfo<MessageFileObject>) => apiResponse.data));
    }

    /**
     * Retrieves a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     */
    public getRunWithHttpInfo(threadId: string, runId: string, _options?: Configuration): Observable<HttpInfo<RunObject>> {
        const requestContextPromise = this.requestFactory.getRun(threadId, runId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to retrieve.
     */
    public getRun(threadId: string, runId: string, _options?: Configuration): Observable<RunObject> {
        return this.getRunWithHttpInfo(threadId, runId, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Retrieves a run step.
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     */
    public getRunStepWithHttpInfo(threadId: string, runId: string, stepId: string, _options?: Configuration): Observable<HttpInfo<RunStepObject>> {
        const requestContextPromise = this.requestFactory.getRunStep(threadId, runId, stepId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getRunStepWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a run step.
     * @param threadId The ID of the thread to which the run and run step belongs.
     * @param runId The ID of the run to which the run step belongs.
     * @param stepId The ID of the run step to retrieve.
     */
    public getRunStep(threadId: string, runId: string, stepId: string, _options?: Configuration): Observable<RunStepObject> {
        return this.getRunStepWithHttpInfo(threadId, runId, stepId, _options).pipe(map((apiResponse: HttpInfo<RunStepObject>) => apiResponse.data));
    }

    /**
     * Retrieves a thread.
     * @param threadId The ID of the thread to retrieve.
     */
    public getThreadWithHttpInfo(threadId: string, _options?: Configuration): Observable<HttpInfo<ThreadObject>> {
        const requestContextPromise = this.requestFactory.getThread(threadId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a thread.
     * @param threadId The ID of the thread to retrieve.
     */
    public getThread(threadId: string, _options?: Configuration): Observable<ThreadObject> {
        return this.getThreadWithHttpInfo(threadId, _options).pipe(map((apiResponse: HttpInfo<ThreadObject>) => apiResponse.data));
    }

    /**
     * Returns a list of assistant files.
     * @param assistantId The ID of the assistant the file belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantFilesWithHttpInfo(assistantId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<HttpInfo<ListAssistantFilesResponse>> {
        const requestContextPromise = this.requestFactory.listAssistantFiles(assistantId, limit, order, after, before, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAssistantFilesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of assistant files.
     * @param assistantId The ID of the assistant the file belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantFiles(assistantId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<ListAssistantFilesResponse> {
        return this.listAssistantFilesWithHttpInfo(assistantId, limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListAssistantFilesResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of assistants.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistantsWithHttpInfo(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<HttpInfo<ListAssistantsResponse>> {
        const requestContextPromise = this.requestFactory.listAssistants(limit, order, after, before, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listAssistantsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of assistants.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listAssistants(limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<ListAssistantsResponse> {
        return this.listAssistantsWithHttpInfo(limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListAssistantsResponse>) => apiResponse.data));
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
    public listMessageFilesWithHttpInfo(threadId: string, messageId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<HttpInfo<ListMessageFilesResponse>> {
        const requestContextPromise = this.requestFactory.listMessageFiles(threadId, messageId, limit, order, after, before, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listMessageFilesWithHttpInfo(rsp)));
            }));
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
    public listMessageFiles(threadId: string, messageId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<ListMessageFilesResponse> {
        return this.listMessageFilesWithHttpInfo(threadId, messageId, limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListMessageFilesResponse>) => apiResponse.data));
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
    public listMessagesWithHttpInfo(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, runId?: string, _options?: Configuration): Observable<HttpInfo<ListMessagesResponse>> {
        const requestContextPromise = this.requestFactory.listMessages(threadId, limit, order, after, before, runId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listMessagesWithHttpInfo(rsp)));
            }));
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
    public listMessages(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, runId?: string, _options?: Configuration): Observable<ListMessagesResponse> {
        return this.listMessagesWithHttpInfo(threadId, limit, order, after, before, runId, _options).pipe(map((apiResponse: HttpInfo<ListMessagesResponse>) => apiResponse.data));
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
    public listRunStepsWithHttpInfo(threadId: string, runId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<HttpInfo<ListRunStepsResponse>> {
        const requestContextPromise = this.requestFactory.listRunSteps(threadId, runId, limit, order, after, before, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listRunStepsWithHttpInfo(rsp)));
            }));
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
    public listRunSteps(threadId: string, runId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<ListRunStepsResponse> {
        return this.listRunStepsWithHttpInfo(threadId, runId, limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListRunStepsResponse>) => apiResponse.data));
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param threadId The ID of the thread the run belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRunsWithHttpInfo(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<HttpInfo<ListRunsResponse>> {
        const requestContextPromise = this.requestFactory.listRuns(threadId, limit, order, after, before, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listRunsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of runs belonging to a thread.
     * @param threadId The ID of the thread the run belongs to.
     * @param [limit] A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
     * @param [order] Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
     * @param [after] A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
     * @param [before] A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
     */
    public listRuns(threadId: string, limit?: number, order?: 'asc' | 'desc', after?: string, before?: string, _options?: Configuration): Observable<ListRunsResponse> {
        return this.listRunsWithHttpInfo(threadId, limit, order, after, before, _options).pipe(map((apiResponse: HttpInfo<ListRunsResponse>) => apiResponse.data));
    }

    /**
     * Modifies an assistant.
     * @param assistantId The ID of the assistant to modify.
     * @param modifyAssistantRequest
     */
    public modifyAssistantWithHttpInfo(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest, _options?: Configuration): Observable<HttpInfo<AssistantObject>> {
        const requestContextPromise = this.requestFactory.modifyAssistant(assistantId, modifyAssistantRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyAssistantWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies an assistant.
     * @param assistantId The ID of the assistant to modify.
     * @param modifyAssistantRequest
     */
    public modifyAssistant(assistantId: string, modifyAssistantRequest: ModifyAssistantRequest, _options?: Configuration): Observable<AssistantObject> {
        return this.modifyAssistantWithHttpInfo(assistantId, modifyAssistantRequest, _options).pipe(map((apiResponse: HttpInfo<AssistantObject>) => apiResponse.data));
    }

    /**
     * Modifies a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param modifyMessageRequest
     */
    public modifyMessageWithHttpInfo(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest, _options?: Configuration): Observable<HttpInfo<MessageObject>> {
        const requestContextPromise = this.requestFactory.modifyMessage(threadId, messageId, modifyMessageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyMessageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a message.
     * @param threadId The ID of the thread to which this message belongs.
     * @param messageId The ID of the message to modify.
     * @param modifyMessageRequest
     */
    public modifyMessage(threadId: string, messageId: string, modifyMessageRequest: ModifyMessageRequest, _options?: Configuration): Observable<MessageObject> {
        return this.modifyMessageWithHttpInfo(threadId, messageId, modifyMessageRequest, _options).pipe(map((apiResponse: HttpInfo<MessageObject>) => apiResponse.data));
    }

    /**
     * Modifies a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param modifyRunRequest
     */
    public modifyRunWithHttpInfo(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest, _options?: Configuration): Observable<HttpInfo<RunObject>> {
        const requestContextPromise = this.requestFactory.modifyRun(threadId, runId, modifyRunRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a run.
     * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
     * @param runId The ID of the run to modify.
     * @param modifyRunRequest
     */
    public modifyRun(threadId: string, runId: string, modifyRunRequest: ModifyRunRequest, _options?: Configuration): Observable<RunObject> {
        return this.modifyRunWithHttpInfo(threadId, runId, modifyRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

    /**
     * Modifies a thread.
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * @param modifyThreadRequest
     */
    public modifyThreadWithHttpInfo(threadId: string, modifyThreadRequest: ModifyThreadRequest, _options?: Configuration): Observable<HttpInfo<ThreadObject>> {
        const requestContextPromise = this.requestFactory.modifyThread(threadId, modifyThreadRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.modifyThreadWithHttpInfo(rsp)));
            }));
    }

    /**
     * Modifies a thread.
     * @param threadId The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
     * @param modifyThreadRequest
     */
    public modifyThread(threadId: string, modifyThreadRequest: ModifyThreadRequest, _options?: Configuration): Observable<ThreadObject> {
        return this.modifyThreadWithHttpInfo(threadId, modifyThreadRequest, _options).pipe(map((apiResponse: HttpInfo<ThreadObject>) => apiResponse.data));
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRunRequest
     */
    public submitToolOuputsToRunWithHttpInfo(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, _options?: Configuration): Observable<HttpInfo<RunObject>> {
        const requestContextPromise = this.requestFactory.submitToolOuputsToRun(threadId, runId, submitToolOutputsRunRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.submitToolOuputsToRunWithHttpInfo(rsp)));
            }));
    }

    /**
     * When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they\'re all completed. All outputs must be submitted in a single request. 
     * @param threadId The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
     * @param runId The ID of the run that requires the tool output submission.
     * @param submitToolOutputsRunRequest
     */
    public submitToolOuputsToRun(threadId: string, runId: string, submitToolOutputsRunRequest: SubmitToolOutputsRunRequest, _options?: Configuration): Observable<RunObject> {
        return this.submitToolOuputsToRunWithHttpInfo(threadId, runId, submitToolOutputsRunRequest, _options).pipe(map((apiResponse: HttpInfo<RunObject>) => apiResponse.data));
    }

}

import { AudioApiRequestFactory, AudioApiResponseProcessor} from "../apis/AudioApi";
export class ObservableAudioApi {
    private requestFactory: AudioApiRequestFactory;
    private responseProcessor: AudioApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: AudioApiRequestFactory,
        responseProcessor?: AudioApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new AudioApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new AudioApiResponseProcessor();
    }

    /**
     * Generates audio from the input text.
     * @param createSpeechRequest
     */
    public createSpeechWithHttpInfo(createSpeechRequest: CreateSpeechRequest, _options?: Configuration): Observable<HttpInfo<HttpFile>> {
        const requestContextPromise = this.requestFactory.createSpeech(createSpeechRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createSpeechWithHttpInfo(rsp)));
            }));
    }

    /**
     * Generates audio from the input text.
     * @param createSpeechRequest
     */
    public createSpeech(createSpeechRequest: CreateSpeechRequest, _options?: Configuration): Observable<HttpFile> {
        return this.createSpeechWithHttpInfo(createSpeechRequest, _options).pipe(map((apiResponse: HttpInfo<HttpFile>) => apiResponse.data));
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
    public createTranscriptionWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, _options?: Configuration): Observable<HttpInfo<CreateTranscription200Response>> {
        const requestContextPromise = this.requestFactory.createTranscription(file, model, language, prompt, responseFormat, temperature, timestampGranularities, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTranscriptionWithHttpInfo(rsp)));
            }));
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
    public createTranscription(file: HttpFile, model: CreateTranscriptionRequestModel, language?: string, prompt?: string, responseFormat?: string, temperature?: number, timestampGranularities?: Array<string>, _options?: Configuration): Observable<CreateTranscription200Response> {
        return this.createTranscriptionWithHttpInfo(file, model, language, prompt, responseFormat, temperature, timestampGranularities, _options).pipe(map((apiResponse: HttpInfo<CreateTranscription200Response>) => apiResponse.data));
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param [responseFormat] The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslationWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, _options?: Configuration): Observable<HttpInfo<CreateTranslation200Response>> {
        const requestContextPromise = this.requestFactory.createTranslation(file, model, prompt, responseFormat, temperature, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTranslationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: flac, mp3, mp4, mpeg, mpga, m4a, ogg, wav, or webm. 
     * @param model
     * @param [prompt] An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param [responseFormat] The format of the transcript output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
     * @param [temperature] The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslation(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, _options?: Configuration): Observable<CreateTranslation200Response> {
        return this.createTranslationWithHttpInfo(file, model, prompt, responseFormat, temperature, _options).pipe(map((apiResponse: HttpInfo<CreateTranslation200Response>) => apiResponse.data));
    }

}

import { ChatApiRequestFactory, ChatApiResponseProcessor} from "../apis/ChatApi";
export class ObservableChatApi {
    private requestFactory: ChatApiRequestFactory;
    private responseProcessor: ChatApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ChatApiRequestFactory,
        responseProcessor?: ChatApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ChatApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ChatApiResponseProcessor();
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param createChatCompletionRequest
     */
    public createChatCompletionWithHttpInfo(createChatCompletionRequest: CreateChatCompletionRequest, _options?: Configuration): Observable<HttpInfo<CreateChatCompletionResponse>> {
        const requestContextPromise = this.requestFactory.createChatCompletion(createChatCompletionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createChatCompletionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param createChatCompletionRequest
     */
    public createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest, _options?: Configuration): Observable<CreateChatCompletionResponse> {
        return this.createChatCompletionWithHttpInfo(createChatCompletionRequest, _options).pipe(map((apiResponse: HttpInfo<CreateChatCompletionResponse>) => apiResponse.data));
    }

}

import { CompletionsApiRequestFactory, CompletionsApiResponseProcessor} from "../apis/CompletionsApi";
export class ObservableCompletionsApi {
    private requestFactory: CompletionsApiRequestFactory;
    private responseProcessor: CompletionsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: CompletionsApiRequestFactory,
        responseProcessor?: CompletionsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new CompletionsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new CompletionsApiResponseProcessor();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest
     */
    public createCompletionWithHttpInfo(createCompletionRequest: CreateCompletionRequest, _options?: Configuration): Observable<HttpInfo<CreateCompletionResponse>> {
        const requestContextPromise = this.requestFactory.createCompletion(createCompletionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createCompletionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest
     */
    public createCompletion(createCompletionRequest: CreateCompletionRequest, _options?: Configuration): Observable<CreateCompletionResponse> {
        return this.createCompletionWithHttpInfo(createCompletionRequest, _options).pipe(map((apiResponse: HttpInfo<CreateCompletionResponse>) => apiResponse.data));
    }

}

import { EmbeddingsApiRequestFactory, EmbeddingsApiResponseProcessor} from "../apis/EmbeddingsApi";
export class ObservableEmbeddingsApi {
    private requestFactory: EmbeddingsApiRequestFactory;
    private responseProcessor: EmbeddingsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: EmbeddingsApiRequestFactory,
        responseProcessor?: EmbeddingsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new EmbeddingsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new EmbeddingsApiResponseProcessor();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest
     */
    public createEmbeddingWithHttpInfo(createEmbeddingRequest: CreateEmbeddingRequest, _options?: Configuration): Observable<HttpInfo<CreateEmbeddingResponse>> {
        const requestContextPromise = this.requestFactory.createEmbedding(createEmbeddingRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEmbeddingWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest
     */
    public createEmbedding(createEmbeddingRequest: CreateEmbeddingRequest, _options?: Configuration): Observable<CreateEmbeddingResponse> {
        return this.createEmbeddingWithHttpInfo(createEmbeddingRequest, _options).pipe(map((apiResponse: HttpInfo<CreateEmbeddingResponse>) => apiResponse.data));
    }

}

import { FilesApiRequestFactory, FilesApiResponseProcessor} from "../apis/FilesApi";
export class ObservableFilesApi {
    private requestFactory: FilesApiRequestFactory;
    private responseProcessor: FilesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: FilesApiRequestFactory,
        responseProcessor?: FilesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new FilesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new FilesApiResponseProcessor();
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param file The File object (not file name) to be uploaded. 
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
     */
    public createFileWithHttpInfo(file: HttpFile, purpose: string, _options?: Configuration): Observable<HttpInfo<OpenAIFile>> {
        const requestContextPromise = this.requestFactory.createFile(file, purpose, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Upload a file that can be used across various endpoints. The size of all the files uploaded by one organization can be up to 100 GB.  The size of individual files can be a maximum of 512 MB or 2 million tokens for Assistants. See the [Assistants Tools guide](/docs/assistants/tools) to learn more about the types of files supported. The Fine-tuning API only supports `.jsonl` files.  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
     * @param file The File object (not file name) to be uploaded. 
     * @param purpose The intended purpose of the uploaded file.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tuning) and \\\&quot;assistants\\\&quot; for [Assistants](/docs/api-reference/assistants) and [Messages](/docs/api-reference/messages). This allows us to validate the format of the uploaded file is correct for fine-tuning. 
     */
    public createFile(file: HttpFile, purpose: string, _options?: Configuration): Observable<OpenAIFile> {
        return this.createFileWithHttpInfo(file, purpose, _options).pipe(map((apiResponse: HttpInfo<OpenAIFile>) => apiResponse.data));
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request.
     */
    public deleteFileWithHttpInfo(fileId: string, _options?: Configuration): Observable<HttpInfo<DeleteFileResponse>> {
        const requestContextPromise = this.requestFactory.deleteFile(fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request.
     */
    public deleteFile(fileId: string, _options?: Configuration): Observable<DeleteFileResponse> {
        return this.deleteFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<DeleteFileResponse>) => apiResponse.data));
    }

    /**
     * Returns the contents of the specified file.
     * @param fileId The ID of the file to use for this request.
     */
    public downloadFileWithHttpInfo(fileId: string, _options?: Configuration): Observable<HttpInfo<string>> {
        const requestContextPromise = this.requestFactory.downloadFile(fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.downloadFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns the contents of the specified file.
     * @param fileId The ID of the file to use for this request.
     */
    public downloadFile(fileId: string, _options?: Configuration): Observable<string> {
        return this.downloadFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<string>) => apiResponse.data));
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param [purpose] Only return files with the given purpose.
     */
    public listFilesWithHttpInfo(purpose?: string, _options?: Configuration): Observable<HttpInfo<ListFilesResponse>> {
        const requestContextPromise = this.requestFactory.listFiles(purpose, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFilesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param [purpose] Only return files with the given purpose.
     */
    public listFiles(purpose?: string, _options?: Configuration): Observable<ListFilesResponse> {
        return this.listFilesWithHttpInfo(purpose, _options).pipe(map((apiResponse: HttpInfo<ListFilesResponse>) => apiResponse.data));
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request.
     */
    public retrieveFileWithHttpInfo(fileId: string, _options?: Configuration): Observable<HttpInfo<OpenAIFile>> {
        const requestContextPromise = this.requestFactory.retrieveFile(fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request.
     */
    public retrieveFile(fileId: string, _options?: Configuration): Observable<OpenAIFile> {
        return this.retrieveFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<OpenAIFile>) => apiResponse.data));
    }

}

import { FineTuningApiRequestFactory, FineTuningApiResponseProcessor} from "../apis/FineTuningApi";
export class ObservableFineTuningApi {
    private requestFactory: FineTuningApiRequestFactory;
    private responseProcessor: FineTuningApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: FineTuningApiRequestFactory,
        responseProcessor?: FineTuningApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new FineTuningApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new FineTuningApiResponseProcessor();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
     */
    public cancelFineTuningJobWithHttpInfo(fineTuningJobId: string, _options?: Configuration): Observable<HttpInfo<FineTuningJob>> {
        const requestContextPromise = this.requestFactory.cancelFineTuningJob(fineTuningJobId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelFineTuningJobWithHttpInfo(rsp)));
            }));
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuningJobId The ID of the fine-tuning job to cancel. 
     */
    public cancelFineTuningJob(fineTuningJobId: string, _options?: Configuration): Observable<FineTuningJob> {
        return this.cancelFineTuningJobWithHttpInfo(fineTuningJobId, _options).pipe(map((apiResponse: HttpInfo<FineTuningJob>) => apiResponse.data));
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuningJobRequest
     */
    public createFineTuningJobWithHttpInfo(createFineTuningJobRequest: CreateFineTuningJobRequest, _options?: Configuration): Observable<HttpInfo<FineTuningJob>> {
        const requestContextPromise = this.requestFactory.createFineTuningJob(createFineTuningJobRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createFineTuningJobWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuningJobRequest
     */
    public createFineTuningJob(createFineTuningJobRequest: CreateFineTuningJobRequest, _options?: Configuration): Observable<FineTuningJob> {
        return this.createFineTuningJobWithHttpInfo(createFineTuningJobRequest, _options).pipe(map((apiResponse: HttpInfo<FineTuningJob>) => apiResponse.data));
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
     * @param [after] Identifier for the last event from the previous pagination request.
     * @param [limit] Number of events to retrieve.
     */
    public listFineTuningEventsWithHttpInfo(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Observable<HttpInfo<ListFineTuningJobEventsResponse>> {
        const requestContextPromise = this.requestFactory.listFineTuningEvents(fineTuningJobId, after, limit, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFineTuningEventsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get status updates for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get events for. 
     * @param [after] Identifier for the last event from the previous pagination request.
     * @param [limit] Number of events to retrieve.
     */
    public listFineTuningEvents(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Observable<ListFineTuningJobEventsResponse> {
        return this.listFineTuningEventsWithHttpInfo(fineTuningJobId, after, limit, _options).pipe(map((apiResponse: HttpInfo<ListFineTuningJobEventsResponse>) => apiResponse.data));
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
     * @param [after] Identifier for the last checkpoint ID from the previous pagination request.
     * @param [limit] Number of checkpoints to retrieve.
     */
    public listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Observable<HttpInfo<ListFineTuningJobCheckpointsResponse>> {
        const requestContextPromise = this.requestFactory.listFineTuningJobCheckpoints(fineTuningJobId, after, limit, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFineTuningJobCheckpointsWithHttpInfo(rsp)));
            }));
    }

    /**
     * List checkpoints for a fine-tuning job. 
     * @param fineTuningJobId The ID of the fine-tuning job to get checkpoints for. 
     * @param [after] Identifier for the last checkpoint ID from the previous pagination request.
     * @param [limit] Number of checkpoints to retrieve.
     */
    public listFineTuningJobCheckpoints(fineTuningJobId: string, after?: string, limit?: number, _options?: Configuration): Observable<ListFineTuningJobCheckpointsResponse> {
        return this.listFineTuningJobCheckpointsWithHttpInfo(fineTuningJobId, after, limit, _options).pipe(map((apiResponse: HttpInfo<ListFineTuningJobCheckpointsResponse>) => apiResponse.data));
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param [after] Identifier for the last job from the previous pagination request.
     * @param [limit] Number of fine-tuning jobs to retrieve.
     */
    public listPaginatedFineTuningJobsWithHttpInfo(after?: string, limit?: number, _options?: Configuration): Observable<HttpInfo<ListPaginatedFineTuningJobsResponse>> {
        const requestContextPromise = this.requestFactory.listPaginatedFineTuningJobs(after, limit, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listPaginatedFineTuningJobsWithHttpInfo(rsp)));
            }));
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param [after] Identifier for the last job from the previous pagination request.
     * @param [limit] Number of fine-tuning jobs to retrieve.
     */
    public listPaginatedFineTuningJobs(after?: string, limit?: number, _options?: Configuration): Observable<ListPaginatedFineTuningJobsResponse> {
        return this.listPaginatedFineTuningJobsWithHttpInfo(after, limit, _options).pipe(map((apiResponse: HttpInfo<ListPaginatedFineTuningJobsResponse>) => apiResponse.data));
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuningJobId The ID of the fine-tuning job. 
     */
    public retrieveFineTuningJobWithHttpInfo(fineTuningJobId: string, _options?: Configuration): Observable<HttpInfo<FineTuningJob>> {
        const requestContextPromise = this.requestFactory.retrieveFineTuningJob(fineTuningJobId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveFineTuningJobWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuningJobId The ID of the fine-tuning job. 
     */
    public retrieveFineTuningJob(fineTuningJobId: string, _options?: Configuration): Observable<FineTuningJob> {
        return this.retrieveFineTuningJobWithHttpInfo(fineTuningJobId, _options).pipe(map((apiResponse: HttpInfo<FineTuningJob>) => apiResponse.data));
    }

}

import { ImagesApiRequestFactory, ImagesApiResponseProcessor} from "../apis/ImagesApi";
export class ObservableImagesApi {
    private requestFactory: ImagesApiRequestFactory;
    private responseProcessor: ImagesApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ImagesApiRequestFactory,
        responseProcessor?: ImagesApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ImagesApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ImagesApiResponseProcessor();
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest
     */
    public createImageWithHttpInfo(createImageRequest: CreateImageRequest, _options?: Configuration): Observable<HttpInfo<ImagesResponse>> {
        const requestContextPromise = this.requestFactory.createImage(createImageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest
     */
    public createImage(createImageRequest: CreateImageRequest, _options?: Configuration): Observable<ImagesResponse> {
        return this.createImageWithHttpInfo(createImageRequest, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
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
    public createImageEditWithHttpInfo(image: HttpFile, prompt: string, mask?: HttpFile, model?: CreateImageEditRequestModel, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Observable<HttpInfo<ImagesResponse>> {
        const requestContextPromise = this.requestFactory.createImageEdit(image, prompt, mask, model, n, size, responseFormat, user, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageEditWithHttpInfo(rsp)));
            }));
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
    public createImageEdit(image: HttpFile, prompt: string, mask?: HttpFile, model?: CreateImageEditRequestModel, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Observable<ImagesResponse> {
        return this.createImageEditWithHttpInfo(image, prompt, mask, model, n, size, responseFormat, user, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
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
    public createImageVariationWithHttpInfo(image: HttpFile, model?: CreateImageEditRequestModel, n?: number, responseFormat?: string, size?: string, user?: string, _options?: Configuration): Observable<HttpInfo<ImagesResponse>> {
        const requestContextPromise = this.requestFactory.createImageVariation(image, model, n, responseFormat, size, user, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageVariationWithHttpInfo(rsp)));
            }));
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
    public createImageVariation(image: HttpFile, model?: CreateImageEditRequestModel, n?: number, responseFormat?: string, size?: string, user?: string, _options?: Configuration): Observable<ImagesResponse> {
        return this.createImageVariationWithHttpInfo(image, model, n, responseFormat, size, user, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
    }

}

import { ModelsApiRequestFactory, ModelsApiResponseProcessor} from "../apis/ModelsApi";
export class ObservableModelsApi {
    private requestFactory: ModelsApiRequestFactory;
    private responseProcessor: ModelsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ModelsApiRequestFactory,
        responseProcessor?: ModelsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ModelsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ModelsApiResponseProcessor();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param model The model to delete
     */
    public deleteModelWithHttpInfo(model: string, _options?: Configuration): Observable<HttpInfo<DeleteModelResponse>> {
        const requestContextPromise = this.requestFactory.deleteModel(model, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteModelWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization to delete a model.
     * @param model The model to delete
     */
    public deleteModel(model: string, _options?: Configuration): Observable<DeleteModelResponse> {
        return this.deleteModelWithHttpInfo(model, _options).pipe(map((apiResponse: HttpInfo<DeleteModelResponse>) => apiResponse.data));
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModelsWithHttpInfo(_options?: Configuration): Observable<HttpInfo<ListModelsResponse>> {
        const requestContextPromise = this.requestFactory.listModels(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listModelsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModels(_options?: Configuration): Observable<ListModelsResponse> {
        return this.listModelsWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<ListModelsResponse>) => apiResponse.data));
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModelWithHttpInfo(model: string, _options?: Configuration): Observable<HttpInfo<Model>> {
        const requestContextPromise = this.requestFactory.retrieveModel(model, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveModelWithHttpInfo(rsp)));
            }));
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModel(model: string, _options?: Configuration): Observable<Model> {
        return this.retrieveModelWithHttpInfo(model, _options).pipe(map((apiResponse: HttpInfo<Model>) => apiResponse.data));
    }

}

import { ModerationsApiRequestFactory, ModerationsApiResponseProcessor} from "../apis/ModerationsApi";
export class ObservableModerationsApi {
    private requestFactory: ModerationsApiRequestFactory;
    private responseProcessor: ModerationsApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: ModerationsApiRequestFactory,
        responseProcessor?: ModerationsApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new ModerationsApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new ModerationsApiResponseProcessor();
    }

    /**
     * Classifies if text is potentially harmful.
     * @param createModerationRequest
     */
    public createModerationWithHttpInfo(createModerationRequest: CreateModerationRequest, _options?: Configuration): Observable<HttpInfo<CreateModerationResponse>> {
        const requestContextPromise = this.requestFactory.createModeration(createModerationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (const middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (const middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createModerationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Classifies if text is potentially harmful.
     * @param createModerationRequest
     */
    public createModeration(createModerationRequest: CreateModerationRequest, _options?: Configuration): Observable<CreateModerationResponse> {
        return this.createModerationWithHttpInfo(createModerationRequest, _options).pipe(map((apiResponse: HttpInfo<CreateModerationResponse>) => apiResponse.data));
    }

}
