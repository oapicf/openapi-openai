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
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDetailsToolCallsCodeObjectCodeInterpreter';

/**
* Details of the Code Interpreter tool call the run step was involved in.
*/
export class RunStepDetailsToolCallsCodeObject {
    /**
    * The ID of the tool call.
    */
    'id': string;
    /**
    * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    */
    'type': RunStepDetailsToolCallsCodeObject.TypeEnum;
    'codeInterpreter': RunStepDetailsToolCallsCodeObjectCodeInterpreter;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepDetailsToolCallsCodeObject.TypeEnum"
        },
        {
            "name": "codeInterpreter",
            "baseName": "code_interpreter",
            "type": "RunStepDetailsToolCallsCodeObjectCodeInterpreter"
        }    ];

    static getAttributeTypeMap() {
        return RunStepDetailsToolCallsCodeObject.attributeTypeMap;
    }
}

export namespace RunStepDetailsToolCallsCodeObject {
    export enum TypeEnum {
        CodeInterpreter = <any> 'code_interpreter'
    }
}
