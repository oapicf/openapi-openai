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
    RunObject,
    RunObjectFromJSON,
    RunObjectToJSON,
} from './';

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 * @export
 * @interface RunStreamEventOneOf2
 */
export interface RunStreamEventOneOf2  {
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

export function RunStreamEventOneOf2FromJSON(json: any): RunStreamEventOneOf2 {
    return {
        'event': json['event'],
        'data': RunObjectFromJSON(json['data']),
    };
}

export function RunStreamEventOneOf2ToJSON(value?: RunStreamEventOneOf2): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'event': value.event,
        'data': RunObjectToJSON(value.data),
    };
}

/**
* @export
* @enum {string}
*/
export enum RunStreamEventOneOf2EventEnum {
    ThreadRunInProgress = 'thread.run.in_progress'
}


