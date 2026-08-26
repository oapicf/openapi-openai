import { CompletionUsagePromptTokensDetails } from './completion-usage-prompt-tokens-details';
import { CompletionUsageCompletionTokensDetails } from './completion-usage-completion-tokens-details';


/**
 * Usage statistics for the completion request.
 */
export interface CompletionUsage { 
  /**
   * Number of tokens in the generated completion.
   */
  completion_tokens: number;
  /**
   * Number of tokens in the prompt.
   */
  prompt_tokens: number;
  /**
   * Total number of tokens used in the request (prompt + completion).
   */
  total_tokens: number;
  completion_tokens_details?: CompletionUsageCompletionTokensDetails;
  prompt_tokens_details?: CompletionUsagePromptTokensDetails;
}

