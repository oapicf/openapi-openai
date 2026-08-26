import { ChatCompletionRequestUserMessageContent } from './chat-completion-request-user-message-content';


/**
 * Messages sent by an end user, containing prompts or additional context information. 
 */
export interface ChatCompletionRequestUserMessage { 
  content: ChatCompletionRequestUserMessageContent;
  /**
   * The role of the messages author, in this case `user`.
   */
  role: ChatCompletionRequestUserMessage.RoleEnum;
  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   */
  name?: string;
}
export namespace ChatCompletionRequestUserMessage {
  export const RoleEnum = {
    User: 'user'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


