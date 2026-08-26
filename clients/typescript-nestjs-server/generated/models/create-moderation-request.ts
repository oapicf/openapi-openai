import { CreateModerationRequestInput } from './create-moderation-request-input';
import { CreateModerationRequestModel } from './create-moderation-request-model';


export interface CreateModerationRequest { 
  input: CreateModerationRequestInput;
  model?: CreateModerationRequestModel;
}

