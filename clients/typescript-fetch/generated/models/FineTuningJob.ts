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
import type { FineTuningJobError } from './FineTuningJobError';
import {
    FineTuningJobErrorFromJSON,
    FineTuningJobErrorFromJSONTyped,
    FineTuningJobErrorToJSON,
} from './FineTuningJobError';
import type { FineTuningJobHyperparameters } from './FineTuningJobHyperparameters';
import {
    FineTuningJobHyperparametersFromJSON,
    FineTuningJobHyperparametersFromJSONTyped,
    FineTuningJobHyperparametersToJSON,
} from './FineTuningJobHyperparameters';
import type { FineTuningJobIntegrationsInner } from './FineTuningJobIntegrationsInner';
import {
    FineTuningJobIntegrationsInnerFromJSON,
    FineTuningJobIntegrationsInnerFromJSONTyped,
    FineTuningJobIntegrationsInnerToJSON,
} from './FineTuningJobIntegrationsInner';

/**
 * The `fine_tuning.job` object represents a fine-tuning job that has been created through the API.
 * 
 * @export
 * @interface FineTuningJob
 */
export interface FineTuningJob {
    /**
     * The object identifier, which can be referenced in the API endpoints.
     * @type {string}
     * @memberof FineTuningJob
     */
    id: string;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was created.
     * @type {number}
     * @memberof FineTuningJob
     */
    createdAt: number;
    /**
     * 
     * @type {FineTuningJobError}
     * @memberof FineTuningJob
     */
    error: FineTuningJobError | null;
    /**
     * The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
     * @type {string}
     * @memberof FineTuningJob
     */
    fineTunedModel: string | null;
    /**
     * The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
     * @type {number}
     * @memberof FineTuningJob
     */
    finishedAt: number | null;
    /**
     * 
     * @type {FineTuningJobHyperparameters}
     * @memberof FineTuningJob
     */
    hyperparameters: FineTuningJobHyperparameters;
    /**
     * The base model that is being fine-tuned.
     * @type {string}
     * @memberof FineTuningJob
     */
    model: string;
    /**
     * The object type, which is always "fine_tuning.job".
     * @type {string}
     * @memberof FineTuningJob
     */
    object: FineTuningJobObjectEnum;
    /**
     * The organization that owns the fine-tuning job.
     * @type {string}
     * @memberof FineTuningJob
     */
    organizationId: string;
    /**
     * The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @type {Array<string>}
     * @memberof FineTuningJob
     */
    resultFiles: Array<string>;
    /**
     * The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
     * @type {string}
     * @memberof FineTuningJob
     */
    status: FineTuningJobStatusEnum;
    /**
     * The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
     * @type {number}
     * @memberof FineTuningJob
     */
    trainedTokens: number | null;
    /**
     * The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @type {string}
     * @memberof FineTuningJob
     */
    trainingFile: string;
    /**
     * The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
     * @type {string}
     * @memberof FineTuningJob
     */
    validationFile: string | null;
    /**
     * A list of integrations to enable for this fine-tuning job.
     * @type {Array<FineTuningJobIntegrationsInner>}
     * @memberof FineTuningJob
     */
    integrations?: Array<FineTuningJobIntegrationsInner>;
    /**
     * The seed used for the fine-tuning job.
     * @type {number}
     * @memberof FineTuningJob
     */
    seed: number;
}


/**
 * @export
 */
export const FineTuningJobObjectEnum = {
    FineTuningJob: 'fine_tuning.job'
} as const;
export type FineTuningJobObjectEnum = typeof FineTuningJobObjectEnum[keyof typeof FineTuningJobObjectEnum];

/**
 * @export
 */
export const FineTuningJobStatusEnum = {
    ValidatingFiles: 'validating_files',
    Queued: 'queued',
    Running: 'running',
    Succeeded: 'succeeded',
    Failed: 'failed',
    Cancelled: 'cancelled'
} as const;
export type FineTuningJobStatusEnum = typeof FineTuningJobStatusEnum[keyof typeof FineTuningJobStatusEnum];


/**
 * Check if a given object implements the FineTuningJob interface.
 */
export function instanceOfFineTuningJob(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('createdAt' in value)) return false;
    if (!('error' in value)) return false;
    if (!('fineTunedModel' in value)) return false;
    if (!('finishedAt' in value)) return false;
    if (!('hyperparameters' in value)) return false;
    if (!('model' in value)) return false;
    if (!('object' in value)) return false;
    if (!('organizationId' in value)) return false;
    if (!('resultFiles' in value)) return false;
    if (!('status' in value)) return false;
    if (!('trainedTokens' in value)) return false;
    if (!('trainingFile' in value)) return false;
    if (!('validationFile' in value)) return false;
    if (!('seed' in value)) return false;
    return true;
}

export function FineTuningJobFromJSON(json: any): FineTuningJob {
    return FineTuningJobFromJSONTyped(json, false);
}

export function FineTuningJobFromJSONTyped(json: any, ignoreDiscriminator: boolean): FineTuningJob {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'createdAt': json['created_at'],
        'error': FineTuningJobErrorFromJSON(json['error']),
        'fineTunedModel': json['fine_tuned_model'],
        'finishedAt': json['finished_at'],
        'hyperparameters': FineTuningJobHyperparametersFromJSON(json['hyperparameters']),
        'model': json['model'],
        'object': json['object'],
        'organizationId': json['organization_id'],
        'resultFiles': json['result_files'],
        'status': json['status'],
        'trainedTokens': json['trained_tokens'],
        'trainingFile': json['training_file'],
        'validationFile': json['validation_file'],
        'integrations': json['integrations'] == null ? undefined : ((json['integrations'] as Array<any>).map(FineTuningJobIntegrationsInnerFromJSON)),
        'seed': json['seed'],
    };
}

export function FineTuningJobToJSON(value?: FineTuningJob | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'created_at': value['createdAt'],
        'error': FineTuningJobErrorToJSON(value['error']),
        'fine_tuned_model': value['fineTunedModel'],
        'finished_at': value['finishedAt'],
        'hyperparameters': FineTuningJobHyperparametersToJSON(value['hyperparameters']),
        'model': value['model'],
        'object': value['object'],
        'organization_id': value['organizationId'],
        'result_files': value['resultFiles'],
        'status': value['status'],
        'trained_tokens': value['trainedTokens'],
        'training_file': value['trainingFile'],
        'validation_file': value['validationFile'],
        'integrations': value['integrations'] == null ? undefined : ((value['integrations'] as Array<any>).map(FineTuningJobIntegrationsInnerToJSON)),
        'seed': value['seed'],
    };
}

