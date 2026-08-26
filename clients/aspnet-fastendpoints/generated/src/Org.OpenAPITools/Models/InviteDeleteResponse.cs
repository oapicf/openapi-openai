namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class InviteDeleteResponse 
{
    
    /// <summary>
    /// The object type, which is always `organization.invite.deleted`
    /// </summary>
    /// <value>The object type, which is always `organization.invite.deleted`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationInviteDeletedEnum for organization.invite.deleted
        /// </summary>
        OrganizationInviteDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public bool Deleted { get; set; }
}


