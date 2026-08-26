import { RunStepObject } from './run-step-object';


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) fails.
 */
export interface RunStepStreamEventOneOf4 { 
  event: RunStepStreamEventOneOf4.EventEnum;
  data: RunStepObject;
}
export namespace RunStepStreamEventOneOf4 {
  export const EventEnum = {
    ThreadRunStepFailed: 'thread.run.step.failed'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


