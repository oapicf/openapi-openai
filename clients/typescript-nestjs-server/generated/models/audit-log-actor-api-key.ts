import { AuditLogActorUser } from './audit-log-actor-user';
import { AuditLogActorServiceAccount } from './audit-log-actor-service-account';


/**
 * The API Key used to perform the audit logged action.
 */
export interface AuditLogActorApiKey { 
  /**
   * The tracking id of the API key.
   */
  id?: string;
  /**
   * The type of API key. Can be either `user` or `service_account`.
   */
  type?: AuditLogActorApiKey.TypeEnum;
  user?: AuditLogActorUser;
  service_account?: AuditLogActorServiceAccount;
}
export namespace AuditLogActorApiKey {
  export const TypeEnum = {
    User: 'user',
    ServiceAccount: 'service_account'
  } as const;
  export type TypeEnum = typeof TypeEnum[keyof typeof TypeEnum];
}


