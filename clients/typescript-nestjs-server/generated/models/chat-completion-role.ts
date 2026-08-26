

/**
 * The role of the author of a message
 */
export const ChatCompletionRole = {
    System: 'system',
    User: 'user',
    Assistant: 'assistant',
    Tool: 'tool',
    Function: 'function'
} as const;
export type ChatCompletionRole = typeof ChatCompletionRole[keyof typeof ChatCompletionRole];

