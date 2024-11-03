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

import { RunStepDeltaStepDetailsToolCallsObjectToolCallsInner } from '../models/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner';
import { HttpFile } from '../http/http';

/**
* Details of the tool call.
*/
export class RunStepDeltaStepDetailsToolCallsObject {
    /**
    * Always `tool_calls`.
    */
    'type': RunStepDeltaStepDetailsToolCallsObjectTypeEnum;
    /**
    * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
    */
    'toolCalls'?: Array<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepDeltaStepDetailsToolCallsObjectTypeEnum",
            "format": ""
        },
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaStepDetailsToolCallsObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum RunStepDeltaStepDetailsToolCallsObjectTypeEnum {
    ToolCalls = 'tool_calls'
}

