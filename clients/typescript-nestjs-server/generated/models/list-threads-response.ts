import { ThreadObject } from './thread-object';


export interface ListThreadsResponse { 
  object: string;
  data: Array<ThreadObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

