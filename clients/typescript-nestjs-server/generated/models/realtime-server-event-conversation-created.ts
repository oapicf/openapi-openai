import { RealtimeServerEventConversationCreatedConversation } from './realtime-server-event-conversation-created-conversation';


/**
 * Returned when a conversation is created. Emitted right after session creation. 
 */
export interface RealtimeServerEventConversationCreated { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `conversation.created`.
   */
  type: RealtimeServerEventConversationCreated.TypeEnum;
  conversation: RealtimeServerEventConversationCreatedConversation;
}
export namespace RealtimeServerEventConversationCreated {
  export const TypeEnum = {
    ConversationCreated: 'conversation.created'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


