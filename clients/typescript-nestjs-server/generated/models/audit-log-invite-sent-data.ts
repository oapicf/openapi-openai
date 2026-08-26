

/**
 * The payload used to create the invite.
 */
export interface AuditLogInviteSentData { 
  /**
   * The email invited to the organization.
   */
  email?: string;
  /**
   * The role the email was invited to be. Is either `owner` or `member`.
   */
  role?: string;
}

