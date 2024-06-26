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

import { exists, mapValues } from '../runtime';
import {
    RunStepDetailsToolCallsObjectToolCallsInner,
    RunStepDetailsToolCallsObjectToolCallsInnerFromJSON,
    RunStepDetailsToolCallsObjectToolCallsInnerToJSON,
} from './';

/**
 * Details of the tool call.
 * @export
 * @interface RunStepDetailsToolCallsObject
 */
export interface RunStepDetailsToolCallsObject  {
    /**
     * Always `tool_calls`.
     * @type {string}
     * @memberof RunStepDetailsToolCallsObject
     */
    type: RunStepDetailsToolCallsObjectTypeEnum;
    /**
     * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
     * @type {Array<RunStepDetailsToolCallsObjectToolCallsInner>}
     * @memberof RunStepDetailsToolCallsObject
     */
    toolCalls: Array<RunStepDetailsToolCallsObjectToolCallsInner>;
}

export function RunStepDetailsToolCallsObjectFromJSON(json: any): RunStepDetailsToolCallsObject {
    return {
        'type': json['type'],
        'toolCalls': (json['tool_calls'] as Array<any>).map(RunStepDetailsToolCallsObjectToolCallsInnerFromJSON),
    };
}

export function RunStepDetailsToolCallsObjectToJSON(value?: RunStepDetailsToolCallsObject): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': value.type,
        'tool_calls': (value.toolCalls as Array<any>).map(RunStepDetailsToolCallsObjectToolCallsInnerToJSON),
    };
}

/**
* @export
* @enum {string}
*/
export enum RunStepDetailsToolCallsObjectTypeEnum {
    ToolCalls = 'tool_calls'
}


