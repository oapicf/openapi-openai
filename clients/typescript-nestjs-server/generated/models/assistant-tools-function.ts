import { FunctionObject } from './function-object';


export interface AssistantToolsFunction { 
  /**
   * The type of tool being defined: `function`
   */
  type: AssistantToolsFunction.TypeEnum;
  'function': FunctionObject;
}
export namespace AssistantToolsFunction {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


