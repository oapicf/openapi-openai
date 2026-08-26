namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
/// </summary>
public class CreateCompletionResponse 
{
    public string Id { get; set; }
    public List<CreateCompletionResponseChoicesInner> Choices { get; set; }
    public int Created { get; set; }
    public string Model { get; set; }
    public string SystemFingerprint { get; set; }
    
    /// <summary>
    /// The object type, which is always \"text_completion\"
    /// </summary>
    /// <value>The object type, which is always \"text_completion\"</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum TextCompletionEnum for text_completion
        /// </summary>
        TextCompletionEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public CompletionUsage Usage { get; set; }
}


