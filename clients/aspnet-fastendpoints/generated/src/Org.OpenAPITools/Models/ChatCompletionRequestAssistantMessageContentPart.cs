namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestAssistantMessageContentPart 
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
        TextEnum = 1,
        
        /// <summary>
        /// Enum RefusalEnum for refusal
        /// </summary>
        RefusalEnum = 2
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public string Refusal { get; set; }
}


