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
    RunStepDetailsMessageCreationObjectMessageCreation,
} from './';

/**
 * Details of the message creation by the run step.
 * @export
 * @interface RunStepDetailsMessageCreationObject
 */
export interface RunStepDetailsMessageCreationObject {
    /**
     * Always `message_creation`.
     * @type {string}
     * @memberof RunStepDetailsMessageCreationObject
     */
    type: RunStepDetailsMessageCreationObjectTypeEnum;
    /**
     * @type {RunStepDetailsMessageCreationObjectMessageCreation}
     * @memberof RunStepDetailsMessageCreationObject
     */
    message_creation: RunStepDetailsMessageCreationObjectMessageCreation;
}

/**
 * @export
 * @enum {string}
 */
export enum RunStepDetailsMessageCreationObjectTypeEnum {
    MessageCreation = 'message_creation'
}

