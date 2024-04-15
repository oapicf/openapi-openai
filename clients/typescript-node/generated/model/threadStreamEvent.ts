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
import { ThreadObject } from './threadObject';
import { ThreadStreamEventOneOf } from './threadStreamEventOneOf';

export class ThreadStreamEvent {
    'event': ThreadStreamEvent.EventEnum;
    'data': ThreadObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "ThreadStreamEvent.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "ThreadObject"
        }    ];

    static getAttributeTypeMap() {
        return ThreadStreamEvent.attributeTypeMap;
    }
}

export namespace ThreadStreamEvent {
    export enum EventEnum {
        ThreadCreated = <any> 'thread.created'
    }
}