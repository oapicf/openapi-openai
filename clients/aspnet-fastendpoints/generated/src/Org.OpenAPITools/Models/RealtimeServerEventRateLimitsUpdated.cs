namespace Org.OpenAPITools.Models;


/// <summary>
/// Emitted at the beginning of a Response to indicate the updated rate limits.  When a Response is created some tokens will be \&quot;reserved\&quot; for the output  tokens, the rate limits shown here reflect that reservation, which is then  adjusted accordingly once the Response is completed. 
/// </summary>
public class RealtimeServerEventRateLimitsUpdated 
{
    public string EventId { get; set; }
    
    /// <summary>
    /// The event type, must be `rate_limits.updated`.
    /// </summary>
    /// <value>The event type, must be `rate_limits.updated`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum RateLimitsUpdatedEnum for rate_limits.updated
        /// </summary>
        RateLimitsUpdatedEnum = 1
    }

    public TypeEnum Type { get; set; }
    public List<RealtimeServerEventRateLimitsUpdatedRateLimitsInner> RateLimits { get; set; }
}


