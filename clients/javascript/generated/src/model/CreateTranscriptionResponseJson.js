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
 * The CreateTranscriptionResponseJson model module.
 * @module model/CreateTranscriptionResponseJson
 * @version 1.1.1-pre.0
 */
class CreateTranscriptionResponseJson {
    /**
     * Constructs a new <code>CreateTranscriptionResponseJson</code>.
     * Represents a transcription response returned by model, based on the provided input.
     * @alias module:model/CreateTranscriptionResponseJson
     * @param text {String} The transcribed text.
     */
    constructor(text) { 
        
        CreateTranscriptionResponseJson.initialize(this, text);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, text) { 
        obj['text'] = text;
    }

    /**
     * Constructs a <code>CreateTranscriptionResponseJson</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateTranscriptionResponseJson} obj Optional instance to populate.
     * @return {module:model/CreateTranscriptionResponseJson} The populated <code>CreateTranscriptionResponseJson</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateTranscriptionResponseJson();

            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateTranscriptionResponseJson</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateTranscriptionResponseJson</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateTranscriptionResponseJson.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['text'] && !(typeof data['text'] === 'string' || data['text'] instanceof String)) {
            throw new Error("Expected the field `text` to be a primitive type in the JSON string but got " + data['text']);
        }

        return true;
    }


}

CreateTranscriptionResponseJson.RequiredProperties = ["text"];

/**
 * The transcribed text.
 * @member {String} text
 */
CreateTranscriptionResponseJson.prototype['text'] = undefined;






export default CreateTranscriptionResponseJson;

