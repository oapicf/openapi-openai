namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateChatCompletionFunctionResponseChoicesInner 
{
    
    /// <summary>
    /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
    /// </summary>
    /// <value>The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. </value>
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
        /// Enum FunctionCallEnum for function_call
        /// </summary>
        FunctionCallEnum = 3,
        
        /// <summary>
        /// Enum ContentFilterEnum for content_filter
        /// </summary>
        ContentFilterEnum = 4
    }

    public FinishReasonEnum FinishReason { get; set; }
    public int Index { get; set; }
    public ChatCompletionResponseMessage Message { get; set; }
}


