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

import { RunStepDetailsToolCallsFunctionObjectFunction } from '../models/RunStepDetailsToolCallsFunctionObjectFunction';
import { HttpFile } from '../http/http';

export class RunStepDetailsToolCallsFunctionObject {
    /**
    * The ID of the tool call object.
    */
    'id': string;
    /**
    * The type of tool call. This is always going to be `function` for this type of tool call.
    */
    'type': RunStepDetailsToolCallsFunctionObjectTypeEnum;
    '_function': RunStepDetailsToolCallsFunctionObjectFunction;

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
            "name": "type",
            "baseName": "type",
            "type": "RunStepDetailsToolCallsFunctionObjectTypeEnum",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "RunStepDetailsToolCallsFunctionObjectFunction",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDetailsToolCallsFunctionObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum RunStepDetailsToolCallsFunctionObjectTypeEnum {
    Function = 'function'
}

