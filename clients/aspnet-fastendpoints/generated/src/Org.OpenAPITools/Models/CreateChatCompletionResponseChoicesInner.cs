namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateChatCompletionResponseChoicesInner 
{
    
    /// <summary>
    /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. 
    /// </summary>
    /// <value>The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, `tool_calls` if the model called a tool, or `function_call` (deprecated) if the model called a function. </value>
    public enum FinishReasonEnum
    {
        
        /// <summary>
        /// Enum StopEnum for stop
        /// </summary>
        StopEnum = 1,
        
        /// <summary>
        /// Enum LengthEnum for length
        /// </summary>
        LengthEnum = 2,
        
        /// <summary>
        /// Enum ToolCallsEnum for tool_calls
        /// </summary>
        ToolCallsEnum = 3,
        
        /// <summary>
        /// Enum ContentFilterEnum for content_filter
        /// </summary>
        ContentFilterEnum = 4,
        
        /// <summary>
        /// Enum FunctionCallEnum for function_call
        /// </summary>
        FunctionCallEnum = 5
    }

    public FinishReasonEnum FinishReason { get; set; }
    public int Index { get; set; }
    public ChatCompletionResponseMessage Message { get; set; }
    public CreateChatCompletionResponseChoicesInnerLogprobs Logprobs { get; set; }
}


