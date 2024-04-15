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

import type { MessageStreamEventOneOf } from './MessageStreamEventOneOf';
import {
    instanceOfMessageStreamEventOneOf,
    MessageStreamEventOneOfFromJSON,
    MessageStreamEventOneOfFromJSONTyped,
    MessageStreamEventOneOfToJSON,
} from './MessageStreamEventOneOf';
import type { MessageStreamEventOneOf1 } from './MessageStreamEventOneOf1';
import {
    instanceOfMessageStreamEventOneOf1,
    MessageStreamEventOneOf1FromJSON,
    MessageStreamEventOneOf1FromJSONTyped,
    MessageStreamEventOneOf1ToJSON,
} from './MessageStreamEventOneOf1';
import type { MessageStreamEventOneOf2 } from './MessageStreamEventOneOf2';
import {
    instanceOfMessageStreamEventOneOf2,
    MessageStreamEventOneOf2FromJSON,
    MessageStreamEventOneOf2FromJSONTyped,
    MessageStreamEventOneOf2ToJSON,
} from './MessageStreamEventOneOf2';
import type { MessageStreamEventOneOf3 } from './MessageStreamEventOneOf3';
import {
    instanceOfMessageStreamEventOneOf3,
    MessageStreamEventOneOf3FromJSON,
    MessageStreamEventOneOf3FromJSONTyped,
    MessageStreamEventOneOf3ToJSON,
} from './MessageStreamEventOneOf3';
import type { MessageStreamEventOneOf4 } from './MessageStreamEventOneOf4';
import {
    instanceOfMessageStreamEventOneOf4,
    MessageStreamEventOneOf4FromJSON,
    MessageStreamEventOneOf4FromJSONTyped,
    MessageStreamEventOneOf4ToJSON,
} from './MessageStreamEventOneOf4';

/**
 * @type MessageStreamEvent
 * 
 * @export
 */
export type MessageStreamEvent = MessageStreamEventOneOf | MessageStreamEventOneOf1 | MessageStreamEventOneOf2 | MessageStreamEventOneOf3 | MessageStreamEventOneOf4;

export function MessageStreamEventFromJSON(json: any): MessageStreamEvent {
    return MessageStreamEventFromJSONTyped(json, false);
}

export function MessageStreamEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageStreamEvent {
    if (json == null) {
        return json;
    }
    return { ...MessageStreamEventOneOfFromJSONTyped(json, true), ...MessageStreamEventOneOf1FromJSONTyped(json, true), ...MessageStreamEventOneOf2FromJSONTyped(json, true), ...MessageStreamEventOneOf3FromJSONTyped(json, true), ...MessageStreamEventOneOf4FromJSONTyped(json, true) };
}

export function MessageStreamEventToJSON(value?: MessageStreamEvent | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfMessageStreamEventOneOf(value)) {
        return MessageStreamEventOneOfToJSON(value as MessageStreamEventOneOf);
    }
    if (instanceOfMessageStreamEventOneOf1(value)) {
        return MessageStreamEventOneOf1ToJSON(value as MessageStreamEventOneOf1);
    }
    if (instanceOfMessageStreamEventOneOf2(value)) {
        return MessageStreamEventOneOf2ToJSON(value as MessageStreamEventOneOf2);
    }
    if (instanceOfMessageStreamEventOneOf3(value)) {
        return MessageStreamEventOneOf3ToJSON(value as MessageStreamEventOneOf3);
    }
    if (instanceOfMessageStreamEventOneOf4(value)) {
        return MessageStreamEventOneOf4ToJSON(value as MessageStreamEventOneOf4);
    }

    return {};
}
