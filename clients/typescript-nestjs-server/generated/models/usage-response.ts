import { UsageTimeBucket } from './usage-time-bucket';


export interface UsageResponse { 
  object: UsageResponse.ObjectEnum;
  data: Array<UsageTimeBucket>;
  has_more: boolean;
  next_page: string;
}
export namespace UsageResponse {
  export const ObjectEnum = {
    Page: 'page'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


