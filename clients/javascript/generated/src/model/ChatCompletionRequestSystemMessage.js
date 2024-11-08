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
 * The ChatCompletionRequestSystemMessage model module.
 * @module model/ChatCompletionRequestSystemMessage
 * @version 1.1.1-pre.0
 */
class ChatCompletionRequestSystemMessage {
    /**
     * Constructs a new <code>ChatCompletionRequestSystemMessage</code>.
     * @alias module:model/ChatCompletionRequestSystemMessage
     * @param content {String} The contents of the system message.
     * @param role {module:model/ChatCompletionRequestSystemMessage.RoleEnum} The role of the messages author, in this case `system`.
     */
    constructor(content, role) { 
        
        ChatCompletionRequestSystemMessage.initialize(this, content, role);
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
     * Constructs a <code>ChatCompletionRequestSystemMessage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestSystemMessage} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestSystemMessage} The populated <code>ChatCompletionRequestSystemMessage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionRequestSystemMessage();

            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], 'String');
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
     * Validates the JSON data with respect to <code>ChatCompletionRequestSystemMessage</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionRequestSystemMessage</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionRequestSystemMessage.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['content'] && !(typeof data['content'] === 'string' || data['content'] instanceof String)) {
            throw new Error("Expected the field `content` to be a primitive type in the JSON string but got " + data['content']);
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

ChatCompletionRequestSystemMessage.RequiredProperties = ["content", "role"];

/**
 * The contents of the system message.
 * @member {String} content
 */
ChatCompletionRequestSystemMessage.prototype['content'] = undefined;

/**
 * The role of the messages author, in this case `system`.
 * @member {module:model/ChatCompletionRequestSystemMessage.RoleEnum} role
 */
ChatCompletionRequestSystemMessage.prototype['role'] = undefined;

/**
 * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
 * @member {String} name
 */
ChatCompletionRequestSystemMessage.prototype['name'] = undefined;





/**
 * Allowed values for the <code>role</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionRequestSystemMessage['RoleEnum'] = {

    /**
     * value: "system"
     * @const
     */
    "system": "system"
};



export default ChatCompletionRequestSystemMessage;

