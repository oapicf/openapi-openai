import { InviteProjectsInner } from './invite-projects-inner';


/**
 * Represents an individual `invite` to the organization.
 */
export interface Invite { 
  /**
   * The object type, which is always `organization.invite`
   */
  object: Invite.ObjectEnum;
  /**
   * The identifier, which can be referenced in API endpoints
   */
  id: string;
  /**
   * The email address of the individual to whom the invite was sent
   */
  email: string;
  /**
   * `owner` or `reader`
   */
  role: Invite.RoleEnum;
  /**
   * `accepted`,`expired`, or `pending`
   */
  status: Invite.StatusEnum;
  /**
   * The Unix timestamp (in seconds) of when the invite was sent.
   */
  invited_at: number;
  /**
   * The Unix timestamp (in seconds) of when the invite expires.
   */
  expires_at: number;
  /**
   * The Unix timestamp (in seconds) of when the invite was accepted.
   */
  accepted_at?: number;
  /**
   * The projects that were granted membership upon acceptance of the invite.
   */
  projects?: Array<InviteProjectsInner>;
}
export namespace Invite {
  export const ObjectEnum = {
    OrganizationInvite: 'organization.invite'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
  export const RoleEnum = {
    Owner: 'owner',
    Reader: 'reader'
  } as const;
  export type RoleEnum = typeof RoleEnum[keyof typeof RoleEnum];
  export const StatusEnum = {
    Accepted: 'accepted',
    Expired: 'expired',
    Pending: 'pending'
  } as const;
  export type StatusEnum = typeof StatusEnum[keyof typeof StatusEnum];
}


