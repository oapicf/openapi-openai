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
/**
 * Metrics at the step number during the fine-tuning job.
 * @export
 * @interface FineTuningJobCheckpointMetrics
 */
export interface FineTuningJobCheckpointMetrics {
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    step?: number;
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    trainLoss?: number;
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    trainMeanTokenAccuracy?: number;
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    validLoss?: number;
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    validMeanTokenAccuracy?: number;
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    fullValidLoss?: number;
    /**
     * 
     * @type {number}
     * @memberof FineTuningJobCheckpointMetrics
     */
    fullValidMeanTokenAccuracy?: number;
}

/**
 * Check if a given object implements the FineTuningJobCheckpointMetrics interface.
 */
export function instanceOfFineTuningJobCheckpointMetrics(value: object): value is FineTuningJobCheckpointMetrics {
    return true;
}

export function FineTuningJobCheckpointMetricsFromJSON(json: any): FineTuningJobCheckpointMetrics {
    return FineTuningJobCheckpointMetricsFromJSONTyped(json, false);
}

export function FineTuningJobCheckpointMetricsFromJSONTyped(json: any, ignoreDiscriminator: boolean): FineTuningJobCheckpointMetrics {
    if (json == null) {
        return json;
    }
    return {
        
        'step': json['step'] == null ? undefined : json['step'],
        'trainLoss': json['train_loss'] == null ? undefined : json['train_loss'],
        'trainMeanTokenAccuracy': json['train_mean_token_accuracy'] == null ? undefined : json['train_mean_token_accuracy'],
        'validLoss': json['valid_loss'] == null ? undefined : json['valid_loss'],
        'validMeanTokenAccuracy': json['valid_mean_token_accuracy'] == null ? undefined : json['valid_mean_token_accuracy'],
        'fullValidLoss': json['full_valid_loss'] == null ? undefined : json['full_valid_loss'],
        'fullValidMeanTokenAccuracy': json['full_valid_mean_token_accuracy'] == null ? undefined : json['full_valid_mean_token_accuracy'],
    };
}

  export function FineTuningJobCheckpointMetricsToJSON(json: any): FineTuningJobCheckpointMetrics {
      return FineTuningJobCheckpointMetricsToJSONTyped(json, false);
  }

  export function FineTuningJobCheckpointMetricsToJSONTyped(value?: FineTuningJobCheckpointMetrics | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'step': value['step'],
        'train_loss': value['trainLoss'],
        'train_mean_token_accuracy': value['trainMeanTokenAccuracy'],
        'valid_loss': value['validLoss'],
        'valid_mean_token_accuracy': value['validMeanTokenAccuracy'],
        'full_valid_loss': value['fullValidLoss'],
        'full_valid_mean_token_accuracy': value['fullValidMeanTokenAccuracy'],
    };
}

