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
 * @type CreateCompletionRequestPrompt
 * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.
 * 
 * Note that <|endoftext|> is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document.
 * 
 * @export
 */
export type CreateCompletionRequestPrompt = Array<Array<number>> | Array<number> | Array<string> | string;

export function CreateCompletionRequestPromptFromJSON(json: any): CreateCompletionRequestPrompt {
    return CreateCompletionRequestPromptFromJSONTyped(json, false);
}

export function CreateCompletionRequestPromptFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateCompletionRequestPrompt {
    if (json == null) {
        return json;
    }
    return { ...Array<Array<number>>FromJSONTyped(json, true), ...Array<number>FromJSONTyped(json, true), ...Array<string>FromJSONTyped(json, true), ...stringFromJSONTyped(json, true) };
}

export function CreateCompletionRequestPromptToJSON(value?: CreateCompletionRequestPrompt | null): any {
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

