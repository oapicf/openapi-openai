

/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
export interface RunStepDetailsToolCallsCodeOutputLogsObject { 
  /**
   * Always `logs`.
   */
  type: RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum;
  /**
   * The text output from the Code Interpreter tool call.
   */
  logs: string;
}
export namespace RunStepDetailsToolCallsCodeOutputLogsObject {
  export const TypeEnum = {
    Logs: 'logs'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


