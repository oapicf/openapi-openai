

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
export interface RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject { 
  /**
   * The index of the output in the outputs array.
   */
  index: number;
  /**
   * Always `logs`.
   */
  type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum;
  /**
   * The text output from the Code Interpreter tool call.
   */
  logs?: string;
}
export namespace RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
  export const TypeEnum = {
    Logs: 'logs'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


