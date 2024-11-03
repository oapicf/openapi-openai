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

/**
* A list of files attached to a `message`.
*/
export class MessageFileObject {
    /**
    * The identifier, which can be referenced in API endpoints.
    */
    'id': string;
    /**
    * The object type, which is always `thread.message.file`.
    */
    'object': MessageFileObject.ObjectEnum;
    /**
    * The Unix timestamp (in seconds) for when the message file was created.
    */
    'createdAt': number;
    /**
    * The ID of the [message](/docs/api-reference/messages) that the [File](/docs/api-reference/files) is attached to.
    */
    'messageId': string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "MessageFileObject.ObjectEnum"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number"
        },
        {
            "name": "messageId",
            "baseName": "message_id",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return MessageFileObject.attributeTypeMap;
    }
}

export namespace MessageFileObject {
    export enum ObjectEnum {
        ThreadMessageFile = <any> 'thread.message.file'
    }
}
