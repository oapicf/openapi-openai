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
import { AssistantToolsCode } from './assistantToolsCode';
import { AssistantToolsFunction } from './assistantToolsFunction';
import { AssistantToolsRetrieval } from './assistantToolsRetrieval';
import { FunctionObject } from './functionObject';

export class AssistantObjectToolsInner {
    /**
    * The type of tool being defined: `code_interpreter`
    */
    'type': AssistantObjectToolsInner.TypeEnum;
    '_function': FunctionObject;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "AssistantObjectToolsInner.TypeEnum"
        },
        {
            "name": "_function",
            "baseName": "function",
            "type": "FunctionObject"
        }    ];

    static getAttributeTypeMap() {
        return AssistantObjectToolsInner.attributeTypeMap;
    }
}

export namespace AssistantObjectToolsInner {
    export enum TypeEnum {
        CodeInterpreter = <any> 'code_interpreter',
        Retrieval = <any> 'retrieval',
        Function = <any> 'function'
    }
}