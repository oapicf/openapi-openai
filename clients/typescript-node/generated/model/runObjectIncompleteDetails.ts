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
* Details on why the run is incomplete. Will be `null` if the run is not incomplete.
*/
export class RunObjectIncompleteDetails {
    /**
    * The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    */
    'reason'?: RunObjectIncompleteDetails.ReasonEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "reason",
            "baseName": "reason",
            "type": "RunObjectIncompleteDetails.ReasonEnum"
        }    ];

    static getAttributeTypeMap() {
        return RunObjectIncompleteDetails.attributeTypeMap;
    }
}

export namespace RunObjectIncompleteDetails {
    export enum ReasonEnum {
        CompletionTokens = <any> 'max_completion_tokens',
        PromptTokens = <any> 'max_prompt_tokens'
    }
}
