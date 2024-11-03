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
 * The TranscriptionWord model module.
 * @module model/TranscriptionWord
 * @version 1.1.1-pre.0
 */
class TranscriptionWord {
    /**
     * Constructs a new <code>TranscriptionWord</code>.
     * @alias module:model/TranscriptionWord
     * @param word {String} The text content of the word.
     * @param start {Number} Start time of the word in seconds.
     * @param end {Number} End time of the word in seconds.
     */
    constructor(word, start, end) { 
        
        TranscriptionWord.initialize(this, word, start, end);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, word, start, end) { 
        obj['word'] = word;
        obj['start'] = start;
        obj['end'] = end;
    }

    /**
     * Constructs a <code>TranscriptionWord</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TranscriptionWord} obj Optional instance to populate.
     * @return {module:model/TranscriptionWord} The populated <code>TranscriptionWord</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TranscriptionWord();

            if (data.hasOwnProperty('word')) {
                obj['word'] = ApiClient.convertToType(data['word'], 'String');
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Number');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TranscriptionWord</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TranscriptionWord</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of TranscriptionWord.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['word'] && !(typeof data['word'] === 'string' || data['word'] instanceof String)) {
            throw new Error("Expected the field `word` to be a primitive type in the JSON string but got " + data['word']);
        }

        return true;
    }


}

TranscriptionWord.RequiredProperties = ["word", "start", "end"];

/**
 * The text content of the word.
 * @member {String} word
 */
TranscriptionWord.prototype['word'] = undefined;

/**
 * Start time of the word in seconds.
 * @member {Number} start
 */
TranscriptionWord.prototype['start'] = undefined;

/**
 * End time of the word in seconds.
 * @member {Number} end
 */
TranscriptionWord.prototype['end'] = undefined;






export default TranscriptionWord;

