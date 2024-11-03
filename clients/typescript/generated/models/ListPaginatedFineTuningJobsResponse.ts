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

import { FineTuningJob } from '../models/FineTuningJob';
import { HttpFile } from '../http/http';

export class ListPaginatedFineTuningJobsResponse {
    'data': Array<FineTuningJob>;
    'hasMore': boolean;
    'object': ListPaginatedFineTuningJobsResponseObjectEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<FineTuningJob>",
            "format": ""
        },
        {
            "name": "hasMore",
            "baseName": "has_more",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "ListPaginatedFineTuningJobsResponseObjectEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ListPaginatedFineTuningJobsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum ListPaginatedFineTuningJobsResponseObjectEnum {
    List = 'list'
}

