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
 * 
 * @export
 * @interface CreateTranslationResponseJson
 */
export interface CreateTranslationResponseJson  {
    /**
     * 
     * @type {string}
     * @memberof CreateTranslationResponseJson
     */
    text: string;
}

export function CreateTranslationResponseJsonFromJSON(json: any): CreateTranslationResponseJson {
    return {
        'text': json['text'],
    };
}

export function CreateTranslationResponseJsonToJSON(value?: CreateTranslationResponseJson): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'text': value.text,
    };
}


