namespace Org.OpenAPITools.Models;


/// <summary>
/// The text content that is part of a message.
/// </summary>
public class MessageDeltaContentTextObject 
{
    public int Index { get; set; }
    
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
    public MessageDeltaContentTextObjectText Text { get; set; }
}


