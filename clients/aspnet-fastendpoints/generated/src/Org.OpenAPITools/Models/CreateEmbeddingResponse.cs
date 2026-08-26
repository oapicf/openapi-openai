namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateEmbeddingResponse 
{
    public List<Embedding> Data { get; set; }
    public string Model { get; set; }
    
    /// <summary>
    /// The object type, which is always \"list\".
    /// </summary>
    /// <value>The object type, which is always \"list\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ListEnum for list
        /// </summary>
        ListEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public CreateEmbeddingResponseUsage Usage { get; set; }
}


