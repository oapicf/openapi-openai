/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Text output from the Code Interpreter tool call as part of a run step.
 */
export interface RunStepDetailsToolCallsCodeOutputLogsObject { 
    /**
     * Always `logs`.
     */
    type: RunStepDetailsToolCallsCodeOutputLogsObject.TypeEnum;
    /**
     * The text output from the Code Interpreter tool call.
     */
    logs: string;
}
export namespace RunStepDetailsToolCallsCodeOutputLogsObject {
    export type TypeEnum = 'logs';
    export const TypeEnum = {
        Logs: 'logs' as TypeEnum
    };
}


