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
import type { TranscriptionSegment } from './TranscriptionSegment';
import {
    TranscriptionSegmentFromJSON,
    TranscriptionSegmentFromJSONTyped,
    TranscriptionSegmentToJSON,
} from './TranscriptionSegment';

/**
 * 
 * @export
 * @interface CreateTranslationResponseVerboseJson
 */
export interface CreateTranslationResponseVerboseJson {
    /**
     * The language of the output translation (always `english`).
     * @type {string}
     * @memberof CreateTranslationResponseVerboseJson
     */
    language: string;
    /**
     * The duration of the input audio.
     * @type {string}
     * @memberof CreateTranslationResponseVerboseJson
     */
    duration: string;
    /**
     * The translated text.
     * @type {string}
     * @memberof CreateTranslationResponseVerboseJson
     */
    text: string;
    /**
     * Segments of the translated text and their corresponding details.
     * @type {Array<TranscriptionSegment>}
     * @memberof CreateTranslationResponseVerboseJson
     */
    segments?: Array<TranscriptionSegment>;
}

/**
 * Check if a given object implements the CreateTranslationResponseVerboseJson interface.
 */
export function instanceOfCreateTranslationResponseVerboseJson(value: object): boolean {
    if (!('language' in value)) return false;
    if (!('duration' in value)) return false;
    if (!('text' in value)) return false;
    return true;
}

export function CreateTranslationResponseVerboseJsonFromJSON(json: any): CreateTranslationResponseVerboseJson {
    return CreateTranslationResponseVerboseJsonFromJSONTyped(json, false);
}

export function CreateTranslationResponseVerboseJsonFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateTranslationResponseVerboseJson {
    if (json == null) {
        return json;
    }
    return {
        
        'language': json['language'],
        'duration': json['duration'],
        'text': json['text'],
        'segments': json['segments'] == null ? undefined : ((json['segments'] as Array<any>).map(TranscriptionSegmentFromJSON)),
    };
}

export function CreateTranslationResponseVerboseJsonToJSON(value?: CreateTranslationResponseVerboseJson | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'language': value['language'],
        'duration': value['duration'],
        'text': value['text'],
        'segments': value['segments'] == null ? undefined : ((value['segments'] as Array<any>).map(TranscriptionSegmentToJSON)),
    };
}

