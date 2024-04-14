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
import AssistantsApiResponseFormatOption from './AssistantsApiResponseFormatOption';
import AssistantsApiToolChoiceOption from './AssistantsApiToolChoiceOption';
import CreateRunRequestModel from './CreateRunRequestModel';
import CreateThreadAndRunRequestToolsInner from './CreateThreadAndRunRequestToolsInner';
import CreateThreadRequest from './CreateThreadRequest';
import TruncationObject from './TruncationObject';

/**
 * The CreateThreadAndRunRequest model module.
 * @module model/CreateThreadAndRunRequest
 * @version 1.0.1-pre.0
 */
class CreateThreadAndRunRequest {
    /**
     * Constructs a new <code>CreateThreadAndRunRequest</code>.
     * @alias module:model/CreateThreadAndRunRequest
     * @param assistantId {String} The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     */
    constructor(assistantId) { 
        
        CreateThreadAndRunRequest.initialize(this, assistantId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, assistantId) { 
        obj['assistant_id'] = assistantId;
    }

    /**
     * Constructs a <code>CreateThreadAndRunRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateThreadAndRunRequest} obj Optional instance to populate.
     * @return {module:model/CreateThreadAndRunRequest} The populated <code>CreateThreadAndRunRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateThreadAndRunRequest();

            if (data.hasOwnProperty('assistant_id')) {
                obj['assistant_id'] = ApiClient.convertToType(data['assistant_id'], 'String');
            }
            if (data.hasOwnProperty('thread')) {
                obj['thread'] = CreateThreadRequest.constructFromObject(data['thread']);
            }
            if (data.hasOwnProperty('model')) {
                obj['model'] = CreateRunRequestModel.constructFromObject(data['model']);
            }
            if (data.hasOwnProperty('instructions')) {
                obj['instructions'] = ApiClient.convertToType(data['instructions'], 'String');
            }
            if (data.hasOwnProperty('tools')) {
                obj['tools'] = ApiClient.convertToType(data['tools'], [CreateThreadAndRunRequestToolsInner]);
            }
            if (data.hasOwnProperty('metadata')) {
                obj['metadata'] = ApiClient.convertToType(data['metadata'], Object);
            }
            if (data.hasOwnProperty('temperature')) {
                obj['temperature'] = ApiClient.convertToType(data['temperature'], 'Number');
            }
            if (data.hasOwnProperty('stream')) {
                obj['stream'] = ApiClient.convertToType(data['stream'], 'Boolean');
            }
            if (data.hasOwnProperty('max_prompt_tokens')) {
                obj['max_prompt_tokens'] = ApiClient.convertToType(data['max_prompt_tokens'], 'Number');
            }
            if (data.hasOwnProperty('max_completion_tokens')) {
                obj['max_completion_tokens'] = ApiClient.convertToType(data['max_completion_tokens'], 'Number');
            }
            if (data.hasOwnProperty('truncation_strategy')) {
                obj['truncation_strategy'] = TruncationObject.constructFromObject(data['truncation_strategy']);
            }
            if (data.hasOwnProperty('tool_choice')) {
                obj['tool_choice'] = AssistantsApiToolChoiceOption.constructFromObject(data['tool_choice']);
            }
            if (data.hasOwnProperty('response_format')) {
                obj['response_format'] = AssistantsApiResponseFormatOption.constructFromObject(data['response_format']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateThreadAndRunRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateThreadAndRunRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateThreadAndRunRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['assistant_id'] && !(typeof data['assistant_id'] === 'string' || data['assistant_id'] instanceof String)) {
            throw new Error("Expected the field `assistant_id` to be a primitive type in the JSON string but got " + data['assistant_id']);
        }
        // validate the optional field `thread`
        if (data['thread']) { // data not null
          CreateThreadRequest.validateJSON(data['thread']);
        }
        // validate the optional field `model`
        if (data['model']) { // data not null
          CreateRunRequestModel.validateJSON(data['model']);
        }
        // ensure the json data is a string
        if (data['instructions'] && !(typeof data['instructions'] === 'string' || data['instructions'] instanceof String)) {
            throw new Error("Expected the field `instructions` to be a primitive type in the JSON string but got " + data['instructions']);
        }
        if (data['tools']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['tools'])) {
                throw new Error("Expected the field `tools` to be an array in the JSON data but got " + data['tools']);
            }
            // validate the optional field `tools` (array)
            for (const item of data['tools']) {
                CreateThreadAndRunRequestToolsInner.validateJSON(item);
            };
        }
        // validate the optional field `truncation_strategy`
        if (data['truncation_strategy']) { // data not null
          TruncationObject.validateJSON(data['truncation_strategy']);
        }
        // validate the optional field `tool_choice`
        if (data['tool_choice']) { // data not null
          AssistantsApiToolChoiceOption.validateJSON(data['tool_choice']);
        }
        // validate the optional field `response_format`
        if (data['response_format']) { // data not null
          AssistantsApiResponseFormatOption.validateJSON(data['response_format']);
        }

        return true;
    }


}

CreateThreadAndRunRequest.RequiredProperties = ["assistant_id"];

/**
 * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
 * @member {String} assistant_id
 */
CreateThreadAndRunRequest.prototype['assistant_id'] = undefined;

/**
 * @member {module:model/CreateThreadRequest} thread
 */
CreateThreadAndRunRequest.prototype['thread'] = undefined;

/**
 * @member {module:model/CreateRunRequestModel} model
 */
CreateThreadAndRunRequest.prototype['model'] = undefined;

/**
 * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
 * @member {String} instructions
 */
CreateThreadAndRunRequest.prototype['instructions'] = undefined;

/**
 * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
 * @member {Array.<module:model/CreateThreadAndRunRequestToolsInner>} tools
 */
CreateThreadAndRunRequest.prototype['tools'] = undefined;

/**
 * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
 * @member {Object} metadata
 */
CreateThreadAndRunRequest.prototype['metadata'] = undefined;

/**
 * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
 * @member {Number} temperature
 * @default 1
 */
CreateThreadAndRunRequest.prototype['temperature'] = 1;

/**
 * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
 * @member {Boolean} stream
 */
CreateThreadAndRunRequest.prototype['stream'] = undefined;

/**
 * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
 * @member {Number} max_prompt_tokens
 */
CreateThreadAndRunRequest.prototype['max_prompt_tokens'] = undefined;

/**
 * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
 * @member {Number} max_completion_tokens
 */
CreateThreadAndRunRequest.prototype['max_completion_tokens'] = undefined;

/**
 * @member {module:model/TruncationObject} truncation_strategy
 */
CreateThreadAndRunRequest.prototype['truncation_strategy'] = undefined;

/**
 * @member {module:model/AssistantsApiToolChoiceOption} tool_choice
 */
CreateThreadAndRunRequest.prototype['tool_choice'] = undefined;

/**
 * @member {module:model/AssistantsApiResponseFormatOption} response_format
 */
CreateThreadAndRunRequest.prototype['response_format'] = undefined;






export default CreateThreadAndRunRequest;

