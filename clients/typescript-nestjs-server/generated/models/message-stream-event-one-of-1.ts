import { MessageObject } from './message-object';


/**
 * Occurs when a [message](/docs/api-reference/messages/object) moves to an `in_progress` state.
 */
export interface MessageStreamEventOneOf1 { 
  event: MessageStreamEventOneOf1.EventEnum;
  data: MessageObject;
}
export namespace MessageStreamEventOneOf1 {
  export const EventEnum = {
    ThreadMessageInProgress: 'thread.message.in_progress'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


