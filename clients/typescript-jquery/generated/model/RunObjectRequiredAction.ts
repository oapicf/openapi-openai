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

import * as models from './models';

/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 */
export interface RunObjectRequiredAction {
    /**
     * For now, this is always `submit_tool_outputs`.
     */
    type: RunObjectRequiredAction.TypeEnum;

    submit_tool_outputs: models.RunObjectRequiredActionSubmitToolOutputs;

}
export namespace RunObjectRequiredAction {
    export enum TypeEnum {
        SubmitToolOutputs = <any> 'submit_tool_outputs'
    }
}
