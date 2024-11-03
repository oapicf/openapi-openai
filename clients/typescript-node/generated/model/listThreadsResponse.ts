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
import { ThreadObject } from './threadObject';

export class ListThreadsResponse {
    'object': string;
    'data': Array<ThreadObject>;
    'firstId': string;
    'lastId': string;
    'hasMore': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "object",
            "baseName": "object",
            "type": "string"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<ThreadObject>"
        },
        {
            "name": "firstId",
            "baseName": "first_id",
            "type": "string"
        },
        {
            "name": "lastId",
            "baseName": "last_id",
            "type": "string"
        },
        {
            "name": "hasMore",
            "baseName": "has_more",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return ListThreadsResponse.attributeTypeMap;
    }
}

