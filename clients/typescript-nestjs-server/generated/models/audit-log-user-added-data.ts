

/**
 * The payload used to add the user to the project.
 */
export interface AuditLogUserAddedData { 
  /**
   * The role of the user. Is either `owner` or `member`.
   */
  role?: string;
}

