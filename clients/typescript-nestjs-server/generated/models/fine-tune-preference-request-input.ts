import { FineTunePreferenceRequestInputPreferredCompletionInner } from './fine-tune-preference-request-input-preferred-completion-inner';
import { FineTunePreferenceRequestInputInput } from './fine-tune-preference-request-input-input';


/**
 * The per-line training example of a fine-tuning input file for chat models using the dpo method.
 */
export interface FineTunePreferenceRequestInput { 
  input?: FineTunePreferenceRequestInputInput;
  /**
   * The preferred completion message for the output.
   */
  preferred_completion?: Array<FineTunePreferenceRequestInputPreferredCompletionInner>;
  /**
   * The non-preferred completion message for the output.
   */
  non_preferred_completion?: Array<FineTunePreferenceRequestInputPreferredCompletionInner>;
}

