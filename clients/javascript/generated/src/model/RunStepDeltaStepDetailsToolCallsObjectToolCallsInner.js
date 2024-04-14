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
import RunStepDeltaStepDetailsToolCallsCodeObject from './RunStepDeltaStepDetailsToolCallsCodeObject';
import RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter from './RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter';
import RunStepDeltaStepDetailsToolCallsFunctionObject from './RunStepDeltaStepDetailsToolCallsFunctionObject';
import RunStepDeltaStepDetailsToolCallsFunctionObjectFunction from './RunStepDeltaStepDetailsToolCallsFunctionObjectFunction';
import RunStepDeltaStepDetailsToolCallsRetrievalObject from './RunStepDeltaStepDetailsToolCallsRetrievalObject';

/**
 * The RunStepDeltaStepDetailsToolCallsObjectToolCallsInner model module.
 * @module model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
 * @version 1.0.1-pre.0
 */
class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner {
    /**
     * Constructs a new <code>RunStepDeltaStepDetailsToolCallsObjectToolCallsInner</code>.
     * @alias module:model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner
     * @param {(module:model/RunStepDeltaStepDetailsToolCallsCodeObject|module:model/RunStepDeltaStepDetailsToolCallsFunctionObject|module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject)} instance The actual instance to initialize RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "RunStepDeltaStepDetailsToolCallsCodeObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepDeltaStepDetailsToolCallsCodeObject.validateJSON(instance); // throw an exception if no match
                // create RunStepDeltaStepDetailsToolCallsCodeObject from JS object
                this.actualInstance = RunStepDeltaStepDetailsToolCallsCodeObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepDeltaStepDetailsToolCallsCodeObject
            errorMessages.push("Failed to construct RunStepDeltaStepDetailsToolCallsCodeObject: " + err)
        }

        try {
            if (typeof instance === "RunStepDeltaStepDetailsToolCallsRetrievalObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepDeltaStepDetailsToolCallsRetrievalObject.validateJSON(instance); // throw an exception if no match
                // create RunStepDeltaStepDetailsToolCallsRetrievalObject from JS object
                this.actualInstance = RunStepDeltaStepDetailsToolCallsRetrievalObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepDeltaStepDetailsToolCallsRetrievalObject
            errorMessages.push("Failed to construct RunStepDeltaStepDetailsToolCallsRetrievalObject: " + err)
        }

        try {
            if (typeof instance === "RunStepDeltaStepDetailsToolCallsFunctionObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                RunStepDeltaStepDetailsToolCallsFunctionObject.validateJSON(instance); // throw an exception if no match
                // create RunStepDeltaStepDetailsToolCallsFunctionObject from JS object
                this.actualInstance = RunStepDeltaStepDetailsToolCallsFunctionObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into RunStepDeltaStepDetailsToolCallsFunctionObject
            errorMessages.push("Failed to construct RunStepDeltaStepDetailsToolCallsFunctionObject: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `RunStepDeltaStepDetailsToolCallsObjectToolCallsInner` with oneOf schemas RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `RunStepDeltaStepDetailsToolCallsObjectToolCallsInner` with oneOf schemas RunStepDeltaStepDetailsToolCallsCodeObject, RunStepDeltaStepDetailsToolCallsFunctionObject, RunStepDeltaStepDetailsToolCallsRetrievalObject. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>RunStepDeltaStepDetailsToolCallsObjectToolCallsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner} obj Optional instance to populate.
     * @return {module:model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner} The populated <code>RunStepDeltaStepDetailsToolCallsObjectToolCallsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        return new RunStepDeltaStepDetailsToolCallsObjectToolCallsInner(data);
    }

    /**
     * Gets the actual instance, which can be <code>RunStepDeltaStepDetailsToolCallsCodeObject</code>, <code>RunStepDeltaStepDetailsToolCallsFunctionObject</code>, <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code>.
     * @return {(module:model/RunStepDeltaStepDetailsToolCallsCodeObject|module:model/RunStepDeltaStepDetailsToolCallsFunctionObject|module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>RunStepDeltaStepDetailsToolCallsCodeObject</code>, <code>RunStepDeltaStepDetailsToolCallsFunctionObject</code>, <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code>.
     * @param {(module:model/RunStepDeltaStepDetailsToolCallsCodeObject|module:model/RunStepDeltaStepDetailsToolCallsFunctionObject|module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner} An instance of RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.
     */
    static fromJSON = function(json_string){
        return RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * The index of the tool call in the tool calls array.
 * @member {Number} index
 */
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype['index'] = undefined;

/**
 * The ID of the tool call object.
 * @member {String} id
 */
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype['id'] = undefined;

/**
 * The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
 * @member {module:model/RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.TypeEnum} type
 */
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype['type'] = undefined;

/**
 * @member {module:model/RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter} code_interpreter
 */
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype['code_interpreter'] = undefined;

/**
 * For now, this is always going to be an empty object.
 * @member {Object} retrieval
 */
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype['retrieval'] = undefined;

/**
 * @member {module:model/RunStepDeltaStepDetailsToolCallsFunctionObjectFunction} function
 */
RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.prototype['function'] = undefined;


RunStepDeltaStepDetailsToolCallsObjectToolCallsInner.OneOf = ["RunStepDeltaStepDetailsToolCallsCodeObject", "RunStepDeltaStepDetailsToolCallsFunctionObject", "RunStepDeltaStepDetailsToolCallsRetrievalObject"];

export default RunStepDeltaStepDetailsToolCallsObjectToolCallsInner;

