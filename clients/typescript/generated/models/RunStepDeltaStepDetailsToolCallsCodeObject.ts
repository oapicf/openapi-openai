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

import { RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter } from '../models/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import { HttpFile } from '../http/http';

/**
* Details of the Code Interpreter tool call the run step was involved in.
*/
export class RunStepDeltaStepDetailsToolCallsCodeObject {
    /**
    * The index of the tool call in the tool calls array.
    */
    'index': number;
    /**
    * The ID of the tool call.
    */
    'id'?: string;
    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    */
    'type': RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum;
    'codeInterpreter'?: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;

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
            "type": "RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum",
            "format": ""
        },
        {
            "name": "codeInterpreter",
            "baseName": "code_interpreter",
            "type": "RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaStepDetailsToolCallsCodeObject.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum {
    CodeInterpreter = 'code_interpreter'
}
