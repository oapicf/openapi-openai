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
import RunStepDetailsToolCallsCodeObject from './RunStepDetailsToolCallsCodeObject';
import RunStepDetailsToolCallsCodeObjectCodeInterpreter from './RunStepDetailsToolCallsCodeObjectCodeInterpreter';
import RunStepDetailsToolCallsFunctionObject from './RunStepDetailsToolCallsFunctionObject';
import RunStepDetailsToolCallsFunctionObjectFunction from './RunStepDetailsToolCallsFunctionObjectFunction';
import RunStepDetailsToolCallsRetrievalObject from './RunStepDetailsToolCallsRetrievalObject';

/**
 * The RunStepDetailsToolCallsObjectToolCallsInner model module.
 * @module model/RunStepDetailsToolCallsObjectToolCallsInner
 * @version 1.1.1-pre.0
 */
class RunStepDetailsToolCallsObjectToolCallsInner {
    /**
     * Constructs a new <code>RunStepDetailsToolCallsObjectToolCallsInner</code>.
     * @alias module:model/RunStepDetailsToolCallsObjectToolCallsInner
     * @param {(module:model/RunStepDetailsToolCallsCodeObject|module:model/RunStepDetailsToolCallsFunctionObject|module:model/RunStepDetailsToolCallsRetrievalObject)} instance The actual instance to initialize RunStepDetailsToolCallsObjectToolCallsInner.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "RunStepDetailsToolCallsCodeObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepDetailsToolCallsCodeObject.validateJSON(instance); // throw an exception if no match
                // create RunStepDetailsToolCallsCodeObject from JS object
                this.actualInstance = RunStepDetailsToolCallsCodeObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepDetailsToolCallsCodeObject
            errorMessages.push("Failed to construct RunStepDetailsToolCallsCodeObject: " + err)
        }

        try {
            if (typeof instance === "RunStepDetailsToolCallsRetrievalObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepDetailsToolCallsRetrievalObject.validateJSON(instance); // throw an exception if no match
                // create RunStepDetailsToolCallsRetrievalObject from JS object
                this.actualInstance = RunStepDetailsToolCallsRetrievalObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepDetailsToolCallsRetrievalObject
            errorMessages.push("Failed to construct RunStepDetailsToolCallsRetrievalObject: " + err)
        }

        try {
            if (typeof instance === "RunStepDetailsToolCallsFunctionObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepDetailsToolCallsFunctionObject.validateJSON(instance); // throw an exception if no match
                // create RunStepDetailsToolCallsFunctionObject from JS object
                this.actualInstance = RunStepDetailsToolCallsFunctionObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepDetailsToolCallsFunctionObject
            errorMessages.push("Failed to construct RunStepDetailsToolCallsFunctionObject: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `RunStepDetailsToolCallsObjectToolCallsInner` with oneOf schemas RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `RunStepDetailsToolCallsObjectToolCallsInner` with oneOf schemas RunStepDetailsToolCallsCodeObject, RunStepDetailsToolCallsFunctionObject, RunStepDetailsToolCallsRetrievalObject. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>RunStepDetailsToolCallsObjectToolCallsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepDetailsToolCallsObjectToolCallsInner} obj Optional instance to populate.
     * @return {module:model/RunStepDetailsToolCallsObjectToolCallsInner} The populated <code>RunStepDetailsToolCallsObjectToolCallsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        return new RunStepDetailsToolCallsObjectToolCallsInner(data);
    }

    /**
     * Gets the actual instance, which can be <code>RunStepDetailsToolCallsCodeObject</code>, <code>RunStepDetailsToolCallsFunctionObject</code>, <code>RunStepDetailsToolCallsRetrievalObject</code>.
     * @return {(module:model/RunStepDetailsToolCallsCodeObject|module:model/RunStepDetailsToolCallsFunctionObject|module:model/RunStepDetailsToolCallsRetrievalObject)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>RunStepDetailsToolCallsCodeObject</code>, <code>RunStepDetailsToolCallsFunctionObject</code>, <code>RunStepDetailsToolCallsRetrievalObject</code>.
     * @param {(module:model/RunStepDetailsToolCallsCodeObject|module:model/RunStepDetailsToolCallsFunctionObject|module:model/RunStepDetailsToolCallsRetrievalObject)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = RunStepDetailsToolCallsObjectToolCallsInner.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of RunStepDetailsToolCallsObjectToolCallsInner from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/RunStepDetailsToolCallsObjectToolCallsInner} An instance of RunStepDetailsToolCallsObjectToolCallsInner.
     */
    static fromJSON = function(json_string){
        return RunStepDetailsToolCallsObjectToolCallsInner.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * The ID of the tool call object.
 * @member {String} id
 */
RunStepDetailsToolCallsObjectToolCallsInner.prototype['id'] = undefined;

/**
 * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @member {module:model/RunStepDetailsToolCallsObjectToolCallsInner.TypeEnum} type
 */
RunStepDetailsToolCallsObjectToolCallsInner.prototype['type'] = undefined;

/**
 * @member {module:model/RunStepDetailsToolCallsCodeObjectCodeInterpreter} code_interpreter
 */
RunStepDetailsToolCallsObjectToolCallsInner.prototype['code_interpreter'] = undefined;

/**
 * For now, this is always going to be an empty object.
 * @member {Object} retrieval
 */
RunStepDetailsToolCallsObjectToolCallsInner.prototype['retrieval'] = undefined;

/**
 * @member {module:model/RunStepDetailsToolCallsFunctionObjectFunction} function
 */
RunStepDetailsToolCallsObjectToolCallsInner.prototype['function'] = undefined;


RunStepDetailsToolCallsObjectToolCallsInner.OneOf = ["RunStepDetailsToolCallsCodeObject", "RunStepDetailsToolCallsFunctionObject", "RunStepDetailsToolCallsRetrievalObject"];

export default RunStepDetailsToolCallsObjectToolCallsInner;

