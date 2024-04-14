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

/**
 * @type CreateEmbeddingRequestInput
 * Input text to embed, encoded as a string or array of tokens. To embed multiple inputs in a single request, pass an array of strings or array of token arrays. Each input must not exceed the max input tokens for the model (8191 tokens for `text-embedding-ada-002`). [Example Python code](https://github.com/openai/openai-cookbook/blob/main/examples/How_to_count_tokens_with_tiktoken.ipynb) for counting tokens.
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
    return { ...Array<Array<number>>FromJSONTyped(json, true), ...Array<number>FromJSONTyped(json, true), ...Array<string>FromJSONTyped(json, true), ...stringFromJSONTyped(json, true) };
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
