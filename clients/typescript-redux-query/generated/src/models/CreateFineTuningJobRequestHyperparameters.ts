// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    CreateFineTuningJobRequestHyperparametersBatchSize,
    CreateFineTuningJobRequestHyperparametersBatchSizeFromJSON,
    CreateFineTuningJobRequestHyperparametersBatchSizeToJSON,
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplier,
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplierFromJSON,
    CreateFineTuningJobRequestHyperparametersLearningRateMultiplierToJSON,
    CreateFineTuningJobRequestHyperparametersNEpochs,
    CreateFineTuningJobRequestHyperparametersNEpochsFromJSON,
    CreateFineTuningJobRequestHyperparametersNEpochsToJSON,
} from './';

/**
 * The hyperparameters used for the fine-tuning job.
 * @export
 * @interface CreateFineTuningJobRequestHyperparameters
 */
export interface CreateFineTuningJobRequestHyperparameters  {
    /**
     * 
     * @type {CreateFineTuningJobRequestHyperparametersBatchSize}
     * @memberof CreateFineTuningJobRequestHyperparameters
     */
    batchSize?: CreateFineTuningJobRequestHyperparametersBatchSize;
    /**
     * 
     * @type {CreateFineTuningJobRequestHyperparametersLearningRateMultiplier}
     * @memberof CreateFineTuningJobRequestHyperparameters
     */
    learningRateMultiplier?: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
    /**
     * 
     * @type {CreateFineTuningJobRequestHyperparametersNEpochs}
     * @memberof CreateFineTuningJobRequestHyperparameters
     */
    nEpochs?: CreateFineTuningJobRequestHyperparametersNEpochs;
}

export function CreateFineTuningJobRequestHyperparametersFromJSON(json: any): CreateFineTuningJobRequestHyperparameters {
    return {
        'batchSize': !exists(json, 'batch_size') ? undefined : CreateFineTuningJobRequestHyperparametersBatchSizeFromJSON(json['batch_size']),
        'learningRateMultiplier': !exists(json, 'learning_rate_multiplier') ? undefined : CreateFineTuningJobRequestHyperparametersLearningRateMultiplierFromJSON(json['learning_rate_multiplier']),
        'nEpochs': !exists(json, 'n_epochs') ? undefined : CreateFineTuningJobRequestHyperparametersNEpochsFromJSON(json['n_epochs']),
    };
}

export function CreateFineTuningJobRequestHyperparametersToJSON(value?: CreateFineTuningJobRequestHyperparameters): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'batch_size': CreateFineTuningJobRequestHyperparametersBatchSizeToJSON(value.batchSize),
        'learning_rate_multiplier': CreateFineTuningJobRequestHyperparametersLearningRateMultiplierToJSON(value.learningRateMultiplier),
        'n_epochs': CreateFineTuningJobRequestHyperparametersNEpochsToJSON(value.nEpochs),
    };
}


