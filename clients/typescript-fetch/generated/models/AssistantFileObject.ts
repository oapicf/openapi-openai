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
 * A list of [Files](/docs/api-reference/files) attached to an `assistant`.
 * @export
 * @interface AssistantFileObject
 */
export interface AssistantFileObject {
    /**
     * The identifier, which can be referenced in API endpoints.
     * @type {string}
     * @memberof AssistantFileObject
     */
    id: string;
    /**
     * The object type, which is always `assistant.file`.
     * @type {string}
     * @memberof AssistantFileObject
     */
    object: AssistantFileObjectObjectEnum;
    /**
     * The Unix timestamp (in seconds) for when the assistant file was created.
     * @type {number}
     * @memberof AssistantFileObject
     */
    createdAt: number;
    /**
     * The assistant ID that the file is attached to.
     * @type {string}
     * @memberof AssistantFileObject
     */
    assistantId: string;
}


/**
 * @export
 */
export const AssistantFileObjectObjectEnum = {
    AssistantFile: 'assistant.file'
} as const;
export type AssistantFileObjectObjectEnum = typeof AssistantFileObjectObjectEnum[keyof typeof AssistantFileObjectObjectEnum];


/**
 * Check if a given object implements the AssistantFileObject interface.
 */
export function instanceOfAssistantFileObject(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('object' in value)) return false;
    if (!('createdAt' in value)) return false;
    if (!('assistantId' in value)) return false;
    return true;
}

export function AssistantFileObjectFromJSON(json: any): AssistantFileObject {
    return AssistantFileObjectFromJSONTyped(json, false);
}

export function AssistantFileObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): AssistantFileObject {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'object': json['object'],
        'createdAt': json['created_at'],
        'assistantId': json['assistant_id'],
    };
}

export function AssistantFileObjectToJSON(value?: AssistantFileObject | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'object': value['object'],
        'created_at': value['createdAt'],
        'assistant_id': value['assistantId'],
    };
}

