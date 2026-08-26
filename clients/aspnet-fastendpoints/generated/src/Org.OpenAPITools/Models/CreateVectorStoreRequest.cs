namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateVectorStoreRequest 
{
    public List<string> FileIds { get; set; }
    public string Name { get; set; }
    public VectorStoreExpirationAfter ExpiresAfter { get; set; }
    public CreateVectorStoreRequestChunkingStrategy ChunkingStrategy { get; set; }
    public Object Metadata { get; set; }
}


