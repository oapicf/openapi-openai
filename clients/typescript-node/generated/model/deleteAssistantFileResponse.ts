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
* Deletes the association between the assistant and the file, but does not delete the [File](/docs/api-reference/files) object itself.
*/
export class DeleteAssistantFileResponse {
    'id': string;
    'deleted': boolean;
    'object': DeleteAssistantFileResponse.ObjectEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean"
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "DeleteAssistantFileResponse.ObjectEnum"
        }    ];

    static getAttributeTypeMap() {
        return DeleteAssistantFileResponse.attributeTypeMap;
    }
}

export namespace DeleteAssistantFileResponse {
    export enum ObjectEnum {
        AssistantFileDeleted = <any> 'assistant.file.deleted'
    }
}