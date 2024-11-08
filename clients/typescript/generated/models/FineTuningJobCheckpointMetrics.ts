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

import { HttpFile } from '../http/http';

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

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "step",
            "baseName": "step",
            "type": "number",
            "format": ""
        },
        {
            "name": "trainLoss",
            "baseName": "train_loss",
            "type": "number",
            "format": ""
        },
        {
            "name": "trainMeanTokenAccuracy",
            "baseName": "train_mean_token_accuracy",
            "type": "number",
            "format": ""
        },
        {
            "name": "validLoss",
            "baseName": "valid_loss",
            "type": "number",
            "format": ""
        },
        {
            "name": "validMeanTokenAccuracy",
            "baseName": "valid_mean_token_accuracy",
            "type": "number",
            "format": ""
        },
        {
            "name": "fullValidLoss",
            "baseName": "full_valid_loss",
            "type": "number",
            "format": ""
        },
        {
            "name": "fullValidMeanTokenAccuracy",
            "baseName": "full_valid_mean_token_accuracy",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return FineTuningJobCheckpointMetrics.attributeTypeMap;
    }

    public constructor() {
    }
}
