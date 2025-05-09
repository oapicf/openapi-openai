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
 * The RunCompletionUsage model module.
 * @module model/RunCompletionUsage
 * @version 1.1.1-pre.0
 */
class RunCompletionUsage {
    /**
     * Constructs a new <code>RunCompletionUsage</code>.
     * Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
     * @alias module:model/RunCompletionUsage
     * @param completionTokens {Number} Number of completion tokens used over the course of the run.
     * @param promptTokens {Number} Number of prompt tokens used over the course of the run.
     * @param totalTokens {Number} Total number of tokens used (prompt + completion).
     */
    constructor(completionTokens, promptTokens, totalTokens) { 
        
        RunCompletionUsage.initialize(this, completionTokens, promptTokens, totalTokens);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, completionTokens, promptTokens, totalTokens) { 
        obj['completion_tokens'] = completionTokens;
        obj['prompt_tokens'] = promptTokens;
        obj['total_tokens'] = totalTokens;
    }

    /**
     * Constructs a <code>RunCompletionUsage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunCompletionUsage} obj Optional instance to populate.
     * @return {module:model/RunCompletionUsage} The populated <code>RunCompletionUsage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunCompletionUsage();

            if (data.hasOwnProperty('completion_tokens')) {
                obj['completion_tokens'] = ApiClient.convertToType(data['completion_tokens'], 'Number');
            }
            if (data.hasOwnProperty('prompt_tokens')) {
                obj['prompt_tokens'] = ApiClient.convertToType(data['prompt_tokens'], 'Number');
            }
            if (data.hasOwnProperty('total_tokens')) {
                obj['total_tokens'] = ApiClient.convertToType(data['total_tokens'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunCompletionUsage</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunCompletionUsage</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunCompletionUsage.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }

        return true;
    }


}

RunCompletionUsage.RequiredProperties = ["completion_tokens", "prompt_tokens", "total_tokens"];

/**
 * Number of completion tokens used over the course of the run.
 * @member {Number} completion_tokens
 */
RunCompletionUsage.prototype['completion_tokens'] = undefined;

/**
 * Number of prompt tokens used over the course of the run.
 * @member {Number} prompt_tokens
 */
RunCompletionUsage.prototype['prompt_tokens'] = undefined;

/**
 * Total number of tokens used (prompt + completion).
 * @member {Number} total_tokens
 */
RunCompletionUsage.prototype['total_tokens'] = undefined;






export default RunCompletionUsage;

