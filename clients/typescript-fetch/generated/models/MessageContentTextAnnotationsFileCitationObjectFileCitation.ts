/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface MessageContentTextAnnotationsFileCitationObjectFileCitation
 */
export interface MessageContentTextAnnotationsFileCitationObjectFileCitation {
    /**
     * The ID of the specific File the citation is from.
     * @type {string}
     * @memberof MessageContentTextAnnotationsFileCitationObjectFileCitation
     */
    fileId: string;
    /**
     * The specific quote in the file.
     * @type {string}
     * @memberof MessageContentTextAnnotationsFileCitationObjectFileCitation
     */
    quote: string;
}

/**
 * Check if a given object implements the MessageContentTextAnnotationsFileCitationObjectFileCitation interface.
 */
export function instanceOfMessageContentTextAnnotationsFileCitationObjectFileCitation(value: object): boolean {
    if (!('fileId' in value)) return false;
    if (!('quote' in value)) return false;
    return true;
}

export function MessageContentTextAnnotationsFileCitationObjectFileCitationFromJSON(json: any): MessageContentTextAnnotationsFileCitationObjectFileCitation {
    return MessageContentTextAnnotationsFileCitationObjectFileCitationFromJSONTyped(json, false);
}

export function MessageContentTextAnnotationsFileCitationObjectFileCitationFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageContentTextAnnotationsFileCitationObjectFileCitation {
    if (json == null) {
        return json;
    }
    return {
        
        'fileId': json['file_id'],
        'quote': json['quote'],
    };
}

export function MessageContentTextAnnotationsFileCitationObjectFileCitationToJSON(value?: MessageContentTextAnnotationsFileCitationObjectFileCitation | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'file_id': value['fileId'],
        'quote': value['quote'],
    };
}
