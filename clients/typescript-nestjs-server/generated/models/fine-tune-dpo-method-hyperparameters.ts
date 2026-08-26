import { FineTuneDPOMethodHyperparametersLearningRateMultiplier } from './fine-tune-dpo-method-hyperparameters-learning-rate-multiplier';
import { FineTuneDPOMethodHyperparametersBeta } from './fine-tune-dpo-method-hyperparameters-beta';
import { FineTuneDPOMethodHyperparametersNEpochs } from './fine-tune-dpo-method-hyperparameters-n-epochs';
import { FineTuneDPOMethodHyperparametersBatchSize } from './fine-tune-dpo-method-hyperparameters-batch-size';


/**
 * The hyperparameters used for the fine-tuning job.
 */
export interface FineTuneDPOMethodHyperparameters { 
  beta?: FineTuneDPOMethodHyperparametersBeta;
  batch_size?: FineTuneDPOMethodHyperparametersBatchSize;
  learning_rate_multiplier?: FineTuneDPOMethodHyperparametersLearningRateMultiplier;
  n_epochs?: FineTuneDPOMethodHyperparametersNEpochs;
}

