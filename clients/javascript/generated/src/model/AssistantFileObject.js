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

/**
 * The AssistantFileObject model module.
 * @module model/AssistantFileObject
 * @version 1.0.1-pre.0
 */
class AssistantFileObject {
    /**
     * Constructs a new <code>AssistantFileObject</code>.
     * A list of [Files](/docs/api-reference/files) attached to an &#x60;assistant&#x60;.
     * @alias module:model/AssistantFileObject
     * @param id {String} The identifier, which can be referenced in API endpoints.
     * @param object {module:model/AssistantFileObject.ObjectEnum} The object type, which is always `assistant.file`.
     * @param createdAt {Number} The Unix timestamp (in seconds) for when the assistant file was created.
     * @param assistantId {String} The assistant ID that the file is attached to.
     */
    constructor(id, object, createdAt, assistantId) { 
        
        AssistantFileObject.initialize(this, id, object, createdAt, assistantId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, object, createdAt, assistantId) { 
        obj['id'] = id;
        obj['object'] = object;
        obj['created_at'] = createdAt;
        obj['assistant_id'] = assistantId;
    }

    /**
     * Constructs a <code>AssistantFileObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AssistantFileObject} obj Optional instance to populate.
     * @return {module:model/AssistantFileObject} The populated <code>AssistantFileObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AssistantFileObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Number');
            }
            if (data.hasOwnProperty('assistant_id')) {
                obj['assistant_id'] = ApiClient.convertToType(data['assistant_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AssistantFileObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AssistantFileObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of AssistantFileObject.RequiredProperties) {
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
        if (data['assistant_id'] && !(typeof data['assistant_id'] === 'string' || data['assistant_id'] instanceof String)) {
            throw new Error("Expected the field `assistant_id` to be a primitive type in the JSON string but got " + data['assistant_id']);
        }

        return true;
    }


}

AssistantFileObject.RequiredProperties = ["id", "object", "created_at", "assistant_id"];

/**
 * The identifier, which can be referenced in API endpoints.
 * @member {String} id
 */
AssistantFileObject.prototype['id'] = undefined;

/**
 * The object type, which is always `assistant.file`.
 * @member {module:model/AssistantFileObject.ObjectEnum} object
 */
AssistantFileObject.prototype['object'] = undefined;

/**
 * The Unix timestamp (in seconds) for when the assistant file was created.
 * @member {Number} created_at
 */
AssistantFileObject.prototype['created_at'] = undefined;

/**
 * The assistant ID that the file is attached to.
 * @member {String} assistant_id
 */
AssistantFileObject.prototype['assistant_id'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
AssistantFileObject['ObjectEnum'] = {

    /**
     * value: "assistant.file"
     * @const
     */
    "assistant.file": "assistant.file"
};



export default AssistantFileObject;

