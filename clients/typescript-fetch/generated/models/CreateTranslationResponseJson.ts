/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CreateTranslationResponseJson
 */
export interface CreateTranslationResponseJson {
    /**
     * 
     * @type {string}
     * @memberof CreateTranslationResponseJson
     */
    text: string;
}

/**
 * Check if a given object implements the CreateTranslationResponseJson interface.
 */
export function instanceOfCreateTranslationResponseJson(value: object): boolean {
    if (!('text' in value)) return false;
    return true;
}

export function CreateTranslationResponseJsonFromJSON(json: any): CreateTranslationResponseJson {
    return CreateTranslationResponseJsonFromJSONTyped(json, false);
}

export function CreateTranslationResponseJsonFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateTranslationResponseJson {
    if (json == null) {
        return json;
    }
    return {
        
        'text': json['text'],
    };
}

export function CreateTranslationResponseJsonToJSON(value?: CreateTranslationResponseJson | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'text': value['text'],
    };
}

