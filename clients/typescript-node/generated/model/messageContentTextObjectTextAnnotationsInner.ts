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
import { MessageContentTextAnnotationsFileCitationObject } from './messageContentTextAnnotationsFileCitationObject';
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from './messageContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageContentTextAnnotationsFilePathObject } from './messageContentTextAnnotationsFilePathObject';
import { MessageContentTextAnnotationsFilePathObjectFilePath } from './messageContentTextAnnotationsFilePathObjectFilePath';

export class MessageContentTextObjectTextAnnotationsInner {
    /**
    * Always `file_citation`.
    */
    'type': MessageContentTextObjectTextAnnotationsInner.TypeEnum;
    /**
    * The text in the message content that needs to be replaced.
    */
    'text': string;
    'fileCitation': MessageContentTextAnnotationsFileCitationObjectFileCitation;
    'startIndex': number;
    'endIndex': number;
    'filePath': MessageContentTextAnnotationsFilePathObjectFilePath;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "MessageContentTextObjectTextAnnotationsInner.TypeEnum"
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
        },
        {
            "name": "filePath",
            "baseName": "file_path",
            "type": "MessageContentTextAnnotationsFilePathObjectFilePath"
        }    ];

    static getAttributeTypeMap() {
        return MessageContentTextObjectTextAnnotationsInner.attributeTypeMap;
    }
}

export namespace MessageContentTextObjectTextAnnotationsInner {
    export enum TypeEnum {
        Citation = <any> 'file_citation',
        Path = <any> 'file_path'
    }
}