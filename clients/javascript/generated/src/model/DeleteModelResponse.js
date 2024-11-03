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
 * The DeleteModelResponse model module.
 * @module model/DeleteModelResponse
 * @version 1.1.1-pre.0
 */
class DeleteModelResponse {
    /**
     * Constructs a new <code>DeleteModelResponse</code>.
     * @alias module:model/DeleteModelResponse
     * @param id {String} 
     * @param deleted {Boolean} 
     * @param object {String} 
     */
    constructor(id, deleted, object) { 
        
        DeleteModelResponse.initialize(this, id, deleted, object);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, deleted, object) { 
        obj['id'] = id;
        obj['deleted'] = deleted;
        obj['object'] = object;
    }

    /**
     * Constructs a <code>DeleteModelResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DeleteModelResponse} obj Optional instance to populate.
     * @return {module:model/DeleteModelResponse} The populated <code>DeleteModelResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DeleteModelResponse();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('deleted')) {
                obj['deleted'] = ApiClient.convertToType(data['deleted'], 'Boolean');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DeleteModelResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DeleteModelResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of DeleteModelResponse.RequiredProperties) {
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

DeleteModelResponse.RequiredProperties = ["id", "deleted", "object"];

/**
 * @member {String} id
 */
DeleteModelResponse.prototype['id'] = undefined;

/**
 * @member {Boolean} deleted
 */
DeleteModelResponse.prototype['deleted'] = undefined;

/**
 * @member {String} object
 */
DeleteModelResponse.prototype['object'] = undefined;






export default DeleteModelResponse;

