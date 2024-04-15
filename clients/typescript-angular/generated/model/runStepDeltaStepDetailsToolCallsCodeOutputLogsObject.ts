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


/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
export interface RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject { 
    /**
     * The index of the output in the outputs array.
     */
    index: number;
    /**
     * Always `logs`.
     */
    type: RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject.TypeEnum;
    /**
     * The text output from the Code Interpreter tool call.
     */
    logs?: string;
}
export namespace RunStepDeltaStepDetailsToolCallsCodeOutputLogsObject {
    export type TypeEnum = 'logs';
    export const TypeEnum = {
        Logs: 'logs' as TypeEnum
    };
}

