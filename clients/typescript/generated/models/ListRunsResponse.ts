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

import { RunObject } from '../models/RunObject';
import { HttpFile } from '../http/http';

export class ListRunsResponse {
    'object': string;
    'data': Array<RunObject>;
    'firstId': string;
    'lastId': string;
    'hasMore': boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "object",
            "baseName": "object",
            "type": "string",
            "format": ""
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<RunObject>",
            "format": ""
        },
        {
            "name": "firstId",
            "baseName": "first_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "lastId",
            "baseName": "last_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "hasMore",
            "baseName": "has_more",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ListRunsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}
