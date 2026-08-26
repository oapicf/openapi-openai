import { RunStepObject } from './run-step-object';


export interface ListRunStepsResponse { 
  object: string;
  data: Array<RunStepObject>;
  first_id: string;
  last_id: string;
  has_more: boolean;
}

