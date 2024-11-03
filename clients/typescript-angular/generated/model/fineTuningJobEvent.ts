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
 * Fine-tuning job event object
 */
export interface FineTuningJobEvent { 
    id: string;
    created_at: number;
    level: FineTuningJobEvent.LevelEnum;
    message: string;
    object: FineTuningJobEvent.ObjectEnum;
}
export namespace FineTuningJobEvent {
    export type LevelEnum = 'info' | 'warn' | 'error';
    export const LevelEnum = {
        Info: 'info' as LevelEnum,
        Warn: 'warn' as LevelEnum,
        Error: 'error' as LevelEnum
    };
    export type ObjectEnum = 'fine_tuning.job.event';
    export const ObjectEnum = {
        FineTuningJobEvent: 'fine_tuning.job.event' as ObjectEnum
    };
}


