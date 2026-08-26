import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) is completed.
 */
export interface RunStreamEventOneOf4 { 
  event: RunStreamEventOneOf4.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf4 {
  export const EventEnum = {
    ThreadRunCompleted: 'thread.run.completed'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


