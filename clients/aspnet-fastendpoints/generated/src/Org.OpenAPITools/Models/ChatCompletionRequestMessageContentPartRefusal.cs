namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestMessageContentPartRefusal 
{
    
    /// <summary>
    /// The type of the content part.
    /// </summary>
    /// <value>The type of the content part.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum RefusalEnum for refusal
        /// </summary>
        RefusalEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Refusal { get; set; }
}


