import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 */
export interface RunStreamEventOneOf2 { 
  event: RunStreamEventOneOf2.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf2 {
  export const EventEnum = {
    ThreadRunInProgress: 'thread.run.in_progress'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


