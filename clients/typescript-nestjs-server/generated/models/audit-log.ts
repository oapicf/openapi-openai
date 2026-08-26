import { AuditLogApiKeyCreated } from './audit-log-api-key-created';
import { AuditLogServiceAccountDeleted } from './audit-log-service-account-deleted';
import { AuditLogRateLimitDeleted } from './audit-log-rate-limit-deleted';
import { AuditLogOrganizationUpdated } from './audit-log-organization-updated';
import { AuditLogProjectArchived } from './audit-log-project-archived';
import { AuditLogUserDeleted } from './audit-log-user-deleted';
import { AuditLogUserAdded } from './audit-log-user-added';
import { AuditLogLoginFailed } from './audit-log-login-failed';
import { AuditLogInviteAccepted } from './audit-log-invite-accepted';
import { AuditLogRateLimitUpdated } from './audit-log-rate-limit-updated';
import { AuditLogProject } from './audit-log-project';
import { AuditLogServiceAccountUpdated } from './audit-log-service-account-updated';
import { AuditLogActor } from './audit-log-actor';
import { AuditLogProjectUpdated } from './audit-log-project-updated';
import { AuditLogEventType } from './audit-log-event-type';
import { AuditLogInviteSent } from './audit-log-invite-sent';
import { AuditLogUserUpdated } from './audit-log-user-updated';
import { AuditLogServiceAccountCreated } from './audit-log-service-account-created';
import { AuditLogApiKeyDeleted } from './audit-log-api-key-deleted';
import { AuditLogProjectCreated } from './audit-log-project-created';
import { AuditLogApiKeyUpdated } from './audit-log-api-key-updated';


/**
 * A log of a user action or configuration change within this organization.
 */
export interface AuditLog { 
  /**
   * The ID of this log.
   */
  id: string;
  type: AuditLogEventType;
  /**
   * The Unix timestamp (in seconds) of the event.
   */
  effective_at: number;
  project?: AuditLogProject;
  actor: AuditLogActor;
  'api_key.created'?: AuditLogApiKeyCreated;
  'api_key.updated'?: AuditLogApiKeyUpdated;
  'api_key.deleted'?: AuditLogApiKeyDeleted;
  'invite.sent'?: AuditLogInviteSent;
  'invite.accepted'?: AuditLogInviteAccepted;
  'invite.deleted'?: AuditLogInviteAccepted;
  'login.failed'?: AuditLogLoginFailed;
  'logout.failed'?: AuditLogLoginFailed;
  'organization.updated'?: AuditLogOrganizationUpdated;
  'project.created'?: AuditLogProjectCreated;
  'project.updated'?: AuditLogProjectUpdated;
  'project.archived'?: AuditLogProjectArchived;
  'rate_limit.updated'?: AuditLogRateLimitUpdated;
  'rate_limit.deleted'?: AuditLogRateLimitDeleted;
  'service_account.created'?: AuditLogServiceAccountCreated;
  'service_account.updated'?: AuditLogServiceAccountUpdated;
  'service_account.deleted'?: AuditLogServiceAccountDeleted;
  'user.added'?: AuditLogUserAdded;
  'user.updated'?: AuditLogUserUpdated;
  'user.deleted'?: AuditLogUserDeleted;
}
export namespace AuditLog {
}


