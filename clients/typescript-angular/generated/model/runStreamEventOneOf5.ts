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
 * Occurs when a [run](/docs/api-reference/runs/object) fails.
 */
export interface RunStreamEventOneOf5 { 
    event: RunStreamEventOneOf5.EventEnum;
    data: RunObject;
}
export namespace RunStreamEventOneOf5 {
    export type EventEnum = 'thread.run.failed';
    export const EventEnum = {
        ThreadRunFailed: 'thread.run.failed' as EventEnum
    };
}


