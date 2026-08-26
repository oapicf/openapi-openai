import { AuditLogApiKeyCreatedData } from './audit-log-api-key-created-data';


/**
 * The details for events with this `type`.
 */
export interface AuditLogApiKeyCreated { 
  /**
   * The tracking ID of the API key.
   */
  id?: string;
  data?: AuditLogApiKeyCreatedData;
}

