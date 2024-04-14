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
    RunStepDeltaObjectDeltaStepDetails,
} from './';

/**
 * The delta containing the fields that have changed on the run step.
 * @export
 * @interface RunStepDeltaObjectDelta
 */
export interface RunStepDeltaObjectDelta {
    /**
     * @type {RunStepDeltaObjectDeltaStepDetails}
     * @memberof RunStepDeltaObjectDelta
     */
    step_details?: RunStepDeltaObjectDeltaStepDetails;
}
