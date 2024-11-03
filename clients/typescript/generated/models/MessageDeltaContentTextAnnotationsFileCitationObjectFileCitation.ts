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

export class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    /**
    * The ID of the specific File the citation is from.
    */
    'fileId'?: string;
    /**
    * The specific quote in the file.
    */
    'quote'?: string;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "fileId",
            "baseName": "file_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "quote",
            "baseName": "quote",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.attributeTypeMap;
    }

    public constructor() {
    }
}
