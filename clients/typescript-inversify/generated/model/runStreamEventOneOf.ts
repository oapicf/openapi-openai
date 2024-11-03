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
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 */
export interface RunStreamEventOneOf { 
    event: RunStreamEventOneOf.EventEnum;
    data: RunObject;
}
export namespace RunStreamEventOneOf {
    export type EventEnum = 'thread.run.created';
    export const EventEnum = {
        ThreadRunCreated: 'thread.run.created' as EventEnum
    }
}
