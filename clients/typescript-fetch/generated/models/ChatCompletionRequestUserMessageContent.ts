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

/**
 * @type ChatCompletionRequestUserMessageContent
 * The contents of the user message.
 * 
 * @export
 */
export type ChatCompletionRequestUserMessageContent = Array<ChatCompletionRequestMessageContentPart> | string;

export function ChatCompletionRequestUserMessageContentFromJSON(json: any): ChatCompletionRequestUserMessageContent {
    return ChatCompletionRequestUserMessageContentFromJSONTyped(json, false);
}

export function ChatCompletionRequestUserMessageContentFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionRequestUserMessageContent {
    if (json == null) {
        return json;
    }
    if (instanceOfArray<ChatCompletionRequestMessageContentPart>(json)) {
        return Array<ChatCompletionRequestMessageContentPart>FromJSONTyped(json, true);
    }
    if (instanceOfstring(json)) {
        return stringFromJSONTyped(json, true);
    }

    return {} as any;
}

export function ChatCompletionRequestUserMessageContentToJSON(value?: ChatCompletionRequestUserMessageContent | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfArray<ChatCompletionRequestMessageContentPart>(value)) {
        return Array<ChatCompletionRequestMessageContentPart>ToJSON(value as Array<ChatCompletionRequestMessageContentPart>);
    }
    if (instanceOfstring(value)) {
        return stringToJSON(value as string);
    }

    return {};
}

