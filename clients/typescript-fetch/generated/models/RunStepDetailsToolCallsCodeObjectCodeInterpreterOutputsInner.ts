/* tslint:disable */
/* eslint-disable */
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

import type { RunStepDetailsToolCallsCodeOutputImageObject } from './RunStepDetailsToolCallsCodeOutputImageObject';
import {
    instanceOfRunStepDetailsToolCallsCodeOutputImageObject,
    RunStepDetailsToolCallsCodeOutputImageObjectFromJSON,
    RunStepDetailsToolCallsCodeOutputImageObjectFromJSONTyped,
    RunStepDetailsToolCallsCodeOutputImageObjectToJSON,
} from './RunStepDetailsToolCallsCodeOutputImageObject';
import type { RunStepDetailsToolCallsCodeOutputLogsObject } from './RunStepDetailsToolCallsCodeOutputLogsObject';
import {
    instanceOfRunStepDetailsToolCallsCodeOutputLogsObject,
    RunStepDetailsToolCallsCodeOutputLogsObjectFromJSON,
    RunStepDetailsToolCallsCodeOutputLogsObjectFromJSONTyped,
    RunStepDetailsToolCallsCodeOutputLogsObjectToJSON,
} from './RunStepDetailsToolCallsCodeOutputLogsObject';

/**
 * @type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
 * 
 * @export
 */
export type RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = RunStepDetailsToolCallsCodeOutputImageObject | RunStepDetailsToolCallsCodeOutputLogsObject;

export function RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerFromJSON(json: any): RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerFromJSONTyped(json, false);
}

export function RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    if (json == null) {
        return json;
    }
    if (instanceOfRunStepDetailsToolCallsCodeOutputImageObject(json)) {
        return RunStepDetailsToolCallsCodeOutputImageObjectFromJSONTyped(json, true);
    }
    if (instanceOfRunStepDetailsToolCallsCodeOutputLogsObject(json)) {
        return RunStepDetailsToolCallsCodeOutputLogsObjectFromJSONTyped(json, true);
    }

    return {} as any;
}

export function RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerToJSON(value?: RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfRunStepDetailsToolCallsCodeOutputImageObject(value)) {
        return RunStepDetailsToolCallsCodeOutputImageObjectToJSON(value as RunStepDetailsToolCallsCodeOutputImageObject);
    }
    if (instanceOfRunStepDetailsToolCallsCodeOutputLogsObject(value)) {
        return RunStepDetailsToolCallsCodeOutputLogsObjectToJSON(value as RunStepDetailsToolCallsCodeOutputLogsObject);
    }

    return {};
}

