import { RealtimeSession } from './realtime-session';


/**
 * Returned when a session is updated with a `session.update` event, unless  there is an error. 
 */
export interface RealtimeServerEventSessionUpdated { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `session.updated`.
   */
  type: RealtimeServerEventSessionUpdated.TypeEnum;
  session: RealtimeSession;
}
export namespace RealtimeServerEventSessionUpdated {
  export const TypeEnum = {
    SessionUpdated: 'session.updated'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


