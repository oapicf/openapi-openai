import { AuditLogUserAddedData } from './audit-log-user-added-data';


/**
 * The details for events with this `type`.
 */
export interface AuditLogUserAdded { 
  /**
   * The user ID.
   */
  id?: string;
  data?: AuditLogUserAddedData;
}

