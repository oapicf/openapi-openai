namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateVectorStoreFileBatchRequest 
{
    public List<string> FileIds { get; set; }
    public ChunkingStrategyRequestParam ChunkingStrategy { get; set; }
}


