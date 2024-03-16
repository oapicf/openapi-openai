/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface DeleteFileResponse
 */
export interface DeleteFileResponse {
    /**
     * 
     * @type {string}
     * @memberof DeleteFileResponse
     */
    id: string;
    /**
     * 
     * @type {string}
     * @memberof DeleteFileResponse
     */
    object: string;
    /**
     * 
     * @type {boolean}
     * @memberof DeleteFileResponse
     */
    deleted: boolean;
}

/**
 * Check if a given object implements the DeleteFileResponse interface.
 */
export function instanceOfDeleteFileResponse(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('object' in value)) return false;
    if (!('deleted' in value)) return false;
    return true;
}

export function DeleteFileResponseFromJSON(json: any): DeleteFileResponse {
    return DeleteFileResponseFromJSONTyped(json, false);
}

export function DeleteFileResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): DeleteFileResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'object': json['object'],
        'deleted': json['deleted'],
    };
}

export function DeleteFileResponseToJSON(value?: DeleteFileResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'object': value['object'],
        'deleted': value['deleted'],
    };
}
