/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RunStepCompletionUsage } from '../models/RunStepCompletionUsage';
import { RunStepObjectLastError } from '../models/RunStepObjectLastError';
import { RunStepObjectStepDetails } from '../models/RunStepObjectStepDetails';
import { HttpFile } from '../http/http';

/**
* Represents a step in execution of a run. 
*/
export class RunStepObject {
    /**
    * The identifier of the run step, which can be referenced in API endpoints.
    */
    'id': string;
    /**
    * The object type, which is always `thread.run.step`.
    */
    'object': RunStepObjectObjectEnum;
    /**
    * The Unix timestamp (in seconds) for when the run step was created.
    */
    'createdAt': number;
    /**
    * The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
    */
    'assistantId': string;
    /**
    * The ID of the [thread](/docs/api-reference/threads) that was run.
    */
    'threadId': string;
    /**
    * The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
    */
    'runId': string;
    /**
    * The type of run step, which can be either `message_creation` or `tool_calls`.
    */
    'type': RunStepObjectTypeEnum;
    /**
    * The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    */
    'status': RunStepObjectStatusEnum;
    'stepDetails': RunStepObjectStepDetails;
    'lastError': RunStepObjectLastError | null;
    /**
    * The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
    */
    'expiredAt': number | null;
    /**
    * The Unix timestamp (in seconds) for when the run step was cancelled.
    */
    'cancelledAt': number | null;
    /**
    * The Unix timestamp (in seconds) for when the run step failed.
    */
    'failedAt': number | null;
    /**
    * The Unix timestamp (in seconds) for when the run step completed.
    */
    'completedAt': number | null;
    /**
    * Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    */
    'metadata': any | null;
    'usage': RunStepCompletionUsage | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "RunStepObjectObjectEnum",
            "format": ""
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "assistantId",
            "baseName": "assistant_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "threadId",
            "baseName": "thread_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "runId",
            "baseName": "run_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepObjectTypeEnum",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "RunStepObjectStatusEnum",
            "format": ""
        },
        {
            "name": "stepDetails",
            "baseName": "step_details",
            "type": "RunStepObjectStepDetails",
            "format": ""
        },
        {
            "name": "lastError",
            "baseName": "last_error",
            "type": "RunStepObjectLastError",
            "format": ""
        },
        {
            "name": "expiredAt",
            "baseName": "expired_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "cancelledAt",
            "baseName": "cancelled_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "failedAt",
            "baseName": "failed_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "completedAt",
            "baseName": "completed_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "metadata",
            "baseName": "metadata",
            "type": "any",
            "format": ""
        },
        {
            "name": "usage",
            "baseName": "usage",
            "type": "RunStepCompletionUsage",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum RunStepObjectObjectEnum {
    ThreadRunStep = 'thread.run.step'
}
export enum RunStepObjectTypeEnum {
    MessageCreation = 'message_creation',
    ToolCalls = 'tool_calls'
}
export enum RunStepObjectStatusEnum {
    InProgress = 'in_progress',
    Cancelled = 'cancelled',
    Failed = 'failed',
    Completed = 'completed',
    Expired = 'expired'
}

