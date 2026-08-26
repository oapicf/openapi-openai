

/**
 * The refusal content that is part of a message.
 */
export interface MessageDeltaContentRefusalObject { 
  /**
   * The index of the refusal part in the message.
   */
  index: number;
  /**
   * Always `refusal`.
   */
  type: MessageDeltaContentRefusalObject.TypeEnum;
  refusal?: string;
}
export namespace MessageDeltaContentRefusalObject {
  export const TypeEnum = {
    Refusal: 'refusal'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


