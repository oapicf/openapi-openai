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
import {
    ChatCompletionRequestMessageContentPartImageImageUrl,
    ChatCompletionRequestMessageContentPartImageImageUrlFromJSON,
    ChatCompletionRequestMessageContentPartImageImageUrlToJSON,
} from './';

/**
 * 
 * @export
 * @interface ChatCompletionRequestMessageContentPartImage
 */
export interface ChatCompletionRequestMessageContentPartImage  {
    /**
     * The type of the content part.
     * @type {string}
     * @memberof ChatCompletionRequestMessageContentPartImage
     */
    type: ChatCompletionRequestMessageContentPartImageTypeEnum;
    /**
     * 
     * @type {ChatCompletionRequestMessageContentPartImageImageUrl}
     * @memberof ChatCompletionRequestMessageContentPartImage
     */
    imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl;
}

export function ChatCompletionRequestMessageContentPartImageFromJSON(json: any): ChatCompletionRequestMessageContentPartImage {
    return {
        'type': json['type'],
        'imageUrl': ChatCompletionRequestMessageContentPartImageImageUrlFromJSON(json['image_url']),
    };
}

export function ChatCompletionRequestMessageContentPartImageToJSON(value?: ChatCompletionRequestMessageContentPartImage): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': value.type,
        'image_url': ChatCompletionRequestMessageContentPartImageImageUrlToJSON(value.imageUrl),
    };
}

/**
* @export
* @enum {string}
*/
export enum ChatCompletionRequestMessageContentPartImageTypeEnum {
    ImageUrl = 'image_url'
}


