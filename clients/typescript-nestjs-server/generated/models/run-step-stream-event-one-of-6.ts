import { RunStepObject } from './run-step-object';


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) expires.
 */
export interface RunStepStreamEventOneOf6 { 
  event: RunStepStreamEventOneOf6.EventEnum;
  data: RunStepObject;
}
export namespace RunStepStreamEventOneOf6 {
  export const EventEnum = {
    ThreadRunStepExpired: 'thread.run.step.expired'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


