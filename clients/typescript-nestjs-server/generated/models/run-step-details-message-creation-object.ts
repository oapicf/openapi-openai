import { RunStepDetailsMessageCreationObjectMessageCreation } from './run-step-details-message-creation-object-message-creation';


/**
 * Details of the message creation by the run step.
 */
export interface RunStepDetailsMessageCreationObject { 
  /**
   * Always `message_creation`.
   */
  type: RunStepDetailsMessageCreationObject.TypeEnum;
  message_creation: RunStepDetailsMessageCreationObjectMessageCreation;
}
export namespace RunStepDetailsMessageCreationObject {
  export const TypeEnum = {
    MessageCreation: 'message_creation'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


