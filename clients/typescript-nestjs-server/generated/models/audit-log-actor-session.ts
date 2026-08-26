import { AuditLogActorUser } from './audit-log-actor-user';


/**
 * The session in which the audit logged action was performed.
 */
export interface AuditLogActorSession { 
  user?: AuditLogActorUser;
  /**
   * The IP address from which the action was performed.
   */
  ip_address?: string;
}

