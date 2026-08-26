

export interface UserRoleUpdateRequest { 
  /**
   * `owner` or `reader`
   */
  role: UserRoleUpdateRequest.RoleEnum;
}
export namespace UserRoleUpdateRequest {
  export const RoleEnum = {
    Owner: 'owner',
    Reader: 'reader'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


