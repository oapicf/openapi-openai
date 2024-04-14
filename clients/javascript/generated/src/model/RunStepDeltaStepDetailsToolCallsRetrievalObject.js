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
 * The RunStepDeltaStepDetailsToolCallsRetrievalObject model module.
 * @module model/RunStepDeltaStepDetailsToolCallsRetrievalObject
 * @version 1.0.1-pre.0
 */
class RunStepDeltaStepDetailsToolCallsRetrievalObject {
    /**
     * Constructs a new <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code>.
     * @alias module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject
     * @param index {Number} The index of the tool call in the tool calls array.
     * @param type {module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject.TypeEnum} The type of tool call. This is always going to be `retrieval` for this type of tool call.
     */
    constructor(index, type) { 
        
        RunStepDeltaStepDetailsToolCallsRetrievalObject.initialize(this, index, type);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, index, type) { 
        obj['index'] = index;
        obj['type'] = type;
    }

    /**
     * Constructs a <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject} obj Optional instance to populate.
     * @return {module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject} The populated <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStepDeltaStepDetailsToolCallsRetrievalObject();

            if (data.hasOwnProperty('index')) {
                obj['index'] = ApiClient.convertToType(data['index'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('retrieval')) {
                obj['retrieval'] = ApiClient.convertToType(data['retrieval'], Object);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStepDeltaStepDetailsToolCallsRetrievalObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunStepDeltaStepDetailsToolCallsRetrievalObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }

        return true;
    }


}

RunStepDeltaStepDetailsToolCallsRetrievalObject.RequiredProperties = ["index", "type"];

/**
 * The index of the tool call in the tool calls array.
 * @member {Number} index
 */
RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype['index'] = undefined;

/**
 * The ID of the tool call object.
 * @member {String} id
 */
RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype['id'] = undefined;

/**
 * The type of tool call. This is always going to be `retrieval` for this type of tool call.
 * @member {module:model/RunStepDeltaStepDetailsToolCallsRetrievalObject.TypeEnum} type
 */
RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype['type'] = undefined;

/**
 * For now, this is always going to be an empty object.
 * @member {Object} retrieval
 */
RunStepDeltaStepDetailsToolCallsRetrievalObject.prototype['retrieval'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
RunStepDeltaStepDetailsToolCallsRetrievalObject['TypeEnum'] = {

    /**
     * value: "retrieval"
     * @const
     */
    "retrieval": "retrieval"
};



export default RunStepDeltaStepDetailsToolCallsRetrievalObject;

