namespace Org.OpenAPITools.Models;


/// <summary>
/// The last error associated with this run. Will be &#x60;null&#x60; if there are no errors.
/// </summary>
public class RunObjectLastError 
{
    
    /// <summary>
    /// One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.
    /// </summary>
    /// <value>One of `server_error`, `rate_limit_exceeded`, or `invalid_prompt`.</value>
    public enum CodeEnum
    {
        
        /// <summary>
        /// Enum ServerErrorEnum for server_error
        /// </summary>
        ServerErrorEnum = 1,
        
        /// <summary>
        /// Enum RateLimitExceededEnum for rate_limit_exceeded
        /// </summary>
        RateLimitExceededEnum = 2,
        
        /// <summary>
        /// Enum InvalidPromptEnum for invalid_prompt
        /// </summary>
        InvalidPromptEnum = 3
    }

    public CodeEnum Code { get; set; }
    public string Message { get; set; }
}


