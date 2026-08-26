

export interface ProjectUserDeleteResponse { 
  object: ProjectUserDeleteResponse.ObjectEnum;
  id: string;
  deleted: boolean;
}
export namespace ProjectUserDeleteResponse {
  export const ObjectEnum = {
    OrganizationProjectUserDeleted: 'organization.project.user.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


