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
 * The ThreadObject model module.
 * @module model/ThreadObject
 * @version 1.1.1-pre.0
 */
class ThreadObject {
    /**
     * Constructs a new <code>ThreadObject</code>.
     * Represents a thread that contains [messages](/docs/api-reference/messages).
     * @alias module:model/ThreadObject
     * @param id {String} The identifier, which can be referenced in API endpoints.
     * @param object {module:model/ThreadObject.ObjectEnum} The object type, which is always `thread`.
     * @param createdAt {Number} The Unix timestamp (in seconds) for when the thread was created.
     * @param metadata {Object} Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     */
    constructor(id, object, createdAt, metadata) { 
        
        ThreadObject.initialize(this, id, object, createdAt, metadata);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, object, createdAt, metadata) { 
        obj['id'] = id;
        obj['object'] = object;
        obj['created_at'] = createdAt;
        obj['metadata'] = metadata;
    }

    /**
     * Constructs a <code>ThreadObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ThreadObject} obj Optional instance to populate.
     * @return {module:model/ThreadObject} The populated <code>ThreadObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ThreadObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Number');
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ThreadObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ThreadObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ThreadObject.RequiredProperties) {
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

        return true;
    }


}

ThreadObject.RequiredProperties = ["id", "object", "created_at", "metadata"];

/**
 * The identifier, which can be referenced in API endpoints.
 * @member {String} id
 */
ThreadObject.prototype['id'] = undefined;

/**
 * The object type, which is always `thread`.
 * @member {module:model/ThreadObject.ObjectEnum} object
 */
ThreadObject.prototype['object'] = undefined;

/**
 * The Unix timestamp (in seconds) for when the thread was created.
 * @member {Number} created_at
 */
ThreadObject.prototype['created_at'] = undefined;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @member {Object} metadata
 */
ThreadObject.prototype['metadata'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
ThreadObject['ObjectEnum'] = {

    /**
     * value: "thread"
     * @const
     */
    "thread": "thread"
};



export default ThreadObject;

