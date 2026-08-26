namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an individual service account in a project.
/// </summary>
public class ProjectServiceAccount 
{
    
    /// <summary>
    /// The object type, which is always `organization.project.service_account`
    /// </summary>
    /// <value>The object type, which is always `organization.project.service_account`</value>
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
    /// `owner` or `member`
    /// </summary>
    /// <value>`owner` or `member`</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum OwnerEnum for owner
        /// </summary>
        OwnerEnum = 1,
        
        /// <summary>
        /// Enum MemberEnum for member
        /// </summary>
        MemberEnum = 2
    }

    public RoleEnum Role { get; set; }
    public int CreatedAt { get; set; }
}


