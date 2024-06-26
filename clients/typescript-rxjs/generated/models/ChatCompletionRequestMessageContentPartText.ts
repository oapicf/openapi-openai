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
 * @interface ChatCompletionRequestMessageContentPartText
 */
export interface ChatCompletionRequestMessageContentPartText {
    /**
     * The type of the content part.
     * @type {string}
     * @memberof ChatCompletionRequestMessageContentPartText
     */
    type: ChatCompletionRequestMessageContentPartTextTypeEnum;
    /**
     * The text content.
     * @type {string}
     * @memberof ChatCompletionRequestMessageContentPartText
     */
    text: string;
}

/**
 * @export
 * @enum {string}
 */
export enum ChatCompletionRequestMessageContentPartTextTypeEnum {
    Text = 'text'
}

