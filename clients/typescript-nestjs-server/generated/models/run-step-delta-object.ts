import { RunStepDeltaObjectDelta } from './run-step-delta-object-delta';


/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */
export interface RunStepDeltaObject { 
  /**
   * The identifier of the run step, which can be referenced in API endpoints.
   */
  id: string;
  /**
   * The object type, which is always `thread.run.step.delta`.
   */
  object: RunStepDeltaObject.ObjectEnum;
  delta: RunStepDeltaObjectDelta;
}
export namespace RunStepDeltaObject {
  export const ObjectEnum = {
    ThreadRunStepDelta: 'thread.run.step.delta'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


