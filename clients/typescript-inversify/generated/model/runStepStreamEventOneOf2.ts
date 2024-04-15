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
import { RunStepDeltaObject } from './runStepDeltaObject';


/**
 * Occurs when parts of a [run step](/docs/api-reference/runs/step-object) are being streamed.
 */
export interface RunStepStreamEventOneOf2 { 
    event: RunStepStreamEventOneOf2.EventEnum;
    data: RunStepDeltaObject;
}
export namespace RunStepStreamEventOneOf2 {
    export type EventEnum = 'thread.run.step.delta';
    export const EventEnum = {
        ThreadRunStepDelta: 'thread.run.step.delta' as EventEnum
    }
}