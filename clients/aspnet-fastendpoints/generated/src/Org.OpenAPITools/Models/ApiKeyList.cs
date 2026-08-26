namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ApiKeyList 
{
    public string Object { get; set; }
    public List<AdminApiKey> Data { get; set; }
    public bool HasMore { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
}


