import { AuditLogActorSession } from './audit-log-actor-session';
import { AuditLogActorApiKey } from './audit-log-actor-api-key';


/**
 * The actor who performed the audit logged action.
 */
export interface AuditLogActor { 
  /**
   * The type of actor. Is either `session` or `api_key`.
   */
  type?: AuditLogActor.TypeEnum;
  session?: AuditLogActorSession;
  api_key?: AuditLogActorApiKey;
}
export namespace AuditLogActor {
  export const TypeEnum = {
    Session: 'session',
    ApiKey: 'api_key'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


