/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
import type { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from './RunStepDeltaStepDetailsMessageCreationObjectMessageCreation';
import {
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreationFromJSON,
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreationFromJSONTyped,
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreationToJSON,
    RunStepDeltaStepDetailsMessageCreationObjectMessageCreationToJSONTyped,
} from './RunStepDeltaStepDetailsMessageCreationObjectMessageCreation';

/**
 * Details of the message creation by the run step.
 * @export
 * @interface RunStepDeltaStepDetailsMessageCreationObject
 */
export interface RunStepDeltaStepDetailsMessageCreationObject {
    /**
     * Always `message_creation`.
     * @type {string}
     * @memberof RunStepDeltaStepDetailsMessageCreationObject
     */
    type: RunStepDeltaStepDetailsMessageCreationObjectTypeEnum;
    /**
     * 
     * @type {RunStepDeltaStepDetailsMessageCreationObjectMessageCreation}
     * @memberof RunStepDeltaStepDetailsMessageCreationObject
     */
    messageCreation?: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;
}


/**
 * @export
 */
export const RunStepDeltaStepDetailsMessageCreationObjectTypeEnum = {
    MessageCreation: 'message_creation'
} as const;
export type RunStepDeltaStepDetailsMessageCreationObjectTypeEnum = typeof RunStepDeltaStepDetailsMessageCreationObjectTypeEnum[keyof typeof RunStepDeltaStepDetailsMessageCreationObjectTypeEnum];


/**
 * Check if a given object implements the RunStepDeltaStepDetailsMessageCreationObject interface.
 */
export function instanceOfRunStepDeltaStepDetailsMessageCreationObject(value: object): value is RunStepDeltaStepDetailsMessageCreationObject {
    if (!('type' in value) || value['type'] === undefined) return false;
    return true;
}

export function RunStepDeltaStepDetailsMessageCreationObjectFromJSON(json: any): RunStepDeltaStepDetailsMessageCreationObject {
    return RunStepDeltaStepDetailsMessageCreationObjectFromJSONTyped(json, false);
}

export function RunStepDeltaStepDetailsMessageCreationObjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): RunStepDeltaStepDetailsMessageCreationObject {
    if (json == null) {
        return json;
    }
    return {
        
        'type': json['type'],
        'messageCreation': json['message_creation'] == null ? undefined : RunStepDeltaStepDetailsMessageCreationObjectMessageCreationFromJSON(json['message_creation']),
    };
}

  export function RunStepDeltaStepDetailsMessageCreationObjectToJSON(json: any): RunStepDeltaStepDetailsMessageCreationObject {
      return RunStepDeltaStepDetailsMessageCreationObjectToJSONTyped(json, false);
  }

  export function RunStepDeltaStepDetailsMessageCreationObjectToJSONTyped(value?: RunStepDeltaStepDetailsMessageCreationObject | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'type': value['type'],
        'message_creation': RunStepDeltaStepDetailsMessageCreationObjectMessageCreationToJSON(value['messageCreation']),
    };
}

