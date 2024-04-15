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
import { ChatCompletionRequestMessageContentPartImage } from './chatCompletionRequestMessageContentPartImage';
import { ChatCompletionRequestMessageContentPartImageImageUrl } from './chatCompletionRequestMessageContentPartImageImageUrl';
import { ChatCompletionRequestMessageContentPartText } from './chatCompletionRequestMessageContentPartText';

export class ChatCompletionRequestMessageContentPart {
    /**
    * The type of the content part.
    */
    'type': ChatCompletionRequestMessageContentPart.TypeEnum;
    /**
    * The text content.
    */
    'text': string;
    'imageUrl': ChatCompletionRequestMessageContentPartImageImageUrl;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "ChatCompletionRequestMessageContentPart.TypeEnum"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "imageUrl",
            "baseName": "image_url",
            "type": "ChatCompletionRequestMessageContentPartImageImageUrl"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestMessageContentPart.attributeTypeMap;
    }
}

export namespace ChatCompletionRequestMessageContentPart {
    export enum TypeEnum {
        Text = <any> 'text',
        ImageUrl = <any> 'image_url'
    }
}