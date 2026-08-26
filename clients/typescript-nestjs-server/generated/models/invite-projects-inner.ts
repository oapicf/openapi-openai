

export interface InviteProjectsInner { 
  /**
   * Project\'s public ID
   */
  id?: string;
  /**
   * Project membership role
   */
  role?: InviteProjectsInner.RoleEnum;
}
export namespace InviteProjectsInner {
  export const RoleEnum = {
    Member: 'member',
    Owner: 'owner'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


