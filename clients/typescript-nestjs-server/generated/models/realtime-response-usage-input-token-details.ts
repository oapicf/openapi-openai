

/**
 * Details about the input tokens used in the Response.
 */
export interface RealtimeResponseUsageInputTokenDetails { 
  /**
   * The number of cached tokens used in the Response.
   */
  cached_tokens?: number;
  /**
   * The number of text tokens used in the Response.
   */
  text_tokens?: number;
  /**
   * The number of audio tokens used in the Response.
   */
  audio_tokens?: number;
}

