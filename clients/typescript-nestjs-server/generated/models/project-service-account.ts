

/**
 * Represents an individual service account in a project.
 */
export interface ProjectServiceAccount { 
  /**
   * The object type, which is always `organization.project.service_account`
   */
  object: ProjectServiceAccount.ObjectEnum;
  /**
   * The identifier, which can be referenced in API endpoints
   */
  id: string;
  /**
   * The name of the service account
   */
  name: string;
  /**
   * `owner` or `member`
   */
  role: ProjectServiceAccount.RoleEnum;
  /**
   * The Unix timestamp (in seconds) of when the service account was created
   */
  created_at: number;
}
export namespace ProjectServiceAccount {
  export const ObjectEnum = {
    OrganizationProjectServiceAccount: 'organization.project.service_account'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
  export const RoleEnum = {
    Owner: 'owner',
    Member: 'member'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


