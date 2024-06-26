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
 * @interface MessageDeltaContentImageFileObjectImageFile
 */
export interface MessageDeltaContentImageFileObjectImageFile  {
    /**
     * The [File](/docs/api-reference/files) ID of the image in the message content.
     * @type {string}
     * @memberof MessageDeltaContentImageFileObjectImageFile
     */
    fileId?: string;
}

export function MessageDeltaContentImageFileObjectImageFileFromJSON(json: any): MessageDeltaContentImageFileObjectImageFile {
    return {
        'fileId': !exists(json, 'file_id') ? undefined : json['file_id'],
    };
}

export function MessageDeltaContentImageFileObjectImageFileToJSON(value?: MessageDeltaContentImageFileObjectImageFile): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'file_id': value.fileId,
    };
}


