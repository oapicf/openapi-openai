import { ChatCompletionRequestSystemMessageContent } from './chat-completion-request-system-message-content';


/**
 * Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, use `developer` messages for this purpose instead. 
 */
export interface ChatCompletionRequestSystemMessage { 
  content: ChatCompletionRequestSystemMessageContent;
  /**
   * The role of the messages author, in this case `system`.
   */
  role: ChatCompletionRequestSystemMessage.RoleEnum;
  /**
   * An optional name for the participant. Provides the model information to differentiate between participants of the same role.
   */
  name?: string;
}
export namespace ChatCompletionRequestSystemMessage {
  export const RoleEnum = {
    System: 'system'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


