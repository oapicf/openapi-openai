import { ChatCompletionRequestMessageContentPartText } from './chat-completion-request-message-content-part-text';


/**
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 */
/**
 * @type PredictionContentContent
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 * @export
 */
export type PredictionContentContent = Array<ChatCompletionRequestMessageContentPartText> | string;

