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
import type { RunToolCallObjectFunction } from './RunToolCallObjectFunction';
import {
    RunToolCallObjectFunctionFromJSON,
    RunToolCallObjectFunctionFromJSONTyped,
    RunToolCallObjectFunctionToJSON,
    RunToolCallObjectFunctionToJSONTyped,
} from './RunToolCallObjectFunction';

/**
 * Tool call objects
 * @export
 * @interface RunToolCallObject
 */
export interface RunToolCallObject {
    /**
     * The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
     * @type {string}
     * @memberof RunToolCallObject
     */
    id: string;
    /**
     * The type of tool call the output is required for. For now, this is always `function`.
     * @type {string}
     * @memberof RunToolCallObject
     */
    type: RunToolCallObjectTypeEnum;
    /**
     * 
     * @type {RunToolCallObjectFunction}
     * @memberof RunToolCallObject
     */
    _function: RunToolCallObjectFunction;
}


/**
 * @export
 */
export const RunToolCallObjectTypeEnum = {
    Function: 'function'
} as const;
export type RunToolCallObjectTypeEnum = typeof RunToolCallObjectTypeEnum[keyof typeof RunToolCallObjectTypeEnum];


/**
 * Check if a given object implements the RunToolCallObject interface.
 */
export function instanceOfRunToolCallObject(value: object): value is RunToolCallObject {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    if (!('_function' in value) || value['_function'] === undefined) return false;
    return true;
}

export function RunToolCallObjectFromJSON(json: any): RunToolCallObject {
    return RunToolCallObjectFromJSONTyped(json, false);
}

export function RunToolCallObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunToolCallObject {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'type': json['type'],
        '_function': RunToolCallObjectFunctionFromJSON(json['function']),
    };
}

  export function RunToolCallObjectToJSON(json: any): RunToolCallObject {
      return RunToolCallObjectToJSONTyped(json, false);
  }

  export function RunToolCallObjectToJSONTyped(value?: RunToolCallObject | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'type': value['type'],
        'function': RunToolCallObjectFunctionToJSON(value['_function']),
    };
}

