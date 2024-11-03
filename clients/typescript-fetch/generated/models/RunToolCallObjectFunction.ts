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
/**
 * The function definition.
 * @export
 * @interface RunToolCallObjectFunction
 */
export interface RunToolCallObjectFunction {
    /**
     * The name of the function.
     * @type {string}
     * @memberof RunToolCallObjectFunction
     */
    name: string;
    /**
     * The arguments that the model expects you to pass to the function.
     * @type {string}
     * @memberof RunToolCallObjectFunction
     */
    arguments: string;
}

/**
 * Check if a given object implements the RunToolCallObjectFunction interface.
 */
export function instanceOfRunToolCallObjectFunction(value: object): value is RunToolCallObjectFunction {
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('arguments' in value) || value['arguments'] === undefined) return false;
    return true;
}

export function RunToolCallObjectFunctionFromJSON(json: any): RunToolCallObjectFunction {
    return RunToolCallObjectFunctionFromJSONTyped(json, false);
}

export function RunToolCallObjectFunctionFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunToolCallObjectFunction {
    if (json == null) {
        return json;
    }
    return {
        
        'name': json['name'],
        'arguments': json['arguments'],
    };
}

  export function RunToolCallObjectFunctionToJSON(json: any): RunToolCallObjectFunction {
      return RunToolCallObjectFunctionToJSONTyped(json, false);
  }

  export function RunToolCallObjectFunctionToJSONTyped(value?: RunToolCallObjectFunction | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'name': value['name'],
        'arguments': value['arguments'],
    };
}

