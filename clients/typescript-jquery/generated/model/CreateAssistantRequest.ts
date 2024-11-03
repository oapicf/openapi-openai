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

import * as models from './models';

export interface CreateAssistantRequest {
    model: models.CreateAssistantRequestModel;

    /**
     * The name of the assistant. The maximum length is 256 characters. 
     */
    name?: string;

    /**
     * The description of the assistant. The maximum length is 512 characters. 
     */
    description?: string;

    /**
     * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
     */
    instructions?: string;

    /**
     * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
     */
    tools?: Array<models.AssistantObjectToolsInner>;

    /**
     * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
     */
    file_ids?: Array<string>;

    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     */
    metadata?: object;

}
