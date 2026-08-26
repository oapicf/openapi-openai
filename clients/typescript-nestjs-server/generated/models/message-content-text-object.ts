import { MessageContentTextObjectText } from './message-content-text-object-text';


/**
 * The text content that is part of a message.
 */
export interface MessageContentTextObject { 
  /**
   * Always `text`.
   */
  type: MessageContentTextObject.TypeEnum;
  text: MessageContentTextObjectText;
}
export namespace MessageContentTextObject {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


