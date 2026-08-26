import { RunStepObject } from './run-step-object';


/**
 * Occurs when a [run step](/docs/api-reference/run-steps/step-object) is created.
 */
export interface RunStepStreamEventOneOf { 
  event: RunStepStreamEventOneOf.EventEnum;
  data: RunStepObject;
}
export namespace RunStepStreamEventOneOf {
  export const EventEnum = {
    ThreadRunStepCreated: 'thread.run.step.created'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


