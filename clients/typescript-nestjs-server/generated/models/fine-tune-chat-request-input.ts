import { FineTuneChatRequestInputMessagesInner } from './fine-tune-chat-request-input-messages-inner';
import { ChatCompletionFunctions } from './chat-completion-functions';
import { ChatCompletionTool } from './chat-completion-tool';


/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */
export interface FineTuneChatRequestInput { 
  messages?: Array<FineTuneChatRequestInputMessagesInner>;
  /**
   * A list of tools the model may generate JSON inputs for.
   */
  tools?: Array<ChatCompletionTool>;
  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   */
  parallel_tool_calls?: boolean;
  /**
   * A list of functions the model may generate JSON inputs for.
   * @deprecated
   */
  functions?: Array<ChatCompletionFunctions>;
}

