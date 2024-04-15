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
import { MessageContentTextObjectTextAnnotationsInner } from './messageContentTextObjectTextAnnotationsInner';

export class MessageContentTextObjectText {
    /**
    * The data that makes up the text.
    */
    'value': string;
    'annotations': Array<MessageContentTextObjectTextAnnotationsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "value",
            "baseName": "value",
            "type": "string"
        },
        {
            "name": "annotations",
            "baseName": "annotations",
            "type": "Array<MessageContentTextObjectTextAnnotationsInner>"
        }    ];

    static getAttributeTypeMap() {
        return MessageContentTextObjectText.attributeTypeMap;
    }
}
