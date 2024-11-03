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
import type { ThreadObject } from './ThreadObject';
import {
    ThreadObjectFromJSON,
    ThreadObjectFromJSONTyped,
    ThreadObjectToJSON,
    ThreadObjectToJSONTyped,
} from './ThreadObject';

/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 * @export
 * @interface ThreadStreamEventOneOf
 */
export interface ThreadStreamEventOneOf {
    /**
     * 
     * @type {string}
     * @memberof ThreadStreamEventOneOf
     */
    event: ThreadStreamEventOneOfEventEnum;
    /**
     * 
     * @type {ThreadObject}
     * @memberof ThreadStreamEventOneOf
     */
    data: ThreadObject;
}


/**
 * @export
 */
export const ThreadStreamEventOneOfEventEnum = {
    ThreadCreated: 'thread.created'
} as const;
export type ThreadStreamEventOneOfEventEnum = typeof ThreadStreamEventOneOfEventEnum[keyof typeof ThreadStreamEventOneOfEventEnum];


/**
 * Check if a given object implements the ThreadStreamEventOneOf interface.
 */
export function instanceOfThreadStreamEventOneOf(value: object): value is ThreadStreamEventOneOf {
    if (!('event' in value) || value['event'] === undefined) return false;
    if (!('data' in value) || value['data'] === undefined) return false;
    return true;
}

export function ThreadStreamEventOneOfFromJSON(json: any): ThreadStreamEventOneOf {
    return ThreadStreamEventOneOfFromJSONTyped(json, false);
}

export function ThreadStreamEventOneOfFromJSONTyped(json: any, ignoreDiscriminator: boolean): ThreadStreamEventOneOf {
    if (json == null) {
        return json;
    }
    return {
        
        'event': json['event'],
        'data': ThreadObjectFromJSON(json['data']),
    };
}

  export function ThreadStreamEventOneOfToJSON(json: any): ThreadStreamEventOneOf {
      return ThreadStreamEventOneOfToJSONTyped(json, false);
  }

  export function ThreadStreamEventOneOfToJSONTyped(value?: ThreadStreamEventOneOf | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'event': value['event'],
        'data': ThreadObjectToJSON(value['data']),
    };
}

