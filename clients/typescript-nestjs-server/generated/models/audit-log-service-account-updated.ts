import { AuditLogServiceAccountUpdatedChangesRequested } from './audit-log-service-account-updated-changes-requested';


/**
 * The details for events with this `type`.
 */
export interface AuditLogServiceAccountUpdated { 
  /**
   * The service account ID.
   */
  id?: string;
  changes_requested?: AuditLogServiceAccountUpdatedChangesRequested;
}

