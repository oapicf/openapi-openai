

export interface ChatCompletionRequestFunctionMessage { 
  /**
   * The role of the messages author, in this case `function`.
   */
  role: ChatCompletionRequestFunctionMessage.RoleEnum;
  /**
   * The contents of the function message.
   */
  content: string | null;
  /**
   * The name of the function to call.
   */
  name: string;
}
export namespace ChatCompletionRequestFunctionMessage {
  export const RoleEnum = {
    Function: 'function'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


