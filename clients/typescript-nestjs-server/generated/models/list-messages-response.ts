import { MessageObject } from './message-object';


export interface ListMessagesResponse { 
  object: string;
  data: Array<MessageObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

