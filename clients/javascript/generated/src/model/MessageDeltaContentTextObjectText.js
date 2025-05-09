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
import MessageDeltaContentTextObjectTextAnnotationsInner from './MessageDeltaContentTextObjectTextAnnotationsInner';

/**
 * The MessageDeltaContentTextObjectText model module.
 * @module model/MessageDeltaContentTextObjectText
 * @version 1.1.1-pre.0
 */
class MessageDeltaContentTextObjectText {
    /**
     * Constructs a new <code>MessageDeltaContentTextObjectText</code>.
     * @alias module:model/MessageDeltaContentTextObjectText
     */
    constructor() { 
        
        MessageDeltaContentTextObjectText.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MessageDeltaContentTextObjectText</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageDeltaContentTextObjectText} obj Optional instance to populate.
     * @return {module:model/MessageDeltaContentTextObjectText} The populated <code>MessageDeltaContentTextObjectText</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MessageDeltaContentTextObjectText();

            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('annotations')) {
                obj['annotations'] = ApiClient.convertToType(data['annotations'], [MessageDeltaContentTextObjectTextAnnotationsInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MessageDeltaContentTextObjectText</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MessageDeltaContentTextObjectText</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['value'] && !(typeof data['value'] === 'string' || data['value'] instanceof String)) {
            throw new Error("Expected the field `value` to be a primitive type in the JSON string but got " + data['value']);
        }
        if (data['annotations']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['annotations'])) {
                throw new Error("Expected the field `annotations` to be an array in the JSON data but got " + data['annotations']);
            }
            // validate the optional field `annotations` (array)
            for (const item of data['annotations']) {
                MessageDeltaContentTextObjectTextAnnotationsInner.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * The data that makes up the text.
 * @member {String} value
 */
MessageDeltaContentTextObjectText.prototype['value'] = undefined;

/**
 * @member {Array.<module:model/MessageDeltaContentTextObjectTextAnnotationsInner>} annotations
 */
MessageDeltaContentTextObjectText.prototype['annotations'] = undefined;






export default MessageDeltaContentTextObjectText;

