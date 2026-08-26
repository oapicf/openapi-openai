

export interface ProjectServiceAccountDeleteResponse { 
  object: ProjectServiceAccountDeleteResponse.ObjectEnum;
  id: string;
  deleted: boolean;
}
export namespace ProjectServiceAccountDeleteResponse {
  export const ObjectEnum = {
    OrganizationProjectServiceAccountDeleted: 'organization.project.service_account.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


