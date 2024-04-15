// tslint:disable
/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import type {
    RunStepDeltaStepDetailsMessageCreationObject,
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreation,
    RunStepDeltaStepDetailsToolCallsObject,
    RunStepDeltaStepDetailsToolCallsObjectToolCallsInner,
} from './';

/**
 * @type RunStepDeltaObjectDeltaStepDetails
 * The details of the run step.
 * @export
 */
export type RunStepDeltaObjectDeltaStepDetails = RunStepDeltaStepDetailsMessageCreationObject | RunStepDeltaStepDetailsToolCallsObject;