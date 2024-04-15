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
import type { AssistantObjectToolsInner } from './AssistantObjectToolsInner';
import {
    AssistantObjectToolsInnerFromJSON,
    AssistantObjectToolsInnerFromJSONTyped,
    AssistantObjectToolsInnerToJSON,
} from './AssistantObjectToolsInner';
import type { CreateAssistantRequestModel } from './CreateAssistantRequestModel';
import {
    CreateAssistantRequestModelFromJSON,
    CreateAssistantRequestModelFromJSONTyped,
    CreateAssistantRequestModelToJSON,
} from './CreateAssistantRequestModel';

/**
 * 
 * @export
 * @interface CreateAssistantRequest
 */
export interface CreateAssistantRequest {
    /**
     * 
     * @type {CreateAssistantRequestModel}
     * @memberof CreateAssistantRequest
     */
    model: CreateAssistantRequestModel;
    /**
     * The name of the assistant. The maximum length is 256 characters.
     * 
     * @type {string}
     * @memberof CreateAssistantRequest
     */
    name?: string;
    /**
     * The description of the assistant. The maximum length is 512 characters.
     * 
     * @type {string}
     * @memberof CreateAssistantRequest
     */
    description?: string;
    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters.
     * 
     * @type {string}
     * @memberof CreateAssistantRequest
     */
    instructions?: string;
    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`.
     * 
     * @type {Array<AssistantObjectToolsInner>}
     * @memberof CreateAssistantRequest
     */
    tools?: Array<AssistantObjectToolsInner>;
    /**
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order.
     * 
     * @type {Array<string>}
     * @memberof CreateAssistantRequest
     */
    fileIds?: Array<string>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * 
     * @type {object}
     * @memberof CreateAssistantRequest
     */
    metadata?: object;
}

/**
 * Check if a given object implements the CreateAssistantRequest interface.
 */
export function instanceOfCreateAssistantRequest(value: object): boolean {
    if (!('model' in value)) return false;
    return true;
}

export function CreateAssistantRequestFromJSON(json: any): CreateAssistantRequest {
    return CreateAssistantRequestFromJSONTyped(json, false);
}

export function CreateAssistantRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateAssistantRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'model': CreateAssistantRequestModelFromJSON(json['model']),
        'name': json['name'] == null ? undefined : json['name'],
        'description': json['description'] == null ? undefined : json['description'],
        'instructions': json['instructions'] == null ? undefined : json['instructions'],
        'tools': json['tools'] == null ? undefined : ((json['tools'] as Array<any>).map(AssistantObjectToolsInnerFromJSON)),
        'fileIds': json['file_ids'] == null ? undefined : json['file_ids'],
        'metadata': json['metadata'] == null ? undefined : json['metadata'],
    };
}

export function CreateAssistantRequestToJSON(value?: CreateAssistantRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'model': CreateAssistantRequestModelToJSON(value['model']),
        'name': value['name'],
        'description': value['description'],
        'instructions': value['instructions'],
        'tools': value['tools'] == null ? undefined : ((value['tools'] as Array<any>).map(AssistantObjectToolsInnerToJSON)),
        'file_ids': value['fileIds'],
        'metadata': value['metadata'],
    };
}
