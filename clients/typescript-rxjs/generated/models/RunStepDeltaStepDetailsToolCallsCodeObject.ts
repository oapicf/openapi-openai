// tslint:disable
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

import type {
    RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter,
} from './';

/**
 * Details of the Code Interpreter tool call the run step was involved in.
 * @export
 * @interface RunStepDeltaStepDetailsToolCallsCodeObject
 */
export interface RunStepDeltaStepDetailsToolCallsCodeObject {
    /**
     * The index of the tool call in the tool calls array.
     * @type {number}
     * @memberof RunStepDeltaStepDetailsToolCallsCodeObject
     */
    index: number;
    /**
     * The ID of the tool call.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsToolCallsCodeObject
     */
    id?: string;
    /**
     * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsToolCallsCodeObject
     */
    type: RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum;
    /**
     * @type {RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter}
     * @memberof RunStepDeltaStepDetailsToolCallsCodeObject
     */
    code_interpreter?: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter;
}

/**
 * @export
 * @enum {string}
 */
export enum RunStepDeltaStepDetailsToolCallsCodeObjectTypeEnum {
    CodeInterpreter = 'code_interpreter'
}

