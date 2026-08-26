import { RunStepDeltaObject } from './run-step-delta-object';


/**
 * Occurs when parts of a [run step](/docs/api-reference/run-steps/step-object) are being streamed.
 */
export interface RunStepStreamEventOneOf2 { 
  event: RunStepStreamEventOneOf2.EventEnum;
  data: RunStepDeltaObject;
}
export namespace RunStepStreamEventOneOf2 {
  export const EventEnum = {
    ThreadRunStepDelta: 'thread.run.step.delta'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


