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
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 * @export
 * @interface RunStreamEventOneOf5
 */
export interface RunStreamEventOneOf5 {
    /**
     * 
     * @type {string}
     * @memberof RunStreamEventOneOf5
     */
    event: RunStreamEventOneOf5EventEnum;
    /**
     * 
     * @type {RunObject}
     * @memberof RunStreamEventOneOf5
     */
    data: RunObject;
}


/**
 * @export
 */
export const RunStreamEventOneOf5EventEnum = {
    ThreadRunFailed: 'thread.run.failed'
} as const;
export type RunStreamEventOneOf5EventEnum = typeof RunStreamEventOneOf5EventEnum[keyof typeof RunStreamEventOneOf5EventEnum];


/**
 * Check if a given object implements the RunStreamEventOneOf5 interface.
 */
export function instanceOfRunStreamEventOneOf5(value: object): value is RunStreamEventOneOf5 {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function RunStreamEventOneOf5FromJSON(json: any): RunStreamEventOneOf5 {
    return RunStreamEventOneOf5FromJSONTyped(json, false);
}

export function RunStreamEventOneOf5FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStreamEventOneOf5 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

  export function RunStreamEventOneOf5ToJSON(json: any): RunStreamEventOneOf5 {
      return RunStreamEventOneOf5ToJSONTyped(json, false);
  }

  export function RunStreamEventOneOf5ToJSONTyped(value?: RunStreamEventOneOf5 | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': RunObjectToJSON(value['data']),
    };
}

