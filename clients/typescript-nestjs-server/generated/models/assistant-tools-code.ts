

export interface AssistantToolsCode { 
  /**
   * The type of tool being defined: `code_interpreter`
   */
  type: AssistantToolsCode.TypeEnum;
}
export namespace AssistantToolsCode {
  export const TypeEnum = {
    CodeInterpreter: 'code_interpreter'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


