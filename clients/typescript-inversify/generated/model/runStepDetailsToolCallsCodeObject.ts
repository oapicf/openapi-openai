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
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDetailsToolCallsCodeObjectCodeInterpreter';


/**
 * Details of the Code Interpreter tool call the run step was involved in.
 */
export interface RunStepDetailsToolCallsCodeObject { 
    /**
     * The ID of the tool call.
     */
    id: string;
    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     */
    type: RunStepDetailsToolCallsCodeObject.TypeEnum;
    code_interpreter: RunStepDetailsToolCallsCodeObjectCodeInterpreter;
}
export namespace RunStepDetailsToolCallsCodeObject {
    export type TypeEnum = 'code_interpreter';
    export const TypeEnum = {
        CodeInterpreter: 'code_interpreter' as TypeEnum
    }
}
