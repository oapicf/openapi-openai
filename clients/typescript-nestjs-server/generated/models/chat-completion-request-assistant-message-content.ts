import { ChatCompletionRequestAssistantMessageContentPart } from './chat-completion-request-assistant-message-content-part';


/**
 * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 */
/**
 * @type ChatCompletionRequestAssistantMessageContent
 * The contents of the assistant message. Required unless `tool_calls` or `function_call` is specified. 
 * @export
 */
export type ChatCompletionRequestAssistantMessageContent = Array<ChatCompletionRequestAssistantMessageContentPart> | string;

