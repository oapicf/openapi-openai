import { AdminApiKey } from './admin-api-key';


export interface ApiKeyList { 
  object?: string;
  data?: Array<AdminApiKey>;
  has_more?: boolean;
  first_id?: string;
  last_id?: string;
}

