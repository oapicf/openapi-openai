namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListFilesResponse 
{
    public string Object { get; set; }
    public List<OpenAIFile> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


