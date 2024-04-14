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
 * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
 * @export
 * @interface AssistantsApiResponseFormat
 */
export interface AssistantsApiResponseFormat {
    /**
     * Must be one of `text` or `json_object`.
     * @type {string}
     * @memberof AssistantsApiResponseFormat
     */
    type?: AssistantsApiResponseFormatTypeEnum;
}

/**
 * @export
 * @enum {string}
 */
export enum AssistantsApiResponseFormatTypeEnum {
    Text = 'text',
    JsonObject = 'json_object'
}

