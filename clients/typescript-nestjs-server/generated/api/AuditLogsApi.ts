import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { AuditLogEventType, ListAuditLogsEffectiveAtParameter, ListAuditLogsResponse,  } from '../models';


@Injectable()
export abstract class AuditLogsApi {

  abstract listAuditLogs(effectiveAt: ListAuditLogsEffectiveAtParameter | undefined, projectIds: Array<string> | undefined, eventTypes: Array<AuditLogEventType> | undefined, actorIds: Array<string> | undefined, actorEmails: Array<string> | undefined, resourceIds: Array<string> | undefined, limit: number | undefined, after: string | undefined, before: string | undefined,  request: Request): ListAuditLogsResponse | Promise<ListAuditLogsResponse> | Observable<ListAuditLogsResponse>;

} 