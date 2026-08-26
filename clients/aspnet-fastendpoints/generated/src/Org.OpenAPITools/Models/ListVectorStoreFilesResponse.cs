namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListVectorStoreFilesResponse 
{
    public string Object { get; set; }
    public List<VectorStoreFileObject> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


