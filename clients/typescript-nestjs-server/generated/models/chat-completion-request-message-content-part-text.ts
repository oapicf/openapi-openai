

/**
 * Learn about [text inputs](/docs/guides/text-generation). 
 */
export interface ChatCompletionRequestMessageContentPartText { 
  /**
   * The type of the content part.
   */
  type: ChatCompletionRequestMessageContentPartText.TypeEnum;
  /**
   * The text content.
   */
  text: string;
}
export namespace ChatCompletionRequestMessageContentPartText {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


