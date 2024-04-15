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
import { RunStepStreamEventOneOf } from './runStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from './runStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from './runStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from './runStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from './runStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from './runStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from './runStepStreamEventOneOf6';

export class RunStepStreamEvent {
    'event': RunStepStreamEvent.EventEnum;
    'data': RunStepObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "RunStepStreamEvent.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "RunStepObject"
        }    ];

    static getAttributeTypeMap() {
        return RunStepStreamEvent.attributeTypeMap;
    }
}

export namespace RunStepStreamEvent {
    export enum EventEnum {
        ThreadRunStepExpired = <any> 'thread.run.step.expired'
    }
}