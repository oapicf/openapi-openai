namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeleteAssistantResponse 
{
    public string Id { get; set; }
    public bool Deleted { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum AssistantDeletedEnum for assistant.deleted
        /// </summary>
        AssistantDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


