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

import type { RunStepDeltaStepDetailsToolCallsCodeOutputImageObject } from './RunStepDeltaStepDetailsToolCallsCodeOutputImageObject';
import {
    instanceOfRunStepDeltaStepDetailsToolCallsCodeOutputImageObject,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectFromJSON,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectFromJSONTyped,
    RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectToJSON,
} from './RunStepDeltaStepDetailsToolCallsCodeOutputImageObject';
import type { RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject } from './RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject';
import {
    instanceOfRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject,
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectFromJSON,
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectFromJSONTyped,
    RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectToJSON,
} from './RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject';

/**
 * @type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner
 * 
 * @export
 */
export type RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner = RunStepDeltaStepDetailsToolCallsCodeOutputImageObject | RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;

export function RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerFromJSON(json: any): RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    return RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerFromJSONTyped(json, false);
}

export function RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    if (json == null) {
        return json;
    }
    if (instanceOfRunStepDeltaStepDetailsToolCallsCodeOutputImageObject(json)) {
        return RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectFromJSONTyped(json, true);
    }
    if (instanceOfRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(json)) {
        return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectFromJSONTyped(json, true);
    }

    return {} as any;
}

export function RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInnerToJSON(value?: RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfRunStepDeltaStepDetailsToolCallsCodeOutputImageObject(value)) {
        return RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectToJSON(value as RunStepDeltaStepDetailsToolCallsCodeOutputImageObject);
    }
    if (instanceOfRunStepDeltaStepDetailsToolCallsCodeOutputLogsObject(value)) {
        return RunStepDeltaStepDetailsToolCallsCodeOutputLogsObjectToJSON(value as RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject);
    }

    return {};
}

