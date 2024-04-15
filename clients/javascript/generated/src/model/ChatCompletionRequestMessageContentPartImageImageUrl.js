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
 * The ChatCompletionRequestMessageContentPartImageImageUrl model module.
 * @module model/ChatCompletionRequestMessageContentPartImageImageUrl
 * @version 1.0.1-pre.0
 */
class ChatCompletionRequestMessageContentPartImageImageUrl {
    /**
     * Constructs a new <code>ChatCompletionRequestMessageContentPartImageImageUrl</code>.
     * @alias module:model/ChatCompletionRequestMessageContentPartImageImageUrl
     * @param url {String} Either a URL of the image or the base64 encoded image data.
     */
    constructor(url) { 
        
        ChatCompletionRequestMessageContentPartImageImageUrl.initialize(this, url);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, url) { 
        obj['url'] = url;
    }

    /**
     * Constructs a <code>ChatCompletionRequestMessageContentPartImageImageUrl</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestMessageContentPartImageImageUrl} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestMessageContentPartImageImageUrl} The populated <code>ChatCompletionRequestMessageContentPartImageImageUrl</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionRequestMessageContentPartImageImageUrl();

            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('detail')) {
                obj['detail'] = ApiClient.convertToType(data['detail'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionRequestMessageContentPartImageImageUrl</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionRequestMessageContentPartImageImageUrl</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionRequestMessageContentPartImageImageUrl.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['url'] && !(typeof data['url'] === 'string' || data['url'] instanceof String)) {
            throw new Error("Expected the field `url` to be a primitive type in the JSON string but got " + data['url']);
        }
        // ensure the json data is a string
        if (data['detail'] && !(typeof data['detail'] === 'string' || data['detail'] instanceof String)) {
            throw new Error("Expected the field `detail` to be a primitive type in the JSON string but got " + data['detail']);
        }

        return true;
    }


}

ChatCompletionRequestMessageContentPartImageImageUrl.RequiredProperties = ["url"];

/**
 * Either a URL of the image or the base64 encoded image data.
 * @member {String} url
 */
ChatCompletionRequestMessageContentPartImageImageUrl.prototype['url'] = undefined;

/**
 * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision/low-or-high-fidelity-image-understanding).
 * @member {module:model/ChatCompletionRequestMessageContentPartImageImageUrl.DetailEnum} detail
 * @default 'auto'
 */
ChatCompletionRequestMessageContentPartImageImageUrl.prototype['detail'] = 'auto';





/**
 * Allowed values for the <code>detail</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionRequestMessageContentPartImageImageUrl['DetailEnum'] = {

    /**
     * value: "auto"
     * @const
     */
    "auto": "auto",

    /**
     * value: "low"
     * @const
     */
    "low": "low",

    /**
     * value: "high"
     * @const
     */
    "high": "high"
};



export default ChatCompletionRequestMessageContentPartImageImageUrl;
