namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserRoleUpdateRequest 
{
    
    /// <summary>
    /// `owner` or `reader`
    /// </summary>
    /// <value>`owner` or `reader`</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum OwnerEnum for owner
        /// </summary>
        OwnerEnum = 1,
        
        /// <summary>
        /// Enum ReaderEnum for reader
        /// </summary>
        ReaderEnum = 2
    }

    public RoleEnum Role { get; set; }
}


