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

import { HttpFile } from '../http/http';

/**
* A list of [Files](/docs/api-reference/files) attached to an `assistant`.
*/
export class AssistantFileObject {
    /**
    * The identifier, which can be referenced in API endpoints.
    */
    'id': string;
    /**
    * The object type, which is always `assistant.file`.
    */
    'object': AssistantFileObjectObjectEnum;
    /**
    * The Unix timestamp (in seconds) for when the assistant file was created.
    */
    'createdAt': number;
    /**
    * The assistant ID that the file is attached to.
    */
    'assistantId': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

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
            "type": "AssistantFileObjectObjectEnum",
            "format": ""
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "assistantId",
            "baseName": "assistant_id",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AssistantFileObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum AssistantFileObjectObjectEnum {
    AssistantFile = 'assistant.file'
}

