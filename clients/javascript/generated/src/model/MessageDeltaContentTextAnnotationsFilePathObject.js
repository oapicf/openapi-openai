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
import MessageDeltaContentTextAnnotationsFilePathObjectFilePath from './MessageDeltaContentTextAnnotationsFilePathObjectFilePath';

/**
 * The MessageDeltaContentTextAnnotationsFilePathObject model module.
 * @module model/MessageDeltaContentTextAnnotationsFilePathObject
 * @version 1.1.1-pre.0
 */
class MessageDeltaContentTextAnnotationsFilePathObject {
    /**
     * Constructs a new <code>MessageDeltaContentTextAnnotationsFilePathObject</code>.
     * A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
     * @alias module:model/MessageDeltaContentTextAnnotationsFilePathObject
     * @param index {Number} The index of the annotation in the text content part.
     * @param type {module:model/MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum} Always `file_path`.
     */
    constructor(index, type) { 
        
        MessageDeltaContentTextAnnotationsFilePathObject.initialize(this, index, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, index, type) { 
        obj['index'] = index;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>MessageDeltaContentTextAnnotationsFilePathObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageDeltaContentTextAnnotationsFilePathObject} obj Optional instance to populate.
     * @return {module:model/MessageDeltaContentTextAnnotationsFilePathObject} The populated <code>MessageDeltaContentTextAnnotationsFilePathObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageDeltaContentTextAnnotationsFilePathObject();

            if (data.hasOwnProperty('index')) {
                obj['index'] = ApiClient.convertToType(data['index'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
            if (data.hasOwnProperty('file_path')) {
                obj['file_path'] = MessageDeltaContentTextAnnotationsFilePathObjectFilePath.constructFromObject(data['file_path']);
            }
            if (data.hasOwnProperty('start_index')) {
                obj['start_index'] = ApiClient.convertToType(data['start_index'], 'Number');
            }
            if (data.hasOwnProperty('end_index')) {
                obj['end_index'] = ApiClient.convertToType(data['end_index'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageDeltaContentTextAnnotationsFilePathObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageDeltaContentTextAnnotationsFilePathObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MessageDeltaContentTextAnnotationsFilePathObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // ensure the json data is a string
        if (data['text'] && !(typeof data['text'] === 'string' || data['text'] instanceof String)) {
            throw new Error("Expected the field `text` to be a primitive type in the JSON string but got " + data['text']);
        }
        // validate the optional field `file_path`
        if (data['file_path']) { // data not null
          MessageDeltaContentTextAnnotationsFilePathObjectFilePath.validateJSON(data['file_path']);
        }

        return true;
    }


}

MessageDeltaContentTextAnnotationsFilePathObject.RequiredProperties = ["index", "type"];

/**
 * The index of the annotation in the text content part.
 * @member {Number} index
 */
MessageDeltaContentTextAnnotationsFilePathObject.prototype['index'] = undefined;

/**
 * Always `file_path`.
 * @member {module:model/MessageDeltaContentTextAnnotationsFilePathObject.TypeEnum} type
 */
MessageDeltaContentTextAnnotationsFilePathObject.prototype['type'] = undefined;

/**
 * The text in the message content that needs to be replaced.
 * @member {String} text
 */
MessageDeltaContentTextAnnotationsFilePathObject.prototype['text'] = undefined;

/**
 * @member {module:model/MessageDeltaContentTextAnnotationsFilePathObjectFilePath} file_path
 */
MessageDeltaContentTextAnnotationsFilePathObject.prototype['file_path'] = undefined;

/**
 * @member {Number} start_index
 */
MessageDeltaContentTextAnnotationsFilePathObject.prototype['start_index'] = undefined;

/**
 * @member {Number} end_index
 */
MessageDeltaContentTextAnnotationsFilePathObject.prototype['end_index'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
MessageDeltaContentTextAnnotationsFilePathObject['TypeEnum'] = {

    /**
     * value: "file_path"
     * @const
     */
    "file_path": "file_path"
};



export default MessageDeltaContentTextAnnotationsFilePathObject;

