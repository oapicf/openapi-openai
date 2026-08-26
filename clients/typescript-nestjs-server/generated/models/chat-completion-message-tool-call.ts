import { ChatCompletionMessageToolCallFunction } from './chat-completion-message-tool-call-function';


export interface ChatCompletionMessageToolCall { 
  /**
   * The ID of the tool call.
   */
  id: string;
  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  type: ChatCompletionMessageToolCall.TypeEnum;
  'function': ChatCompletionMessageToolCallFunction;
}
export namespace ChatCompletionMessageToolCall {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


