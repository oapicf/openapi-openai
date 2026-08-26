namespace Org.OpenAPITools.Models;


/// <summary>
/// A URL for the file that&#39;s generated when the assistant used the &#x60;code_interpreter&#x60; tool to generate a file.
/// </summary>
public class MessageContentTextAnnotationsFilePathObject 
{
    
    /// <summary>
    /// Always `file_path`.
    /// </summary>
    /// <value>Always `file_path`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FilePathEnum for file_path
        /// </summary>
        FilePathEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Text { get; set; }
    public MessageContentTextAnnotationsFilePathObjectFilePath FilePath { get; set; }
    public int StartIndex { get; set; }
    public int EndIndex { get; set; }
}


