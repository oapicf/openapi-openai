import { AuditLogProjectCreatedData } from './audit-log-project-created-data';


/**
 * The details for events with this `type`.
 */
export interface AuditLogProjectCreated { 
  /**
   * The project ID.
   */
  id?: string;
  data?: AuditLogProjectCreatedData;
}

