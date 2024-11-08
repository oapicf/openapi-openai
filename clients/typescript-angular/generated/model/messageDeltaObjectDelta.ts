/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { MessageDeltaObjectDeltaContentInner } from './messageDeltaObjectDeltaContentInner';


/**
 * The delta containing the fields that have changed on the Message.
 */
export interface MessageDeltaObjectDelta { 
    /**
     * The entity that produced the message. One of `user` or `assistant`.
     */
    role?: MessageDeltaObjectDelta.RoleEnum;
    /**
     * The content of the message in array of text and/or images.
     */
    content?: Array<MessageDeltaObjectDeltaContentInner>;
    /**
     * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
     */
    file_ids?: Array<string>;
}
export namespace MessageDeltaObjectDelta {
    export type RoleEnum = 'user' | 'assistant';
    export const RoleEnum = {
        User: 'user' as RoleEnum,
        Assistant: 'assistant' as RoleEnum
    };
}


