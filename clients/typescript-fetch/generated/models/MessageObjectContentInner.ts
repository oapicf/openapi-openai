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

import type { MessageContentImageFileObject } from './MessageContentImageFileObject';
import {
    instanceOfMessageContentImageFileObject,
    MessageContentImageFileObjectFromJSON,
    MessageContentImageFileObjectFromJSONTyped,
    MessageContentImageFileObjectToJSON,
} from './MessageContentImageFileObject';
import type { MessageContentTextObject } from './MessageContentTextObject';
import {
    instanceOfMessageContentTextObject,
    MessageContentTextObjectFromJSON,
    MessageContentTextObjectFromJSONTyped,
    MessageContentTextObjectToJSON,
} from './MessageContentTextObject';

/**
 * @type MessageObjectContentInner
 * 
 * @export
 */
export type MessageObjectContentInner = MessageContentImageFileObject | MessageContentTextObject;

export function MessageObjectContentInnerFromJSON(json: any): MessageObjectContentInner {
    return MessageObjectContentInnerFromJSONTyped(json, false);
}

export function MessageObjectContentInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageObjectContentInner {
    if (json == null) {
        return json;
    }
    if (instanceOfMessageContentImageFileObject(json)) {
        return MessageContentImageFileObjectFromJSONTyped(json, true);
    }
    if (instanceOfMessageContentTextObject(json)) {
        return MessageContentTextObjectFromJSONTyped(json, true);
    }

    return {} as any;
}

export function MessageObjectContentInnerToJSON(value?: MessageObjectContentInner | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfMessageContentImageFileObject(value)) {
        return MessageContentImageFileObjectToJSON(value as MessageContentImageFileObject);
    }
    if (instanceOfMessageContentTextObject(value)) {
        return MessageContentTextObjectToJSON(value as MessageContentTextObject);
    }

    return {};
}

