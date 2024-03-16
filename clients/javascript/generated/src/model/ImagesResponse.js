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
import ImagesResponseDataInner from './ImagesResponseDataInner';

/**
 * The ImagesResponse model module.
 * @module model/ImagesResponse
 * @version 0.9.0-pre.0
 */
class ImagesResponse {
    /**
     * Constructs a new <code>ImagesResponse</code>.
     * @alias module:model/ImagesResponse
     * @param created {Number} 
     * @param data {Array.<module:model/ImagesResponseDataInner>} 
     */
    constructor(created, data) { 
        
        ImagesResponse.initialize(this, created, data);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, created, data) { 
        obj['created'] = created;
        obj['data'] = data;
    }

    /**
     * Constructs a <code>ImagesResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ImagesResponse} obj Optional instance to populate.
     * @return {module:model/ImagesResponse} The populated <code>ImagesResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ImagesResponse();

            if (data.hasOwnProperty('created')) {
                obj['created'] = ApiClient.convertToType(data['created'], 'Number');
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [ImagesResponseDataInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ImagesResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ImagesResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of ImagesResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['data']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['data'])) {
                throw new Error("Expected the field `data` to be an array in the JSON data but got " + data['data']);
            }
            // validate the optional field `data` (array)
            for (const item of data['data']) {
                ImagesResponseDataInner.validateJSON(item);
            };
        }

        return true;
    }


}

ImagesResponse.RequiredProperties = ["created", "data"];

/**
 * @member {Number} created
 */
ImagesResponse.prototype['created'] = undefined;

/**
 * @member {Array.<module:model/ImagesResponseDataInner>} data
 */
ImagesResponse.prototype['data'] = undefined;






export default ImagesResponse;

