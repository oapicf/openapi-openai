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
 *
 */

import ApiClient from '../ApiClient';
import AssistantObjectToolsInner from './AssistantObjectToolsInner';

/**
 * The AssistantObject model module.
 * @module model/AssistantObject
 * @version 1.1.1-pre.0
 */
class AssistantObject {
    /**
     * Constructs a new <code>AssistantObject</code>.
     * Represents an &#x60;assistant&#x60; that can call the model and use tools.
     * @alias module:model/AssistantObject
     * @param id {String} The identifier, which can be referenced in API endpoints.
     * @param object {module:model/AssistantObject.ObjectEnum} The object type, which is always `assistant`.
     * @param createdAt {Number} The Unix timestamp (in seconds) for when the assistant was created.
     * @param name {String} The name of the assistant. The maximum length is 256 characters. 
     * @param description {String} The description of the assistant. The maximum length is 512 characters. 
     * @param model {String} ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
     * @param instructions {String} The system instructions that the assistant uses. The maximum length is 256,000 characters. 
     * @param tools {Array.<module:model/AssistantObjectToolsInner>} A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
     * @param fileIds {Array.<String>} A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
     * @param metadata {Object} Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     */
    constructor(id, object, createdAt, name, description, model, instructions, tools, fileIds, metadata) { 
        
        AssistantObject.initialize(this, id, object, createdAt, name, description, model, instructions, tools, fileIds, metadata);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, object, createdAt, name, description, model, instructions, tools, fileIds, metadata) { 
        obj['id'] = id;
        obj['object'] = object;
        obj['created_at'] = createdAt;
        obj['name'] = name;
        obj['description'] = description;
        obj['model'] = model;
        obj['instructions'] = instructions;
        obj['tools'] = tools;
        obj['file_ids'] = fileIds;
        obj['metadata'] = metadata;
    }

    /**
     * Constructs a <code>AssistantObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AssistantObject} obj Optional instance to populate.
     * @return {module:model/AssistantObject} The populated <code>AssistantObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AssistantObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('model')) {
                obj['model'] = ApiClient.convertToType(data['model'], 'String');
            }
            if (data.hasOwnProperty('instructions')) {
                obj['instructions'] = ApiClient.convertToType(data['instructions'], 'String');
            }
            if (data.hasOwnProperty('tools')) {
                obj['tools'] = ApiClient.convertToType(data['tools'], [AssistantObjectToolsInner]);
            }
            if (data.hasOwnProperty('file_ids')) {
                obj['file_ids'] = ApiClient.convertToType(data['file_ids'], ['String']);
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AssistantObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AssistantObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of AssistantObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // ensure the json data is a string
        if (data['model'] && !(typeof data['model'] === 'string' || data['model'] instanceof String)) {
            throw new Error("Expected the field `model` to be a primitive type in the JSON string but got " + data['model']);
        }
        // ensure the json data is a string
        if (data['instructions'] && !(typeof data['instructions'] === 'string' || data['instructions'] instanceof String)) {
            throw new Error("Expected the field `instructions` to be a primitive type in the JSON string but got " + data['instructions']);
        }
        if (data['tools']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['tools'])) {
                throw new Error("Expected the field `tools` to be an array in the JSON data but got " + data['tools']);
            }
            // validate the optional field `tools` (array)
            for (const item of data['tools']) {
                AssistantObjectToolsInner.validateJSON(item);
            };
        }
        // ensure the json data is an array
        if (!Array.isArray(data['file_ids'])) {
            throw new Error("Expected the field `file_ids` to be an array in the JSON data but got " + data['file_ids']);
        }

        return true;
    }


}

AssistantObject.RequiredProperties = ["id", "object", "created_at", "name", "description", "model", "instructions", "tools", "file_ids", "metadata"];

/**
 * The identifier, which can be referenced in API endpoints.
 * @member {String} id
 */
AssistantObject.prototype['id'] = undefined;

/**
 * The object type, which is always `assistant`.
 * @member {module:model/AssistantObject.ObjectEnum} object
 */
AssistantObject.prototype['object'] = undefined;

/**
 * The Unix timestamp (in seconds) for when the assistant was created.
 * @member {Number} created_at
 */
AssistantObject.prototype['created_at'] = undefined;

/**
 * The name of the assistant. The maximum length is 256 characters. 
 * @member {String} name
 */
AssistantObject.prototype['name'] = undefined;

/**
 * The description of the assistant. The maximum length is 512 characters. 
 * @member {String} description
 */
AssistantObject.prototype['description'] = undefined;

/**
 * ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them. 
 * @member {String} model
 */
AssistantObject.prototype['model'] = undefined;

/**
 * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @member {String} instructions
 */
AssistantObject.prototype['instructions'] = undefined;

/**
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @member {Array.<module:model/AssistantObjectToolsInner>} tools
 */
AssistantObject.prototype['tools'] = undefined;

/**
 * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @member {Array.<String>} file_ids
 */
AssistantObject.prototype['file_ids'] = undefined;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @member {Object} metadata
 */
AssistantObject.prototype['metadata'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
AssistantObject['ObjectEnum'] = {

    /**
     * value: "assistant"
     * @const
     */
    "assistant": "assistant"
};



export default AssistantObject;

