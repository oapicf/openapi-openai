import { AuditLogInviteSentData } from './audit-log-invite-sent-data';


/**
 * The details for events with this `type`.
 */
export interface AuditLogInviteSent { 
  /**
   * The ID of the invite.
   */
  id?: string;
  data?: AuditLogInviteSentData;
}

