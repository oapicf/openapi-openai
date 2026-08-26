import { ProjectServiceAccountApiKey } from './project-service-account-api-key';


export interface ProjectServiceAccountCreateResponse { 
  object: ProjectServiceAccountCreateResponse.ObjectEnum;
  id: string;
  name: string;
  /**
   * Service accounts can only have one role of type `member`
   */
  role: ProjectServiceAccountCreateResponse.RoleEnum;
  created_at: number;
  api_key: ProjectServiceAccountApiKey;
}
export namespace ProjectServiceAccountCreateResponse {
  export const ObjectEnum = {
    OrganizationProjectServiceAccount: 'organization.project.service_account'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
  export const RoleEnum = {
    Member: 'member'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


