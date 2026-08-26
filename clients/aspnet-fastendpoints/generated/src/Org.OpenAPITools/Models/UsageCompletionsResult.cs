namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated completions usage details of the specific time bucket.
/// </summary>
public class UsageCompletionsResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageCompletionsResultEnum for organization.usage.completions.result
        /// </summary>
        OrganizationUsageCompletionsResultEnum = 1
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
}


