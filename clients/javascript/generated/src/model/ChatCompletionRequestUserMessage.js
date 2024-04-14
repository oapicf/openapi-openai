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
import ChatCompletionRequestUserMessageContent from './ChatCompletionRequestUserMessageContent';

/**
 * The ChatCompletionRequestUserMessage model module.
 * @module model/ChatCompletionRequestUserMessage
 * @version 1.0.1-pre.0
 */
class ChatCompletionRequestUserMessage {
    /**
     * Constructs a new <code>ChatCompletionRequestUserMessage</code>.
     * @alias module:model/ChatCompletionRequestUserMessage
     * @param content {module:model/ChatCompletionRequestUserMessageContent} 
     * @param role {module:model/ChatCompletionRequestUserMessage.RoleEnum} The role of the messages author, in this case `user`.
     */
    constructor(content, role) { 
        
        ChatCompletionRequestUserMessage.initialize(this, content, role);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, content, role) { 
        obj['content'] = content;
        obj['role'] = role;
    }

    /**
     * Constructs a <code>ChatCompletionRequestUserMessage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestUserMessage} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestUserMessage} The populated <code>ChatCompletionRequestUserMessage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionRequestUserMessage();

            if (data.hasOwnProperty('content')) {
                obj['content'] = ChatCompletionRequestUserMessageContent.constructFromObject(data['content']);
            }
            if (data.hasOwnProperty('role')) {
                obj['role'] = ApiClient.convertToType(data['role'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionRequestUserMessage</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionRequestUserMessage</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionRequestUserMessage.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `content`
        if (data['content']) { // data not null
          ChatCompletionRequestUserMessageContent.validateJSON(data['content']);
        }
        // ensure the json data is a string
        if (data['role'] && !(typeof data['role'] === 'string' || data['role'] instanceof String)) {
            throw new Error("Expected the field `role` to be a primitive type in the JSON string but got " + data['role']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }

        return true;
    }


}

ChatCompletionRequestUserMessage.RequiredProperties = ["content", "role"];

/**
 * @member {module:model/ChatCompletionRequestUserMessageContent} content
 */
ChatCompletionRequestUserMessage.prototype['content'] = undefined;

/**
 * The role of the messages author, in this case `user`.
 * @member {module:model/ChatCompletionRequestUserMessage.RoleEnum} role
 */
ChatCompletionRequestUserMessage.prototype['role'] = undefined;

/**
 * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @member {String} name
 */
ChatCompletionRequestUserMessage.prototype['name'] = undefined;





/**
 * Allowed values for the <code>role</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionRequestUserMessage['RoleEnum'] = {

    /**
     * value: "user"
     * @const
     */
    "user": "user"
};



export default ChatCompletionRequestUserMessage;

