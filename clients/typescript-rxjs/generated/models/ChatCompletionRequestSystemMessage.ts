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
 * @interface ChatCompletionRequestSystemMessage
 */
export interface ChatCompletionRequestSystemMessage {
    /**
     * The contents of the system message.
     * @type {string}
     * @memberof ChatCompletionRequestSystemMessage
     */
    content: string;
    /**
     * The role of the messages author, in this case `system`.
     * @type {string}
     * @memberof ChatCompletionRequestSystemMessage
     */
    role: ChatCompletionRequestSystemMessageRoleEnum;
    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     * @type {string}
     * @memberof ChatCompletionRequestSystemMessage
     */
    name?: string;
}

/**
 * @export
 * @enum {string}
 */
export enum ChatCompletionRequestSystemMessageRoleEnum {
    System = 'system'
}

