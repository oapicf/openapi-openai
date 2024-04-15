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
 * The last error associated with this run step. Will be `null` if there are no errors.
 * @export
 * @interface RunStepObjectLastError
 */
export interface RunStepObjectLastError  {
    /**
     * One of `server_error` or `rate_limit_exceeded`.
     * @type {string}
     * @memberof RunStepObjectLastError
     */
    code: RunStepObjectLastErrorCodeEnum;
    /**
     * A human-readable description of the error.
     * @type {string}
     * @memberof RunStepObjectLastError
     */
    message: string;
}

export function RunStepObjectLastErrorFromJSON(json: any): RunStepObjectLastError {
    return {
        'code': json['code'],
        'message': json['message'],
    };
}

export function RunStepObjectLastErrorToJSON(value?: RunStepObjectLastError): any {
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
export enum RunStepObjectLastErrorCodeEnum {
    ServerError = 'server_error',
    RateLimitExceeded = 'rate_limit_exceeded'
}

