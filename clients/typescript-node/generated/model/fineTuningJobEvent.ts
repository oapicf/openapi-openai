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
* Fine-tuning job event object
*/
export class FineTuningJobEvent {
    'id': string;
    'createdAt': number;
    'level': FineTuningJobEvent.LevelEnum;
    'message': string;
    'object': FineTuningJobEvent.ObjectEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "number"
        },
        {
            "name": "level",
            "baseName": "level",
            "type": "FineTuningJobEvent.LevelEnum"
        },
        {
            "name": "message",
            "baseName": "message",
            "type": "string"
        },
        {
            "name": "object",
            "baseName": "object",
            "type": "FineTuningJobEvent.ObjectEnum"
        }    ];

    static getAttributeTypeMap() {
        return FineTuningJobEvent.attributeTypeMap;
    }
}

export namespace FineTuningJobEvent {
    export enum LevelEnum {
        Info = <any> 'info',
        Warn = <any> 'warn',
        Error = <any> 'error'
    }
    export enum ObjectEnum {
        FineTuningJobEvent = <any> 'fine_tuning.job.event'
    }
}
