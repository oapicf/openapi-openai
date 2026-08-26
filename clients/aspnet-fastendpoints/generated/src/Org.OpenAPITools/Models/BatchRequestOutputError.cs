namespace Org.OpenAPITools.Models;


/// <summary>
/// For requests that failed with a non-HTTP error, this will contain more information on the cause of the failure.
/// </summary>
public class BatchRequestOutputError 
{
    public string Code { get; set; }
    public string Message { get; set; }
}


