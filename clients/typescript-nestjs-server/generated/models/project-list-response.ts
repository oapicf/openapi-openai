import { Project } from './project';


export interface ProjectListResponse { 
  object: ProjectListResponse.ObjectEnum;
  data: Array<Project>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}
export namespace ProjectListResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


