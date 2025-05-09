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
 * @interface MessageDeltaContentImageFileObjectImageFile
 */
export interface MessageDeltaContentImageFileObjectImageFile {
    /**
     * The [File](/docs/api-reference/files) ID of the image in the message content.
     * @type {string}
     * @memberof MessageDeltaContentImageFileObjectImageFile
     */
    fileId?: string;
}

/**
 * Check if a given object implements the MessageDeltaContentImageFileObjectImageFile interface.
 */
export function instanceOfMessageDeltaContentImageFileObjectImageFile(value: object): value is MessageDeltaContentImageFileObjectImageFile {
    return true;
}

export function MessageDeltaContentImageFileObjectImageFileFromJSON(json: any): MessageDeltaContentImageFileObjectImageFile {
    return MessageDeltaContentImageFileObjectImageFileFromJSONTyped(json, false);
}

export function MessageDeltaContentImageFileObjectImageFileFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageDeltaContentImageFileObjectImageFile {
    if (json == null) {
        return json;
    }
    return {
        
        'fileId': json['file_id'] == null ? undefined : json['file_id'],
    };
}

  export function MessageDeltaContentImageFileObjectImageFileToJSON(json: any): MessageDeltaContentImageFileObjectImageFile {
      return MessageDeltaContentImageFileObjectImageFileToJSONTyped(json, false);
  }

  export function MessageDeltaContentImageFileObjectImageFileToJSONTyped(value?: MessageDeltaContentImageFileObjectImageFile | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'file_id': value['fileId'],
    };
}

