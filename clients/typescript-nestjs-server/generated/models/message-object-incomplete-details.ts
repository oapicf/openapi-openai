

/**
 * On an incomplete message, details about why the message is incomplete.
 */
export interface MessageObjectIncompleteDetails { 
  /**
   * The reason the message is incomplete.
   */
  reason: MessageObjectIncompleteDetails.ReasonEnum;
}
export namespace MessageObjectIncompleteDetails {
  export const ReasonEnum = {
    ContentFilter: 'content_filter',
    MaxTokens: 'max_tokens',
    RunCancelled: 'run_cancelled',
    RunExpired: 'run_expired',
    RunFailed: 'run_failed'
  } as const;
  export type ReasonEnum = typeof ReasonEnum[keyof typeof ReasonEnum];
}


