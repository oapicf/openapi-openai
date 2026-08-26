

/**
 * The payload used to updated the service account.
 */
export interface AuditLogServiceAccountUpdatedChangesRequested { 
  /**
   * The role of the service account. Is either `owner` or `member`.
   */
  role?: string;
}

