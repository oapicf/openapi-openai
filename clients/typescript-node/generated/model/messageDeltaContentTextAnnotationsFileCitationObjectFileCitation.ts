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

export class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    /**
    * The ID of the specific File the citation is from.
    */
    'fileId'?: string;
    /**
    * The specific quote in the file.
    */
    'quote'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "fileId",
            "baseName": "file_id",
            "type": "string"
        },
        {
            "name": "quote",
            "baseName": "quote",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.attributeTypeMap;
    }
}

