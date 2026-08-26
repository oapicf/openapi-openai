import { ChatCompletionMessageToolCallChunkFunction } from './chat-completion-message-tool-call-chunk-function';


export interface ChatCompletionMessageToolCallChunk { 
  index: number;
  /**
   * The ID of the tool call.
   */
  id?: string;
  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  type?: ChatCompletionMessageToolCallChunk.TypeEnum;
  'function'?: ChatCompletionMessageToolCallChunkFunction;
}
export namespace ChatCompletionMessageToolCallChunk {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


