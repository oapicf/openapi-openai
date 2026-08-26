import { ProjectUser } from './project-user';


export interface ProjectUserListResponse { 
  object: string;
  data: Array<ProjectUser>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

