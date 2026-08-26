import { ChatCompletionRequestAssistantMessageAudio } from './chat-completion-request-assistant-message-audio';
import { ChatCompletionRequestUserMessage } from './chat-completion-request-user-message';
import { ChatCompletionRequestAssistantMessage } from './chat-completion-request-assistant-message';
import { ChatCompletionRequestDeveloperMessage } from './chat-completion-request-developer-message';
import { ChatCompletionRequestAssistantMessageFunctionCall } from './chat-completion-request-assistant-message-function-call';
import { ChatCompletionRequestFunctionMessage } from './chat-completion-request-function-message';
import { ChatCompletionRequestToolMessage } from './chat-completion-request-tool-message';
import { ChatCompletionMessageToolCall } from './chat-completion-message-tool-call';
import { ChatCompletionRequestSystemMessage } from './chat-completion-request-system-message';


/**
 * @type ChatCompletionRequestMessage
 * @export
 */
export type ChatCompletionRequestMessage = ChatCompletionRequestAssistantMessage | ChatCompletionRequestDeveloperMessage | ChatCompletionRequestFunctionMessage | ChatCompletionRequestSystemMessage | ChatCompletionRequestToolMessage | ChatCompletionRequestUserMessage;

