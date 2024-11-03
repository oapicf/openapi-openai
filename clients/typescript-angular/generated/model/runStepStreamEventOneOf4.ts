/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { RunStepObject } from './runStepObject';


/**
 * Occurs when a [run step](/docs/api-reference/runs/step-object) fails.
 */
export interface RunStepStreamEventOneOf4 { 
    event: RunStepStreamEventOneOf4.EventEnum;
    data: RunStepObject;
}
export namespace RunStepStreamEventOneOf4 {
    export type EventEnum = 'thread.run.step.failed';
    export const EventEnum = {
        ThreadRunStepFailed: 'thread.run.step.failed' as EventEnum
    };
}


