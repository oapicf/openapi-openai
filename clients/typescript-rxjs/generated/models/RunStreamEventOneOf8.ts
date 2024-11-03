// tslint:disable
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

import type {
    RunObject,
} from './';

/**
 * Occurs when a [run](/docs/api-reference/runs/object) expires.
 * @export
 * @interface RunStreamEventOneOf8
 */
export interface RunStreamEventOneOf8 {
    /**
     * @type {string}
     * @memberof RunStreamEventOneOf8
     */
    event: RunStreamEventOneOf8EventEnum;
    /**
     * @type {RunObject}
     * @memberof RunStreamEventOneOf8
     */
    data: RunObject;
}

/**
 * @export
 * @enum {string}
 */
export enum RunStreamEventOneOf8EventEnum {
    ThreadRunExpired = 'thread.run.expired'
}

