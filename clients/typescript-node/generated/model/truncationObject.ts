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

export class TruncationObject {
    /**
    * The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    */
    'type'?: TruncationObject.TypeEnum;
    /**
    * The number of most recent messages from the thread when constructing the context for the run.
    */
    'lastMessages'?: number | null;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "TruncationObject.TypeEnum"
        },
        {
            "name": "lastMessages",
            "baseName": "last_messages",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TruncationObject.attributeTypeMap;
    }
}

export namespace TruncationObject {
    export enum TypeEnum {
        Auto = <any> 'auto',
        LastMessages = <any> 'last_messages'
    }
}
