

/**
 * The payload used to create the service account.
 */
export interface AuditLogServiceAccountCreatedData { 
  /**
   * The role of the service account. Is either `owner` or `member`.
   */
  role?: string;
}

