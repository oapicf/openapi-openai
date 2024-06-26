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
import { RunObject } from './runObject';

/**
* Occurs when a [run](/docs/api-reference/runs/object) moves to a `requires_action` status.
*/
export class RunStreamEventOneOf3 {
    'event': RunStreamEventOneOf3.EventEnum;
    'data': RunObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "event",
            "baseName": "event",
            "type": "RunStreamEventOneOf3.EventEnum"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "RunObject"
        }    ];

    static getAttributeTypeMap() {
        return RunStreamEventOneOf3.attributeTypeMap;
    }
}

export namespace RunStreamEventOneOf3 {
    export enum EventEnum {
        ThreadRunRequiresAction = <any> 'thread.run.requires_action'
    }
}
