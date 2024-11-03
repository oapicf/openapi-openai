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
 * The TruncationObject model module.
 * @module model/TruncationObject
 * @version 1.1.1-pre.0
 */
class TruncationObject {
    /**
     * Constructs a new <code>TruncationObject</code>.
     * @alias module:model/TruncationObject
     */
    constructor() { 
        
        TruncationObject.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TruncationObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TruncationObject} obj Optional instance to populate.
     * @return {module:model/TruncationObject} The populated <code>TruncationObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TruncationObject();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('last_messages')) {
                obj['last_messages'] = ApiClient.convertToType(data['last_messages'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TruncationObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TruncationObject</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}



/**
 * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
 * @member {module:model/TruncationObject.TypeEnum} type
 */
TruncationObject.prototype['type'] = undefined;

/**
 * The number of most recent messages from the thread when constructing the context for the run.
 * @member {Number} last_messages
 */
TruncationObject.prototype['last_messages'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
TruncationObject['TypeEnum'] = {

    /**
     * value: "auto"
     * @const
     */
    "auto": "auto",

    /**
     * value: "last_messages"
     * @const
     */
    "last_messages": "last_messages"
};



export default TruncationObject;

