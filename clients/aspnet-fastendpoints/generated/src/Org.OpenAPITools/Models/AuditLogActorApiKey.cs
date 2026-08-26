namespace Org.OpenAPITools.Models;


/// <summary>
/// The API Key used to perform the audit logged action.
/// </summary>
public class AuditLogActorApiKey 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The type of API key. Can be either `user` or `service_account`.
    /// </summary>
    /// <value>The type of API key. Can be either `user` or `service_account`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum UserEnum for user
        /// </summary>
        UserEnum = 1,
        
        /// <summary>
        /// Enum ServiceAccountEnum for service_account
        /// </summary>
        ServiceAccountEnum = 2
    }

    public TypeEnum Type { get; set; }
    public AuditLogActorUser User { get; set; }
    public AuditLogActorServiceAccount ServiceAccount { get; set; }
}


