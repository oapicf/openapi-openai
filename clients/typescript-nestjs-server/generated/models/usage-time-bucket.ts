import { UsageTimeBucketResultInner } from './usage-time-bucket-result-inner';


export interface UsageTimeBucket { 
  object: UsageTimeBucket.ObjectEnum;
  start_time: number;
  end_time: number;
  result: Array<UsageTimeBucketResultInner>;
}
export namespace UsageTimeBucket {
  export const ObjectEnum = {
    Bucket: 'bucket'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


