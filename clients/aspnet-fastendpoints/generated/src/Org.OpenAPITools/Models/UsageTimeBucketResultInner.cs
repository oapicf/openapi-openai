namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UsageTimeBucketResultInner 
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
    public int InputTokens { get; set; }
    public int InputCachedTokens { get; set; }
    public int OutputTokens { get; set; }
    public int InputAudioTokens { get; set; }
    public int OutputAudioTokens { get; set; }
    public int NumModelRequests { get; set; }
    public string ProjectId { get; set; }
    public string UserId { get; set; }
    public string ApiKeyId { get; set; }
    public string Model { get; set; }
    public bool Batch { get; set; }
    public int Images { get; set; }
    public string Source { get; set; }
    public string Size { get; set; }
    public int Characters { get; set; }
    public int Seconds { get; set; }
    public int UsageBytes { get; set; }
    public int Sessions { get; set; }
    public CostsResultAmount Amount { get; set; }
    public string LineItem { get; set; }
}


