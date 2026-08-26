namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
/// </summary>
public class CreateChatCompletionStreamResponse 
{
    public string Id { get; set; }
    public List<CreateChatCompletionStreamResponseChoicesInner> Choices { get; set; }
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
    /// The object type, which is always `chat.completion.chunk`.
    /// </summary>
    /// <value>The object type, which is always `chat.completion.chunk`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ChatCompletionChunkEnum for chat.completion.chunk
        /// </summary>
        ChatCompletionChunkEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public CreateChatCompletionStreamResponseUsage Usage { get; set; }
}


