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
 * The DoneEvent model module.
 * @module model/DoneEvent
 * @version 1.0.1-pre.0
 */
class DoneEvent {
    /**
     * Constructs a new <code>DoneEvent</code>.
     * Occurs when a stream ends.
     * @alias module:model/DoneEvent
     * @param event {module:model/DoneEvent.EventEnum} 
     * @param data {module:model/DoneEvent.DataEnum} 
     */
    constructor(event, data) { 
        
        DoneEvent.initialize(this, event, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, event, data) { 
        obj['event'] = event;
        obj['data'] = data;
    }

    /**
     * Constructs a <code>DoneEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/DoneEvent} obj Optional instance to populate.
     * @return {module:model/DoneEvent} The populated <code>DoneEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new DoneEvent();

            if (data.hasOwnProperty('event')) {
                obj['event'] = ApiClient.convertToType(data['event'], 'String');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>DoneEvent</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>DoneEvent</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of DoneEvent.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['event'] && !(typeof data['event'] === 'string' || data['event'] instanceof String)) {
            throw new Error("Expected the field `event` to be a primitive type in the JSON string but got " + data['event']);
        }
        // ensure the json data is a string
        if (data['data'] && !(typeof data['data'] === 'string' || data['data'] instanceof String)) {
            throw new Error("Expected the field `data` to be a primitive type in the JSON string but got " + data['data']);
        }

        return true;
    }


}

DoneEvent.RequiredProperties = ["event", "data"];

/**
 * @member {module:model/DoneEvent.EventEnum} event
 */
DoneEvent.prototype['event'] = undefined;

/**
 * @member {module:model/DoneEvent.DataEnum} data
 */
DoneEvent.prototype['data'] = undefined;





/**
 * Allowed values for the <code>event</code> property.
 * @enum {String}
 * @readonly
 */
DoneEvent['EventEnum'] = {

    /**
     * value: "done"
     * @const
     */
    "done": "done"
};


/**
 * Allowed values for the <code>data</code> property.
 * @enum {String}
 * @readonly
 */
DoneEvent['DataEnum'] = {

    /**
     * value: "[DONE]"
     * @const
     */
    "[DONE]": "[DONE]"
};



export default DoneEvent;
