/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { RunObjectRequiredActionSubmitToolOutputs } from './runObjectRequiredActionSubmitToolOutputs';


/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 */
export interface RunObjectRequiredAction { 
    /**
     * For now, this is always `submit_tool_outputs`.
     */
    type: RunObjectRequiredAction.TypeEnum;
    submit_tool_outputs: RunObjectRequiredActionSubmitToolOutputs;
}
export namespace RunObjectRequiredAction {
    export type TypeEnum = 'submit_tool_outputs';
    export const TypeEnum = {
        SubmitToolOutputs: 'submit_tool_outputs' as TypeEnum
    };
}


