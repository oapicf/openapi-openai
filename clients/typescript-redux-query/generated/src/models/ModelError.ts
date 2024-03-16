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
    type: string;
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
    code: string;
}

export function ModelErrorFromJSON(json: any): ModelError {
    return {
        'type': json['type'],
        'message': json['message'],
        'param': json['param'],
        'code': json['code'],
    };
}

export function ModelErrorToJSON(value?: ModelError): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': value.type,
        'message': value.message,
        'param': value.param,
        'code': value.code,
    };
}

