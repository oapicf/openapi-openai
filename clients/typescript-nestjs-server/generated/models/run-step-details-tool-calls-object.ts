import { RunStepDetailsToolCallsObjectToolCallsInner } from './run-step-details-tool-calls-object-tool-calls-inner';


/**
 * Details of the tool call.
 */
export interface RunStepDetailsToolCallsObject { 
  /**
   * Always `tool_calls`.
   */
  type: RunStepDetailsToolCallsObject.TypeEnum;
  /**
   * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
   */
  tool_calls: Array<RunStepDetailsToolCallsObjectToolCallsInner>;
}
export namespace RunStepDetailsToolCallsObject {
  export const TypeEnum = {
    ToolCalls: 'tool_calls'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


