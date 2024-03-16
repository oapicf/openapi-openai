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
import type { FineTune } from './FineTune';
import {
    FineTuneFromJSON,
    FineTuneFromJSONTyped,
    FineTuneToJSON,
} from './FineTune';

/**
 * 
 * @export
 * @interface ListFineTunesResponse
 */
export interface ListFineTunesResponse {
    /**
     * 
     * @type {string}
     * @memberof ListFineTunesResponse
     */
    object: string;
    /**
     * 
     * @type {Array<FineTune>}
     * @memberof ListFineTunesResponse
     */
    data: Array<FineTune>;
}

/**
 * Check if a given object implements the ListFineTunesResponse interface.
 */
export function instanceOfListFineTunesResponse(value: object): boolean {
    if (!('object' in value)) return false;
    if (!('data' in value)) return false;
    return true;
}

export function ListFineTunesResponseFromJSON(json: any): ListFineTunesResponse {
    return ListFineTunesResponseFromJSONTyped(json, false);
}

export function ListFineTunesResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): ListFineTunesResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'object': json['object'],
        'data': ((json['data'] as Array<any>).map(FineTuneFromJSON)),
    };
}

export function ListFineTunesResponseToJSON(value?: ListFineTunesResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'object': value['object'],
        'data': ((value['data'] as Array<any>).map(FineTuneToJSON)),
    };
}

