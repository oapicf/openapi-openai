namespace Org.OpenAPITools.Models;


/// <summary>
/// On an incomplete message, details about why the message is incomplete.
/// </summary>
public class MessageObjectIncompleteDetails 
{
    
    /// <summary>
    /// The reason the message is incomplete.
    /// </summary>
    /// <value>The reason the message is incomplete.</value>
    public enum ReasonEnum
    {
        
        /// <summary>
        /// Enum ContentFilterEnum for content_filter
        /// </summary>
        ContentFilterEnum = 1,
        
        /// <summary>
        /// Enum MaxTokensEnum for max_tokens
        /// </summary>
        MaxTokensEnum = 2,
        
        /// <summary>
        /// Enum RunCancelledEnum for run_cancelled
        /// </summary>
        RunCancelledEnum = 3,
        
        /// <summary>
        /// Enum RunExpiredEnum for run_expired
        /// </summary>
        RunExpiredEnum = 4,
        
        /// <summary>
        /// Enum RunFailedEnum for run_failed
        /// </summary>
        RunFailedEnum = 5
    }

    public ReasonEnum Reason { get; set; }
}


