import { RealtimeSessionCreateRequest } from './realtime-session-create-request';


/**
 * Send this event to update the session’s default configuration. The client may  send this event at any time to update the session configuration, and any  field may be updated at any time, except for \"voice\". The server will respond  with a `session.updated` event that shows the full effective configuration.  Only fields that are present are updated, thus the correct way to clear a  field like \"instructions\" is to pass an empty string. 
 */
export interface RealtimeClientEventSessionUpdate { 
  /**
   * Optional client-generated ID used to identify this event.
   */
  event_id?: string;
  /**
   * The event type, must be `session.update`.
   */
  type: RealtimeClientEventSessionUpdate.TypeEnum;
  session: RealtimeSessionCreateRequest;
}
export namespace RealtimeClientEventSessionUpdate {
  export const TypeEnum = {
    SessionUpdate: 'session.update'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


