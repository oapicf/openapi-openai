import { FineTuningJobCheckpoint } from './fine-tuning-job-checkpoint';


export interface ListFineTuningJobCheckpointsResponse { 
  data: Array<FineTuningJobCheckpoint>;
  object: ListFineTuningJobCheckpointsResponse.ObjectEnum;
  first_id?: string | null;
  last_id?: string | null;
  has_more: boolean;
}
export namespace ListFineTuningJobCheckpointsResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


