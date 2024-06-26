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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 * @export
 * @interface RunStreamEventOneOf3
 */
export interface RunStreamEventOneOf3 {
    /**
     * 
     * @type {string}
     * @memberof RunStreamEventOneOf3
     */
    event: RunStreamEventOneOf3EventEnum;
    /**
     * 
     * @type {RunObject}
     * @memberof RunStreamEventOneOf3
     */
    data: RunObject;
}


/**
 * @export
 */
export const RunStreamEventOneOf3EventEnum = {
    ThreadRunRequiresAction: 'thread.run.requires_action'
} as const;
export type RunStreamEventOneOf3EventEnum = typeof RunStreamEventOneOf3EventEnum[keyof typeof RunStreamEventOneOf3EventEnum];


/**
 * Check if a given object implements the RunStreamEventOneOf3 interface.
 */
export function instanceOfRunStreamEventOneOf3(value: object): boolean {
    if (!('event' in value)) return false;
    if (!('data' in value)) return false;
    return true;
}

export function RunStreamEventOneOf3FromJSON(json: any): RunStreamEventOneOf3 {
    return RunStreamEventOneOf3FromJSONTyped(json, false);
}

export function RunStreamEventOneOf3FromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStreamEventOneOf3 {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

export function RunStreamEventOneOf3ToJSON(value?: RunStreamEventOneOf3 | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'event': value['event'],
        'data': RunObjectToJSON(value['data']),
    };
}

