import { ThreadObject } from './thread-object';


/**
 * Occurs when a new [thread](/docs/api-reference/threads/object) is created.
 */
export interface ThreadStreamEvent { 
  /**
   * Whether to enable input audio transcription.
   */
  enabled?: boolean;
  event: ThreadStreamEvent.EventEnum;
  data: ThreadObject;
}
export namespace ThreadStreamEvent {
  export const EventEnum = {
    ThreadCreated: 'thread.created'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


