import { ProjectApiKey } from './project-api-key';


export interface ProjectApiKeyListResponse { 
  object: ProjectApiKeyListResponse.ObjectEnum;
  data: Array<ProjectApiKey>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}
export namespace ProjectApiKeyListResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


