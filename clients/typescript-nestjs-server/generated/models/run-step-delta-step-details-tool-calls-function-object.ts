import { RunStepDeltaStepDetailsToolCallsFunctionObjectFunction } from './run-step-delta-step-details-tool-calls-function-object-function';


export interface RunStepDeltaStepDetailsToolCallsFunctionObject { 
  /**
   * The index of the tool call in the tool calls array.
   */
  index: number;
  /**
   * The ID of the tool call object.
   */
  id?: string;
  /**
   * The type of tool call. This is always going to be `function` for this type of tool call.
   */
  type: RunStepDeltaStepDetailsToolCallsFunctionObject.TypeEnum;
  'function'?: RunStepDeltaStepDetailsToolCallsFunctionObjectFunction;
}
export namespace RunStepDeltaStepDetailsToolCallsFunctionObject {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


