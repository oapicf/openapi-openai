namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an individual user in a project.
/// </summary>
public class ProjectUser 
{
    
    /// <summary>
    /// The object type, which is always `organization.project.user`
    /// </summary>
    /// <value>The object type, which is always `organization.project.user`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectUserEnum for organization.project.user
        /// </summary>
        OrganizationProjectUserEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public string Email { get; set; }
    
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
    public int AddedAt { get; set; }
}


