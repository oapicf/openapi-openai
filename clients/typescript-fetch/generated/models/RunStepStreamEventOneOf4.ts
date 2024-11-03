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

import { mapValues } from '../runtime';
import type { RunStepObject } from './RunStepObject';
import {
    RunStepObjectFromJSON,
    RunStepObjectFromJSONTyped,
    RunStepObjectToJSON,
    RunStepObjectToJSONTyped,
} from './RunStepObject';

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
 * @export
 * @interface RunStepStreamEventOneOf4
 */
export interface RunStepStreamEventOneOf4 {
    /**
     * 
     * @type {string}
     * @memberof RunStepStreamEventOneOf4
     */
    event: RunStepStreamEventOneOf4EventEnum;
    /**
     * 
     * @type {RunStepObject}
     * @memberof RunStepStreamEventOneOf4
     */
    data: RunStepObject;
}


/**
 * @export
 */
export const RunStepStreamEventOneOf4EventEnum = {
    ThreadRunStepFailed: 'thread.run.step.failed'
} as const;
export type RunStepStreamEventOneOf4EventEnum = typeof RunStepStreamEventOneOf4EventEnum[keyof typeof RunStepStreamEventOneOf4EventEnum];


/**
 * Check if a given object implements the RunStepStreamEventOneOf4 interface.
 */
export function instanceOfRunStepStreamEventOneOf4(value: object): value is RunStepStreamEventOneOf4 {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function RunStepStreamEventOneOf4FromJSON(json: any): RunStepStreamEventOneOf4 {
    return RunStepStreamEventOneOf4FromJSONTyped(json, false);
}

export function RunStepStreamEventOneOf4FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepStreamEventOneOf4 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunStepObjectFromJSON(json['data']),
    };
}

  export function RunStepStreamEventOneOf4ToJSON(json: any): RunStepStreamEventOneOf4 {
      return RunStepStreamEventOneOf4ToJSONTyped(json, false);
  }

  export function RunStepStreamEventOneOf4ToJSONTyped(value?: RunStepStreamEventOneOf4 | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': RunStepObjectToJSON(value['data']),
    };
}

