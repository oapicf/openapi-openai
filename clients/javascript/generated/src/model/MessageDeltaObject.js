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
import MessageDeltaObjectDelta from './MessageDeltaObjectDelta';

/**
 * The MessageDeltaObject model module.
 * @module model/MessageDeltaObject
 * @version 1.1.1-pre.0
 */
class MessageDeltaObject {
    /**
     * Constructs a new <code>MessageDeltaObject</code>.
     * Represents a message delta i.e. any changed fields on a message during streaming. 
     * @alias module:model/MessageDeltaObject
     * @param id {String} The identifier of the message, which can be referenced in API endpoints.
     * @param object {module:model/MessageDeltaObject.ObjectEnum} The object type, which is always `thread.message.delta`.
     * @param delta {module:model/MessageDeltaObjectDelta} 
     */
    constructor(id, object, delta) { 
        
        MessageDeltaObject.initialize(this, id, object, delta);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, object, delta) { 
        obj['id'] = id;
        obj['object'] = object;
        obj['delta'] = delta;
    }

    /**
     * Constructs a <code>MessageDeltaObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageDeltaObject} obj Optional instance to populate.
     * @return {module:model/MessageDeltaObject} The populated <code>MessageDeltaObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageDeltaObject();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('delta')) {
                obj['delta'] = MessageDeltaObjectDelta.constructFromObject(data['delta']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageDeltaObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageDeltaObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MessageDeltaObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
        }
        // validate the optional field `delta`
        if (data['delta']) { // data not null
          MessageDeltaObjectDelta.validateJSON(data['delta']);
        }

        return true;
    }


}

MessageDeltaObject.RequiredProperties = ["id", "object", "delta"];

/**
 * The identifier of the message, which can be referenced in API endpoints.
 * @member {String} id
 */
MessageDeltaObject.prototype['id'] = undefined;

/**
 * The object type, which is always `thread.message.delta`.
 * @member {module:model/MessageDeltaObject.ObjectEnum} object
 */
MessageDeltaObject.prototype['object'] = undefined;

/**
 * @member {module:model/MessageDeltaObjectDelta} delta
 */
MessageDeltaObject.prototype['delta'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
MessageDeltaObject['ObjectEnum'] = {

    /**
     * value: "thread.message.delta"
     * @const
     */
    "thread.message.delta": "thread.message.delta"
};



export default MessageDeltaObject;

