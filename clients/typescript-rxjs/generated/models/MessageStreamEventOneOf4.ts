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

import type {
    MessageObject,
} from './';

/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 * @export
 * @interface MessageStreamEventOneOf4
 */
export interface MessageStreamEventOneOf4 {
    /**
     * @type {string}
     * @memberof MessageStreamEventOneOf4
     */
    event: MessageStreamEventOneOf4EventEnum;
    /**
     * @type {MessageObject}
     * @memberof MessageStreamEventOneOf4
     */
    data: MessageObject;
}

/**
 * @export
 * @enum {string}
 */
export enum MessageStreamEventOneOf4EventEnum {
    ThreadMessageIncomplete = 'thread.message.incomplete'
}

