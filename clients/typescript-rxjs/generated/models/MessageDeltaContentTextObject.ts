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
    MessageDeltaContentTextObjectText,
} from './';

/**
 * The text content that is part of a message.
 * @export
 * @interface MessageDeltaContentTextObject
 */
export interface MessageDeltaContentTextObject {
    /**
     * The index of the content part in the message.
     * @type {number}
     * @memberof MessageDeltaContentTextObject
     */
    index: number;
    /**
     * Always `text`.
     * @type {string}
     * @memberof MessageDeltaContentTextObject
     */
    type: MessageDeltaContentTextObjectTypeEnum;
    /**
     * @type {MessageDeltaContentTextObjectText}
     * @memberof MessageDeltaContentTextObject
     */
    text?: MessageDeltaContentTextObjectText;
}

/**
 * @export
 * @enum {string}
 */
export enum MessageDeltaContentTextObjectTypeEnum {
    Text = 'text'
}

