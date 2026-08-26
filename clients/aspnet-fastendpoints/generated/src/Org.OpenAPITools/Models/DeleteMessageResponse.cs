namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeleteMessageResponse 
{
    public string Id { get; set; }
    public bool Deleted { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadMessageDeletedEnum for thread.message.deleted
        /// </summary>
        ThreadMessageDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


