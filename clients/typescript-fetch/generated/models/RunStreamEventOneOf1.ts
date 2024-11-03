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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 * @export
 * @interface RunStreamEventOneOf1
 */
export interface RunStreamEventOneOf1 {
    /**
     * 
     * @type {string}
     * @memberof RunStreamEventOneOf1
     */
    event: RunStreamEventOneOf1EventEnum;
    /**
     * 
     * @type {RunObject}
     * @memberof RunStreamEventOneOf1
     */
    data: RunObject;
}


/**
 * @export
 */
export const RunStreamEventOneOf1EventEnum = {
    ThreadRunQueued: 'thread.run.queued'
} as const;
export type RunStreamEventOneOf1EventEnum = typeof RunStreamEventOneOf1EventEnum[keyof typeof RunStreamEventOneOf1EventEnum];


/**
 * Check if a given object implements the RunStreamEventOneOf1 interface.
 */
export function instanceOfRunStreamEventOneOf1(value: object): value is RunStreamEventOneOf1 {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function RunStreamEventOneOf1FromJSON(json: any): RunStreamEventOneOf1 {
    return RunStreamEventOneOf1FromJSONTyped(json, false);
}

export function RunStreamEventOneOf1FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStreamEventOneOf1 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

  export function RunStreamEventOneOf1ToJSON(json: any): RunStreamEventOneOf1 {
      return RunStreamEventOneOf1ToJSONTyped(json, false);
  }

  export function RunStreamEventOneOf1ToJSONTyped(value?: RunStreamEventOneOf1 | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': RunObjectToJSON(value['data']),
    };
}

