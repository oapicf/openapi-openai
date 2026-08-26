namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepDetailsToolCallsFileSearchResultObjectContentInner 
{
    
    /// <summary>
    /// The type of the content.
    /// </summary>
    /// <value>The type of the content.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
}


