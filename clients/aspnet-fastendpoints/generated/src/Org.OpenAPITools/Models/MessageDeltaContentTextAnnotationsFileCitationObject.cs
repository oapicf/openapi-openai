namespace Org.OpenAPITools.Models;


/// <summary>
/// A citation within the message that points to a specific quote from a specific File associated with the assistant or the message. Generated when the assistant uses the \&quot;file_search\&quot; tool to search files.
/// </summary>
public class MessageDeltaContentTextAnnotationsFileCitationObject 
{
    public int Index { get; set; }
    
    /// <summary>
    /// Always `file_citation`.
    /// </summary>
    /// <value>Always `file_citation`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FileCitationEnum for file_citation
        /// </summary>
        FileCitationEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation FileCitation { get; set; }
    public int StartIndex { get; set; }
    public int EndIndex { get; set; }
}


