namespace Org.OpenAPITools.Models;


/// <summary>
/// The last error associated with this vector store file. Will be &#x60;null&#x60; if there are no errors.
/// </summary>
public class VectorStoreFileObjectLastError 
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
        /// Enum UnsupportedFileEnum for unsupported_file
        /// </summary>
        UnsupportedFileEnum = 2,
        
        /// <summary>
        /// Enum InvalidFileEnum for invalid_file
        /// </summary>
        InvalidFileEnum = 3
    }

    public CodeEnum Code { get; set; }
    public string Message { get; set; }
}


