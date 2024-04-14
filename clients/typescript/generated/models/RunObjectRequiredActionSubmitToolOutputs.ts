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

import { RunToolCallObject } from '../models/RunToolCallObject';
import { HttpFile } from '../http/http';

/**
* Details on the tool outputs needed for this run to continue.
*/
export class RunObjectRequiredActionSubmitToolOutputs {
    /**
    * A list of the relevant tool calls.
    */
    'toolCalls': Array<RunToolCallObject>;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "toolCalls",
            "baseName": "tool_calls",
            "type": "Array<RunToolCallObject>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunObjectRequiredActionSubmitToolOutputs.attributeTypeMap;
    }

    public constructor() {
    }
}

