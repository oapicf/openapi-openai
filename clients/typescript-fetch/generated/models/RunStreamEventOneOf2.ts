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
} from './RunObject';

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 * @export
 * @interface RunStreamEventOneOf2
 */
export interface RunStreamEventOneOf2 {
    /**
     * 
     * @type {string}
     * @memberof RunStreamEventOneOf2
     */
    event: RunStreamEventOneOf2EventEnum;
    /**
     * 
     * @type {RunObject}
     * @memberof RunStreamEventOneOf2
     */
    data: RunObject;
}


/**
 * @export
 */
export const RunStreamEventOneOf2EventEnum = {
    ThreadRunInProgress: 'thread.run.in_progress'
} as const;
export type RunStreamEventOneOf2EventEnum = typeof RunStreamEventOneOf2EventEnum[keyof typeof RunStreamEventOneOf2EventEnum];


/**
 * Check if a given object implements the RunStreamEventOneOf2 interface.
 */
export function instanceOfRunStreamEventOneOf2(value: object): boolean {
    if (!('event' in value)) return false;
    if (!('data' in value)) return false;
    return true;
}

export function RunStreamEventOneOf2FromJSON(json: any): RunStreamEventOneOf2 {
    return RunStreamEventOneOf2FromJSONTyped(json, false);
}

export function RunStreamEventOneOf2FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStreamEventOneOf2 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

export function RunStreamEventOneOf2ToJSON(value?: RunStreamEventOneOf2 | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'event': value['event'],
        'data': RunObjectToJSON(value['data']),
    };
}

