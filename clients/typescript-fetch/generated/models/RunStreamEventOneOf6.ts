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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
 * @export
 * @interface RunStreamEventOneOf6
 */
export interface RunStreamEventOneOf6 {
    /**
     * 
     * @type {string}
     * @memberof RunStreamEventOneOf6
     */
    event: RunStreamEventOneOf6EventEnum;
    /**
     * 
     * @type {RunObject}
     * @memberof RunStreamEventOneOf6
     */
    data: RunObject;
}


/**
 * @export
 */
export const RunStreamEventOneOf6EventEnum = {
    ThreadRunCancelling: 'thread.run.cancelling'
} as const;
export type RunStreamEventOneOf6EventEnum = typeof RunStreamEventOneOf6EventEnum[keyof typeof RunStreamEventOneOf6EventEnum];


/**
 * Check if a given object implements the RunStreamEventOneOf6 interface.
 */
export function instanceOfRunStreamEventOneOf6(value: object): value is RunStreamEventOneOf6 {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function RunStreamEventOneOf6FromJSON(json: any): RunStreamEventOneOf6 {
    return RunStreamEventOneOf6FromJSONTyped(json, false);
}

export function RunStreamEventOneOf6FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStreamEventOneOf6 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

  export function RunStreamEventOneOf6ToJSON(json: any): RunStreamEventOneOf6 {
      return RunStreamEventOneOf6ToJSONTyped(json, false);
  }

  export function RunStreamEventOneOf6ToJSONTyped(value?: RunStreamEventOneOf6 | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': RunObjectToJSON(value['data']),
    };
}

