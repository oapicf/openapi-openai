import { AuditLogProjectUpdatedChangesRequested } from './audit-log-project-updated-changes-requested';


/**
 * The details for events with this `type`.
 */
export interface AuditLogProjectUpdated { 
  /**
   * The project ID.
   */
  id?: string;
  changes_requested?: AuditLogProjectUpdatedChangesRequested;
}

