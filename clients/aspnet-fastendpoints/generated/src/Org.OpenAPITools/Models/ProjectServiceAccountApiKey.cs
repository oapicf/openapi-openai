namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectServiceAccountApiKey 
{
    
    /// <summary>
    /// The object type, which is always `organization.project.service_account.api_key`
    /// </summary>
    /// <value>The object type, which is always `organization.project.service_account.api_key`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectServiceAccountApiKeyEnum for organization.project.service_account.api_key
        /// </summary>
        OrganizationProjectServiceAccountApiKeyEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Value { get; set; }
    public string Name { get; set; }
    public int CreatedAt { get; set; }
    public string Id { get; set; }
}


