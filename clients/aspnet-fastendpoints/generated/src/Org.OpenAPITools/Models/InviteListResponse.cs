namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class InviteListResponse 
{
    
    /// <summary>
    /// The object type, which is always `list`
    /// </summary>
    /// <value>The object type, which is always `list`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ListEnum for list
        /// </summary>
        ListEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public List<Invite> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


