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

import type { ThreadStreamEventOneOf } from './ThreadStreamEventOneOf';
import {
    instanceOfThreadStreamEventOneOf,
    ThreadStreamEventOneOfFromJSON,
    ThreadStreamEventOneOfFromJSONTyped,
    ThreadStreamEventOneOfToJSON,
} from './ThreadStreamEventOneOf';

/**
 * @type ThreadStreamEvent
 * 
 * @export
 */
export type ThreadStreamEvent = ThreadStreamEventOneOf;

export function ThreadStreamEventFromJSON(json: any): ThreadStreamEvent {
    return ThreadStreamEventFromJSONTyped(json, false);
}

export function ThreadStreamEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): ThreadStreamEvent {
    if (json == null) {
        return json;
    }
    if (instanceOfThreadStreamEventOneOf(json)) {
        return ThreadStreamEventOneOfFromJSONTyped(json, true);
    }

    return {} as any;
}

export function ThreadStreamEventToJSON(value?: ThreadStreamEvent | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfThreadStreamEventOneOf(value)) {
        return ThreadStreamEventOneOfToJSON(value as ThreadStreamEventOneOf);
    }

    return {};
}

