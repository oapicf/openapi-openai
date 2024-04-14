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
/**
 * 
 * @export
 * @interface MessageContentTextAnnotationsFileCitationObjectFileCitation
 */
export interface MessageContentTextAnnotationsFileCitationObjectFileCitation  {
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

export function MessageContentTextAnnotationsFileCitationObjectFileCitationFromJSON(json: any): MessageContentTextAnnotationsFileCitationObjectFileCitation {
    return {
        'fileId': json['file_id'],
        'quote': json['quote'],
    };
}

export function MessageContentTextAnnotationsFileCitationObjectFileCitationToJSON(value?: MessageContentTextAnnotationsFileCitationObjectFileCitation): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'file_id': value.fileId,
        'quote': value.quote,
    };
}


