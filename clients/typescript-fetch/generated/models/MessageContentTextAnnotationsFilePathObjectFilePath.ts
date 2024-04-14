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
 * @interface MessageContentTextAnnotationsFilePathObjectFilePath
 */
export interface MessageContentTextAnnotationsFilePathObjectFilePath {
    /**
     * The ID of the file that was generated.
     * @type {string}
     * @memberof MessageContentTextAnnotationsFilePathObjectFilePath
     */
    fileId: string;
}

/**
 * Check if a given object implements the MessageContentTextAnnotationsFilePathObjectFilePath interface.
 */
export function instanceOfMessageContentTextAnnotationsFilePathObjectFilePath(value: object): boolean {
    if (!('fileId' in value)) return false;
    return true;
}

export function MessageContentTextAnnotationsFilePathObjectFilePathFromJSON(json: any): MessageContentTextAnnotationsFilePathObjectFilePath {
    return MessageContentTextAnnotationsFilePathObjectFilePathFromJSONTyped(json, false);
}

export function MessageContentTextAnnotationsFilePathObjectFilePathFromJSONTyped(json: any, ignoreDiscriminator: boolean): MessageContentTextAnnotationsFilePathObjectFilePath {
    if (json == null) {
        return json;
    }
    return {
        
        'fileId': json['file_id'],
    };
}

export function MessageContentTextAnnotationsFilePathObjectFilePathToJSON(value?: MessageContentTextAnnotationsFilePathObjectFilePath | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'file_id': value['fileId'],
    };
}

