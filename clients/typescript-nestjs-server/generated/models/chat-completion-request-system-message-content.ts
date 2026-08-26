import { ChatCompletionRequestMessageContentPartText } from './chat-completion-request-message-content-part-text';


/**
 * The contents of the system message.
 */
/**
 * @type ChatCompletionRequestSystemMessageContent
 * The contents of the system message.
 * @export
 */
export type ChatCompletionRequestSystemMessageContent = Array<ChatCompletionRequestMessageContentPartText> | string;

