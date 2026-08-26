import { AuditLogRateLimitUpdatedChangesRequested } from './audit-log-rate-limit-updated-changes-requested';


/**
 * The details for events with this `type`.
 */
export interface AuditLogRateLimitUpdated { 
  /**
   * The rate limit ID
   */
  id?: string;
  changes_requested?: AuditLogRateLimitUpdatedChangesRequested;
}

