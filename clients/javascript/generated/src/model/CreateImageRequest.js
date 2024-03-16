/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
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
 * The CreateImageRequest model module.
 * @module model/CreateImageRequest
 * @version 0.9.0-pre.0
 */
class CreateImageRequest {
    /**
     * Constructs a new <code>CreateImageRequest</code>.
     * @alias module:model/CreateImageRequest
     * @param prompt {String} A text description of the desired image(s). The maximum length is 1000 characters.
     */
    constructor(prompt) { 
        
        CreateImageRequest.initialize(this, prompt);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, prompt) { 
        obj['prompt'] = prompt;
    }

    /**
     * Constructs a <code>CreateImageRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateImageRequest} obj Optional instance to populate.
     * @return {module:model/CreateImageRequest} The populated <code>CreateImageRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateImageRequest();

            if (data.hasOwnProperty('prompt')) {
                obj['prompt'] = ApiClient.convertToType(data['prompt'], 'String');
            }
            if (data.hasOwnProperty('n')) {
                obj['n'] = ApiClient.convertToType(data['n'], 'Number');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'String');
            }
            if (data.hasOwnProperty('response_format')) {
                obj['response_format'] = ApiClient.convertToType(data['response_format'], 'String');
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = ApiClient.convertToType(data['user'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateImageRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateImageRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateImageRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['prompt'] && !(typeof data['prompt'] === 'string' || data['prompt'] instanceof String)) {
            throw new Error("Expected the field `prompt` to be a primitive type in the JSON string but got " + data['prompt']);
        }
        // ensure the json data is a string
        if (data['size'] && !(typeof data['size'] === 'string' || data['size'] instanceof String)) {
            throw new Error("Expected the field `size` to be a primitive type in the JSON string but got " + data['size']);
        }
        // ensure the json data is a string
        if (data['response_format'] && !(typeof data['response_format'] === 'string' || data['response_format'] instanceof String)) {
            throw new Error("Expected the field `response_format` to be a primitive type in the JSON string but got " + data['response_format']);
        }
        // ensure the json data is a string
        if (data['user'] && !(typeof data['user'] === 'string' || data['user'] instanceof String)) {
            throw new Error("Expected the field `user` to be a primitive type in the JSON string but got " + data['user']);
        }

        return true;
    }


}

CreateImageRequest.RequiredProperties = ["prompt"];

/**
 * A text description of the desired image(s). The maximum length is 1000 characters.
 * @member {String} prompt
 */
CreateImageRequest.prototype['prompt'] = undefined;

/**
 * The number of images to generate. Must be between 1 and 10.
 * @member {Number} n
 * @default 1
 */
CreateImageRequest.prototype['n'] = 1;

/**
 * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
 * @member {module:model/CreateImageRequest.SizeEnum} size
 * @default '1024x1024'
 */
CreateImageRequest.prototype['size'] = '1024x1024';

/**
 * The format in which the generated images are returned. Must be one of `url` or `b64_json`.
 * @member {module:model/CreateImageRequest.ResponseFormatEnum} response_format
 * @default 'url'
 */
CreateImageRequest.prototype['response_format'] = 'url';

/**
 * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
 * @member {String} user
 */
CreateImageRequest.prototype['user'] = undefined;





/**
 * Allowed values for the <code>size</code> property.
 * @enum {String}
 * @readonly
 */
CreateImageRequest['SizeEnum'] = {

    /**
     * value: "256x256"
     * @const
     */
    "256x256": "256x256",

    /**
     * value: "512x512"
     * @const
     */
    "512x512": "512x512",

    /**
     * value: "1024x1024"
     * @const
     */
    "1024x1024": "1024x1024"
};


/**
 * Allowed values for the <code>response_format</code> property.
 * @enum {String}
 * @readonly
 */
CreateImageRequest['ResponseFormatEnum'] = {

    /**
     * value: "url"
     * @const
     */
    "url": "url",

    /**
     * value: "b64_json"
     * @const
     */
    "b64_json": "b64_json"
};



export default CreateImageRequest;
