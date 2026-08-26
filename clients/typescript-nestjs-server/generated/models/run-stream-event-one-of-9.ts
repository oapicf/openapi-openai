import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 */
export interface RunStreamEventOneOf9 { 
  event: RunStreamEventOneOf9.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf9 {
  export const EventEnum = {
    ThreadRunExpired: 'thread.run.expired'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


