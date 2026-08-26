import { CreateFineTuningJobRequestHyperparametersNEpochs } from './create-fine-tuning-job-request-hyperparameters-n-epochs';
import { CreateFineTuningJobRequestHyperparametersLearningRateMultiplier } from './create-fine-tuning-job-request-hyperparameters-learning-rate-multiplier';
import { CreateFineTuningJobRequestHyperparametersBatchSize } from './create-fine-tuning-job-request-hyperparameters-batch-size';


/**
 * The hyperparameters used for the fine-tuning job. This value will only be returned when running `supervised` jobs.
 */
export interface FineTuningJobHyperparameters { 
  batch_size?: CreateFineTuningJobRequestHyperparametersBatchSize;
  learning_rate_multiplier?: CreateFineTuningJobRequestHyperparametersLearningRateMultiplier;
  n_epochs?: CreateFineTuningJobRequestHyperparametersNEpochs;
}

