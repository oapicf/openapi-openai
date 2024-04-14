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
import type { RunStepDeltaObjectDelta } from './RunStepDeltaObjectDelta';
import {
    RunStepDeltaObjectDeltaFromJSON,
    RunStepDeltaObjectDeltaFromJSONTyped,
    RunStepDeltaObjectDeltaToJSON,
} from './RunStepDeltaObjectDelta';

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming.
 * 
 * @export
 * @interface RunStepDeltaObject
 */
export interface RunStepDeltaObject {
    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     * @type {string}
     * @memberof RunStepDeltaObject
     */
    id: string;
    /**
     * The object type, which is always `thread.run.step.delta`.
     * @type {string}
     * @memberof RunStepDeltaObject
     */
    object: RunStepDeltaObjectObjectEnum;
    /**
     * 
     * @type {RunStepDeltaObjectDelta}
     * @memberof RunStepDeltaObject
     */
    delta: RunStepDeltaObjectDelta;
}


/**
 * @export
 */
export const RunStepDeltaObjectObjectEnum = {
    ThreadRunStepDelta: 'thread.run.step.delta'
} as const;
export type RunStepDeltaObjectObjectEnum = typeof RunStepDeltaObjectObjectEnum[keyof typeof RunStepDeltaObjectObjectEnum];


/**
 * Check if a given object implements the RunStepDeltaObject interface.
 */
export function instanceOfRunStepDeltaObject(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('object' in value)) return false;
    if (!('delta' in value)) return false;
    return true;
}

export function RunStepDeltaObjectFromJSON(json: any): RunStepDeltaObject {
    return RunStepDeltaObjectFromJSONTyped(json, false);
}

export function RunStepDeltaObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDeltaObject {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'object': json['object'],
        'delta': RunStepDeltaObjectDeltaFromJSON(json['delta']),
    };
}

export function RunStepDeltaObjectToJSON(value?: RunStepDeltaObject | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'object': value['object'],
        'delta': RunStepDeltaObjectDeltaToJSON(value['delta']),
    };
}

