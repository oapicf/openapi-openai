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
import { RunStepObject } from './runStepObject';

/**
* Occurs when a [run step](/docs/api-reference/runs/step-object) expires.
*/
export class RunStepStreamEventOneOf6 {
    'event': RunStepStreamEventOneOf6.EventEnum;
    'data': RunStepObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "RunStepStreamEventOneOf6.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "RunStepObject"
        }    ];

    static getAttributeTypeMap() {
        return RunStepStreamEventOneOf6.attributeTypeMap;
    }
}

export namespace RunStepStreamEventOneOf6 {
    export enum EventEnum {
        ThreadRunStepExpired = <any> 'thread.run.step.expired'
    }
}
