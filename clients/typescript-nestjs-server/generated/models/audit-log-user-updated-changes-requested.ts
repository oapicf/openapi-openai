

/**
 * The payload used to update the user.
 */
export interface AuditLogUserUpdatedChangesRequested { 
  /**
   * The role of the user. Is either `owner` or `member`.
   */
  role?: string;
}

