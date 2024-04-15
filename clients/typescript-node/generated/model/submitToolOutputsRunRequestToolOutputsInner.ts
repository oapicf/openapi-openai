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

export class SubmitToolOutputsRunRequestToolOutputsInner {
    /**
    * The ID of the tool call in the `required_action` object within the run object the output is being submitted for.
    */
    'toolCallId'?: string;
    /**
    * The output of the tool call to be submitted to continue the run.
    */
    'output'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "toolCallId",
            "baseName": "tool_call_id",
            "type": "string"
        },
        {
            "name": "output",
            "baseName": "output",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return SubmitToolOutputsRunRequestToolOutputsInner.attributeTypeMap;
    }
}
