import { VectorStoreFileObject } from './vector-store-file-object';


export interface ListVectorStoreFilesResponse { 
  object: string;
  data: Array<VectorStoreFileObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

