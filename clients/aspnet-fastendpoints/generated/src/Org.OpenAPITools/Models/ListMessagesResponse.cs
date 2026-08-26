namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListMessagesResponse 
{
    public string Object { get; set; }
    public List<MessageObject> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


