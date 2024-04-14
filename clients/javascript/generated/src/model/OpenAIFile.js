/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
 * The OpenAIFile model module.
 * @module model/OpenAIFile
 * @version 0.9.0-pre.0
 */
class OpenAIFile {
    /**
     * Constructs a new <code>OpenAIFile</code>.
     * @alias module:model/OpenAIFile
     * @param id {String} 
     * @param object {String} 
     * @param bytes {Number} 
     * @param createdAt {Number} 
     * @param filename {String} 
     * @param purpose {String} 
     */
    constructor(id, object, bytes, createdAt, filename, purpose) { 
        
        OpenAIFile.initialize(this, id, object, bytes, createdAt, filename, purpose);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, object, bytes, createdAt, filename, purpose) { 
        obj['id'] = id;
        obj['object'] = object;
        obj['bytes'] = bytes;
        obj['created_at'] = createdAt;
        obj['filename'] = filename;
        obj['purpose'] = purpose;
    }

    /**
     * Constructs a <code>OpenAIFile</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OpenAIFile} obj Optional instance to populate.
     * @return {module:model/OpenAIFile} The populated <code>OpenAIFile</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OpenAIFile();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('bytes')) {
                obj['bytes'] = ApiClient.convertToType(data['bytes'], 'Number');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Number');
            }
            if (data.hasOwnProperty('filename')) {
                obj['filename'] = ApiClient.convertToType(data['filename'], 'String');
            }
            if (data.hasOwnProperty('purpose')) {
                obj['purpose'] = ApiClient.convertToType(data['purpose'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('status_details')) {
                obj['status_details'] = ApiClient.convertToType(data['status_details'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>OpenAIFile</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>OpenAIFile</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of OpenAIFile.RequiredProperties) {
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
        if (data['filename'] && !(typeof data['filename'] === 'string' || data['filename'] instanceof String)) {
            throw new Error("Expected the field `filename` to be a primitive type in the JSON string but got " + data['filename']);
        }
        // ensure the json data is a string
        if (data['purpose'] && !(typeof data['purpose'] === 'string' || data['purpose'] instanceof String)) {
            throw new Error("Expected the field `purpose` to be a primitive type in the JSON string but got " + data['purpose']);
        }
        // ensure the json data is a string
        if (data['status'] && !(typeof data['status'] === 'string' || data['status'] instanceof String)) {
            throw new Error("Expected the field `status` to be a primitive type in the JSON string but got " + data['status']);
        }

        return true;
    }


}

OpenAIFile.RequiredProperties = ["id", "object", "bytes", "created_at", "filename", "purpose"];

/**
 * @member {String} id
 */
OpenAIFile.prototype['id'] = undefined;

/**
 * @member {String} object
 */
OpenAIFile.prototype['object'] = undefined;

/**
 * @member {Number} bytes
 */
OpenAIFile.prototype['bytes'] = undefined;

/**
 * @member {Number} created_at
 */
OpenAIFile.prototype['created_at'] = undefined;

/**
 * @member {String} filename
 */
OpenAIFile.prototype['filename'] = undefined;

/**
 * @member {String} purpose
 */
OpenAIFile.prototype['purpose'] = undefined;

/**
 * @member {String} status
 */
OpenAIFile.prototype['status'] = undefined;

/**
 * @member {Object} status_details
 */
OpenAIFile.prototype['status_details'] = undefined;






export default OpenAIFile;
