namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepDetailsToolCallsCodeOutputImageObject 
{
    
    /// <summary>
    /// Always `image`.
    /// </summary>
    /// <value>Always `image`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ImageEnum for image
        /// </summary>
        ImageEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunStepDetailsToolCallsCodeOutputImageObjectImage Image { get; set; }
}


