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

import { AssistantToolsCode } from '../models/AssistantToolsCode';
import { AssistantToolsFunction } from '../models/AssistantToolsFunction';
import { AssistantToolsRetrieval } from '../models/AssistantToolsRetrieval';
import { FunctionObject } from '../models/FunctionObject';
import { HttpFile } from '../http/http';

export class AssistantObjectToolsInner {
    /**
    * The type of tool being defined: `code_interpreter`
    */
    'type': AssistantObjectToolsInnerTypeEnum;
    '_function': FunctionObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "AssistantObjectToolsInnerTypeEnum",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "FunctionObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AssistantObjectToolsInner.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum AssistantObjectToolsInnerTypeEnum {
    CodeInterpreter = 'code_interpreter',
    Retrieval = 'retrieval',
    Function = 'function'
}
