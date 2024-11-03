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
import type { RunStepDetailsToolCallsCodeOutputImageObjectImage } from './RunStepDetailsToolCallsCodeOutputImageObjectImage';
import {
    RunStepDetailsToolCallsCodeOutputImageObjectImageFromJSON,
    RunStepDetailsToolCallsCodeOutputImageObjectImageFromJSONTyped,
    RunStepDetailsToolCallsCodeOutputImageObjectImageToJSON,
    RunStepDetailsToolCallsCodeOutputImageObjectImageToJSONTyped,
} from './RunStepDetailsToolCallsCodeOutputImageObjectImage';

/**
 * 
 * @export
 * @interface RunStepDetailsToolCallsCodeOutputImageObject
 */
export interface RunStepDetailsToolCallsCodeOutputImageObject {
    /**
     * Always `image`.
     * @type {string}
     * @memberof RunStepDetailsToolCallsCodeOutputImageObject
     */
    type: RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum;
    /**
     * 
     * @type {RunStepDetailsToolCallsCodeOutputImageObjectImage}
     * @memberof RunStepDetailsToolCallsCodeOutputImageObject
     */
    image: RunStepDetailsToolCallsCodeOutputImageObjectImage;
}


/**
 * @export
 */
export const RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum = {
    Image: 'image'
} as const;
export type RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum = typeof RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum[keyof typeof RunStepDetailsToolCallsCodeOutputImageObjectTypeEnum];


/**
 * Check if a given object implements the RunStepDetailsToolCallsCodeOutputImageObject interface.
 */
export function instanceOfRunStepDetailsToolCallsCodeOutputImageObject(value: object): value is RunStepDetailsToolCallsCodeOutputImageObject {
    if (!('type' in value) || value['type'] === undefined) return false;
    if (!('image' in value) || value['image'] === undefined) return false;
    return true;
}

export function RunStepDetailsToolCallsCodeOutputImageObjectFromJSON(json: any): RunStepDetailsToolCallsCodeOutputImageObject {
    return RunStepDetailsToolCallsCodeOutputImageObjectFromJSONTyped(json, false);
}

export function RunStepDetailsToolCallsCodeOutputImageObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDetailsToolCallsCodeOutputImageObject {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'],
        'image': RunStepDetailsToolCallsCodeOutputImageObjectImageFromJSON(json['image']),
    };
}

  export function RunStepDetailsToolCallsCodeOutputImageObjectToJSON(json: any): RunStepDetailsToolCallsCodeOutputImageObject {
      return RunStepDetailsToolCallsCodeOutputImageObjectToJSONTyped(json, false);
  }

  export function RunStepDetailsToolCallsCodeOutputImageObjectToJSONTyped(value?: RunStepDetailsToolCallsCodeOutputImageObject | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'type': value['type'],
        'image': RunStepDetailsToolCallsCodeOutputImageObjectImageToJSON(value['image']),
    };
}

