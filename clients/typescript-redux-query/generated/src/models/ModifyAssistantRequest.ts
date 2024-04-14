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
    AssistantObjectToolsInner,
    AssistantObjectToolsInnerFromJSON,
    AssistantObjectToolsInnerToJSON,
} from './';

/**
 * 
 * @export
 * @interface ModifyAssistantRequest
 */
export interface ModifyAssistantRequest  {
    /**
     * 
     * @type {string}
     * @memberof ModifyAssistantRequest
     */
    model?: string;
    /**
     * The name of the assistant. The maximum length is 256 characters. 
     * @type {string}
     * @memberof ModifyAssistantRequest
     */
    name?: string;
    /**
     * The description of the assistant. The maximum length is 512 characters. 
     * @type {string}
     * @memberof ModifyAssistantRequest
     */
    description?: string;
    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
     * @type {string}
     * @memberof ModifyAssistantRequest
     */
    instructions?: string;
    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
     * @type {Array<AssistantObjectToolsInner>}
     * @memberof ModifyAssistantRequest
     */
    tools?: Array<AssistantObjectToolsInner>;
    /**
     * A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
     * @type {Array<string>}
     * @memberof ModifyAssistantRequest
     */
    fileIds?: Array<string>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     * @type {object}
     * @memberof ModifyAssistantRequest
     */
    metadata?: object;
}

export function ModifyAssistantRequestFromJSON(json: any): ModifyAssistantRequest {
    return {
        'model': !exists(json, 'model') ? undefined : json['model'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'instructions': !exists(json, 'instructions') ? undefined : json['instructions'],
        'tools': !exists(json, 'tools') ? undefined : (json['tools'] as Array<any>).map(AssistantObjectToolsInnerFromJSON),
        'fileIds': !exists(json, 'file_ids') ? undefined : json['file_ids'],
        'metadata': !exists(json, 'metadata') ? undefined : json['metadata'],
    };
}

export function ModifyAssistantRequestToJSON(value?: ModifyAssistantRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'model': value.model,
        'name': value.name,
        'description': value.description,
        'instructions': value.instructions,
        'tools': value.tools === undefined ? undefined : (value.tools as Array<any>).map(AssistantObjectToolsInnerToJSON),
        'file_ids': value.fileIds,
        'metadata': value.metadata,
    };
}


