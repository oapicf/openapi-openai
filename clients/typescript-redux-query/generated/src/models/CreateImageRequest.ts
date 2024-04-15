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

import { exists, mapValues } from '../runtime';
import {
    CreateImageRequestModel,
    CreateImageRequestModelFromJSON,
    CreateImageRequestModelToJSON,
} from './';

/**
 * 
 * @export
 * @interface CreateImageRequest
 */
export interface CreateImageRequest  {
    /**
     * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     * @type {string}
     * @memberof CreateImageRequest
     */
    prompt: string;
    /**
     * 
     * @type {CreateImageRequestModel}
     * @memberof CreateImageRequest
     */
    model?: CreateImageRequestModel;
    /**
     * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     * @type {number}
     * @memberof CreateImageRequest
     */
    n?: number;
    /**
     * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     * @type {string}
     * @memberof CreateImageRequest
     */
    quality?: CreateImageRequestQualityEnum;
    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
     * @type {string}
     * @memberof CreateImageRequest
     */
    responseFormat?: CreateImageRequestResponseFormatEnum;
    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     * @type {string}
     * @memberof CreateImageRequest
     */
    size?: CreateImageRequestSizeEnum;
    /**
     * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     * @type {string}
     * @memberof CreateImageRequest
     */
    style?: CreateImageRequestStyleEnum;
    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
     * @type {string}
     * @memberof CreateImageRequest
     */
    user?: string;
}

export function CreateImageRequestFromJSON(json: any): CreateImageRequest {
    return {
        'prompt': json['prompt'],
        'model': !exists(json, 'model') ? undefined : CreateImageRequestModelFromJSON(json['model']),
        'n': !exists(json, 'n') ? undefined : json['n'],
        'quality': !exists(json, 'quality') ? undefined : json['quality'],
        'responseFormat': !exists(json, 'response_format') ? undefined : json['response_format'],
        'size': !exists(json, 'size') ? undefined : json['size'],
        'style': !exists(json, 'style') ? undefined : json['style'],
        'user': !exists(json, 'user') ? undefined : json['user'],
    };
}

export function CreateImageRequestToJSON(value?: CreateImageRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'prompt': value.prompt,
        'model': CreateImageRequestModelToJSON(value.model),
        'n': value.n,
        'quality': value.quality,
        'response_format': value.responseFormat,
        'size': value.size,
        'style': value.style,
        'user': value.user,
    };
}

/**
* @export
* @enum {string}
*/
export enum CreateImageRequestQualityEnum {
    Standard = 'standard',
    Hd = 'hd'
}
/**
* @export
* @enum {string}
*/
export enum CreateImageRequestResponseFormatEnum {
    Url = 'url',
    B64Json = 'b64_json'
}
/**
* @export
* @enum {string}
*/
export enum CreateImageRequestSizeEnum {
    _256x256 = '256x256',
    _512x512 = '512x512',
    _1024x1024 = '1024x1024',
    _1792x1024 = '1792x1024',
    _1024x1792 = '1024x1792'
}
/**
* @export
* @enum {string}
*/
export enum CreateImageRequestStyleEnum {
    Vivid = 'vivid',
    Natural = 'natural'
}

