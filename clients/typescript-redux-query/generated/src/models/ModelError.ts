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
/**
 * 
 * @export
 * @interface ModelError
 */
export interface ModelError  {
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    code: string;
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
    param: string;
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    type: string;
}

export function ModelErrorFromJSON(json: any): ModelError {
    return {
        'code': json['code'],
        'message': json['message'],
        'param': json['param'],
        'type': json['type'],
    };
}

export function ModelErrorToJSON(value?: ModelError): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'code': value.code,
        'message': value.message,
        'param': value.param,
        'type': value.type,
    };
}


