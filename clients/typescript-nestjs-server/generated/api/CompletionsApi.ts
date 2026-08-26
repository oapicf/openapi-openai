import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateCompletionRequest, CreateCompletionResponse,  } from '../models';


@Injectable()
export abstract class CompletionsApi {

  abstract createCompletion(createCompletionRequest: CreateCompletionRequest,  request: Request): CreateCompletionResponse | Promise<CreateCompletionResponse> | Observable<CreateCompletionResponse>;

} 