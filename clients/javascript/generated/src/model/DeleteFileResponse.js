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
 * The DeleteFileResponse model module.
 * @module model/DeleteFileResponse
 * @version 1.1.1-pre.0
 */
class DeleteFileResponse {
    /**
     * Constructs a new <code>DeleteFileResponse</code>.
     * @alias module:model/DeleteFileResponse
     * @param id {String} 
     * @param object {module:model/DeleteFileResponse.ObjectEnum} 
     * @param deleted {Boolean} 
     */
    constructor(id, object, deleted) { 
        
        DeleteFileResponse.initialize(this, id, object, deleted);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, object, deleted) { 
        obj['id'] = id;
        obj['object'] = object;
        obj['deleted'] = deleted;
    }

    /**
     * Constructs a <code>DeleteFileResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DeleteFileResponse} obj Optional instance to populate.
     * @return {module:model/DeleteFileResponse} The populated <code>DeleteFileResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeleteFileResponse();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('deleted')) {
                obj['deleted'] = ApiClient.convertToType(data['deleted'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DeleteFileResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DeleteFileResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of DeleteFileResponse.RequiredProperties) {
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

DeleteFileResponse.RequiredProperties = ["id", "object", "deleted"];

/**
 * @member {String} id
 */
DeleteFileResponse.prototype['id'] = undefined;

/**
 * @member {module:model/DeleteFileResponse.ObjectEnum} object
 */
DeleteFileResponse.prototype['object'] = undefined;

/**
 * @member {Boolean} deleted
 */
DeleteFileResponse.prototype['deleted'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
DeleteFileResponse['ObjectEnum'] = {

    /**
     * value: "file"
     * @const
     */
    "file": "file"
};



export default DeleteFileResponse;

