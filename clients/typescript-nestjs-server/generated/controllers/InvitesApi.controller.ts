import { Body, Controller, DefaultValuePipe, Delete, Get, Post, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { InvitesApi } from '../api';
import { Invite, InviteDeleteResponse, InviteListResponse, InviteRequest,  } from '../models';

@Controller()
export class InvitesApiController {
  constructor(private readonly invitesApi: InvitesApi) {}

  @Delete('/organization/invites/:invite_id')
  deleteInvite(@Param('invite_id') inviteId: string, @Req() request: Request): InviteDeleteResponse | Promise<InviteDeleteResponse> | Observable<InviteDeleteResponse> {
    return this.invitesApi.deleteInvite(inviteId, request);
  }

  @Post('/organization/invites')
  inviteUser(@Body() inviteRequest: InviteRequest, @Req() request: Request): Invite | Promise<Invite> | Observable<Invite> {
    return this.invitesApi.inviteUser(inviteRequest, request);
  }

  @Get('/organization/invites')
  listInvites(@Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Req() request: Request): InviteListResponse | Promise<InviteListResponse> | Observable<InviteListResponse> {
    return this.invitesApi.listInvites(limit, after, request);
  }

  @Get('/organization/invites/:invite_id')
  retrieveInvite(@Param('invite_id') inviteId: string, @Req() request: Request): Invite | Promise<Invite> | Observable<Invite> {
    return this.invitesApi.retrieveInvite(inviteId, request);
  }

} 