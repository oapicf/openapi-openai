/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { TranscriptionSegment } from '../models/TranscriptionSegment';
import { HttpFile } from '../http/http';

export class CreateTranslationResponseVerboseJson {
    /**
    * The language of the output translation (always `english`).
    */
    'language': string;
    /**
    * The duration of the input audio.
    */
    'duration': string;
    /**
    * The translated text.
    */
    'text': string;
    /**
    * Segments of the translated text and their corresponding details.
    */
    'segments'?: Array<TranscriptionSegment>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "language",
            "baseName": "language",
            "type": "string",
            "format": ""
        },
        {
            "name": "duration",
            "baseName": "duration",
            "type": "string",
            "format": ""
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string",
            "format": ""
        },
        {
            "name": "segments",
            "baseName": "segments",
            "type": "Array<TranscriptionSegment>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateTranslationResponseVerboseJson.attributeTypeMap;
    }

    public constructor() {
    }
}

