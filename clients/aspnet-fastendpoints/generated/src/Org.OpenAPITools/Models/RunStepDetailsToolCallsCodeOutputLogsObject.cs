namespace Org.OpenAPITools.Models;


/// <summary>
/// Text output from the Code Interpreter tool call as part of a run step.
/// </summary>
public class RunStepDetailsToolCallsCodeOutputLogsObject 
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
        LogsEnum = 1
    }

    public TypeEnum Type { get; set; }
    public string Logs { get; set; }
}


