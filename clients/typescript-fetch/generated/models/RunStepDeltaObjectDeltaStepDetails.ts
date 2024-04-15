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

import type { RunStepDeltaStepDetailsMessageCreationObject } from './RunStepDeltaStepDetailsMessageCreationObject';
import {
    instanceOfRunStepDeltaStepDetailsMessageCreationObject,
    RunStepDeltaStepDetailsMessageCreationObjectFromJSON,
    RunStepDeltaStepDetailsMessageCreationObjectFromJSONTyped,
    RunStepDeltaStepDetailsMessageCreationObjectToJSON,
} from './RunStepDeltaStepDetailsMessageCreationObject';
import type { RunStepDeltaStepDetailsToolCallsObject } from './RunStepDeltaStepDetailsToolCallsObject';
import {
    instanceOfRunStepDeltaStepDetailsToolCallsObject,
    RunStepDeltaStepDetailsToolCallsObjectFromJSON,
    RunStepDeltaStepDetailsToolCallsObjectFromJSONTyped,
    RunStepDeltaStepDetailsToolCallsObjectToJSON,
} from './RunStepDeltaStepDetailsToolCallsObject';

/**
 * @type RunStepDeltaObjectDeltaStepDetails
 * The details of the run step.
 * @export
 */
export type RunStepDeltaObjectDeltaStepDetails = RunStepDeltaStepDetailsMessageCreationObject | RunStepDeltaStepDetailsToolCallsObject;

export function RunStepDeltaObjectDeltaStepDetailsFromJSON(json: any): RunStepDeltaObjectDeltaStepDetails {
    return RunStepDeltaObjectDeltaStepDetailsFromJSONTyped(json, false);
}

export function RunStepDeltaObjectDeltaStepDetailsFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDeltaObjectDeltaStepDetails {
    if (json == null) {
        return json;
    }
    return { ...RunStepDeltaStepDetailsMessageCreationObjectFromJSONTyped(json, true), ...RunStepDeltaStepDetailsToolCallsObjectFromJSONTyped(json, true) };
}

export function RunStepDeltaObjectDeltaStepDetailsToJSON(value?: RunStepDeltaObjectDeltaStepDetails | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfRunStepDeltaStepDetailsMessageCreationObject(value)) {
        return RunStepDeltaStepDetailsMessageCreationObjectToJSON(value as RunStepDeltaStepDetailsMessageCreationObject);
    }
    if (instanceOfRunStepDeltaStepDetailsToolCallsObject(value)) {
        return RunStepDeltaStepDetailsToolCallsObjectToJSON(value as RunStepDeltaStepDetailsToolCallsObject);
    }

    return {};
}
