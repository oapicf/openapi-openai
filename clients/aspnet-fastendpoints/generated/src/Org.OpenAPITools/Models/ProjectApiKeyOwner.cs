namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectApiKeyOwner 
{
    
    /// <summary>
    /// `user` or `service_account`
    /// </summary>
    /// <value>`user` or `service_account`</value>
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
    public ProjectUser User { get; set; }
    public ProjectServiceAccount ServiceAccount { get; set; }
}


