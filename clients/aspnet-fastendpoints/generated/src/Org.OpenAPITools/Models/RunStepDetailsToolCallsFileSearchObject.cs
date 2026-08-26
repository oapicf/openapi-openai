namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepDetailsToolCallsFileSearchObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The type of tool call. This is always going to be `file_search` for this type of tool call.
    /// </summary>
    /// <value>The type of tool call. This is always going to be `file_search` for this type of tool call.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FileSearchEnum for file_search
        /// </summary>
        FileSearchEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunStepDetailsToolCallsFileSearchObjectFileSearch FileSearch { get; set; }
}


