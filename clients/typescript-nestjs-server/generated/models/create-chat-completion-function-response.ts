import { CompletionUsage } from './completion-usage';
import { CreateChatCompletionFunctionResponseChoicesInner } from './create-chat-completion-function-response-choices-inner';


/**
 * Represents a chat completion response returned by model, based on the provided input.
 */
export interface CreateChatCompletionFunctionResponse { 
  /**
   * A unique identifier for the chat completion.
   */
  id: string;
  /**
   * A list of chat completion choices. Can be more than one if `n` is greater than 1.
   */
  choices: Array<CreateChatCompletionFunctionResponseChoicesInner>;
  /**
   * The Unix timestamp (in seconds) of when the chat completion was created.
   */
  created: number;
  /**
   * The model used for the chat completion.
   */
  model: string;
  /**
   * This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
   */
  system_fingerprint?: string;
  /**
   * The object type, which is always `chat.completion`.
   */
  object: CreateChatCompletionFunctionResponse.ObjectEnum;
  usage?: CompletionUsage;
}
export namespace CreateChatCompletionFunctionResponse {
  export const ObjectEnum = {
    ChatCompletion: 'chat.completion'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


