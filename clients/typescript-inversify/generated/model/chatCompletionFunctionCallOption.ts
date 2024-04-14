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
 * Specifying a particular function via `{\"name\": \"my_function\"}` forces the model to call that function. 
 */
export interface ChatCompletionFunctionCallOption { 
    /**
     * The name of the function to call.
     */
    name: string;
}
