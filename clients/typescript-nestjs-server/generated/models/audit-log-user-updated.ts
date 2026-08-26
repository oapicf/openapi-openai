import { AuditLogUserUpdatedChangesRequested } from './audit-log-user-updated-changes-requested';


/**
 * The details for events with this `type`.
 */
export interface AuditLogUserUpdated { 
  /**
   * The project ID.
   */
  id?: string;
  changes_requested?: AuditLogUserUpdatedChangesRequested;
}

