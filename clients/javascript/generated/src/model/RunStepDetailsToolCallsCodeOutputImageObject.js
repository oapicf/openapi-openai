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
import RunStepDetailsToolCallsCodeOutputImageObjectImage from './RunStepDetailsToolCallsCodeOutputImageObjectImage';

/**
 * The RunStepDetailsToolCallsCodeOutputImageObject model module.
 * @module model/RunStepDetailsToolCallsCodeOutputImageObject
 * @version 1.0.1-pre.0
 */
class RunStepDetailsToolCallsCodeOutputImageObject {
    /**
     * Constructs a new <code>RunStepDetailsToolCallsCodeOutputImageObject</code>.
     * @alias module:model/RunStepDetailsToolCallsCodeOutputImageObject
     * @param type {module:model/RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum} Always `image`.
     * @param image {module:model/RunStepDetailsToolCallsCodeOutputImageObjectImage} 
     */
    constructor(type, image) { 
        
        RunStepDetailsToolCallsCodeOutputImageObject.initialize(this, type, image);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, type, image) { 
        obj['type'] = type;
        obj['image'] = image;
    }

    /**
     * Constructs a <code>RunStepDetailsToolCallsCodeOutputImageObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepDetailsToolCallsCodeOutputImageObject} obj Optional instance to populate.
     * @return {module:model/RunStepDetailsToolCallsCodeOutputImageObject} The populated <code>RunStepDetailsToolCallsCodeOutputImageObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStepDetailsToolCallsCodeOutputImageObject();

            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('image')) {
                obj['image'] = RunStepDetailsToolCallsCodeOutputImageObjectImage.constructFromObject(data['image']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunStepDetailsToolCallsCodeOutputImageObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStepDetailsToolCallsCodeOutputImageObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunStepDetailsToolCallsCodeOutputImageObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // validate the optional field `image`
        if (data['image']) { // data not null
          RunStepDetailsToolCallsCodeOutputImageObjectImage.validateJSON(data['image']);
        }

        return true;
    }


}

RunStepDetailsToolCallsCodeOutputImageObject.RequiredProperties = ["type", "image"];

/**
 * Always `image`.
 * @member {module:model/RunStepDetailsToolCallsCodeOutputImageObject.TypeEnum} type
 */
RunStepDetailsToolCallsCodeOutputImageObject.prototype['type'] = undefined;

/**
 * @member {module:model/RunStepDetailsToolCallsCodeOutputImageObjectImage} image
 */
RunStepDetailsToolCallsCodeOutputImageObject.prototype['image'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
RunStepDetailsToolCallsCodeOutputImageObject['TypeEnum'] = {

    /**
     * value: "image"
     * @const
     */
    "image": "image"
};



export default RunStepDetailsToolCallsCodeOutputImageObject;
