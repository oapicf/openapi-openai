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
import RunStepObject from './RunStepObject';

/**
 * The ListRunStepsResponse model module.
 * @module model/ListRunStepsResponse
 * @version 1.1.1-pre.0
 */
class ListRunStepsResponse {
    /**
     * Constructs a new <code>ListRunStepsResponse</code>.
     * @alias module:model/ListRunStepsResponse
     * @param object {String} 
     * @param data {Array.<module:model/RunStepObject>} 
     * @param firstId {String} 
     * @param lastId {String} 
     * @param hasMore {Boolean} 
     */
    constructor(object, data, firstId, lastId, hasMore) { 
        
        ListRunStepsResponse.initialize(this, object, data, firstId, lastId, hasMore);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, object, data, firstId, lastId, hasMore) { 
        obj['object'] = object;
        obj['data'] = data;
        obj['first_id'] = firstId;
        obj['last_id'] = lastId;
        obj['has_more'] = hasMore;
    }

    /**
     * Constructs a <code>ListRunStepsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListRunStepsResponse} obj Optional instance to populate.
     * @return {module:model/ListRunStepsResponse} The populated <code>ListRunStepsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListRunStepsResponse();

            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [RunStepObject]);
            }
            if (data.hasOwnProperty('first_id')) {
                obj['first_id'] = ApiClient.convertToType(data['first_id'], 'String');
            }
            if (data.hasOwnProperty('last_id')) {
                obj['last_id'] = ApiClient.convertToType(data['last_id'], 'String');
            }
            if (data.hasOwnProperty('has_more')) {
                obj['has_more'] = ApiClient.convertToType(data['has_more'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ListRunStepsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ListRunStepsResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ListRunStepsResponse.RequiredProperties) {
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
                RunStepObject.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['first_id'] && !(typeof data['first_id'] === 'string' || data['first_id'] instanceof String)) {
            throw new Error("Expected the field `first_id` to be a primitive type in the JSON string but got " + data['first_id']);
        }
        // ensure the json data is a string
        if (data['last_id'] && !(typeof data['last_id'] === 'string' || data['last_id'] instanceof String)) {
            throw new Error("Expected the field `last_id` to be a primitive type in the JSON string but got " + data['last_id']);
        }

        return true;
    }


}

ListRunStepsResponse.RequiredProperties = ["object", "data", "first_id", "last_id", "has_more"];

/**
 * @member {String} object
 */
ListRunStepsResponse.prototype['object'] = undefined;

/**
 * @member {Array.<module:model/RunStepObject>} data
 */
ListRunStepsResponse.prototype['data'] = undefined;

/**
 * @member {String} first_id
 */
ListRunStepsResponse.prototype['first_id'] = undefined;

/**
 * @member {String} last_id
 */
ListRunStepsResponse.prototype['last_id'] = undefined;

/**
 * @member {Boolean} has_more
 */
ListRunStepsResponse.prototype['has_more'] = undefined;






export default ListRunStepsResponse;

