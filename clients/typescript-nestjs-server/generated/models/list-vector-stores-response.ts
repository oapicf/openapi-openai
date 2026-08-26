import { VectorStoreObject } from './vector-store-object';


export interface ListVectorStoresResponse { 
  object: string;
  data: Array<VectorStoreObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

