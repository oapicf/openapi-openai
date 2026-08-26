import { ChatCompletionRequestToolMessageContent } from './chat-completion-request-tool-message-content';


export interface ChatCompletionRequestToolMessage { 
  /**
   * The role of the messages author, in this case `tool`.
   */
  role: ChatCompletionRequestToolMessage.RoleEnum;
  content: ChatCompletionRequestToolMessageContent;
  /**
   * Tool call that this message is responding to.
   */
  tool_call_id: string;
}
export namespace ChatCompletionRequestToolMessage {
  export const RoleEnum = {
    Tool: 'tool'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


