// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    RunStepObject,
    RunStepObjectFromJSON,
    RunStepObjectToJSON,
} from './';

/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) moves to an `in_progress` state.
 * @export
 * @interface RunStepStreamEventOneOf1
 */
export interface RunStepStreamEventOneOf1  {
    /**
     * 
     * @type {string}
     * @memberof RunStepStreamEventOneOf1
     */
    event: RunStepStreamEventOneOf1EventEnum;
    /**
     * 
     * @type {RunStepObject}
     * @memberof RunStepStreamEventOneOf1
     */
    data: RunStepObject;
}

export function RunStepStreamEventOneOf1FromJSON(json: any): RunStepStreamEventOneOf1 {
    return {
        'event': json['event'],
        'data': RunStepObjectFromJSON(json['data']),
    };
}

export function RunStepStreamEventOneOf1ToJSON(value?: RunStepStreamEventOneOf1): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'event': value.event,
        'data': RunStepObjectToJSON(value.data),
    };
}

/**
* @export
* @enum {string}
*/
export enum RunStepStreamEventOneOf1EventEnum {
    ThreadRunStepInProgress = 'thread.run.step.in_progress'
}


