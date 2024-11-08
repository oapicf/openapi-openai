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

import { MessageDeltaObject } from '../models/MessageDeltaObject';
import { HttpFile } from '../http/http';

/**
* Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
*/
export class MessageStreamEventOneOf2 {
    'event': MessageStreamEventOneOf2EventEnum;
    'data': MessageDeltaObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "MessageStreamEventOneOf2EventEnum",
            "format": ""
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "MessageDeltaObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MessageStreamEventOneOf2.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum MessageStreamEventOneOf2EventEnum {
    ThreadMessageDelta = 'thread.message.delta'
}

