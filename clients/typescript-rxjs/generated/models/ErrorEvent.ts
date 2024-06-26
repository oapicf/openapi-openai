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

/**
 * Occurs when an [error](/docs/guides/error-codes/api-errors) occurs. This can happen due to an internal server error or a timeout.
 * @export
 * @interface ErrorEvent
 */
export interface ErrorEvent {
    /**
     * @type {string}
     * @memberof ErrorEvent
     */
    event: ErrorEventEventEnum;
    /**
     * @type {Error}
     * @memberof ErrorEvent
     */
    data: Error;
}

/**
 * @export
 * @enum {string}
 */
export enum ErrorEventEventEnum {
    Error = 'error'
}

