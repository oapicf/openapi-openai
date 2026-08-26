

export interface ProjectUserUpdateRequest { 
  /**
   * `owner` or `member`
   */
  role: ProjectUserUpdateRequest.RoleEnum;
}
export namespace ProjectUserUpdateRequest {
  export const RoleEnum = {
    Owner: 'owner',
    Member: 'member'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


