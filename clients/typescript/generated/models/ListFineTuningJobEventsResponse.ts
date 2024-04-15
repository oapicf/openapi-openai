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

import { FineTuningJobEvent } from '../models/FineTuningJobEvent';
import { HttpFile } from '../http/http';

export class ListFineTuningJobEventsResponse {
    'data': Array<FineTuningJobEvent>;
    'object': ListFineTuningJobEventsResponseObjectEnum;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<FineTuningJobEvent>",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "ListFineTuningJobEventsResponseObjectEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ListFineTuningJobEventsResponse.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum ListFineTuningJobEventsResponseObjectEnum {
    List = 'list'
}
