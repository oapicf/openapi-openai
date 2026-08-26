import { ChatCompletionTokenLogprob } from './chat-completion-token-logprob';


/**
 * Log probability information for the choice.
 */
export interface CreateChatCompletionResponseChoicesInnerLogprobs { 
  /**
   * A list of message content tokens with log probability information.
   */
  content: Array<ChatCompletionTokenLogprob> | null;
  /**
   * A list of message refusal tokens with log probability information.
   */
  refusal: Array<ChatCompletionTokenLogprob> | null;
}

