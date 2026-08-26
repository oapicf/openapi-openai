

export interface InviteRequestProjectsInner { 
  /**
   * Project\'s public ID
   */
  id: string;
  /**
   * Project membership role
   */
  role: InviteRequestProjectsInner.RoleEnum;
}
export namespace InviteRequestProjectsInner {
  export const RoleEnum = {
    Member: 'member',
    Owner: 'owner'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


