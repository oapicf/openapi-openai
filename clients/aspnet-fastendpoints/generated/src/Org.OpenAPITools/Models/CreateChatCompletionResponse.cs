namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a chat completion response returned by model, based on the provided input.
/// </summary>
public class CreateChatCompletionResponse 
{
    public string Id { get; set; }
    public List<CreateChatCompletionResponseChoicesInner> Choices { get; set; }
    public int Created { get; set; }
    public string Model { get; set; }
    
    /// <summary>
    /// The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
    /// </summary>
    /// <value>The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.</value>
    public enum ServiceTierEnum
    {
        
        /// <summary>
        /// Enum ScaleEnum for scale
        /// </summary>
        ScaleEnum = 1,
        
        /// <summary>
        /// Enum DefaultEnum for default
        /// </summary>
        DefaultEnum = 2
    }

    public ServiceTierEnum? ServiceTier { get; set; }
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


