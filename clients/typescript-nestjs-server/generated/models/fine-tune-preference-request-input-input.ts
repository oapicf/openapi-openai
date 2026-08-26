import { FineTuneChatRequestInputMessagesInner } from './fine-tune-chat-request-input-messages-inner';
import { ChatCompletionTool } from './chat-completion-tool';


export interface FineTunePreferenceRequestInputInput { 
  messages?: Array<FineTuneChatRequestInputMessagesInner>;
  /**
   * A list of tools the model may generate JSON inputs for.
   */
  tools?: Array<ChatCompletionTool>;
  /**
   * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
   */
  parallel_tool_calls?: boolean;
}

