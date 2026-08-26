import { Body, Controller, DefaultValuePipe, Get, Param, ParseIntPipe, ParseFloatPipe, Query, Req } from '@nestjs/common';
import { Observable } from 'rxjs';
import { Cookies, Headers } from '../decorators';
import { AuditLogsApi } from '../api';
import { AuditLogEventType, ListAuditLogsEffectiveAtParameter, ListAuditLogsResponse,  } from '../models';

@Controller()
export class AuditLogsApiController {
  constructor(private readonly auditLogsApi: AuditLogsApi) {}

  @Get('/organization/audit_logs')
  listAuditLogs(@Query('effective_at') effectiveAt: ListAuditLogsEffectiveAtParameter | undefined, @Query('project_ids[]') projectIds: Array<string> | undefined, @Query('event_types[]') eventTypes: Array<AuditLogEventType> | undefined, @Query('actor_ids[]') actorIds: Array<string> | undefined, @Query('actor_emails[]') actorEmails: Array<string> | undefined, @Query('resource_ids[]') resourceIds: Array<string> | undefined, @Query('limit', new DefaultValuePipe(20)) limit: number | undefined, @Query('after') after: string | undefined, @Query('before') before: string | undefined, @Req() request: Request): ListAuditLogsResponse | Promise<ListAuditLogsResponse> | Observable<ListAuditLogsResponse> {
    return this.auditLogsApi.listAuditLogs(effectiveAt, projectIds, eventTypes, actorIds, actorEmails, resourceIds, limit, after, before, request);
  }

} 