import { RealtimeConversationItem } from './realtime-conversation-item';


/**
 * Returned when an Item is done streaming. Also emitted when a Response is  interrupted, incomplete, or cancelled. 
 */
export interface RealtimeServerEventResponseOutputItemDone { 
  /**
   * The unique ID of the server event.
   */
  event_id: string;
  /**
   * The event type, must be `response.output_item.done`.
   */
  type: RealtimeServerEventResponseOutputItemDone.TypeEnum;
  /**
   * The ID of the Response to which the item belongs.
   */
  response_id: string;
  /**
   * The index of the output item in the Response.
   */
  output_index: number;
  item: RealtimeConversationItem;
}
export namespace RealtimeServerEventResponseOutputItemDone {
  export const TypeEnum = {
    ResponseOutputItemDone: 'response.output_item.done'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


