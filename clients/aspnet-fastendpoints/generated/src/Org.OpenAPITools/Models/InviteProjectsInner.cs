namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class InviteProjectsInner 
{
    public string Id { get; set; }
    
    /// <summary>
    /// Project membership role
    /// </summary>
    /// <value>Project membership role</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum MemberEnum for member
        /// </summary>
        MemberEnum = 1,
        
        /// <summary>
        /// Enum OwnerEnum for owner
        /// </summary>
        OwnerEnum = 2
    }

    public RoleEnum Role { get; set; }
}


