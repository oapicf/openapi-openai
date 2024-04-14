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

import { MessageContentTextAnnotationsFileCitationObject } from '../models/MessageContentTextAnnotationsFileCitationObject';
import { MessageContentTextAnnotationsFileCitationObjectFileCitation } from '../models/MessageContentTextAnnotationsFileCitationObjectFileCitation';
import { MessageContentTextAnnotationsFilePathObject } from '../models/MessageContentTextAnnotationsFilePathObject';
import { MessageContentTextAnnotationsFilePathObjectFilePath } from '../models/MessageContentTextAnnotationsFilePathObjectFilePath';
import { HttpFile } from '../http/http';

export class MessageContentTextObjectTextAnnotationsInner {
    /**
    * Always `file_citation`.
    */
    'type': MessageContentTextObjectTextAnnotationsInnerTypeEnum;
    /**
    * The text in the message content that needs to be replaced.
    */
    'text': string;
    'fileCitation': MessageContentTextAnnotationsFileCitationObjectFileCitation;
    'startIndex': number;
    'endIndex': number;
    'filePath': MessageContentTextAnnotationsFilePathObjectFilePath;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "MessageContentTextObjectTextAnnotationsInnerTypeEnum",
            "format": ""
        },
        {
            "name": "text",
            "baseName": "text",
            "type": "string",
            "format": ""
        },
        {
            "name": "fileCitation",
            "baseName": "file_citation",
            "type": "MessageContentTextAnnotationsFileCitationObjectFileCitation",
            "format": ""
        },
        {
            "name": "startIndex",
            "baseName": "start_index",
            "type": "number",
            "format": ""
        },
        {
            "name": "endIndex",
            "baseName": "end_index",
            "type": "number",
            "format": ""
        },
        {
            "name": "filePath",
            "baseName": "file_path",
            "type": "MessageContentTextAnnotationsFilePathObjectFilePath",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MessageContentTextObjectTextAnnotationsInner.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum MessageContentTextObjectTextAnnotationsInnerTypeEnum {
    Citation = 'file_citation',
    Path = 'file_path'
}

