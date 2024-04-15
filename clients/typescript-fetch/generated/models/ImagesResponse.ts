/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { Image } from './Image';
import {
    ImageFromJSON,
    ImageFromJSONTyped,
    ImageToJSON,
} from './Image';

/**
 * 
 * @export
 * @interface ImagesResponse
 */
export interface ImagesResponse {
    /**
     * 
     * @type {number}
     * @memberof ImagesResponse
     */
    created: number;
    /**
     * 
     * @type {Array<Image>}
     * @memberof ImagesResponse
     */
    data: Array<Image>;
}

/**
 * Check if a given object implements the ImagesResponse interface.
 */
export function instanceOfImagesResponse(value: object): boolean {
    if (!('created' in value)) return false;
    if (!('data' in value)) return false;
    return true;
}

export function ImagesResponseFromJSON(json: any): ImagesResponse {
    return ImagesResponseFromJSONTyped(json, false);
}

export function ImagesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ImagesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'created': json['created'],
        'data': ((json['data'] as Array<any>).map(ImageFromJSON)),
    };
}

export function ImagesResponseToJSON(value?: ImagesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'created': value['created'],
        'data': ((value['data'] as Array<any>).map(ImageToJSON)),
    };
}
