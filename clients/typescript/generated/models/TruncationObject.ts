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

import { HttpFile } from '../http/http';

export class TruncationObject {
    /**
    * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    */
    'type'?: TruncationObjectTypeEnum;
    /**
    * The number of most recent messages from the thread when constructing the context for the run.
    */
    'lastMessages'?: number | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "TruncationObjectTypeEnum",
            "format": ""
        },
        {
            "name": "lastMessages",
            "baseName": "last_messages",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return TruncationObject.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum TruncationObjectTypeEnum {
    Auto = 'auto',
    LastMessages = 'last_messages'
}

