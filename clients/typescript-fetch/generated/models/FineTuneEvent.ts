/* tslint:disable */
/* eslint-disable */
/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
 * 
 * @export
 * @interface FineTuneEvent
 */
export interface FineTuneEvent {
    /**
     * 
     * @type {string}
     * @memberof FineTuneEvent
     */
    object: string;
    /**
     * 
     * @type {number}
     * @memberof FineTuneEvent
     */
    createdAt: number;
    /**
     * 
     * @type {string}
     * @memberof FineTuneEvent
     */
    level: string;
    /**
     * 
     * @type {string}
     * @memberof FineTuneEvent
     */
    message: string;
}

/**
 * Check if a given object implements the FineTuneEvent interface.
 */
export function instanceOfFineTuneEvent(value: object): boolean {
    if (!('object' in value)) return false;
    if (!('createdAt' in value)) return false;
    if (!('level' in value)) return false;
    if (!('message' in value)) return false;
    return true;
}

export function FineTuneEventFromJSON(json: any): FineTuneEvent {
    return FineTuneEventFromJSONTyped(json, false);
}

export function FineTuneEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): FineTuneEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'object': json['object'],
        'createdAt': json['created_at'],
        'level': json['level'],
        'message': json['message'],
    };
}

export function FineTuneEventToJSON(value?: FineTuneEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'object': value['object'],
        'created_at': value['createdAt'],
        'level': value['level'],
        'message': value['message'],
    };
}

