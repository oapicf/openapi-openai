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
import RunStepStreamEventOneOf from './RunStepStreamEventOneOf';
import RunStepStreamEventOneOf1 from './RunStepStreamEventOneOf1';
import RunStepStreamEventOneOf2 from './RunStepStreamEventOneOf2';
import RunStepStreamEventOneOf3 from './RunStepStreamEventOneOf3';
import RunStepStreamEventOneOf4 from './RunStepStreamEventOneOf4';
import RunStepStreamEventOneOf5 from './RunStepStreamEventOneOf5';
import RunStepStreamEventOneOf6 from './RunStepStreamEventOneOf6';

/**
 * The RunStepStreamEvent model module.
 * @module model/RunStepStreamEvent
 * @version 1.0.1-pre.0
 */
class RunStepStreamEvent {
    /**
     * Constructs a new <code>RunStepStreamEvent</code>.
     * @alias module:model/RunStepStreamEvent
     * @param {(module:model/RunStepStreamEventOneOf|module:model/RunStepStreamEventOneOf1|module:model/RunStepStreamEventOneOf2|module:model/RunStepStreamEventOneOf3|module:model/RunStepStreamEventOneOf4|module:model/RunStepStreamEventOneOf5|module:model/RunStepStreamEventOneOf6)} instance The actual instance to initialize RunStepStreamEvent.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "RunStepStreamEventOneOf") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf from JS object
                this.actualInstance = RunStepStreamEventOneOf.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf
            errorMessages.push("Failed to construct RunStepStreamEventOneOf: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEventOneOf1") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf1.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf1 from JS object
                this.actualInstance = RunStepStreamEventOneOf1.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf1
            errorMessages.push("Failed to construct RunStepStreamEventOneOf1: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEventOneOf2") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf2.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf2 from JS object
                this.actualInstance = RunStepStreamEventOneOf2.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf2
            errorMessages.push("Failed to construct RunStepStreamEventOneOf2: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEventOneOf3") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf3.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf3 from JS object
                this.actualInstance = RunStepStreamEventOneOf3.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf3
            errorMessages.push("Failed to construct RunStepStreamEventOneOf3: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEventOneOf4") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf4.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf4 from JS object
                this.actualInstance = RunStepStreamEventOneOf4.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf4
            errorMessages.push("Failed to construct RunStepStreamEventOneOf4: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEventOneOf5") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf5.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf5 from JS object
                this.actualInstance = RunStepStreamEventOneOf5.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf5
            errorMessages.push("Failed to construct RunStepStreamEventOneOf5: " + err)
        }

        try {
            if (typeof instance === "RunStepStreamEventOneOf6") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepStreamEventOneOf6.validateJSON(instance); // throw an exception if no match
                // create RunStepStreamEventOneOf6 from JS object
                this.actualInstance = RunStepStreamEventOneOf6.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepStreamEventOneOf6
            errorMessages.push("Failed to construct RunStepStreamEventOneOf6: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `RunStepStreamEvent` with oneOf schemas RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `RunStepStreamEvent` with oneOf schemas RunStepStreamEventOneOf, RunStepStreamEventOneOf1, RunStepStreamEventOneOf2, RunStepStreamEventOneOf3, RunStepStreamEventOneOf4, RunStepStreamEventOneOf5, RunStepStreamEventOneOf6. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>RunStepStreamEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepStreamEvent} obj Optional instance to populate.
     * @return {module:model/RunStepStreamEvent} The populated <code>RunStepStreamEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        return new RunStepStreamEvent(data);
    }

    /**
     * Gets the actual instance, which can be <code>RunStepStreamEventOneOf</code>, <code>RunStepStreamEventOneOf1</code>, <code>RunStepStreamEventOneOf2</code>, <code>RunStepStreamEventOneOf3</code>, <code>RunStepStreamEventOneOf4</code>, <code>RunStepStreamEventOneOf5</code>, <code>RunStepStreamEventOneOf6</code>.
     * @return {(module:model/RunStepStreamEventOneOf|module:model/RunStepStreamEventOneOf1|module:model/RunStepStreamEventOneOf2|module:model/RunStepStreamEventOneOf3|module:model/RunStepStreamEventOneOf4|module:model/RunStepStreamEventOneOf5|module:model/RunStepStreamEventOneOf6)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>RunStepStreamEventOneOf</code>, <code>RunStepStreamEventOneOf1</code>, <code>RunStepStreamEventOneOf2</code>, <code>RunStepStreamEventOneOf3</code>, <code>RunStepStreamEventOneOf4</code>, <code>RunStepStreamEventOneOf5</code>, <code>RunStepStreamEventOneOf6</code>.
     * @param {(module:model/RunStepStreamEventOneOf|module:model/RunStepStreamEventOneOf1|module:model/RunStepStreamEventOneOf2|module:model/RunStepStreamEventOneOf3|module:model/RunStepStreamEventOneOf4|module:model/RunStepStreamEventOneOf5|module:model/RunStepStreamEventOneOf6)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = RunStepStreamEvent.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of RunStepStreamEvent from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/RunStepStreamEvent} An instance of RunStepStreamEvent.
     */
    static fromJSON = function(json_string){
        return RunStepStreamEvent.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * @member {module:model/RunStepStreamEvent.EventEnum} event
 */
RunStepStreamEvent.prototype['event'] = undefined;

/**
 * @member {module:model/RunStepObject} data
 */
RunStepStreamEvent.prototype['data'] = undefined;


RunStepStreamEvent.OneOf = ["RunStepStreamEventOneOf", "RunStepStreamEventOneOf1", "RunStepStreamEventOneOf2", "RunStepStreamEventOneOf3", "RunStepStreamEventOneOf4", "RunStepStreamEventOneOf5", "RunStepStreamEventOneOf6"];

export default RunStepStreamEvent;

