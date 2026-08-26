

export interface ProjectApiKeyDeleteResponse { 
  object: ProjectApiKeyDeleteResponse.ObjectEnum;
  id: string;
  deleted: boolean;
}
export namespace ProjectApiKeyDeleteResponse {
  export const ObjectEnum = {
    OrganizationProjectApiKeyDeleted: 'organization.project.api_key.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


