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
import { MessageDeltaObject } from './messageDeltaObject';

/**
* Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
*/
export class MessageStreamEventOneOf2 {
    'event': MessageStreamEventOneOf2.EventEnum;
    'data': MessageDeltaObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "MessageStreamEventOneOf2.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "MessageDeltaObject"
        }    ];

    static getAttributeTypeMap() {
        return MessageStreamEventOneOf2.attributeTypeMap;
    }
}

export namespace MessageStreamEventOneOf2 {
    export enum EventEnum {
        ThreadMessageDelta = <any> 'thread.message.delta'
    }
}
