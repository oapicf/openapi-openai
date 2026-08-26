namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated audio speeches usage details of the specific time bucket.
/// </summary>
public class UsageAudioSpeechesResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageAudioSpeechesResultEnum for organization.usage.audio_speeches.result
        /// </summary>
        OrganizationUsageAudioSpeechesResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int Characters { get; set; }
    public int NumModelRequests { get; set; }
    public string ProjectId { get; set; }
    public string UserId { get; set; }
    public string ApiKeyId { get; set; }
    public string Model { get; set; }
}


