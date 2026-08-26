

/**
 * The text content that is part of a message.
 */
export interface MessageRequestContentTextObject { 
  /**
   * Always `text`.
   */
  type: MessageRequestContentTextObject.TypeEnum;
  /**
   * Text content to be sent to the model
   */
  text: string;
}
export namespace MessageRequestContentTextObject {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


