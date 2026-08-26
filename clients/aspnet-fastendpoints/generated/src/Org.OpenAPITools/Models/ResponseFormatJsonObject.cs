namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ResponseFormatJsonObject 
{
    
    /// <summary>
    /// The type of response format being defined: `json_object`
    /// </summary>
    /// <value>The type of response format being defined: `json_object`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum JsonObjectEnum for json_object
        /// </summary>
        JsonObjectEnum = 1
    }

    public TypeEnum Type { get; set; }
}


