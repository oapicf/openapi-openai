import { InviteRequestProjectsInner } from './invite-request-projects-inner';


export interface InviteRequest { 
  /**
   * Send an email to this address
   */
  email: string;
  /**
   * `owner` or `reader`
   */
  role: InviteRequest.RoleEnum;
  /**
   * An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
   */
  projects?: Array<InviteRequestProjectsInner>;
}
export namespace InviteRequest {
  export const RoleEnum = {
    Reader: 'reader',
    Owner: 'owner'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
}


