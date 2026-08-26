import { MessageObject } from './message-object';


/**
 * Occurs when a [message](/docs/api-reference/messages/object) is created.
 */
export interface MessageStreamEventOneOf { 
  event: MessageStreamEventOneOf.EventEnum;
  data: MessageObject;
}
export namespace MessageStreamEventOneOf {
  export const EventEnum = {
    ThreadMessageCreated: 'thread.message.created'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


