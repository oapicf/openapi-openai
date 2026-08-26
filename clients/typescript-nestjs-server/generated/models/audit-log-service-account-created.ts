import { AuditLogServiceAccountCreatedData } from './audit-log-service-account-created-data';


/**
 * The details for events with this `type`.
 */
export interface AuditLogServiceAccountCreated { 
  /**
   * The service account ID.
   */
  id?: string;
  data?: AuditLogServiceAccountCreatedData;
}

