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
import CreateMessageRequest from './CreateMessageRequest';

/**
 * The CreateThreadRequest model module.
 * @module model/CreateThreadRequest
 * @version 1.1.1-pre.0
 */
class CreateThreadRequest {
    /**
     * Constructs a new <code>CreateThreadRequest</code>.
     * @alias module:model/CreateThreadRequest
     */
    constructor() { 
        
        CreateThreadRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CreateThreadRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateThreadRequest} obj Optional instance to populate.
     * @return {module:model/CreateThreadRequest} The populated <code>CreateThreadRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateThreadRequest();

            if (data.hasOwnProperty('messages')) {
                obj['messages'] = ApiClient.convertToType(data['messages'], [CreateMessageRequest]);
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateThreadRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateThreadRequest</code>.
     */
    static validateJSON(data) {
        if (data['messages']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['messages'])) {
                throw new Error("Expected the field `messages` to be an array in the JSON data but got " + data['messages']);
            }
            // validate the optional field `messages` (array)
            for (const item of data['messages']) {
                CreateMessageRequest.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * A list of [messages](/docs/api-reference/messages) to start the thread with.
 * @member {Array.<module:model/CreateMessageRequest>} messages
 */
CreateThreadRequest.prototype['messages'] = undefined;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @member {Object} metadata
 */
CreateThreadRequest.prototype['metadata'] = undefined;






export default CreateThreadRequest;

