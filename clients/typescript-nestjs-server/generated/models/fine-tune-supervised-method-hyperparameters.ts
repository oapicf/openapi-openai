import { FineTuneDPOMethodHyperparametersLearningRateMultiplier } from './fine-tune-dpo-method-hyperparameters-learning-rate-multiplier';
import { FineTuneDPOMethodHyperparametersNEpochs } from './fine-tune-dpo-method-hyperparameters-n-epochs';
import { FineTuneDPOMethodHyperparametersBatchSize } from './fine-tune-dpo-method-hyperparameters-batch-size';


/**
 * The hyperparameters used for the fine-tuning job.
 */
export interface FineTuneSupervisedMethodHyperparameters { 
  batch_size?: FineTuneDPOMethodHyperparametersBatchSize;
  learning_rate_multiplier?: FineTuneDPOMethodHyperparametersLearningRateMultiplier;
  n_epochs?: FineTuneDPOMethodHyperparametersNEpochs;
}

