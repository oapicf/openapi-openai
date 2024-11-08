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
import MessageDeltaObjectDeltaContentInner from './MessageDeltaObjectDeltaContentInner';

/**
 * The MessageDeltaObjectDelta model module.
 * @module model/MessageDeltaObjectDelta
 * @version 1.1.1-pre.0
 */
class MessageDeltaObjectDelta {
    /**
     * Constructs a new <code>MessageDeltaObjectDelta</code>.
     * The delta containing the fields that have changed on the Message.
     * @alias module:model/MessageDeltaObjectDelta
     */
    constructor() { 
        
        MessageDeltaObjectDelta.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MessageDeltaObjectDelta</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageDeltaObjectDelta} obj Optional instance to populate.
     * @return {module:model/MessageDeltaObjectDelta} The populated <code>MessageDeltaObjectDelta</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageDeltaObjectDelta();

            if (data.hasOwnProperty('role')) {
                obj['role'] = ApiClient.convertToType(data['role'], 'String');
            }
            if (data.hasOwnProperty('content')) {
                obj['content'] = ApiClient.convertToType(data['content'], [MessageDeltaObjectDeltaContentInner]);
            }
            if (data.hasOwnProperty('file_ids')) {
                obj['file_ids'] = ApiClient.convertToType(data['file_ids'], ['String']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageDeltaObjectDelta</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageDeltaObjectDelta</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['role'] && !(typeof data['role'] === 'string' || data['role'] instanceof String)) {
            throw new Error("Expected the field `role` to be a primitive type in the JSON string but got " + data['role']);
        }
        if (data['content']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['content'])) {
                throw new Error("Expected the field `content` to be an array in the JSON data but got " + data['content']);
            }
            // validate the optional field `content` (array)
            for (const item of data['content']) {
                MessageDeltaObjectDeltaContentInner.validateJSON(item);
            };
        }
        // ensure the json data is an array
        if (!Array.isArray(data['file_ids'])) {
            throw new Error("Expected the field `file_ids` to be an array in the JSON data but got " + data['file_ids']);
        }

        return true;
    }


}



/**
 * The entity that produced the message. One of `user` or `assistant`.
 * @member {module:model/MessageDeltaObjectDelta.RoleEnum} role
 */
MessageDeltaObjectDelta.prototype['role'] = undefined;

/**
 * The content of the message in array of text and/or images.
 * @member {Array.<module:model/MessageDeltaObjectDeltaContentInner>} content
 */
MessageDeltaObjectDelta.prototype['content'] = undefined;

/**
 * A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
 * @member {Array.<String>} file_ids
 */
MessageDeltaObjectDelta.prototype['file_ids'] = undefined;





/**
 * Allowed values for the <code>role</code> property.
 * @enum {String}
 * @readonly
 */
MessageDeltaObjectDelta['RoleEnum'] = {

    /**
     * value: "user"
     * @const
     */
    "user": "user",

    /**
     * value: "assistant"
     * @const
     */
    "assistant": "assistant"
};



export default MessageDeltaObjectDelta;

