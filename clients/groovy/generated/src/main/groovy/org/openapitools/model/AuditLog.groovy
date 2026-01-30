package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AuditLogActor;
import org.openapitools.model.AuditLogApiKeyCreated;
import org.openapitools.model.AuditLogApiKeyDeleted;
import org.openapitools.model.AuditLogApiKeyUpdated;
import org.openapitools.model.AuditLogEventType;
import org.openapitools.model.AuditLogInviteAccepted;
import org.openapitools.model.AuditLogInviteSent;
import org.openapitools.model.AuditLogLoginFailed;
import org.openapitools.model.AuditLogOrganizationUpdated;
import org.openapitools.model.AuditLogProject;
import org.openapitools.model.AuditLogProjectArchived;
import org.openapitools.model.AuditLogProjectCreated;
import org.openapitools.model.AuditLogProjectUpdated;
import org.openapitools.model.AuditLogRateLimitDeleted;
import org.openapitools.model.AuditLogRateLimitUpdated;
import org.openapitools.model.AuditLogServiceAccountCreated;
import org.openapitools.model.AuditLogServiceAccountDeleted;
import org.openapitools.model.AuditLogServiceAccountUpdated;
import org.openapitools.model.AuditLogUserAdded;
import org.openapitools.model.AuditLogUserDeleted;
import org.openapitools.model.AuditLogUserUpdated;

@Canonical
class AuditLog {
    /* The ID of this log. */
    String id
    
    AuditLogEventType type
    /* The Unix timestamp (in seconds) of the event. */
    Integer effectiveAt
    
    AuditLogProject project
    
    AuditLogActor actor
    
    AuditLogApiKeyCreated apiKeyCreated
    
    AuditLogApiKeyUpdated apiKeyUpdated
    
    AuditLogApiKeyDeleted apiKeyDeleted
    
    AuditLogInviteSent inviteSent
    
    AuditLogInviteAccepted inviteAccepted
    
    AuditLogInviteAccepted inviteDeleted
    
    AuditLogLoginFailed loginFailed
    
    AuditLogLoginFailed logoutFailed
    
    AuditLogOrganizationUpdated organizationUpdated
    
    AuditLogProjectCreated projectCreated
    
    AuditLogProjectUpdated projectUpdated
    
    AuditLogProjectArchived projectArchived
    
    AuditLogRateLimitUpdated rateLimitUpdated
    
    AuditLogRateLimitDeleted rateLimitDeleted
    
    AuditLogServiceAccountCreated serviceAccountCreated
    
    AuditLogServiceAccountUpdated serviceAccountUpdated
    
    AuditLogServiceAccountDeleted serviceAccountDeleted
    
    AuditLogUserAdded userAdded
    
    AuditLogUserUpdated userUpdated
    
    AuditLogUserDeleted userDeleted
}
