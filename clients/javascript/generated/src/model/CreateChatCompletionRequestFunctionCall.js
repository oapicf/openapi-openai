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
import ChatCompletionFunctionCallOption from './ChatCompletionFunctionCallOption';

/**
 * The CreateChatCompletionRequestFunctionCall model module.
 * @module model/CreateChatCompletionRequestFunctionCall
 * @version 1.1.1-pre.0
 */
class CreateChatCompletionRequestFunctionCall {
    /**
     * Constructs a new <code>CreateChatCompletionRequestFunctionCall</code>.
     * Deprecated in favor of &#x60;tool_choice&#x60;.  Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;name\&quot;: \&quot;my_function\&quot;}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
     * @alias module:model/CreateChatCompletionRequestFunctionCall
     * @param {(module:model/ChatCompletionFunctionCallOption|module:model/String)} instance The actual instance to initialize CreateChatCompletionRequestFunctionCall.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        // `none` means the model will not call a function and instead generates a message. `auto` means the model can pick between generating a message or calling a function. 
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
            if (typeof instance === "ChatCompletionFunctionCallOption") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                ChatCompletionFunctionCallOption.validateJSON(instance); // throw an exception if no match
                // create ChatCompletionFunctionCallOption from JS object
                this.actualInstance = ChatCompletionFunctionCallOption.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into ChatCompletionFunctionCallOption
            errorMessages.push("Failed to construct ChatCompletionFunctionCallOption: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `CreateChatCompletionRequestFunctionCall` with oneOf schemas ChatCompletionFunctionCallOption, String. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `CreateChatCompletionRequestFunctionCall` with oneOf schemas ChatCompletionFunctionCallOption, String. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>CreateChatCompletionRequestFunctionCall</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateChatCompletionRequestFunctionCall} obj Optional instance to populate.
     * @return {module:model/CreateChatCompletionRequestFunctionCall} The populated <code>CreateChatCompletionRequestFunctionCall</code> instance.
     */
    static constructFromObject(data, obj) {
        return new CreateChatCompletionRequestFunctionCall(data);
    }

    /**
     * Gets the actual instance, which can be <code>ChatCompletionFunctionCallOption</code>, <code>String</code>.
     * @return {(module:model/ChatCompletionFunctionCallOption|module:model/String)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>ChatCompletionFunctionCallOption</code>, <code>String</code>.
     * @param {(module:model/ChatCompletionFunctionCallOption|module:model/String)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = CreateChatCompletionRequestFunctionCall.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of CreateChatCompletionRequestFunctionCall from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/CreateChatCompletionRequestFunctionCall} An instance of CreateChatCompletionRequestFunctionCall.
     */
    static fromJSON = function(json_string){
        return CreateChatCompletionRequestFunctionCall.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * The name of the function to call.
 * @member {String} name
 */
CreateChatCompletionRequestFunctionCall.prototype['name'] = undefined;


CreateChatCompletionRequestFunctionCall.OneOf = ["ChatCompletionFunctionCallOption", "String"];

export default CreateChatCompletionRequestFunctionCall;

