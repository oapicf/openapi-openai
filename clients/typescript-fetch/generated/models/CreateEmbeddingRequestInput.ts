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
 * @type CreateEmbeddingRequestInput
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. The input must not exceed the max input tokens for the model (8192 tokens for `text-embedding-ada-002`), cannot be an empty string, and any array must be 2048 dimensions or less. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens.
 * 
 * @export
 */
export type CreateEmbeddingRequestInput = Array<Array<number>> | Array<number> | Array<string> | string;

export function CreateEmbeddingRequestInputFromJSON(json: any): CreateEmbeddingRequestInput {
    return CreateEmbeddingRequestInputFromJSONTyped(json, false);
}

export function CreateEmbeddingRequestInputFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateEmbeddingRequestInput {
    if (json == null) {
        return json;
    }
    if (instanceOfArray<Array<number>>(json)) {
        return Array<Array<number>>FromJSONTyped(json, true);
    }
    if (instanceOfArray<number>(json)) {
        return Array<number>FromJSONTyped(json, true);
    }
    if (instanceOfArray<string>(json)) {
        return Array<string>FromJSONTyped(json, true);
    }
    if (instanceOfstring(json)) {
        return stringFromJSONTyped(json, true);
    }

    return {} as any;
}

export function CreateEmbeddingRequestInputToJSON(value?: CreateEmbeddingRequestInput | null): any {
    if (value == null) {
        return value;
    }

    if (instanceOfArray<Array<number>>(value)) {
        return Array<Array<number>>ToJSON(value as Array<Array<number>>);
    }
    if (instanceOfArray<number>(value)) {
        return Array<number>ToJSON(value as Array<number>);
    }
    if (instanceOfArray<string>(value)) {
        return Array<string>ToJSON(value as Array<string>);
    }
    if (instanceOfstring(value)) {
        return stringToJSON(value as string);
    }

    return {};
}

