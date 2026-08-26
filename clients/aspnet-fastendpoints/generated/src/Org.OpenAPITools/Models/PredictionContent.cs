namespace Org.OpenAPITools.Models;


/// <summary>
/// Static predicted output content, such as the content of a text file that is being regenerated. 
/// </summary>
public class PredictionContent 
{
    
    /// <summary>
    /// The type of the predicted content you want to provide. This type is currently always `content`. 
    /// </summary>
    /// <value>The type of the predicted content you want to provide. This type is currently always `content`. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum ContentEnum for content
        /// </summary>
        ContentEnum = 1
    }

    public TypeEnum Type { get; set; }
    public PredictionContentContent Content { get; set; }
}


