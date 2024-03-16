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

export class CreateEmbeddingResponseUsage {
    'promptTokens': number;
    'totalTokens': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "promptTokens",
            "baseName": "prompt_tokens",
            "type": "number"
        },
        {
            "name": "totalTokens",
            "baseName": "total_tokens",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CreateEmbeddingResponseUsage.attributeTypeMap;
    }
}

