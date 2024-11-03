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
import RunStreamEventOneOf from './RunStreamEventOneOf';
import RunStreamEventOneOf1 from './RunStreamEventOneOf1';
import RunStreamEventOneOf2 from './RunStreamEventOneOf2';
import RunStreamEventOneOf3 from './RunStreamEventOneOf3';
import RunStreamEventOneOf4 from './RunStreamEventOneOf4';
import RunStreamEventOneOf5 from './RunStreamEventOneOf5';
import RunStreamEventOneOf6 from './RunStreamEventOneOf6';
import RunStreamEventOneOf7 from './RunStreamEventOneOf7';
import RunStreamEventOneOf8 from './RunStreamEventOneOf8';

/**
 * The RunStreamEvent model module.
 * @module model/RunStreamEvent
 * @version 1.1.1-pre.0
 */
class RunStreamEvent {
    /**
     * Constructs a new <code>RunStreamEvent</code>.
     * @alias module:model/RunStreamEvent
     * @param {(module:model/RunStreamEventOneOf|module:model/RunStreamEventOneOf1|module:model/RunStreamEventOneOf2|module:model/RunStreamEventOneOf3|module:model/RunStreamEventOneOf4|module:model/RunStreamEventOneOf5|module:model/RunStreamEventOneOf6|module:model/RunStreamEventOneOf7|module:model/RunStreamEventOneOf8)} instance The actual instance to initialize RunStreamEvent.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "RunStreamEventOneOf") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf from JS object
                this.actualInstance = RunStreamEventOneOf.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf
            errorMessages.push("Failed to construct RunStreamEventOneOf: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf1") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf1.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf1 from JS object
                this.actualInstance = RunStreamEventOneOf1.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf1
            errorMessages.push("Failed to construct RunStreamEventOneOf1: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf2") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf2.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf2 from JS object
                this.actualInstance = RunStreamEventOneOf2.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf2
            errorMessages.push("Failed to construct RunStreamEventOneOf2: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf3") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf3.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf3 from JS object
                this.actualInstance = RunStreamEventOneOf3.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf3
            errorMessages.push("Failed to construct RunStreamEventOneOf3: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf4") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf4.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf4 from JS object
                this.actualInstance = RunStreamEventOneOf4.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf4
            errorMessages.push("Failed to construct RunStreamEventOneOf4: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf5") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf5.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf5 from JS object
                this.actualInstance = RunStreamEventOneOf5.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf5
            errorMessages.push("Failed to construct RunStreamEventOneOf5: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf6") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf6.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf6 from JS object
                this.actualInstance = RunStreamEventOneOf6.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf6
            errorMessages.push("Failed to construct RunStreamEventOneOf6: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf7") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf7.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf7 from JS object
                this.actualInstance = RunStreamEventOneOf7.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf7
            errorMessages.push("Failed to construct RunStreamEventOneOf7: " + err)
        }

        try {
            if (typeof instance === "RunStreamEventOneOf8") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStreamEventOneOf8.validateJSON(instance); // throw an exception if no match
                // create RunStreamEventOneOf8 from JS object
                this.actualInstance = RunStreamEventOneOf8.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStreamEventOneOf8
            errorMessages.push("Failed to construct RunStreamEventOneOf8: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `RunStreamEvent` with oneOf schemas RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `RunStreamEvent` with oneOf schemas RunStreamEventOneOf, RunStreamEventOneOf1, RunStreamEventOneOf2, RunStreamEventOneOf3, RunStreamEventOneOf4, RunStreamEventOneOf5, RunStreamEventOneOf6, RunStreamEventOneOf7, RunStreamEventOneOf8. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>RunStreamEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStreamEvent} obj Optional instance to populate.
     * @return {module:model/RunStreamEvent} The populated <code>RunStreamEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        return new RunStreamEvent(data);
    }

    /**
     * Gets the actual instance, which can be <code>RunStreamEventOneOf</code>, <code>RunStreamEventOneOf1</code>, <code>RunStreamEventOneOf2</code>, <code>RunStreamEventOneOf3</code>, <code>RunStreamEventOneOf4</code>, <code>RunStreamEventOneOf5</code>, <code>RunStreamEventOneOf6</code>, <code>RunStreamEventOneOf7</code>, <code>RunStreamEventOneOf8</code>.
     * @return {(module:model/RunStreamEventOneOf|module:model/RunStreamEventOneOf1|module:model/RunStreamEventOneOf2|module:model/RunStreamEventOneOf3|module:model/RunStreamEventOneOf4|module:model/RunStreamEventOneOf5|module:model/RunStreamEventOneOf6|module:model/RunStreamEventOneOf7|module:model/RunStreamEventOneOf8)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>RunStreamEventOneOf</code>, <code>RunStreamEventOneOf1</code>, <code>RunStreamEventOneOf2</code>, <code>RunStreamEventOneOf3</code>, <code>RunStreamEventOneOf4</code>, <code>RunStreamEventOneOf5</code>, <code>RunStreamEventOneOf6</code>, <code>RunStreamEventOneOf7</code>, <code>RunStreamEventOneOf8</code>.
     * @param {(module:model/RunStreamEventOneOf|module:model/RunStreamEventOneOf1|module:model/RunStreamEventOneOf2|module:model/RunStreamEventOneOf3|module:model/RunStreamEventOneOf4|module:model/RunStreamEventOneOf5|module:model/RunStreamEventOneOf6|module:model/RunStreamEventOneOf7|module:model/RunStreamEventOneOf8)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = RunStreamEvent.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of RunStreamEvent from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/RunStreamEvent} An instance of RunStreamEvent.
     */
    static fromJSON = function(json_string){
        return RunStreamEvent.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * @member {module:model/RunStreamEvent.EventEnum} event
 */
RunStreamEvent.prototype['event'] = undefined;

/**
 * @member {module:model/RunObject} data
 */
RunStreamEvent.prototype['data'] = undefined;


RunStreamEvent.OneOf = ["RunStreamEventOneOf", "RunStreamEventOneOf1", "RunStreamEventOneOf2", "RunStreamEventOneOf3", "RunStreamEventOneOf4", "RunStreamEventOneOf5", "RunStreamEventOneOf6", "RunStreamEventOneOf7", "RunStreamEventOneOf8"];

export default RunStreamEvent;

