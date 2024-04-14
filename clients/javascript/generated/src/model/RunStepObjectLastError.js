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
 * The RunStepObjectLastError model module.
 * @module model/RunStepObjectLastError
 * @version 1.0.1-pre.0
 */
class RunStepObjectLastError {
    /**
     * Constructs a new <code>RunStepObjectLastError</code>.
     * The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
     * @alias module:model/RunStepObjectLastError
     * @param code {module:model/RunStepObjectLastError.CodeEnum} One of `server_error` or `rate_limit_exceeded`.
     * @param message {String} A human-readable description of the error.
     */
    constructor(code, message) { 
        
        RunStepObjectLastError.initialize(this, code, message);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, code, message) { 
        obj['code'] = code;
        obj['message'] = message;
    }

    /**
     * Constructs a <code>RunStepObjectLastError</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepObjectLastError} obj Optional instance to populate.
     * @return {module:model/RunStepObjectLastError} The populated <code>RunStepObjectLastError</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStepObjectLastError();

            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'String');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunStepObjectLastError</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStepObjectLastError</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunStepObjectLastError.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['code'] && !(typeof data['code'] === 'string' || data['code'] instanceof String)) {
            throw new Error("Expected the field `code` to be a primitive type in the JSON string but got " + data['code']);
        }
        // ensure the json data is a string
        if (data['message'] && !(typeof data['message'] === 'string' || data['message'] instanceof String)) {
            throw new Error("Expected the field `message` to be a primitive type in the JSON string but got " + data['message']);
        }

        return true;
    }


}

RunStepObjectLastError.RequiredProperties = ["code", "message"];

/**
 * One of `server_error` or `rate_limit_exceeded`.
 * @member {module:model/RunStepObjectLastError.CodeEnum} code
 */
RunStepObjectLastError.prototype['code'] = undefined;

/**
 * A human-readable description of the error.
 * @member {String} message
 */
RunStepObjectLastError.prototype['message'] = undefined;





/**
 * Allowed values for the <code>code</code> property.
 * @enum {String}
 * @readonly
 */
RunStepObjectLastError['CodeEnum'] = {

    /**
     * value: "server_error"
     * @const
     */
    "server_error": "server_error",

    /**
     * value: "rate_limit_exceeded"
     * @const
     */
    "rate_limit_exceeded": "rate_limit_exceeded"
};



export default RunStepObjectLastError;

