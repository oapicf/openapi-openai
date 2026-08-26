

/**
 * An object describing text to classify.
 */
export interface CreateModerationRequestInputOneOfInnerOneOf1 { 
  /**
   * Always `text`.
   */
  type: CreateModerationRequestInputOneOfInnerOneOf1.TypeEnum;
  /**
   * A string of text to classify.
   */
  text: string;
}
export namespace CreateModerationRequestInputOneOfInnerOneOf1 {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


