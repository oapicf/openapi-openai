// tslint:disable
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
 */

import type {
    AssistantsApiResponseFormatOption,
    AssistantsApiToolChoiceOption,
    CreateRunRequestModel,
    CreateThreadAndRunRequestToolsInner,
    CreateThreadRequest,
    TruncationObject,
} from './';

/**
 * @export
 * @interface CreateThreadAndRunRequest
 */
export interface CreateThreadAndRunRequest {
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @type {string}
     * @memberof CreateThreadAndRunRequest
     */
    assistant_id: string;
    /**
     * @type {CreateThreadRequest}
     * @memberof CreateThreadAndRunRequest
     */
    thread?: CreateThreadRequest;
    /**
     * @type {CreateRunRequestModel}
     * @memberof CreateThreadAndRunRequest
     */
    model?: CreateRunRequestModel | null;
    /**
     * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @type {string}
     * @memberof CreateThreadAndRunRequest
     */
    instructions?: string | null;
    /**
     * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @type {Array<CreateThreadAndRunRequestToolsInner>}
     * @memberof CreateThreadAndRunRequest
     */
    tools?: Array<CreateThreadAndRunRequestToolsInner> | null;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     * @type {object}
     * @memberof CreateThreadAndRunRequest
     */
    metadata?: object | null;
    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic. 
     * @type {number}
     * @memberof CreateThreadAndRunRequest
     */
    temperature?: number | null;
    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
     * @type {boolean}
     * @memberof CreateThreadAndRunRequest
     */
    stream?: boolean | null;
    /**
     * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info. 
     * @type {number}
     * @memberof CreateThreadAndRunRequest
     */
    max_prompt_tokens?: number | null;
    /**
     * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info. 
     * @type {number}
     * @memberof CreateThreadAndRunRequest
     */
    max_completion_tokens?: number | null;
    /**
     * @type {TruncationObject}
     * @memberof CreateThreadAndRunRequest
     */
    truncation_strategy?: TruncationObject;
    /**
     * @type {AssistantsApiToolChoiceOption}
     * @memberof CreateThreadAndRunRequest
     */
    tool_choice?: AssistantsApiToolChoiceOption;
    /**
     * @type {AssistantsApiResponseFormatOption}
     * @memberof CreateThreadAndRunRequest
     */
    response_format?: AssistantsApiResponseFormatOption;
}
