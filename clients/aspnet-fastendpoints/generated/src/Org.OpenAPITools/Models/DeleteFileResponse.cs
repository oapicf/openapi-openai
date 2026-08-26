namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class DeleteFileResponse 
{
    public string Id { get; set; }
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum FileEnum for file
        /// </summary>
        FileEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public bool Deleted { get; set; }
}


