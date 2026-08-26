namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RealtimeConversationItemContentInner 
{
    
    /// <summary>
    /// The content type (`input_text`, `input_audio`, `item_reference`, `text`). 
    /// </summary>
    /// <value>The content type (`input_text`, `input_audio`, `item_reference`, `text`). </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum InputAudioEnum for input_audio
        /// </summary>
        InputAudioEnum = 1,
        
        /// <summary>
        /// Enum InputTextEnum for input_text
        /// </summary>
        InputTextEnum = 2,
        
        /// <summary>
        /// Enum ItemReferenceEnum for item_reference
        /// </summary>
        ItemReferenceEnum = 3,
        
        /// <summary>
        /// Enum TextEnum for text
        /// </summary>
        TextEnum = 4
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public string Id { get; set; }
    public string Audio { get; set; }
    public string Transcript { get; set; }
}


