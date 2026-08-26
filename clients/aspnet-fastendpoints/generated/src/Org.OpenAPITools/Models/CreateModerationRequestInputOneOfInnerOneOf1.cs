namespace Org.OpenAPITools.Models;


/// <summary>
/// An object describing text to classify.
/// </summary>
public class CreateModerationRequestInputOneOfInnerOneOf1 
{
    
    /// <summary>
    /// Always `text`.
    /// </summary>
    /// <value>Always `text`.</value>
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


