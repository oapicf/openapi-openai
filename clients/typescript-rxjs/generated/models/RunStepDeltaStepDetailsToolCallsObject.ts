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
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner,
} from './';

/**
 * Details of the tool call.
 * @export
 * @interface RunStepDeltaStepDetailsToolCallsObject
 */
export interface RunStepDeltaStepDetailsToolCallsObject {
    /**
     * Always `tool_calls`.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsToolCallsObject
     */
    type: RunStepDeltaStepDetailsToolCallsObjectTypeEnum;
    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
     * @type {Array<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>}
     * @memberof RunStepDeltaStepDetailsToolCallsObject
     */
    tool_calls?: Array<RunStepDeltaStepDetailsToolCallsObjectToolCallsInner>;
}

/**
 * @export
 * @enum {string}
 */
export enum RunStepDeltaStepDetailsToolCallsObjectTypeEnum {
    ToolCalls = 'tool_calls'
}

