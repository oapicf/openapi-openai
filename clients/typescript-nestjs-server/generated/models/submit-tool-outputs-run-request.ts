import { SubmitToolOutputsRunRequestToolOutputsInner } from './submit-tool-outputs-run-request-tool-outputs-inner';


export interface SubmitToolOutputsRunRequest { 
  /**
   * A list of tools for which the outputs are being submitted.
   */
  tool_outputs: Array<SubmitToolOutputsRunRequestToolOutputsInner>;
  /**
   * If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
   */
  stream?: boolean | null;
}

