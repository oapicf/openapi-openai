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
import MessageContentImageFileObjectImageFile from './MessageContentImageFileObjectImageFile';

/**
 * The MessageContentImageFileObject model module.
 * @module model/MessageContentImageFileObject
 * @version 1.1.1-pre.0
 */
class MessageContentImageFileObject {
    /**
     * Constructs a new <code>MessageContentImageFileObject</code>.
     * References an image [File](/docs/api-reference/files) in the content of a message.
     * @alias module:model/MessageContentImageFileObject
     * @param type {module:model/MessageContentImageFileObject.TypeEnum} Always `image_file`.
     * @param imageFile {module:model/MessageContentImageFileObjectImageFile} 
     */
    constructor(type, imageFile) { 
        
        MessageContentImageFileObject.initialize(this, type, imageFile);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, imageFile) { 
        obj['type'] = type;
        obj['image_file'] = imageFile;
    }

    /**
     * Constructs a <code>MessageContentImageFileObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageContentImageFileObject} obj Optional instance to populate.
     * @return {module:model/MessageContentImageFileObject} The populated <code>MessageContentImageFileObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageContentImageFileObject();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('image_file')) {
                obj['image_file'] = MessageContentImageFileObjectImageFile.constructFromObject(data['image_file']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageContentImageFileObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageContentImageFileObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MessageContentImageFileObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // validate the optional field `image_file`
        if (data['image_file']) { // data not null
          MessageContentImageFileObjectImageFile.validateJSON(data['image_file']);
        }

        return true;
    }


}

MessageContentImageFileObject.RequiredProperties = ["type", "image_file"];

/**
 * Always `image_file`.
 * @member {module:model/MessageContentImageFileObject.TypeEnum} type
 */
MessageContentImageFileObject.prototype['type'] = undefined;

/**
 * @member {module:model/MessageContentImageFileObjectImageFile} image_file
 */
MessageContentImageFileObject.prototype['image_file'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
MessageContentImageFileObject['TypeEnum'] = {

    /**
     * value: "image_file"
     * @const
     */
    "image_file": "image_file"
};



export default MessageContentImageFileObject;

