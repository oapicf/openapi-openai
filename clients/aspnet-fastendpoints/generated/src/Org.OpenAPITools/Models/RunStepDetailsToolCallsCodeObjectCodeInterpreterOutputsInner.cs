namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class RunStepDetailsToolCallsCodeObjectCodeInterpreterOutputsInner 
{
    
    /// <summary>
    /// Always `logs`.
    /// </summary>
    /// <value>Always `logs`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum LogsEnum for logs
        /// </summary>
        LogsEnum = 1,
        
        /// <summary>
        /// Enum ImageEnum for image
        /// </summary>
        ImageEnum = 2
    }

    public TypeEnum Type { get; set; }
    public string Logs { get; set; }
    public RunStepDetailsToolCallsCodeOutputImageObjectImage Image { get; set; }
}


