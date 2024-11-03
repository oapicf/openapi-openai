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
import { RunStepObject } from './runStepObject';


/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) is created.
 */
export interface RunStepStreamEventOneOf { 
    event: RunStepStreamEventOneOf.EventEnum;
    data: RunStepObject;
}
export namespace RunStepStreamEventOneOf {
    export type EventEnum = 'thread.run.step.created';
    export const EventEnum = {
        ThreadRunStepCreated: 'thread.run.step.created' as EventEnum
    }
}
