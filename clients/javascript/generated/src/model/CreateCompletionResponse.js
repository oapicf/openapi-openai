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
import CompletionUsage from './CompletionUsage';
import CreateCompletionResponseChoicesInner from './CreateCompletionResponseChoicesInner';

/**
 * The CreateCompletionResponse model module.
 * @module model/CreateCompletionResponse
 * @version 1.0.1-pre.0
 */
class CreateCompletionResponse {
    /**
     * Constructs a new <code>CreateCompletionResponse</code>.
     * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
     * @alias module:model/CreateCompletionResponse
     * @param id {String} A unique identifier for the completion.
     * @param choices {Array.<module:model/CreateCompletionResponseChoicesInner>} The list of completion choices the model generated for the input prompt.
     * @param created {Number} The Unix timestamp (in seconds) of when the completion was created.
     * @param model {String} The model used for completion.
     * @param object {module:model/CreateCompletionResponse.ObjectEnum} The object type, which is always \"text_completion\"
     */
    constructor(id, choices, created, model, object) { 
        
        CreateCompletionResponse.initialize(this, id, choices, created, model, object);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, id, choices, created, model, object) { 
        obj['id'] = id;
        obj['choices'] = choices;
        obj['created'] = created;
        obj['model'] = model;
        obj['object'] = object;
    }

    /**
     * Constructs a <code>CreateCompletionResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateCompletionResponse} obj Optional instance to populate.
     * @return {module:model/CreateCompletionResponse} The populated <code>CreateCompletionResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateCompletionResponse();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('choices')) {
                obj['choices'] = ApiClient.convertToType(data['choices'], [CreateCompletionResponseChoicesInner]);
            }
            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Number');
            }
            if (data.hasOwnProperty('model')) {
                obj['model'] = ApiClient.convertToType(data['model'], 'String');
            }
            if (data.hasOwnProperty('system_fingerprint')) {
                obj['system_fingerprint'] = ApiClient.convertToType(data['system_fingerprint'], 'String');
            }
            if (data.hasOwnProperty('object')) {
                obj['object'] = ApiClient.convertToType(data['object'], 'String');
            }
            if (data.hasOwnProperty('usage')) {
                obj['usage'] = CompletionUsage.constructFromObject(data['usage']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateCompletionResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateCompletionResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateCompletionResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        if (data['choices']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['choices'])) {
                throw new Error("Expected the field `choices` to be an array in the JSON data but got " + data['choices']);
            }
            // validate the optional field `choices` (array)
            for (const item of data['choices']) {
                CreateCompletionResponseChoicesInner.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['model'] && !(typeof data['model'] === 'string' || data['model'] instanceof String)) {
            throw new Error("Expected the field `model` to be a primitive type in the JSON string but got " + data['model']);
        }
        // ensure the json data is a string
        if (data['system_fingerprint'] && !(typeof data['system_fingerprint'] === 'string' || data['system_fingerprint'] instanceof String)) {
            throw new Error("Expected the field `system_fingerprint` to be a primitive type in the JSON string but got " + data['system_fingerprint']);
        }
        // ensure the json data is a string
        if (data['object'] && !(typeof data['object'] === 'string' || data['object'] instanceof String)) {
            throw new Error("Expected the field `object` to be a primitive type in the JSON string but got " + data['object']);
        }
        // validate the optional field `usage`
        if (data['usage']) { // data not null
          CompletionUsage.validateJSON(data['usage']);
        }

        return true;
    }


}

CreateCompletionResponse.RequiredProperties = ["id", "choices", "created", "model", "object"];

/**
 * A unique identifier for the completion.
 * @member {String} id
 */
CreateCompletionResponse.prototype['id'] = undefined;

/**
 * The list of completion choices the model generated for the input prompt.
 * @member {Array.<module:model/CreateCompletionResponseChoicesInner>} choices
 */
CreateCompletionResponse.prototype['choices'] = undefined;

/**
 * The Unix timestamp (in seconds) of when the completion was created.
 * @member {Number} created
 */
CreateCompletionResponse.prototype['created'] = undefined;

/**
 * The model used for completion.
 * @member {String} model
 */
CreateCompletionResponse.prototype['model'] = undefined;

/**
 * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
 * @member {String} system_fingerprint
 */
CreateCompletionResponse.prototype['system_fingerprint'] = undefined;

/**
 * The object type, which is always \"text_completion\"
 * @member {module:model/CreateCompletionResponse.ObjectEnum} object
 */
CreateCompletionResponse.prototype['object'] = undefined;

/**
 * @member {module:model/CompletionUsage} usage
 */
CreateCompletionResponse.prototype['usage'] = undefined;





/**
 * Allowed values for the <code>object</code> property.
 * @enum {String}
 * @readonly
 */
CreateCompletionResponse['ObjectEnum'] = {

    /**
     * value: "text_completion"
     * @const
     */
    "text_completion": "text_completion"
};



export default CreateCompletionResponse;

