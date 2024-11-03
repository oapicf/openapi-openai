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
 * The Model model module.
 * @module model/Model
 * @version 1.1.1-pre.0
 */
class Model {
    /**
     * Constructs a new <code>Model</code>.
     * Describes an OpenAI model offering that can be used with the API.
     * @alias module:model/Model
     * @param id {String} The model identifier, which can be referenced in the API endpoints.
     * @param created {Number} The Unix timestamp (in seconds) when the model was created.
     * @param object {module:model/Model.ObjectEnum} The object type, which is always \"model\".
     * @param ownedBy {String} The organization that owns the model.
     */
    constructor(id, created, object, ownedBy) { 
        
        Model.initialize(this, id, created, object, ownedBy);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, created, object, ownedBy) { 
        obj['id'] = id;
        obj['created'] = created;
        obj['object'] = object;
        obj['owned_by'] = ownedBy;
    }

    /**
     * Constructs a <code>Model</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Model} obj Optional instance to populate.
     * @return {module:model/Model} The populated <code>Model</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Model();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Number');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('owned_by')) {
                obj['owned_by'] = ApiClient.convertToType(data['owned_by'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Model</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Model</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Model.RequiredProperties) {
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
        if (data['owned_by'] && !(typeof data['owned_by'] === 'string' || data['owned_by'] instanceof String)) {
            throw new Error("Expected the field `owned_by` to be a primitive type in the JSON string but got " + data['owned_by']);
        }

        return true;
    }


}

Model.RequiredProperties = ["id", "created", "object", "owned_by"];

/**
 * The model identifier, which can be referenced in the API endpoints.
 * @member {String} id
 */
Model.prototype['id'] = undefined;

/**
 * The Unix timestamp (in seconds) when the model was created.
 * @member {Number} created
 */
Model.prototype['created'] = undefined;

/**
 * The object type, which is always \"model\".
 * @member {module:model/Model.ObjectEnum} object
 */
Model.prototype['object'] = undefined;

/**
 * The organization that owns the model.
 * @member {String} owned_by
 */
Model.prototype['owned_by'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
Model['ObjectEnum'] = {

    /**
     * value: "model"
     * @const
     */
    "model": "model"
};



export default Model;

