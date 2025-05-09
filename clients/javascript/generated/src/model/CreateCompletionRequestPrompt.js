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
 * The CreateCompletionRequestPrompt model module.
 * @module model/CreateCompletionRequestPrompt
 * @version 1.1.1-pre.0
 */
class CreateCompletionRequestPrompt {
    /**
     * Constructs a new <code>CreateCompletionRequestPrompt</code>.
     * The prompt(s) to generate completions for, encoded as a string, array of strings, array of tokens, or array of token arrays.  Note that &lt;|endoftext|&gt; is the document separator that the model sees during training, so if a prompt is not specified the model will generate as if from the beginning of a new document. 
     * @alias module:model/CreateCompletionRequestPrompt
     * @param {(module:model/String|module:model/[Number]|module:model/[String]|module:model/[[Number]])} instance The actual instance to initialize CreateCompletionRequestPrompt.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            // validate string
            if (!(typeof instance === 'string')) {
                throw new Error("Invalid value. Must be string. Input: " + JSON.stringify(instance));
            }
            this.actualInstance = instance;
            match++;
        } catch(err) {
            // json data failed to deserialize into String
            errorMessages.push("Failed to construct String: " + err)
        }

        try {
            // validate array data type
            if (!Array.isArray(instance)) {
                throw new Error("Invalid data type. Expecting array. Input: " + instance);
            }
            // validate array of string
            for (const item of instance) {
                if (!(typeof item === 'number' && item % 1 === 0)) {
                    throw new Error("Invalid array items. Must be string. Input: " + instance);
                }
            }
            this.actualInstance = instance;
            match++;
        } catch(err) {
            // json data failed to deserialize into [String]
            errorMessages.push("Failed to construct [String]: " + err)
        }

        try {
            // validate array data type
            if (!Array.isArray(instance)) {
                throw new Error("Invalid data type. Expecting array. Input: " + instance);
            }
            if (instance.length < 1) {
                throw new Error("Invalid array size. Minimim: 1. Input: " + instance);
            }
            // validate array of integer
            for (const item of instance) {
                if (!(typeof item === 'number' && item % 1 === 0)) {
                    throw new Error("Invalid array items. Must be integer. Input: " + instance);
                }
            }
            this.actualInstance = instance;
            match++;
        } catch(err) {
            // json data failed to deserialize into [Number]
            errorMessages.push("Failed to construct [Number]: " + err)
        }

        try {
            // validate array data type
            if (!Array.isArray(instance)) {
                throw new Error("Invalid data type. Expecting array. Input: " + instance);
            }
            if (instance.length < 1) {
                throw new Error("Invalid array size. Minimim: 1. Input: " + instance);
            }
            this.actualInstance = instance;
            match++;
        } catch(err) {
            // json data failed to deserialize into [[Number]]
            errorMessages.push("Failed to construct [[Number]]: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `CreateCompletionRequestPrompt` with oneOf schemas String, [Number], [String], [[Number]]. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `CreateCompletionRequestPrompt` with oneOf schemas String, [Number], [String], [[Number]]. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>CreateCompletionRequestPrompt</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCompletionRequestPrompt} obj Optional instance to populate.
     * @return {module:model/CreateCompletionRequestPrompt} The populated <code>CreateCompletionRequestPrompt</code> instance.
     */
    static constructFromObject(data, obj) {
        return new CreateCompletionRequestPrompt(data);
    }

    /**
     * Gets the actual instance, which can be <code>String</code>, <code>[Number]</code>, <code>[String]</code>, <code>[[Number]]</code>.
     * @return {(module:model/String|module:model/[Number]|module:model/[String]|module:model/[[Number]])} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>String</code>, <code>[Number]</code>, <code>[String]</code>, <code>[[Number]]</code>.
     * @param {(module:model/String|module:model/[Number]|module:model/[String]|module:model/[[Number]])} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = CreateCompletionRequestPrompt.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of CreateCompletionRequestPrompt from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/CreateCompletionRequestPrompt} An instance of CreateCompletionRequestPrompt.
     */
    static fromJSON = function(json_string){
        return CreateCompletionRequestPrompt.constructFromObject(JSON.parse(json_string));
    }
}


CreateCompletionRequestPrompt.OneOf = ["String", "[Number]", "[String]", "[[Number]]"];

export default CreateCompletionRequestPrompt;

