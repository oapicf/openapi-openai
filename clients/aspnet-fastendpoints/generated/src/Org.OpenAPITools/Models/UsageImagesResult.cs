namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated images usage details of the specific time bucket.
/// </summary>
public class UsageImagesResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageImagesResultEnum for organization.usage.images.result
        /// </summary>
        OrganizationUsageImagesResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int Images { get; set; }
    public int NumModelRequests { get; set; }
    public string Source { get; set; }
    public string Size { get; set; }
    public string ProjectId { get; set; }
    public string UserId { get; set; }
    public string ApiKeyId { get; set; }
    public string Model { get; set; }
}


