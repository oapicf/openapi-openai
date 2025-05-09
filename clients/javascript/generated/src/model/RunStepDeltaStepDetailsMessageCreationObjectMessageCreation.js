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
 * The RunStepDeltaStepDetailsMessageCreationObjectMessageCreation model module.
 * @module model/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
 * @version 1.1.1-pre.0
 */
class RunStepDeltaStepDetailsMessageCreationObjectMessageCreation {
    /**
     * Constructs a new <code>RunStepDeltaStepDetailsMessageCreationObjectMessageCreation</code>.
     * @alias module:model/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation
     */
    constructor() { 
        
        RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>RunStepDeltaStepDetailsMessageCreationObjectMessageCreation</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation} obj Optional instance to populate.
     * @return {module:model/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation} The populated <code>RunStepDeltaStepDetailsMessageCreationObjectMessageCreation</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStepDeltaStepDetailsMessageCreationObjectMessageCreation();

            if (data.hasOwnProperty('message_id')) {
                obj['message_id'] = ApiClient.convertToType(data['message_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunStepDeltaStepDetailsMessageCreationObjectMessageCreation</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStepDeltaStepDetailsMessageCreationObjectMessageCreation</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['message_id'] && !(typeof data['message_id'] === 'string' || data['message_id'] instanceof String)) {
            throw new Error("Expected the field `message_id` to be a primitive type in the JSON string but got " + data['message_id']);
        }

        return true;
    }


}



/**
 * The ID of the message that was created by this run step.
 * @member {String} message_id
 */
RunStepDeltaStepDetailsMessageCreationObjectMessageCreation.prototype['message_id'] = undefined;






export default RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;

