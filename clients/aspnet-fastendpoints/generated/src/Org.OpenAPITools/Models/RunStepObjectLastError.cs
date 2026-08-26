namespace Org.OpenAPITools.Models;


/// <summary>
/// The last error associated with this run step. Will be &#x60;null&#x60; if there are no errors.
/// </summary>
public class RunStepObjectLastError 
{
    
    /// <summary>
    /// One of `server_error` or `rate_limit_exceeded`.
    /// </summary>
    /// <value>One of `server_error` or `rate_limit_exceeded`.</value>
    public enum CodeEnum
    {
        
        /// <summary>
        /// Enum ServerErrorEnum for server_error
        /// </summary>
        ServerErrorEnum = 1,
        
        /// <summary>
        /// Enum RateLimitExceededEnum for rate_limit_exceeded
        /// </summary>
        RateLimitExceededEnum = 2
    }

    public CodeEnum Code { get; set; }
    public string Message { get; set; }
}


