

export interface UserDeleteResponse { 
  object: UserDeleteResponse.ObjectEnum;
  id: string;
  deleted: boolean;
}
export namespace UserDeleteResponse {
  export const ObjectEnum = {
    OrganizationUserDeleted: 'organization.user.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


