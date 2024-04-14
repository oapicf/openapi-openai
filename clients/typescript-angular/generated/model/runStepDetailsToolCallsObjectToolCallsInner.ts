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
import { RunStepDetailsToolCallsRetrievalObject } from './runStepDetailsToolCallsRetrievalObject';
import { RunStepDetailsToolCallsCodeObjectCodeInterpreter } from './runStepDetailsToolCallsCodeObjectCodeInterpreter';
import { RunStepDetailsToolCallsFunctionObject } from './runStepDetailsToolCallsFunctionObject';
import { RunStepDetailsToolCallsFunctionObjectFunction } from './runStepDetailsToolCallsFunctionObjectFunction';
import { RunStepDetailsToolCallsCodeObject } from './runStepDetailsToolCallsCodeObject';


/**
 * @type RunStepDetailsToolCallsObjectToolCallsInner
 * @export
 */
export type RunStepDetailsToolCallsObjectToolCallsInner = RunStepDetailsToolCallsCodeObject | RunStepDetailsToolCallsFunctionObject | RunStepDetailsToolCallsRetrievalObject;

