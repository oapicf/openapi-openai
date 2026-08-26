

/**
 * For fine-tuning jobs that have `failed`, this will contain more information on the cause of the failure.
 */
export interface FineTuningJobError { 
  /**
   * A machine-readable error code.
   */
  code: string;
  /**
   * A human-readable error message.
   */
  message: string;
  /**
   * The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific.
   */
  param: string | null;
}

