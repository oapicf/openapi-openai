

/**
 * Occurs when a stream ends.
 */
export interface DoneEvent { 
  event: DoneEvent.EventEnum;
  data: DoneEvent.DataEnum;
}
export namespace DoneEvent {
  export const EventEnum = {
    Done: 'done'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
  export const DataEnum = {
    Done: '[DONE]'
  } as const;
  export type DataEnum = typeof DataEnum[keyof typeof DataEnum];
}


