import { OpenAIFile } from './open-ai-file';


export interface ListFilesResponse { 
  object: string;
  data: Array<OpenAIFile>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

