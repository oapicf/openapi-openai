import { RunStepDetailsToolCallsObject } from './run-step-details-tool-calls-object';
import { RunStepDetailsToolCallsObjectToolCallsInner } from './run-step-details-tool-calls-object-tool-calls-inner';
import { RunStepDetailsMessageCreationObject } from './run-step-details-message-creation-object';
import { RunStepDetailsMessageCreationObjectMessageCreation } from './run-step-details-message-creation-object-message-creation';


/**
 * The details of the run step.
 */
/**
 * @type RunStepObjectStepDetails
 * The details of the run step.
 * @export
 */
export type RunStepObjectStepDetails = RunStepDetailsMessageCreationObject | RunStepDetailsToolCallsObject;

