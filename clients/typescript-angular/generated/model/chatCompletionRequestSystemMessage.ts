/**
 * OpenAI API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface ChatCompletionRequestSystemMessage { 
    /**
     * The contents of the system message.
     */
    content: string;
    /**
     * The role of the messages author, in this case `system`.
     */
    role: ChatCompletionRequestSystemMessage.RoleEnum;
    /**
     * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
     */
    name?: string;
}
export namespace ChatCompletionRequestSystemMessage {
    export type RoleEnum = 'system';
    export const RoleEnum = {
        System: 'system' as RoleEnum
    };
}


