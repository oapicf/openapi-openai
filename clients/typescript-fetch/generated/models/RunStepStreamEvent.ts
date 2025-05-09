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

import type { RunStepStreamEventOneOf } from './RunStepStreamEventOneOf';
import {
    instanceOfRunStepStreamEventOneOf,
    RunStepStreamEventOneOfFromJSON,
    RunStepStreamEventOneOfFromJSONTyped,
    RunStepStreamEventOneOfToJSON,
} from './RunStepStreamEventOneOf';
import type { RunStepStreamEventOneOf1 } from './RunStepStreamEventOneOf1';
import {
    instanceOfRunStepStreamEventOneOf1,
    RunStepStreamEventOneOf1FromJSON,
    RunStepStreamEventOneOf1FromJSONTyped,
    RunStepStreamEventOneOf1ToJSON,
} from './RunStepStreamEventOneOf1';
import type { RunStepStreamEventOneOf2 } from './RunStepStreamEventOneOf2';
import {
    instanceOfRunStepStreamEventOneOf2,
    RunStepStreamEventOneOf2FromJSON,
    RunStepStreamEventOneOf2FromJSONTyped,
    RunStepStreamEventOneOf2ToJSON,
} from './RunStepStreamEventOneOf2';
import type { RunStepStreamEventOneOf3 } from './RunStepStreamEventOneOf3';
import {
    instanceOfRunStepStreamEventOneOf3,
    RunStepStreamEventOneOf3FromJSON,
    RunStepStreamEventOneOf3FromJSONTyped,
    RunStepStreamEventOneOf3ToJSON,
} from './RunStepStreamEventOneOf3';
import type { RunStepStreamEventOneOf4 } from './RunStepStreamEventOneOf4';
import {
    instanceOfRunStepStreamEventOneOf4,
    RunStepStreamEventOneOf4FromJSON,
    RunStepStreamEventOneOf4FromJSONTyped,
    RunStepStreamEventOneOf4ToJSON,
} from './RunStepStreamEventOneOf4';
import type { RunStepStreamEventOneOf5 } from './RunStepStreamEventOneOf5';
import {
    instanceOfRunStepStreamEventOneOf5,
    RunStepStreamEventOneOf5FromJSON,
    RunStepStreamEventOneOf5FromJSONTyped,
    RunStepStreamEventOneOf5ToJSON,
} from './RunStepStreamEventOneOf5';
import type { RunStepStreamEventOneOf6 } from './RunStepStreamEventOneOf6';
import {
    instanceOfRunStepStreamEventOneOf6,
    RunStepStreamEventOneOf6FromJSON,
    RunStepStreamEventOneOf6FromJSONTyped,
    RunStepStreamEventOneOf6ToJSON,
} from './RunStepStreamEventOneOf6';

/**
 * @type RunStepStreamEvent
 * 
 * @export
 */
export type RunStepStreamEvent = RunStepStreamEventOneOf | RunStepStreamEventOneOf1 | RunStepStreamEventOneOf2 | RunStepStreamEventOneOf3 | RunStepStreamEventOneOf4 | RunStepStreamEventOneOf5 | RunStepStreamEventOneOf6;

export function RunStepStreamEventFromJSON(json: any): RunStepStreamEvent {
    return RunStepStreamEventFromJSONTyped(json, false);
}

export function RunStepStreamEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepStreamEvent {
    if (json == null) {
        return json;
    }
    if (instanceOfRunStepStreamEventOneOf(json)) {
        return RunStepStreamEventOneOfFromJSONTyped(json, true);
    }
    if (instanceOfRunStepStreamEventOneOf1(json)) {
        return RunStepStreamEventOneOf1FromJSONTyped(json, true);
    }
    if (instanceOfRunStepStreamEventOneOf2(json)) {
        return RunStepStreamEventOneOf2FromJSONTyped(json, true);
    }
    if (instanceOfRunStepStreamEventOneOf3(json)) {
        return RunStepStreamEventOneOf3FromJSONTyped(json, true);
    }
    if (instanceOfRunStepStreamEventOneOf4(json)) {
        return RunStepStreamEventOneOf4FromJSONTyped(json, true);
    }
    if (instanceOfRunStepStreamEventOneOf5(json)) {
        return RunStepStreamEventOneOf5FromJSONTyped(json, true);
    }
    if (instanceOfRunStepStreamEventOneOf6(json)) {
        return RunStepStreamEventOneOf6FromJSONTyped(json, true);
    }

    return {} as any;
}

export function RunStepStreamEventToJSON(value?: RunStepStreamEvent | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfRunStepStreamEventOneOf(value)) {
        return RunStepStreamEventOneOfToJSON(value as RunStepStreamEventOneOf);
    }
    if (instanceOfRunStepStreamEventOneOf1(value)) {
        return RunStepStreamEventOneOf1ToJSON(value as RunStepStreamEventOneOf1);
    }
    if (instanceOfRunStepStreamEventOneOf2(value)) {
        return RunStepStreamEventOneOf2ToJSON(value as RunStepStreamEventOneOf2);
    }
    if (instanceOfRunStepStreamEventOneOf3(value)) {
        return RunStepStreamEventOneOf3ToJSON(value as RunStepStreamEventOneOf3);
    }
    if (instanceOfRunStepStreamEventOneOf4(value)) {
        return RunStepStreamEventOneOf4ToJSON(value as RunStepStreamEventOneOf4);
    }
    if (instanceOfRunStepStreamEventOneOf5(value)) {
        return RunStepStreamEventOneOf5ToJSON(value as RunStepStreamEventOneOf5);
    }
    if (instanceOfRunStepStreamEventOneOf6(value)) {
        return RunStepStreamEventOneOf6ToJSON(value as RunStepStreamEventOneOf6);
    }

    return {};
}

