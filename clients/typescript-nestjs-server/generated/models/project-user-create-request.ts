

export interface ProjectUserCreateRequest { 
  /**
   * The ID of the user.
   */
  user_id: string;
  /**
   * `owner` or `member`
   */
  role: ProjectUserCreateRequest.RoleEnum;
}
export namespace ProjectUserCreateRequest {
  export const RoleEnum = {
    Owner: 'owner',
    Member: 'member'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


