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

import type { ChatCompletionRequestMessageContentPartImage } from './ChatCompletionRequestMessageContentPartImage';
import {
    instanceOfChatCompletionRequestMessageContentPartImage,
    ChatCompletionRequestMessageContentPartImageFromJSON,
    ChatCompletionRequestMessageContentPartImageFromJSONTyped,
    ChatCompletionRequestMessageContentPartImageToJSON,
} from './ChatCompletionRequestMessageContentPartImage';
import type { ChatCompletionRequestMessageContentPartText } from './ChatCompletionRequestMessageContentPartText';
import {
    instanceOfChatCompletionRequestMessageContentPartText,
    ChatCompletionRequestMessageContentPartTextFromJSON,
    ChatCompletionRequestMessageContentPartTextFromJSONTyped,
    ChatCompletionRequestMessageContentPartTextToJSON,
} from './ChatCompletionRequestMessageContentPartText';

/**
 * @type ChatCompletionRequestMessageContentPart
 * 
 * @export
 */
export type ChatCompletionRequestMessageContentPart = ChatCompletionRequestMessageContentPartImage | ChatCompletionRequestMessageContentPartText;

export function ChatCompletionRequestMessageContentPartFromJSON(json: any): ChatCompletionRequestMessageContentPart {
    return ChatCompletionRequestMessageContentPartFromJSONTyped(json, false);
}

export function ChatCompletionRequestMessageContentPartFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionRequestMessageContentPart {
    if (json == null) {
        return json;
    }
    return { ...ChatCompletionRequestMessageContentPartImageFromJSONTyped(json, true), ...ChatCompletionRequestMessageContentPartTextFromJSONTyped(json, true) };
}

export function ChatCompletionRequestMessageContentPartToJSON(value?: ChatCompletionRequestMessageContentPart | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfChatCompletionRequestMessageContentPartImage(value)) {
        return ChatCompletionRequestMessageContentPartImageToJSON(value as ChatCompletionRequestMessageContentPartImage);
    }
    if (instanceOfChatCompletionRequestMessageContentPartText(value)) {
        return ChatCompletionRequestMessageContentPartTextToJSON(value as ChatCompletionRequestMessageContentPartText);
    }

    return {};
}

