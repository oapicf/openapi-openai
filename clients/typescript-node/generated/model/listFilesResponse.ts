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
import { OpenAIFile } from './openAIFile';

export class ListFilesResponse {
    'data': Array<OpenAIFile>;
    'object': ListFilesResponse.ObjectEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<OpenAIFile>"
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "ListFilesResponse.ObjectEnum"
        }    ];

    static getAttributeTypeMap() {
        return ListFilesResponse.attributeTypeMap;
    }
}

export namespace ListFilesResponse {
    export enum ObjectEnum {
        List = <any> 'list'
    }
}