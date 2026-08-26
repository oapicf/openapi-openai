

export interface RunStepDetailsToolCallsFileSearchResultObjectContentInner { 
  /**
   * The type of the content.
   */
  type?: RunStepDetailsToolCallsFileSearchResultObjectContentInner.TypeEnum;
  /**
   * The text content of the file.
   */
  text?: string;
}
export namespace RunStepDetailsToolCallsFileSearchResultObjectContentInner {
  export const TypeEnum = {
    Text: 'text'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


