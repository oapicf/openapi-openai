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


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    CreateImageEditRequestModel,
    CreateImageEditRequestModelFromJSON,
    CreateImageEditRequestModelToJSON,
    CreateImageRequest,
    CreateImageRequestFromJSON,
    CreateImageRequestToJSON,
    ImagesResponse,
    ImagesResponseFromJSON,
    ImagesResponseToJSON,
} from '../models';

export interface CreateImageRequest {
    createImageRequest: CreateImageRequest;
}

export interface CreateImageEditRequest {
    image: Blob;
    prompt: string;
    mask?: Blob;
    model?: CreateImageEditRequestModel;
    n?: number;
    size?: CreateImageEditSizeEnum;
    responseFormat?: CreateImageEditResponseFormatEnum;
    user?: string;
}

export interface CreateImageVariationRequest {
    image: Blob;
    model?: CreateImageEditRequestModel;
    n?: number;
    responseFormat?: CreateImageVariationResponseFormatEnum;
    size?: CreateImageVariationSizeEnum;
    user?: string;
}


/**
 * Creates an image given a prompt.
 */
function createImageRaw<T>(requestParameters: CreateImageRequest, requestConfig: runtime.TypedQueryConfig<T, ImagesResponse> = {}): QueryConfig<T> {
    if (requestParameters.createImageRequest === null || requestParameters.createImageRequest === undefined) {
        throw new runtime.RequiredError('createImageRequest','Required parameter requestParameters.createImageRequest was null or undefined when calling createImage.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};

    headerParameters['Content-Type'] = 'application/json';


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/images/generations`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: queryParameters || CreateImageRequestToJSON(requestParameters.createImageRequest),
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ImagesResponseFromJSON(body), text);
    }

    return config;
}

/**
* Creates an image given a prompt.
*/
export function createImage<T>(requestParameters: CreateImageRequest, requestConfig?: runtime.TypedQueryConfig<T, ImagesResponse>): QueryConfig<T> {
    return createImageRaw(requestParameters, requestConfig);
}

/**
 * Creates an edited or extended image given an original image and a prompt.
 */
function createImageEditRaw<T>(requestParameters: CreateImageEditRequest, requestConfig: runtime.TypedQueryConfig<T, ImagesResponse> = {}): QueryConfig<T> {
    if (requestParameters.image === null || requestParameters.image === undefined) {
        throw new runtime.RequiredError('image','Required parameter requestParameters.image was null or undefined when calling createImageEdit.');
    }

    if (requestParameters.prompt === null || requestParameters.prompt === undefined) {
        throw new runtime.RequiredError('prompt','Required parameter requestParameters.prompt was null or undefined when calling createImageEdit.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const formData = new FormData();
    if (requestParameters.image !== undefined) {
        formData.append('image', requestParameters.image as any);
    }

    if (requestParameters.prompt !== undefined) {
        formData.append('prompt', requestParameters.prompt as any);
    }

    if (requestParameters.mask !== undefined) {
        formData.append('mask', requestParameters.mask as any);
    }

    if (requestParameters.model !== undefined) {
        formData.append('model', requestParameters.model as any);
    }

    if (requestParameters.n !== undefined) {
        formData.append('n', requestParameters.n as any);
    }

    if (requestParameters.size !== undefined) {
        formData.append('size', requestParameters.size as any);
    }

    if (requestParameters.responseFormat !== undefined) {
        formData.append('response_format', requestParameters.responseFormat as any);
    }

    if (requestParameters.user !== undefined) {
        formData.append('user', requestParameters.user as any);
    }

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/images/edits`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: formData,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ImagesResponseFromJSON(body), text);
    }

    return config;
}

/**
* Creates an edited or extended image given an original image and a prompt.
*/
export function createImageEdit<T>(requestParameters: CreateImageEditRequest, requestConfig?: runtime.TypedQueryConfig<T, ImagesResponse>): QueryConfig<T> {
    return createImageEditRaw(requestParameters, requestConfig);
}

/**
 * Creates a variation of a given image.
 */
function createImageVariationRaw<T>(requestParameters: CreateImageVariationRequest, requestConfig: runtime.TypedQueryConfig<T, ImagesResponse> = {}): QueryConfig<T> {
    if (requestParameters.image === null || requestParameters.image === undefined) {
        throw new runtime.RequiredError('image','Required parameter requestParameters.image was null or undefined when calling createImageVariation.');
    }

    let queryParameters = null;


    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    meta.authType = ['bearer'];
    const formData = new FormData();
    if (requestParameters.image !== undefined) {
        formData.append('image', requestParameters.image as any);
    }

    if (requestParameters.model !== undefined) {
        formData.append('model', requestParameters.model as any);
    }

    if (requestParameters.n !== undefined) {
        formData.append('n', requestParameters.n as any);
    }

    if (requestParameters.responseFormat !== undefined) {
        formData.append('response_format', requestParameters.responseFormat as any);
    }

    if (requestParameters.size !== undefined) {
        formData.append('size', requestParameters.size as any);
    }

    if (requestParameters.user !== undefined) {
        formData.append('user', requestParameters.user as any);
    }

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/images/variations`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'POST',
            headers: headerParameters,
        },
        body: formData,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(ImagesResponseFromJSON(body), text);
    }

    return config;
}

/**
* Creates a variation of a given image.
*/
export function createImageVariation<T>(requestParameters: CreateImageVariationRequest, requestConfig?: runtime.TypedQueryConfig<T, ImagesResponse>): QueryConfig<T> {
    return createImageVariationRaw(requestParameters, requestConfig);
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
