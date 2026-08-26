

export interface ResponseFormatText { 
  /**
   * The type of response format being defined: `text`
   */
  type: ResponseFormatText.TypeEnum;
}
export namespace ResponseFormatText {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


