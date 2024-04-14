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
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from './messageContentTextAnnotationsFileCitationObjectFileCitation';

/**
* A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
*/
export class MessageContentTextAnnotationsFileCitationObject {
    /**
    * Always `file_citation`.
    */
    'type': MessageContentTextAnnotationsFileCitationObject.TypeEnum;
    /**
    * The text in the message content that needs to be replaced.
    */
    'text': string;
    'fileCitation': MessageContentTextAnnotationsFileCitationObjectFileCitation;
    'startIndex': number;
    'endIndex': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "MessageContentTextAnnotationsFileCitationObject.TypeEnum"
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string"
        },
        {
            "name": "fileCitation",
            "baseName": "file_citation",
            "type": "MessageContentTextAnnotationsFileCitationObjectFileCitation"
        },
        {
            "name": "startIndex",
            "baseName": "start_index",
            "type": "number"
        },
        {
            "name": "endIndex",
            "baseName": "end_index",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return MessageContentTextAnnotationsFileCitationObject.attributeTypeMap;
    }
}

export namespace MessageContentTextAnnotationsFileCitationObject {
    export enum TypeEnum {
        FileCitation = <any> 'file_citation'
    }
}
