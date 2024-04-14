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

export class CreateCompletionResponseChoicesInnerLogprobs {
    'tokens'?: Array<string>;
    'tokenLogprobs'?: Array<number>;
    'topLogprobs'?: Array<object>;
    'textOffset'?: Array<number>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "tokens",
            "baseName": "tokens",
            "type": "Array<string>"
        },
        {
            "name": "tokenLogprobs",
            "baseName": "token_logprobs",
            "type": "Array<number>"
        },
        {
            "name": "topLogprobs",
            "baseName": "top_logprobs",
            "type": "Array<object>"
        },
        {
            "name": "textOffset",
            "baseName": "text_offset",
            "type": "Array<number>"
        }    ];

    static getAttributeTypeMap() {
        return CreateCompletionResponseChoicesInnerLogprobs.attributeTypeMap;
    }
}
