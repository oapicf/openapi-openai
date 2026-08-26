import { RealtimeServerEventErrorError } from './realtime-server-event-error-error';


/**
 * Returned when an error occurs, which could be a client problem or a server  problem. Most errors are recoverable and the session will stay open, we  recommend to implementors to monitor and log error messages by default. 
 */
export interface RealtimeServerEventError { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `error`.
   */
  type: RealtimeServerEventError.TypeEnum;
  error: RealtimeServerEventErrorError;
}
export namespace RealtimeServerEventError {
  export const TypeEnum = {
    Error: 'error'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


