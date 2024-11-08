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

import { FineTuningJobError } from '../models/FineTuningJobError';
import { FineTuningJobHyperparameters } from '../models/FineTuningJobHyperparameters';
import { FineTuningJobIntegrationsInner } from '../models/FineTuningJobIntegrationsInner';
import { HttpFile } from '../http/http';

/**
* The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
*/
export class FineTuningJob {
    /**
    * The object identifier, which can be referenced in the API endpoints.
    */
    'id': string;
    /**
    * The Unix timestamp (in seconds) for when the fine-tuning job was created.
    */
    'createdAt': number;
    'error': FineTuningJobError | null;
    /**
    * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
    */
    'fineTunedModel': string | null;
    /**
    * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
    */
    'finishedAt': number | null;
    'hyperparameters': FineTuningJobHyperparameters;
    /**
    * The base model that is being fine-tuned.
    */
    'model': string;
    /**
    * The object type, which is always \"fine_tuning.job\".
    */
    'object': FineTuningJobObjectEnum;
    /**
    * The organization that owns the fine-tuning job.
    */
    'organizationId': string;
    /**
    * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
    */
    'resultFiles': Array<string>;
    /**
    * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    */
    'status': FineTuningJobStatusEnum;
    /**
    * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
    */
    'trainedTokens': number | null;
    /**
    * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
    */
    'trainingFile': string;
    /**
    * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
    */
    'validationFile': string | null;
    /**
    * A list of integrations to enable for this fine-tuning job.
    */
    'integrations'?: Array<FineTuningJobIntegrationsInner> | null;
    /**
    * The seed used for the fine-tuning job.
    */
    'seed': number;

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
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "error",
            "baseName": "error",
            "type": "FineTuningJobError",
            "format": ""
        },
        {
            "name": "fineTunedModel",
            "baseName": "fine_tuned_model",
            "type": "string",
            "format": ""
        },
        {
            "name": "finishedAt",
            "baseName": "finished_at",
            "type": "number",
            "format": ""
        },
        {
            "name": "hyperparameters",
            "baseName": "hyperparameters",
            "type": "FineTuningJobHyperparameters",
            "format": ""
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "string",
            "format": ""
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "FineTuningJobObjectEnum",
            "format": ""
        },
        {
            "name": "organizationId",
            "baseName": "organization_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "resultFiles",
            "baseName": "result_files",
            "type": "Array<string>",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "FineTuningJobStatusEnum",
            "format": ""
        },
        {
            "name": "trainedTokens",
            "baseName": "trained_tokens",
            "type": "number",
            "format": ""
        },
        {
            "name": "trainingFile",
            "baseName": "training_file",
            "type": "string",
            "format": ""
        },
        {
            "name": "validationFile",
            "baseName": "validation_file",
            "type": "string",
            "format": ""
        },
        {
            "name": "integrations",
            "baseName": "integrations",
            "type": "Array<FineTuningJobIntegrationsInner>",
            "format": ""
        },
        {
            "name": "seed",
            "baseName": "seed",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FineTuningJob.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum FineTuningJobObjectEnum {
    FineTuningJob = 'fine_tuning.job'
}
export enum FineTuningJobStatusEnum {
    ValidatingFiles = 'validating_files',
    Queued = 'queued',
    Running = 'running',
    Succeeded = 'succeeded',
    Failed = 'failed',
    Cancelled = 'cancelled'
}

