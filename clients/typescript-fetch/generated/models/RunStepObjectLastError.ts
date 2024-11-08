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
 * The last error associated with this run step. Will be `null` if there are no errors.
 * @export
 * @interface RunStepObjectLastError
 */
export interface RunStepObjectLastError {
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


/**
 * @export
 */
export const RunStepObjectLastErrorCodeEnum = {
    ServerError: 'server_error',
    RateLimitExceeded: 'rate_limit_exceeded'
} as const;
export type RunStepObjectLastErrorCodeEnum = typeof RunStepObjectLastErrorCodeEnum[keyof typeof RunStepObjectLastErrorCodeEnum];


/**
 * Check if a given object implements the RunStepObjectLastError interface.
 */
export function instanceOfRunStepObjectLastError(value: object): value is RunStepObjectLastError {
    if (!('code' in value) || value['code'] === undefined) return false;
    if (!('message' in value) || value['message'] === undefined) return false;
    return true;
}

export function RunStepObjectLastErrorFromJSON(json: any): RunStepObjectLastError {
    return RunStepObjectLastErrorFromJSONTyped(json, false);
}

export function RunStepObjectLastErrorFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepObjectLastError {
    if (json == null) {
        return json;
    }
    return {
        
        'code': json['code'],
        'message': json['message'],
    };
}

  export function RunStepObjectLastErrorToJSON(json: any): RunStepObjectLastError {
      return RunStepObjectLastErrorToJSONTyped(json, false);
  }

  export function RunStepObjectLastErrorToJSONTyped(value?: RunStepObjectLastError | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'code': value['code'],
        'message': value['message'],
    };
}

