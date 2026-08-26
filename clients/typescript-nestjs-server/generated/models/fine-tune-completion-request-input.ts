

/**
 * The per-line training example of a fine-tuning input file for completions models
 */
export interface FineTuneCompletionRequestInput { 
  /**
   * The input prompt for this training example.
   */
  prompt?: string;
  /**
   * The desired completion for this training example.
   */
  completion?: string;
}

