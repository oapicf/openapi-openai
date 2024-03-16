import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

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

import { ObservableOpenAIApi } from "./ObservableAPI";
import { OpenAIApiRequestFactory, OpenAIApiResponseProcessor} from "../apis/OpenAIApi";

export interface OpenAIApiCancelFineTuneRequest {
    /**
     * The ID of the fine-tune job to cancel 
     * @type string
     * @memberof OpenAIApicancelFineTune
     */
    fineTuneId: string
}

export interface OpenAIApiCreateChatCompletionRequest {
    /**
     * 
     * @type CreateChatCompletionRequest
     * @memberof OpenAIApicreateChatCompletion
     */
    createChatCompletionRequest: CreateChatCompletionRequest
}

export interface OpenAIApiCreateCompletionRequest {
    /**
     * 
     * @type CreateCompletionRequest
     * @memberof OpenAIApicreateCompletion
     */
    createCompletionRequest: CreateCompletionRequest
}

export interface OpenAIApiCreateEditRequest {
    /**
     * 
     * @type CreateEditRequest
     * @memberof OpenAIApicreateEdit
     */
    createEditRequest: CreateEditRequest
}

export interface OpenAIApiCreateEmbeddingRequest {
    /**
     * 
     * @type CreateEmbeddingRequest
     * @memberof OpenAIApicreateEmbedding
     */
    createEmbeddingRequest: CreateEmbeddingRequest
}

export interface OpenAIApiCreateFileRequest {
    /**
     * Name of the [JSON Lines](https://jsonlines.readthedocs.io/en/latest/) file to be uploaded.  If the &#x60;purpose&#x60; is set to \\\&quot;fine-tune\\\&quot;, each line is a JSON record with \\\&quot;prompt\\\&quot; and \\\&quot;completion\\\&quot; fields representing your [training examples](/docs/guides/fine-tuning/prepare-training-data). 
     * @type HttpFile
     * @memberof OpenAIApicreateFile
     */
    file: HttpFile
    /**
     * The intended purpose of the uploaded documents.  Use \\\&quot;fine-tune\\\&quot; for [Fine-tuning](/docs/api-reference/fine-tunes). This allows us to validate the format of the uploaded file. 
     * @type string
     * @memberof OpenAIApicreateFile
     */
    purpose: string
}

export interface OpenAIApiCreateFineTuneRequest {
    /**
     * 
     * @type CreateFineTuneRequest
     * @memberof OpenAIApicreateFineTune
     */
    createFineTuneRequest: CreateFineTuneRequest
}

export interface OpenAIApiCreateImageRequest {
    /**
     * 
     * @type CreateImageRequest
     * @memberof OpenAIApicreateImage
     */
    createImageRequest: CreateImageRequest
}

export interface OpenAIApiCreateImageEditRequest {
    /**
     * The image to edit. Must be a valid PNG file, less than 4MB, and square. If mask is not provided, image must have transparency, which will be used as the mask.
     * @type HttpFile
     * @memberof OpenAIApicreateImageEdit
     */
    image: HttpFile
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters.
     * @type string
     * @memberof OpenAIApicreateImageEdit
     */
    prompt: string
    /**
     * An additional image whose fully transparent areas (e.g. where alpha is zero) indicate where &#x60;image&#x60; should be edited. Must be a valid PNG file, less than 4MB, and have the same dimensions as &#x60;image&#x60;.
     * @type HttpFile
     * @memberof OpenAIApicreateImageEdit
     */
    mask?: HttpFile
    /**
     * The number of images to generate. Must be between 1 and 10.
     * @type number
     * @memberof OpenAIApicreateImageEdit
     */
    n?: number
    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @type string
     * @memberof OpenAIApicreateImageEdit
     */
    size?: string
    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @type string
     * @memberof OpenAIApicreateImageEdit
     */
    responseFormat?: string
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @type string
     * @memberof OpenAIApicreateImageEdit
     */
    user?: string
}

export interface OpenAIApiCreateImageVariationRequest {
    /**
     * The image to use as the basis for the variation(s). Must be a valid PNG file, less than 4MB, and square.
     * @type HttpFile
     * @memberof OpenAIApicreateImageVariation
     */
    image: HttpFile
    /**
     * The number of images to generate. Must be between 1 and 10.
     * @type number
     * @memberof OpenAIApicreateImageVariation
     */
    n?: number
    /**
     * The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60;.
     * @type string
     * @memberof OpenAIApicreateImageVariation
     */
    size?: string
    /**
     * The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;.
     * @type string
     * @memberof OpenAIApicreateImageVariation
     */
    responseFormat?: string
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @type string
     * @memberof OpenAIApicreateImageVariation
     */
    user?: string
}

export interface OpenAIApiCreateModerationRequest {
    /**
     * 
     * @type CreateModerationRequest
     * @memberof OpenAIApicreateModeration
     */
    createModerationRequest: CreateModerationRequest
}

export interface OpenAIApiCreateTranscriptionRequest {
    /**
     * The audio file object (not file name) to transcribe, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
     * @type HttpFile
     * @memberof OpenAIApicreateTranscription
     */
    file: HttpFile
    /**
     * 
     * @type CreateTranscriptionRequestModel
     * @memberof OpenAIApicreateTranscription
     */
    model: CreateTranscriptionRequestModel
    /**
     * An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should match the audio language. 
     * @type string
     * @memberof OpenAIApicreateTranscription
     */
    prompt?: string
    /**
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
     * @type string
     * @memberof OpenAIApicreateTranscription
     */
    responseFormat?: string
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @type number
     * @memberof OpenAIApicreateTranscription
     */
    temperature?: number
    /**
     * The language of the input audio. Supplying the input language in [ISO-639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) format will improve accuracy and latency. 
     * @type string
     * @memberof OpenAIApicreateTranscription
     */
    language?: string
}

export interface OpenAIApiCreateTranslationRequest {
    /**
     * The audio file object (not file name) translate, in one of these formats: mp3, mp4, mpeg, mpga, m4a, wav, or webm. 
     * @type HttpFile
     * @memberof OpenAIApicreateTranslation
     */
    file: HttpFile
    /**
     * 
     * @type CreateTranscriptionRequestModel
     * @memberof OpenAIApicreateTranslation
     */
    model: CreateTranscriptionRequestModel
    /**
     * An optional text to guide the model\\\&#39;s style or continue a previous audio segment. The [prompt](/docs/guides/speech-to-text/prompting) should be in English. 
     * @type string
     * @memberof OpenAIApicreateTranslation
     */
    prompt?: string
    /**
     * The format of the transcript output, in one of these options: json, text, srt, verbose_json, or vtt. 
     * @type string
     * @memberof OpenAIApicreateTranslation
     */
    responseFormat?: string
    /**
     * The sampling temperature, between 0 and 1. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. If set to 0, the model will use [log probability](https://en.wikipedia.org/wiki/Log_probability) to automatically increase the temperature until certain thresholds are hit. 
     * @type number
     * @memberof OpenAIApicreateTranslation
     */
    temperature?: number
}

export interface OpenAIApiDeleteFileRequest {
    /**
     * The ID of the file to use for this request
     * @type string
     * @memberof OpenAIApideleteFile
     */
    fileId: string
}

export interface OpenAIApiDeleteModelRequest {
    /**
     * The model to delete
     * @type string
     * @memberof OpenAIApideleteModel
     */
    model: string
}

export interface OpenAIApiDownloadFileRequest {
    /**
     * The ID of the file to use for this request
     * @type string
     * @memberof OpenAIApidownloadFile
     */
    fileId: string
}

export interface OpenAIApiListFilesRequest {
}

export interface OpenAIApiListFineTuneEventsRequest {
    /**
     * The ID of the fine-tune job to get events for. 
     * @type string
     * @memberof OpenAIApilistFineTuneEvents
     */
    fineTuneId: string
    /**
     * Whether to stream events for the fine-tune job. If set to true, events will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available. The stream will terminate with a &#x60;data: [DONE]&#x60; message when the job is finished (succeeded, cancelled, or failed).  If set to false, only events generated so far will be returned. 
     * @type boolean
     * @memberof OpenAIApilistFineTuneEvents
     */
    stream?: boolean
}

export interface OpenAIApiListFineTunesRequest {
}

export interface OpenAIApiListModelsRequest {
}

export interface OpenAIApiRetrieveFileRequest {
    /**
     * The ID of the file to use for this request
     * @type string
     * @memberof OpenAIApiretrieveFile
     */
    fileId: string
}

export interface OpenAIApiRetrieveFineTuneRequest {
    /**
     * The ID of the fine-tune job 
     * @type string
     * @memberof OpenAIApiretrieveFineTune
     */
    fineTuneId: string
}

export interface OpenAIApiRetrieveModelRequest {
    /**
     * The ID of the model to use for this request
     * @type string
     * @memberof OpenAIApiretrieveModel
     */
    model: string
}

export class ObjectOpenAIApi {
    private api: ObservableOpenAIApi

    public constructor(configuration: Configuration, requestFactory?: OpenAIApiRequestFactory, responseProcessor?: OpenAIApiResponseProcessor) {
        this.api = new ObservableOpenAIApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param param the request object
     */
    public cancelFineTuneWithHttpInfo(param: OpenAIApiCancelFineTuneRequest, options?: Configuration): Promise<HttpInfo<FineTune>> {
        return this.api.cancelFineTuneWithHttpInfo(param.fineTuneId,  options).toPromise();
    }

    /**
     * Immediately cancel a fine-tune job. 
     * @param param the request object
     */
    public cancelFineTune(param: OpenAIApiCancelFineTuneRequest, options?: Configuration): Promise<FineTune> {
        return this.api.cancelFineTune(param.fineTuneId,  options).toPromise();
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param param the request object
     */
    public createChatCompletionWithHttpInfo(param: OpenAIApiCreateChatCompletionRequest, options?: Configuration): Promise<HttpInfo<CreateChatCompletionResponse>> {
        return this.api.createChatCompletionWithHttpInfo(param.createChatCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a model response for the given chat conversation.
     * @param param the request object
     */
    public createChatCompletion(param: OpenAIApiCreateChatCompletionRequest, options?: Configuration): Promise<CreateChatCompletionResponse> {
        return this.api.createChatCompletion(param.createChatCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param param the request object
     */
    public createCompletionWithHttpInfo(param: OpenAIApiCreateCompletionRequest, options?: Configuration): Promise<HttpInfo<CreateCompletionResponse>> {
        return this.api.createCompletionWithHttpInfo(param.createCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a completion for the provided prompt and parameters.
     * @param param the request object
     */
    public createCompletion(param: OpenAIApiCreateCompletionRequest, options?: Configuration): Promise<CreateCompletionResponse> {
        return this.api.createCompletion(param.createCompletionRequest,  options).toPromise();
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param param the request object
     */
    public createEditWithHttpInfo(param: OpenAIApiCreateEditRequest, options?: Configuration): Promise<HttpInfo<CreateEditResponse>> {
        return this.api.createEditWithHttpInfo(param.createEditRequest,  options).toPromise();
    }

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     * @param param the request object
     */
    public createEdit(param: OpenAIApiCreateEditRequest, options?: Configuration): Promise<CreateEditResponse> {
        return this.api.createEdit(param.createEditRequest,  options).toPromise();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param param the request object
     */
    public createEmbeddingWithHttpInfo(param: OpenAIApiCreateEmbeddingRequest, options?: Configuration): Promise<HttpInfo<CreateEmbeddingResponse>> {
        return this.api.createEmbeddingWithHttpInfo(param.createEmbeddingRequest,  options).toPromise();
    }

    /**
     * Creates an embedding vector representing the input text.
     * @param param the request object
     */
    public createEmbedding(param: OpenAIApiCreateEmbeddingRequest, options?: Configuration): Promise<CreateEmbeddingResponse> {
        return this.api.createEmbedding(param.createEmbeddingRequest,  options).toPromise();
    }

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     * @param param the request object
     */
    public createFileWithHttpInfo(param: OpenAIApiCreateFileRequest, options?: Configuration): Promise<HttpInfo<OpenAIFile>> {
        return this.api.createFileWithHttpInfo(param.file, param.purpose,  options).toPromise();
    }

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     * @param param the request object
     */
    public createFile(param: OpenAIApiCreateFileRequest, options?: Configuration): Promise<OpenAIFile> {
        return this.api.createFile(param.file, param.purpose,  options).toPromise();
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public createFineTuneWithHttpInfo(param: OpenAIApiCreateFineTuneRequest, options?: Configuration): Promise<HttpInfo<FineTune>> {
        return this.api.createFineTuneWithHttpInfo(param.createFineTuneRequest,  options).toPromise();
    }

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public createFineTune(param: OpenAIApiCreateFineTuneRequest, options?: Configuration): Promise<FineTune> {
        return this.api.createFineTune(param.createFineTuneRequest,  options).toPromise();
    }

    /**
     * Creates an image given a prompt.
     * @param param the request object
     */
    public createImageWithHttpInfo(param: OpenAIApiCreateImageRequest, options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageWithHttpInfo(param.createImageRequest,  options).toPromise();
    }

    /**
     * Creates an image given a prompt.
     * @param param the request object
     */
    public createImage(param: OpenAIApiCreateImageRequest, options?: Configuration): Promise<ImagesResponse> {
        return this.api.createImage(param.createImageRequest,  options).toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param param the request object
     */
    public createImageEditWithHttpInfo(param: OpenAIApiCreateImageEditRequest, options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageEditWithHttpInfo(param.image, param.prompt, param.mask, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates an edited or extended image given an original image and a prompt.
     * @param param the request object
     */
    public createImageEdit(param: OpenAIApiCreateImageEditRequest, options?: Configuration): Promise<ImagesResponse> {
        return this.api.createImageEdit(param.image, param.prompt, param.mask, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param param the request object
     */
    public createImageVariationWithHttpInfo(param: OpenAIApiCreateImageVariationRequest, options?: Configuration): Promise<HttpInfo<ImagesResponse>> {
        return this.api.createImageVariationWithHttpInfo(param.image, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Creates a variation of a given image.
     * @param param the request object
     */
    public createImageVariation(param: OpenAIApiCreateImageVariationRequest, options?: Configuration): Promise<ImagesResponse> {
        return this.api.createImageVariation(param.image, param.n, param.size, param.responseFormat, param.user,  options).toPromise();
    }

    /**
     * Classifies if text violates OpenAI\'s Content Policy
     * @param param the request object
     */
    public createModerationWithHttpInfo(param: OpenAIApiCreateModerationRequest, options?: Configuration): Promise<HttpInfo<CreateModerationResponse>> {
        return this.api.createModerationWithHttpInfo(param.createModerationRequest,  options).toPromise();
    }

    /**
     * Classifies if text violates OpenAI\'s Content Policy
     * @param param the request object
     */
    public createModeration(param: OpenAIApiCreateModerationRequest, options?: Configuration): Promise<CreateModerationResponse> {
        return this.api.createModeration(param.createModerationRequest,  options).toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param param the request object
     */
    public createTranscriptionWithHttpInfo(param: OpenAIApiCreateTranscriptionRequest, options?: Configuration): Promise<HttpInfo<CreateTranscriptionResponse>> {
        return this.api.createTranscriptionWithHttpInfo(param.file, param.model, param.prompt, param.responseFormat, param.temperature, param.language,  options).toPromise();
    }

    /**
     * Transcribes audio into the input language.
     * @param param the request object
     */
    public createTranscription(param: OpenAIApiCreateTranscriptionRequest, options?: Configuration): Promise<CreateTranscriptionResponse> {
        return this.api.createTranscription(param.file, param.model, param.prompt, param.responseFormat, param.temperature, param.language,  options).toPromise();
    }

    /**
     * Translates audio into English.
     * @param param the request object
     */
    public createTranslationWithHttpInfo(param: OpenAIApiCreateTranslationRequest, options?: Configuration): Promise<HttpInfo<CreateTranslationResponse>> {
        return this.api.createTranslationWithHttpInfo(param.file, param.model, param.prompt, param.responseFormat, param.temperature,  options).toPromise();
    }

    /**
     * Translates audio into English.
     * @param param the request object
     */
    public createTranslation(param: OpenAIApiCreateTranslationRequest, options?: Configuration): Promise<CreateTranslationResponse> {
        return this.api.createTranslation(param.file, param.model, param.prompt, param.responseFormat, param.temperature,  options).toPromise();
    }

    /**
     * Delete a file.
     * @param param the request object
     */
    public deleteFileWithHttpInfo(param: OpenAIApiDeleteFileRequest, options?: Configuration): Promise<HttpInfo<DeleteFileResponse>> {
        return this.api.deleteFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Delete a file.
     * @param param the request object
     */
    public deleteFile(param: OpenAIApiDeleteFileRequest, options?: Configuration): Promise<DeleteFileResponse> {
        return this.api.deleteFile(param.fileId,  options).toPromise();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param param the request object
     */
    public deleteModelWithHttpInfo(param: OpenAIApiDeleteModelRequest, options?: Configuration): Promise<HttpInfo<DeleteModelResponse>> {
        return this.api.deleteModelWithHttpInfo(param.model,  options).toPromise();
    }

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     * @param param the request object
     */
    public deleteModel(param: OpenAIApiDeleteModelRequest, options?: Configuration): Promise<DeleteModelResponse> {
        return this.api.deleteModel(param.model,  options).toPromise();
    }

    /**
     * Returns the contents of the specified file
     * @param param the request object
     */
    public downloadFileWithHttpInfo(param: OpenAIApiDownloadFileRequest, options?: Configuration): Promise<HttpInfo<string>> {
        return this.api.downloadFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Returns the contents of the specified file
     * @param param the request object
     */
    public downloadFile(param: OpenAIApiDownloadFileRequest, options?: Configuration): Promise<string> {
        return this.api.downloadFile(param.fileId,  options).toPromise();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param param the request object
     */
    public listFilesWithHttpInfo(param: OpenAIApiListFilesRequest = {}, options?: Configuration): Promise<HttpInfo<ListFilesResponse>> {
        return this.api.listFilesWithHttpInfo( options).toPromise();
    }

    /**
     * Returns a list of files that belong to the user\'s organization.
     * @param param the request object
     */
    public listFiles(param: OpenAIApiListFilesRequest = {}, options?: Configuration): Promise<ListFilesResponse> {
        return this.api.listFiles( options).toPromise();
    }

    /**
     * Get fine-grained status updates for a fine-tune job. 
     * @param param the request object
     */
    public listFineTuneEventsWithHttpInfo(param: OpenAIApiListFineTuneEventsRequest, options?: Configuration): Promise<HttpInfo<ListFineTuneEventsResponse>> {
        return this.api.listFineTuneEventsWithHttpInfo(param.fineTuneId, param.stream,  options).toPromise();
    }

    /**
     * Get fine-grained status updates for a fine-tune job. 
     * @param param the request object
     */
    public listFineTuneEvents(param: OpenAIApiListFineTuneEventsRequest, options?: Configuration): Promise<ListFineTuneEventsResponse> {
        return this.api.listFineTuneEvents(param.fineTuneId, param.stream,  options).toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param param the request object
     */
    public listFineTunesWithHttpInfo(param: OpenAIApiListFineTunesRequest = {}, options?: Configuration): Promise<HttpInfo<ListFineTunesResponse>> {
        return this.api.listFineTunesWithHttpInfo( options).toPromise();
    }

    /**
     * List your organization\'s fine-tuning jobs 
     * @param param the request object
     */
    public listFineTunes(param: OpenAIApiListFineTunesRequest = {}, options?: Configuration): Promise<ListFineTunesResponse> {
        return this.api.listFineTunes( options).toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param param the request object
     */
    public listModelsWithHttpInfo(param: OpenAIApiListModelsRequest = {}, options?: Configuration): Promise<HttpInfo<ListModelsResponse>> {
        return this.api.listModelsWithHttpInfo( options).toPromise();
    }

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     * @param param the request object
     */
    public listModels(param: OpenAIApiListModelsRequest = {}, options?: Configuration): Promise<ListModelsResponse> {
        return this.api.listModels( options).toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param param the request object
     */
    public retrieveFileWithHttpInfo(param: OpenAIApiRetrieveFileRequest, options?: Configuration): Promise<HttpInfo<OpenAIFile>> {
        return this.api.retrieveFileWithHttpInfo(param.fileId,  options).toPromise();
    }

    /**
     * Returns information about a specific file.
     * @param param the request object
     */
    public retrieveFile(param: OpenAIApiRetrieveFileRequest, options?: Configuration): Promise<OpenAIFile> {
        return this.api.retrieveFile(param.fileId,  options).toPromise();
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public retrieveFineTuneWithHttpInfo(param: OpenAIApiRetrieveFineTuneRequest, options?: Configuration): Promise<HttpInfo<FineTune>> {
        return this.api.retrieveFineTuneWithHttpInfo(param.fineTuneId,  options).toPromise();
    }

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     * @param param the request object
     */
    public retrieveFineTune(param: OpenAIApiRetrieveFineTuneRequest, options?: Configuration): Promise<FineTune> {
        return this.api.retrieveFineTune(param.fineTuneId,  options).toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param param the request object
     */
    public retrieveModelWithHttpInfo(param: OpenAIApiRetrieveModelRequest, options?: Configuration): Promise<HttpInfo<Model>> {
        return this.api.retrieveModelWithHttpInfo(param.model,  options).toPromise();
    }

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     * @param param the request object
     */
    public retrieveModel(param: OpenAIApiRetrieveModelRequest, options?: Configuration): Promise<Model> {
        return this.api.retrieveModel(param.model,  options).toPromise();
    }

}
