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

import { MessageDeltaContentTextObjectTextAnnotationsInner } from '../models/MessageDeltaContentTextObjectTextAnnotationsInner';
import { HttpFile } from '../http/http';

export class MessageDeltaContentTextObjectText {
    /**
    * The data that makes up the text.
    */
    'value'?: string;
    'annotations'?: Array<MessageDeltaContentTextObjectTextAnnotationsInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "value",
            "baseName": "value",
            "type": "string",
            "format": ""
        },
        {
            "name": "annotations",
            "baseName": "annotations",
            "type": "Array<MessageDeltaContentTextObjectTextAnnotationsInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MessageDeltaContentTextObjectText.attributeTypeMap;
    }

    public constructor() {
    }
}
