import { FineTuningJobEvent } from './fine-tuning-job-event';


export interface ListFineTuningJobEventsResponse { 
  data: Array<FineTuningJobEvent>;
  object: ListFineTuningJobEventsResponse.ObjectEnum;
}
export namespace ListFineTuningJobEventsResponse {
  export const ObjectEnum = {
    List: 'list'
  } as const;
  export type ObjectEnum = typeof ObjectEnum[keyof typeof ObjectEnum];
}


