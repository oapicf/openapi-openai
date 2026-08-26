import { Batch } from './batch';


export interface ListBatchesResponse { 
  data: Array<Batch>;
  first_id?: string;
  last_id?: string;
  has_more: boolean;
  object: ListBatchesResponse.ObjectEnum;
}
export namespace ListBatchesResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


