import { FunctionObject } from './function-object';


export interface ChatCompletionTool { 
  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  type: ChatCompletionTool.TypeEnum;
  'function': FunctionObject;
}
export namespace ChatCompletionTool {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


