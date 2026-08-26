import { Injectable } from '@nestjs/common';
import { Observable } from 'rxjs';
import { CreateChatCompletionRequest, CreateChatCompletionResponse,  } from '../models';


@Injectable()
export abstract class ChatApi {

  abstract createChatCompletion(createChatCompletionRequest: CreateChatCompletionRequest,  request: Request): CreateChatCompletionResponse | Promise<CreateChatCompletionResponse> | Observable<CreateChatCompletionResponse>;

} 