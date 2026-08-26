import { ChatCompletionRequestUserMessageContentPart } from './chat-completion-request-user-message-content-part';


/**
 * The contents of the user message. 
 */
/**
 * @type ChatCompletionRequestUserMessageContent
 * The contents of the user message. 
 * @export
 */
export type ChatCompletionRequestUserMessageContent = Array<ChatCompletionRequestUserMessageContentPart> | string;

