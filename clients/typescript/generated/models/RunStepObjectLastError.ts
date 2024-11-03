/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* The last error associated with this run step. Will be `null` if there are no errors.
*/
export class RunStepObjectLastError {
    /**
    * One of `server_error` or `rate_limit_exceeded`.
    */
    'code': RunStepObjectLastErrorCodeEnum;
    /**
    * A human-readable description of the error.
    */
    'message': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "code",
            "baseName": "code",
            "type": "RunStepObjectLastErrorCodeEnum",
            "format": ""
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepObjectLastError.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum RunStepObjectLastErrorCodeEnum {
    ServerError = 'server_error',
    RateLimitExceeded = 'rate_limit_exceeded'
}

