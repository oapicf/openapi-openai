namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a project rate limit config.
/// </summary>
public class ProjectRateLimit 
{
    
    /// <summary>
    /// The object type, which is always `project.rate_limit`
    /// </summary>
    /// <value>The object type, which is always `project.rate_limit`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ProjectRateLimitEnum for project.rate_limit
        /// </summary>
        ProjectRateLimitEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public string Model { get; set; }
    public int MaxRequestsPer1Minute { get; set; }
    public int MaxTokensPer1Minute { get; set; }
    public int MaxImagesPer1Minute { get; set; }
    public int MaxAudioMegabytesPer1Minute { get; set; }
    public int MaxRequestsPer1Day { get; set; }
    public int Batch1DayMaxInputTokens { get; set; }
}


