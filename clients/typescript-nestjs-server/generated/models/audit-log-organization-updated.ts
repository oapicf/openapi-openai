import { AuditLogOrganizationUpdatedChangesRequested } from './audit-log-organization-updated-changes-requested';


/**
 * The details for events with this `type`.
 */
export interface AuditLogOrganizationUpdated { 
  /**
   * The organization ID.
   */
  id?: string;
  changes_requested?: AuditLogOrganizationUpdatedChangesRequested;
}

