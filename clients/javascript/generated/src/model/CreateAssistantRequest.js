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
import CreateAssistantRequestModel from './CreateAssistantRequestModel';

/**
 * The CreateAssistantRequest model module.
 * @module model/CreateAssistantRequest
 * @version 1.1.1-pre.0
 */
class CreateAssistantRequest {
    /**
     * Constructs a new <code>CreateAssistantRequest</code>.
     * @alias module:model/CreateAssistantRequest
     * @param model {module:model/CreateAssistantRequestModel} 
     */
    constructor(model) { 
        
        CreateAssistantRequest.initialize(this, model);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, model) { 
        obj['model'] = model;
    }

    /**
     * Constructs a <code>CreateAssistantRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateAssistantRequest} obj Optional instance to populate.
     * @return {module:model/CreateAssistantRequest} The populated <code>CreateAssistantRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateAssistantRequest();

            if (data.hasOwnProperty('model')) {
                obj['model'] = CreateAssistantRequestModel.constructFromObject(data['model']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
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
     * Validates the JSON data with respect to <code>CreateAssistantRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateAssistantRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateAssistantRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `model`
        if (data['model']) { // data not null
          CreateAssistantRequestModel.validateJSON(data['model']);
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

CreateAssistantRequest.RequiredProperties = ["model"];

/**
 * @member {module:model/CreateAssistantRequestModel} model
 */
CreateAssistantRequest.prototype['model'] = undefined;

/**
 * The name of the assistant. The maximum length is 256 characters. 
 * @member {String} name
 */
CreateAssistantRequest.prototype['name'] = undefined;

/**
 * The description of the assistant. The maximum length is 512 characters. 
 * @member {String} description
 */
CreateAssistantRequest.prototype['description'] = undefined;

/**
 * The system instructions that the assistant uses. The maximum length is 256,000 characters. 
 * @member {String} instructions
 */
CreateAssistantRequest.prototype['instructions'] = undefined;

/**
 * A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
 * @member {Array.<module:model/AssistantObjectToolsInner>} tools
 */
CreateAssistantRequest.prototype['tools'] = undefined;

/**
 * A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
 * @member {Array.<String>} file_ids
 */
CreateAssistantRequest.prototype['file_ids'] = undefined;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @member {Object} metadata
 */
CreateAssistantRequest.prototype['metadata'] = undefined;






export default CreateAssistantRequest;

