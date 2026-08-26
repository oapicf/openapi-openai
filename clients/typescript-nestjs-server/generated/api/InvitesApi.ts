import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Invite, InviteDeleteResponse, InviteListResponse, InviteRequest,  } from '../models';


@Injectable()
export abstract class InvitesApi {

  abstract deleteInvite(inviteId: string,  request: Request): InviteDeleteResponse | Promise<InviteDeleteResponse> | Observable<InviteDeleteResponse>;


  abstract inviteUser(inviteRequest: InviteRequest,  request: Request): Invite | Promise<Invite> | Observable<Invite>;


  abstract listInvites(limit: number | undefined, after: string | undefined,  request: Request): InviteListResponse | Promise<InviteListResponse> | Observable<InviteListResponse>;


  abstract retrieveInvite(inviteId: string,  request: Request): Invite | Promise<Invite> | Observable<Invite>;

} 