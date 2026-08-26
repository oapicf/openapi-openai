namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeleteThreadResponse 
{
    public string Id { get; set; }
    public bool Deleted { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadDeletedEnum for thread.deleted
        /// </summary>
        ThreadDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


