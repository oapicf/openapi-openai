import { ChatCompletionRequestMessageContentPartText } from './chat-completion-request-message-content-part-text';


/**
 * The contents of the developer message.
 */
/**
 * @type ChatCompletionRequestDeveloperMessageContent
 * The contents of the developer message.
 * @export
 */
export type ChatCompletionRequestDeveloperMessageContent = Array<ChatCompletionRequestMessageContentPartText> | string;

