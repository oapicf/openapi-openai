namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an embedding vector returned by embedding endpoint. 
/// </summary>
public class Embedding 
{
    public int Index { get; set; }
    public List<decimal> VarEmbedding { get; set; }
    
    /// <summary>
    /// The object type, which is always \"embedding\".
    /// </summary>
    /// <value>The object type, which is always \"embedding\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum EmbeddingEnum for embedding
        /// </summary>
        EmbeddingEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


