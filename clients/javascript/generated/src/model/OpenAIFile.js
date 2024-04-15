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
 * The OpenAIFile model module.
 * @module model/OpenAIFile
 * @version 1.0.1-pre.0
 */
class OpenAIFile {
    /**
     * Constructs a new <code>OpenAIFile</code>.
     * The &#x60;File&#x60; object represents a document that has been uploaded to OpenAI.
     * @alias module:model/OpenAIFile
     * @param id {String} The file identifier, which can be referenced in the API endpoints.
     * @param bytes {Number} The size of the file, in bytes.
     * @param createdAt {Number} The Unix timestamp (in seconds) for when the file was created.
     * @param filename {String} The name of the file.
     * @param object {module:model/OpenAIFile.ObjectEnum} The object type, which is always `file`.
     * @param purpose {module:model/OpenAIFile.PurposeEnum} The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
     * @param status {module:model/OpenAIFile.StatusEnum} Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
     */
    constructor(id, bytes, createdAt, filename, object, purpose, status) { 
        
        OpenAIFile.initialize(this, id, bytes, createdAt, filename, object, purpose, status);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, bytes, createdAt, filename, object, purpose, status) { 
        obj['id'] = id;
        obj['bytes'] = bytes;
        obj['created_at'] = createdAt;
        obj['filename'] = filename;
        obj['object'] = object;
        obj['purpose'] = purpose;
        obj['status'] = status;
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
            if (data.hasOwnProperty('bytes')) {
                obj['bytes'] = ApiClient.convertToType(data['bytes'], 'Number');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Number');
            }
            if (data.hasOwnProperty('filename')) {
                obj['filename'] = ApiClient.convertToType(data['filename'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('purpose')) {
                obj['purpose'] = ApiClient.convertToType(data['purpose'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], 'String');
            }
            if (data.hasOwnProperty('status_details')) {
                obj['status_details'] = ApiClient.convertToType(data['status_details'], 'String');
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
        if (data['filename'] && !(typeof data['filename'] === 'string' || data['filename'] instanceof String)) {
            throw new Error("Expected the field `filename` to be a primitive type in the JSON string but got " + data['filename']);
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
        }
        // ensure the json data is a string
        if (data['purpose'] && !(typeof data['purpose'] === 'string' || data['purpose'] instanceof String)) {
            throw new Error("Expected the field `purpose` to be a primitive type in the JSON string but got " + data['purpose']);
        }
        // ensure the json data is a string
        if (data['status'] && !(typeof data['status'] === 'string' || data['status'] instanceof String)) {
            throw new Error("Expected the field `status` to be a primitive type in the JSON string but got " + data['status']);
        }
        // ensure the json data is a string
        if (data['status_details'] && !(typeof data['status_details'] === 'string' || data['status_details'] instanceof String)) {
            throw new Error("Expected the field `status_details` to be a primitive type in the JSON string but got " + data['status_details']);
        }

        return true;
    }


}

OpenAIFile.RequiredProperties = ["id", "bytes", "created_at", "filename", "object", "purpose", "status"];

/**
 * The file identifier, which can be referenced in the API endpoints.
 * @member {String} id
 */
OpenAIFile.prototype['id'] = undefined;

/**
 * The size of the file, in bytes.
 * @member {Number} bytes
 */
OpenAIFile.prototype['bytes'] = undefined;

/**
 * The Unix timestamp (in seconds) for when the file was created.
 * @member {Number} created_at
 */
OpenAIFile.prototype['created_at'] = undefined;

/**
 * The name of the file.
 * @member {String} filename
 */
OpenAIFile.prototype['filename'] = undefined;

/**
 * The object type, which is always `file`.
 * @member {module:model/OpenAIFile.ObjectEnum} object
 */
OpenAIFile.prototype['object'] = undefined;

/**
 * The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`.
 * @member {module:model/OpenAIFile.PurposeEnum} purpose
 */
OpenAIFile.prototype['purpose'] = undefined;

/**
 * Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`.
 * @member {module:model/OpenAIFile.StatusEnum} status
 */
OpenAIFile.prototype['status'] = undefined;

/**
 * Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`.
 * @member {String} status_details
 */
OpenAIFile.prototype['status_details'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
OpenAIFile['ObjectEnum'] = {

    /**
     * value: "file"
     * @const
     */
    "file": "file"
};


/**
 * Allowed values for the <code>purpose</code> property.
 * @enum {String}
 * @readonly
 */
OpenAIFile['PurposeEnum'] = {

    /**
     * value: "fine-tune"
     * @const
     */
    "fine-tune": "fine-tune",

    /**
     * value: "fine-tune-results"
     * @const
     */
    "fine-tune-results": "fine-tune-results",

    /**
     * value: "assistants"
     * @const
     */
    "assistants": "assistants",

    /**
     * value: "assistants_output"
     * @const
     */
    "assistants_output": "assistants_output"
};


/**
 * Allowed values for the <code>status</code> property.
 * @enum {String}
 * @readonly
 */
OpenAIFile['StatusEnum'] = {

    /**
     * value: "uploaded"
     * @const
     */
    "uploaded": "uploaded",

    /**
     * value: "processed"
     * @const
     */
    "processed": "processed",

    /**
     * value: "error"
     * @const
     */
    "error": "error"
};



export default OpenAIFile;
