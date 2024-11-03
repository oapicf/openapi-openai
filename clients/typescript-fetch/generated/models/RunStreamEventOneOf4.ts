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
import type { RunObject } from './RunObject';
import {
    RunObjectFromJSON,
    RunObjectFromJSONTyped,
    RunObjectToJSON,
    RunObjectToJSONTyped,
} from './RunObject';

/**
 * Occurs when a [run](/docs/api-reference/runs/object) is completed.
 * @export
 * @interface RunStreamEventOneOf4
 */
export interface RunStreamEventOneOf4 {
    /**
     * 
     * @type {string}
     * @memberof RunStreamEventOneOf4
     */
    event: RunStreamEventOneOf4EventEnum;
    /**
     * 
     * @type {RunObject}
     * @memberof RunStreamEventOneOf4
     */
    data: RunObject;
}


/**
 * @export
 */
export const RunStreamEventOneOf4EventEnum = {
    ThreadRunCompleted: 'thread.run.completed'
} as const;
export type RunStreamEventOneOf4EventEnum = typeof RunStreamEventOneOf4EventEnum[keyof typeof RunStreamEventOneOf4EventEnum];


/**
 * Check if a given object implements the RunStreamEventOneOf4 interface.
 */
export function instanceOfRunStreamEventOneOf4(value: object): value is RunStreamEventOneOf4 {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function RunStreamEventOneOf4FromJSON(json: any): RunStreamEventOneOf4 {
    return RunStreamEventOneOf4FromJSONTyped(json, false);
}

export function RunStreamEventOneOf4FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStreamEventOneOf4 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

  export function RunStreamEventOneOf4ToJSON(json: any): RunStreamEventOneOf4 {
      return RunStreamEventOneOf4ToJSONTyped(json, false);
  }

  export function RunStreamEventOneOf4ToJSONTyped(value?: RunStreamEventOneOf4 | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': RunObjectToJSON(value['data']),
    };
}

