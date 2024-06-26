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
 * @interface ChatCompletionRequestMessageContentPartImageImageUrl
 */
export interface ChatCompletionRequestMessageContentPartImageImageUrl {
    /**
     * Either a URL of the image or the base64 encoded image data.
     * @type {string}
     * @memberof ChatCompletionRequestMessageContentPartImageImageUrl
     */
    url: string;
    /**
     * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     * @type {string}
     * @memberof ChatCompletionRequestMessageContentPartImageImageUrl
     */
    detail?: ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum ChatCompletionRequestMessageContentPartImageImageUrlDetailEnum {
    Auto = 'auto',
    Low = 'low',
    High = 'high'
}

