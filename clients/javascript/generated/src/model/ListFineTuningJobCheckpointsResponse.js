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
import FineTuningJobCheckpoint from './FineTuningJobCheckpoint';

/**
 * The ListFineTuningJobCheckpointsResponse model module.
 * @module model/ListFineTuningJobCheckpointsResponse
 * @version 1.1.1-pre.0
 */
class ListFineTuningJobCheckpointsResponse {
    /**
     * Constructs a new <code>ListFineTuningJobCheckpointsResponse</code>.
     * @alias module:model/ListFineTuningJobCheckpointsResponse
     * @param data {Array.<module:model/FineTuningJobCheckpoint>} 
     * @param object {module:model/ListFineTuningJobCheckpointsResponse.ObjectEnum} 
     * @param hasMore {Boolean} 
     */
    constructor(data, object, hasMore) { 
        
        ListFineTuningJobCheckpointsResponse.initialize(this, data, object, hasMore);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, data, object, hasMore) { 
        obj['data'] = data;
        obj['object'] = object;
        obj['has_more'] = hasMore;
    }

    /**
     * Constructs a <code>ListFineTuningJobCheckpointsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ListFineTuningJobCheckpointsResponse} obj Optional instance to populate.
     * @return {module:model/ListFineTuningJobCheckpointsResponse} The populated <code>ListFineTuningJobCheckpointsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ListFineTuningJobCheckpointsResponse();

            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [FineTuningJobCheckpoint]);
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
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
     * Validates the JSON data with respect to <code>ListFineTuningJobCheckpointsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ListFineTuningJobCheckpointsResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ListFineTuningJobCheckpointsResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['data']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['data'])) {
                throw new Error("Expected the field `data` to be an array in the JSON data but got " + data['data']);
            }
            // validate the optional field `data` (array)
            for (const item of data['data']) {
                FineTuningJobCheckpoint.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
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

ListFineTuningJobCheckpointsResponse.RequiredProperties = ["data", "object", "has_more"];

/**
 * @member {Array.<module:model/FineTuningJobCheckpoint>} data
 */
ListFineTuningJobCheckpointsResponse.prototype['data'] = undefined;

/**
 * @member {module:model/ListFineTuningJobCheckpointsResponse.ObjectEnum} object
 */
ListFineTuningJobCheckpointsResponse.prototype['object'] = undefined;

/**
 * @member {String} first_id
 */
ListFineTuningJobCheckpointsResponse.prototype['first_id'] = undefined;

/**
 * @member {String} last_id
 */
ListFineTuningJobCheckpointsResponse.prototype['last_id'] = undefined;

/**
 * @member {Boolean} has_more
 */
ListFineTuningJobCheckpointsResponse.prototype['has_more'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
ListFineTuningJobCheckpointsResponse['ObjectEnum'] = {

    /**
     * value: "list"
     * @const
     */
    "list": "list"
};



export default ListFineTuningJobCheckpointsResponse;

