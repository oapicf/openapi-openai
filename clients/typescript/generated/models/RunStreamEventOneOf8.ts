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

import { RunObject } from '../models/RunObject';
import { HttpFile } from '../http/http';

/**
* Occurs when a [run](/docs/api-reference/runs/object) expires.
*/
export class RunStreamEventOneOf8 {
    'event': RunStreamEventOneOf8EventEnum;
    'data': RunObject;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "RunStreamEventOneOf8EventEnum",
            "format": ""
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "RunObject",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return RunStreamEventOneOf8.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum RunStreamEventOneOf8EventEnum {
    ThreadRunExpired = 'thread.run.expired'
}

