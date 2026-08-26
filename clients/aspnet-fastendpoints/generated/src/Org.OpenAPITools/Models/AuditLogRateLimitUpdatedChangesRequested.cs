namespace Org.OpenAPITools.Models;


/// <summary>
/// The payload used to update the rate limits.
/// </summary>
public class AuditLogRateLimitUpdatedChangesRequested 
{
    public int MaxRequestsPer1Minute { get; set; }
    public int MaxTokensPer1Minute { get; set; }
    public int MaxImagesPer1Minute { get; set; }
    public int MaxAudioMegabytesPer1Minute { get; set; }
    public int MaxRequestsPer1Day { get; set; }
    public int Batch1DayMaxInputTokens { get; set; }
}


