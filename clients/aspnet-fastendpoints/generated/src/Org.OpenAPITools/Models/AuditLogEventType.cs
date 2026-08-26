namespace Org.OpenAPITools.Models;

    /// <summary>
    /// The event type.
    /// </summary>
    /// <value>The event type.</value>
    public enum AuditLogEventType
    {
        
        /// <summary>
        /// Enum ApiKeyCreatedEnum for api_key.created
        /// </summary>
        ApiKeyCreatedEnum = 1,
        
        /// <summary>
        /// Enum ApiKeyUpdatedEnum for api_key.updated
        /// </summary>
        ApiKeyUpdatedEnum = 2,
        
        /// <summary>
        /// Enum ApiKeyDeletedEnum for api_key.deleted
        /// </summary>
        ApiKeyDeletedEnum = 3,
        
        /// <summary>
        /// Enum InviteSentEnum for invite.sent
        /// </summary>
        InviteSentEnum = 4,
        
        /// <summary>
        /// Enum InviteAcceptedEnum for invite.accepted
        /// </summary>
        InviteAcceptedEnum = 5,
        
        /// <summary>
        /// Enum InviteDeletedEnum for invite.deleted
        /// </summary>
        InviteDeletedEnum = 6,
        
        /// <summary>
        /// Enum LoginSucceededEnum for login.succeeded
        /// </summary>
        LoginSucceededEnum = 7,
        
        /// <summary>
        /// Enum LoginFailedEnum for login.failed
        /// </summary>
        LoginFailedEnum = 8,
        
        /// <summary>
        /// Enum LogoutSucceededEnum for logout.succeeded
        /// </summary>
        LogoutSucceededEnum = 9,
        
        /// <summary>
        /// Enum LogoutFailedEnum for logout.failed
        /// </summary>
        LogoutFailedEnum = 10,
        
        /// <summary>
        /// Enum OrganizationUpdatedEnum for organization.updated
        /// </summary>
        OrganizationUpdatedEnum = 11,
        
        /// <summary>
        /// Enum ProjectCreatedEnum for project.created
        /// </summary>
        ProjectCreatedEnum = 12,
        
        /// <summary>
        /// Enum ProjectUpdatedEnum for project.updated
        /// </summary>
        ProjectUpdatedEnum = 13,
        
        /// <summary>
        /// Enum ProjectArchivedEnum for project.archived
        /// </summary>
        ProjectArchivedEnum = 14,
        
        /// <summary>
        /// Enum ServiceAccountCreatedEnum for service_account.created
        /// </summary>
        ServiceAccountCreatedEnum = 15,
        
        /// <summary>
        /// Enum ServiceAccountUpdatedEnum for service_account.updated
        /// </summary>
        ServiceAccountUpdatedEnum = 16,
        
        /// <summary>
        /// Enum ServiceAccountDeletedEnum for service_account.deleted
        /// </summary>
        ServiceAccountDeletedEnum = 17,
        
        /// <summary>
        /// Enum RateLimitUpdatedEnum for rate_limit.updated
        /// </summary>
        RateLimitUpdatedEnum = 18,
        
        /// <summary>
        /// Enum RateLimitDeletedEnum for rate_limit.deleted
        /// </summary>
        RateLimitDeletedEnum = 19,
        
        /// <summary>
        /// Enum UserAddedEnum for user.added
        /// </summary>
        UserAddedEnum = 20,
        
        /// <summary>
        /// Enum UserUpdatedEnum for user.updated
        /// </summary>
        UserUpdatedEnum = 21,
        
        /// <summary>
        /// Enum UserDeletedEnum for user.deleted
        /// </summary>
        UserDeletedEnum = 22
    }
