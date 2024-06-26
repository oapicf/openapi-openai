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
import { ChatCompletionTokenLogprobTopLogprobsInner } from './chatCompletionTokenLogprobTopLogprobsInner';

export class ChatCompletionTokenLogprob {
    /**
    * The token.
    */
    'token': string;
    /**
    * The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
    */
    'logprob': number;
    /**
    * A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
    */
    'bytes': Array<number> | null;
    /**
    * List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
    */
    'topLogprobs': Array<ChatCompletionTokenLogprobTopLogprobsInner>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "token",
            "baseName": "token",
            "type": "string"
        },
        {
            "name": "logprob",
            "baseName": "logprob",
            "type": "number"
        },
        {
            "name": "bytes",
            "baseName": "bytes",
            "type": "Array<number>"
        },
        {
            "name": "topLogprobs",
            "baseName": "top_logprobs",
            "type": "Array<ChatCompletionTokenLogprobTopLogprobsInner>"
        }    ];

    static getAttributeTypeMap() {
        return ChatCompletionTokenLogprob.attributeTypeMap;
    }
}

