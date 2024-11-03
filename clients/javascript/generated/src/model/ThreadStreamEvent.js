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
import ThreadObject from './ThreadObject';
import ThreadStreamEventOneOf from './ThreadStreamEventOneOf';

/**
 * The ThreadStreamEvent model module.
 * @module model/ThreadStreamEvent
 * @version 1.1.1-pre.0
 */
class ThreadStreamEvent {
    /**
     * Constructs a new <code>ThreadStreamEvent</code>.
     * @alias module:model/ThreadStreamEvent
     * @param {(module:model/ThreadStreamEventOneOf)} instance The actual instance to initialize ThreadStreamEvent.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "ThreadStreamEventOneOf") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                ThreadStreamEventOneOf.validateJSON(instance); // throw an exception if no match
                // create ThreadStreamEventOneOf from JS object
                this.actualInstance = ThreadStreamEventOneOf.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into ThreadStreamEventOneOf
            errorMessages.push("Failed to construct ThreadStreamEventOneOf: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `ThreadStreamEvent` with oneOf schemas ThreadStreamEventOneOf. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `ThreadStreamEvent` with oneOf schemas ThreadStreamEventOneOf. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>ThreadStreamEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ThreadStreamEvent} obj Optional instance to populate.
     * @return {module:model/ThreadStreamEvent} The populated <code>ThreadStreamEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        return new ThreadStreamEvent(data);
    }

    /**
     * Gets the actual instance, which can be <code>ThreadStreamEventOneOf</code>.
     * @return {(module:model/ThreadStreamEventOneOf)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>ThreadStreamEventOneOf</code>.
     * @param {(module:model/ThreadStreamEventOneOf)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = ThreadStreamEvent.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of ThreadStreamEvent from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/ThreadStreamEvent} An instance of ThreadStreamEvent.
     */
    static fromJSON = function(json_string){
        return ThreadStreamEvent.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * @member {module:model/ThreadStreamEvent.EventEnum} event
 */
ThreadStreamEvent.prototype['event'] = undefined;

/**
 * @member {module:model/ThreadObject} data
 */
ThreadStreamEvent.prototype['data'] = undefined;


ThreadStreamEvent.OneOf = ["ThreadStreamEventOneOf"];

export default ThreadStreamEvent;

