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
import { CreateFineTuningJobRequestHyperparametersNEpochs } from './createFineTuningJobRequestHyperparametersNEpochs';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from './createFineTuningJobRequestHyperparametersLearningRateMultiplier';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from './createFineTuningJobRequestHyperparametersBatchSize';


/**
 * The hyperparameters used for the fine-tuning job.
 */
export interface CreateFineTuningJobRequestHyperparameters { 
    batch_size?: CreateFineTuningJobRequestHyperparametersBatchSize;
    learning_rate_multiplier?: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
    n_epochs?: CreateFineTuningJobRequestHyperparametersNEpochs;
}

