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
 * Occurs when a stream ends.
 * @export
 * @interface DoneEvent
 */
export interface DoneEvent {
    /**
     * @type {string}
     * @memberof DoneEvent
     */
    event: DoneEventEventEnum;
    /**
     * @type {string}
     * @memberof DoneEvent
     */
    data: DoneEventDataEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum DoneEventEventEnum {
    Done = 'done'
}
/**
 * @export
 * @enum {string}
 */
export enum DoneEventDataEnum {
    Done = '[DONE]'
}

