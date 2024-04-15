/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RunStepObject } from '../models/RunStepObject';
import { RunStepStreamEventOneOf } from '../models/RunStepStreamEventOneOf';
import { RunStepStreamEventOneOf1 } from '../models/RunStepStreamEventOneOf1';
import { RunStepStreamEventOneOf2 } from '../models/RunStepStreamEventOneOf2';
import { RunStepStreamEventOneOf3 } from '../models/RunStepStreamEventOneOf3';
import { RunStepStreamEventOneOf4 } from '../models/RunStepStreamEventOneOf4';
import { RunStepStreamEventOneOf5 } from '../models/RunStepStreamEventOneOf5';
import { RunStepStreamEventOneOf6 } from '../models/RunStepStreamEventOneOf6';
import { HttpFile } from '../http/http';

export class RunStepStreamEvent {
    'event': RunStepStreamEventEventEnum;
    'data': RunStepObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "RunStepStreamEventEventEnum",
            "format": ""
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "RunStepObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStepStreamEvent.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum RunStepStreamEventEventEnum {
    ThreadRunStepExpired = 'thread.run.step.expired'
}
