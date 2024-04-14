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

import { RequestFile } from './models';
import { AssistantObjectToolsInner } from './assistantObjectToolsInner';

export class ModifyAssistantRequest {
    'model'?: string;
    /**
    * The name of the assistant. The maximum length is 256 characters. 
    */
    'name'?: string | null;
    /**
    * The description of the assistant. The maximum length is 512 characters. 
    */
    'description'?: string | null;
    /**
    * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    */
    'instructions'?: string | null;
    /**
    * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
    */
    'tools'?: Array<AssistantObjectToolsInner>;
    /**
    * A list of [File](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. If a file was previously attached to the list but does not show up in the list, it will be deleted from the assistant. 
    */
    'fileIds'?: Array<string>;
    /**
    * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    */
    'metadata'?: object | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "model",
            "baseName": "model",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "instructions",
            "baseName": "instructions",
            "type": "string"
        },
        {
            "name": "tools",
            "baseName": "tools",
            "type": "Array<AssistantObjectToolsInner>"
        },
        {
            "name": "fileIds",
            "baseName": "file_ids",
            "type": "Array<string>"
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "object"
        }    ];

    static getAttributeTypeMap() {
        return ModifyAssistantRequest.attributeTypeMap;
    }
}

