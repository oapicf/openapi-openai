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

import * as models from './models';

export interface ChatCompletionRequestMessageContentPartText {
    /**
     * The type of the content part.
     */
    type: ChatCompletionRequestMessageContentPartText.TypeEnum;

    /**
     * The text content.
     */
    text: string;

}
export namespace ChatCompletionRequestMessageContentPartText {
    export enum TypeEnum {
        Text = <any> 'text'
    }
}