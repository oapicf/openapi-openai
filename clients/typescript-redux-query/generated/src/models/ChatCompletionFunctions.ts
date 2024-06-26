// tslint:disable
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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ChatCompletionFunctions
 */
export interface ChatCompletionFunctions  {
    /**
     * A description of what the function does, used by the model to choose when and how to call the function.
     * @type {string}
     * @memberof ChatCompletionFunctions
     */
    description?: string;
    /**
     * The name of the function to be called. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
     * @type {string}
     * @memberof ChatCompletionFunctions
     */
    name: string;
    /**
     * The parameters the functions accepts, described as a JSON Schema object. See the [guide](/docs/guides/text-generation/function-calling) for examples, and the [JSON Schema reference](https://json-schema.org/understanding-json-schema/) for documentation about the format.   Omitting `parameters` defines a function with an empty parameter list.
     * @type {{ [key: string]: any; }}
     * @memberof ChatCompletionFunctions
     */
    parameters?: { [key: string]: any; };
}

export function ChatCompletionFunctionsFromJSON(json: any): ChatCompletionFunctions {
    return {
        'description': !exists(json, 'description') ? undefined : json['description'],
        'name': json['name'],
        'parameters': !exists(json, 'parameters') ? undefined : json['parameters'],
    };
}

export function ChatCompletionFunctionsToJSON(value?: ChatCompletionFunctions): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'description': value.description,
        'name': value.name,
        'parameters': value.parameters,
    };
}


