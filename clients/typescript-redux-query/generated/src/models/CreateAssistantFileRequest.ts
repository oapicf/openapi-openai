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
 * @interface CreateAssistantFileRequest
 */
export interface CreateAssistantFileRequest  {
    /**
     * A [File](/docs/api-reference/files) ID (with `purpose=\"assistants\"`) that the assistant should use. Useful for tools like `retrieval` and `code_interpreter` that can access files.
     * @type {string}
     * @memberof CreateAssistantFileRequest
     */
    fileId: string;
}

export function CreateAssistantFileRequestFromJSON(json: any): CreateAssistantFileRequest {
    return {
        'fileId': json['file_id'],
    };
}

export function CreateAssistantFileRequestToJSON(value?: CreateAssistantFileRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'file_id': value.fileId,
    };
}


