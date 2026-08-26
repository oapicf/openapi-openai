import { ChatCompletionRequestMessageContentPartAudio } from './chat-completion-request-message-content-part-audio';
import { ChatCompletionRequestMessageContentPartImage } from './chat-completion-request-message-content-part-image';
import { ChatCompletionRequestMessageContentPartImageImageUrl } from './chat-completion-request-message-content-part-image-image-url';
import { ChatCompletionRequestMessageContentPartText } from './chat-completion-request-message-content-part-text';
import { ChatCompletionRequestMessageContentPartAudioInputAudio } from './chat-completion-request-message-content-part-audio-input-audio';


/**
 * @type ChatCompletionRequestUserMessageContentPart
 * @export
 */
export type ChatCompletionRequestUserMessageContentPart = ChatCompletionRequestMessageContentPartAudio | ChatCompletionRequestMessageContentPartImage | ChatCompletionRequestMessageContentPartText;

