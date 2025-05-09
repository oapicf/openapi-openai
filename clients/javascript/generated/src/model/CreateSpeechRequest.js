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
import CreateSpeechRequestModel from './CreateSpeechRequestModel';

/**
 * The CreateSpeechRequest model module.
 * @module model/CreateSpeechRequest
 * @version 1.1.1-pre.0
 */
class CreateSpeechRequest {
    /**
     * Constructs a new <code>CreateSpeechRequest</code>.
     * @alias module:model/CreateSpeechRequest
     * @param model {module:model/CreateSpeechRequestModel} 
     * @param input {String} The text to generate audio for. The maximum length is 4096 characters.
     * @param voice {module:model/CreateSpeechRequest.VoiceEnum} The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
     */
    constructor(model, input, voice) { 
        
        CreateSpeechRequest.initialize(this, model, input, voice);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, model, input, voice) { 
        obj['model'] = model;
        obj['input'] = input;
        obj['voice'] = voice;
        obj['response_format'] = 'mp3';
        obj['speed'] = 1.0;
    }

    /**
     * Constructs a <code>CreateSpeechRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateSpeechRequest} obj Optional instance to populate.
     * @return {module:model/CreateSpeechRequest} The populated <code>CreateSpeechRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateSpeechRequest();

            if (data.hasOwnProperty('model')) {
                obj['model'] = CreateSpeechRequestModel.constructFromObject(data['model']);
            }
            if (data.hasOwnProperty('input')) {
                obj['input'] = ApiClient.convertToType(data['input'], 'String');
            }
            if (data.hasOwnProperty('voice')) {
                obj['voice'] = ApiClient.convertToType(data['voice'], 'String');
            }
            if (data.hasOwnProperty('response_format')) {
                obj['response_format'] = ApiClient.convertToType(data['response_format'], 'String');
            }
            if (data.hasOwnProperty('speed')) {
                obj['speed'] = ApiClient.convertToType(data['speed'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateSpeechRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateSpeechRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateSpeechRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // validate the optional field `model`
        if (data['model']) { // data not null
          CreateSpeechRequestModel.validateJSON(data['model']);
        }
        // ensure the json data is a string
        if (data['input'] && !(typeof data['input'] === 'string' || data['input'] instanceof String)) {
            throw new Error("Expected the field `input` to be a primitive type in the JSON string but got " + data['input']);
        }
        // ensure the json data is a string
        if (data['voice'] && !(typeof data['voice'] === 'string' || data['voice'] instanceof String)) {
            throw new Error("Expected the field `voice` to be a primitive type in the JSON string but got " + data['voice']);
        }
        // ensure the json data is a string
        if (data['response_format'] && !(typeof data['response_format'] === 'string' || data['response_format'] instanceof String)) {
            throw new Error("Expected the field `response_format` to be a primitive type in the JSON string but got " + data['response_format']);
        }

        return true;
    }


}

CreateSpeechRequest.RequiredProperties = ["model", "input", "voice"];

/**
 * @member {module:model/CreateSpeechRequestModel} model
 */
CreateSpeechRequest.prototype['model'] = undefined;

/**
 * The text to generate audio for. The maximum length is 4096 characters.
 * @member {String} input
 */
CreateSpeechRequest.prototype['input'] = undefined;

/**
 * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
 * @member {module:model/CreateSpeechRequest.VoiceEnum} voice
 */
CreateSpeechRequest.prototype['voice'] = undefined;

/**
 * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
 * @member {module:model/CreateSpeechRequest.ResponseFormatEnum} response_format
 * @default 'mp3'
 */
CreateSpeechRequest.prototype['response_format'] = 'mp3';

/**
 * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
 * @member {Number} speed
 * @default 1.0
 */
CreateSpeechRequest.prototype['speed'] = 1.0;





/**
 * Allowed values for the <code>voice</code> property.
 * @enum {String}
 * @readonly
 */
CreateSpeechRequest['VoiceEnum'] = {

    /**
     * value: "alloy"
     * @const
     */
    "alloy": "alloy",

    /**
     * value: "echo"
     * @const
     */
    "echo": "echo",

    /**
     * value: "fable"
     * @const
     */
    "fable": "fable",

    /**
     * value: "onyx"
     * @const
     */
    "onyx": "onyx",

    /**
     * value: "nova"
     * @const
     */
    "nova": "nova",

    /**
     * value: "shimmer"
     * @const
     */
    "shimmer": "shimmer"
};


/**
 * Allowed values for the <code>response_format</code> property.
 * @enum {String}
 * @readonly
 */
CreateSpeechRequest['ResponseFormatEnum'] = {

    /**
     * value: "mp3"
     * @const
     */
    "mp3": "mp3",

    /**
     * value: "opus"
     * @const
     */
    "opus": "opus",

    /**
     * value: "aac"
     * @const
     */
    "aac": "aac",

    /**
     * value: "flac"
     * @const
     */
    "flac": "flac",

    /**
     * value: "wav"
     * @const
     */
    "wav": "wav",

    /**
     * value: "pcm"
     * @const
     */
    "pcm": "pcm"
};



export default CreateSpeechRequest;

