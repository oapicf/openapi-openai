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
 * The RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject model module.
 * @module model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
 * @version 1.1.1-pre.0
 */
class RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
    /**
     * Constructs a new <code>RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject</code>.
     * Text output from the Code Interpreter tool call as part of a run step.
     * @alias module:model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject
     * @param index {Number} The index of the output in the outputs array.
     * @param type {module:model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum} Always `logs`.
     */
    constructor(index, type) { 
        
        RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.initialize(this, index, type);
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
     * Constructs a <code>RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject} obj Optional instance to populate.
     * @return {module:model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject} The populated <code>RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject();

            if (data.hasOwnProperty('index')) {
                obj['index'] = ApiClient.convertToType(data['index'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('logs')) {
                obj['logs'] = ApiClient.convertToType(data['logs'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['type'] && !(typeof data['type'] === 'string' || data['type'] instanceof String)) {
            throw new Error("Expected the field `type` to be a primitive type in the JSON string but got " + data['type']);
        }
        // ensure the json data is a string
        if (data['logs'] && !(typeof data['logs'] === 'string' || data['logs'] instanceof String)) {
            throw new Error("Expected the field `logs` to be a primitive type in the JSON string but got " + data['logs']);
        }

        return true;
    }


}

RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.RequiredProperties = ["index", "type"];

/**
 * The index of the output in the outputs array.
 * @member {Number} index
 */
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.prototype['index'] = undefined;

/**
 * Always `logs`.
 * @member {module:model/RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum} type
 */
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.prototype['type'] = undefined;

/**
 * The text output from the Code Interpreter tool call.
 * @member {String} logs
 */
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.prototype['logs'] = undefined;





/**
 * Allowed values for the <code>type</code> property.
 * @enum {String}
 * @readonly
 */
RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject['TypeEnum'] = {

    /**
     * value: "logs"
     * @const
     */
    "logs": "logs"
};



export default RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject;

