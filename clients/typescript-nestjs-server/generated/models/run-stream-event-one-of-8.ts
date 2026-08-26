import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) is cancelled.
 */
export interface RunStreamEventOneOf8 { 
  event: RunStreamEventOneOf8.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf8 {
  export const EventEnum = {
    ThreadRunCancelled: 'thread.run.cancelled'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


