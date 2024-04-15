// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    MessageContentTextAnnotationsFileCitationObjectFileCitation,
    MessageContentTextAnnotationsFileCitationObjectFileCitationFromJSON,
    MessageContentTextAnnotationsFileCitationObjectFileCitationToJSON,
} from './';

/**
 * A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \"retrieval\" tool to search files.
 * @export
 * @interface MessageContentTextAnnotationsFileCitationObject
 */
export interface MessageContentTextAnnotationsFileCitationObject  {
    /**
     * Always `file_citation`.
     * @type {string}
     * @memberof MessageContentTextAnnotationsFileCitationObject
     */
    type: MessageContentTextAnnotationsFileCitationObjectTypeEnum;
    /**
     * The text in the message content that needs to be replaced.
     * @type {string}
     * @memberof MessageContentTextAnnotationsFileCitationObject
     */
    text: string;
    /**
     * 
     * @type {MessageContentTextAnnotationsFileCitationObjectFileCitation}
     * @memberof MessageContentTextAnnotationsFileCitationObject
     */
    fileCitation: MessageContentTextAnnotationsFileCitationObjectFileCitation;
    /**
     * 
     * @type {number}
     * @memberof MessageContentTextAnnotationsFileCitationObject
     */
    startIndex: number;
    /**
     * 
     * @type {number}
     * @memberof MessageContentTextAnnotationsFileCitationObject
     */
    endIndex: number;
}

export function MessageContentTextAnnotationsFileCitationObjectFromJSON(json: any): MessageContentTextAnnotationsFileCitationObject {
    return {
        'type': json['type'],
        'text': json['text'],
        'fileCitation': MessageContentTextAnnotationsFileCitationObjectFileCitationFromJSON(json['file_citation']),
        'startIndex': json['start_index'],
        'endIndex': json['end_index'],
    };
}

export function MessageContentTextAnnotationsFileCitationObjectToJSON(value?: MessageContentTextAnnotationsFileCitationObject): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': value.type,
        'text': value.text,
        'file_citation': MessageContentTextAnnotationsFileCitationObjectFileCitationToJSON(value.fileCitation),
        'start_index': value.startIndex,
        'end_index': value.endIndex,
    };
}

/**
* @export
* @enum {string}
*/
export enum MessageContentTextAnnotationsFileCitationObjectTypeEnum {
    FileCitation = 'file_citation'
}

