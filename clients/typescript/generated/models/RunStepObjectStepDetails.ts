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

import { RunStepDetailsMessageCreationObject } from '../models/RunStepDetailsMessageCreationObject';
import { RunStepDetailsMessageCreationObjectMessageCreation } from '../models/RunStepDetailsMessageCreationObjectMessageCreation';
import { RunStepDetailsToolCallsObject } from '../models/RunStepDetailsToolCallsObject';
import { RunStepDetailsToolCallsObjectToolCallsInner } from '../models/RunStepDetailsToolCallsObjectToolCallsInner';
import { HttpFile } from '../http/http';

/**
* The details of the run step.
*/
export class RunStepObjectStepDetails {
    /**
    * Always `message_creation`.
    */
    'type': RunStepObjectStepDetailsTypeEnum;
    'messageCreation': RunStepDetailsMessageCreationObjectMessageCreation;
    /**
    * An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 
    */
    'toolCalls': Array<RunStepDetailsToolCallsObjectToolCallsInner>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepObjectStepDetailsTypeEnum",
            "format": ""
        },
        {
            "name": "messageCreation",
            "baseName": "message_creation",
            "type": "RunStepDetailsMessageCreationObjectMessageCreation",
            "format": ""
        },
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<RunStepDetailsToolCallsObjectToolCallsInner>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepObjectStepDetails.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum RunStepObjectStepDetailsTypeEnum {
    MessageCreation = 'message_creation',
    ToolCalls = 'tool_calls'
}
