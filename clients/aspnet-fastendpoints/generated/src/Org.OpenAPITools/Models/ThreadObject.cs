namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a thread that contains [messages](/docs/api-reference/messages).
/// </summary>
public class ThreadObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `thread`.
    /// </summary>
    /// <value>The object type, which is always `thread`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadEnum for thread
        /// </summary>
        ThreadEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int CreatedAt { get; set; }
    public ModifyThreadRequestToolResources ToolResources { get; set; }
    public Object Metadata { get; set; }
}


