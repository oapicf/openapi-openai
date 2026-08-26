import { ChatCompletionRequestMessageContentPartRefusal } from './chat-completion-request-message-content-part-refusal';
import { ChatCompletionRequestMessageContentPartText } from './chat-completion-request-message-content-part-text';


/**
 * @type ChatCompletionRequestAssistantMessageContentPart
 * @export
 */
export type ChatCompletionRequestAssistantMessageContentPart = ChatCompletionRequestMessageContentPartRefusal | ChatCompletionRequestMessageContentPartText;

