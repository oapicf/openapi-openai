import { RealtimeResponse } from './realtime-response';


/**
 * Returned when a new Response is created. The first event of response creation, where the response is in an initial state of `in_progress`. 
 */
export interface RealtimeServerEventResponseCreated { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `response.created`.
   */
  type: RealtimeServerEventResponseCreated.TypeEnum;
  response: RealtimeResponse;
}
export namespace RealtimeServerEventResponseCreated {
  export const TypeEnum = {
    ResponseCreated: 'response.created'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


