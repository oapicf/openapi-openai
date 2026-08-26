import { AuditLog } from './audit-log';


export interface ListAuditLogsResponse { 
  object: ListAuditLogsResponse.ObjectEnum;
  data: Array<AuditLog>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}
export namespace ListAuditLogsResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


