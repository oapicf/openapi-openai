

/**
 * Represents an individual project.
 */
export interface Project { 
  /**
   * The identifier, which can be referenced in API endpoints
   */
  id: string;
  /**
   * The object type, which is always `organization.project`
   */
  object: Project.ObjectEnum;
  /**
   * The name of the project. This appears in reporting.
   */
  name: string;
  /**
   * The Unix timestamp (in seconds) of when the project was created.
   */
  created_at: number;
  /**
   * The Unix timestamp (in seconds) of when the project was archived or `null`.
   */
  archived_at?: number | null;
  /**
   * `active` or `archived`
   */
  status: Project.StatusEnum;
}
export namespace Project {
  export const ObjectEnum = {
    OrganizationProject: 'organization.project'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
  export const StatusEnum = {
    Active: 'active',
    Archived: 'archived'
  } as const;
  export type StatusEnum = typeof StatusEnum[keyof typeof StatusEnum];
}


