import { RunToolCallObject } from './run-tool-call-object';


/**
 * Details on the tool outputs needed for this run to continue.
 */
export interface RunObjectRequiredActionSubmitToolOutputs { 
  /**
   * A list of the relevant tool calls.
   */
  tool_calls: Array<RunToolCallObject>;
}

