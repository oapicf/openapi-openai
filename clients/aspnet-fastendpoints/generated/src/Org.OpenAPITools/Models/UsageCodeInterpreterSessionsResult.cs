namespace Org.OpenAPITools.Models;


/// <summary>
/// The aggregated code interpreter sessions usage details of the specific time bucket.
/// </summary>
public class UsageCodeInterpreterSessionsResult 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUsageCodeInterpreterSessionsResultEnum for organization.usage.code_interpreter_sessions.result
        /// </summary>
        OrganizationUsageCodeInterpreterSessionsResultEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public int Sessions { get; set; }
    public string ProjectId { get; set; }
}


