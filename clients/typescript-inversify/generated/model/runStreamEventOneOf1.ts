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
import { RunObject } from './runObject';


/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `queued` status.
 */
export interface RunStreamEventOneOf1 { 
    event: RunStreamEventOneOf1.EventEnum;
    data: RunObject;
}
export namespace RunStreamEventOneOf1 {
    export type EventEnum = 'thread.run.queued';
    export const EventEnum = {
        ThreadRunQueued: 'thread.run.queued' as EventEnum
    }
}
