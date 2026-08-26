

export interface InviteDeleteResponse { 
  /**
   * The object type, which is always `organization.invite.deleted`
   */
  object: InviteDeleteResponse.ObjectEnum;
  id: string;
  deleted: boolean;
}
export namespace InviteDeleteResponse {
  export const ObjectEnum = {
    OrganizationInviteDeleted: 'organization.invite.deleted'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


