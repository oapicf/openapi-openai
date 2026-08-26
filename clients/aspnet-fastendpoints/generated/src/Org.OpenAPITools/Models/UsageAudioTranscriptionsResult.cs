namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated audio transcriptions usage details of the specific time bucket.
/// </summary>
public class UsageAudioTranscriptionsResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageAudioTranscriptionsResultEnum for organization.usage.audio_transcriptions.result
        /// </summary>
        OrganizationUsageAudioTranscriptionsResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int Seconds { get; set; }
    public int NumModelRequests { get; set; }
    public string ProjectId { get; set; }
    public string UserId { get; set; }
    public string ApiKeyId { get; set; }
    public string Model { get; set; }
}


