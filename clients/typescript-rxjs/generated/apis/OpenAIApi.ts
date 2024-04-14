// tslint:disable
/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type { Observable } from 'rxjs';
import type { AjaxResponse } from 'rxjs/ajax';
import { BaseAPI, throwIfNullOrUndefined, encodeURI } from '../runtime';
import type { OperationOpts, HttpHeaders, HttpQuery } from '../runtime';
import type {
    CreateChatCompletionRequest,
    CreateChatCompletionResponse,
    CreateCompletionRequest,
    CreateCompletionResponse,
    CreateEditRequest,
    CreateEditResponse,
    CreateEmbeddingRequest,
    CreateEmbeddingResponse,
    CreateFineTuneRequest,
    CreateImageRequest,
    CreateModerationRequest,
    CreateModerationResponse,
    CreateTranscriptionRequestModel,
    CreateTranscriptionResponse,
    CreateTranslationResponse,
    DeleteFileResponse,
    DeleteModelResponse,
    FineTune,
    ImagesResponse,
    ListFilesResponse,
    ListFineTuneEventsResponse,
    ListFineTunesResponse,
    ListModelsResponse,
    Model,
    OpenAIFile,
} from '../models';

export interface CancelFineTuneRequest {
    fineTuneId: string;
}

export interface CreateChatCompletionRequest {
    createChatCompletionRequest: CreateChatCompletionRequest;
}

export interface CreateCompletionRequest {
    createCompletionRequest: CreateCompletionRequest;
}

export interface CreateEditRequest {
    createEditRequest: CreateEditRequest;
}

export interface CreateEmbeddingRequest {
    createEmbeddingRequest: CreateEmbeddingRequest;
}

export interface CreateFileRequest {
    file: Blob;
    purpose: string;
}

export interface CreateFineTuneRequest {
    createFineTuneRequest: CreateFineTuneRequest;
}

export interface CreateImageRequest {
    createImageRequest: CreateImageRequest;
}

export interface CreateImageEditRequest {
    image: Blob;
    prompt: string;
    mask?: Blob;
    n?: number | null;
    size?: CreateImageEditSizeEnum;
    responseFormat?: CreateImageEditResponseFormatEnum;
    user?: string;
}

export interface CreateImageVariationRequest {
    image: Blob;
    n?: number | null;
    size?: CreateImageVariationSizeEnum;
    responseFormat?: CreateImageVariationResponseFormatEnum;
    user?: string;
}

export interface CreateModerationRequest {
    createModerationRequest: CreateModerationRequest;
}

export interface CreateTranscriptionRequest {
    file: Blob;
    model: CreateTranscriptionRequestModel;
    prompt?: string;
    responseFormat?: string;
    temperature?: number;
    language?: string;
}

export interface CreateTranslationRequest {
    file: Blob;
    model: CreateTranscriptionRequestModel;
    prompt?: string;
    responseFormat?: string;
    temperature?: number;
}

export interface DeleteFileRequest {
    fileId: string;
}

export interface DeleteModelRequest {
    model: string;
}

export interface DownloadFileRequest {
    fileId: string;
}

export interface ListFineTuneEventsRequest {
    fineTuneId: string;
    stream?: boolean;
}

export interface RetrieveFileRequest {
    fileId: string;
}

export interface RetrieveFineTuneRequest {
    fineTuneId: string;
}

export interface RetrieveModelRequest {
    model: string;
}

/**
 * no description
 */
export class OpenAIApi extends BaseAPI {

    /**
     * Immediately cancel a fine-tune job. 
     */
    cancelFineTune({ fineTuneId }: CancelFineTuneRequest): Observable<FineTune>
    cancelFineTune({ fineTuneId }: CancelFineTuneRequest, opts?: OperationOpts): Observable<AjaxResponse<FineTune>>
    cancelFineTune({ fineTuneId }: CancelFineTuneRequest, opts?: OperationOpts): Observable<FineTune | AjaxResponse<FineTune>> {
        throwIfNullOrUndefined(fineTuneId, 'fineTuneId', 'cancelFineTune');

        return this.request<FineTune>({
            url: '/fine-tunes/{fine_tune_id}/cancel'.replace('{fine_tune_id}', encodeURI(fineTuneId)),
            method: 'POST',
        }, opts?.responseOpts);
    };

    /**
     * Creates a model response for the given chat conversation.
     */
    createChatCompletion({ createChatCompletionRequest }: CreateChatCompletionRequest): Observable<CreateChatCompletionResponse>
    createChatCompletion({ createChatCompletionRequest }: CreateChatCompletionRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateChatCompletionResponse>>
    createChatCompletion({ createChatCompletionRequest }: CreateChatCompletionRequest, opts?: OperationOpts): Observable<CreateChatCompletionResponse | AjaxResponse<CreateChatCompletionResponse>> {
        throwIfNullOrUndefined(createChatCompletionRequest, 'createChatCompletionRequest', 'createChatCompletion');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<CreateChatCompletionResponse>({
            url: '/chat/completions',
            method: 'POST',
            headers,
            body: createChatCompletionRequest,
        }, opts?.responseOpts);
    };

    /**
     * Creates a completion for the provided prompt and parameters.
     */
    createCompletion({ createCompletionRequest }: CreateCompletionRequest): Observable<CreateCompletionResponse>
    createCompletion({ createCompletionRequest }: CreateCompletionRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateCompletionResponse>>
    createCompletion({ createCompletionRequest }: CreateCompletionRequest, opts?: OperationOpts): Observable<CreateCompletionResponse | AjaxResponse<CreateCompletionResponse>> {
        throwIfNullOrUndefined(createCompletionRequest, 'createCompletionRequest', 'createCompletion');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<CreateCompletionResponse>({
            url: '/completions',
            method: 'POST',
            headers,
            body: createCompletionRequest,
        }, opts?.responseOpts);
    };

    /**
     * Creates a new edit for the provided input, instruction, and parameters.
     */
    createEdit({ createEditRequest }: CreateEditRequest): Observable<CreateEditResponse>
    createEdit({ createEditRequest }: CreateEditRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateEditResponse>>
    createEdit({ createEditRequest }: CreateEditRequest, opts?: OperationOpts): Observable<CreateEditResponse | AjaxResponse<CreateEditResponse>> {
        throwIfNullOrUndefined(createEditRequest, 'createEditRequest', 'createEdit');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<CreateEditResponse>({
            url: '/edits',
            method: 'POST',
            headers,
            body: createEditRequest,
        }, opts?.responseOpts);
    };

    /**
     * Creates an embedding vector representing the input text.
     */
    createEmbedding({ createEmbeddingRequest }: CreateEmbeddingRequest): Observable<CreateEmbeddingResponse>
    createEmbedding({ createEmbeddingRequest }: CreateEmbeddingRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateEmbeddingResponse>>
    createEmbedding({ createEmbeddingRequest }: CreateEmbeddingRequest, opts?: OperationOpts): Observable<CreateEmbeddingResponse | AjaxResponse<CreateEmbeddingResponse>> {
        throwIfNullOrUndefined(createEmbeddingRequest, 'createEmbeddingRequest', 'createEmbedding');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<CreateEmbeddingResponse>({
            url: '/embeddings',
            method: 'POST',
            headers,
            body: createEmbeddingRequest,
        }, opts?.responseOpts);
    };

    /**
     * Upload a file that contains document(s) to be used across various endpoints/features. Currently, the size of all the files uploaded by one organization can be up to 1 GB. Please contact us if you need to increase the storage limit. 
     */
    createFile({ file, purpose }: CreateFileRequest): Observable<OpenAIFile>
    createFile({ file, purpose }: CreateFileRequest, opts?: OperationOpts): Observable<AjaxResponse<OpenAIFile>>
    createFile({ file, purpose }: CreateFileRequest, opts?: OperationOpts): Observable<OpenAIFile | AjaxResponse<OpenAIFile>> {
        throwIfNullOrUndefined(file, 'file', 'createFile');
        throwIfNullOrUndefined(purpose, 'purpose', 'createFile');

        const formData = new FormData();
        if (file !== undefined) { formData.append('file', file as any); }
        if (purpose !== undefined) { formData.append('purpose', purpose as any); }

        return this.request<OpenAIFile>({
            url: '/files',
            method: 'POST',
            body: formData,
        }, opts?.responseOpts);
    };

    /**
     * Creates a job that fine-tunes a specified model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     */
    createFineTune({ createFineTuneRequest }: CreateFineTuneRequest): Observable<FineTune>
    createFineTune({ createFineTuneRequest }: CreateFineTuneRequest, opts?: OperationOpts): Observable<AjaxResponse<FineTune>>
    createFineTune({ createFineTuneRequest }: CreateFineTuneRequest, opts?: OperationOpts): Observable<FineTune | AjaxResponse<FineTune>> {
        throwIfNullOrUndefined(createFineTuneRequest, 'createFineTuneRequest', 'createFineTune');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<FineTune>({
            url: '/fine-tunes',
            method: 'POST',
            headers,
            body: createFineTuneRequest,
        }, opts?.responseOpts);
    };

    /**
     * Creates an image given a prompt.
     */
    createImage({ createImageRequest }: CreateImageRequest): Observable<ImagesResponse>
    createImage({ createImageRequest }: CreateImageRequest, opts?: OperationOpts): Observable<AjaxResponse<ImagesResponse>>
    createImage({ createImageRequest }: CreateImageRequest, opts?: OperationOpts): Observable<ImagesResponse | AjaxResponse<ImagesResponse>> {
        throwIfNullOrUndefined(createImageRequest, 'createImageRequest', 'createImage');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<ImagesResponse>({
            url: '/images/generations',
            method: 'POST',
            headers,
            body: createImageRequest,
        }, opts?.responseOpts);
    };

    /**
     * Creates an edited or extended image given an original image and a prompt.
     */
    createImageEdit({ image, prompt, mask, n, size, responseFormat, user }: CreateImageEditRequest): Observable<ImagesResponse>
    createImageEdit({ image, prompt, mask, n, size, responseFormat, user }: CreateImageEditRequest, opts?: OperationOpts): Observable<AjaxResponse<ImagesResponse>>
    createImageEdit({ image, prompt, mask, n, size, responseFormat, user }: CreateImageEditRequest, opts?: OperationOpts): Observable<ImagesResponse | AjaxResponse<ImagesResponse>> {
        throwIfNullOrUndefined(image, 'image', 'createImageEdit');
        throwIfNullOrUndefined(prompt, 'prompt', 'createImageEdit');

        const formData = new FormData();
        if (image !== undefined) { formData.append('image', image as any); }
        if (mask !== undefined) { formData.append('mask', mask as any); }
        if (prompt !== undefined) { formData.append('prompt', prompt as any); }
        if (n !== undefined) { formData.append('n', n as any); }
        if (size !== undefined) { formData.append('size', size as any); }
        if (responseFormat !== undefined) { formData.append('response_format', responseFormat as any); }
        if (user !== undefined) { formData.append('user', user as any); }

        return this.request<ImagesResponse>({
            url: '/images/edits',
            method: 'POST',
            body: formData,
        }, opts?.responseOpts);
    };

    /**
     * Creates a variation of a given image.
     */
    createImageVariation({ image, n, size, responseFormat, user }: CreateImageVariationRequest): Observable<ImagesResponse>
    createImageVariation({ image, n, size, responseFormat, user }: CreateImageVariationRequest, opts?: OperationOpts): Observable<AjaxResponse<ImagesResponse>>
    createImageVariation({ image, n, size, responseFormat, user }: CreateImageVariationRequest, opts?: OperationOpts): Observable<ImagesResponse | AjaxResponse<ImagesResponse>> {
        throwIfNullOrUndefined(image, 'image', 'createImageVariation');

        const formData = new FormData();
        if (image !== undefined) { formData.append('image', image as any); }
        if (n !== undefined) { formData.append('n', n as any); }
        if (size !== undefined) { formData.append('size', size as any); }
        if (responseFormat !== undefined) { formData.append('response_format', responseFormat as any); }
        if (user !== undefined) { formData.append('user', user as any); }

        return this.request<ImagesResponse>({
            url: '/images/variations',
            method: 'POST',
            body: formData,
        }, opts?.responseOpts);
    };

    /**
     * Classifies if text violates OpenAI\'s Content Policy
     */
    createModeration({ createModerationRequest }: CreateModerationRequest): Observable<CreateModerationResponse>
    createModeration({ createModerationRequest }: CreateModerationRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateModerationResponse>>
    createModeration({ createModerationRequest }: CreateModerationRequest, opts?: OperationOpts): Observable<CreateModerationResponse | AjaxResponse<CreateModerationResponse>> {
        throwIfNullOrUndefined(createModerationRequest, 'createModerationRequest', 'createModeration');

        const headers: HttpHeaders = {
            'Content-Type': 'application/json',
        };

        return this.request<CreateModerationResponse>({
            url: '/moderations',
            method: 'POST',
            headers,
            body: createModerationRequest,
        }, opts?.responseOpts);
    };

    /**
     * Transcribes audio into the input language.
     */
    createTranscription({ file, model, prompt, responseFormat, temperature, language }: CreateTranscriptionRequest): Observable<CreateTranscriptionResponse>
    createTranscription({ file, model, prompt, responseFormat, temperature, language }: CreateTranscriptionRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateTranscriptionResponse>>
    createTranscription({ file, model, prompt, responseFormat, temperature, language }: CreateTranscriptionRequest, opts?: OperationOpts): Observable<CreateTranscriptionResponse | AjaxResponse<CreateTranscriptionResponse>> {
        throwIfNullOrUndefined(file, 'file', 'createTranscription');
        throwIfNullOrUndefined(model, 'model', 'createTranscription');

        const formData = new FormData();
        if (file !== undefined) { formData.append('file', file as any); }
        if (model !== undefined) { formData.append('model', model as any); }
        if (prompt !== undefined) { formData.append('prompt', prompt as any); }
        if (responseFormat !== undefined) { formData.append('response_format', responseFormat as any); }
        if (temperature !== undefined) { formData.append('temperature', temperature as any); }
        if (language !== undefined) { formData.append('language', language as any); }

        return this.request<CreateTranscriptionResponse>({
            url: '/audio/transcriptions',
            method: 'POST',
            body: formData,
        }, opts?.responseOpts);
    };

    /**
     * Translates audio into English.
     */
    createTranslation({ file, model, prompt, responseFormat, temperature }: CreateTranslationRequest): Observable<CreateTranslationResponse>
    createTranslation({ file, model, prompt, responseFormat, temperature }: CreateTranslationRequest, opts?: OperationOpts): Observable<AjaxResponse<CreateTranslationResponse>>
    createTranslation({ file, model, prompt, responseFormat, temperature }: CreateTranslationRequest, opts?: OperationOpts): Observable<CreateTranslationResponse | AjaxResponse<CreateTranslationResponse>> {
        throwIfNullOrUndefined(file, 'file', 'createTranslation');
        throwIfNullOrUndefined(model, 'model', 'createTranslation');

        const formData = new FormData();
        if (file !== undefined) { formData.append('file', file as any); }
        if (model !== undefined) { formData.append('model', model as any); }
        if (prompt !== undefined) { formData.append('prompt', prompt as any); }
        if (responseFormat !== undefined) { formData.append('response_format', responseFormat as any); }
        if (temperature !== undefined) { formData.append('temperature', temperature as any); }

        return this.request<CreateTranslationResponse>({
            url: '/audio/translations',
            method: 'POST',
            body: formData,
        }, opts?.responseOpts);
    };

    /**
     * Delete a file.
     */
    deleteFile({ fileId }: DeleteFileRequest): Observable<DeleteFileResponse>
    deleteFile({ fileId }: DeleteFileRequest, opts?: OperationOpts): Observable<AjaxResponse<DeleteFileResponse>>
    deleteFile({ fileId }: DeleteFileRequest, opts?: OperationOpts): Observable<DeleteFileResponse | AjaxResponse<DeleteFileResponse>> {
        throwIfNullOrUndefined(fileId, 'fileId', 'deleteFile');

        return this.request<DeleteFileResponse>({
            url: '/files/{file_id}'.replace('{file_id}', encodeURI(fileId)),
            method: 'DELETE',
        }, opts?.responseOpts);
    };

    /**
     * Delete a fine-tuned model. You must have the Owner role in your organization.
     */
    deleteModel({ model }: DeleteModelRequest): Observable<DeleteModelResponse>
    deleteModel({ model }: DeleteModelRequest, opts?: OperationOpts): Observable<AjaxResponse<DeleteModelResponse>>
    deleteModel({ model }: DeleteModelRequest, opts?: OperationOpts): Observable<DeleteModelResponse | AjaxResponse<DeleteModelResponse>> {
        throwIfNullOrUndefined(model, 'model', 'deleteModel');

        return this.request<DeleteModelResponse>({
            url: '/models/{model}'.replace('{model}', encodeURI(model)),
            method: 'DELETE',
        }, opts?.responseOpts);
    };

    /**
     * Returns the contents of the specified file
     */
    downloadFile({ fileId }: DownloadFileRequest): Observable<string>
    downloadFile({ fileId }: DownloadFileRequest, opts?: OperationOpts): Observable<AjaxResponse<string>>
    downloadFile({ fileId }: DownloadFileRequest, opts?: OperationOpts): Observable<string | AjaxResponse<string>> {
        throwIfNullOrUndefined(fileId, 'fileId', 'downloadFile');

        return this.request<string>({
            url: '/files/{file_id}/content'.replace('{file_id}', encodeURI(fileId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Returns a list of files that belong to the user\'s organization.
     */
    listFiles(): Observable<ListFilesResponse>
    listFiles(opts?: OperationOpts): Observable<AjaxResponse<ListFilesResponse>>
    listFiles(opts?: OperationOpts): Observable<ListFilesResponse | AjaxResponse<ListFilesResponse>> {
        return this.request<ListFilesResponse>({
            url: '/files',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Get fine-grained status updates for a fine-tune job. 
     */
    listFineTuneEvents({ fineTuneId, stream }: ListFineTuneEventsRequest): Observable<ListFineTuneEventsResponse>
    listFineTuneEvents({ fineTuneId, stream }: ListFineTuneEventsRequest, opts?: OperationOpts): Observable<AjaxResponse<ListFineTuneEventsResponse>>
    listFineTuneEvents({ fineTuneId, stream }: ListFineTuneEventsRequest, opts?: OperationOpts): Observable<ListFineTuneEventsResponse | AjaxResponse<ListFineTuneEventsResponse>> {
        throwIfNullOrUndefined(fineTuneId, 'fineTuneId', 'listFineTuneEvents');

        const query: HttpQuery = {};

        if (stream != null) { query['stream'] = stream; }

        return this.request<ListFineTuneEventsResponse>({
            url: '/fine-tunes/{fine_tune_id}/events'.replace('{fine_tune_id}', encodeURI(fineTuneId)),
            method: 'GET',
            query,
        }, opts?.responseOpts);
    };

    /**
     * List your organization\'s fine-tuning jobs 
     */
    listFineTunes(): Observable<ListFineTunesResponse>
    listFineTunes(opts?: OperationOpts): Observable<AjaxResponse<ListFineTunesResponse>>
    listFineTunes(opts?: OperationOpts): Observable<ListFineTunesResponse | AjaxResponse<ListFineTunesResponse>> {
        return this.request<ListFineTunesResponse>({
            url: '/fine-tunes',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Lists the currently available models, and provides basic information about each one such as the owner and availability.
     */
    listModels(): Observable<ListModelsResponse>
    listModels(opts?: OperationOpts): Observable<AjaxResponse<ListModelsResponse>>
    listModels(opts?: OperationOpts): Observable<ListModelsResponse | AjaxResponse<ListModelsResponse>> {
        return this.request<ListModelsResponse>({
            url: '/models',
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Returns information about a specific file.
     */
    retrieveFile({ fileId }: RetrieveFileRequest): Observable<OpenAIFile>
    retrieveFile({ fileId }: RetrieveFileRequest, opts?: OperationOpts): Observable<AjaxResponse<OpenAIFile>>
    retrieveFile({ fileId }: RetrieveFileRequest, opts?: OperationOpts): Observable<OpenAIFile | AjaxResponse<OpenAIFile>> {
        throwIfNullOrUndefined(fileId, 'fileId', 'retrieveFile');

        return this.request<OpenAIFile>({
            url: '/files/{file_id}'.replace('{file_id}', encodeURI(fileId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Gets info about the fine-tune job.  [Learn more about Fine-tuning](/docs/guides/fine-tuning) 
     */
    retrieveFineTune({ fineTuneId }: RetrieveFineTuneRequest): Observable<FineTune>
    retrieveFineTune({ fineTuneId }: RetrieveFineTuneRequest, opts?: OperationOpts): Observable<AjaxResponse<FineTune>>
    retrieveFineTune({ fineTuneId }: RetrieveFineTuneRequest, opts?: OperationOpts): Observable<FineTune | AjaxResponse<FineTune>> {
        throwIfNullOrUndefined(fineTuneId, 'fineTuneId', 'retrieveFineTune');

        return this.request<FineTune>({
            url: '/fine-tunes/{fine_tune_id}'.replace('{fine_tune_id}', encodeURI(fineTuneId)),
            method: 'GET',
        }, opts?.responseOpts);
    };

    /**
     * Retrieves a model instance, providing basic information about the model such as the owner and permissioning.
     */
    retrieveModel({ model }: RetrieveModelRequest): Observable<Model>
    retrieveModel({ model }: RetrieveModelRequest, opts?: OperationOpts): Observable<AjaxResponse<Model>>
    retrieveModel({ model }: RetrieveModelRequest, opts?: OperationOpts): Observable<Model | AjaxResponse<Model>> {
        throwIfNullOrUndefined(model, 'model', 'retrieveModel');

        return this.request<Model>({
            url: '/models/{model}'.replace('{model}', encodeURI(model)),
            method: 'GET',
        }, opts?.responseOpts);
    };

}

/**
 * @export
 * @enum {string}
 */
export enum CreateImageEditSizeEnum {
    _256x256 = '256x256',
    _512x512 = '512x512',
    _1024x1024 = '1024x1024'
}
/**
 * @export
 * @enum {string}
 */
export enum CreateImageEditResponseFormatEnum {
    Url = 'url',
    B64Json = 'b64_json'
}
/**
 * @export
 * @enum {string}
 */
export enum CreateImageVariationSizeEnum {
    _256x256 = '256x256',
    _512x512 = '512x512',
    _1024x1024 = '1024x1024'
}
/**
 * @export
 * @enum {string}
 */
export enum CreateImageVariationResponseFormatEnum {
    Url = 'url',
    B64Json = 'b64_json'
}