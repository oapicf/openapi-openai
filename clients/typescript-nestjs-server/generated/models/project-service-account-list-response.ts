import { ProjectServiceAccount } from './project-service-account';


export interface ProjectServiceAccountListResponse { 
  object: ProjectServiceAccountListResponse.ObjectEnum;
  data: Array<ProjectServiceAccount>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}
export namespace ProjectServiceAccountListResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


