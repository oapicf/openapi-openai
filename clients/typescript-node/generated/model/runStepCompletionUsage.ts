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

/**
* Usage statistics related to the run step. This value will be `null` while the run step\'s status is `in_progress`.
*/
export class RunStepCompletionUsage {
    /**
    * Number of completion tokens used over the course of the run step.
    */
    'completionTokens': number;
    /**
    * Number of prompt tokens used over the course of the run step.
    */
    'promptTokens': number;
    /**
    * Total number of tokens used (prompt + completion).
    */
    'totalTokens': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "completionTokens",
            "baseName": "completion_tokens",
            "type": "number"
        },
        {
            "name": "promptTokens",
            "baseName": "prompt_tokens",
            "type": "number"
        },
        {
            "name": "totalTokens",
            "baseName": "total_tokens",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return RunStepCompletionUsage.attributeTypeMap;
    }
}

