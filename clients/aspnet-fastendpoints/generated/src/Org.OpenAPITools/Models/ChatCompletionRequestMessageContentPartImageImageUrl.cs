namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestMessageContentPartImageImageUrl 
{
    public string Url { get; set; }
    
    /// <summary>
    /// Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
    /// </summary>
    /// <value>Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).</value>
    public enum DetailEnum
    {
        
        /// <summary>
        /// Enum AutoEnum for auto
        /// </summary>
        AutoEnum = 1,
        
        /// <summary>
        /// Enum LowEnum for low
        /// </summary>
        LowEnum = 2,
        
        /// <summary>
        /// Enum HighEnum for high
        /// </summary>
        HighEnum = 3
    }

    public DetailEnum Detail { get; set; } = DetailEnum.AutoEnum;
}


