namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class MessageDeltaContentTextObjectTextAnnotationsInner 
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
        FileCitationEnum = 1,
        
        /// <summary>
        /// Enum FilePathEnum for file_path
        /// </summary>
        FilePathEnum = 2
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation FileCitation { get; set; }
    public int StartIndex { get; set; }
    public int EndIndex { get; set; }
    public MessageDeltaContentTextAnnotationsFilePathObjectFilePath FilePath { get; set; }
}


