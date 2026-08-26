import { RunStepObject } from './run-step-object';


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) moves to an `in_progress` state.
 */
export interface RunStepStreamEventOneOf1 { 
  event: RunStepStreamEventOneOf1.EventEnum;
  data: RunStepObject;
}
export namespace RunStepStreamEventOneOf1 {
  export const EventEnum = {
    ThreadRunStepInProgress: 'thread.run.step.in_progress'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


