namespace Org.OpenAPITools.Models;


/// <summary>
/// The per-line object of the batch input file
/// </summary>
public class BatchRequestInput 
{
    public string CustomId { get; set; }
    
    /// <summary>
    /// The HTTP method to be used for the request. Currently only `POST` is supported.
    /// </summary>
    /// <value>The HTTP method to be used for the request. Currently only `POST` is supported.</value>
    public enum MethodEnum
    {
        
        /// <summary>
        /// Enum POSTEnum for POST
        /// </summary>
        POSTEnum = 1
    }

    public MethodEnum Method { get; set; }
    public string Url { get; set; }
}


