// tslint:disable
/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
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
import { BaseAPI, throwIfNullOrUndefined } from '../runtime';
import type { OperationOpts, HttpHeaders } from '../runtime';
import type {
    CreateImageEditRequestModel,
    CreateImageRequest,
    ImagesResponse,
} from '../models';

export interface CreateImageRequest {
    createImageRequest: CreateImageRequest;
}

export interface CreateImageEditRequest {
    image: Blob;
    prompt: string;
    mask?: Blob;
    model?: CreateImageEditRequestModel | null;
    n?: number | null;
    size?: CreateImageEditSizeEnum;
    responseFormat?: CreateImageEditResponseFormatEnum;
    user?: string;
}

export interface CreateImageVariationRequest {
    image: Blob;
    model?: CreateImageEditRequestModel | null;
    n?: number | null;
    responseFormat?: CreateImageVariationResponseFormatEnum;
    size?: CreateImageVariationSizeEnum;
    user?: string;
}

/**
 * no description
 */
export class ImagesApi extends BaseAPI {

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
    createImageEdit({ image, prompt, mask, model, n, size, responseFormat, user }: CreateImageEditRequest): Observable<ImagesResponse>
    createImageEdit({ image, prompt, mask, model, n, size, responseFormat, user }: CreateImageEditRequest, opts?: OperationOpts): Observable<AjaxResponse<ImagesResponse>>
    createImageEdit({ image, prompt, mask, model, n, size, responseFormat, user }: CreateImageEditRequest, opts?: OperationOpts): Observable<ImagesResponse | AjaxResponse<ImagesResponse>> {
        throwIfNullOrUndefined(image, 'image', 'createImageEdit');
        throwIfNullOrUndefined(prompt, 'prompt', 'createImageEdit');

        const headers: HttpHeaders = {
        };

        const formData = new FormData();
        if (image !== undefined) { formData.append('image', image as any); }
        if (prompt !== undefined) { formData.append('prompt', prompt as any); }
        if (mask !== undefined) { formData.append('mask', mask as any); }
        if (model !== undefined) { formData.append('model', model as any); }
        if (n !== undefined) { formData.append('n', n as any); }
        if (size !== undefined) { formData.append('size', size as any); }
        if (responseFormat !== undefined) { formData.append('response_format', responseFormat as any); }
        if (user !== undefined) { formData.append('user', user as any); }

        return this.request<ImagesResponse>({
            url: '/images/edits',
            method: 'POST',
            headers,
            body: formData,
        }, opts?.responseOpts);
    };

    /**
     * Creates a variation of a given image.
     */
    createImageVariation({ image, model, n, responseFormat, size, user }: CreateImageVariationRequest): Observable<ImagesResponse>
    createImageVariation({ image, model, n, responseFormat, size, user }: CreateImageVariationRequest, opts?: OperationOpts): Observable<AjaxResponse<ImagesResponse>>
    createImageVariation({ image, model, n, responseFormat, size, user }: CreateImageVariationRequest, opts?: OperationOpts): Observable<ImagesResponse | AjaxResponse<ImagesResponse>> {
        throwIfNullOrUndefined(image, 'image', 'createImageVariation');

        const headers: HttpHeaders = {
        };

        const formData = new FormData();
        if (image !== undefined) { formData.append('image', image as any); }
        if (model !== undefined) { formData.append('model', model as any); }
        if (n !== undefined) { formData.append('n', n as any); }
        if (responseFormat !== undefined) { formData.append('response_format', responseFormat as any); }
        if (size !== undefined) { formData.append('size', size as any); }
        if (user !== undefined) { formData.append('user', user as any); }

        return this.request<ImagesResponse>({
            url: '/images/variations',
            method: 'POST',
            headers,
            body: formData,
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
export enum CreateImageVariationResponseFormatEnum {
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
