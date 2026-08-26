import { ChatCompletionRequestMessageContentPartText } from './chat-completion-request-message-content-part-text';


/**
 * The contents of the tool message.
 */
/**
 * @type ChatCompletionRequestToolMessageContent
 * The contents of the tool message.
 * @export
 */
export type ChatCompletionRequestToolMessageContent = Array<ChatCompletionRequestMessageContentPartText> | string;

