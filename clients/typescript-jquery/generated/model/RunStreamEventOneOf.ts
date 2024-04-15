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
 * Occurs when a new [run](/docs/api-reference/runs/object) is created.
 */
export interface RunStreamEventOneOf {
    event: RunStreamEventOneOf.EventEnum;

    data: models.RunObject;

}
export namespace RunStreamEventOneOf {
    export enum EventEnum {
        ThreadRunCreated = <any> 'thread.run.created'
    }
}