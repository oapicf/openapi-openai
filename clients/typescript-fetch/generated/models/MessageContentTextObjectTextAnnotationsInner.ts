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

import type { MessageContentTextAnnotationsFileCitationObject } from './MessageContentTextAnnotationsFileCitationObject';
import {
    instanceOfMessageContentTextAnnotationsFileCitationObject,
    MessageContentTextAnnotationsFileCitationObjectFromJSON,
    MessageContentTextAnnotationsFileCitationObjectFromJSONTyped,
    MessageContentTextAnnotationsFileCitationObjectToJSON,
} from './MessageContentTextAnnotationsFileCitationObject';
import type { MessageContentTextAnnotationsFilePathObject } from './MessageContentTextAnnotationsFilePathObject';
import {
    instanceOfMessageContentTextAnnotationsFilePathObject,
    MessageContentTextAnnotationsFilePathObjectFromJSON,
    MessageContentTextAnnotationsFilePathObjectFromJSONTyped,
    MessageContentTextAnnotationsFilePathObjectToJSON,
} from './MessageContentTextAnnotationsFilePathObject';

/**
 * @type MessageContentTextObjectTextAnnotationsInner
 * 
 * @export
 */
export type MessageContentTextObjectTextAnnotationsInner = MessageContentTextAnnotationsFileCitationObject | MessageContentTextAnnotationsFilePathObject;

export function MessageContentTextObjectTextAnnotationsInnerFromJSON(json: any): MessageContentTextObjectTextAnnotationsInner {
    return MessageContentTextObjectTextAnnotationsInnerFromJSONTyped(json, false);
}

export function MessageContentTextObjectTextAnnotationsInnerFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageContentTextObjectTextAnnotationsInner {
    if (json == null) {
        return json;
    }
    if (instanceOfMessageContentTextAnnotationsFileCitationObject(json)) {
        return MessageContentTextAnnotationsFileCitationObjectFromJSONTyped(json, true);
    }
    if (instanceOfMessageContentTextAnnotationsFilePathObject(json)) {
        return MessageContentTextAnnotationsFilePathObjectFromJSONTyped(json, true);
    }

    return {} as any;
}

export function MessageContentTextObjectTextAnnotationsInnerToJSON(value?: MessageContentTextObjectTextAnnotationsInner | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfMessageContentTextAnnotationsFileCitationObject(value)) {
        return MessageContentTextAnnotationsFileCitationObjectToJSON(value as MessageContentTextAnnotationsFileCitationObject);
    }
    if (instanceOfMessageContentTextAnnotationsFilePathObject(value)) {
        return MessageContentTextAnnotationsFilePathObjectToJSON(value as MessageContentTextAnnotationsFilePathObject);
    }

    return {};
}

