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
import { TranscriptionSegment } from './transcriptionSegment';


export interface CreateTranslationResponseVerboseJson { 
    /**
     * The language of the output translation (always `english`).
     */
    language: string;
    /**
     * The duration of the input audio.
     */
    duration: string;
    /**
     * The translated text.
     */
    text: string;
    /**
     * Segments of the translated text and their corresponding details.
     */
    segments?: Array<TranscriptionSegment>;
}
