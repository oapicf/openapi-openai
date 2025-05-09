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
import MessageDeltaContentTextAnnotationsFileCitationObject from './MessageDeltaContentTextAnnotationsFileCitationObject';
import MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation from './MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation';
import MessageDeltaContentTextAnnotationsFilePathObject from './MessageDeltaContentTextAnnotationsFilePathObject';
import MessageDeltaContentTextAnnotationsFilePathObjectFilePath from './MessageDeltaContentTextAnnotationsFilePathObjectFilePath';

/**
 * The MessageDeltaContentTextObjectTextAnnotationsInner model module.
 * @module model/MessageDeltaContentTextObjectTextAnnotationsInner
 * @version 1.1.1-pre.0
 */
class MessageDeltaContentTextObjectTextAnnotationsInner {
    /**
     * Constructs a new <code>MessageDeltaContentTextObjectTextAnnotationsInner</code>.
     * @alias module:model/MessageDeltaContentTextObjectTextAnnotationsInner
     * @param {(module:model/MessageDeltaContentTextAnnotationsFileCitationObject|module:model/MessageDeltaContentTextAnnotationsFilePathObject)} instance The actual instance to initialize MessageDeltaContentTextObjectTextAnnotationsInner.
     */
    constructor(instance = null) {
        if (instance === null) {
            this.actualInstance = null;
            return;
        }
        var match = 0;
        var errorMessages = [];
        try {
            if (typeof instance === "MessageDeltaContentTextAnnotationsFileCitationObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                MessageDeltaContentTextAnnotationsFileCitationObject.validateJSON(instance); // throw an exception if no match
                // create MessageDeltaContentTextAnnotationsFileCitationObject from JS object
                this.actualInstance = MessageDeltaContentTextAnnotationsFileCitationObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into MessageDeltaContentTextAnnotationsFileCitationObject
            errorMessages.push("Failed to construct MessageDeltaContentTextAnnotationsFileCitationObject: " + err)
        }

        try {
            if (typeof instance === "MessageDeltaContentTextAnnotationsFilePathObject") {
                this.actualInstance = instance;
            } else {
                // plain JS object
                // validate the object
                MessageDeltaContentTextAnnotationsFilePathObject.validateJSON(instance); // throw an exception if no match
                // create MessageDeltaContentTextAnnotationsFilePathObject from JS object
                this.actualInstance = MessageDeltaContentTextAnnotationsFilePathObject.constructFromObject(instance);
            }
            match++;
        } catch(err) {
            // json data failed to deserialize into MessageDeltaContentTextAnnotationsFilePathObject
            errorMessages.push("Failed to construct MessageDeltaContentTextAnnotationsFilePathObject: " + err)
        }

        if (match > 1) {
            throw new Error("Multiple matches found constructing `MessageDeltaContentTextObjectTextAnnotationsInner` with oneOf schemas MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject. Input: " + JSON.stringify(instance));
        } else if (match === 0) {
            this.actualInstance = null; // clear the actual instance in case there are multiple matches
            throw new Error("No match found constructing `MessageDeltaContentTextObjectTextAnnotationsInner` with oneOf schemas MessageDeltaContentTextAnnotationsFileCitationObject, MessageDeltaContentTextAnnotationsFilePathObject. Details: " +
                            errorMessages.join(", "));
        } else { // only 1 match
            // the input is valid
        }
    }

    /**
     * Constructs a <code>MessageDeltaContentTextObjectTextAnnotationsInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MessageDeltaContentTextObjectTextAnnotationsInner} obj Optional instance to populate.
     * @return {module:model/MessageDeltaContentTextObjectTextAnnotationsInner} The populated <code>MessageDeltaContentTextObjectTextAnnotationsInner</code> instance.
     */
    static constructFromObject(data, obj) {
        return new MessageDeltaContentTextObjectTextAnnotationsInner(data);
    }

    /**
     * Gets the actual instance, which can be <code>MessageDeltaContentTextAnnotationsFileCitationObject</code>, <code>MessageDeltaContentTextAnnotationsFilePathObject</code>.
     * @return {(module:model/MessageDeltaContentTextAnnotationsFileCitationObject|module:model/MessageDeltaContentTextAnnotationsFilePathObject)} The actual instance.
     */
    getActualInstance() {
        return this.actualInstance;
    }

    /**
     * Sets the actual instance, which can be <code>MessageDeltaContentTextAnnotationsFileCitationObject</code>, <code>MessageDeltaContentTextAnnotationsFilePathObject</code>.
     * @param {(module:model/MessageDeltaContentTextAnnotationsFileCitationObject|module:model/MessageDeltaContentTextAnnotationsFilePathObject)} obj The actual instance.
     */
    setActualInstance(obj) {
       this.actualInstance = MessageDeltaContentTextObjectTextAnnotationsInner.constructFromObject(obj).getActualInstance();
    }

    /**
     * Returns the JSON representation of the actual instance.
     * @return {string}
     */
    toJSON = function(){
        return this.getActualInstance();
    }

    /**
     * Create an instance of MessageDeltaContentTextObjectTextAnnotationsInner from a JSON string.
     * @param {string} json_string JSON string.
     * @return {module:model/MessageDeltaContentTextObjectTextAnnotationsInner} An instance of MessageDeltaContentTextObjectTextAnnotationsInner.
     */
    static fromJSON = function(json_string){
        return MessageDeltaContentTextObjectTextAnnotationsInner.constructFromObject(JSON.parse(json_string));
    }
}

/**
 * The index of the annotation in the text content part.
 * @member {Number} index
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['index'] = undefined;

/**
 * Always `file_citation`.
 * @member {module:model/MessageDeltaContentTextObjectTextAnnotationsInner.TypeEnum} type
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['type'] = undefined;

/**
 * The text in the message content that needs to be replaced.
 * @member {String} text
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['text'] = undefined;

/**
 * @member {module:model/MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation} file_citation
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['file_citation'] = undefined;

/**
 * @member {Number} start_index
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['start_index'] = undefined;

/**
 * @member {Number} end_index
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['end_index'] = undefined;

/**
 * @member {module:model/MessageDeltaContentTextAnnotationsFilePathObjectFilePath} file_path
 */
MessageDeltaContentTextObjectTextAnnotationsInner.prototype['file_path'] = undefined;


MessageDeltaContentTextObjectTextAnnotationsInner.OneOf = ["MessageDeltaContentTextAnnotationsFileCitationObject", "MessageDeltaContentTextAnnotationsFilePathObject"];

export default MessageDeltaContentTextObjectTextAnnotationsInner;

