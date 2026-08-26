import { MessageObject } from './message-object';


/**
 * Occurs when a [message](/docs/api-reference/messages/object) is completed.
 */
export interface MessageStreamEventOneOf3 { 
  event: MessageStreamEventOneOf3.EventEnum;
  data: MessageObject;
}
export namespace MessageStreamEventOneOf3 {
  export const EventEnum = {
    ThreadMessageCompleted: 'thread.message.completed'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


