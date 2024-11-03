/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RunStepDetailsMessageCreationObject } from '../models/RunStepDetailsMessageCreationObject';
import { RunStepDetailsToolCallsObject } from '../models/RunStepDetailsToolCallsObject';
import { HttpFile } from '../http/http';

/**
* The details of the run step.
*/
/**
 * @type RunStepObjectStepDetails
 * Type
 * @export
 */
export type RunStepObjectStepDetails = RunStepDetailsMessageCreationObject | RunStepDetailsToolCallsObject;

/**
* @type RunStepObjectStepDetailsClass
    * The details of the run step.
* @export
*/
export class RunStepObjectStepDetailsClass {
    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;
}

