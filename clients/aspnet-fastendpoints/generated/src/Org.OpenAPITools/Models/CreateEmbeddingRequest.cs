namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateEmbeddingRequest 
{
    public CreateEmbeddingRequestInput Input { get; set; }
    public CreateEmbeddingRequestModel Model { get; set; }
    
    /// <summary>
    /// The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    /// </summary>
    /// <value>The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).</value>
    public enum EncodingFormatEnum
    {
        
        /// <summary>
        /// Enum FloatEnum for float
        /// </summary>
        FloatEnum = 1,
        
        /// <summary>
        /// Enum Base64Enum for base64
        /// </summary>
        Base64Enum = 2
    }

    public EncodingFormatEnum EncodingFormat { get; set; } = EncodingFormatEnum.FloatEnum;
    public int Dimensions { get; set; }
    public string User { get; set; }
}


