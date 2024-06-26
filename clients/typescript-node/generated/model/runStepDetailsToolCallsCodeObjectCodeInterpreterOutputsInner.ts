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

import { RequestFile } from './models';
import { RunStepDetailsToolCallsCodeOutputImageObject } from './runStepDetailsToolCallsCodeOutputImageObject';
import { RunStepDetailsToolCallsCodeOutputImageObjectImage } from './runStepDetailsToolCallsCodeOutputImageObjectImage';
import { RunStepDetailsToolCallsCodeOutputLogsObject } from './runStepDetailsToolCallsCodeOutputLogsObject';

export class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    /**
    * Always `logs`.
    */
    'type': RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum;
    /**
    * The text output from the Code Interpreter tool call.
    */
    'logs': string;
    'image': RunStepDetailsToolCallsCodeOutputImageObjectImage;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.TypeEnum"
        },
        {
            "name": "logs",
            "baseName": "logs",
            "type": "string"
        },
        {
            "name": "image",
            "baseName": "image",
            "type": "RunStepDetailsToolCallsCodeOutputImageObjectImage"
        }    ];

    static getAttributeTypeMap() {
        return RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner.attributeTypeMap;
    }
}

export namespace RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner {
    export enum TypeEnum {
        Logs = <any> 'logs',
        Image = <any> 'image'
    }
}
