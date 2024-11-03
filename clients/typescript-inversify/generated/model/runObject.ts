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
import { AssistantObjectToolsInner } from './assistantObjectToolsInner';
import { AssistantsApiResponseFormatOption } from './assistantsApiResponseFormatOption';
import { AssistantsApiToolChoiceOption } from './assistantsApiToolChoiceOption';
import { RunCompletionUsage } from './runCompletionUsage';
import { RunObjectIncompleteDetails } from './runObjectIncompleteDetails';
import { RunObjectLastError } from './runObjectLastError';
import { RunObjectRequiredAction } from './runObjectRequiredAction';
import { TruncationObject } from './truncationObject';


/**
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 */
export interface RunObject { 
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    id: string;
    /**
     * The object type, which is always `thread.run`.
     */
    object: RunObject.ObjectEnum;
    /**
     * The Unix timestamp (in seconds) for when the run was created.
     */
    created_at: number;
    /**
     * The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
     */
    thread_id: string;
    /**
     * The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
     */
    assistant_id: string;
    /**
     * The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
     */
    status: RunObject.StatusEnum;
    required_action: RunObjectRequiredAction | null;
    last_error: RunObjectLastError | null;
    /**
     * The Unix timestamp (in seconds) for when the run will expire.
     */
    expires_at: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run was started.
     */
    started_at: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run was cancelled.
     */
    cancelled_at: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run failed.
     */
    failed_at: number | null;
    /**
     * The Unix timestamp (in seconds) for when the run was completed.
     */
    completed_at: number | null;
    incomplete_details: RunObjectIncompleteDetails | null;
    /**
     * The model that the [assistant](/docs/api-reference/assistants) used for this run.
     */
    model: string;
    /**
     * The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
     */
    instructions: string;
    /**
     * The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
     */
    tools: Array<AssistantObjectToolsInner>;
    /**
     * The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
     */
    file_ids: Array<string>;
    /**
     * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
     */
    metadata: object | null;
    usage: RunCompletionUsage | null;
    /**
     * The sampling temperature used for this run. If not set, defaults to 1.
     */
    temperature?: number | null;
    /**
     * The maximum number of prompt tokens specified to have been used over the course of the run. 
     */
    max_prompt_tokens: number | null;
    /**
     * The maximum number of completion tokens specified to have been used over the course of the run. 
     */
    max_completion_tokens: number | null;
    truncation_strategy: TruncationObject;
    tool_choice: AssistantsApiToolChoiceOption;
    response_format: AssistantsApiResponseFormatOption;
}
export namespace RunObject {
    export type ObjectEnum = 'thread.run';
    export const ObjectEnum = {
        ThreadRun: 'thread.run' as ObjectEnum
    }
    export type StatusEnum = 'queued' | 'in_progress' | 'requires_action' | 'cancelling' | 'cancelled' | 'failed' | 'completed' | 'expired';
    export const StatusEnum = {
        Queued: 'queued' as StatusEnum,
        InProgress: 'in_progress' as StatusEnum,
        RequiresAction: 'requires_action' as StatusEnum,
        Cancelling: 'cancelling' as StatusEnum,
        Cancelled: 'cancelled' as StatusEnum,
        Failed: 'failed' as StatusEnum,
        Completed: 'completed' as StatusEnum,
        Expired: 'expired' as StatusEnum
    }
}
