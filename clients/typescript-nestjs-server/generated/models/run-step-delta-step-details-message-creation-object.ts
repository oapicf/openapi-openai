import { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from './run-step-delta-step-details-message-creation-object-message-creation';


/**
 * Details of the message creation by the run step.
 */
export interface RunStepDeltaStepDetailsMessageCreationObject { 
  /**
   * Always `message_creation`.
   */
  type: RunStepDeltaStepDetailsMessageCreationObject.TypeEnum;
  message_creation?: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
}
export namespace RunStepDeltaStepDetailsMessageCreationObject {
  export const TypeEnum = {
    MessageCreation: 'message_creation'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


