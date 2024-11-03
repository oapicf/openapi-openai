/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


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
    export type CodeEnum = 'server_error' | 'rate_limit_exceeded';
    export const CodeEnum = {
        ServerError: 'server_error' as CodeEnum,
        RateLimitExceeded: 'rate_limit_exceeded' as CodeEnum
    };
}


