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

import type { AssistantsApiResponseFormat } from './AssistantsApiResponseFormat';
import {
    instanceOfAssistantsApiResponseFormat,
    AssistantsApiResponseFormatFromJSON,
    AssistantsApiResponseFormatFromJSONTyped,
    AssistantsApiResponseFormatToJSON,
} from './AssistantsApiResponseFormat';
import type { string } from './string';
import {
    instanceOfstring,
    stringFromJSON,
    stringFromJSONTyped,
    stringToJSON,
} from './string';

/**
 * @type AssistantsApiResponseFormatOption
 * Specifies the format that the model must output. Compatible with [GPT-4 Turbo](/docs/models/gpt-4-and-gpt-4-turbo) and all GPT-3.5 Turbo models newer than `gpt-3.5-turbo-1106`.
 * 
 * Setting to `{ "type": "json_object" }` enables JSON mode, which guarantees the message the model generates is valid JSON.
 * 
 * **Important:** when using JSON mode, you **must** also instruct the model to produce JSON yourself via a system or user message. Without this, the model may generate an unending stream of whitespace until the generation reaches the token limit, resulting in a long-running and seemingly "stuck" request. Also note that the message content may be partially cut off if `finish_reason="length"`, which indicates the generation exceeded `max_tokens` or the conversation exceeded the max context length.
 * 
 * @export
 */
export type AssistantsApiResponseFormatOption = AssistantsApiResponseFormat | string;

export function AssistantsApiResponseFormatOptionFromJSON(json: any): AssistantsApiResponseFormatOption {
    return AssistantsApiResponseFormatOptionFromJSONTyped(json, false);
}

export function AssistantsApiResponseFormatOptionFromJSONTyped(json: any, ignoreDiscriminator: boolean): AssistantsApiResponseFormatOption {
    if (json == null) {
        return json;
    }
    if (instanceOfAssistantsApiResponseFormat(json)) {
        return AssistantsApiResponseFormatFromJSONTyped(json, true);
    }
    if (instanceOfstring(json)) {
        return stringFromJSONTyped(json, true);
    }

    return {} as any;
}

export function AssistantsApiResponseFormatOptionToJSON(value?: AssistantsApiResponseFormatOption | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfAssistantsApiResponseFormat(value)) {
        return AssistantsApiResponseFormatToJSON(value as AssistantsApiResponseFormat);
    }
    if (instanceOfstring(value)) {
        return stringToJSON(value as string);
    }

    return {};
}

