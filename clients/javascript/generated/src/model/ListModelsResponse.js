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
import Model from './Model';

/**
 * The ListModelsResponse model module.
 * @module model/ListModelsResponse
 * @version 1.1.1-pre.0
 */
class ListModelsResponse {
    /**
     * Constructs a new <code>ListModelsResponse</code>.
     * @alias module:model/ListModelsResponse
     * @param object {module:model/ListModelsResponse.ObjectEnum} 
     * @param data {Array.<module:model/Model>} 
     */
    constructor(object, data) { 
        
        ListModelsResponse.initialize(this, object, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, object, data) { 
        obj['object'] = object;
        obj['data'] = data;
    }

    /**
     * Constructs a <code>ListModelsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListModelsResponse} obj Optional instance to populate.
     * @return {module:model/ListModelsResponse} The populated <code>ListModelsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListModelsResponse();

            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [Model]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ListModelsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ListModelsResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ListModelsResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
        }
        if (data['data']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['data'])) {
                throw new Error("Expected the field `data` to be an array in the JSON data but got " + data['data']);
            }
            // validate the optional field `data` (array)
            for (const item of data['data']) {
                Model.validateJSON(item);
            };
        }

        return true;
    }


}

ListModelsResponse.RequiredProperties = ["object", "data"];

/**
 * @member {module:model/ListModelsResponse.ObjectEnum} object
 */
ListModelsResponse.prototype['object'] = undefined;

/**
 * @member {Array.<module:model/Model>} data
 */
ListModelsResponse.prototype['data'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
ListModelsResponse['ObjectEnum'] = {

    /**
     * value: "list"
     * @const
     */
    "list": "list"
};



export default ListModelsResponse;

