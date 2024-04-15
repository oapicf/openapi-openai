// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    RunObjectRequiredActionSubmitToolOutputs,
    RunObjectRequiredActionSubmitToolOutputsFromJSON,
    RunObjectRequiredActionSubmitToolOutputsToJSON,
} from './';

/**
 * Details on the action required to continue the run. Will be `null` if no action is required.
 * @export
 * @interface RunObjectRequiredAction
 */
export interface RunObjectRequiredAction  {
    /**
     * For now, this is always `submit_tool_outputs`.
     * @type {string}
     * @memberof RunObjectRequiredAction
     */
    type: RunObjectRequiredActionTypeEnum;
    /**
     * 
     * @type {RunObjectRequiredActionSubmitToolOutputs}
     * @memberof RunObjectRequiredAction
     */
    submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs;
}

export function RunObjectRequiredActionFromJSON(json: any): RunObjectRequiredAction {
    return {
        'type': json['type'],
        'submitToolOutputs': RunObjectRequiredActionSubmitToolOutputsFromJSON(json['submit_tool_outputs']),
    };
}

export function RunObjectRequiredActionToJSON(value?: RunObjectRequiredAction): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'type': value.type,
        'submit_tool_outputs': RunObjectRequiredActionSubmitToolOutputsToJSON(value.submitToolOutputs),
    };
}

/**
* @export
* @enum {string}
*/
export enum RunObjectRequiredActionTypeEnum {
    SubmitToolOutputs = 'submit_tool_outputs'
}

