/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { MessageObject } from './messageObject';


/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 */
export interface MessageStreamEventOneOf4 { 
    event: MessageStreamEventOneOf4.EventEnum;
    data: MessageObject;
}
export namespace MessageStreamEventOneOf4 {
    export type EventEnum = 'thread.message.incomplete';
    export const EventEnum = {
        ThreadMessageIncomplete: 'thread.message.incomplete' as EventEnum
    };
}


