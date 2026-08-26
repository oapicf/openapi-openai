import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `cancelling` status.
 */
export interface RunStreamEventOneOf7 { 
  event: RunStreamEventOneOf7.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf7 {
  export const EventEnum = {
    ThreadRunCancelling: 'thread.run.cancelling'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


