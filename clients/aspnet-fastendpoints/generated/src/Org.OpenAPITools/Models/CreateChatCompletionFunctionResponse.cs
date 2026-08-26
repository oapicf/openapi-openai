namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a chat completion response returned by model, based on the provided input.
/// </summary>
public class CreateChatCompletionFunctionResponse 
{
    public string Id { get; set; }
    public List<CreateChatCompletionFunctionResponseChoicesInner> Choices { get; set; }
    public int Created { get; set; }
    public string Model { get; set; }
    public string SystemFingerprint { get; set; }
    
    /// <summary>
    /// The object type, which is always `chat.completion`.
    /// </summary>
    /// <value>The object type, which is always `chat.completion`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ChatCompletionEnum for chat.completion
        /// </summary>
        ChatCompletionEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public CompletionUsage Usage { get; set; }
}


