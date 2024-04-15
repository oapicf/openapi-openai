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
import { FineTuningJobError } from './fineTuningJobError';
import { FineTuningJobHyperparameters } from './fineTuningJobHyperparameters';
import { FineTuningJobIntegrationsInner } from './fineTuningJobIntegrationsInner';


/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
 */
export interface FineTuningJob { 
    /**
     * The object identifier, which can be referenced in the API endpoints.
     */
    id: string;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     */
    created_at: number;
    error: FineTuningJobError | null;
    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     */
    fine_tuned_model: string | null;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     */
    finished_at: number | null;
    hyperparameters: FineTuningJobHyperparameters;
    /**
     * The base model that is being fine-tuned.
     */
    model: string;
    /**
     * The object type, which is always \"fine_tuning.job\".
     */
    object: FineTuningJob.ObjectEnum;
    /**
     * The organization that owns the fine-tuning job.
     */
    organization_id: string;
    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    result_files: Array<string>;
    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     */
    status: FineTuningJob.StatusEnum;
    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     */
    trained_tokens: number | null;
    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    training_file: string;
    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     */
    validation_file: string | null;
    /**
     * A list of integrations to enable for this fine-tuning job.
     */
    integrations?: Array<FineTuningJobIntegrationsInner> | null;
    /**
     * The seed used for the fine-tuning job.
     */
    seed: number;
}
export namespace FineTuningJob {
    export type ObjectEnum = 'fine_tuning.job';
    export const ObjectEnum = {
        FineTuningJob: 'fine_tuning.job' as ObjectEnum
    }
    export type StatusEnum = 'validating_files' | 'queued' | 'running' | 'succeeded' | 'failed' | 'cancelled';
    export const StatusEnum = {
        ValidatingFiles: 'validating_files' as StatusEnum,
        Queued: 'queued' as StatusEnum,
        Running: 'running' as StatusEnum,
        Succeeded: 'succeeded' as StatusEnum,
        Failed: 'failed' as StatusEnum,
        Cancelled: 'cancelled' as StatusEnum
    }
}