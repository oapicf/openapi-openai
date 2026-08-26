import { MessageObject } from './message-object';


/**
 * Occurs when a [message](/docs/api-reference/messages/object) ends before it is completed.
 */
export interface MessageStreamEventOneOf4 { 
  event: MessageStreamEventOneOf4.EventEnum;
  data: MessageObject;
}
export namespace MessageStreamEventOneOf4 {
  export const EventEnum = {
    ThreadMessageIncomplete: 'thread.message.incomplete'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


