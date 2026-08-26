

/**
 * The usage information for the request.
 */
export interface CreateEmbeddingResponseUsage { 
  /**
   * The number of tokens used by the prompt.
   */
  prompt_tokens: number;
  /**
   * The total number of tokens used by the request.
   */
  total_tokens: number;
}

