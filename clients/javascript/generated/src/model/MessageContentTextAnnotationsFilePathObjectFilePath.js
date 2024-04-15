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
 * The MessageContentTextAnnotationsFilePathObjectFilePath model module.
 * @module model/MessageContentTextAnnotationsFilePathObjectFilePath
 * @version 1.0.1-pre.0
 */
class MessageContentTextAnnotationsFilePathObjectFilePath {
    /**
     * Constructs a new <code>MessageContentTextAnnotationsFilePathObjectFilePath</code>.
     * @alias module:model/MessageContentTextAnnotationsFilePathObjectFilePath
     * @param fileId {String} The ID of the file that was generated.
     */
    constructor(fileId) { 
        
        MessageContentTextAnnotationsFilePathObjectFilePath.initialize(this, fileId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, fileId) { 
        obj['file_id'] = fileId;
    }

    /**
     * Constructs a <code>MessageContentTextAnnotationsFilePathObjectFilePath</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageContentTextAnnotationsFilePathObjectFilePath} obj Optional instance to populate.
     * @return {module:model/MessageContentTextAnnotationsFilePathObjectFilePath} The populated <code>MessageContentTextAnnotationsFilePathObjectFilePath</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageContentTextAnnotationsFilePathObjectFilePath();

            if (data.hasOwnProperty('file_id')) {
                obj['file_id'] = ApiClient.convertToType(data['file_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageContentTextAnnotationsFilePathObjectFilePath</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageContentTextAnnotationsFilePathObjectFilePath</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MessageContentTextAnnotationsFilePathObjectFilePath.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['file_id'] && !(typeof data['file_id'] === 'string' || data['file_id'] instanceof String)) {
            throw new Error("Expected the field `file_id` to be a primitive type in the JSON string but got " + data['file_id']);
        }

        return true;
    }


}

MessageContentTextAnnotationsFilePathObjectFilePath.RequiredProperties = ["file_id"];

/**
 * The ID of the file that was generated.
 * @member {String} file_id
 */
MessageContentTextAnnotationsFilePathObjectFilePath.prototype['file_id'] = undefined;






export default MessageContentTextAnnotationsFilePathObjectFilePath;
