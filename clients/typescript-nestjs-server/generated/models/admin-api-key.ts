import { AdminApiKeyOwner } from './admin-api-key-owner';


export interface AdminApiKey { 
  object?: string;
  id?: string;
  name?: string;
  redacted_value?: string;
  value?: string;
  created_at?: number;
  owner?: AdminApiKeyOwner;
}

