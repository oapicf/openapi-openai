// tslint:disable
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

/**
 * @export
 * @interface AssistantToolsCode
 */
export interface AssistantToolsCode {
    /**
     * The type of tool being defined: `code_interpreter`
     * @type {string}
     * @memberof AssistantToolsCode
     */
    type: AssistantToolsCodeTypeEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum AssistantToolsCodeTypeEnum {
    CodeInterpreter = 'code_interpreter'
}
