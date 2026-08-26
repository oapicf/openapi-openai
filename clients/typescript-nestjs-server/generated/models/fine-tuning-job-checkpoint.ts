import { FineTuningJobCheckpointMetrics } from './fine-tuning-job-checkpoint-metrics';


/**
 * The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
 */
export interface FineTuningJobCheckpoint { 
  /**
   * The checkpoint identifier, which can be referenced in the API endpoints.
   */
  id: string;
  /**
   * The Unix timestamp (in seconds) for when the checkpoint was created.
   */
  created_at: number;
  /**
   * The name of the fine-tuned checkpoint model that is created.
   */
  fine_tuned_model_checkpoint: string;
  /**
   * The step number that the checkpoint was created at.
   */
  step_number: number;
  metrics: FineTuningJobCheckpointMetrics;
  /**
   * The name of the fine-tuning job that this checkpoint was created from.
   */
  fine_tuning_job_id: string;
  /**
   * The object type, which is always \"fine_tuning.job.checkpoint\".
   */
  object: FineTuningJobCheckpoint.ObjectEnum;
}
export namespace FineTuningJobCheckpoint {
  export const ObjectEnum = {
    FineTuningJobCheckpoint: 'fine_tuning.job.checkpoint'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


