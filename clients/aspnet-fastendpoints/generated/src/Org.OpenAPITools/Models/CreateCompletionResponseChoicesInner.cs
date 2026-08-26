namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateCompletionResponseChoicesInner 
{
    
    /// <summary>
    /// The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. 
    /// </summary>
    /// <value>The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, or `content_filter` if content was omitted due to a flag from our content filters. </value>
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
        /// Enum ContentFilterEnum for content_filter
        /// </summary>
        ContentFilterEnum = 3
    }

    public FinishReasonEnum FinishReason { get; set; }
    public int Index { get; set; }
    public CreateCompletionResponseChoicesInnerLogprobs Logprobs { get; set; }
    public string Text { get; set; }
}


