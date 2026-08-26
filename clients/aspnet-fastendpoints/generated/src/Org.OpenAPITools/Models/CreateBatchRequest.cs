namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateBatchRequest 
{
    public string InputFileId { get; set; }
    
    /// <summary>
    /// The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
    /// </summary>
    /// <value>The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.</value>
    public enum EndpointEnum
    {
        
        /// <summary>
        /// Enum V1ChatCompletionsEnum for /v1/chat/completions
        /// </summary>
        V1ChatCompletionsEnum = 1,
        
        /// <summary>
        /// Enum V1EmbeddingsEnum for /v1/embeddings
        /// </summary>
        V1EmbeddingsEnum = 2,
        
        /// <summary>
        /// Enum V1CompletionsEnum for /v1/completions
        /// </summary>
        V1CompletionsEnum = 3
    }

    public EndpointEnum Endpoint { get; set; }
    
    /// <summary>
    /// The time frame within which the batch should be processed. Currently only `24h` is supported.
    /// </summary>
    /// <value>The time frame within which the batch should be processed. Currently only `24h` is supported.</value>
    public enum CompletionWindowEnum
    {
        
        /// <summary>
        /// Enum _24hEnum for 24h
        /// </summary>
        _24hEnum = 1
    }

    public CompletionWindowEnum CompletionWindow { get; set; }
    public Dictionary<string, string> Metadata { get; set; }
}


