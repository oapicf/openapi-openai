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
import ChatCompletionRequestMessageContentPartImageImageUrl from './ChatCompletionRequestMessageContentPartImageImageUrl';

/**
 * The ChatCompletionRequestMessageContentPartImage model module.
 * @module model/ChatCompletionRequestMessageContentPartImage
 * @version 1.1.1-pre.0
 */
class ChatCompletionRequestMessageContentPartImage {
    /**
     * Constructs a new <code>ChatCompletionRequestMessageContentPartImage</code>.
     * @alias module:model/ChatCompletionRequestMessageContentPartImage
     * @param type {module:model/ChatCompletionRequestMessageContentPartImage.TypeEnum} The type of the content part.
     * @param imageUrl {module:model/ChatCompletionRequestMessageContentPartImageImageUrl} 
     */
    constructor(type, imageUrl) { 
        
        ChatCompletionRequestMessageContentPartImage.initialize(this, type, imageUrl);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, imageUrl) { 
        obj['type'] = type;
        obj['image_url'] = imageUrl;
    }

    /**
     * Constructs a <code>ChatCompletionRequestMessageContentPartImage</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestMessageContentPartImage} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestMessageContentPartImage} The populated <code>ChatCompletionRequestMessageContentPartImage</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ChatCompletionRequestMessageContentPartImage();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('image_url')) {
                obj['image_url'] = ChatCompletionRequestMessageContentPartImageImageUrl.constructFromObject(data['image_url']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ChatCompletionRequestMessageContentPartImage</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ChatCompletionRequestMessageContentPartImage</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ChatCompletionRequestMessageContentPartImage.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // validate the optional field `image_url`
        if (data['image_url']) { // data not null
          ChatCompletionRequestMessageContentPartImageImageUrl.validateJSON(data['image_url']);
        }

        return true;
    }


}

ChatCompletionRequestMessageContentPartImage.RequiredProperties = ["type", "image_url"];

/**
 * The type of the content part.
 * @member {module:model/ChatCompletionRequestMessageContentPartImage.TypeEnum} type
 */
ChatCompletionRequestMessageContentPartImage.prototype['type'] = undefined;

/**
 * @member {module:model/ChatCompletionRequestMessageContentPartImageImageUrl} image_url
 */
ChatCompletionRequestMessageContentPartImage.prototype['image_url'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
ChatCompletionRequestMessageContentPartImage['TypeEnum'] = {

    /**
     * value: "image_url"
     * @const
     */
    "image_url": "image_url"
};



export default ChatCompletionRequestMessageContentPartImage;

