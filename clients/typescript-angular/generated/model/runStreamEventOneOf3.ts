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
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
 */
export interface RunStreamEventOneOf3 { 
    event: RunStreamEventOneOf3.EventEnum;
    data: RunObject;
}
export namespace RunStreamEventOneOf3 {
    export type EventEnum = 'thread.run.requires_action';
    export const EventEnum = {
        ThreadRunRequiresAction: 'thread.run.requires_action' as EventEnum
    };
}


