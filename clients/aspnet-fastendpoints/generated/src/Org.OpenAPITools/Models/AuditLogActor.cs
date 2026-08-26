namespace Org.OpenAPITools.Models;


/// <summary>
/// The actor who performed the audit logged action.
/// </summary>
public class AuditLogActor 
{
    
    /// <summary>
    /// The type of actor. Is either `session` or `api_key`.
    /// </summary>
    /// <value>The type of actor. Is either `session` or `api_key`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum SessionEnum for session
        /// </summary>
        SessionEnum = 1,
        
        /// <summary>
        /// Enum ApiKeyEnum for api_key
        /// </summary>
        ApiKeyEnum = 2
    }

    public TypeEnum Type { get; set; }
    public AuditLogActorSession Session { get; set; }
    public AuditLogActorApiKey ApiKey { get; set; }
}


