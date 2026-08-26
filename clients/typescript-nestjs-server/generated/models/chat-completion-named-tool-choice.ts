import { AssistantsNamedToolChoiceFunction } from './assistants-named-tool-choice-function';


/**
 * Specifies a tool the model should use. Use to force the model to call a specific function.
 */
export interface ChatCompletionNamedToolChoice { 
  /**
   * The type of the tool. Currently, only `function` is supported.
   */
  type: ChatCompletionNamedToolChoice.TypeEnum;
  'function': AssistantsNamedToolChoiceFunction;
}
export namespace ChatCompletionNamedToolChoice {
  export const TypeEnum = {
    Function: 'function'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


