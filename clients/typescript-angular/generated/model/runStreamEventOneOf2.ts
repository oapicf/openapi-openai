/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { RunObject } from './runObject';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 */
export interface RunStreamEventOneOf2 { 
    event: RunStreamEventOneOf2.EventEnum;
    data: RunObject;
}
export namespace RunStreamEventOneOf2 {
    export type EventEnum = 'thread.run.in_progress';
    export const EventEnum = {
        ThreadRunInProgress: 'thread.run.in_progress' as EventEnum
    };
}


