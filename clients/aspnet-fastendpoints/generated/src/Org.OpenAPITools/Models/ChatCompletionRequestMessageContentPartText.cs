namespace Org.OpenAPITools.Models;


/// <summary>
/// Learn about [text inputs](/docs/guides/text-generation). 
/// </summary>
public class ChatCompletionRequestMessageContentPartText 
{
    
    /// <summary>
    /// The type of the content part.
    /// </summary>
    /// <value>The type of the content part.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
}


