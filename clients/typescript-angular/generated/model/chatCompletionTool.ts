/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { FunctionObject } from './functionObject';


export interface ChatCompletionTool { 
    /**
     * The type of the tool. Currently, only `function` is supported.
     */
    type: ChatCompletionTool.TypeEnum;
    'function': FunctionObject;
}
export namespace ChatCompletionTool {
    export type TypeEnum = 'function';
    export const TypeEnum = {
        Function: 'function' as TypeEnum
    };
}


