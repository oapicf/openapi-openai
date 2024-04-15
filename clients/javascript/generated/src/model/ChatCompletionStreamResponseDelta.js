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
import ChatCompletionMessageToolCallChunk from './ChatCompletionMessageToolCallChunk';
import ChatCompletionStreamResponseDeltaFunctionCall from './ChatCompletionStreamResponseDeltaFunctionCall';

/**
 * The ChatCompletionStreamResponseDelta model module.
 * @module model/ChatCompletionStreamResponseDelta
 * @version 1.0.1-pre.0
 */
class ChatCompletionStreamResponseDelta {
    /**
     * Constructs a new <code>ChatCompletionStreamResponseDelta</code>.
     * A chat completion delta generated by streamed model responses.
     * @alias module:model/ChatCompletionStreamResponseDelta
     */
    constructor() { 
        
        ChatCompletionStreamResponseDelta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ChatCompletionStreamResponseDelta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionStreamResponseDelta} obj Optional instance to populate.
     * @return {module:model/ChatCompletionStreamResponseDelta} The populated <code>ChatCompletionStreamResponseDelta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionStreamResponseDelta();

            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'String');
            }
            if (data.hasOwnProperty('function_call')) {
                obj['function_call'] = ChatCompletionStreamResponseDeltaFunctionCall.constructFromObject(data['function_call']);
            }
            if (data.hasOwnProperty('tool_calls')) {
                obj['tool_calls'] = ApiClient.convertToType(data['tool_calls'], [ChatCompletionMessageToolCallChunk]);
            }
            if (data.hasOwnProperty('role')) {
                obj['role'] = ApiClient.convertToType(data['role'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionStreamResponseDelta</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionStreamResponseDelta</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['content'] && !(typeof data['content'] === 'string' || data['content'] instanceof String)) {
            throw new Error("Expected the field `content` to be a primitive type in the JSON string but got " + data['content']);
        }
        // validate the optional field `function_call`
        if (data['function_call']) { // data not null
          ChatCompletionStreamResponseDeltaFunctionCall.validateJSON(data['function_call']);
        }
        if (data['tool_calls']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['tool_calls'])) {
                throw new Error("Expected the field `tool_calls` to be an array in the JSON data but got " + data['tool_calls']);
            }
            // validate the optional field `tool_calls` (array)
            for (const item of data['tool_calls']) {
                ChatCompletionMessageToolCallChunk.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['role'] && !(typeof data['role'] === 'string' || data['role'] instanceof String)) {
            throw new Error("Expected the field `role` to be a primitive type in the JSON string but got " + data['role']);
        }

        return true;
    }


}



/**
 * The contents of the chunk message.
 * @member {String} content
 */
ChatCompletionStreamResponseDelta.prototype['content'] = undefined;

/**
 * @member {module:model/ChatCompletionStreamResponseDeltaFunctionCall} function_call
 */
ChatCompletionStreamResponseDelta.prototype['function_call'] = undefined;

/**
 * @member {Array.<module:model/ChatCompletionMessageToolCallChunk>} tool_calls
 */
ChatCompletionStreamResponseDelta.prototype['tool_calls'] = undefined;

/**
 * The role of the author of this message.
 * @member {module:model/ChatCompletionStreamResponseDelta.RoleEnum} role
 */
ChatCompletionStreamResponseDelta.prototype['role'] = undefined;





/**
 * Allowed values for the <code>role</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionStreamResponseDelta['RoleEnum'] = {

    /**
     * value: "system"
     * @const
     */
    "system": "system",

    /**
     * value: "user"
     * @const
     */
    "user": "user",

    /**
     * value: "assistant"
     * @const
     */
    "assistant": "assistant",

    /**
     * value: "tool"
     * @const
     */
    "tool": "tool"
};



export default ChatCompletionStreamResponseDelta;
