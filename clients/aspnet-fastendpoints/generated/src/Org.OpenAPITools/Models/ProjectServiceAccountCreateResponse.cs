namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectServiceAccountCreateResponse 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectServiceAccountEnum for organization.project.service_account
        /// </summary>
        OrganizationProjectServiceAccountEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    
    /// <summary>
    /// Service accounts can only have one role of type `member`
    /// </summary>
    /// <value>Service accounts can only have one role of type `member`</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum MemberEnum for member
        /// </summary>
        MemberEnum = 1
    }

    public RoleEnum Role { get; set; }
    public int CreatedAt { get; set; }
    public ProjectServiceAccountApiKey ApiKey { get; set; }
}


