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
 * The MessageObjectIncompleteDetails model module.
 * @module model/MessageObjectIncompleteDetails
 * @version 1.1.1-pre.0
 */
class MessageObjectIncompleteDetails {
    /**
     * Constructs a new <code>MessageObjectIncompleteDetails</code>.
     * On an incomplete message, details about why the message is incomplete.
     * @alias module:model/MessageObjectIncompleteDetails
     * @param reason {module:model/MessageObjectIncompleteDetails.ReasonEnum} The reason the message is incomplete.
     */
    constructor(reason) { 
        
        MessageObjectIncompleteDetails.initialize(this, reason);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, reason) { 
        obj['reason'] = reason;
    }

    /**
     * Constructs a <code>MessageObjectIncompleteDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageObjectIncompleteDetails} obj Optional instance to populate.
     * @return {module:model/MessageObjectIncompleteDetails} The populated <code>MessageObjectIncompleteDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageObjectIncompleteDetails();

            if (data.hasOwnProperty('reason')) {
                obj['reason'] = ApiClient.convertToType(data['reason'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageObjectIncompleteDetails</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageObjectIncompleteDetails</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MessageObjectIncompleteDetails.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['reason'] && !(typeof data['reason'] === 'string' || data['reason'] instanceof String)) {
            throw new Error("Expected the field `reason` to be a primitive type in the JSON string but got " + data['reason']);
        }

        return true;
    }


}

MessageObjectIncompleteDetails.RequiredProperties = ["reason"];

/**
 * The reason the message is incomplete.
 * @member {module:model/MessageObjectIncompleteDetails.ReasonEnum} reason
 */
MessageObjectIncompleteDetails.prototype['reason'] = undefined;





/**
 * Allowed values for the <code>reason</code> property.
 * @enum {String}
 * @readonly
 */
MessageObjectIncompleteDetails['ReasonEnum'] = {

    /**
     * value: "content_filter"
     * @const
     */
    "content_filter": "content_filter",

    /**
     * value: "max_tokens"
     * @const
     */
    "max_tokens": "max_tokens",

    /**
     * value: "run_cancelled"
     * @const
     */
    "run_cancelled": "run_cancelled",

    /**
     * value: "run_expired"
     * @const
     */
    "run_expired": "run_expired",

    /**
     * value: "run_failed"
     * @const
     */
    "run_failed": "run_failed"
};



export default MessageObjectIncompleteDetails;

