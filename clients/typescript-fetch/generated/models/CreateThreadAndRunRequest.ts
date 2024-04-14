/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { AssistantsApiResponseFormatOption } from './AssistantsApiResponseFormatOption';
import {
    AssistantsApiResponseFormatOptionFromJSON,
    AssistantsApiResponseFormatOptionFromJSONTyped,
    AssistantsApiResponseFormatOptionToJSON,
} from './AssistantsApiResponseFormatOption';
import type { AssistantsApiToolChoiceOption } from './AssistantsApiToolChoiceOption';
import {
    AssistantsApiToolChoiceOptionFromJSON,
    AssistantsApiToolChoiceOptionFromJSONTyped,
    AssistantsApiToolChoiceOptionToJSON,
} from './AssistantsApiToolChoiceOption';
import type { CreateRunRequestModel } from './CreateRunRequestModel';
import {
    CreateRunRequestModelFromJSON,
    CreateRunRequestModelFromJSONTyped,
    CreateRunRequestModelToJSON,
} from './CreateRunRequestModel';
import type { CreateThreadAndRunRequestToolsInner } from './CreateThreadAndRunRequestToolsInner';
import {
    CreateThreadAndRunRequestToolsInnerFromJSON,
    CreateThreadAndRunRequestToolsInnerFromJSONTyped,
    CreateThreadAndRunRequestToolsInnerToJSON,
} from './CreateThreadAndRunRequestToolsInner';
import type { CreateThreadRequest } from './CreateThreadRequest';
import {
    CreateThreadRequestFromJSON,
    CreateThreadRequestFromJSONTyped,
    CreateThreadRequestToJSON,
} from './CreateThreadRequest';
import type { TruncationObject } from './TruncationObject';
import {
    TruncationObjectFromJSON,
    TruncationObjectFromJSONTyped,
    TruncationObjectToJSON,
} from './TruncationObject';

/**
 * 
 * @export
 * @interface CreateThreadAndRunRequest
 */
export interface CreateThreadAndRunRequest {
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) to use to execute this run.
     * @type {string}
     * @memberof CreateThreadAndRunRequest
     */
    assistantId: string;
    /**
     * 
     * @type {CreateThreadRequest}
     * @memberof CreateThreadAndRunRequest
     */
    thread?: CreateThreadRequest;
    /**
     * 
     * @type {CreateRunRequestModel}
     * @memberof CreateThreadAndRunRequest
     */
    model?: CreateRunRequestModel;
    /**
     * Override the default system message of the assistant. This is useful for modifying the behavior on a per-run basis.
     * @type {string}
     * @memberof CreateThreadAndRunRequest
     */
    instructions?: string;
    /**
     * Override the tools the assistant can use for this run. This is useful for modifying the behavior on a per-run basis.
     * @type {Array<CreateThreadAndRunRequestToolsInner>}
     * @memberof CreateThreadAndRunRequest
     */
    tools?: Array<CreateThreadAndRunRequestToolsInner>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * 
     * @type {object}
     * @memberof CreateThreadAndRunRequest
     */
    metadata?: object;
    /**
     * What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * 
     * @type {number}
     * @memberof CreateThreadAndRunRequest
     */
    temperature?: number;
    /**
     * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message.
     * 
     * @type {boolean}
     * @memberof CreateThreadAndRunRequest
     */
    stream?: boolean;
    /**
     * The maximum number of prompt tokens that may be used over the course of the run. The run will make a best effort to use only the number of prompt tokens specified, across multiple turns of the run. If the run exceeds the number of prompt tokens specified, the run will end with status `complete`. See `incomplete_details` for more info.
     * 
     * @type {number}
     * @memberof CreateThreadAndRunRequest
     */
    maxPromptTokens?: number;
    /**
     * The maximum number of completion tokens that may be used over the course of the run. The run will make a best effort to use only the number of completion tokens specified, across multiple turns of the run. If the run exceeds the number of completion tokens specified, the run will end with status `incomplete`. See `incomplete_details` for more info.
     * 
     * @type {number}
     * @memberof CreateThreadAndRunRequest
     */
    maxCompletionTokens?: number;
    /**
     * 
     * @type {TruncationObject}
     * @memberof CreateThreadAndRunRequest
     */
    truncationStrategy?: TruncationObject;
    /**
     * 
     * @type {AssistantsApiToolChoiceOption}
     * @memberof CreateThreadAndRunRequest
     */
    toolChoice?: AssistantsApiToolChoiceOption;
    /**
     * 
     * @type {AssistantsApiResponseFormatOption}
     * @memberof CreateThreadAndRunRequest
     */
    responseFormat?: AssistantsApiResponseFormatOption;
}

/**
 * Check if a given object implements the CreateThreadAndRunRequest interface.
 */
export function instanceOfCreateThreadAndRunRequest(value: object): boolean {
    if (!('assistantId' in value)) return false;
    return true;
}

export function CreateThreadAndRunRequestFromJSON(json: any): CreateThreadAndRunRequest {
    return CreateThreadAndRunRequestFromJSONTyped(json, false);
}

export function CreateThreadAndRunRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CreateThreadAndRunRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'assistantId': json['assistant_id'],
        'thread': json['thread'] == null ? undefined : CreateThreadRequestFromJSON(json['thread']),
        'model': json['model'] == null ? undefined : CreateRunRequestModelFromJSON(json['model']),
        'instructions': json['instructions'] == null ? undefined : json['instructions'],
        'tools': json['tools'] == null ? undefined : ((json['tools'] as Array<any>).map(CreateThreadAndRunRequestToolsInnerFromJSON)),
        'metadata': json['metadata'] == null ? undefined : json['metadata'],
        'temperature': json['temperature'] == null ? undefined : json['temperature'],
        'stream': json['stream'] == null ? undefined : json['stream'],
        'maxPromptTokens': json['max_prompt_tokens'] == null ? undefined : json['max_prompt_tokens'],
        'maxCompletionTokens': json['max_completion_tokens'] == null ? undefined : json['max_completion_tokens'],
        'truncationStrategy': json['truncation_strategy'] == null ? undefined : TruncationObjectFromJSON(json['truncation_strategy']),
        'toolChoice': json['tool_choice'] == null ? undefined : AssistantsApiToolChoiceOptionFromJSON(json['tool_choice']),
        'responseFormat': json['response_format'] == null ? undefined : AssistantsApiResponseFormatOptionFromJSON(json['response_format']),
    };
}

export function CreateThreadAndRunRequestToJSON(value?: CreateThreadAndRunRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'assistant_id': value['assistantId'],
        'thread': CreateThreadRequestToJSON(value['thread']),
        'model': CreateRunRequestModelToJSON(value['model']),
        'instructions': value['instructions'],
        'tools': value['tools'] == null ? undefined : ((value['tools'] as Array<any>).map(CreateThreadAndRunRequestToolsInnerToJSON)),
        'metadata': value['metadata'],
        'temperature': value['temperature'],
        'stream': value['stream'],
        'max_prompt_tokens': value['maxPromptTokens'],
        'max_completion_tokens': value['maxCompletionTokens'],
        'truncation_strategy': TruncationObjectToJSON(value['truncationStrategy']),
        'tool_choice': AssistantsApiToolChoiceOptionToJSON(value['toolChoice']),
        'response_format': AssistantsApiResponseFormatOptionToJSON(value['responseFormat']),
    };
}

