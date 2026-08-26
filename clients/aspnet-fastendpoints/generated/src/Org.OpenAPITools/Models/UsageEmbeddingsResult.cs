namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated embeddings usage details of the specific time bucket.
/// </summary>
public class UsageEmbeddingsResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageEmbeddingsResultEnum for organization.usage.embeddings.result
        /// </summary>
        OrganizationUsageEmbeddingsResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int InputTokens { get; set; }
    public int NumModelRequests { get; set; }
    public string ProjectId { get; set; }
    public string UserId { get; set; }
    public string ApiKeyId { get; set; }
    public string Model { get; set; }
}


