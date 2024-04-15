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

import { MessageDeltaObjectDelta } from '../models/MessageDeltaObjectDelta';
import { HttpFile } from '../http/http';

/**
* Represents a message delta i.e. any changed fields on a message during streaming. 
*/
export class MessageDeltaObject {
    /**
    * The identifier of the message, which can be referenced in API endpoints.
    */
    'id': string;
    /**
    * The object type, which is always `thread.message.delta`.
    */
    'object': MessageDeltaObjectObjectEnum;
    'delta': MessageDeltaObjectDelta;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "MessageDeltaObjectObjectEnum",
            "format": ""
        },
        {
            "name": "delta",
            "baseName": "delta",
            "type": "MessageDeltaObjectDelta",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MessageDeltaObject.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum MessageDeltaObjectObjectEnum {
    ThreadMessageDelta = 'thread.message.delta'
}
