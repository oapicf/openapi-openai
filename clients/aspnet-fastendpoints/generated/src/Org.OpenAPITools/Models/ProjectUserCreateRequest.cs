namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectUserCreateRequest 
{
    public string UserId { get; set; }
    
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
}


