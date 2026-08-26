import { RealtimeServerEventRateLimitsUpdatedRateLimitsInner } from './realtime-server-event-rate-limits-updated-rate-limits-inner';


/**
 * Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \"reserved\" for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
 */
export interface RealtimeServerEventRateLimitsUpdated { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `rate_limits.updated`.
   */
  type: RealtimeServerEventRateLimitsUpdated.TypeEnum;
  /**
   * List of rate limit information.
   */
  rate_limits: Array<RealtimeServerEventRateLimitsUpdatedRateLimitsInner>;
}
export namespace RealtimeServerEventRateLimitsUpdated {
  export const TypeEnum = {
    RateLimitsUpdated: 'rate_limits.updated'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


