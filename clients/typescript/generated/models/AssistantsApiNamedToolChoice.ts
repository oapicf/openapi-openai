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

import { ChatCompletionNamedToolChoiceFunction } from '../models/ChatCompletionNamedToolChoiceFunction';
import { HttpFile } from '../http/http';

/**
* Specifies a tool the model should use. Use to force the model to call a specific tool.
*/
export class AssistantsApiNamedToolChoice {
    /**
    * The type of the tool. If type is `function`, the function name must be set
    */
    'type': AssistantsApiNamedToolChoiceTypeEnum;
    '_function'?: ChatCompletionNamedToolChoiceFunction;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "AssistantsApiNamedToolChoiceTypeEnum",
            "format": ""
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "ChatCompletionNamedToolChoiceFunction",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AssistantsApiNamedToolChoice.attributeTypeMap;
    }

    public constructor() {
    }
}

export enum AssistantsApiNamedToolChoiceTypeEnum {
    Function = 'function',
    CodeInterpreter = 'code_interpreter',
    Retrieval = 'retrieval'
}

