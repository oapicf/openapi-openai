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

import * as models from './models';

/**
 * The last error associated with this run step. Will be `null` if there are no errors.
 */
export interface RunStepObjectLastError {
    /**
     * One of `server_error` or `rate_limit_exceeded`.
     */
    code: RunStepObjectLastError.CodeEnum;

    /**
     * A human-readable description of the error.
     */
    message: string;

}
export namespace RunStepObjectLastError {
    export enum CodeEnum {
        ServerError = <any> 'server_error',
        RateLimitExceeded = <any> 'rate_limit_exceeded'
    }
}
