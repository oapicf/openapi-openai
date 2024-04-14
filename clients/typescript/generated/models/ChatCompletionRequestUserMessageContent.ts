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

import { ChatCompletionRequestMessageContentPart } from '../models/ChatCompletionRequestMessageContentPart';
import { HttpFile } from '../http/http';

/**
* The contents of the user message. 
*/
export class ChatCompletionRequestUserMessageContent {

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
    ];

    static getAttributeTypeMap() {
        return ChatCompletionRequestUserMessageContent.attributeTypeMap;
    }

    public constructor() {
    }
}

