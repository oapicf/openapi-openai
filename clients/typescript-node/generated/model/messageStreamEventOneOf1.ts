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

import { RequestFile } from './models';
import { MessageObject } from './messageObject';

/**
* Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
*/
export class MessageStreamEventOneOf1 {
    'event': MessageStreamEventOneOf1.EventEnum;
    'data': MessageObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "MessageStreamEventOneOf1.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "MessageObject"
        }    ];

    static getAttributeTypeMap() {
        return MessageStreamEventOneOf1.attributeTypeMap;
    }
}

export namespace MessageStreamEventOneOf1 {
    export enum EventEnum {
        ThreadMessageInProgress = <any> 'thread.message.in_progress'
    }
}
