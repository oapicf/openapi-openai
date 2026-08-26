import { RunObjectRequiredActionSubmitToolOutputs } from './run-object-required-action-submit-tool-outputs';


/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 */
export interface RunObjectRequiredAction { 
  /**
   * For now, this is always `submit_tool_outputs`.
   */
  type: RunObjectRequiredAction.TypeEnum;
  submit_tool_outputs: RunObjectRequiredActionSubmitToolOutputs;
}
export namespace RunObjectRequiredAction {
  export const TypeEnum = {
    SubmitToolOutputs: 'submit_tool_outputs'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


