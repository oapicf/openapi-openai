namespace Org.OpenAPITools.Models;


/// <summary>
/// The refusal content that is part of a message.
/// </summary>
public class MessageDeltaContentRefusalObject 
{
    public int Index { get; set; }
    
    /// <summary>
    /// Always `refusal`.
    /// </summary>
    /// <value>Always `refusal`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum RefusalEnum for refusal
        /// </summary>
        RefusalEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Refusal { get; set; }
}


