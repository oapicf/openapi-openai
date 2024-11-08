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

import { RunStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDetailsMessageCreationObjectMessageCreation';
import { HttpFile } from '../http/http';

/**
* Details of the message creation by the run step.
*/
export class RunStepDetailsMessageCreationObject {
    /**
    * Always `message_creation`.
    */
    'type': RunStepDetailsMessageCreationObjectTypeEnum;
    'messageCreation': RunStepDetailsMessageCreationObjectMessageCreation;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepDetailsMessageCreationObjectTypeEnum",
            "format": ""
        },
        {
            "name": "messageCreation",
            "baseName": "message_creation",
            "type": "RunStepDetailsMessageCreationObjectMessageCreation",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepDetailsMessageCreationObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum RunStepDetailsMessageCreationObjectTypeEnum {
    MessageCreation = 'message_creation'
}

