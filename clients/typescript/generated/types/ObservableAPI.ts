import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { ChatCompletionFunctions } from '../models/ChatCompletionFunctions';
import { ChatCompletionRequestMessage } from '../models/ChatCompletionRequestMessage';
import { ChatCompletionRequestMessageFunctionCall } from '../models/ChatCompletionRequestMessageFunctionCall';
import { ChatCompletionResponseMessage } from '../models/ChatCompletionResponseMessage';
import { ChatCompletionStreamResponseDelta } from '../models/ChatCompletionStreamResponseDelta';
import { CreateChatCompletionRequest } from '../models/CreateChatCompletionRequest';
import { CreateChatCompletionRequestFunctionCall } from '../models/CreateChatCompletionRequestFunctionCall';
import { CreateChatCompletionRequestFunctionCallOneOf } from '../models/CreateChatCompletionRequestFunctionCallOneOf';
import { CreateChatCompletionRequestModel } from '../models/CreateChatCompletionRequestModel';
import { CreateChatCompletionRequestStop } from '../models/CreateChatCompletionRequestStop';
import { CreateChatCompletionResponse } from '../models/CreateChatCompletionResponse';
import { CreateChatCompletionResponseChoicesInner } from '../models/CreateChatCompletionResponseChoicesInner';
import { CreateChatCompletionStreamResponse } from '../models/CreateChatCompletionStreamResponse';
import { CreateChatCompletionStreamResponseChoicesInner } from '../models/CreateChatCompletionStreamResponseChoicesInner';
import { CreateCompletionRequest } from '../models/CreateCompletionRequest';
import { CreateCompletionRequestModel } from '../models/CreateCompletionRequestModel';
import { CreateCompletionRequestPrompt } from '../models/CreateCompletionRequestPrompt';
import { CreateCompletionRequestStop } from '../models/CreateCompletionRequestStop';
import { CreateCompletionResponse } from '../models/CreateCompletionResponse';
import { CreateCompletionResponseChoicesInner } from '../models/CreateCompletionResponseChoicesInner';
import { CreateCompletionResponseChoicesInnerLogprobs } from '../models/CreateCompletionResponseChoicesInnerLogprobs';
import { CreateCompletionResponseUsage } from '../models/CreateCompletionResponseUsage';
import { CreateEditRequest } from '../models/CreateEditRequest';
import { CreateEditRequestModel } from '../models/CreateEditRequestModel';
import { CreateEditResponse } from '../models/CreateEditResponse';
import { CreateEditResponseChoicesInner } from '../models/CreateEditResponseChoicesInner';
import { CreateEmbeddingRequest } from '../models/CreateEmbeddingRequest';
import { CreateEmbeddingRequestInput } from '../models/CreateEmbeddingRequestInput';
import { CreateEmbeddingRequestModel } from '../models/CreateEmbeddingRequestModel';
import { CreateEmbeddingResponse } from '../models/CreateEmbeddingResponse';
import { CreateEmbeddingResponseDataInner } from '../models/CreateEmbeddingResponseDataInner';
import { CreateEmbeddingResponseUsage } from '../models/CreateEmbeddingResponseUsage';
import { CreateFineTuneRequest } from '../models/CreateFineTuneRequest';
import { CreateFineTuneRequestModel } from '../models/CreateFineTuneRequestModel';
import { CreateImageRequest } from '../models/CreateImageRequest';
import { CreateModerationRequest } from '../models/CreateModerationRequest';
import { CreateModerationRequestInput } from '../models/CreateModerationRequestInput';
import { CreateModerationRequestModel } from '../models/CreateModerationRequestModel';
import { CreateModerationResponse } from '../models/CreateModerationResponse';
import { CreateModerationResponseResultsInner } from '../models/CreateModerationResponseResultsInner';
import { CreateModerationResponseResultsInnerCategories } from '../models/CreateModerationResponseResultsInnerCategories';
import { CreateModerationResponseResultsInnerCategoryScores } from '../models/CreateModerationResponseResultsInnerCategoryScores';
import { CreateTranscriptionRequestModel } from '../models/CreateTranscriptionRequestModel';
import { CreateTranscriptionResponse } from '../models/CreateTranscriptionResponse';
import { CreateTranslationResponse } from '../models/CreateTranslationResponse';
import { DeleteFileResponse } from '../models/DeleteFileResponse';
import { DeleteModelResponse } from '../models/DeleteModelResponse';
import { ErrorResponse } from '../models/ErrorResponse';
import { FineTune } from '../models/FineTune';
import { FineTuneEvent } from '../models/FineTuneEvent';
import { ImagesResponse } from '../models/ImagesResponse';
import { ImagesResponseDataInner } from '../models/ImagesResponseDataInner';
import { ListFilesResponse } from '../models/ListFilesResponse';
import { ListFineTuneEventsResponse } from '../models/ListFineTuneEventsResponse';
import { ListFineTunesResponse } from '../models/ListFineTunesResponse';
import { ListModelsResponse } from '../models/ListModelsResponse';
import { Model } from '../models/Model';
import { ModelError } from '../models/ModelError';
import { OpenAIFile } from '../models/OpenAIFile';

import { OpenAIApiRequestFactory, OpenAIApiResponseProcessor} from "../apis/OpenAIApi";
export class ObservableOpenAIApi {
    private requestFactory: OpenAIApiRequestFactory;
    private responseProcessor: OpenAIApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: OpenAIApiRequestFactory,
        responseProcessor?: OpenAIApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new OpenAIApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new OpenAIApiResponseProcessor();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuneId The ID of the fine-tune job to cancel 
     */
    public cancelFineTuneWithHttpInfo(fineTuneId: string, _options?: Configuration): Observable<HttpInfo<FineTune>> {
        const requestContextPromise = this.requestFactory.cancelFineTune(fineTuneId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.cancelFineTuneWithHttpInfo(rsp)));
            }));
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param fineTuneId The ID of the fine-tune job to cancel 
     */
    public cancelFineTune(fineTuneId: string, _options?: Configuration): Observable<FineTune> {
        return this.cancelFineTuneWithHttpInfo(fineTuneId, _options).pipe(map((apiResponse: HttpInfo<FineTune>) => apiResponse.data));
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param createChatCompletionRequest 
     */
    public createChatCompletionWithHttpInfo(createChatCompletionRequest: CreateChatCompletionRequest, _options?: Configuration): Observable<HttpInfo<CreateChatCompletionResponse>> {
        const requestContextPromise = this.requestFactory.createChatCompletion(createChatCompletionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
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

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param createCompletionRequest 
     */
    public createCompletionWithHttpInfo(createCompletionRequest: CreateCompletionRequest, _options?: Configuration): Observable<HttpInfo<CreateCompletionResponse>> {
        const requestContextPromise = this.requestFactory.createCompletion(createCompletionRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
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

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param createEditRequest 
     */
    public createEditWithHttpInfo(createEditRequest: CreateEditRequest, _options?: Configuration): Observable<HttpInfo<CreateEditResponse>> {
        const requestContextPromise = this.requestFactory.createEdit(createEditRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createEditWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param createEditRequest 
     */
    public createEdit(createEditRequest: CreateEditRequest, _options?: Configuration): Observable<CreateEditResponse> {
        return this.createEditWithHttpInfo(createEditRequest, _options).pipe(map((apiResponse: HttpInfo<CreateEditResponse>) => apiResponse.data));
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param createEmbeddingRequest 
     */
    public createEmbeddingWithHttpInfo(createEmbeddingRequest: CreateEmbeddingRequest, _options?: Configuration): Observable<HttpInfo<CreateEmbeddingResponse>> {
        const requestContextPromise = this.requestFactory.createEmbedding(createEmbeddingRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
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

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     * @param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
     * @param purpose The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
     */
    public createFileWithHttpInfo(file: HttpFile, purpose: string, _options?: Configuration): Observable<HttpInfo<OpenAIFile>> {
        const requestContextPromise = this.requestFactory.createFile(file, purpose, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     * @param file Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
     * @param purpose The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
     */
    public createFile(file: HttpFile, purpose: string, _options?: Configuration): Observable<OpenAIFile> {
        return this.createFileWithHttpInfo(file, purpose, _options).pipe(map((apiResponse: HttpInfo<OpenAIFile>) => apiResponse.data));
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuneRequest 
     */
    public createFineTuneWithHttpInfo(createFineTuneRequest: CreateFineTuneRequest, _options?: Configuration): Observable<HttpInfo<FineTune>> {
        const requestContextPromise = this.requestFactory.createFineTune(createFineTuneRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createFineTuneWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param createFineTuneRequest 
     */
    public createFineTune(createFineTuneRequest: CreateFineTuneRequest, _options?: Configuration): Observable<FineTune> {
        return this.createFineTuneWithHttpInfo(createFineTuneRequest, _options).pipe(map((apiResponse: HttpInfo<FineTune>) => apiResponse.data));
    }

    /**
     * Creates an image given a prompt.
     * @param createImageRequest 
     */
    public createImageWithHttpInfo(createImageRequest: CreateImageRequest, _options?: Configuration): Observable<HttpInfo<ImagesResponse>> {
        const requestContextPromise = this.requestFactory.createImage(createImageRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
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
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @param n The number of images to generate. Must be between 1 and 10.
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageEditWithHttpInfo(image: HttpFile, prompt: string, mask?: HttpFile, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Observable<HttpInfo<ImagesResponse>> {
        const requestContextPromise = this.requestFactory.createImageEdit(image, prompt, mask, n, size, responseFormat, user, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageEditWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param image The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters.
     * @param mask An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @param n The number of images to generate. Must be between 1 and 10.
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageEdit(image: HttpFile, prompt: string, mask?: HttpFile, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Observable<ImagesResponse> {
        return this.createImageEditWithHttpInfo(image, prompt, mask, n, size, responseFormat, user, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
    }

    /**
     * Creates a variation of a given image.
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param n The number of images to generate. Must be between 1 and 10.
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageVariationWithHttpInfo(image: HttpFile, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Observable<HttpInfo<ImagesResponse>> {
        const requestContextPromise = this.requestFactory.createImageVariation(image, n, size, responseFormat, user, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createImageVariationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Creates a variation of a given image.
     * @param image The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @param n The number of images to generate. Must be between 1 and 10.
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     */
    public createImageVariation(image: HttpFile, n?: number, size?: string, responseFormat?: string, user?: string, _options?: Configuration): Observable<ImagesResponse> {
        return this.createImageVariationWithHttpInfo(image, n, size, responseFormat, user, _options).pipe(map((apiResponse: HttpInfo<ImagesResponse>) => apiResponse.data));
    }

    /**
     * Classifies if text violates OpenAI\'s Content Policy
     * @param createModerationRequest 
     */
    public createModerationWithHttpInfo(createModerationRequest: CreateModerationRequest, _options?: Configuration): Observable<HttpInfo<CreateModerationResponse>> {
        const requestContextPromise = this.requestFactory.createModeration(createModerationRequest, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createModerationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Classifies if text violates OpenAI\'s Content Policy
     * @param createModerationRequest 
     */
    public createModeration(createModerationRequest: CreateModerationRequest, _options?: Configuration): Observable<CreateModerationResponse> {
        return this.createModerationWithHttpInfo(createModerationRequest, _options).pipe(map((apiResponse: HttpInfo<CreateModerationResponse>) => apiResponse.data));
    }

    /**
     * Transcribes audio into the input language.
     * @param file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     */
    public createTranscriptionWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, language?: string, _options?: Configuration): Observable<HttpInfo<CreateTranscriptionResponse>> {
        const requestContextPromise = this.requestFactory.createTranscription(file, model, prompt, responseFormat, temperature, language, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTranscriptionWithHttpInfo(rsp)));
            }));
    }

    /**
     * Transcribes audio into the input language.
     * @param file The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @param language The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     */
    public createTranscription(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, language?: string, _options?: Configuration): Observable<CreateTranscriptionResponse> {
        return this.createTranscriptionWithHttpInfo(file, model, prompt, responseFormat, temperature, language, _options).pipe(map((apiResponse: HttpInfo<CreateTranscriptionResponse>) => apiResponse.data));
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslationWithHttpInfo(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, _options?: Configuration): Observable<HttpInfo<CreateTranslationResponse>> {
        const requestContextPromise = this.requestFactory.createTranslation(file, model, prompt, responseFormat, temperature, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.createTranslationWithHttpInfo(rsp)));
            }));
    }

    /**
     * Translates audio into English.
     * @param file The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
     * @param model 
     * @param prompt An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @param responseFormat The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
     * @param temperature The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     */
    public createTranslation(file: HttpFile, model: CreateTranscriptionRequestModel, prompt?: string, responseFormat?: string, temperature?: number, _options?: Configuration): Observable<CreateTranslationResponse> {
        return this.createTranslationWithHttpInfo(file, model, prompt, responseFormat, temperature, _options).pipe(map((apiResponse: HttpInfo<CreateTranslationResponse>) => apiResponse.data));
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request
     */
    public deleteFileWithHttpInfo(fileId: string, _options?: Configuration): Observable<HttpInfo<DeleteFileResponse>> {
        const requestContextPromise = this.requestFactory.deleteFile(fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a file.
     * @param fileId The ID of the file to use for this request
     */
    public deleteFile(fileId: string, _options?: Configuration): Observable<DeleteFileResponse> {
        return this.deleteFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<DeleteFileResponse>) => apiResponse.data));
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param model The model to delete
     */
    public deleteModelWithHttpInfo(model: string, _options?: Configuration): Observable<HttpInfo<DeleteModelResponse>> {
        const requestContextPromise = this.requestFactory.deleteModel(model, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.deleteModelWithHttpInfo(rsp)));
            }));
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param model The model to delete
     */
    public deleteModel(model: string, _options?: Configuration): Observable<DeleteModelResponse> {
        return this.deleteModelWithHttpInfo(model, _options).pipe(map((apiResponse: HttpInfo<DeleteModelResponse>) => apiResponse.data));
    }

    /**
     * Returns the contents of the specified file
     * @param fileId The ID of the file to use for this request
     */
    public downloadFileWithHttpInfo(fileId: string, _options?: Configuration): Observable<HttpInfo<string>> {
        const requestContextPromise = this.requestFactory.downloadFile(fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.downloadFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns the contents of the specified file
     * @param fileId The ID of the file to use for this request
     */
    public downloadFile(fileId: string, _options?: Configuration): Observable<string> {
        return this.downloadFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<string>) => apiResponse.data));
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     */
    public listFilesWithHttpInfo(_options?: Configuration): Observable<HttpInfo<ListFilesResponse>> {
        const requestContextPromise = this.requestFactory.listFiles(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFilesWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     */
    public listFiles(_options?: Configuration): Observable<ListFilesResponse> {
        return this.listFilesWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<ListFilesResponse>) => apiResponse.data));
    }

    /**
     * Get fine-grained status updates for a fine-tune job. 
     * @param fineTuneId The ID of the fine-tune job to get events for. 
     * @param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
     */
    public listFineTuneEventsWithHttpInfo(fineTuneId: string, stream?: boolean, _options?: Configuration): Observable<HttpInfo<ListFineTuneEventsResponse>> {
        const requestContextPromise = this.requestFactory.listFineTuneEvents(fineTuneId, stream, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFineTuneEventsWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get fine-grained status updates for a fine-tune job. 
     * @param fineTuneId The ID of the fine-tune job to get events for. 
     * @param stream Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
     */
    public listFineTuneEvents(fineTuneId: string, stream?: boolean, _options?: Configuration): Observable<ListFineTuneEventsResponse> {
        return this.listFineTuneEventsWithHttpInfo(fineTuneId, stream, _options).pipe(map((apiResponse: HttpInfo<ListFineTuneEventsResponse>) => apiResponse.data));
    }

    /**
     * List your organization\'s fine-tuning jobs 
     */
    public listFineTunesWithHttpInfo(_options?: Configuration): Observable<HttpInfo<ListFineTunesResponse>> {
        const requestContextPromise = this.requestFactory.listFineTunes(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.listFineTunesWithHttpInfo(rsp)));
            }));
    }

    /**
     * List your organization\'s fine-tuning jobs 
     */
    public listFineTunes(_options?: Configuration): Observable<ListFineTunesResponse> {
        return this.listFineTunesWithHttpInfo(_options).pipe(map((apiResponse: HttpInfo<ListFineTunesResponse>) => apiResponse.data));
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    public listModelsWithHttpInfo(_options?: Configuration): Observable<HttpInfo<ListModelsResponse>> {
        const requestContextPromise = this.requestFactory.listModels(_options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
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
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request
     */
    public retrieveFileWithHttpInfo(fileId: string, _options?: Configuration): Observable<HttpInfo<OpenAIFile>> {
        const requestContextPromise = this.requestFactory.retrieveFile(fileId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveFileWithHttpInfo(rsp)));
            }));
    }

    /**
     * Returns information about a specific file.
     * @param fileId The ID of the file to use for this request
     */
    public retrieveFile(fileId: string, _options?: Configuration): Observable<OpenAIFile> {
        return this.retrieveFileWithHttpInfo(fileId, _options).pipe(map((apiResponse: HttpInfo<OpenAIFile>) => apiResponse.data));
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuneId The ID of the fine-tune job 
     */
    public retrieveFineTuneWithHttpInfo(fineTuneId: string, _options?: Configuration): Observable<HttpInfo<FineTune>> {
        const requestContextPromise = this.requestFactory.retrieveFineTune(fineTuneId, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.retrieveFineTuneWithHttpInfo(rsp)));
            }));
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param fineTuneId The ID of the fine-tune job 
     */
    public retrieveFineTune(fineTuneId: string, _options?: Configuration): Observable<FineTune> {
        return this.retrieveFineTuneWithHttpInfo(fineTuneId, _options).pipe(map((apiResponse: HttpInfo<FineTune>) => apiResponse.data));
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param model The ID of the model to use for this request
     */
    public retrieveModelWithHttpInfo(model: string, _options?: Configuration): Observable<HttpInfo<Model>> {
        const requestContextPromise = this.requestFactory.retrieveModel(model, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
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
