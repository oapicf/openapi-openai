namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated vector stores usage details of the specific time bucket.
/// </summary>
public class UsageVectorStoresResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageVectorStoresResultEnum for organization.usage.vector_stores.result
        /// </summary>
        OrganizationUsageVectorStoresResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int UsageBytes { get; set; }
    public string ProjectId { get; set; }
}


