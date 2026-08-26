namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateVectorStoreFileRequest 
{
    public string FileId { get; set; }
    public ChunkingStrategyRequestParam ChunkingStrategy { get; set; }
}


