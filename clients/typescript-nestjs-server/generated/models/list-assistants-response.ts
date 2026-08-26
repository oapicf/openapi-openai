import { AssistantObject } from './assistant-object';


export interface ListAssistantsResponse { 
  object: string;
  data: Array<AssistantObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

