namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ResponseFormatText 
{
    
    /// <summary>
    /// The type of response format being defined: `text`
    /// </summary>
    /// <value>The type of response format being defined: `text`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 1
    }

    public TypeEnum Type { get; set; }
}


