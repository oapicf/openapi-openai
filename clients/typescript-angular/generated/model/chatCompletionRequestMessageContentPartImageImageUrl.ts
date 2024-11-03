/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface ChatCompletionRequestMessageContentPartImageImageUrl { 
    /**
     * Either a URL of the image or the base64 encoded image data.
     */
    url: string;
    /**
     * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
     */
    detail?: ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum;
}
export namespace ChatCompletionRequestMessageContentPartImageImageUrl {
    export type DetailEnum = 'auto' | 'low' | 'high';
    export const DetailEnum = {
        Auto: 'auto' as DetailEnum,
        Low: 'low' as DetailEnum,
        High: 'high' as DetailEnum
    };
}


