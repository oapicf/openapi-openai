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
 * The ChatCompletionRequestMessageContentPartText model module.
 * @module model/ChatCompletionRequestMessageContentPartText
 * @version 1.0.1-pre.0
 */
class ChatCompletionRequestMessageContentPartText {
    /**
     * Constructs a new <code>ChatCompletionRequestMessageContentPartText</code>.
     * @alias module:model/ChatCompletionRequestMessageContentPartText
     * @param type {module:model/ChatCompletionRequestMessageContentPartText.TypeEnum} The type of the content part.
     * @param text {String} The text content.
     */
    constructor(type, text) { 
        
        ChatCompletionRequestMessageContentPartText.initialize(this, type, text);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, text) { 
        obj['type'] = type;
        obj['text'] = text;
    }

    /**
     * Constructs a <code>ChatCompletionRequestMessageContentPartText</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestMessageContentPartText} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestMessageContentPartText} The populated <code>ChatCompletionRequestMessageContentPartText</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionRequestMessageContentPartText();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionRequestMessageContentPartText</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionRequestMessageContentPartText</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionRequestMessageContentPartText.RequiredProperties) {
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

        return true;
    }


}

ChatCompletionRequestMessageContentPartText.RequiredProperties = ["type", "text"];

/**
 * The type of the content part.
 * @member {module:model/ChatCompletionRequestMessageContentPartText.TypeEnum} type
 */
ChatCompletionRequestMessageContentPartText.prototype['type'] = undefined;

/**
 * The text content.
 * @member {String} text
 */
ChatCompletionRequestMessageContentPartText.prototype['text'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionRequestMessageContentPartText['TypeEnum'] = {

    /**
     * value: "text"
     * @const
     */
    "text": "text"
};



export default ChatCompletionRequestMessageContentPartText;
