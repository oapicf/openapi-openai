

export interface RealtimeServerEventRateLimitsUpdatedRateLimitsInner { 
  /**
   * The name of the rate limit (`requests`, `tokens`). 
   */
  name?: RealtimeServerEventRateLimitsUpdatedRateLimitsInner.NameEnum;
  /**
   * The maximum allowed value for the rate limit.
   */
  limit?: number;
  /**
   * The remaining value before the limit is reached.
   */
  remaining?: number;
  /**
   * Seconds until the rate limit resets.
   */
  reset_seconds?: number;
}
export namespace RealtimeServerEventRateLimitsUpdatedRateLimitsInner {
  export const NameEnum = {
    Requests: 'requests',
    Tokens: 'tokens'
  } as const;
  export type NameEnum = typeof NameEnum[keyof typeof NameEnum];
}


