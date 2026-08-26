namespace Org.OpenAPITools.Models;


/// <summary>
/// The request counts for different statuses within the batch.
/// </summary>
public class BatchRequestCounts 
{
    public int Total { get; set; }
    public int Completed { get; set; }
    public int Failed { get; set; }
}


