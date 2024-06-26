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

import { RunStepDeltaStepDetailsToolCallsCodeObject } from '../models/RunStepDeltaStepDetailsToolCallsCodeObject';
import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from '../models/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDeltaStepDetailsToolCallsFunctionObject } from '../models/RunStepDeltaStepDetailsToolCallsFunctionObject';
import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from '../models/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDeltaStepDetailsToolCallsRetrievalObject } from '../models/RunStepDeltaStepDetailsToolCallsRetrievalObject';
import { HttpFile } from '../http/http';

export class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    /**
    * The index of the tool call in the tool calls array.
    */
    'index': number;
    /**
    * The ID of the tool call object.
    */
    'id'?: string;
    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    */
    'type': RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum;
    'codeInterpreter'?: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
    /**
    * For now, this is always going to be an empty object.
    */
    'retrieval'?: any;
    '_function'?: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "index",
            "baseName": "index",
            "type": "number",
            "format": ""
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum",
            "format": ""
        },
        {
            "name": "codeInterpreter",
            "baseName": "code_interpreter",
            "type": "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter",
            "format": ""
        },
        {
            "name": "retrieval",
            "baseName": "retrieval",
            "type": "any",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "RunStepDeltaStepDetailsToolCallsFunctionObjectFunction",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum RunStepDeltaStepDetailsToolCallsObjectToolCallsInnerTypeEnum {
    CodeInterpreter = 'code_interpreter',
    Retrieval = 'retrieval',
    Function = 'function'
}

