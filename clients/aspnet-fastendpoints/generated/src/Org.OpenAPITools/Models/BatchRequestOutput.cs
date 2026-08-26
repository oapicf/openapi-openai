namespace Org.OpenAPITools.Models;


/// <summary>
/// The per-line object of the batch output and error files
/// </summary>
public class BatchRequestOutput 
{
    public string Id { get; set; }
    public string CustomId { get; set; }
    public BatchRequestOutputResponse Response { get; set; }
    public BatchRequestOutputError Error { get; set; }
}


