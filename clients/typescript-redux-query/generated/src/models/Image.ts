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
 * Represents the url or the content of an image generated by the OpenAI API.
 * @export
 * @interface Image
 */
export interface Image  {
    /**
     * The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
     * @type {string}
     * @memberof Image
     */
    b64Json?: string;
    /**
     * The URL of the generated image, if `response_format` is `url` (default).
     * @type {string}
     * @memberof Image
     */
    url?: string;
    /**
     * The prompt that was used to generate the image, if there was any revision to the prompt.
     * @type {string}
     * @memberof Image
     */
    revisedPrompt?: string;
}

export function ImageFromJSON(json: any): Image {
    return {
        'b64Json': !exists(json, 'b64_json') ? undefined : json['b64_json'],
        'url': !exists(json, 'url') ? undefined : json['url'],
        'revisedPrompt': !exists(json, 'revised_prompt') ? undefined : json['revised_prompt'],
    };
}

export function ImageToJSON(value?: Image): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'b64_json': value.b64Json,
        'url': value.url,
        'revised_prompt': value.revisedPrompt,
    };
}


