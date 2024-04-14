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
* Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
*/
export class DeleteAssistantFileResponse {
    'id': string;
    'deleted': boolean;
    'object': DeleteAssistantFileResponseObjectEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "DeleteAssistantFileResponseObjectEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return DeleteAssistantFileResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum DeleteAssistantFileResponseObjectEnum {
    AssistantFileDeleted = 'assistant.file.deleted'
}

