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
 * The RunStreamEventOneOf2 model module.
 * @module model/RunStreamEventOneOf2
 * @version 1.1.1-pre.0
 */
class RunStreamEventOneOf2 {
    /**
     * Constructs a new <code>RunStreamEventOneOf2</code>.
     * Occurs when a [run](/docs/api-reference/runs/object) moves to an &#x60;in_progress&#x60; status.
     * @alias module:model/RunStreamEventOneOf2
     * @param event {module:model/RunStreamEventOneOf2.EventEnum} 
     * @param data {module:model/RunObject} 
     */
    constructor(event, data) { 
        
        RunStreamEventOneOf2.initialize(this, event, data);
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
     * Constructs a <code>RunStreamEventOneOf2</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStreamEventOneOf2} obj Optional instance to populate.
     * @return {module:model/RunStreamEventOneOf2} The populated <code>RunStreamEventOneOf2</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStreamEventOneOf2();

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
     * Validates the JSON data with respect to <code>RunStreamEventOneOf2</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStreamEventOneOf2</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunStreamEventOneOf2.RequiredProperties) {
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

RunStreamEventOneOf2.RequiredProperties = ["event", "data"];

/**
 * @member {module:model/RunStreamEventOneOf2.EventEnum} event
 */
RunStreamEventOneOf2.prototype['event'] = undefined;

/**
 * @member {module:model/RunObject} data
 */
RunStreamEventOneOf2.prototype['data'] = undefined;





/**
 * Allowed values for the <code>event</code> property.
 * @enum {String}
 * @readonly
 */
RunStreamEventOneOf2['EventEnum'] = {

    /**
     * value: "thread.run.in_progress"
     * @const
     */
    "thread.run.in_progress": "thread.run.in_progress"
};



export default RunStreamEventOneOf2;

