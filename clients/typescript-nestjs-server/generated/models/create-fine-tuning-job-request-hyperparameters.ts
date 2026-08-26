import { CreateFineTuningJobRequestHyperparametersNEpochs } from './create-fine-tuning-job-request-hyperparameters-n-epochs';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from './create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from './create-fine-tuning-job-request-hyperparameters-batch-size';


/**
 * The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of `method`, and should be passed in under the `method` parameter. 
 */
export interface CreateFineTuningJobRequestHyperparameters { 
  batch_size?: CreateFineTuningJobRequestHyperparametersBatchSize;
  learning_rate_multiplier?: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
  n_epochs?: CreateFineTuningJobRequestHyperparametersNEpochs;
}

