namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated costs details of the specific time bucket.
/// </summary>
public class CostsResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationCostsResultEnum for organization.costs.result
        /// </summary>
        OrganizationCostsResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public CostsResultAmount Amount { get; set; }
    public string LineItem { get; set; }
    public string ProjectId { get; set; }
}


