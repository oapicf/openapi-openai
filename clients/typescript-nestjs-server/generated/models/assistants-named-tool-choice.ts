import { AssistantsNamedToolChoiceFunction } from './assistants-named-tool-choice-function';


/**
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */
export interface AssistantsNamedToolChoice { 
  /**
   * The type of the tool. If type is `function`, the function name must be set
   */
  type: AssistantsNamedToolChoice.TypeEnum;
  'function'?: AssistantsNamedToolChoiceFunction;
}
export namespace AssistantsNamedToolChoice {
  export const TypeEnum = {
    Function: 'function',
    CodeInterpreter: 'code_interpreter',
    FileSearch: 'file_search'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


