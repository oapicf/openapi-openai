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
 * @interface TranscriptionWord
 */
export interface TranscriptionWord {
    /**
     * The text content of the word.
     * @type {string}
     * @memberof TranscriptionWord
     */
    word: string;
    /**
     * Start time of the word in seconds.
     * @type {number}
     * @memberof TranscriptionWord
     */
    start: number;
    /**
     * End time of the word in seconds.
     * @type {number}
     * @memberof TranscriptionWord
     */
    end: number;
}

/**
 * Check if a given object implements the TranscriptionWord interface.
 */
export function instanceOfTranscriptionWord(value: object): value is TranscriptionWord {
    if (!('word' in value) || value['word'] === undefined) return false;
    if (!('start' in value) || value['start'] === undefined) return false;
    if (!('end' in value) || value['end'] === undefined) return false;
    return true;
}

export function TranscriptionWordFromJSON(json: any): TranscriptionWord {
    return TranscriptionWordFromJSONTyped(json, false);
}

export function TranscriptionWordFromJSONTyped(json: any, ignoreDiscriminator: boolean): TranscriptionWord {
    if (json == null) {
        return json;
    }
    return {
        
        'word': json['word'],
        'start': json['start'],
        'end': json['end'],
    };
}

  export function TranscriptionWordToJSON(json: any): TranscriptionWord {
      return TranscriptionWordToJSONTyped(json, false);
  }

  export function TranscriptionWordToJSONTyped(value?: TranscriptionWord | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'word': value['word'],
        'start': value['start'],
        'end': value['end'],
    };
}

