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

export class TranscriptionSegment {
    /**
    * Unique identifier of the segment.
    */
    'id': number;
    /**
    * Seek offset of the segment.
    */
    'seek': number;
    /**
    * Start time of the segment in seconds.
    */
    'start': number;
    /**
    * End time of the segment in seconds.
    */
    'end': number;
    /**
    * Text content of the segment.
    */
    'text': string;
    /**
    * Array of token IDs for the text content.
    */
    'tokens': Array<number>;
    /**
    * Temperature parameter used for generating the segment.
    */
    'temperature': number;
    /**
    * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
    */
    'avgLogprob': number;
    /**
    * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
    */
    'compressionRatio': number;
    /**
    * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
    */
    'noSpeechProb': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "seek",
            "baseName": "seek",
            "type": "number"
        },
        {
            "name": "start",
            "baseName": "start",
            "type": "number"
        },
        {
            "name": "end",
            "baseName": "end",
            "type": "number"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "tokens",
            "baseName": "tokens",
            "type": "Array<number>"
        },
        {
            "name": "temperature",
            "baseName": "temperature",
            "type": "number"
        },
        {
            "name": "avgLogprob",
            "baseName": "avg_logprob",
            "type": "number"
        },
        {
            "name": "compressionRatio",
            "baseName": "compression_ratio",
            "type": "number"
        },
        {
            "name": "noSpeechProb",
            "baseName": "no_speech_prob",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TranscriptionSegment.attributeTypeMap;
    }
}

