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
 * The ChatCompletionRequestAssistantMessageFunctionCall model module.
 * @module model/ChatCompletionRequestAssistantMessageFunctionCall
 * @version 1.1.1-pre.0
 */
class ChatCompletionRequestAssistantMessageFunctionCall {
    /**
     * Constructs a new <code>ChatCompletionRequestAssistantMessageFunctionCall</code>.
     * Deprecated and replaced by &#x60;tool_calls&#x60;. The name and arguments of a function that should be called, as generated by the model.
     * @alias module:model/ChatCompletionRequestAssistantMessageFunctionCall
     * @param _arguments {String} The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
     * @param name {String} The name of the function to call.
     */
    constructor(_arguments, name) { 
        
        ChatCompletionRequestAssistantMessageFunctionCall.initialize(this, _arguments, name);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, _arguments, name) { 
        obj['arguments'] = _arguments;
        obj['name'] = name;
    }

    /**
     * Constructs a <code>ChatCompletionRequestAssistantMessageFunctionCall</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestAssistantMessageFunctionCall} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestAssistantMessageFunctionCall} The populated <code>ChatCompletionRequestAssistantMessageFunctionCall</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionRequestAssistantMessageFunctionCall();

            if (data.hasOwnProperty('arguments')) {
                obj['arguments'] = ApiClient.convertToType(data['arguments'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionRequestAssistantMessageFunctionCall</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionRequestAssistantMessageFunctionCall</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionRequestAssistantMessageFunctionCall.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['arguments'] && !(typeof data['arguments'] === 'string' || data['arguments'] instanceof String)) {
            throw new Error("Expected the field `arguments` to be a primitive type in the JSON string but got " + data['arguments']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}

ChatCompletionRequestAssistantMessageFunctionCall.RequiredProperties = ["arguments", "name"];

/**
 * The arguments to call the function with, as generated by the model in JSON format. Note that the model does not always generate valid JSON, and may hallucinate parameters not defined by your function schema. Validate the arguments in your code before calling your function.
 * @member {String} arguments
 */
ChatCompletionRequestAssistantMessageFunctionCall.prototype['arguments'] = undefined;

/**
 * The name of the function to call.
 * @member {String} name
 */
ChatCompletionRequestAssistantMessageFunctionCall.prototype['name'] = undefined;






export default ChatCompletionRequestAssistantMessageFunctionCall;

