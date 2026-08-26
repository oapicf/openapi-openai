import { MessageDeltaObjectDeltaContentInner } from './message-delta-object-delta-content-inner';


/**
 * The delta containing the fields that have changed on the Message.
 */
export interface MessageDeltaObjectDelta { 
  /**
   * The entity that produced the message. One of `user` or `assistant`.
   */
  role?: MessageDeltaObjectDelta.RoleEnum;
  /**
   * The content of the message in array of text and/or images.
   */
  content?: Array<MessageDeltaObjectDeltaContentInner>;
}
export namespace MessageDeltaObjectDelta {
  export const RoleEnum = {
    User: 'user',
    Assistant: 'assistant'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


