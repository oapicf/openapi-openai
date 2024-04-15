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
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is cancelled.
 * @export
 * @interface RunStepStreamEventOneOf5
 */
export interface RunStepStreamEventOneOf5  {
    /**
     * 
     * @type {string}
     * @memberof RunStepStreamEventOneOf5
     */
    event: RunStepStreamEventOneOf5EventEnum;
    /**
     * 
     * @type {RunStepObject}
     * @memberof RunStepStreamEventOneOf5
     */
    data: RunStepObject;
}

export function RunStepStreamEventOneOf5FromJSON(json: any): RunStepStreamEventOneOf5 {
    return {
        'event': json['event'],
        'data': RunStepObjectFromJSON(json['data']),
    };
}

export function RunStepStreamEventOneOf5ToJSON(value?: RunStepStreamEventOneOf5): any {
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
export enum RunStepStreamEventOneOf5EventEnum {
    ThreadRunStepCancelled = 'thread.run.step.cancelled'
}

