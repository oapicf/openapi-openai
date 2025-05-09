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
 * The CreateCompletionResponseChoicesInnerLogprobs model module.
 * @module model/CreateCompletionResponseChoicesInnerLogprobs
 * @version 1.1.1-pre.0
 */
class CreateCompletionResponseChoicesInnerLogprobs {
    /**
     * Constructs a new <code>CreateCompletionResponseChoicesInnerLogprobs</code>.
     * @alias module:model/CreateCompletionResponseChoicesInnerLogprobs
     */
    constructor() { 
        
        CreateCompletionResponseChoicesInnerLogprobs.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateCompletionResponseChoicesInnerLogprobs</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCompletionResponseChoicesInnerLogprobs} obj Optional instance to populate.
     * @return {module:model/CreateCompletionResponseChoicesInnerLogprobs} The populated <code>CreateCompletionResponseChoicesInnerLogprobs</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateCompletionResponseChoicesInnerLogprobs();

            if (data.hasOwnProperty('text_offset')) {
                obj['text_offset'] = ApiClient.convertToType(data['text_offset'], ['Number']);
            }
            if (data.hasOwnProperty('token_logprobs')) {
                obj['token_logprobs'] = ApiClient.convertToType(data['token_logprobs'], ['Number']);
            }
            if (data.hasOwnProperty('tokens')) {
                obj['tokens'] = ApiClient.convertToType(data['tokens'], ['String']);
            }
            if (data.hasOwnProperty('top_logprobs')) {
                obj['top_logprobs'] = ApiClient.convertToType(data['top_logprobs'], [{'String': 'Number'}]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateCompletionResponseChoicesInnerLogprobs</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateCompletionResponseChoicesInnerLogprobs</code>.
     */
    static validateJSON(data) {
        // ensure the json data is an array
        if (!Array.isArray(data['text_offset'])) {
            throw new Error("Expected the field `text_offset` to be an array in the JSON data but got " + data['text_offset']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['token_logprobs'])) {
            throw new Error("Expected the field `token_logprobs` to be an array in the JSON data but got " + data['token_logprobs']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['tokens'])) {
            throw new Error("Expected the field `tokens` to be an array in the JSON data but got " + data['tokens']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['top_logprobs'])) {
            throw new Error("Expected the field `top_logprobs` to be an array in the JSON data but got " + data['top_logprobs']);
        }

        return true;
    }


}



/**
 * @member {Array.<Number>} text_offset
 */
CreateCompletionResponseChoicesInnerLogprobs.prototype['text_offset'] = undefined;

/**
 * @member {Array.<Number>} token_logprobs
 */
CreateCompletionResponseChoicesInnerLogprobs.prototype['token_logprobs'] = undefined;

/**
 * @member {Array.<String>} tokens
 */
CreateCompletionResponseChoicesInnerLogprobs.prototype['tokens'] = undefined;

/**
 * @member {Array.<Object.<String, Number>>} top_logprobs
 */
CreateCompletionResponseChoicesInnerLogprobs.prototype['top_logprobs'] = undefined;






export default CreateCompletionResponseChoicesInnerLogprobs;

