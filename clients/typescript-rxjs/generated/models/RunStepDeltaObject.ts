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
    RunStepDeltaObjectDelta,
} from './';

/**
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 * @export
 * @interface RunStepDeltaObject
 */
export interface RunStepDeltaObject {
    /**
     * The identifier of the run step, which can be referenced in API endpoints.
     * @type {string}
     * @memberof RunStepDeltaObject
     */
    id: string;
    /**
     * The object type, which is always `thread.run.step.delta`.
     * @type {string}
     * @memberof RunStepDeltaObject
     */
    object: RunStepDeltaObjectObjectEnum;
    /**
     * @type {RunStepDeltaObjectDelta}
     * @memberof RunStepDeltaObject
     */
    delta: RunStepDeltaObjectDelta;
}

/**
 * @export
 * @enum {string}
 */
export enum RunStepDeltaObjectObjectEnum {
    ThreadRunStepDelta = 'thread.run.step.delta'
}

