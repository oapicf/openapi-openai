import { AuditLogApiKeyUpdatedChangesRequested } from './audit-log-api-key-updated-changes-requested';


/**
 * The details for events with this `type`.
 */
export interface AuditLogApiKeyUpdated { 
  /**
   * The tracking ID of the API key.
   */
  id?: string;
  changes_requested?: AuditLogApiKeyUpdatedChangesRequested;
}

