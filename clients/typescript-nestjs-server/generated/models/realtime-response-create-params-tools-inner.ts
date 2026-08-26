

export interface RealtimeResponseCreateParamsToolsInner { 
  /**
   * The type of the tool, i.e. `function`.
   */
  type?: RealtimeResponseCreateParamsToolsInner.TypeEnum;
  /**
   * The name of the function.
   */
  name?: string;
  /**
   * The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
   */
  description?: string;
  /**
   * Parameters of the function in JSON Schema.
   */
  parameters?: object;
}
export namespace RealtimeResponseCreateParamsToolsInner {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


