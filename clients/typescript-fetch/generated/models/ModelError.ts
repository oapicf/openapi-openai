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
/**
 * 
 * @export
 * @interface ModelError
 */
export interface ModelError {
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    code: string | null;
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    message: string;
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    param: string | null;
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    type: string;
}

/**
 * Check if a given object implements the ModelError interface.
 */
export function instanceOfModelError(value: object): boolean {
    if (!('code' in value)) return false;
    if (!('message' in value)) return false;
    if (!('param' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function ModelErrorFromJSON(json: any): ModelError {
    return ModelErrorFromJSONTyped(json, false);
}

export function ModelErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): ModelError {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'],
        'message': json['message'],
        'param': json['param'],
        'type': json['type'],
    };
}

export function ModelErrorToJSON(value?: ModelError | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'code': value['code'],
        'message': value['message'],
        'param': value['param'],
        'type': value['type'],
    };
}

