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
import ChatCompletionMessageToolCallFunction from './ChatCompletionMessageToolCallFunction';

/**
 * The ChatCompletionMessageToolCall model module.
 * @module model/ChatCompletionMessageToolCall
 * @version 1.0.1-pre.0
 */
class ChatCompletionMessageToolCall {
    /**
     * Constructs a new <code>ChatCompletionMessageToolCall</code>.
     * @alias module:model/ChatCompletionMessageToolCall
     * @param id {String} The ID of the tool call.
     * @param type {module:model/ChatCompletionMessageToolCall.TypeEnum} The type of the tool. Currently, only `function` is supported.
     * @param _function {module:model/ChatCompletionMessageToolCallFunction} 
     */
    constructor(id, type, _function) { 
        
        ChatCompletionMessageToolCall.initialize(this, id, type, _function);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, type, _function) { 
        obj['id'] = id;
        obj['type'] = type;
        obj['function'] = _function;
    }

    /**
     * Constructs a <code>ChatCompletionMessageToolCall</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionMessageToolCall} obj Optional instance to populate.
     * @return {module:model/ChatCompletionMessageToolCall} The populated <code>ChatCompletionMessageToolCall</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionMessageToolCall();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('function')) {
                obj['function'] = ChatCompletionMessageToolCallFunction.constructFromObject(data['function']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionMessageToolCall</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionMessageToolCall</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionMessageToolCall.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // validate the optional field `function`
        if (data['function']) { // data not null
          ChatCompletionMessageToolCallFunction.validateJSON(data['function']);
        }

        return true;
    }


}

ChatCompletionMessageToolCall.RequiredProperties = ["id", "type", "function"];

/**
 * The ID of the tool call.
 * @member {String} id
 */
ChatCompletionMessageToolCall.prototype['id'] = undefined;

/**
 * The type of the tool. Currently, only `function` is supported.
 * @member {module:model/ChatCompletionMessageToolCall.TypeEnum} type
 */
ChatCompletionMessageToolCall.prototype['type'] = undefined;

/**
 * @member {module:model/ChatCompletionMessageToolCallFunction} function
 */
ChatCompletionMessageToolCall.prototype['function'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionMessageToolCall['TypeEnum'] = {

    /**
     * value: "function"
     * @const
     */
    "function": "function"
};



export default ChatCompletionMessageToolCall;

