import { RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner } from './run-step-details-tool-calls-code-object-code-interpreter-outputs-inner';


/**
 * The Code Interpreter tool call definition.
 */
export interface RunStepDetailsToolCallsCodeObjectCodeInterpreter { 
  /**
   * The input to the Code Interpreter tool call.
   */
  input: string;
  /**
   * The outputs from the Code Interpreter tool call. Code Interpreter can output one or more items, including text (`logs`) or images (`image`). Each of these are represented by a different object type.
   */
  outputs: Array<RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner>;
}

