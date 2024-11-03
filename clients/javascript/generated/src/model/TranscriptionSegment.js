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
 * The TranscriptionSegment model module.
 * @module model/TranscriptionSegment
 * @version 1.1.1-pre.0
 */
class TranscriptionSegment {
    /**
     * Constructs a new <code>TranscriptionSegment</code>.
     * @alias module:model/TranscriptionSegment
     * @param id {Number} Unique identifier of the segment.
     * @param seek {Number} Seek offset of the segment.
     * @param start {Number} Start time of the segment in seconds.
     * @param end {Number} End time of the segment in seconds.
     * @param text {String} Text content of the segment.
     * @param tokens {Array.<Number>} Array of token IDs for the text content.
     * @param temperature {Number} Temperature parameter used for generating the segment.
     * @param avgLogprob {Number} Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
     * @param compressionRatio {Number} Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
     * @param noSpeechProb {Number} Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
     */
    constructor(id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb) { 
        
        TranscriptionSegment.initialize(this, id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, seek, start, end, text, tokens, temperature, avgLogprob, compressionRatio, noSpeechProb) { 
        obj['id'] = id;
        obj['seek'] = seek;
        obj['start'] = start;
        obj['end'] = end;
        obj['text'] = text;
        obj['tokens'] = tokens;
        obj['temperature'] = temperature;
        obj['avg_logprob'] = avgLogprob;
        obj['compression_ratio'] = compressionRatio;
        obj['no_speech_prob'] = noSpeechProb;
    }

    /**
     * Constructs a <code>TranscriptionSegment</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TranscriptionSegment} obj Optional instance to populate.
     * @return {module:model/TranscriptionSegment} The populated <code>TranscriptionSegment</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TranscriptionSegment();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'Number');
            }
            if (data.hasOwnProperty('seek')) {
                obj['seek'] = ApiClient.convertToType(data['seek'], 'Number');
            }
            if (data.hasOwnProperty('start')) {
                obj['start'] = ApiClient.convertToType(data['start'], 'Number');
            }
            if (data.hasOwnProperty('end')) {
                obj['end'] = ApiClient.convertToType(data['end'], 'Number');
            }
            if (data.hasOwnProperty('text')) {
                obj['text'] = ApiClient.convertToType(data['text'], 'String');
            }
            if (data.hasOwnProperty('tokens')) {
                obj['tokens'] = ApiClient.convertToType(data['tokens'], ['Number']);
            }
            if (data.hasOwnProperty('temperature')) {
                obj['temperature'] = ApiClient.convertToType(data['temperature'], 'Number');
            }
            if (data.hasOwnProperty('avg_logprob')) {
                obj['avg_logprob'] = ApiClient.convertToType(data['avg_logprob'], 'Number');
            }
            if (data.hasOwnProperty('compression_ratio')) {
                obj['compression_ratio'] = ApiClient.convertToType(data['compression_ratio'], 'Number');
            }
            if (data.hasOwnProperty('no_speech_prob')) {
                obj['no_speech_prob'] = ApiClient.convertToType(data['no_speech_prob'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TranscriptionSegment</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TranscriptionSegment</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of TranscriptionSegment.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['text'] && !(typeof data['text'] === 'string' || data['text'] instanceof String)) {
            throw new Error("Expected the field `text` to be a primitive type in the JSON string but got " + data['text']);
        }
        // ensure the json data is an array
        if (!Array.isArray(data['tokens'])) {
            throw new Error("Expected the field `tokens` to be an array in the JSON data but got " + data['tokens']);
        }

        return true;
    }


}

TranscriptionSegment.RequiredProperties = ["id", "seek", "start", "end", "text", "tokens", "temperature", "avg_logprob", "compression_ratio", "no_speech_prob"];

/**
 * Unique identifier of the segment.
 * @member {Number} id
 */
TranscriptionSegment.prototype['id'] = undefined;

/**
 * Seek offset of the segment.
 * @member {Number} seek
 */
TranscriptionSegment.prototype['seek'] = undefined;

/**
 * Start time of the segment in seconds.
 * @member {Number} start
 */
TranscriptionSegment.prototype['start'] = undefined;

/**
 * End time of the segment in seconds.
 * @member {Number} end
 */
TranscriptionSegment.prototype['end'] = undefined;

/**
 * Text content of the segment.
 * @member {String} text
 */
TranscriptionSegment.prototype['text'] = undefined;

/**
 * Array of token IDs for the text content.
 * @member {Array.<Number>} tokens
 */
TranscriptionSegment.prototype['tokens'] = undefined;

/**
 * Temperature parameter used for generating the segment.
 * @member {Number} temperature
 */
TranscriptionSegment.prototype['temperature'] = undefined;

/**
 * Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
 * @member {Number} avg_logprob
 */
TranscriptionSegment.prototype['avg_logprob'] = undefined;

/**
 * Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
 * @member {Number} compression_ratio
 */
TranscriptionSegment.prototype['compression_ratio'] = undefined;

/**
 * Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
 * @member {Number} no_speech_prob
 */
TranscriptionSegment.prototype['no_speech_prob'] = undefined;






export default TranscriptionSegment;

