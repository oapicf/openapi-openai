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
import AssistantToolsCode from './AssistantToolsCode';
import AssistantToolsFunction from './AssistantToolsFunction';
import AssistantToolsRetrieval from './AssistantToolsRetrieval';
import FunctionObject from './FunctionObject';

/**
 * The CreateThreadAndRunRequestToolsInner model module.
 * @module model/CreateThreadAndRunRequestToolsInner
 * @version 1.0.1-pre.0
 */
class CreateThreadAndRunRequestToolsInner {
    /**
     * Constructs a new <code>CreateThreadAndRunRequestToolsInner</code>.
     * @alias module:model/CreateThreadAndRunRequestToolsInner
     * @param {(module:model/AssistantToolsCode|module:model/AssistantToolsFunction|module:model/AssistantToolsRetrieval)} instance The actual instance to initialize CreateThreadAndRunRequestToolsInner.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "AssistantToolsCode") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                AssistantToolsCode.validateJSON(instance); // throw an exception if no match
                // create AssistantToolsCode from JS object
                this.actualInstance = AssistantToolsCode.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into AssistantToolsCode
            errorMessages.push("Failed to construct AssistantToolsCode: " + err)
        }

        try {
            if (typeof instance === "AssistantToolsRetrieval") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                AssistantToolsRetrieval.validateJSON(instance); // throw an exception if no match
                // create AssistantToolsRetrieval from JS object
                this.actualInstance = AssistantToolsRetrieval.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into AssistantToolsRetrieval
            errorMessages.push("Failed to construct AssistantToolsRetrieval: " + err)
        }

        try {
            if (typeof instance === "AssistantToolsFunction") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                AssistantToolsFunction.validateJSON(instance); // throw an exception if no match
                // create AssistantToolsFunction from JS object
                this.actualInstance = AssistantToolsFunction.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into AssistantToolsFunction
            errorMessages.push("Failed to construct AssistantToolsFunction: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `CreateThreadAndRunRequestToolsInner` with oneOf schemas AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `CreateThreadAndRunRequestToolsInner` with oneOf schemas AssistantToolsCode, AssistantToolsFunction, AssistantToolsRetrieval. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>CreateThreadAndRunRequestToolsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateThreadAndRunRequestToolsInner} obj Optional instance to populate.
     * @return {module:model/CreateThreadAndRunRequestToolsInner} The populated <code>CreateThreadAndRunRequestToolsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        return new CreateThreadAndRunRequestToolsInner(data);
    }

    /**
     * Gets the actual instance, which can be <code>AssistantToolsCode</code>, <code>AssistantToolsFunction</code>, <code>AssistantToolsRetrieval</code>.
     * @return {(module:model/AssistantToolsCode|module:model/AssistantToolsFunction|module:model/AssistantToolsRetrieval)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>AssistantToolsCode</code>, <code>AssistantToolsFunction</code>, <code>AssistantToolsRetrieval</code>.
     * @param {(module:model/AssistantToolsCode|module:model/AssistantToolsFunction|module:model/AssistantToolsRetrieval)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = CreateThreadAndRunRequestToolsInner.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of CreateThreadAndRunRequestToolsInner from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/CreateThreadAndRunRequestToolsInner} An instance of CreateThreadAndRunRequestToolsInner.
     */
    static fromJSON = function(json_string){
        return CreateThreadAndRunRequestToolsInner.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * The type of tool being defined: `code_interpreter`
 * @member {module:model/CreateThreadAndRunRequestToolsInner.TypeEnum} type
 */
CreateThreadAndRunRequestToolsInner.prototype['type'] = undefined;

/**
 * @member {module:model/FunctionObject} function
 */
CreateThreadAndRunRequestToolsInner.prototype['function'] = undefined;


CreateThreadAndRunRequestToolsInner.OneOf = ["AssistantToolsCode", "AssistantToolsFunction", "AssistantToolsRetrieval"];

export default CreateThreadAndRunRequestToolsInner;
