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
import { MessageDeltaContentTextObjectText } from './messageDeltaContentTextObjectText';


/**
 * The text content that is part of a message.
 */
export interface MessageDeltaContentTextObject { 
    /**
     * The index of the content part in the message.
     */
    index: number;
    /**
     * Always `text`.
     */
    type: MessageDeltaContentTextObject.TypeEnum;
    text?: MessageDeltaContentTextObjectText;
}
export namespace MessageDeltaContentTextObject {
    export type TypeEnum = 'text';
    export const TypeEnum = {
        Text: 'text' as TypeEnum
    };
}


