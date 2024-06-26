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
* Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
*/
export class MessageStreamEventOneOf4 {
    'event': MessageStreamEventOneOf4.EventEnum;
    'data': MessageObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "MessageStreamEventOneOf4.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "MessageObject"
        }    ];

    static getAttributeTypeMap() {
        return MessageStreamEventOneOf4.attributeTypeMap;
    }
}

export namespace MessageStreamEventOneOf4 {
    export enum EventEnum {
        ThreadMessageIncomplete = <any> 'thread.message.incomplete'
    }
}
