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

import { RequestFile } from './models';

export class ChatCompletionRequestMessageContentPartImageImageUrl {
    /**
    * Either a URL of the image or the base64 encoded image data.
    */
    'url': string;
    /**
    * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
    */
    'detail'?: ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum = ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum.Auto;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "url",
            "baseName": "url",
            "type": "string"
        },
        {
            "name": "detail",
            "baseName": "detail",
            "type": "ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestMessageContentPartImageImageUrl.attributeTypeMap;
    }
}

export namespace ChatCompletionRequestMessageContentPartImageImageUrl {
    export enum DetailEnum {
        Auto = <any> 'auto',
        Low = <any> 'low',
        High = <any> 'high'
    }
}