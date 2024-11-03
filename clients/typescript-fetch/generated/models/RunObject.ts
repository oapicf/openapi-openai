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
    AssistantsApiResponseFormatOptionToJSONTyped,
} from './AssistantsApiResponseFormatOption';
import type { RunObjectLastError } from './RunObjectLastError';
import {
    RunObjectLastErrorFromJSON,
    RunObjectLastErrorFromJSONTyped,
    RunObjectLastErrorToJSON,
    RunObjectLastErrorToJSONTyped,
} from './RunObjectLastError';
import type { RunObjectIncompleteDetails } from './RunObjectIncompleteDetails';
import {
    RunObjectIncompleteDetailsFromJSON,
    RunObjectIncompleteDetailsFromJSONTyped,
    RunObjectIncompleteDetailsToJSON,
    RunObjectIncompleteDetailsToJSONTyped,
} from './RunObjectIncompleteDetails';
import type { AssistantsApiToolChoiceOption } from './AssistantsApiToolChoiceOption';
import {
    AssistantsApiToolChoiceOptionFromJSON,
    AssistantsApiToolChoiceOptionFromJSONTyped,
    AssistantsApiToolChoiceOptionToJSON,
    AssistantsApiToolChoiceOptionToJSONTyped,
} from './AssistantsApiToolChoiceOption';
import type { RunCompletionUsage } from './RunCompletionUsage';
import {
    RunCompletionUsageFromJSON,
    RunCompletionUsageFromJSONTyped,
    RunCompletionUsageToJSON,
    RunCompletionUsageToJSONTyped,
} from './RunCompletionUsage';
import type { RunObjectRequiredAction } from './RunObjectRequiredAction';
import {
    RunObjectRequiredActionFromJSON,
    RunObjectRequiredActionFromJSONTyped,
    RunObjectRequiredActionToJSON,
    RunObjectRequiredActionToJSONTyped,
} from './RunObjectRequiredAction';
import type { AssistantObjectToolsInner } from './AssistantObjectToolsInner';
import {
    AssistantObjectToolsInnerFromJSON,
    AssistantObjectToolsInnerFromJSONTyped,
    AssistantObjectToolsInnerToJSON,
    AssistantObjectToolsInnerToJSONTyped,
} from './AssistantObjectToolsInner';
import type { TruncationObject } from './TruncationObject';
import {
    TruncationObjectFromJSON,
    TruncationObjectFromJSONTyped,
    TruncationObjectToJSON,
    TruncationObjectToJSONTyped,
} from './TruncationObject';

/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 * @export
 * @interface RunObject
 */
export interface RunObject {
    /**
     * The identifier, which can be referenced in API endpoints.
     * @type {string}
     * @memberof RunObject
     */
    id: string;
    /**
     * The object type, which is always `thread.run`.
     * @type {string}
     * @memberof RunObject
     */
    object: RunObjectObjectEnum;
    /**
     * The Unix timestamp (in seconds) for when the run was created.
     * @type {number}
     * @memberof RunObject
     */
    createdAt: number;
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     * @type {string}
     * @memberof RunObject
     */
    threadId: string;
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     * @type {string}
     * @memberof RunObject
     */
    assistantId: string;
    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     * @type {string}
     * @memberof RunObject
     */
    status: RunObjectStatusEnum;
    /**
     * 
     * @type {RunObjectRequiredAction}
     * @memberof RunObject
     */
    requiredAction: RunObjectRequiredAction | null;
    /**
     * 
     * @type {RunObjectLastError}
     * @memberof RunObject
     */
    lastError: RunObjectLastError | null;
    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     * @type {number}
     * @memberof RunObject
     */
    expiresAt: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run was started.
     * @type {number}
     * @memberof RunObject
     */
    startedAt: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     * @type {number}
     * @memberof RunObject
     */
    cancelledAt: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run failed.
     * @type {number}
     * @memberof RunObject
     */
    failedAt: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     * @type {number}
     * @memberof RunObject
     */
    completedAt: number | null;
    /**
     * 
     * @type {RunObjectIncompleteDetails}
     * @memberof RunObject
     */
    incompleteDetails: RunObjectIncompleteDetails | null;
    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     * @type {string}
     * @memberof RunObject
     */
    model: string;
    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     * @type {string}
     * @memberof RunObject
     */
    instructions: string;
    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     * @type {Array<AssistantObjectToolsInner>}
     * @memberof RunObject
     */
    tools: Array<AssistantObjectToolsInner>;
    /**
     * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
     * @type {Array<string>}
     * @memberof RunObject
     */
    fileIds: Array<string>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.
     * 
     * @type {object}
     * @memberof RunObject
     */
    metadata: object | null;
    /**
     * 
     * @type {RunCompletionUsage}
     * @memberof RunObject
     */
    usage: RunCompletionUsage | null;
    /**
     * The sampling temperature used for this run. If not set, defaults to 1.
     * @type {number}
     * @memberof RunObject
     */
    temperature?: number | null;
    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run.
     * 
     * @type {number}
     * @memberof RunObject
     */
    maxPromptTokens: number | null;
    /**
     * The maximum number of completion tokens specified to have been used over the course of the run.
     * 
     * @type {number}
     * @memberof RunObject
     */
    maxCompletionTokens: number | null;
    /**
     * 
     * @type {TruncationObject}
     * @memberof RunObject
     */
    truncationStrategy: TruncationObject;
    /**
     * 
     * @type {AssistantsApiToolChoiceOption}
     * @memberof RunObject
     */
    toolChoice: AssistantsApiToolChoiceOption;
    /**
     * 
     * @type {AssistantsApiResponseFormatOption}
     * @memberof RunObject
     */
    responseFormat: AssistantsApiResponseFormatOption;
}


/**
 * @export
 */
export const RunObjectObjectEnum = {
    ThreadRun: 'thread.run'
} as const;
export type RunObjectObjectEnum = typeof RunObjectObjectEnum[keyof typeof RunObjectObjectEnum];

/**
 * @export
 */
export const RunObjectStatusEnum = {
    Queued: 'queued',
    InProgress: 'in_progress',
    RequiresAction: 'requires_action',
    Cancelling: 'cancelling',
    Cancelled: 'cancelled',
    Failed: 'failed',
    Completed: 'completed',
    Expired: 'expired'
} as const;
export type RunObjectStatusEnum = typeof RunObjectStatusEnum[keyof typeof RunObjectStatusEnum];


/**
 * Check if a given object implements the RunObject interface.
 */
export function instanceOfRunObject(value: object): value is RunObject {
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('object' in value) || value['object'] === undefined) return false;
    if (!('createdAt' in value) || value['createdAt'] === undefined) return false;
    if (!('threadId' in value) || value['threadId'] === undefined) return false;
    if (!('assistantId' in value) || value['assistantId'] === undefined) return false;
    if (!('status' in value) || value['status'] === undefined) return false;
    if (!('requiredAction' in value) || value['requiredAction'] === undefined) return false;
    if (!('lastError' in value) || value['lastError'] === undefined) return false;
    if (!('expiresAt' in value) || value['expiresAt'] === undefined) return false;
    if (!('startedAt' in value) || value['startedAt'] === undefined) return false;
    if (!('cancelledAt' in value) || value['cancelledAt'] === undefined) return false;
    if (!('failedAt' in value) || value['failedAt'] === undefined) return false;
    if (!('completedAt' in value) || value['completedAt'] === undefined) return false;
    if (!('incompleteDetails' in value) || value['incompleteDetails'] === undefined) return false;
    if (!('model' in value) || value['model'] === undefined) return false;
    if (!('instructions' in value) || value['instructions'] === undefined) return false;
    if (!('tools' in value) || value['tools'] === undefined) return false;
    if (!('fileIds' in value) || value['fileIds'] === undefined) return false;
    if (!('metadata' in value) || value['metadata'] === undefined) return false;
    if (!('usage' in value) || value['usage'] === undefined) return false;
    if (!('maxPromptTokens' in value) || value['maxPromptTokens'] === undefined) return false;
    if (!('maxCompletionTokens' in value) || value['maxCompletionTokens'] === undefined) return false;
    if (!('truncationStrategy' in value) || value['truncationStrategy'] === undefined) return false;
    if (!('toolChoice' in value) || value['toolChoice'] === undefined) return false;
    if (!('responseFormat' in value) || value['responseFormat'] === undefined) return false;
    return true;
}

export function RunObjectFromJSON(json: any): RunObject {
    return RunObjectFromJSONTyped(json, false);
}

export function RunObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunObject {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'object': json['object'],
        'createdAt': json['created_at'],
        'threadId': json['thread_id'],
        'assistantId': json['assistant_id'],
        'status': json['status'],
        'requiredAction': RunObjectRequiredActionFromJSON(json['required_action']),
        'lastError': RunObjectLastErrorFromJSON(json['last_error']),
        'expiresAt': json['expires_at'],
        'startedAt': json['started_at'],
        'cancelledAt': json['cancelled_at'],
        'failedAt': json['failed_at'],
        'completedAt': json['completed_at'],
        'incompleteDetails': RunObjectIncompleteDetailsFromJSON(json['incomplete_details']),
        'model': json['model'],
        'instructions': json['instructions'],
        'tools': ((json['tools'] as Array<any>).map(AssistantObjectToolsInnerFromJSON)),
        'fileIds': json['file_ids'],
        'metadata': json['metadata'],
        'usage': RunCompletionUsageFromJSON(json['usage']),
        'temperature': json['temperature'] == null ? undefined : json['temperature'],
        'maxPromptTokens': json['max_prompt_tokens'],
        'maxCompletionTokens': json['max_completion_tokens'],
        'truncationStrategy': TruncationObjectFromJSON(json['truncation_strategy']),
        'toolChoice': AssistantsApiToolChoiceOptionFromJSON(json['tool_choice']),
        'responseFormat': AssistantsApiResponseFormatOptionFromJSON(json['response_format']),
    };
}

  export function RunObjectToJSON(json: any): RunObject {
      return RunObjectToJSONTyped(json, false);
  }

  export function RunObjectToJSONTyped(value?: RunObject | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'id': value['id'],
        'object': value['object'],
        'created_at': value['createdAt'],
        'thread_id': value['threadId'],
        'assistant_id': value['assistantId'],
        'status': value['status'],
        'required_action': RunObjectRequiredActionToJSON(value['requiredAction']),
        'last_error': RunObjectLastErrorToJSON(value['lastError']),
        'expires_at': value['expiresAt'],
        'started_at': value['startedAt'],
        'cancelled_at': value['cancelledAt'],
        'failed_at': value['failedAt'],
        'completed_at': value['completedAt'],
        'incomplete_details': RunObjectIncompleteDetailsToJSON(value['incompleteDetails']),
        'model': value['model'],
        'instructions': value['instructions'],
        'tools': ((value['tools'] as Array<any>).map(AssistantObjectToolsInnerToJSON)),
        'file_ids': value['fileIds'],
        'metadata': value['metadata'],
        'usage': RunCompletionUsageToJSON(value['usage']),
        'temperature': value['temperature'],
        'max_prompt_tokens': value['maxPromptTokens'],
        'max_completion_tokens': value['maxCompletionTokens'],
        'truncation_strategy': TruncationObjectToJSON(value['truncationStrategy']),
        'tool_choice': AssistantsApiToolChoiceOptionToJSON(value['toolChoice']),
        'response_format': AssistantsApiResponseFormatOptionToJSON(value['responseFormat']),
    };
}

