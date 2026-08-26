import { MessageDeltaObject } from './message-delta-object';


/**
 * Occurs when parts of a [Message](/docs/api-reference/messages/object) are being streamed.
 */
export interface MessageStreamEventOneOf2 { 
  event: MessageStreamEventOneOf2.EventEnum;
  data: MessageDeltaObject;
}
export namespace MessageStreamEventOneOf2 {
  export const EventEnum = {
    ThreadMessageDelta: 'thread.message.delta'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


