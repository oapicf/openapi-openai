import { MessageDeltaContentTextObjectText } from './message-delta-content-text-object-text';


/**
 * The text content that is part of a message.
 */
export interface MessageDeltaContentTextObject { 
  /**
   * The index of the content part in the message.
   */
  index: number;
  /**
   * Always `text`.
   */
  type: MessageDeltaContentTextObject.TypeEnum;
  text?: MessageDeltaContentTextObjectText;
}
export namespace MessageDeltaContentTextObject {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


