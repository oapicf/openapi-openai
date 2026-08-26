namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListRunsResponse 
{
    public string Object { get; set; }
    public List<RunObject> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


