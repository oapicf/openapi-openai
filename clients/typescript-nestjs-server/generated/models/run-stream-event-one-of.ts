import { RunObject } from './run-object';


/**
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 */
export interface RunStreamEventOneOf { 
  event: RunStreamEventOneOf.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf {
  export const EventEnum = {
    ThreadRunCreated: 'thread.run.created'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


