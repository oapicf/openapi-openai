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
    TranscriptionSegment,
    TranscriptionSegmentFromJSON,
    TranscriptionSegmentToJSON,
    TranscriptionWord,
    TranscriptionWordFromJSON,
    TranscriptionWordToJSON,
} from './';

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 * @export
 * @interface CreateTranscriptionResponseVerboseJson
 */
export interface CreateTranscriptionResponseVerboseJson  {
    /**
     * The language of the input audio.
     * @type {string}
     * @memberof CreateTranscriptionResponseVerboseJson
     */
    language: string;
    /**
     * The duration of the input audio.
     * @type {string}
     * @memberof CreateTranscriptionResponseVerboseJson
     */
    duration: string;
    /**
     * The transcribed text.
     * @type {string}
     * @memberof CreateTranscriptionResponseVerboseJson
     */
    text: string;
    /**
     * Extracted words and their corresponding timestamps.
     * @type {Array<TranscriptionWord>}
     * @memberof CreateTranscriptionResponseVerboseJson
     */
    words?: Array<TranscriptionWord>;
    /**
     * Segments of the transcribed text and their corresponding details.
     * @type {Array<TranscriptionSegment>}
     * @memberof CreateTranscriptionResponseVerboseJson
     */
    segments?: Array<TranscriptionSegment>;
}

export function CreateTranscriptionResponseVerboseJsonFromJSON(json: any): CreateTranscriptionResponseVerboseJson {
    return {
        'language': json['language'],
        'duration': json['duration'],
        'text': json['text'],
        'words': !exists(json, 'words') ? undefined : (json['words'] as Array<any>).map(TranscriptionWordFromJSON),
        'segments': !exists(json, 'segments') ? undefined : (json['segments'] as Array<any>).map(TranscriptionSegmentFromJSON),
    };
}

export function CreateTranscriptionResponseVerboseJsonToJSON(value?: CreateTranscriptionResponseVerboseJson): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'language': value.language,
        'duration': value.duration,
        'text': value.text,
        'words': value.words === undefined ? undefined : (value.words as Array<any>).map(TranscriptionWordToJSON),
        'segments': value.segments === undefined ? undefined : (value.segments as Array<any>).map(TranscriptionSegmentToJSON),
    };
}


