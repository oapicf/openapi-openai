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
import { MessageContentTextObjectText } from './messageContentTextObjectText';

/**
* The text content that is part of a message.
*/
export class MessageContentTextObject {
    /**
    * Always `text`.
    */
    'type': MessageContentTextObject.TypeEnum;
    'text': MessageContentTextObjectText;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "MessageContentTextObject.TypeEnum"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "MessageContentTextObjectText"
        }    ];

    static getAttributeTypeMap() {
        return MessageContentTextObject.attributeTypeMap;
    }
}

export namespace MessageContentTextObject {
    export enum TypeEnum {
        Text = <any> 'text'
    }
}
