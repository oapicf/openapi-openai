/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RunStepDeltaStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDeltaStepDetailsMessageCreationObjectMessageCreation';
import { HttpFile } from '../http/http';

/**
* Details of the message creation by the run step.
*/
export class RunStepDeltaStepDetailsMessageCreationObject {
    /**
    * Always `message_creation`.
    */
    'type': RunStepDeltaStepDetailsMessageCreationObjectTypeEnum;
    'messageCreation'?: RunStepDeltaStepDetailsMessageCreationObjectMessageCreation;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepDeltaStepDetailsMessageCreationObjectTypeEnum",
            "format": ""
        },
        {
            "name": "messageCreation",
            "baseName": "message_creation",
            "type": "RunStepDeltaStepDetailsMessageCreationObjectMessageCreation",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDeltaStepDetailsMessageCreationObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum RunStepDeltaStepDetailsMessageCreationObjectTypeEnum {
    MessageCreation = 'message_creation'
}

