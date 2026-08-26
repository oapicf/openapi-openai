namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RealtimeServerEventRateLimitsUpdatedRateLimitsInner 
{
    
    /// <summary>
    /// The name of the rate limit (`requests`, `tokens`). 
    /// </summary>
    /// <value>The name of the rate limit (`requests`, `tokens`). </value>
    public enum NameEnum
    {
        
        /// <summary>
        /// Enum RequestsEnum for requests
        /// </summary>
        RequestsEnum = 1,
        
        /// <summary>
        /// Enum TokensEnum for tokens
        /// </summary>
        TokensEnum = 2
    }

    public NameEnum Name { get; set; }
    public int Limit { get; set; }
    public int Remaining { get; set; }
    public decimal ResetSeconds { get; set; }
}


