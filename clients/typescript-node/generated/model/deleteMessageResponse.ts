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

export class DeleteMessageResponse {
    'id': string;
    'deleted': boolean;
    'object': DeleteMessageResponse.ObjectEnum;

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
            "type": "DeleteMessageResponse.ObjectEnum"
        }    ];

    static getAttributeTypeMap() {
        return DeleteMessageResponse.attributeTypeMap;
    }
}

export namespace DeleteMessageResponse {
    export enum ObjectEnum {
        ThreadMessageDeleted = <any> 'thread.message.deleted'
    }
}