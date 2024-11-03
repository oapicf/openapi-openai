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

import type { RunStepDetailsToolCallsCodeObject } from './RunStepDetailsToolCallsCodeObject';
import {
    instanceOfRunStepDetailsToolCallsCodeObject,
    RunStepDetailsToolCallsCodeObjectFromJSON,
    RunStepDetailsToolCallsCodeObjectFromJSONTyped,
    RunStepDetailsToolCallsCodeObjectToJSON,
} from './RunStepDetailsToolCallsCodeObject';
import type { RunStepDetailsToolCallsFunctionObject } from './RunStepDetailsToolCallsFunctionObject';
import {
    instanceOfRunStepDetailsToolCallsFunctionObject,
    RunStepDetailsToolCallsFunctionObjectFromJSON,
    RunStepDetailsToolCallsFunctionObjectFromJSONTyped,
    RunStepDetailsToolCallsFunctionObjectToJSON,
} from './RunStepDetailsToolCallsFunctionObject';
import type { RunStepDetailsToolCallsRetrievalObject } from './RunStepDetailsToolCallsRetrievalObject';
import {
    instanceOfRunStepDetailsToolCallsRetrievalObject,
    RunStepDetailsToolCallsRetrievalObjectFromJSON,
    RunStepDetailsToolCallsRetrievalObjectFromJSONTyped,
    RunStepDetailsToolCallsRetrievalObjectToJSON,
} from './RunStepDetailsToolCallsRetrievalObject';

/**
 * @type RunStepDetailsToolCallsObjectToolCallsInner
 * 
 * @export
 */
export type RunStepDetailsToolCallsObjectToolCallsInner = RunStepDetailsToolCallsCodeObject | RunStepDetailsToolCallsFunctionObject | RunStepDetailsToolCallsRetrievalObject;

export function RunStepDetailsToolCallsObjectToolCallsInnerFromJSON(json: any): RunStepDetailsToolCallsObjectToolCallsInner {
    return RunStepDetailsToolCallsObjectToolCallsInnerFromJSONTyped(json, false);
}

export function RunStepDetailsToolCallsObjectToolCallsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDetailsToolCallsObjectToolCallsInner {
    if (json == null) {
        return json;
    }
    if (instanceOfRunStepDetailsToolCallsCodeObject(json)) {
        return RunStepDetailsToolCallsCodeObjectFromJSONTyped(json, true);
    }
    if (instanceOfRunStepDetailsToolCallsFunctionObject(json)) {
        return RunStepDetailsToolCallsFunctionObjectFromJSONTyped(json, true);
    }
    if (instanceOfRunStepDetailsToolCallsRetrievalObject(json)) {
        return RunStepDetailsToolCallsRetrievalObjectFromJSONTyped(json, true);
    }

    return {} as any;
}

export function RunStepDetailsToolCallsObjectToolCallsInnerToJSON(value?: RunStepDetailsToolCallsObjectToolCallsInner | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfRunStepDetailsToolCallsCodeObject(value)) {
        return RunStepDetailsToolCallsCodeObjectToJSON(value as RunStepDetailsToolCallsCodeObject);
    }
    if (instanceOfRunStepDetailsToolCallsFunctionObject(value)) {
        return RunStepDetailsToolCallsFunctionObjectToJSON(value as RunStepDetailsToolCallsFunctionObject);
    }
    if (instanceOfRunStepDetailsToolCallsRetrievalObject(value)) {
        return RunStepDetailsToolCallsRetrievalObjectToJSON(value as RunStepDetailsToolCallsRetrievalObject);
    }

    return {};
}

