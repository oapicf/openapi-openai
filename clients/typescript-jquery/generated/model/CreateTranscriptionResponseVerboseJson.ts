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

/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
export interface CreateTranscriptionResponseVerboseJson {
    /**
     * The language of the input audio.
     */
    language: string;

    /**
     * The duration of the input audio.
     */
    duration: string;

    /**
     * The transcribed text.
     */
    text: string;

    /**
     * Extracted words and their corresponding timestamps.
     */
    words?: Array<models.TranscriptionWord>;

    /**
     * Segments of the transcribed text and their corresponding details.
     */
    segments?: Array<models.TranscriptionSegment>;

}
