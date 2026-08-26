namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ListVectorStoresResponse 
{
    public string Object { get; set; }
    public List<VectorStoreObject> Data { get; set; }
    public string FirstId { get; set; }
    public string LastId { get; set; }
    public bool HasMore { get; set; }
}


