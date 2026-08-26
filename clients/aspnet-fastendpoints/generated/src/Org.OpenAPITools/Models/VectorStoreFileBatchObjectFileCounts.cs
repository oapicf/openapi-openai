namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class VectorStoreFileBatchObjectFileCounts 
{
    public int InProgress { get; set; }
    public int Completed { get; set; }
    public int Failed { get; set; }
    public int Cancelled { get; set; }
    public int Total { get; set; }
}


