/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { FineTuneEvent } from './fineTuneEvent';

export class ListFineTuneEventsResponse {
    'object': string;
    'data': Array<FineTuneEvent>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "object",
            "baseName": "object",
            "type": "string"
        },
        {
            "name": "data",
            "baseName": "data",
            "type": "Array<FineTuneEvent>"
        }    ];

    static getAttributeTypeMap() {
        return ListFineTuneEventsResponse.attributeTypeMap;
    }
}

