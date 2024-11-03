/* tslint:disable */
/* eslint-disable */
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
 * The role of the author of a message
 * @export
 */
export const ChatCompletionRole = {
    System: 'system',
    User: 'user',
    Assistant: 'assistant',
    Tool: 'tool',
    Function: 'function'
} as const;
export type ChatCompletionRole = typeof ChatCompletionRole[keyof typeof ChatCompletionRole];


export function instanceOfChatCompletionRole(value: any): boolean {
    for (const key in ChatCompletionRole) {
        if (Object.prototype.hasOwnProperty.call(ChatCompletionRole, key)) {
            if (ChatCompletionRole[key as keyof typeof ChatCompletionRole] === value) {
                return true;
            }
        }
    }
    return false;
}

export function ChatCompletionRoleFromJSON(json: any): ChatCompletionRole {
    return ChatCompletionRoleFromJSONTyped(json, false);
}

export function ChatCompletionRoleFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChatCompletionRole {
    return json as ChatCompletionRole;
}

export function ChatCompletionRoleToJSON(value?: ChatCompletionRole | null): any {
    return value as any;
}

export function ChatCompletionRoleToJSONTyped(value: any, ignoreDiscriminator: boolean): ChatCompletionRole {
    return value as ChatCompletionRole;
}

