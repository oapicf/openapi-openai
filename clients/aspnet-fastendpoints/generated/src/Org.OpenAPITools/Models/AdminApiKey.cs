namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdminApiKey 
{
    public string Object { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public string RedactedValue { get; set; }
    public string Value { get; set; }
    public long CreatedAt { get; set; }
    public AdminApiKeyOwner Owner { get; set; }
}


