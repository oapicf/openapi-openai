import { RunStepDetailsToolCallsFunctionObjectFunction } from './run-step-details-tool-calls-function-object-function';


export interface RunStepDetailsToolCallsFunctionObject { 
  /**
   * The ID of the tool call object.
   */
  id: string;
  /**
   * The type of tool call. This is always going to be `function` for this type of tool call.
   */
  type: RunStepDetailsToolCallsFunctionObject.TypeEnum;
  'function': RunStepDetailsToolCallsFunctionObjectFunction;
}
export namespace RunStepDetailsToolCallsFunctionObject {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


