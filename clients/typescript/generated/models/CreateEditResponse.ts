/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * OpenAPI spec version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { CreateCompletionResponseUsage } from '../models/CreateCompletionResponseUsage';
import { CreateEditResponseChoicesInner } from '../models/CreateEditResponseChoicesInner';
import { HttpFile } from '../http/http';

export class CreateEditResponse {
    'object': string;
    'created': number;
    'choices': Array<CreateEditResponseChoicesInner>;
    'usage': CreateCompletionResponseUsage;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "object",
            "baseName": "object",
            "type": "string",
            "format": ""
        },
        {
            "name": "created",
            "baseName": "created",
            "type": "number",
            "format": ""
        },
        {
            "name": "choices",
            "baseName": "choices",
            "type": "Array<CreateEditResponseChoicesInner>",
            "format": ""
        },
        {
            "name": "usage",
            "baseName": "usage",
            "type": "CreateCompletionResponseUsage",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return CreateEditResponse.attributeTypeMap;
    }

    public constructor() {
    }
}

