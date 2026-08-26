import { RunObject } from './run-object';


export interface ListRunsResponse { 
  object: string;
  data: Array<RunObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

