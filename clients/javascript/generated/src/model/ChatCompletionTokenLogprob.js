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
import ChatCompletionTokenLogprobTopLogprobsInner from './ChatCompletionTokenLogprobTopLogprobsInner';

/**
 * The ChatCompletionTokenLogprob model module.
 * @module model/ChatCompletionTokenLogprob
 * @version 1.1.1-pre.0
 */
class ChatCompletionTokenLogprob {
    /**
     * Constructs a new <code>ChatCompletionTokenLogprob</code>.
     * @alias module:model/ChatCompletionTokenLogprob
     * @param token {String} The token.
     * @param logprob {Number} The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
     * @param bytes {Array.<Number>} A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
     * @param topLogprobs {Array.<module:model/ChatCompletionTokenLogprobTopLogprobsInner>} List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
     */
    constructor(token, logprob, bytes, topLogprobs) { 
        
        ChatCompletionTokenLogprob.initialize(this, token, logprob, bytes, topLogprobs);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, token, logprob, bytes, topLogprobs) { 
        obj['token'] = token;
        obj['logprob'] = logprob;
        obj['bytes'] = bytes;
        obj['top_logprobs'] = topLogprobs;
    }

    /**
     * Constructs a <code>ChatCompletionTokenLogprob</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionTokenLogprob} obj Optional instance to populate.
     * @return {module:model/ChatCompletionTokenLogprob} The populated <code>ChatCompletionTokenLogprob</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionTokenLogprob();

            if (data.hasOwnProperty('token')) {
                obj['token'] = ApiClient.convertToType(data['token'], 'String');
            }
            if (data.hasOwnProperty('logprob')) {
                obj['logprob'] = ApiClient.convertToType(data['logprob'], 'Number');
            }
            if (data.hasOwnProperty('bytes')) {
                obj['bytes'] = ApiClient.convertToType(data['bytes'], ['Number']);
            }
            if (data.hasOwnProperty('top_logprobs')) {
                obj['top_logprobs'] = ApiClient.convertToType(data['top_logprobs'], [ChatCompletionTokenLogprobTopLogprobsInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionTokenLogprob</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionTokenLogprob</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionTokenLogprob.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['token'] && !(typeof data['token'] === 'string' || data['token'] instanceof String)) {
            throw new Error("Expected the field `token` to be a primitive type in the JSON string but got " + data['token']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['bytes'])) {
            throw new Error("Expected the field `bytes` to be an array in the JSON data but got " + data['bytes']);
        }
        if (data['top_logprobs']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['top_logprobs'])) {
                throw new Error("Expected the field `top_logprobs` to be an array in the JSON data but got " + data['top_logprobs']);
            }
            // validate the optional field `top_logprobs` (array)
            for (const item of data['top_logprobs']) {
                ChatCompletionTokenLogprobTopLogprobsInner.validateJSON(item);
            };
        }

        return true;
    }


}

ChatCompletionTokenLogprob.RequiredProperties = ["token", "logprob", "bytes", "top_logprobs"];

/**
 * The token.
 * @member {String} token
 */
ChatCompletionTokenLogprob.prototype['token'] = undefined;

/**
 * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
 * @member {Number} logprob
 */
ChatCompletionTokenLogprob.prototype['logprob'] = undefined;

/**
 * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
 * @member {Array.<Number>} bytes
 */
ChatCompletionTokenLogprob.prototype['bytes'] = undefined;

/**
 * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
 * @member {Array.<module:model/ChatCompletionTokenLogprobTopLogprobsInner>} top_logprobs
 */
ChatCompletionTokenLogprob.prototype['top_logprobs'] = undefined;






export default ChatCompletionTokenLogprob;

