namespace Org.OpenAPITools.Models;


/// <summary>
/// Occurs when an [error](/docs/guides/error-codes#api-errors) occurs. This can happen due to an internal server error or a timeout.
/// </summary>
public class ErrorEvent 
{
    
    /// <summary>
    /// Gets or Sets Event
    /// </summary>
    public enum EventEnum
    {
        
        /// <summary>
        /// Enum ErrorEnum for error
        /// </summary>
        ErrorEnum = 1
    }

    public EventEnum Event { get; set; }
    public Error Data { get; set; }
}


