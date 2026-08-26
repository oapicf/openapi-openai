import { FineTuningJob } from './fine-tuning-job';


export interface ListPaginatedFineTuningJobsResponse { 
  data: Array<FineTuningJob>;
  has_more: boolean;
  object: ListPaginatedFineTuningJobsResponse.ObjectEnum;
}
export namespace ListPaginatedFineTuningJobsResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


