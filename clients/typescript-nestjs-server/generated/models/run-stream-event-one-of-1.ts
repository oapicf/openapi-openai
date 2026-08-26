import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 */
export interface RunStreamEventOneOf1 { 
  event: RunStreamEventOneOf1.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf1 {
  export const EventEnum = {
    ThreadRunQueued: 'thread.run.queued'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


