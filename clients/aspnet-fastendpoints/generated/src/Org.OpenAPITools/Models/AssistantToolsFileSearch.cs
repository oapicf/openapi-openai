namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssistantToolsFileSearch 
{
    
    /// <summary>
    /// The type of tool being defined: `file_search`
    /// </summary>
    /// <value>The type of tool being defined: `file_search`</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FileSearchEnum for file_search
        /// </summary>
        FileSearchEnum = 1
    }

    public TypeEnum Type { get; set; }
    public AssistantToolsFileSearchFileSearch FileSearch { get; set; }
}


