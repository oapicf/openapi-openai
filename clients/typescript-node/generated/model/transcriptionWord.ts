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

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "word",
            "baseName": "word",
            "type": "string"
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
        }    ];

    static getAttributeTypeMap() {
        return TranscriptionWord.attributeTypeMap;
    }
}

