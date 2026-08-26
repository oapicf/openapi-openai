

/**
 * Metrics at the step number during the fine-tuning job.
 */
export interface FineTuningJobCheckpointMetrics { 
  step?: number;
  train_loss?: number;
  train_mean_token_accuracy?: number;
  valid_loss?: number;
  valid_mean_token_accuracy?: number;
  full_valid_loss?: number;
  full_valid_mean_token_accuracy?: number;
}

