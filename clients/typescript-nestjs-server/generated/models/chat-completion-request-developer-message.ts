import { ChatCompletionRequestDeveloperMessageContent } from './chat-completion-request-developer-message-content';


/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, `developer` messages replace the previous `system` messages. 
 */
export interface ChatCompletionRequestDeveloperMessage { 
  content: ChatCompletionRequestDeveloperMessageContent;
  /**
   * The role of the messages author, in this case `developer`.
   */
  role: ChatCompletionRequestDeveloperMessage.RoleEnum;
  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   */
  name?: string;
}
export namespace ChatCompletionRequestDeveloperMessage {
  export const RoleEnum = {
    Developer: 'developer'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


