import { ProjectRateLimit } from './project-rate-limit';


export interface ProjectRateLimitListResponse { 
  object: ProjectRateLimitListResponse.ObjectEnum;
  data: Array<ProjectRateLimit>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}
export namespace ProjectRateLimitListResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


