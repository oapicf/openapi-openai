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

import { RequestFile } from './models';

/**
* Metrics at the step number during the fine-tuning job.
*/
export class FineTuningJobCheckpointMetrics {
    'step'?: number;
    'trainLoss'?: number;
    'trainMeanTokenAccuracy'?: number;
    'validLoss'?: number;
    'validMeanTokenAccuracy'?: number;
    'fullValidLoss'?: number;
    'fullValidMeanTokenAccuracy'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "step",
            "baseName": "step",
            "type": "number"
        },
        {
            "name": "trainLoss",
            "baseName": "train_loss",
            "type": "number"
        },
        {
            "name": "trainMeanTokenAccuracy",
            "baseName": "train_mean_token_accuracy",
            "type": "number"
        },
        {
            "name": "validLoss",
            "baseName": "valid_loss",
            "type": "number"
        },
        {
            "name": "validMeanTokenAccuracy",
            "baseName": "valid_mean_token_accuracy",
            "type": "number"
        },
        {
            "name": "fullValidLoss",
            "baseName": "full_valid_loss",
            "type": "number"
        },
        {
            "name": "fullValidMeanTokenAccuracy",
            "baseName": "full_valid_mean_token_accuracy",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return FineTuningJobCheckpointMetrics.attributeTypeMap;
    }
}

