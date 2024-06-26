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
import type { FineTuningJobCheckpointMetrics } from './FineTuningJobCheckpointMetrics';
import {
    FineTuningJobCheckpointMetricsFromJSON,
    FineTuningJobCheckpointMetricsFromJSONTyped,
    FineTuningJobCheckpointMetricsToJSON,
} from './FineTuningJobCheckpointMetrics';

/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use.
 * 
 * @export
 * @interface FineTuningJobCheckpoint
 */
export interface FineTuningJobCheckpoint {
    /**
     * The checkpoint identifier, which can be referenced in the API endpoints.
     * @type {string}
     * @memberof FineTuningJobCheckpoint
     */
    id: string;
    /**
     * The Unix timestamp (in seconds) for when the checkpoint was created.
     * @type {number}
     * @memberof FineTuningJobCheckpoint
     */
    createdAt: number;
    /**
     * The name of the fine-tuned checkpoint model that is created.
     * @type {string}
     * @memberof FineTuningJobCheckpoint
     */
    fineTunedModelCheckpoint: string;
    /**
     * The step number that the checkpoint was created at.
     * @type {number}
     * @memberof FineTuningJobCheckpoint
     */
    stepNumber: number;
    /**
     * 
     * @type {FineTuningJobCheckpointMetrics}
     * @memberof FineTuningJobCheckpoint
     */
    metrics: FineTuningJobCheckpointMetrics;
    /**
     * The name of the fine-tuning job that this checkpoint was created from.
     * @type {string}
     * @memberof FineTuningJobCheckpoint
     */
    fineTuningJobId: string;
    /**
     * The object type, which is always "fine_tuning.job.checkpoint".
     * @type {string}
     * @memberof FineTuningJobCheckpoint
     */
    object: FineTuningJobCheckpointObjectEnum;
}


/**
 * @export
 */
export const FineTuningJobCheckpointObjectEnum = {
    FineTuningJobCheckpoint: 'fine_tuning.job.checkpoint'
} as const;
export type FineTuningJobCheckpointObjectEnum = typeof FineTuningJobCheckpointObjectEnum[keyof typeof FineTuningJobCheckpointObjectEnum];


/**
 * Check if a given object implements the FineTuningJobCheckpoint interface.
 */
export function instanceOfFineTuningJobCheckpoint(value: object): boolean {
    if (!('id' in value)) return false;
    if (!('createdAt' in value)) return false;
    if (!('fineTunedModelCheckpoint' in value)) return false;
    if (!('stepNumber' in value)) return false;
    if (!('metrics' in value)) return false;
    if (!('fineTuningJobId' in value)) return false;
    if (!('object' in value)) return false;
    return true;
}

export function FineTuningJobCheckpointFromJSON(json: any): FineTuningJobCheckpoint {
    return FineTuningJobCheckpointFromJSONTyped(json, false);
}

export function FineTuningJobCheckpointFromJSONTyped(json: any, ignoreDiscriminator: boolean): FineTuningJobCheckpoint {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
        'createdAt': json['created_at'],
        'fineTunedModelCheckpoint': json['fine_tuned_model_checkpoint'],
        'stepNumber': json['step_number'],
        'metrics': FineTuningJobCheckpointMetricsFromJSON(json['metrics']),
        'fineTuningJobId': json['fine_tuning_job_id'],
        'object': json['object'],
    };
}

export function FineTuningJobCheckpointToJSON(value?: FineTuningJobCheckpoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
        'created_at': value['createdAt'],
        'fine_tuned_model_checkpoint': value['fineTunedModelCheckpoint'],
        'step_number': value['stepNumber'],
        'metrics': FineTuningJobCheckpointMetricsToJSON(value['metrics']),
        'fine_tuning_job_id': value['fineTuningJobId'],
        'object': value['object'],
    };
}

