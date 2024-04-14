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
import ChatCompletionRequestMessageContentPartImage from './ChatCompletionRequestMessageContentPartImage';
import ChatCompletionRequestMessageContentPartImageImageUrl from './ChatCompletionRequestMessageContentPartImageImageUrl';
import ChatCompletionRequestMessageContentPartText from './ChatCompletionRequestMessageContentPartText';

/**
 * The ChatCompletionRequestMessageContentPart model module.
 * @module model/ChatCompletionRequestMessageContentPart
 * @version 1.0.1-pre.0
 */
class ChatCompletionRequestMessageContentPart {
    /**
     * Constructs a new <code>ChatCompletionRequestMessageContentPart</code>.
     * @alias module:model/ChatCompletionRequestMessageContentPart
     * @param {(module:model/ChatCompletionRequestMessageContentPartImage|module:model/ChatCompletionRequestMessageContentPartText)} instance The actual instance to initialize ChatCompletionRequestMessageContentPart.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "ChatCompletionRequestMessageContentPartText") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                ChatCompletionRequestMessageContentPartText.validateJSON(instance); // throw an exception if no match
                // create ChatCompletionRequestMessageContentPartText from JS object
                this.actualInstance = ChatCompletionRequestMessageContentPartText.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into ChatCompletionRequestMessageContentPartText
            errorMessages.push("Failed to construct ChatCompletionRequestMessageContentPartText: " + err)
        }

        try {
            if (typeof instance === "ChatCompletionRequestMessageContentPartImage") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                ChatCompletionRequestMessageContentPartImage.validateJSON(instance); // throw an exception if no match
                // create ChatCompletionRequestMessageContentPartImage from JS object
                this.actualInstance = ChatCompletionRequestMessageContentPartImage.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into ChatCompletionRequestMessageContentPartImage
            errorMessages.push("Failed to construct ChatCompletionRequestMessageContentPartImage: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `ChatCompletionRequestMessageContentPart` with oneOf schemas ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartText. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `ChatCompletionRequestMessageContentPart` with oneOf schemas ChatCompletionRequestMessageContentPartImage, ChatCompletionRequestMessageContentPartText. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>ChatCompletionRequestMessageContentPart</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ChatCompletionRequestMessageContentPart} obj Optional instance to populate.
     * @return {module:model/ChatCompletionRequestMessageContentPart} The populated <code>ChatCompletionRequestMessageContentPart</code> instance.
     */
    static constructFromObject(data, obj) {
        return new ChatCompletionRequestMessageContentPart(data);
    }

    /**
     * Gets the actual instance, which can be <code>ChatCompletionRequestMessageContentPartImage</code>, <code>ChatCompletionRequestMessageContentPartText</code>.
     * @return {(module:model/ChatCompletionRequestMessageContentPartImage|module:model/ChatCompletionRequestMessageContentPartText)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>ChatCompletionRequestMessageContentPartImage</code>, <code>ChatCompletionRequestMessageContentPartText</code>.
     * @param {(module:model/ChatCompletionRequestMessageContentPartImage|module:model/ChatCompletionRequestMessageContentPartText)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = ChatCompletionRequestMessageContentPart.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of ChatCompletionRequestMessageContentPart from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/ChatCompletionRequestMessageContentPart} An instance of ChatCompletionRequestMessageContentPart.
     */
    static fromJSON = function(json_string){
        return ChatCompletionRequestMessageContentPart.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * The type of the content part.
 * @member {module:model/ChatCompletionRequestMessageContentPart.TypeEnum} type
 */
ChatCompletionRequestMessageContentPart.prototype['type'] = undefined;

/**
 * The text content.
 * @member {String} text
 */
ChatCompletionRequestMessageContentPart.prototype['text'] = undefined;

/**
 * @member {module:model/ChatCompletionRequestMessageContentPartImageImageUrl} image_url
 */
ChatCompletionRequestMessageContentPart.prototype['image_url'] = undefined;


ChatCompletionRequestMessageContentPart.OneOf = ["ChatCompletionRequestMessageContentPartImage", "ChatCompletionRequestMessageContentPartText"];

export default ChatCompletionRequestMessageContentPart;

