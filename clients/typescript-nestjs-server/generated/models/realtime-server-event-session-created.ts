import { RealtimeSession } from './realtime-session';


/**
 * Returned when a Session is created. Emitted automatically when a new  connection is established as the first server event. This event will contain  the default Session configuration. 
 */
export interface RealtimeServerEventSessionCreated { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `session.created`.
   */
  type: RealtimeServerEventSessionCreated.TypeEnum;
  session: RealtimeSession;
}
export namespace RealtimeServerEventSessionCreated {
  export const TypeEnum = {
    SessionCreated: 'session.created'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


