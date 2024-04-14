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

import { HttpFile } from '../http/http';

export class TranscriptionWord {
    /**
    * The text content of the word.
    */
    'word': string;
    /**
    * Start time of the word in seconds.
    */
    'start': number;
    /**
    * End time of the word in seconds.
    */
    'end': number;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "word",
            "baseName": "word",
            "type": "string",
            "format": ""
        },
        {
            "name": "start",
            "baseName": "start",
            "type": "number",
            "format": "float"
        },
        {
            "name": "end",
            "baseName": "end",
            "type": "number",
            "format": "float"
        }    ];

    static getAttributeTypeMap() {
        return TranscriptionWord.attributeTypeMap;
    }

    public constructor() {
    }
}

