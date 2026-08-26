namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an individual &#x60;invite&#x60; to the organization.
/// </summary>
public class Invite 
{
    
    /// <summary>
    /// The object type, which is always `organization.invite`
    /// </summary>
    /// <value>The object type, which is always `organization.invite`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationInviteEnum for organization.invite
        /// </summary>
        OrganizationInviteEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public string Email { get; set; }
    
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
    
    /// <summary>
    /// `accepted`,`expired`, or `pending`
    /// </summary>
    /// <value>`accepted`,`expired`, or `pending`</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum AcceptedEnum for accepted
        /// </summary>
        AcceptedEnum = 1,
        
        /// <summary>
        /// Enum ExpiredEnum for expired
        /// </summary>
        ExpiredEnum = 2,
        
        /// <summary>
        /// Enum PendingEnum for pending
        /// </summary>
        PendingEnum = 3
    }

    public StatusEnum Status { get; set; }
    public int InvitedAt { get; set; }
    public int ExpiresAt { get; set; }
    public int AcceptedAt { get; set; }
    public List<InviteProjectsInner> Projects { get; set; }
}


