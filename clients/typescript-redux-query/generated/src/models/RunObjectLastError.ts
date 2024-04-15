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
 * The last error associated with this run. Will be `null` if there are no errors.
 * @export
 * @interface RunObjectLastError
 */
export interface RunObjectLastError  {
    /**
     * One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
     * @type {string}
     * @memberof RunObjectLastError
     */
    code: RunObjectLastErrorCodeEnum;
    /**
     * A human-readable description of the error.
     * @type {string}
     * @memberof RunObjectLastError
     */
    message: string;
}

export function RunObjectLastErrorFromJSON(json: any): RunObjectLastError {
    return {
        'code': json['code'],
        'message': json['message'],
    };
}

export function RunObjectLastErrorToJSON(value?: RunObjectLastError): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'code': value.code,
        'message': value.message,
    };
}

/**
* @export
* @enum {string}
*/
export enum RunObjectLastErrorCodeEnum {
    ServerError = 'server_error',
    RateLimitExceeded = 'rate_limit_exceeded',
    InvalidPrompt = 'invalid_prompt'
}

