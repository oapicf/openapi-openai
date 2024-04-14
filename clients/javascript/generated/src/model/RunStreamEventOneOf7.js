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
import RunObject from './RunObject';

/**
 * The RunStreamEventOneOf7 model module.
 * @module model/RunStreamEventOneOf7
 * @version 1.0.1-pre.0
 */
class RunStreamEventOneOf7 {
    /**
     * Constructs a new <code>RunStreamEventOneOf7</code>.
     * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
     * @alias module:model/RunStreamEventOneOf7
     * @param event {module:model/RunStreamEventOneOf7.EventEnum} 
     * @param data {module:model/RunObject} 
     */
    constructor(event, data) { 
        
        RunStreamEventOneOf7.initialize(this, event, data);
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
     * Constructs a <code>RunStreamEventOneOf7</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStreamEventOneOf7} obj Optional instance to populate.
     * @return {module:model/RunStreamEventOneOf7} The populated <code>RunStreamEventOneOf7</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStreamEventOneOf7();

            if (data.hasOwnProperty('event')) {
                obj['event'] = ApiClient.convertToType(data['event'], 'String');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = RunObject.constructFromObject(data['data']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunStreamEventOneOf7</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStreamEventOneOf7</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunStreamEventOneOf7.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['event'] && !(typeof data['event'] === 'string' || data['event'] instanceof String)) {
            throw new Error("Expected the field `event` to be a primitive type in the JSON string but got " + data['event']);
        }
        // validate the optional field `data`
        if (data['data']) { // data not null
          RunObject.validateJSON(data['data']);
        }

        return true;
    }


}

RunStreamEventOneOf7.RequiredProperties = ["event", "data"];

/**
 * @member {module:model/RunStreamEventOneOf7.EventEnum} event
 */
RunStreamEventOneOf7.prototype['event'] = undefined;

/**
 * @member {module:model/RunObject} data
 */
RunStreamEventOneOf7.prototype['data'] = undefined;





/**
 * Allowed values for the <code>event</code> property.
 * @enum {String}
 * @readonly
 */
RunStreamEventOneOf7['EventEnum'] = {

    /**
     * value: "thread.run.cancelled"
     * @const
     */
    "thread.run.cancelled": "thread.run.cancelled"
};



export default RunStreamEventOneOf7;

