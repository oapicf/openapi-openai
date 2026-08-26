import { RunObject } from './run-object';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 */
export interface RunStreamEventOneOf3 { 
  event: RunStreamEventOneOf3.EventEnum;
  data: RunObject;
}
export namespace RunStreamEventOneOf3 {
  export const EventEnum = {
    ThreadRunRequiresAction: 'thread.run.requires_action'
  } as const;
  export type EventEnum = typeof EventEnum[keyof typeof EventEnum];
}


