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
 * The MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation model module.
 * @module model/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
 * @version 1.1.1-pre.0
 */
class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
    /**
     * Constructs a new <code>MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation</code>.
     * @alias module:model/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
     */
    constructor() { 
        
        MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation} obj Optional instance to populate.
     * @return {module:model/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation} The populated <code>MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation();

            if (data.hasOwnProperty('file_id')) {
                obj['file_id'] = ApiClient.convertToType(data['file_id'], 'String');
            }
            if (data.hasOwnProperty('quote')) {
                obj['quote'] = ApiClient.convertToType(data['quote'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['file_id'] && !(typeof data['file_id'] === 'string' || data['file_id'] instanceof String)) {
            throw new Error("Expected the field `file_id` to be a primitive type in the JSON string but got " + data['file_id']);
        }
        // ensure the json data is a string
        if (data['quote'] && !(typeof data['quote'] === 'string' || data['quote'] instanceof String)) {
            throw new Error("Expected the field `quote` to be a primitive type in the JSON string but got " + data['quote']);
        }

        return true;
    }


}



/**
 * The ID of the specific File the citation is from.
 * @member {String} file_id
 */
MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.prototype['file_id'] = undefined;

/**
 * The specific quote in the file.
 * @member {String} quote
 */
MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation.prototype['quote'] = undefined;






export default MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation;

