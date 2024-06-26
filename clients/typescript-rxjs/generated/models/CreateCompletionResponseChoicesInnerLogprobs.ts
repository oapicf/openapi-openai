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

/**
 * @export
 * @interface CreateCompletionResponseChoicesInnerLogprobs
 */
export interface CreateCompletionResponseChoicesInnerLogprobs {
    /**
     * @type {Array<number>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    text_offset?: Array<number>;
    /**
     * @type {Array<number>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    token_logprobs?: Array<number>;
    /**
     * @type {Array<string>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    tokens?: Array<string>;
    /**
     * @type {Array<{ [key: string]: number; }>}
     * @memberof CreateCompletionResponseChoicesInnerLogprobs
     */
    top_logprobs?: Array<{ [key: string]: number; }>;
}
