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

import * as models from './models';

/**
 * Occurs when a [run](/docs/api-reference/runs/object) moves to an `in_progress` status.
 */
export interface RunStreamEventOneOf2 {
    event: RunStreamEventOneOf2.EventEnum;

    data: models.RunObject;

}
export namespace RunStreamEventOneOf2 {
    export enum EventEnum {
        ThreadRunInProgress = <any> 'thread.run.in_progress'
    }
}