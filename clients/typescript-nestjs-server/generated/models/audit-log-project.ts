

/**
 * The project that the action was scoped to. Absent for actions not scoped to projects.
 */
export interface AuditLogProject { 
  /**
   * The project ID.
   */
  id?: string;
  /**
   * The project title.
   */
  name?: string;
}

