import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 */
export interface RunStreamEventOneOf6 { 
  event: RunStreamEventOneOf6.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf6 {
  export const EventEnum = {
    ThreadRunFailed: 'thread.run.failed'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


