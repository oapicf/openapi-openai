import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) ends with status `incomplete`.
 */
export interface RunStreamEventOneOf5 { 
  event: RunStreamEventOneOf5.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf5 {
  export const EventEnum = {
    ThreadRunIncomplete: 'thread.run.incomplete'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


