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

export class DeleteFileResponse {
    'id': string;
    'object': DeleteFileResponse.ObjectEnum;
    'deleted': boolean;

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
            "type": "DeleteFileResponse.ObjectEnum"
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return DeleteFileResponse.attributeTypeMap;
    }
}

export namespace DeleteFileResponse {
    export enum ObjectEnum {
        File = <any> 'file'
    }
}
