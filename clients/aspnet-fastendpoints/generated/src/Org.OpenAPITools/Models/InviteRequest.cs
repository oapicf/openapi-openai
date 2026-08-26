namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class InviteRequest 
{
    public string Email { get; set; }
    
    /// <summary>
    /// `owner` or `reader`
    /// </summary>
    /// <value>`owner` or `reader`</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum ReaderEnum for reader
        /// </summary>
        ReaderEnum = 1,
        
        /// <summary>
        /// Enum OwnerEnum for owner
        /// </summary>
        OwnerEnum = 2
    }

    public RoleEnum Role { get; set; }
    public List<InviteRequestProjectsInner> Projects { get; set; }
}


