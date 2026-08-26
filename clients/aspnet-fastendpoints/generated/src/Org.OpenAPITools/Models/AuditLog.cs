namespace Org.OpenAPITools.Models;


/// <summary>
/// A log of a user action or configuration change within this organization.
/// </summary>
public class AuditLog 
{
    public string Id { get; set; }
    
    public AuditLogEventType Type { get; set; }
    public int EffectiveAt { get; set; }
    public AuditLogProject Project { get; set; }
    public AuditLogActor Actor { get; set; }
    public AuditLogApiKeyCreated ApiKeyCreated { get; set; }
    public AuditLogApiKeyUpdated ApiKeyUpdated { get; set; }
    public AuditLogApiKeyDeleted ApiKeyDeleted { get; set; }
    public AuditLogInviteSent InviteSent { get; set; }
    public AuditLogInviteAccepted InviteAccepted { get; set; }
    public AuditLogInviteAccepted InviteDeleted { get; set; }
    public AuditLogLoginFailed LoginFailed { get; set; }
    public AuditLogLoginFailed LogoutFailed { get; set; }
    public AuditLogOrganizationUpdated OrganizationUpdated { get; set; }
    public AuditLogProjectCreated ProjectCreated { get; set; }
    public AuditLogProjectUpdated ProjectUpdated { get; set; }
    public AuditLogProjectArchived ProjectArchived { get; set; }
    public AuditLogRateLimitUpdated RateLimitUpdated { get; set; }
    public AuditLogRateLimitDeleted RateLimitDeleted { get; set; }
    public AuditLogServiceAccountCreated ServiceAccountCreated { get; set; }
    public AuditLogServiceAccountUpdated ServiceAccountUpdated { get; set; }
    public AuditLogServiceAccountDeleted ServiceAccountDeleted { get; set; }
    public AuditLogUserAdded UserAdded { get; set; }
    public AuditLogUserUpdated UserUpdated { get; set; }
    public AuditLogUserDeleted UserDeleted { get; set; }
}


