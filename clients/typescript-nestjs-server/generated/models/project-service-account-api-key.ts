

export interface ProjectServiceAccountApiKey { 
  /**
   * The object type, which is always `organization.project.service_account.api_key`
   */
  object: ProjectServiceAccountApiKey.ObjectEnum;
  value: string;
  name: string;
  created_at: number;
  id: string;
}
export namespace ProjectServiceAccountApiKey {
  export const ObjectEnum = {
    OrganizationProjectServiceAccountApiKey: 'organization.project.service_account.api_key'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


