namespace Org.OpenAPITools.Models;


/// <summary>
/// Additional details about the status.
/// </summary>
public class RealtimeResponseStatusDetails 
{
    
    /// <summary>
    /// The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). 
    /// </summary>
    /// <value>The type of error that caused the response to fail, corresponding  with the `status` field (`completed`, `cancelled`, `incomplete`,  `failed`). </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum CompletedEnum for completed
        /// </summary>
        CompletedEnum = 1,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 2,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 3,
        
        /// <summary>
        /// Enum IncompleteEnum for incomplete
        /// </summary>
        IncompleteEnum = 4
    }

    public TypeEnum Type { get; set; }
    
    /// <summary>
    /// The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). 
    /// </summary>
    /// <value>The reason the Response did not complete. For a `cancelled` Response,  one of `turn_detected` (the server VAD detected a new start of speech)  or `client_cancelled` (the client sent a cancel event). For an  `incomplete` Response, one of `max_output_tokens` or `content_filter`  (the server-side safety filter activated and cut off the response). </value>
    public enum ReasonEnum
    {
        
        /// <summary>
        /// Enum TurnDetectedEnum for turn_detected
        /// </summary>
        TurnDetectedEnum = 1,
        
        /// <summary>
        /// Enum ClientCancelledEnum for client_cancelled
        /// </summary>
        ClientCancelledEnum = 2,
        
        /// <summary>
        /// Enum MaxOutputTokensEnum for max_output_tokens
        /// </summary>
        MaxOutputTokensEnum = 3,
        
        /// <summary>
        /// Enum ContentFilterEnum for content_filter
        /// </summary>
        ContentFilterEnum = 4
    }

    public ReasonEnum Reason { get; set; }
    public RealtimeResponseStatusDetailsError Error { get; set; }
}


