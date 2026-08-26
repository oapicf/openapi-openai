namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UpdateVectorStoreRequest 
{
    public string Name { get; set; }
    public VectorStoreExpirationAfter ExpiresAfter { get; set; }
    public Object Metadata { get; set; }
}


