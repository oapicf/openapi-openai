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
* Enum class ChatCompletionRole.
* @enum {}
* @readonly
*/
export default class ChatCompletionRole {
    
        /**
         * value: "system"
         * @const
         */
        "system" = "system";

    
        /**
         * value: "user"
         * @const
         */
        "user" = "user";

    
        /**
         * value: "assistant"
         * @const
         */
        "assistant" = "assistant";

    
        /**
         * value: "tool"
         * @const
         */
        "tool" = "tool";

    
        /**
         * value: "function"
         * @const
         */
        "function" = "function";

    

    /**
    * Returns a <code>ChatCompletionRole</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/ChatCompletionRole} The enum <code>ChatCompletionRole</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
