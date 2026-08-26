import { RunStepObject } from './run-step-object';


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is completed.
 */
export interface RunStepStreamEventOneOf3 { 
  event: RunStepStreamEventOneOf3.EventEnum;
  data: RunStepObject;
}
export namespace RunStepStreamEventOneOf3 {
  export const EventEnum = {
    ThreadRunStepCompleted: 'thread.run.step.completed'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


