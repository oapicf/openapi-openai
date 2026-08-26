import { RunStepObject } from './run-step-object';


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is cancelled.
 */
export interface RunStepStreamEventOneOf5 { 
  event: RunStepStreamEventOneOf5.EventEnum;
  data: RunStepObject;
}
export namespace RunStepStreamEventOneOf5 {
  export const EventEnum = {
    ThreadRunStepCancelled: 'thread.run.step.cancelled'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


