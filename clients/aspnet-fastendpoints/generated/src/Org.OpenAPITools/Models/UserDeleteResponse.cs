namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserDeleteResponse 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUserDeletedEnum for organization.user.deleted
        /// </summary>
        OrganizationUserDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public bool Deleted { get; set; }
}


