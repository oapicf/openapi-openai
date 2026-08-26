namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MessageContentImageUrlObjectImageUrl 
{
    public string Url { get; set; }
    
    /// <summary>
    /// Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
    /// </summary>
    /// <value>Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`</value>
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


